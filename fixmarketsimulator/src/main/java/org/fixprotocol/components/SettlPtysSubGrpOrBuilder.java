// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package org.fixprotocol.components;

public interface SettlPtysSubGrpOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Common.SettlPtysSubGrp)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string settl_party_sub_id = 1 [(.fix.tag) = 785, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  java.lang.String getSettlPartySubId();
  /**
   * <code>string settl_party_sub_id = 1 [(.fix.tag) = 785, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  com.google.protobuf.ByteString
      getSettlPartySubIdBytes();

  /**
   * <code>.Common.SettlPartySubIDTypeEnum settl_party_sub_id_type = 2 [(.fix.tag) = 786, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  int getSettlPartySubIdTypeValue();
  /**
   * <code>.Common.SettlPartySubIDTypeEnum settl_party_sub_id_type = 2 [(.fix.tag) = 786, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  org.fixprotocol.components.SettlPartySubIDTypeEnum getSettlPartySubIdType();
}
