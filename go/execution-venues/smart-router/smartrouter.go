package main

import (
	"github.com/ettec/open-trading-platform/go/smart-router/ordermanager"
	"github.com/ettec/otp-common"
	"github.com/ettec/otp-common/marketdata"
	"github.com/ettec/otp-common/model"
)

var zero *model.Decimal64

func init() {
	zero = &model.Decimal64{}
}

type GetListingsWithSameInstrument = func(listingId int32, listingGroupsIn chan<- []*model.Listing)

func ExecuteAsSmartRouterStrategy(om *ordermanager.OrderManager,
	getListingsWithSameInstrument GetListingsWithSameInstrument, quoteStream marketdata.MdsQuoteStream) {

	go func() {

		om.Log.Println("initialising order")

		listingsIn := make(chan []*model.Listing)

		getListingsWithSameInstrument(om.ManagedOrder.ListingId, listingsIn)

		underlyingListings := map[int32]*model.Listing{}
		select {
		case ls := <-listingsIn:
			for _, listing := range ls {
				if listing.Market.Mic != common.SR_MIC {
					underlyingListings[listing.Id] = listing
				}
			}
		}

		quoteStream.Subscribe(om.ManagedOrder.ListingId)

		om.Log.Println("order initialised")

		for {
			close, err := om.PersistChanges()
			if err != nil {
				om.ErrLog.Printf("failed to persist order manager changes, cancelling order:%v", err)
				om.Cancel()
			}

			if close {
				quoteStream.Close()
				break
			}

			select {
			case <-om.CancelChan:
				om.CancelOrder(func(listingId int32) *model.Listing {
					return underlyingListings[listingId]
				})
			case co, ok := <-om.ChildOrderUpdateChan:
				om.OnChildOrderUpdate(ok, co)
			case q, ok := <-quoteStream.GetStream():

				if ok {

					if !q.StreamInterrupted {

						if om.ManagedOrder.GetAvailableQty().GreaterThan(zero) {
							if om.ManagedOrder.GetSide() == model.Side_BUY {
								submitBuyOrders(om, q, underlyingListings)
							} else {
								submitSellOrders(om, q, underlyingListings)
							}

						}

						if om.ManagedOrder.GetTargetStatus() == model.OrderStatus_LIVE {
							om.ManagedOrder.SetStatus(model.OrderStatus_LIVE)
						}
					}

				} else {
					om.ErrLog.Printf("quote chan unexpectedly closed, cancelling order")
					om.Cancel()
				}
			}

		}

	}()
}

func  submitBuyOrders(om *ordermanager.OrderManager, q *model.ClobQuote, underlyingListings map[int32]*model.Listing) {
	submitOrders(om, q.Offers, func(line *model.ClobLine) bool {
		return line.Price.LessThanOrEqual(om.ManagedOrder.GetPrice())
	}, model.Side_BUY, underlyingListings)
}

func submitSellOrders(om *ordermanager.OrderManager, q *model.ClobQuote, underlyingListings map[int32]*model.Listing) {
	submitOrders(om, q.Bids, func(line *model.ClobLine) bool {
		return line.Price.GreaterThanOrEqual(om.ManagedOrder.GetPrice())
	}, model.Side_SELL, underlyingListings)
}

func  submitOrders(om *ordermanager.OrderManager, oppositeClobLines []*model.ClobLine, willTrade func(line *model.ClobLine) bool,
	side model.Side, underlyingListings map[int32]*model.Listing) {
	listingIdToQnt := map[int32]*model.Decimal64{}
	for _, line := range oppositeClobLines {
		if om.ManagedOrder.GetAvailableQty().GreaterThan(zero) && willTrade(line) {
			quantity := line.Size

			if line.Size.GreaterThanOrEqual(om.ManagedOrder.GetAvailableQty()) {
				quantity = om.ManagedOrder.GetAvailableQty()
			}

			om.SendChildOrder(side, quantity, line.Price, underlyingListings[line.ListingId])

		} else {
			if qnt, ok := listingIdToQnt[line.ListingId]; ok {
				qnt.Add(line.Size)
			} else {
				qntCopy := *line.Size
				listingIdToQnt[line.ListingId] = &qntCopy
			}
		}

	}

}