// Code generated by protoc-gen-go. DO NOT EDIT.
// source: fixsimmarketdataservice.proto

package fixsim

import (
	marketdata "github.com/ettec/open-trading-platform/go/market-data-gateway/internal/fix/marketdata"
	context "context"
	fmt "fmt"
	proto "github.com/golang/protobuf/proto"
	empty "github.com/golang/protobuf/ptypes/empty"
	grpc "google.golang.org/grpc"
	codes "google.golang.org/grpc/codes"
	status "google.golang.org/grpc/status"
	math "math"
)

// Reference imports to suppress errors if they are not otherwise used.
var _ = proto.Marshal
var _ = fmt.Errorf
var _ = math.Inf

// This is a compile-time assertion to ensure that this generated file
// is compatible with the proto package it is being compiled against.
// A compilation error at this line likely means your copy of the
// proto package needs to be updated.
const _ = proto.ProtoPackageIsVersion3 // please upgrade the proto package

type SubscribeRequest struct {
	PartyId              string   `protobuf:"bytes,1,opt,name=partyId,proto3" json:"partyId,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *SubscribeRequest) Reset()         { *m = SubscribeRequest{} }
func (m *SubscribeRequest) String() string { return proto.CompactTextString(m) }
func (*SubscribeRequest) ProtoMessage()    {}
func (*SubscribeRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_bce990059aaa8241, []int{0}
}

func (m *SubscribeRequest) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_SubscribeRequest.Unmarshal(m, b)
}
func (m *SubscribeRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_SubscribeRequest.Marshal(b, m, deterministic)
}
func (m *SubscribeRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_SubscribeRequest.Merge(m, src)
}
func (m *SubscribeRequest) XXX_Size() int {
	return xxx_messageInfo_SubscribeRequest.Size(m)
}
func (m *SubscribeRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_SubscribeRequest.DiscardUnknown(m)
}

var xxx_messageInfo_SubscribeRequest proto.InternalMessageInfo

func (m *SubscribeRequest) GetPartyId() string {
	if m != nil {
		return m.PartyId
	}
	return ""
}

func init() {
	proto.RegisterType((*SubscribeRequest)(nil), "marketdataservice.SubscribeRequest")
}

func init() { proto.RegisterFile("fixsimmarketdataservice.proto", fileDescriptor_bce990059aaa8241) }

var fileDescriptor_bce990059aaa8241 = []byte{
	// 260 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0x6c, 0x91, 0xb1, 0x4e, 0xc3, 0x30,
	0x10, 0x86, 0x9b, 0xa5, 0x55, 0x3d, 0x15, 0x0f, 0x50, 0x05, 0x55, 0x42, 0x61, 0xe9, 0x80, 0x5c,
	0x54, 0x56, 0x26, 0x28, 0x48, 0x1d, 0x58, 0x92, 0x0d, 0xb1, 0x38, 0xee, 0xa5, 0x3d, 0x11, 0xc7,
	0xe1, 0x7c, 0x41, 0xe9, 0xc3, 0xf1, 0x6e, 0x88, 0x98, 0x52, 0xd4, 0x76, 0xf3, 0xf9, 0xff, 0xe5,
	0xef, 0xb3, 0x4e, 0x4c, 0x0a, 0x6c, 0x3d, 0x5a, 0xab, 0xe9, 0x1d, 0x78, 0xa5, 0x59, 0x7b, 0xa0,
	0x4f, 0x34, 0xa0, 0x6a, 0x72, 0xec, 0xe4, 0xd9, 0x51, 0x10, 0x8f, 0xf6, 0x57, 0xa1, 0x14, 0x5f,
	0xae, 0x9d, 0x5b, 0x97, 0x30, 0xeb, 0xa6, 0xbc, 0x29, 0x66, 0x60, 0x6b, 0xde, 0x86, 0x30, 0xb9,
	0x11, 0xa3, 0xac, 0xc9, 0xbd, 0x21, 0xcc, 0x21, 0x85, 0x8f, 0x06, 0x3c, 0xcb, 0xb1, 0x18, 0xd4,
	0x9a, 0x78, 0xbb, 0x5c, 0x8d, 0xa3, 0xab, 0x68, 0x3a, 0x4c, 0x77, 0xe3, 0xfc, 0x2b, 0x12, 0x17,
	0xcf, 0xd8, 0x66, 0x68, 0x5f, 0x3a, 0xca, 0x42, 0xb3, 0xce, 0x02, 0x58, 0x2e, 0xc4, 0xf0, 0xef,
	0x25, 0x39, 0x51, 0xfb, 0xc2, 0xbf, 0xe3, 0x2f, 0x21, 0x3e, 0x57, 0xc1, 0x49, 0xed, 0x9c, 0xd4,
	0xd3, 0x8f, 0x53, 0xd2, 0x93, 0x6f, 0x62, 0xf0, 0xe8, 0xaa, 0x0a, 0x0c, 0xcb, 0x6b, 0x75, 0xfc,
	0xed, 0x43, 0xd7, 0x78, 0x7a, 0x1a, 0xb4, 0xac, 0x0c, 0x81, 0x85, 0x8a, 0x75, 0x99, 0x42, 0x41,
	0xe0, 0x37, 0x49, 0xef, 0x36, 0x7a, 0xb8, 0x17, 0x73, 0xe3, 0xac, 0x02, 0x66, 0x30, 0x1b, 0x55,
	0x60, 0x1b, 0x08, 0x1e, 0x6d, 0x53, 0x6a, 0x76, 0x74, 0x40, 0x04, 0x52, 0xba, 0xc6, 0xd7, 0x7e,
	0x58, 0x42, 0xde, 0xef, 0x6c, 0xef, 0xbe, 0x03, 0x00, 0x00, 0xff, 0xff, 0xf7, 0x2d, 0xce, 0xbf,
	0x95, 0x01, 0x00, 0x00,
}

// Reference imports to suppress errors if they are not otherwise used.
var _ context.Context
var _ grpc.ClientConn

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
const _ = grpc.SupportPackageIsVersion4

// FixSimMarketDataServiceClient is the client API for FixSimMarketDataService service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://godoc.org/google.golang.org/grpc#ClientConn.NewStream.
type FixSimMarketDataServiceClient interface {
	Subscribe(ctx context.Context, in *marketdata.MarketDataRequest, opts ...grpc.CallOption) (*empty.Empty, error)
	Connect(ctx context.Context, in *SubscribeRequest, opts ...grpc.CallOption) (FixSimMarketDataService_ConnectClient, error)
}

type fixSimMarketDataServiceClient struct {
	cc *grpc.ClientConn
}

func NewFixSimMarketDataServiceClient(cc *grpc.ClientConn) FixSimMarketDataServiceClient {
	return &fixSimMarketDataServiceClient{cc}
}

func (c *fixSimMarketDataServiceClient) Subscribe(ctx context.Context, in *marketdata.MarketDataRequest, opts ...grpc.CallOption) (*empty.Empty, error) {
	out := new(empty.Empty)
	err := c.cc.Invoke(ctx, "/marketdataservice.FixSimMarketDataService/Subscribe", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *fixSimMarketDataServiceClient) Connect(ctx context.Context, in *SubscribeRequest, opts ...grpc.CallOption) (FixSimMarketDataService_ConnectClient, error) {
	stream, err := c.cc.NewStream(ctx, &_FixSimMarketDataService_serviceDesc.Streams[0], "/marketdataservice.FixSimMarketDataService/Connect", opts...)
	if err != nil {
		return nil, err
	}
	x := &fixSimMarketDataServiceConnectClient{stream}
	if err := x.ClientStream.SendMsg(in); err != nil {
		return nil, err
	}
	if err := x.ClientStream.CloseSend(); err != nil {
		return nil, err
	}
	return x, nil
}

type FixSimMarketDataService_ConnectClient interface {
	Recv() (*marketdata.MarketDataIncrementalRefresh, error)
	grpc.ClientStream
}

type fixSimMarketDataServiceConnectClient struct {
	grpc.ClientStream
}

func (x *fixSimMarketDataServiceConnectClient) Recv() (*marketdata.MarketDataIncrementalRefresh, error) {
	m := new(marketdata.MarketDataIncrementalRefresh)
	if err := x.ClientStream.RecvMsg(m); err != nil {
		return nil, err
	}
	return m, nil
}

// FixSimMarketDataServiceServer is the server API for FixSimMarketDataService service.
type FixSimMarketDataServiceServer interface {
	Subscribe(context.Context, *marketdata.MarketDataRequest) (*empty.Empty, error)
	Connect(*SubscribeRequest, FixSimMarketDataService_ConnectServer) error
}

// UnimplementedFixSimMarketDataServiceServer can be embedded to have forward compatible implementations.
type UnimplementedFixSimMarketDataServiceServer struct {
}

func (*UnimplementedFixSimMarketDataServiceServer) Subscribe(ctx context.Context, req *marketdata.MarketDataRequest) (*empty.Empty, error) {
	return nil, status.Errorf(codes.Unimplemented, "method Subscribe not implemented")
}
func (*UnimplementedFixSimMarketDataServiceServer) Connect(req *SubscribeRequest, srv FixSimMarketDataService_ConnectServer) error {
	return status.Errorf(codes.Unimplemented, "method Connect not implemented")
}

func RegisterFixSimMarketDataServiceServer(s *grpc.Server, srv FixSimMarketDataServiceServer) {
	s.RegisterService(&_FixSimMarketDataService_serviceDesc, srv)
}

func _FixSimMarketDataService_Subscribe_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(marketdata.MarketDataRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(FixSimMarketDataServiceServer).Subscribe(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/marketdataservice.FixSimMarketDataService/Subscribe",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(FixSimMarketDataServiceServer).Subscribe(ctx, req.(*marketdata.MarketDataRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _FixSimMarketDataService_Connect_Handler(srv interface{}, stream grpc.ServerStream) error {
	m := new(SubscribeRequest)
	if err := stream.RecvMsg(m); err != nil {
		return err
	}
	return srv.(FixSimMarketDataServiceServer).Connect(m, &fixSimMarketDataServiceConnectServer{stream})
}

type FixSimMarketDataService_ConnectServer interface {
	Send(*marketdata.MarketDataIncrementalRefresh) error
	grpc.ServerStream
}

type fixSimMarketDataServiceConnectServer struct {
	grpc.ServerStream
}

func (x *fixSimMarketDataServiceConnectServer) Send(m *marketdata.MarketDataIncrementalRefresh) error {
	return x.ServerStream.SendMsg(m)
}

var _FixSimMarketDataService_serviceDesc = grpc.ServiceDesc{
	ServiceName: "marketdataservice.FixSimMarketDataService",
	HandlerType: (*FixSimMarketDataServiceServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "Subscribe",
			Handler:    _FixSimMarketDataService_Subscribe_Handler,
		},
	},
	Streams: []grpc.StreamDesc{
		{
			StreamName:    "Connect",
			Handler:       _FixSimMarketDataService_Connect_Handler,
			ServerStreams: true,
		},
	},
	Metadata: "fixsimmarketdataservice.proto",
}
