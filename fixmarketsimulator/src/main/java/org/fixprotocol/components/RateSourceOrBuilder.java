// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package org.fixprotocol.components;

public interface RateSourceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Common.RateSource)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.Common.RateSourceEnum rate_source = 1 [(.fix.tag) = 1446, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_5_0SP1, (.fix.field_added_ep) = 82];</code>
   */
  int getRateSourceValue();
  /**
   * <code>.Common.RateSourceEnum rate_source = 1 [(.fix.tag) = 1446, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_5_0SP1, (.fix.field_added_ep) = 82];</code>
   */
  org.fixprotocol.components.RateSourceEnum getRateSource();

  /**
   * <code>.Common.RateSourceTypeEnum rate_source_type = 2 [(.fix.tag) = 1447, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_5_0SP1, (.fix.field_added_ep) = 82];</code>
   */
  int getRateSourceTypeValue();
  /**
   * <code>.Common.RateSourceTypeEnum rate_source_type = 2 [(.fix.tag) = 1447, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_5_0SP1, (.fix.field_added_ep) = 82];</code>
   */
  org.fixprotocol.components.RateSourceTypeEnum getRateSourceType();

  /**
   * <code>string reference_page = 3 [(.fix.tag) = 1448, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_5_0SP1, (.fix.field_added_ep) = 82];</code>
   */
  java.lang.String getReferencePage();
  /**
   * <code>string reference_page = 3 [(.fix.tag) = 1448, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_5_0SP1, (.fix.field_added_ep) = 82];</code>
   */
  com.google.protobuf.ByteString
      getReferencePageBytes();
}
