// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package org.fixprotocol.components;

/**
 * Protobuf enum {@code Common.ExecInstValueEnum}
 */
public enum ExecInstValueEnum
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>EXEC_INST_VALUE_UNSPECIFIED = 0;</code>
   */
  EXEC_INST_VALUE_UNSPECIFIED(0),
  /**
   * <code>EXEC_INST_VALUE_ALL_OR_NONE = 1 [(.fix.enum_value) = "G", (.fix.enum_added) = VERSION_FIX_2_7];</code>
   */
  EXEC_INST_VALUE_ALL_OR_NONE(1),
  /**
   * <code>EXEC_INST_VALUE_CALL_FIRST = 2 [(.fix.enum_value) = "C", (.fix.enum_added) = VERSION_FIX_2_7];</code>
   */
  EXEC_INST_VALUE_CALL_FIRST(2),
  /**
   * <code>EXEC_INST_VALUE_DO_NOT_INCREASE = 3 [(.fix.enum_value) = "E", (.fix.enum_added) = VERSION_FIX_2_7];</code>
   */
  EXEC_INST_VALUE_DO_NOT_INCREASE(3),
  /**
   * <code>EXEC_INST_VALUE_DO_NOT_REDUCE = 4 [(.fix.enum_value) = "F", (.fix.enum_added) = VERSION_FIX_2_7];</code>
   */
  EXEC_INST_VALUE_DO_NOT_REDUCE(4),
  /**
   * <code>EXEC_INST_VALUE_GO_ALONG = 5 [(.fix.enum_value) = "3", (.fix.enum_added) = VERSION_FIX_2_7];</code>
   */
  EXEC_INST_VALUE_GO_ALONG(5),
  /**
   * <code>EXEC_INST_VALUE_HELD = 6 [(.fix.enum_value) = "5", (.fix.enum_added) = VERSION_FIX_2_7];</code>
   */
  EXEC_INST_VALUE_HELD(6),
  /**
   * <code>EXEC_INST_VALUE_NOT_HELD = 7 [(.fix.enum_value) = "1", (.fix.enum_added) = VERSION_FIX_2_7];</code>
   */
  EXEC_INST_VALUE_NOT_HELD(7),
  /**
   * <code>EXEC_INST_VALUE_NO_CROSS = 8 [(.fix.enum_value) = "A", (.fix.enum_added) = VERSION_FIX_2_7];</code>
   */
  EXEC_INST_VALUE_NO_CROSS(8),
  /**
   * <code>EXEC_INST_VALUE_OKTO_CROSS = 9 [(.fix.enum_value) = "B", (.fix.enum_added) = VERSION_FIX_2_7];</code>
   */
  EXEC_INST_VALUE_OKTO_CROSS(9),
  /**
   * <code>EXEC_INST_VALUE_OVER_THE_DAY = 10 [(.fix.enum_value) = "4", (.fix.enum_added) = VERSION_FIX_2_7];</code>
   */
  EXEC_INST_VALUE_OVER_THE_DAY(10),
  /**
   * <code>EXEC_INST_VALUE_PARTICIPATE_DO_NOT_INITIATE = 11 [(.fix.enum_value) = "6", (.fix.enum_added) = VERSION_FIX_2_7];</code>
   */
  EXEC_INST_VALUE_PARTICIPATE_DO_NOT_INITIATE(11),
  /**
   * <code>EXEC_INST_VALUE_PERCENT_OF_VOLUME = 12 [(.fix.enum_value) = "D", (.fix.enum_added) = VERSION_FIX_2_7];</code>
   */
  EXEC_INST_VALUE_PERCENT_OF_VOLUME(12),
  /**
   * <code>EXEC_INST_VALUE_STAY_ON_BID_SIDE = 13 [(.fix.enum_value) = "9", (.fix.enum_added) = VERSION_FIX_2_7];</code>
   */
  EXEC_INST_VALUE_STAY_ON_BID_SIDE(13),
  /**
   * <code>EXEC_INST_VALUE_STAY_ON_OFFER_SIDE = 14 [(.fix.enum_value) = "0", (.fix.enum_added) = VERSION_FIX_2_7];</code>
   */
  EXEC_INST_VALUE_STAY_ON_OFFER_SIDE(14),
  /**
   * <code>EXEC_INST_VALUE_STRICT_SCALE = 15 [(.fix.enum_value) = "7", (.fix.enum_added) = VERSION_FIX_2_7];</code>
   */
  EXEC_INST_VALUE_STRICT_SCALE(15),
  /**
   * <code>EXEC_INST_VALUE_TRY_TO_SCALE = 16 [(.fix.enum_value) = "8", (.fix.enum_added) = VERSION_FIX_2_7];</code>
   */
  EXEC_INST_VALUE_TRY_TO_SCALE(16),
  /**
   * <code>EXEC_INST_VALUE_WORK = 17 [(.fix.enum_value) = "2", (.fix.enum_added) = VERSION_FIX_2_7];</code>
   */
  EXEC_INST_VALUE_WORK(17),
  /**
   * <code>EXEC_INST_VALUE_INSTITUTIONS_ONLY = 18 [(.fix.enum_value) = "I", (.fix.enum_added) = VERSION_FIX_3_0];</code>
   */
  EXEC_INST_VALUE_INSTITUTIONS_ONLY(18),
  /**
   * <code>EXEC_INST_VALUE_LAST_PEG = 19 [(.fix.enum_value) = "L", (.fix.enum_added) = VERSION_FIX_3_0, (.fix.enum_deprecated) = VERSION_FIX_5_0];</code>
   */
  EXEC_INST_VALUE_LAST_PEG(19),
  /**
   * <code>EXEC_INST_VALUE_MARKET_PEG = 20 [(.fix.enum_value) = "P", (.fix.enum_added) = VERSION_FIX_3_0, (.fix.enum_deprecated) = VERSION_FIX_5_0];</code>
   */
  EXEC_INST_VALUE_MARKET_PEG(20),
  /**
   * <code>EXEC_INST_VALUE_MID_PRICE_PEG = 21 [(.fix.enum_value) = "M", (.fix.enum_added) = VERSION_FIX_3_0, (.fix.enum_deprecated) = VERSION_FIX_5_0];</code>
   */
  EXEC_INST_VALUE_MID_PRICE_PEG(21),
  /**
   * <code>EXEC_INST_VALUE_NON_NEGOTIABLE = 22 [(.fix.enum_value) = "N", (.fix.enum_added) = VERSION_FIX_3_0];</code>
   */
  EXEC_INST_VALUE_NON_NEGOTIABLE(22),
  /**
   * <code>EXEC_INST_VALUE_OPENING_PEG = 23 [(.fix.enum_value) = "O", (.fix.enum_added) = VERSION_FIX_3_0, (.fix.enum_deprecated) = VERSION_FIX_5_0];</code>
   */
  EXEC_INST_VALUE_OPENING_PEG(23),
  /**
   * <code>EXEC_INST_VALUE_PRIMARY_PEG = 24 [(.fix.enum_value) = "R", (.fix.enum_added) = VERSION_FIX_3_0, (.fix.enum_deprecated) = VERSION_FIX_5_0];</code>
   */
  EXEC_INST_VALUE_PRIMARY_PEG(24),
  /**
   * <code>EXEC_INST_VALUE_SUSPEND = 25 [(.fix.enum_value) = "S", (.fix.enum_added) = VERSION_FIX_3_0];</code>
   */
  EXEC_INST_VALUE_SUSPEND(25),
  /**
   * <code>EXEC_INST_VALUE_CUSTOMER_DISPLAY_INSTRUCTION = 26 [(.fix.enum_value) = "U", (.fix.enum_added) = VERSION_FIX_4_1];</code>
   */
  EXEC_INST_VALUE_CUSTOMER_DISPLAY_INSTRUCTION(26),
  /**
   * <code>EXEC_INST_VALUE_NETTING = 27 [(.fix.enum_value) = "V", (.fix.enum_added) = VERSION_FIX_4_1];</code>
   */
  EXEC_INST_VALUE_NETTING(27),
  /**
   * <code>EXEC_INST_VALUE_PEG_TO_VWAP = 28 [(.fix.enum_value) = "W", (.fix.enum_added) = VERSION_FIX_4_2, (.fix.enum_deprecated) = VERSION_FIX_5_0];</code>
   */
  EXEC_INST_VALUE_PEG_TO_VWAP(28),
  /**
   * <code>EXEC_INST_VALUE_CANCEL_ON_SYSTEM_FAILURE = 29 [(.fix.enum_value) = "Q", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  EXEC_INST_VALUE_CANCEL_ON_SYSTEM_FAILURE(29),
  /**
   * <code>EXEC_INST_VALUE_CANCEL_ON_TRADING_HALT = 30 [(.fix.enum_value) = "K", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  EXEC_INST_VALUE_CANCEL_ON_TRADING_HALT(30),
  /**
   * <code>EXEC_INST_VALUE_REINSTATE_ON_SYSTEM_FAILURE = 31 [(.fix.enum_value) = "H", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  EXEC_INST_VALUE_REINSTATE_ON_SYSTEM_FAILURE(31),
  /**
   * <code>EXEC_INST_VALUE_REINSTATE_ON_TRADING_HALT = 32 [(.fix.enum_value) = "J", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  EXEC_INST_VALUE_REINSTATE_ON_TRADING_HALT(32),
  /**
   * <code>EXEC_INST_VALUE_TRADE_ALONG = 33 [(.fix.enum_value) = "X", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  EXEC_INST_VALUE_TRADE_ALONG(33),
  /**
   * <code>EXEC_INST_VALUE_TRY_TO_STOP = 34 [(.fix.enum_value) = "Y", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  EXEC_INST_VALUE_TRY_TO_STOP(34),
  /**
   * <code>EXEC_INST_VALUE_CANCEL_IF_NOT_BEST = 35 [(.fix.enum_value) = "Z", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  EXEC_INST_VALUE_CANCEL_IF_NOT_BEST(35),
  /**
   * <code>EXEC_INST_VALUE_IGNORE_PRICE_VALIDITY_CHECKS = 36 [(.fix.enum_value) = "c", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  EXEC_INST_VALUE_IGNORE_PRICE_VALIDITY_CHECKS(36),
  /**
   * <code>EXEC_INST_VALUE_PEG_TO_LIMIT_PRICE = 37 [(.fix.enum_value) = "d", (.fix.enum_added) = VERSION_FIX_4_4, (.fix.enum_deprecated) = VERSION_FIX_5_0];</code>
   */
  EXEC_INST_VALUE_PEG_TO_LIMIT_PRICE(37),
  /**
   * <code>EXEC_INST_VALUE_STRICT_LIMIT = 38 [(.fix.enum_value) = "b", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  EXEC_INST_VALUE_STRICT_LIMIT(38),
  /**
   * <code>EXEC_INST_VALUE_TRAILING_STOP_PEG = 39 [(.fix.enum_value) = "a", (.fix.enum_added) = VERSION_FIX_4_4, (.fix.enum_deprecated) = VERSION_FIX_5_0];</code>
   */
  EXEC_INST_VALUE_TRAILING_STOP_PEG(39),
  /**
   * <code>EXEC_INST_VALUE_WORK_TO_TARGET_STRATEGY = 40 [(.fix.enum_value) = "e", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  EXEC_INST_VALUE_WORK_TO_TARGET_STRATEGY(40),
  /**
   * <code>EXEC_INST_VALUE_INTERMARKET_SWEEP = 41 [(.fix.enum_value) = "f", (.fix.enum_added) = VERSION_FIX_4_4, (.fix.enum_added_ep) = 6];</code>
   */
  EXEC_INST_VALUE_INTERMARKET_SWEEP(41),
  /**
   * <code>EXEC_INST_VALUE_SINGLE_EXECUTION_REQUESTED_FOR_BLOCK_TRADE = 42 [(.fix.enum_value) = "j", (.fix.enum_added) = VERSION_FIX_4_4, (.fix.enum_added_ep) = 6];</code>
   */
  EXEC_INST_VALUE_SINGLE_EXECUTION_REQUESTED_FOR_BLOCK_TRADE(42),
  /**
   * <code>EXEC_INST_VALUE_EXTERNAL_ROUTING_ALLOWED = 43 [(.fix.enum_value) = "g", (.fix.enum_added) = VERSION_FIX_4_4, (.fix.enum_added_ep) = 14];</code>
   */
  EXEC_INST_VALUE_EXTERNAL_ROUTING_ALLOWED(43),
  /**
   * <code>EXEC_INST_VALUE_EXTERNAL_ROUTING_NOT_ALLOWED = 44 [(.fix.enum_value) = "h", (.fix.enum_added) = VERSION_FIX_4_4, (.fix.enum_added_ep) = 14];</code>
   */
  EXEC_INST_VALUE_EXTERNAL_ROUTING_NOT_ALLOWED(44),
  /**
   * <code>EXEC_INST_VALUE_IMBALANCE_ONLY = 45 [(.fix.enum_value) = "i", (.fix.enum_added) = VERSION_FIX_4_4, (.fix.enum_added_ep) = 22];</code>
   */
  EXEC_INST_VALUE_IMBALANCE_ONLY(45),
  /**
   * <code>EXEC_INST_VALUE_BEST_EXECUTION = 46 [(.fix.enum_value) = "k", (.fix.enum_added) = VERSION_FIX_4_4, (.fix.enum_added_ep) = 35];</code>
   */
  EXEC_INST_VALUE_BEST_EXECUTION(46),
  /**
   * <code>EXEC_INST_VALUE_FIXED_PEG_TO_LOCAL_BEST_BID_OR_OFFER_AT_TIME_OF_ORDER = 47 [(.fix.enum_value) = "T", (.fix.enum_added) = VERSION_FIX_4_4, (.fix.enum_added_ep) = 35, (.fix.enum_deprecated) = VERSION_FIX_5_0];</code>
   */
  EXEC_INST_VALUE_FIXED_PEG_TO_LOCAL_BEST_BID_OR_OFFER_AT_TIME_OF_ORDER(47),
  /**
   * <code>EXEC_INST_VALUE_CANCEL_ON_CONNECTION_LOSS = 48 [(.fix.enum_value) = "o", (.fix.enum_added) = VERSION_FIX_5_0, (.fix.enum_added_ep) = 58];</code>
   */
  EXEC_INST_VALUE_CANCEL_ON_CONNECTION_LOSS(48),
  /**
   * <code>EXEC_INST_VALUE_REINSTATE_ON_CONNECTION_LOSS = 49 [(.fix.enum_value) = "n", (.fix.enum_added) = VERSION_FIX_5_0, (.fix.enum_added_ep) = 58];</code>
   */
  EXEC_INST_VALUE_REINSTATE_ON_CONNECTION_LOSS(49),
  /**
   * <code>EXEC_INST_VALUE_RELEASE_FROM_SUSPENSION = 50 [(.fix.enum_value) = "q", (.fix.enum_added) = VERSION_FIX_5_0, (.fix.enum_added_ep) = 58];</code>
   */
  EXEC_INST_VALUE_RELEASE_FROM_SUSPENSION(50),
  /**
   * <code>EXEC_INST_VALUE_SUSPEND_ON_CONNECTION_LOSS = 51 [(.fix.enum_value) = "p", (.fix.enum_added) = VERSION_FIX_5_0, (.fix.enum_added_ep) = 58];</code>
   */
  EXEC_INST_VALUE_SUSPEND_ON_CONNECTION_LOSS(51),
  /**
   * <code>EXEC_INST_VALUE_SUSPEND_ON_SYSTEM_FAILURE = 52 [(.fix.enum_value) = "l", (.fix.enum_added) = VERSION_FIX_5_0, (.fix.enum_added_ep) = 58];</code>
   */
  EXEC_INST_VALUE_SUSPEND_ON_SYSTEM_FAILURE(52),
  /**
   * <code>EXEC_INST_VALUE_SUSPEND_ON_TRADING_HALT = 53 [(.fix.enum_value) = "m", (.fix.enum_added) = VERSION_FIX_5_0, (.fix.enum_added_ep) = 58];</code>
   */
  EXEC_INST_VALUE_SUSPEND_ON_TRADING_HALT(53),
  /**
   * <code>EXEC_INST_VALUE_EXECUTE_AS_DELTA_NEUTRAL = 54 [(.fix.enum_value) = "r", (.fix.enum_added) = VERSION_FIX_5_0, (.fix.enum_added_ep) = 59];</code>
   */
  EXEC_INST_VALUE_EXECUTE_AS_DELTA_NEUTRAL(54),
  /**
   * <code>EXEC_INST_VALUE_EXECUTE_AS_DURATION_NEUTRAL = 55 [(.fix.enum_value) = "s", (.fix.enum_added) = VERSION_FIX_5_0, (.fix.enum_added_ep) = 59];</code>
   */
  EXEC_INST_VALUE_EXECUTE_AS_DURATION_NEUTRAL(55),
  /**
   * <code>EXEC_INST_VALUE_EXECUTE_AS_FX_NEUTRAL = 56 [(.fix.enum_value) = "t", (.fix.enum_added) = VERSION_FIX_5_0, (.fix.enum_added_ep) = 59];</code>
   */
  EXEC_INST_VALUE_EXECUTE_AS_FX_NEUTRAL(56),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>EXEC_INST_VALUE_UNSPECIFIED = 0;</code>
   */
  public static final int EXEC_INST_VALUE_UNSPECIFIED_VALUE = 0;
  /**
   * <code>EXEC_INST_VALUE_ALL_OR_NONE = 1 [(.fix.enum_value) = "G", (.fix.enum_added) = VERSION_FIX_2_7];</code>
   */
  public static final int EXEC_INST_VALUE_ALL_OR_NONE_VALUE = 1;
  /**
   * <code>EXEC_INST_VALUE_CALL_FIRST = 2 [(.fix.enum_value) = "C", (.fix.enum_added) = VERSION_FIX_2_7];</code>
   */
  public static final int EXEC_INST_VALUE_CALL_FIRST_VALUE = 2;
  /**
   * <code>EXEC_INST_VALUE_DO_NOT_INCREASE = 3 [(.fix.enum_value) = "E", (.fix.enum_added) = VERSION_FIX_2_7];</code>
   */
  public static final int EXEC_INST_VALUE_DO_NOT_INCREASE_VALUE = 3;
  /**
   * <code>EXEC_INST_VALUE_DO_NOT_REDUCE = 4 [(.fix.enum_value) = "F", (.fix.enum_added) = VERSION_FIX_2_7];</code>
   */
  public static final int EXEC_INST_VALUE_DO_NOT_REDUCE_VALUE = 4;
  /**
   * <code>EXEC_INST_VALUE_GO_ALONG = 5 [(.fix.enum_value) = "3", (.fix.enum_added) = VERSION_FIX_2_7];</code>
   */
  public static final int EXEC_INST_VALUE_GO_ALONG_VALUE = 5;
  /**
   * <code>EXEC_INST_VALUE_HELD = 6 [(.fix.enum_value) = "5", (.fix.enum_added) = VERSION_FIX_2_7];</code>
   */
  public static final int EXEC_INST_VALUE_HELD_VALUE = 6;
  /**
   * <code>EXEC_INST_VALUE_NOT_HELD = 7 [(.fix.enum_value) = "1", (.fix.enum_added) = VERSION_FIX_2_7];</code>
   */
  public static final int EXEC_INST_VALUE_NOT_HELD_VALUE = 7;
  /**
   * <code>EXEC_INST_VALUE_NO_CROSS = 8 [(.fix.enum_value) = "A", (.fix.enum_added) = VERSION_FIX_2_7];</code>
   */
  public static final int EXEC_INST_VALUE_NO_CROSS_VALUE = 8;
  /**
   * <code>EXEC_INST_VALUE_OKTO_CROSS = 9 [(.fix.enum_value) = "B", (.fix.enum_added) = VERSION_FIX_2_7];</code>
   */
  public static final int EXEC_INST_VALUE_OKTO_CROSS_VALUE = 9;
  /**
   * <code>EXEC_INST_VALUE_OVER_THE_DAY = 10 [(.fix.enum_value) = "4", (.fix.enum_added) = VERSION_FIX_2_7];</code>
   */
  public static final int EXEC_INST_VALUE_OVER_THE_DAY_VALUE = 10;
  /**
   * <code>EXEC_INST_VALUE_PARTICIPATE_DO_NOT_INITIATE = 11 [(.fix.enum_value) = "6", (.fix.enum_added) = VERSION_FIX_2_7];</code>
   */
  public static final int EXEC_INST_VALUE_PARTICIPATE_DO_NOT_INITIATE_VALUE = 11;
  /**
   * <code>EXEC_INST_VALUE_PERCENT_OF_VOLUME = 12 [(.fix.enum_value) = "D", (.fix.enum_added) = VERSION_FIX_2_7];</code>
   */
  public static final int EXEC_INST_VALUE_PERCENT_OF_VOLUME_VALUE = 12;
  /**
   * <code>EXEC_INST_VALUE_STAY_ON_BID_SIDE = 13 [(.fix.enum_value) = "9", (.fix.enum_added) = VERSION_FIX_2_7];</code>
   */
  public static final int EXEC_INST_VALUE_STAY_ON_BID_SIDE_VALUE = 13;
  /**
   * <code>EXEC_INST_VALUE_STAY_ON_OFFER_SIDE = 14 [(.fix.enum_value) = "0", (.fix.enum_added) = VERSION_FIX_2_7];</code>
   */
  public static final int EXEC_INST_VALUE_STAY_ON_OFFER_SIDE_VALUE = 14;
  /**
   * <code>EXEC_INST_VALUE_STRICT_SCALE = 15 [(.fix.enum_value) = "7", (.fix.enum_added) = VERSION_FIX_2_7];</code>
   */
  public static final int EXEC_INST_VALUE_STRICT_SCALE_VALUE = 15;
  /**
   * <code>EXEC_INST_VALUE_TRY_TO_SCALE = 16 [(.fix.enum_value) = "8", (.fix.enum_added) = VERSION_FIX_2_7];</code>
   */
  public static final int EXEC_INST_VALUE_TRY_TO_SCALE_VALUE = 16;
  /**
   * <code>EXEC_INST_VALUE_WORK = 17 [(.fix.enum_value) = "2", (.fix.enum_added) = VERSION_FIX_2_7];</code>
   */
  public static final int EXEC_INST_VALUE_WORK_VALUE = 17;
  /**
   * <code>EXEC_INST_VALUE_INSTITUTIONS_ONLY = 18 [(.fix.enum_value) = "I", (.fix.enum_added) = VERSION_FIX_3_0];</code>
   */
  public static final int EXEC_INST_VALUE_INSTITUTIONS_ONLY_VALUE = 18;
  /**
   * <code>EXEC_INST_VALUE_LAST_PEG = 19 [(.fix.enum_value) = "L", (.fix.enum_added) = VERSION_FIX_3_0, (.fix.enum_deprecated) = VERSION_FIX_5_0];</code>
   */
  public static final int EXEC_INST_VALUE_LAST_PEG_VALUE = 19;
  /**
   * <code>EXEC_INST_VALUE_MARKET_PEG = 20 [(.fix.enum_value) = "P", (.fix.enum_added) = VERSION_FIX_3_0, (.fix.enum_deprecated) = VERSION_FIX_5_0];</code>
   */
  public static final int EXEC_INST_VALUE_MARKET_PEG_VALUE = 20;
  /**
   * <code>EXEC_INST_VALUE_MID_PRICE_PEG = 21 [(.fix.enum_value) = "M", (.fix.enum_added) = VERSION_FIX_3_0, (.fix.enum_deprecated) = VERSION_FIX_5_0];</code>
   */
  public static final int EXEC_INST_VALUE_MID_PRICE_PEG_VALUE = 21;
  /**
   * <code>EXEC_INST_VALUE_NON_NEGOTIABLE = 22 [(.fix.enum_value) = "N", (.fix.enum_added) = VERSION_FIX_3_0];</code>
   */
  public static final int EXEC_INST_VALUE_NON_NEGOTIABLE_VALUE = 22;
  /**
   * <code>EXEC_INST_VALUE_OPENING_PEG = 23 [(.fix.enum_value) = "O", (.fix.enum_added) = VERSION_FIX_3_0, (.fix.enum_deprecated) = VERSION_FIX_5_0];</code>
   */
  public static final int EXEC_INST_VALUE_OPENING_PEG_VALUE = 23;
  /**
   * <code>EXEC_INST_VALUE_PRIMARY_PEG = 24 [(.fix.enum_value) = "R", (.fix.enum_added) = VERSION_FIX_3_0, (.fix.enum_deprecated) = VERSION_FIX_5_0];</code>
   */
  public static final int EXEC_INST_VALUE_PRIMARY_PEG_VALUE = 24;
  /**
   * <code>EXEC_INST_VALUE_SUSPEND = 25 [(.fix.enum_value) = "S", (.fix.enum_added) = VERSION_FIX_3_0];</code>
   */
  public static final int EXEC_INST_VALUE_SUSPEND_VALUE = 25;
  /**
   * <code>EXEC_INST_VALUE_CUSTOMER_DISPLAY_INSTRUCTION = 26 [(.fix.enum_value) = "U", (.fix.enum_added) = VERSION_FIX_4_1];</code>
   */
  public static final int EXEC_INST_VALUE_CUSTOMER_DISPLAY_INSTRUCTION_VALUE = 26;
  /**
   * <code>EXEC_INST_VALUE_NETTING = 27 [(.fix.enum_value) = "V", (.fix.enum_added) = VERSION_FIX_4_1];</code>
   */
  public static final int EXEC_INST_VALUE_NETTING_VALUE = 27;
  /**
   * <code>EXEC_INST_VALUE_PEG_TO_VWAP = 28 [(.fix.enum_value) = "W", (.fix.enum_added) = VERSION_FIX_4_2, (.fix.enum_deprecated) = VERSION_FIX_5_0];</code>
   */
  public static final int EXEC_INST_VALUE_PEG_TO_VWAP_VALUE = 28;
  /**
   * <code>EXEC_INST_VALUE_CANCEL_ON_SYSTEM_FAILURE = 29 [(.fix.enum_value) = "Q", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  public static final int EXEC_INST_VALUE_CANCEL_ON_SYSTEM_FAILURE_VALUE = 29;
  /**
   * <code>EXEC_INST_VALUE_CANCEL_ON_TRADING_HALT = 30 [(.fix.enum_value) = "K", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  public static final int EXEC_INST_VALUE_CANCEL_ON_TRADING_HALT_VALUE = 30;
  /**
   * <code>EXEC_INST_VALUE_REINSTATE_ON_SYSTEM_FAILURE = 31 [(.fix.enum_value) = "H", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  public static final int EXEC_INST_VALUE_REINSTATE_ON_SYSTEM_FAILURE_VALUE = 31;
  /**
   * <code>EXEC_INST_VALUE_REINSTATE_ON_TRADING_HALT = 32 [(.fix.enum_value) = "J", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  public static final int EXEC_INST_VALUE_REINSTATE_ON_TRADING_HALT_VALUE = 32;
  /**
   * <code>EXEC_INST_VALUE_TRADE_ALONG = 33 [(.fix.enum_value) = "X", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  public static final int EXEC_INST_VALUE_TRADE_ALONG_VALUE = 33;
  /**
   * <code>EXEC_INST_VALUE_TRY_TO_STOP = 34 [(.fix.enum_value) = "Y", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  public static final int EXEC_INST_VALUE_TRY_TO_STOP_VALUE = 34;
  /**
   * <code>EXEC_INST_VALUE_CANCEL_IF_NOT_BEST = 35 [(.fix.enum_value) = "Z", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int EXEC_INST_VALUE_CANCEL_IF_NOT_BEST_VALUE = 35;
  /**
   * <code>EXEC_INST_VALUE_IGNORE_PRICE_VALIDITY_CHECKS = 36 [(.fix.enum_value) = "c", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int EXEC_INST_VALUE_IGNORE_PRICE_VALIDITY_CHECKS_VALUE = 36;
  /**
   * <code>EXEC_INST_VALUE_PEG_TO_LIMIT_PRICE = 37 [(.fix.enum_value) = "d", (.fix.enum_added) = VERSION_FIX_4_4, (.fix.enum_deprecated) = VERSION_FIX_5_0];</code>
   */
  public static final int EXEC_INST_VALUE_PEG_TO_LIMIT_PRICE_VALUE = 37;
  /**
   * <code>EXEC_INST_VALUE_STRICT_LIMIT = 38 [(.fix.enum_value) = "b", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int EXEC_INST_VALUE_STRICT_LIMIT_VALUE = 38;
  /**
   * <code>EXEC_INST_VALUE_TRAILING_STOP_PEG = 39 [(.fix.enum_value) = "a", (.fix.enum_added) = VERSION_FIX_4_4, (.fix.enum_deprecated) = VERSION_FIX_5_0];</code>
   */
  public static final int EXEC_INST_VALUE_TRAILING_STOP_PEG_VALUE = 39;
  /**
   * <code>EXEC_INST_VALUE_WORK_TO_TARGET_STRATEGY = 40 [(.fix.enum_value) = "e", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int EXEC_INST_VALUE_WORK_TO_TARGET_STRATEGY_VALUE = 40;
  /**
   * <code>EXEC_INST_VALUE_INTERMARKET_SWEEP = 41 [(.fix.enum_value) = "f", (.fix.enum_added) = VERSION_FIX_4_4, (.fix.enum_added_ep) = 6];</code>
   */
  public static final int EXEC_INST_VALUE_INTERMARKET_SWEEP_VALUE = 41;
  /**
   * <code>EXEC_INST_VALUE_SINGLE_EXECUTION_REQUESTED_FOR_BLOCK_TRADE = 42 [(.fix.enum_value) = "j", (.fix.enum_added) = VERSION_FIX_4_4, (.fix.enum_added_ep) = 6];</code>
   */
  public static final int EXEC_INST_VALUE_SINGLE_EXECUTION_REQUESTED_FOR_BLOCK_TRADE_VALUE = 42;
  /**
   * <code>EXEC_INST_VALUE_EXTERNAL_ROUTING_ALLOWED = 43 [(.fix.enum_value) = "g", (.fix.enum_added) = VERSION_FIX_4_4, (.fix.enum_added_ep) = 14];</code>
   */
  public static final int EXEC_INST_VALUE_EXTERNAL_ROUTING_ALLOWED_VALUE = 43;
  /**
   * <code>EXEC_INST_VALUE_EXTERNAL_ROUTING_NOT_ALLOWED = 44 [(.fix.enum_value) = "h", (.fix.enum_added) = VERSION_FIX_4_4, (.fix.enum_added_ep) = 14];</code>
   */
  public static final int EXEC_INST_VALUE_EXTERNAL_ROUTING_NOT_ALLOWED_VALUE = 44;
  /**
   * <code>EXEC_INST_VALUE_IMBALANCE_ONLY = 45 [(.fix.enum_value) = "i", (.fix.enum_added) = VERSION_FIX_4_4, (.fix.enum_added_ep) = 22];</code>
   */
  public static final int EXEC_INST_VALUE_IMBALANCE_ONLY_VALUE = 45;
  /**
   * <code>EXEC_INST_VALUE_BEST_EXECUTION = 46 [(.fix.enum_value) = "k", (.fix.enum_added) = VERSION_FIX_4_4, (.fix.enum_added_ep) = 35];</code>
   */
  public static final int EXEC_INST_VALUE_BEST_EXECUTION_VALUE = 46;
  /**
   * <code>EXEC_INST_VALUE_FIXED_PEG_TO_LOCAL_BEST_BID_OR_OFFER_AT_TIME_OF_ORDER = 47 [(.fix.enum_value) = "T", (.fix.enum_added) = VERSION_FIX_4_4, (.fix.enum_added_ep) = 35, (.fix.enum_deprecated) = VERSION_FIX_5_0];</code>
   */
  public static final int EXEC_INST_VALUE_FIXED_PEG_TO_LOCAL_BEST_BID_OR_OFFER_AT_TIME_OF_ORDER_VALUE = 47;
  /**
   * <code>EXEC_INST_VALUE_CANCEL_ON_CONNECTION_LOSS = 48 [(.fix.enum_value) = "o", (.fix.enum_added) = VERSION_FIX_5_0, (.fix.enum_added_ep) = 58];</code>
   */
  public static final int EXEC_INST_VALUE_CANCEL_ON_CONNECTION_LOSS_VALUE = 48;
  /**
   * <code>EXEC_INST_VALUE_REINSTATE_ON_CONNECTION_LOSS = 49 [(.fix.enum_value) = "n", (.fix.enum_added) = VERSION_FIX_5_0, (.fix.enum_added_ep) = 58];</code>
   */
  public static final int EXEC_INST_VALUE_REINSTATE_ON_CONNECTION_LOSS_VALUE = 49;
  /**
   * <code>EXEC_INST_VALUE_RELEASE_FROM_SUSPENSION = 50 [(.fix.enum_value) = "q", (.fix.enum_added) = VERSION_FIX_5_0, (.fix.enum_added_ep) = 58];</code>
   */
  public static final int EXEC_INST_VALUE_RELEASE_FROM_SUSPENSION_VALUE = 50;
  /**
   * <code>EXEC_INST_VALUE_SUSPEND_ON_CONNECTION_LOSS = 51 [(.fix.enum_value) = "p", (.fix.enum_added) = VERSION_FIX_5_0, (.fix.enum_added_ep) = 58];</code>
   */
  public static final int EXEC_INST_VALUE_SUSPEND_ON_CONNECTION_LOSS_VALUE = 51;
  /**
   * <code>EXEC_INST_VALUE_SUSPEND_ON_SYSTEM_FAILURE = 52 [(.fix.enum_value) = "l", (.fix.enum_added) = VERSION_FIX_5_0, (.fix.enum_added_ep) = 58];</code>
   */
  public static final int EXEC_INST_VALUE_SUSPEND_ON_SYSTEM_FAILURE_VALUE = 52;
  /**
   * <code>EXEC_INST_VALUE_SUSPEND_ON_TRADING_HALT = 53 [(.fix.enum_value) = "m", (.fix.enum_added) = VERSION_FIX_5_0, (.fix.enum_added_ep) = 58];</code>
   */
  public static final int EXEC_INST_VALUE_SUSPEND_ON_TRADING_HALT_VALUE = 53;
  /**
   * <code>EXEC_INST_VALUE_EXECUTE_AS_DELTA_NEUTRAL = 54 [(.fix.enum_value) = "r", (.fix.enum_added) = VERSION_FIX_5_0, (.fix.enum_added_ep) = 59];</code>
   */
  public static final int EXEC_INST_VALUE_EXECUTE_AS_DELTA_NEUTRAL_VALUE = 54;
  /**
   * <code>EXEC_INST_VALUE_EXECUTE_AS_DURATION_NEUTRAL = 55 [(.fix.enum_value) = "s", (.fix.enum_added) = VERSION_FIX_5_0, (.fix.enum_added_ep) = 59];</code>
   */
  public static final int EXEC_INST_VALUE_EXECUTE_AS_DURATION_NEUTRAL_VALUE = 55;
  /**
   * <code>EXEC_INST_VALUE_EXECUTE_AS_FX_NEUTRAL = 56 [(.fix.enum_value) = "t", (.fix.enum_added) = VERSION_FIX_5_0, (.fix.enum_added_ep) = 59];</code>
   */
  public static final int EXEC_INST_VALUE_EXECUTE_AS_FX_NEUTRAL_VALUE = 56;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static ExecInstValueEnum valueOf(int value) {
    return forNumber(value);
  }

  public static ExecInstValueEnum forNumber(int value) {
    switch (value) {
      case 0: return EXEC_INST_VALUE_UNSPECIFIED;
      case 1: return EXEC_INST_VALUE_ALL_OR_NONE;
      case 2: return EXEC_INST_VALUE_CALL_FIRST;
      case 3: return EXEC_INST_VALUE_DO_NOT_INCREASE;
      case 4: return EXEC_INST_VALUE_DO_NOT_REDUCE;
      case 5: return EXEC_INST_VALUE_GO_ALONG;
      case 6: return EXEC_INST_VALUE_HELD;
      case 7: return EXEC_INST_VALUE_NOT_HELD;
      case 8: return EXEC_INST_VALUE_NO_CROSS;
      case 9: return EXEC_INST_VALUE_OKTO_CROSS;
      case 10: return EXEC_INST_VALUE_OVER_THE_DAY;
      case 11: return EXEC_INST_VALUE_PARTICIPATE_DO_NOT_INITIATE;
      case 12: return EXEC_INST_VALUE_PERCENT_OF_VOLUME;
      case 13: return EXEC_INST_VALUE_STAY_ON_BID_SIDE;
      case 14: return EXEC_INST_VALUE_STAY_ON_OFFER_SIDE;
      case 15: return EXEC_INST_VALUE_STRICT_SCALE;
      case 16: return EXEC_INST_VALUE_TRY_TO_SCALE;
      case 17: return EXEC_INST_VALUE_WORK;
      case 18: return EXEC_INST_VALUE_INSTITUTIONS_ONLY;
      case 19: return EXEC_INST_VALUE_LAST_PEG;
      case 20: return EXEC_INST_VALUE_MARKET_PEG;
      case 21: return EXEC_INST_VALUE_MID_PRICE_PEG;
      case 22: return EXEC_INST_VALUE_NON_NEGOTIABLE;
      case 23: return EXEC_INST_VALUE_OPENING_PEG;
      case 24: return EXEC_INST_VALUE_PRIMARY_PEG;
      case 25: return EXEC_INST_VALUE_SUSPEND;
      case 26: return EXEC_INST_VALUE_CUSTOMER_DISPLAY_INSTRUCTION;
      case 27: return EXEC_INST_VALUE_NETTING;
      case 28: return EXEC_INST_VALUE_PEG_TO_VWAP;
      case 29: return EXEC_INST_VALUE_CANCEL_ON_SYSTEM_FAILURE;
      case 30: return EXEC_INST_VALUE_CANCEL_ON_TRADING_HALT;
      case 31: return EXEC_INST_VALUE_REINSTATE_ON_SYSTEM_FAILURE;
      case 32: return EXEC_INST_VALUE_REINSTATE_ON_TRADING_HALT;
      case 33: return EXEC_INST_VALUE_TRADE_ALONG;
      case 34: return EXEC_INST_VALUE_TRY_TO_STOP;
      case 35: return EXEC_INST_VALUE_CANCEL_IF_NOT_BEST;
      case 36: return EXEC_INST_VALUE_IGNORE_PRICE_VALIDITY_CHECKS;
      case 37: return EXEC_INST_VALUE_PEG_TO_LIMIT_PRICE;
      case 38: return EXEC_INST_VALUE_STRICT_LIMIT;
      case 39: return EXEC_INST_VALUE_TRAILING_STOP_PEG;
      case 40: return EXEC_INST_VALUE_WORK_TO_TARGET_STRATEGY;
      case 41: return EXEC_INST_VALUE_INTERMARKET_SWEEP;
      case 42: return EXEC_INST_VALUE_SINGLE_EXECUTION_REQUESTED_FOR_BLOCK_TRADE;
      case 43: return EXEC_INST_VALUE_EXTERNAL_ROUTING_ALLOWED;
      case 44: return EXEC_INST_VALUE_EXTERNAL_ROUTING_NOT_ALLOWED;
      case 45: return EXEC_INST_VALUE_IMBALANCE_ONLY;
      case 46: return EXEC_INST_VALUE_BEST_EXECUTION;
      case 47: return EXEC_INST_VALUE_FIXED_PEG_TO_LOCAL_BEST_BID_OR_OFFER_AT_TIME_OF_ORDER;
      case 48: return EXEC_INST_VALUE_CANCEL_ON_CONNECTION_LOSS;
      case 49: return EXEC_INST_VALUE_REINSTATE_ON_CONNECTION_LOSS;
      case 50: return EXEC_INST_VALUE_RELEASE_FROM_SUSPENSION;
      case 51: return EXEC_INST_VALUE_SUSPEND_ON_CONNECTION_LOSS;
      case 52: return EXEC_INST_VALUE_SUSPEND_ON_SYSTEM_FAILURE;
      case 53: return EXEC_INST_VALUE_SUSPEND_ON_TRADING_HALT;
      case 54: return EXEC_INST_VALUE_EXECUTE_AS_DELTA_NEUTRAL;
      case 55: return EXEC_INST_VALUE_EXECUTE_AS_DURATION_NEUTRAL;
      case 56: return EXEC_INST_VALUE_EXECUTE_AS_FX_NEUTRAL;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ExecInstValueEnum>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ExecInstValueEnum> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ExecInstValueEnum>() {
          public ExecInstValueEnum findValueByNumber(int number) {
            return ExecInstValueEnum.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return org.fixprotocol.components.Common.getDescriptor().getEnumTypes().get(162);
  }

  private static final ExecInstValueEnum[] VALUES = values();

  public static ExecInstValueEnum valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private ExecInstValueEnum(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:Common.ExecInstValueEnum)
}

