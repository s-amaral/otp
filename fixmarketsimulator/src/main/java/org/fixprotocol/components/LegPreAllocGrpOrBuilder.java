// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package org.fixprotocol.components;

public interface LegPreAllocGrpOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Common.LegPreAllocGrp)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string leg_alloc_account = 1 [(.fix.tag) = 671, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  java.lang.String getLegAllocAccount();
  /**
   * <code>string leg_alloc_account = 1 [(.fix.tag) = 671, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  com.google.protobuf.ByteString
      getLegAllocAccountBytes();

  /**
   * <code>string leg_alloc_acct_id_source = 2 [(.fix.tag) = 674, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  java.lang.String getLegAllocAcctIdSource();
  /**
   * <code>string leg_alloc_acct_id_source = 2 [(.fix.tag) = 674, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  com.google.protobuf.ByteString
      getLegAllocAcctIdSourceBytes();

  /**
   * <code>.fix.Decimal64 leg_alloc_qty = 3 [(.fix.tag) = 673, (.fix.type) = DATATYPE_QTY, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  boolean hasLegAllocQty();
  /**
   * <code>.fix.Decimal64 leg_alloc_qty = 3 [(.fix.tag) = 673, (.fix.type) = DATATYPE_QTY, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  org.fixprotocol.components.Fix.Decimal64 getLegAllocQty();
  /**
   * <code>.fix.Decimal64 leg_alloc_qty = 3 [(.fix.tag) = 673, (.fix.type) = DATATYPE_QTY, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  org.fixprotocol.components.Fix.Decimal64OrBuilder getLegAllocQtyOrBuilder();

  /**
   * <code>string leg_individual_alloc_id = 4 [(.fix.tag) = 672, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  java.lang.String getLegIndividualAllocId();
  /**
   * <code>string leg_individual_alloc_id = 4 [(.fix.tag) = 672, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  com.google.protobuf.ByteString
      getLegIndividualAllocIdBytes();

  /**
   * <code>repeated .Common.NestedParties2 nested_parties2 = 5 [(.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  java.util.List<org.fixprotocol.components.NestedParties2> 
      getNestedParties2List();
  /**
   * <code>repeated .Common.NestedParties2 nested_parties2 = 5 [(.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  org.fixprotocol.components.NestedParties2 getNestedParties2(int index);
  /**
   * <code>repeated .Common.NestedParties2 nested_parties2 = 5 [(.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  int getNestedParties2Count();
  /**
   * <code>repeated .Common.NestedParties2 nested_parties2 = 5 [(.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  java.util.List<? extends org.fixprotocol.components.NestedParties2OrBuilder> 
      getNestedParties2OrBuilderList();
  /**
   * <code>repeated .Common.NestedParties2 nested_parties2 = 5 [(.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  org.fixprotocol.components.NestedParties2OrBuilder getNestedParties2OrBuilder(
      int index);

  /**
   * <code>string leg_alloc_settl_currency = 6 [(.fix.tag) = 1367, (.fix.type) = DATATYPE_CURRENCY, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  java.lang.String getLegAllocSettlCurrency();
  /**
   * <code>string leg_alloc_settl_currency = 6 [(.fix.tag) = 1367, (.fix.type) = DATATYPE_CURRENCY, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  com.google.protobuf.ByteString
      getLegAllocSettlCurrencyBytes();
}
