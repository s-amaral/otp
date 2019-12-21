// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package org.fixprotocol.components;

public interface StrikeRulesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Common.StrikeRules)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.fix.Decimal64 end_strike_px_range = 1 [(.fix.tag) = 1203, (.fix.type) = DATATYPE_PRICE, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  boolean hasEndStrikePxRange();
  /**
   * <code>.fix.Decimal64 end_strike_px_range = 1 [(.fix.tag) = 1203, (.fix.type) = DATATYPE_PRICE, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  org.fixprotocol.components.Fix.Decimal64 getEndStrikePxRange();
  /**
   * <code>.fix.Decimal64 end_strike_px_range = 1 [(.fix.tag) = 1203, (.fix.type) = DATATYPE_PRICE, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  org.fixprotocol.components.Fix.Decimal64OrBuilder getEndStrikePxRangeOrBuilder();

  /**
   * <code>repeated .Common.MaturityRules maturity_rules = 2 [(.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  java.util.List<org.fixprotocol.components.MaturityRules> 
      getMaturityRulesList();
  /**
   * <code>repeated .Common.MaturityRules maturity_rules = 2 [(.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  org.fixprotocol.components.MaturityRules getMaturityRules(int index);
  /**
   * <code>repeated .Common.MaturityRules maturity_rules = 2 [(.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  int getMaturityRulesCount();
  /**
   * <code>repeated .Common.MaturityRules maturity_rules = 2 [(.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  java.util.List<? extends org.fixprotocol.components.MaturityRulesOrBuilder> 
      getMaturityRulesOrBuilderList();
  /**
   * <code>repeated .Common.MaturityRules maturity_rules = 2 [(.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  org.fixprotocol.components.MaturityRulesOrBuilder getMaturityRulesOrBuilder(
      int index);

  /**
   * <code>.fix.Decimal64 start_strike_px_range = 3 [(.fix.tag) = 1202, (.fix.type) = DATATYPE_PRICE, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  boolean hasStartStrikePxRange();
  /**
   * <code>.fix.Decimal64 start_strike_px_range = 3 [(.fix.tag) = 1202, (.fix.type) = DATATYPE_PRICE, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  org.fixprotocol.components.Fix.Decimal64 getStartStrikePxRange();
  /**
   * <code>.fix.Decimal64 start_strike_px_range = 3 [(.fix.tag) = 1202, (.fix.type) = DATATYPE_PRICE, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  org.fixprotocol.components.Fix.Decimal64OrBuilder getStartStrikePxRangeOrBuilder();

  /**
   * <code>.Common.StrikeExerciseStyleEnum strike_exercise_style = 4 [(.fix.tag) = 1304, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  int getStrikeExerciseStyleValue();
  /**
   * <code>.Common.StrikeExerciseStyleEnum strike_exercise_style = 4 [(.fix.tag) = 1304, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  org.fixprotocol.components.StrikeExerciseStyleEnum getStrikeExerciseStyle();

  /**
   * <code>.fix.Decimal64 strike_increment = 5 [(.fix.tag) = 1204, (.fix.type) = DATATYPE_FLOAT, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  boolean hasStrikeIncrement();
  /**
   * <code>.fix.Decimal64 strike_increment = 5 [(.fix.tag) = 1204, (.fix.type) = DATATYPE_FLOAT, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  org.fixprotocol.components.Fix.Decimal64 getStrikeIncrement();
  /**
   * <code>.fix.Decimal64 strike_increment = 5 [(.fix.tag) = 1204, (.fix.type) = DATATYPE_FLOAT, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  org.fixprotocol.components.Fix.Decimal64OrBuilder getStrikeIncrementOrBuilder();

  /**
   * <code>string strike_rule_id = 6 [(.fix.tag) = 1223, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  java.lang.String getStrikeRuleId();
  /**
   * <code>string strike_rule_id = 6 [(.fix.tag) = 1223, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  com.google.protobuf.ByteString
      getStrikeRuleIdBytes();
}