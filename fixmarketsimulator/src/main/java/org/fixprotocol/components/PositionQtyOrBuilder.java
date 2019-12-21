// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package org.fixprotocol.components;

public interface PositionQtyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Common.PositionQty)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.fix.Decimal64 long_qty = 1 [(.fix.tag) = 704, (.fix.type) = DATATYPE_QTY, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  boolean hasLongQty();
  /**
   * <code>.fix.Decimal64 long_qty = 1 [(.fix.tag) = 704, (.fix.type) = DATATYPE_QTY, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  org.fixprotocol.components.Fix.Decimal64 getLongQty();
  /**
   * <code>.fix.Decimal64 long_qty = 1 [(.fix.tag) = 704, (.fix.type) = DATATYPE_QTY, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  org.fixprotocol.components.Fix.Decimal64OrBuilder getLongQtyOrBuilder();

  /**
   * <code>repeated .Common.NestedParties nested_parties = 2 [(.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  java.util.List<org.fixprotocol.components.NestedParties> 
      getNestedPartiesList();
  /**
   * <code>repeated .Common.NestedParties nested_parties = 2 [(.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  org.fixprotocol.components.NestedParties getNestedParties(int index);
  /**
   * <code>repeated .Common.NestedParties nested_parties = 2 [(.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  int getNestedPartiesCount();
  /**
   * <code>repeated .Common.NestedParties nested_parties = 2 [(.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  java.util.List<? extends org.fixprotocol.components.NestedPartiesOrBuilder> 
      getNestedPartiesOrBuilderList();
  /**
   * <code>repeated .Common.NestedParties nested_parties = 2 [(.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  org.fixprotocol.components.NestedPartiesOrBuilder getNestedPartiesOrBuilder(
      int index);

  /**
   * <code>.Common.PosQtyStatusEnum pos_qty_status = 3 [(.fix.tag) = 706, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  int getPosQtyStatusValue();
  /**
   * <code>.Common.PosQtyStatusEnum pos_qty_status = 3 [(.fix.tag) = 706, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  org.fixprotocol.components.PosQtyStatusEnum getPosQtyStatus();

  /**
   * <code>.Common.PosTypeEnum pos_type = 4 [(.fix.tag) = 703, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  int getPosTypeValue();
  /**
   * <code>.Common.PosTypeEnum pos_type = 4 [(.fix.tag) = 703, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  org.fixprotocol.components.PosTypeEnum getPosType();

  /**
   * <code>sfixed32 quantity_date = 5 [(.fix.tag) = 976, (.fix.type) = DATATYPE_LOCAL_MKT_DATE, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  int getQuantityDate();

  /**
   * <code>.fix.Decimal64 short_qty = 6 [(.fix.tag) = 705, (.fix.type) = DATATYPE_QTY, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  boolean hasShortQty();
  /**
   * <code>.fix.Decimal64 short_qty = 6 [(.fix.tag) = 705, (.fix.type) = DATATYPE_QTY, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  org.fixprotocol.components.Fix.Decimal64 getShortQty();
  /**
   * <code>.fix.Decimal64 short_qty = 6 [(.fix.tag) = 705, (.fix.type) = DATATYPE_QTY, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  org.fixprotocol.components.Fix.Decimal64OrBuilder getShortQtyOrBuilder();
}