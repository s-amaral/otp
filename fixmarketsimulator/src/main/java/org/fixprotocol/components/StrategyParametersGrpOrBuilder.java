// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package org.fixprotocol.components;

public interface StrategyParametersGrpOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Common.StrategyParametersGrp)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string strategy_parameter_name = 1 [(.fix.tag) = 958, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  java.lang.String getStrategyParameterName();
  /**
   * <code>string strategy_parameter_name = 1 [(.fix.tag) = 958, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  com.google.protobuf.ByteString
      getStrategyParameterNameBytes();

  /**
   * <code>.Common.StrategyParameterTypeEnum strategy_parameter_type = 2 [(.fix.tag) = 959, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  int getStrategyParameterTypeValue();
  /**
   * <code>.Common.StrategyParameterTypeEnum strategy_parameter_type = 2 [(.fix.tag) = 959, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  org.fixprotocol.components.StrategyParameterTypeEnum getStrategyParameterType();

  /**
   * <code>string strategy_parameter_value = 3 [(.fix.tag) = 960, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  java.lang.String getStrategyParameterValue();
  /**
   * <code>string strategy_parameter_value = 3 [(.fix.tag) = 960, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  com.google.protobuf.ByteString
      getStrategyParameterValueBytes();
}