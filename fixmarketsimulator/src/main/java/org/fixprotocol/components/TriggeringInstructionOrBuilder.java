// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package org.fixprotocol.components;

public interface TriggeringInstructionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Common.TriggeringInstruction)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.Common.TriggerActionEnum trigger_action = 1 [(.fix.tag) = 1101, (.fix.type) = DATATYPE_CHAR, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  int getTriggerActionValue();
  /**
   * <code>.Common.TriggerActionEnum trigger_action = 1 [(.fix.tag) = 1101, (.fix.type) = DATATYPE_CHAR, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  org.fixprotocol.components.TriggerActionEnum getTriggerAction();

  /**
   * <code>.fix.Decimal64 trigger_new_price = 2 [(.fix.tag) = 1110, (.fix.type) = DATATYPE_PRICE, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  boolean hasTriggerNewPrice();
  /**
   * <code>.fix.Decimal64 trigger_new_price = 2 [(.fix.tag) = 1110, (.fix.type) = DATATYPE_PRICE, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  org.fixprotocol.components.Fix.Decimal64 getTriggerNewPrice();
  /**
   * <code>.fix.Decimal64 trigger_new_price = 2 [(.fix.tag) = 1110, (.fix.type) = DATATYPE_PRICE, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  org.fixprotocol.components.Fix.Decimal64OrBuilder getTriggerNewPriceOrBuilder();

  /**
   * <code>.fix.Decimal64 trigger_new_qty = 3 [(.fix.tag) = 1112, (.fix.type) = DATATYPE_QTY, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  boolean hasTriggerNewQty();
  /**
   * <code>.fix.Decimal64 trigger_new_qty = 3 [(.fix.tag) = 1112, (.fix.type) = DATATYPE_QTY, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  org.fixprotocol.components.Fix.Decimal64 getTriggerNewQty();
  /**
   * <code>.fix.Decimal64 trigger_new_qty = 3 [(.fix.tag) = 1112, (.fix.type) = DATATYPE_QTY, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  org.fixprotocol.components.Fix.Decimal64OrBuilder getTriggerNewQtyOrBuilder();

  /**
   * <code>.Common.TriggerOrderTypeEnum trigger_order_type = 4 [(.fix.tag) = 1111, (.fix.type) = DATATYPE_CHAR, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  int getTriggerOrderTypeValue();
  /**
   * <code>.Common.TriggerOrderTypeEnum trigger_order_type = 4 [(.fix.tag) = 1111, (.fix.type) = DATATYPE_CHAR, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  org.fixprotocol.components.TriggerOrderTypeEnum getTriggerOrderType();

  /**
   * <code>.fix.Decimal64 trigger_price = 5 [(.fix.tag) = 1102, (.fix.type) = DATATYPE_PRICE, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  boolean hasTriggerPrice();
  /**
   * <code>.fix.Decimal64 trigger_price = 5 [(.fix.tag) = 1102, (.fix.type) = DATATYPE_PRICE, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  org.fixprotocol.components.Fix.Decimal64 getTriggerPrice();
  /**
   * <code>.fix.Decimal64 trigger_price = 5 [(.fix.tag) = 1102, (.fix.type) = DATATYPE_PRICE, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  org.fixprotocol.components.Fix.Decimal64OrBuilder getTriggerPriceOrBuilder();

  /**
   * <code>.Common.TriggerPriceDirectionEnum trigger_price_direction = 6 [(.fix.tag) = 1109, (.fix.type) = DATATYPE_CHAR, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  int getTriggerPriceDirectionValue();
  /**
   * <code>.Common.TriggerPriceDirectionEnum trigger_price_direction = 6 [(.fix.tag) = 1109, (.fix.type) = DATATYPE_CHAR, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  org.fixprotocol.components.TriggerPriceDirectionEnum getTriggerPriceDirection();

  /**
   * <code>.Common.TriggerPriceTypeEnum trigger_price_type = 7 [(.fix.tag) = 1107, (.fix.type) = DATATYPE_CHAR, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  int getTriggerPriceTypeValue();
  /**
   * <code>.Common.TriggerPriceTypeEnum trigger_price_type = 7 [(.fix.tag) = 1107, (.fix.type) = DATATYPE_CHAR, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  org.fixprotocol.components.TriggerPriceTypeEnum getTriggerPriceType();

  /**
   * <code>.Common.TriggerPriceTypeScopeEnum trigger_price_type_scope = 8 [(.fix.tag) = 1108, (.fix.type) = DATATYPE_CHAR, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  int getTriggerPriceTypeScopeValue();
  /**
   * <code>.Common.TriggerPriceTypeScopeEnum trigger_price_type_scope = 8 [(.fix.tag) = 1108, (.fix.type) = DATATYPE_CHAR, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  org.fixprotocol.components.TriggerPriceTypeScopeEnum getTriggerPriceTypeScope();

  /**
   * <code>string trigger_security_desc = 9 [(.fix.tag) = 1106, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  java.lang.String getTriggerSecurityDesc();
  /**
   * <code>string trigger_security_desc = 9 [(.fix.tag) = 1106, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  com.google.protobuf.ByteString
      getTriggerSecurityDescBytes();

  /**
   * <code>string trigger_security_id = 10 [(.fix.tag) = 1104, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  java.lang.String getTriggerSecurityId();
  /**
   * <code>string trigger_security_id = 10 [(.fix.tag) = 1104, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  com.google.protobuf.ByteString
      getTriggerSecurityIdBytes();

  /**
   * <code>.Common.TriggerSecurityIDSourceEnum trigger_security_id_source = 11 [(.fix.tag) = 1105, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  int getTriggerSecurityIdSourceValue();
  /**
   * <code>.Common.TriggerSecurityIDSourceEnum trigger_security_id_source = 11 [(.fix.tag) = 1105, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  org.fixprotocol.components.TriggerSecurityIDSourceEnum getTriggerSecurityIdSource();

  /**
   * <code>string trigger_symbol = 12 [(.fix.tag) = 1103, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  java.lang.String getTriggerSymbol();
  /**
   * <code>string trigger_symbol = 12 [(.fix.tag) = 1103, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  com.google.protobuf.ByteString
      getTriggerSymbolBytes();

  /**
   * <code>string trigger_trading_session_id = 13 [(.fix.tag) = 1113, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  java.lang.String getTriggerTradingSessionId();
  /**
   * <code>string trigger_trading_session_id = 13 [(.fix.tag) = 1113, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  com.google.protobuf.ByteString
      getTriggerTradingSessionIdBytes();

  /**
   * <code>string trigger_trading_session_sub_id = 14 [(.fix.tag) = 1114, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  java.lang.String getTriggerTradingSessionSubId();
  /**
   * <code>string trigger_trading_session_sub_id = 14 [(.fix.tag) = 1114, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  com.google.protobuf.ByteString
      getTriggerTradingSessionSubIdBytes();

  /**
   * <code>.Common.TriggerTypeEnum trigger_type = 15 [(.fix.tag) = 1100, (.fix.type) = DATATYPE_CHAR, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  int getTriggerTypeValue();
  /**
   * <code>.Common.TriggerTypeEnum trigger_type = 15 [(.fix.tag) = 1100, (.fix.type) = DATATYPE_CHAR, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  org.fixprotocol.components.TriggerTypeEnum getTriggerType();
}