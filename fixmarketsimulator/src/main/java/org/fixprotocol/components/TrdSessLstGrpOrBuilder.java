// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package org.fixprotocol.components;

public interface TrdSessLstGrpOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Common.TrdSessLstGrp)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string encoded_text = 1 [(.fix.tag) = 355, (.fix.type) = DATATYPE_DATA, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  java.lang.String getEncodedText();
  /**
   * <code>string encoded_text = 1 [(.fix.tag) = 355, (.fix.type) = DATATYPE_DATA, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  com.google.protobuf.ByteString
      getEncodedTextBytes();

  /**
   * <code>sfixed64 encoded_text_len = 2 [(.fix.tag) = 354, (.fix.type) = DATATYPE_LENGTH, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  long getEncodedTextLen();

  /**
   * <code>string security_exchange = 3 [(.fix.tag) = 207, (.fix.type) = DATATYPE_EXCHANGE, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  java.lang.String getSecurityExchange();
  /**
   * <code>string security_exchange = 3 [(.fix.tag) = 207, (.fix.type) = DATATYPE_EXCHANGE, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  com.google.protobuf.ByteString
      getSecurityExchangeBytes();

  /**
   * <code>string text = 4 [(.fix.tag) = 58, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  java.lang.String getText();
  /**
   * <code>string text = 4 [(.fix.tag) = 58, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  com.google.protobuf.ByteString
      getTextBytes();

  /**
   * <code>.fix.Decimal64 total_volume_traded = 5 [(.fix.tag) = 387, (.fix.type) = DATATYPE_QTY, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  boolean hasTotalVolumeTraded();
  /**
   * <code>.fix.Decimal64 total_volume_traded = 5 [(.fix.tag) = 387, (.fix.type) = DATATYPE_QTY, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  org.fixprotocol.components.Fix.Decimal64 getTotalVolumeTraded();
  /**
   * <code>.fix.Decimal64 total_volume_traded = 5 [(.fix.tag) = 387, (.fix.type) = DATATYPE_QTY, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  org.fixprotocol.components.Fix.Decimal64OrBuilder getTotalVolumeTradedOrBuilder();

  /**
   * <code>.fix.Timestamp trad_ses_close_time = 6 [(.fix.tag) = 344, (.fix.type) = DATATYPE_UTC_TIMESTAMP, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  boolean hasTradSesCloseTime();
  /**
   * <code>.fix.Timestamp trad_ses_close_time = 6 [(.fix.tag) = 344, (.fix.type) = DATATYPE_UTC_TIMESTAMP, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  org.fixprotocol.components.Fix.Timestamp getTradSesCloseTime();
  /**
   * <code>.fix.Timestamp trad_ses_close_time = 6 [(.fix.tag) = 344, (.fix.type) = DATATYPE_UTC_TIMESTAMP, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  org.fixprotocol.components.Fix.TimestampOrBuilder getTradSesCloseTimeOrBuilder();

  /**
   * <code>.fix.Timestamp trad_ses_end_time = 7 [(.fix.tag) = 345, (.fix.type) = DATATYPE_UTC_TIMESTAMP, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  boolean hasTradSesEndTime();
  /**
   * <code>.fix.Timestamp trad_ses_end_time = 7 [(.fix.tag) = 345, (.fix.type) = DATATYPE_UTC_TIMESTAMP, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  org.fixprotocol.components.Fix.Timestamp getTradSesEndTime();
  /**
   * <code>.fix.Timestamp trad_ses_end_time = 7 [(.fix.tag) = 345, (.fix.type) = DATATYPE_UTC_TIMESTAMP, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  org.fixprotocol.components.Fix.TimestampOrBuilder getTradSesEndTimeOrBuilder();

  /**
   * <code>.Common.TradSesMethodEnum trad_ses_method = 8 [(.fix.tag) = 338, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  int getTradSesMethodValue();
  /**
   * <code>.Common.TradSesMethodEnum trad_ses_method = 8 [(.fix.tag) = 338, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  org.fixprotocol.components.TradSesMethodEnum getTradSesMethod();

  /**
   * <code>.Common.TradSesModeEnum trad_ses_mode = 9 [(.fix.tag) = 339, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  int getTradSesModeValue();
  /**
   * <code>.Common.TradSesModeEnum trad_ses_mode = 9 [(.fix.tag) = 339, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  org.fixprotocol.components.TradSesModeEnum getTradSesMode();

  /**
   * <code>.fix.Timestamp trad_ses_open_time = 10 [(.fix.tag) = 342, (.fix.type) = DATATYPE_UTC_TIMESTAMP, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  boolean hasTradSesOpenTime();
  /**
   * <code>.fix.Timestamp trad_ses_open_time = 10 [(.fix.tag) = 342, (.fix.type) = DATATYPE_UTC_TIMESTAMP, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  org.fixprotocol.components.Fix.Timestamp getTradSesOpenTime();
  /**
   * <code>.fix.Timestamp trad_ses_open_time = 10 [(.fix.tag) = 342, (.fix.type) = DATATYPE_UTC_TIMESTAMP, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  org.fixprotocol.components.Fix.TimestampOrBuilder getTradSesOpenTimeOrBuilder();

  /**
   * <code>.fix.Timestamp trad_ses_pre_close_time = 11 [(.fix.tag) = 343, (.fix.type) = DATATYPE_UTC_TIMESTAMP, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  boolean hasTradSesPreCloseTime();
  /**
   * <code>.fix.Timestamp trad_ses_pre_close_time = 11 [(.fix.tag) = 343, (.fix.type) = DATATYPE_UTC_TIMESTAMP, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  org.fixprotocol.components.Fix.Timestamp getTradSesPreCloseTime();
  /**
   * <code>.fix.Timestamp trad_ses_pre_close_time = 11 [(.fix.tag) = 343, (.fix.type) = DATATYPE_UTC_TIMESTAMP, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  org.fixprotocol.components.Fix.TimestampOrBuilder getTradSesPreCloseTimeOrBuilder();

  /**
   * <code>.fix.Timestamp trad_ses_start_time = 12 [(.fix.tag) = 341, (.fix.type) = DATATYPE_UTC_TIMESTAMP, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  boolean hasTradSesStartTime();
  /**
   * <code>.fix.Timestamp trad_ses_start_time = 12 [(.fix.tag) = 341, (.fix.type) = DATATYPE_UTC_TIMESTAMP, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  org.fixprotocol.components.Fix.Timestamp getTradSesStartTime();
  /**
   * <code>.fix.Timestamp trad_ses_start_time = 12 [(.fix.tag) = 341, (.fix.type) = DATATYPE_UTC_TIMESTAMP, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  org.fixprotocol.components.Fix.TimestampOrBuilder getTradSesStartTimeOrBuilder();

  /**
   * <code>.Common.TradSesStatusEnum trad_ses_status = 13 [(.fix.tag) = 340, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  int getTradSesStatusValue();
  /**
   * <code>.Common.TradSesStatusEnum trad_ses_status = 13 [(.fix.tag) = 340, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  org.fixprotocol.components.TradSesStatusEnum getTradSesStatus();

  /**
   * <code>fixed32 trad_ses_status_reserved100plus = 16 [(.fix.tag) = 340, (.fix.type) = DATATYPE_RESERVED100PLUS, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  int getTradSesStatusReserved100Plus();

  /**
   * <code>.Common.TradSesStatusRejReasonEnum trad_ses_status_rej_reason = 14 [(.fix.tag) = 567, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  int getTradSesStatusRejReasonValue();
  /**
   * <code>.Common.TradSesStatusRejReasonEnum trad_ses_status_rej_reason = 14 [(.fix.tag) = 567, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  org.fixprotocol.components.TradSesStatusRejReasonEnum getTradSesStatusRejReason();

  /**
   * <code>fixed32 trad_ses_status_rej_reason_reserved100plus = 15 [(.fix.tag) = 567, (.fix.type) = DATATYPE_RESERVED100PLUS, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  int getTradSesStatusRejReasonReserved100Plus();

  /**
   * <code>.Common.TradingSessionIDEnum trading_session_id = 17 [(.fix.tag) = 336, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  int getTradingSessionIdValue();
  /**
   * <code>.Common.TradingSessionIDEnum trading_session_id = 17 [(.fix.tag) = 336, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  org.fixprotocol.components.TradingSessionIDEnum getTradingSessionId();

  /**
   * <code>fixed32 trading_session_id_reserved100plus = 18 [(.fix.tag) = 336, (.fix.type) = DATATYPE_RESERVED100PLUS, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  int getTradingSessionIdReserved100Plus();

  /**
   * <code>.Common.TradingSessionSubIDEnum trading_session_sub_id = 19 [(.fix.tag) = 625, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  int getTradingSessionSubIdValue();
  /**
   * <code>.Common.TradingSessionSubIDEnum trading_session_sub_id = 19 [(.fix.tag) = 625, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  org.fixprotocol.components.TradingSessionSubIDEnum getTradingSessionSubId();

  /**
   * <code>fixed32 trading_session_sub_id_reserved100plus = 20 [(.fix.tag) = 625, (.fix.type) = DATATYPE_RESERVED100PLUS, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  int getTradingSessionSubIdReserved100Plus();

  /**
   * <code>bool unsolicited_indicator = 21 [(.fix.tag) = 325, (.fix.type) = DATATYPE_BOOLEAN, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  boolean getUnsolicitedIndicator();

  /**
   * <code>string market_id = 22 [(.fix.tag) = 1301, (.fix.type) = DATATYPE_EXCHANGE, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  java.lang.String getMarketId();
  /**
   * <code>string market_id = 22 [(.fix.tag) = 1301, (.fix.type) = DATATYPE_EXCHANGE, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  com.google.protobuf.ByteString
      getMarketIdBytes();

  /**
   * <code>string market_segment_id = 23 [(.fix.tag) = 1300, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  java.lang.String getMarketSegmentId();
  /**
   * <code>string market_segment_id = 23 [(.fix.tag) = 1300, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  com.google.protobuf.ByteString
      getMarketSegmentIdBytes();

  /**
   * <code>string trading_session_desc = 24 [(.fix.tag) = 1326, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  java.lang.String getTradingSessionDesc();
  /**
   * <code>string trading_session_desc = 24 [(.fix.tag) = 1326, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  com.google.protobuf.ByteString
      getTradingSessionDescBytes();

  /**
   * <code>.Common.TradingSessionRules trading_session_rules = 25 [(.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  boolean hasTradingSessionRules();
  /**
   * <code>.Common.TradingSessionRules trading_session_rules = 25 [(.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  org.fixprotocol.components.TradingSessionRules getTradingSessionRules();
  /**
   * <code>.Common.TradingSessionRules trading_session_rules = 25 [(.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  org.fixprotocol.components.TradingSessionRulesOrBuilder getTradingSessionRulesOrBuilder();

  /**
   * <code>.Common.TradSesUpdateActionEnum trad_ses_update_action = 26 [(.fix.tag) = 1327, (.fix.type) = DATATYPE_CHAR, (.fix.field_added) = VERSION_FIX_5_0SP1, (.fix.field_added_ep) = 94];</code>
   */
  int getTradSesUpdateActionValue();
  /**
   * <code>.Common.TradSesUpdateActionEnum trad_ses_update_action = 26 [(.fix.tag) = 1327, (.fix.type) = DATATYPE_CHAR, (.fix.field_added) = VERSION_FIX_5_0SP1, (.fix.field_added_ep) = 94];</code>
   */
  org.fixprotocol.components.TradSesUpdateActionEnum getTradSesUpdateAction();

  /**
   * <code>.fix.Timestamp transact_time = 27 [(.fix.tag) = 60, (.fix.type) = DATATYPE_UTC_TIMESTAMP, (.fix.field_added) = VERSION_FIX_5_0SP1, (.fix.field_added_ep) = 94];</code>
   */
  boolean hasTransactTime();
  /**
   * <code>.fix.Timestamp transact_time = 27 [(.fix.tag) = 60, (.fix.type) = DATATYPE_UTC_TIMESTAMP, (.fix.field_added) = VERSION_FIX_5_0SP1, (.fix.field_added_ep) = 94];</code>
   */
  org.fixprotocol.components.Fix.Timestamp getTransactTime();
  /**
   * <code>.fix.Timestamp transact_time = 27 [(.fix.tag) = 60, (.fix.type) = DATATYPE_UTC_TIMESTAMP, (.fix.field_added) = VERSION_FIX_5_0SP1, (.fix.field_added_ep) = 94];</code>
   */
  org.fixprotocol.components.Fix.TimestampOrBuilder getTransactTimeOrBuilder();

  public org.fixprotocol.components.TrdSessLstGrp.TradSesStatusUnionCase getTradSesStatusUnionCase();

  public org.fixprotocol.components.TrdSessLstGrp.TradSesStatusRejReasonUnionCase getTradSesStatusRejReasonUnionCase();

  public org.fixprotocol.components.TrdSessLstGrp.TradingSessionIdUnionCase getTradingSessionIdUnionCase();

  public org.fixprotocol.components.TrdSessLstGrp.TradingSessionSubIdUnionCase getTradingSessionSubIdUnionCase();
}
