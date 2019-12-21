// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package org.fixprotocol.components;

public interface CommissionDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Common.CommissionData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string comm_currency = 1 [(.fix.tag) = 479, (.fix.type) = DATATYPE_CURRENCY, (.fix.field_added) = VERSION_FIX_4_3];</code>
   */
  java.lang.String getCommCurrency();
  /**
   * <code>string comm_currency = 1 [(.fix.tag) = 479, (.fix.type) = DATATYPE_CURRENCY, (.fix.field_added) = VERSION_FIX_4_3];</code>
   */
  com.google.protobuf.ByteString
      getCommCurrencyBytes();

  /**
   * <code>.Common.CommTypeEnum comm_type = 2 [(.fix.tag) = 13, (.fix.type) = DATATYPE_CHAR, (.fix.field_added) = VERSION_FIX_4_3];</code>
   */
  int getCommTypeValue();
  /**
   * <code>.Common.CommTypeEnum comm_type = 2 [(.fix.tag) = 13, (.fix.type) = DATATYPE_CHAR, (.fix.field_added) = VERSION_FIX_4_3];</code>
   */
  org.fixprotocol.components.CommTypeEnum getCommType();

  /**
   * <code>.fix.Decimal64 commission = 3 [(.fix.tag) = 12, (.fix.type) = DATATYPE_AMT, (.fix.field_added) = VERSION_FIX_4_3];</code>
   */
  boolean hasCommission();
  /**
   * <code>.fix.Decimal64 commission = 3 [(.fix.tag) = 12, (.fix.type) = DATATYPE_AMT, (.fix.field_added) = VERSION_FIX_4_3];</code>
   */
  org.fixprotocol.components.Fix.Decimal64 getCommission();
  /**
   * <code>.fix.Decimal64 commission = 3 [(.fix.tag) = 12, (.fix.type) = DATATYPE_AMT, (.fix.field_added) = VERSION_FIX_4_3];</code>
   */
  org.fixprotocol.components.Fix.Decimal64OrBuilder getCommissionOrBuilder();

  /**
   * <code>.Common.FundRenewWaivEnum fund_renew_waiv = 4 [(.fix.tag) = 497, (.fix.type) = DATATYPE_CHAR, (.fix.field_added) = VERSION_FIX_4_3];</code>
   */
  int getFundRenewWaivValue();
  /**
   * <code>.Common.FundRenewWaivEnum fund_renew_waiv = 4 [(.fix.tag) = 497, (.fix.type) = DATATYPE_CHAR, (.fix.field_added) = VERSION_FIX_4_3];</code>
   */
  org.fixprotocol.components.FundRenewWaivEnum getFundRenewWaiv();
}