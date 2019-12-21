// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package org.fixprotocol.components;

public interface TickRulesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Common.TickRules)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.fix.Decimal64 end_tick_price_range = 1 [(.fix.tag) = 1207, (.fix.type) = DATATYPE_PRICE, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  boolean hasEndTickPriceRange();
  /**
   * <code>.fix.Decimal64 end_tick_price_range = 1 [(.fix.tag) = 1207, (.fix.type) = DATATYPE_PRICE, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  org.fixprotocol.components.Fix.Decimal64 getEndTickPriceRange();
  /**
   * <code>.fix.Decimal64 end_tick_price_range = 1 [(.fix.tag) = 1207, (.fix.type) = DATATYPE_PRICE, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  org.fixprotocol.components.Fix.Decimal64OrBuilder getEndTickPriceRangeOrBuilder();

  /**
   * <code>.fix.Decimal64 start_tick_price_range = 2 [(.fix.tag) = 1206, (.fix.type) = DATATYPE_PRICE, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  boolean hasStartTickPriceRange();
  /**
   * <code>.fix.Decimal64 start_tick_price_range = 2 [(.fix.tag) = 1206, (.fix.type) = DATATYPE_PRICE, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  org.fixprotocol.components.Fix.Decimal64 getStartTickPriceRange();
  /**
   * <code>.fix.Decimal64 start_tick_price_range = 2 [(.fix.tag) = 1206, (.fix.type) = DATATYPE_PRICE, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  org.fixprotocol.components.Fix.Decimal64OrBuilder getStartTickPriceRangeOrBuilder();

  /**
   * <code>.fix.Decimal64 tick_increment = 3 [(.fix.tag) = 1208, (.fix.type) = DATATYPE_PRICE, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  boolean hasTickIncrement();
  /**
   * <code>.fix.Decimal64 tick_increment = 3 [(.fix.tag) = 1208, (.fix.type) = DATATYPE_PRICE, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  org.fixprotocol.components.Fix.Decimal64 getTickIncrement();
  /**
   * <code>.fix.Decimal64 tick_increment = 3 [(.fix.tag) = 1208, (.fix.type) = DATATYPE_PRICE, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  org.fixprotocol.components.Fix.Decimal64OrBuilder getTickIncrementOrBuilder();

  /**
   * <code>.Common.TickRuleTypeEnum tick_rule_type = 4 [(.fix.tag) = 1209, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  int getTickRuleTypeValue();
  /**
   * <code>.Common.TickRuleTypeEnum tick_rule_type = 4 [(.fix.tag) = 1209, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  org.fixprotocol.components.TickRuleTypeEnum getTickRuleType();
}
