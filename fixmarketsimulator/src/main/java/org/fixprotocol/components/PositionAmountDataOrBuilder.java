// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package org.fixprotocol.components;

public interface PositionAmountDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Common.PositionAmountData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.fix.Decimal64 pos_amt = 1 [(.fix.tag) = 708, (.fix.type) = DATATYPE_AMT, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  boolean hasPosAmt();
  /**
   * <code>.fix.Decimal64 pos_amt = 1 [(.fix.tag) = 708, (.fix.type) = DATATYPE_AMT, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  org.fixprotocol.components.Fix.Decimal64 getPosAmt();
  /**
   * <code>.fix.Decimal64 pos_amt = 1 [(.fix.tag) = 708, (.fix.type) = DATATYPE_AMT, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  org.fixprotocol.components.Fix.Decimal64OrBuilder getPosAmtOrBuilder();

  /**
   * <code>.Common.PosAmtTypeEnum pos_amt_type = 2 [(.fix.tag) = 707, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  int getPosAmtTypeValue();
  /**
   * <code>.Common.PosAmtTypeEnum pos_amt_type = 2 [(.fix.tag) = 707, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  org.fixprotocol.components.PosAmtTypeEnum getPosAmtType();

  /**
   * <code>string position_currency = 3 [(.fix.tag) = 1055, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  java.lang.String getPositionCurrency();
  /**
   * <code>string position_currency = 3 [(.fix.tag) = 1055, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  com.google.protobuf.ByteString
      getPositionCurrencyBytes();
}
