// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package org.fixprotocol.components;

public interface LegStipulationsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Common.LegStipulations)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.Common.LegStipulationTypeEnum leg_stipulation_type = 1 [(.fix.tag) = 688, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  int getLegStipulationTypeValue();
  /**
   * <code>.Common.LegStipulationTypeEnum leg_stipulation_type = 1 [(.fix.tag) = 688, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  org.fixprotocol.components.LegStipulationTypeEnum getLegStipulationType();

  /**
   * <code>string leg_stipulation_value = 2 [(.fix.tag) = 689, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  java.lang.String getLegStipulationValue();
  /**
   * <code>string leg_stipulation_value = 2 [(.fix.tag) = 689, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  com.google.protobuf.ByteString
      getLegStipulationValueBytes();
}
