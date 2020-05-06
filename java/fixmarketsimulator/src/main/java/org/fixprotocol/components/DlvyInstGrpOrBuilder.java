// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package org.fixprotocol.components;

public interface DlvyInstGrpOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Common.DlvyInstGrp)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.Common.DlvyInstTypeEnum dlvy_inst_type = 1 [(.fix.tag) = 787, (.fix.type) = DATATYPE_CHAR, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The enum numeric value on the wire for dlvyInstType.
   */
  int getDlvyInstTypeValue();
  /**
   * <code>.Common.DlvyInstTypeEnum dlvy_inst_type = 1 [(.fix.tag) = 787, (.fix.type) = DATATYPE_CHAR, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The dlvyInstType.
   */
  org.fixprotocol.components.DlvyInstTypeEnum getDlvyInstType();

  /**
   * <code>.Common.SettlInstSourceEnum settl_inst_source = 2 [(.fix.tag) = 165, (.fix.type) = DATATYPE_CHAR, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The enum numeric value on the wire for settlInstSource.
   */
  int getSettlInstSourceValue();
  /**
   * <code>.Common.SettlInstSourceEnum settl_inst_source = 2 [(.fix.tag) = 165, (.fix.type) = DATATYPE_CHAR, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The settlInstSource.
   */
  org.fixprotocol.components.SettlInstSourceEnum getSettlInstSource();

  /**
   * <code>repeated .Common.SettlParties settl_parties = 3 [(.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  java.util.List<org.fixprotocol.components.SettlParties> 
      getSettlPartiesList();
  /**
   * <code>repeated .Common.SettlParties settl_parties = 3 [(.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  org.fixprotocol.components.SettlParties getSettlParties(int index);
  /**
   * <code>repeated .Common.SettlParties settl_parties = 3 [(.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  int getSettlPartiesCount();
  /**
   * <code>repeated .Common.SettlParties settl_parties = 3 [(.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  java.util.List<? extends org.fixprotocol.components.SettlPartiesOrBuilder> 
      getSettlPartiesOrBuilderList();
  /**
   * <code>repeated .Common.SettlParties settl_parties = 3 [(.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  org.fixprotocol.components.SettlPartiesOrBuilder getSettlPartiesOrBuilder(
      int index);
}