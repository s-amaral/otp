// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package org.fixprotocol.components;

/**
 * Protobuf enum {@code Common.DeskOrderHandlingInstEnum}
 */
public enum DeskOrderHandlingInstEnum
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>DESK_ORDER_HANDLING_INST_UNSPECIFIED = 0;</code>
   */
  DESK_ORDER_HANDLING_INST_UNSPECIFIED(0),
  /**
   * <code>DESK_ORDER_HANDLING_INST_ADD_ON_ORDER = 1 [(.fix.enum_value) = "ADD", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  DESK_ORDER_HANDLING_INST_ADD_ON_ORDER(1),
  /**
   * <code>DESK_ORDER_HANDLING_INST_ALL_OR_NONE = 2 [(.fix.enum_value) = "AON", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  DESK_ORDER_HANDLING_INST_ALL_OR_NONE(2),
  /**
   * <code>DESK_ORDER_HANDLING_INST_CASH_NOT_HELD = 3 [(.fix.enum_value) = "CNH", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  DESK_ORDER_HANDLING_INST_CASH_NOT_HELD(3),
  /**
   * <code>DESK_ORDER_HANDLING_INST_DIRECTED_ORDER = 4 [(.fix.enum_value) = "DIR", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  DESK_ORDER_HANDLING_INST_DIRECTED_ORDER(4),
  /**
   * <code>DESK_ORDER_HANDLING_INST_EXCHANGE_FOR_PHYSICAL_TRANSACTION = 5 [(.fix.enum_value) = "E.W", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  DESK_ORDER_HANDLING_INST_EXCHANGE_FOR_PHYSICAL_TRANSACTION(5),
  /**
   * <code>DESK_ORDER_HANDLING_INST_FILL_OR_KILL = 6 [(.fix.enum_value) = "FOK", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  DESK_ORDER_HANDLING_INST_FILL_OR_KILL(6),
  /**
   * <code>DESK_ORDER_HANDLING_INST_IMBALANCE_ONLY = 7 [(.fix.enum_value) = "IO", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  DESK_ORDER_HANDLING_INST_IMBALANCE_ONLY(7),
  /**
   * <code>DESK_ORDER_HANDLING_INST_IMMEDIATE_OR_CANCEL = 8 [(.fix.enum_value) = "IOC", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  DESK_ORDER_HANDLING_INST_IMMEDIATE_OR_CANCEL(8),
  /**
   * <code>DESK_ORDER_HANDLING_INST_LIMIT_ON_CLOSE = 9 [(.fix.enum_value) = "LOC", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  DESK_ORDER_HANDLING_INST_LIMIT_ON_CLOSE(9),
  /**
   * <code>DESK_ORDER_HANDLING_INST_LIMIT_ON_OPEN = 10 [(.fix.enum_value) = "LOO", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  DESK_ORDER_HANDLING_INST_LIMIT_ON_OPEN(10),
  /**
   * <code>DESK_ORDER_HANDLING_INST_MARKET_AT_CLOSE = 11 [(.fix.enum_value) = "MAC", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  DESK_ORDER_HANDLING_INST_MARKET_AT_CLOSE(11),
  /**
   * <code>DESK_ORDER_HANDLING_INST_MARKET_AT_OPEN = 12 [(.fix.enum_value) = "MAO", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  DESK_ORDER_HANDLING_INST_MARKET_AT_OPEN(12),
  /**
   * <code>DESK_ORDER_HANDLING_INST_MARKET_ON_CLOSE = 13 [(.fix.enum_value) = "MOC", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  DESK_ORDER_HANDLING_INST_MARKET_ON_CLOSE(13),
  /**
   * <code>DESK_ORDER_HANDLING_INST_MARKET_ON_OPEN = 14 [(.fix.enum_value) = "MOO", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  DESK_ORDER_HANDLING_INST_MARKET_ON_OPEN(14),
  /**
   * <code>DESK_ORDER_HANDLING_INST_MINIMUM_QUANTITY = 15 [(.fix.enum_value) = "MQT", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  DESK_ORDER_HANDLING_INST_MINIMUM_QUANTITY(15),
  /**
   * <code>DESK_ORDER_HANDLING_INST_NOT_HELD = 16 [(.fix.enum_value) = "NH", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  DESK_ORDER_HANDLING_INST_NOT_HELD(16),
  /**
   * <code>DESK_ORDER_HANDLING_INST_OVER_THE_DAY = 17 [(.fix.enum_value) = "OVD", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  DESK_ORDER_HANDLING_INST_OVER_THE_DAY(17),
  /**
   * <code>DESK_ORDER_HANDLING_INST_PEGGED = 18 [(.fix.enum_value) = "PEG", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  DESK_ORDER_HANDLING_INST_PEGGED(18),
  /**
   * <code>DESK_ORDER_HANDLING_INST_RESERVE_SIZE_ORDER = 19 [(.fix.enum_value) = "RSV", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  DESK_ORDER_HANDLING_INST_RESERVE_SIZE_ORDER(19),
  /**
   * <code>DESK_ORDER_HANDLING_INST_SCALE = 20 [(.fix.enum_value) = "SCL", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  DESK_ORDER_HANDLING_INST_SCALE(20),
  /**
   * <code>DESK_ORDER_HANDLING_INST_STOP_STOCK_TRANSACTION = 21 [(.fix.enum_value) = "S.W", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  DESK_ORDER_HANDLING_INST_STOP_STOCK_TRANSACTION(21),
  /**
   * <code>DESK_ORDER_HANDLING_INST_TIME_ORDER = 22 [(.fix.enum_value) = "TMO", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  DESK_ORDER_HANDLING_INST_TIME_ORDER(22),
  /**
   * <code>DESK_ORDER_HANDLING_INST_TRAILING_STOP = 23 [(.fix.enum_value) = "TS", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  DESK_ORDER_HANDLING_INST_TRAILING_STOP(23),
  /**
   * <code>DESK_ORDER_HANDLING_INST_WORK = 24 [(.fix.enum_value) = "WRK", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  DESK_ORDER_HANDLING_INST_WORK(24),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>DESK_ORDER_HANDLING_INST_UNSPECIFIED = 0;</code>
   */
  public static final int DESK_ORDER_HANDLING_INST_UNSPECIFIED_VALUE = 0;
  /**
   * <code>DESK_ORDER_HANDLING_INST_ADD_ON_ORDER = 1 [(.fix.enum_value) = "ADD", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int DESK_ORDER_HANDLING_INST_ADD_ON_ORDER_VALUE = 1;
  /**
   * <code>DESK_ORDER_HANDLING_INST_ALL_OR_NONE = 2 [(.fix.enum_value) = "AON", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int DESK_ORDER_HANDLING_INST_ALL_OR_NONE_VALUE = 2;
  /**
   * <code>DESK_ORDER_HANDLING_INST_CASH_NOT_HELD = 3 [(.fix.enum_value) = "CNH", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int DESK_ORDER_HANDLING_INST_CASH_NOT_HELD_VALUE = 3;
  /**
   * <code>DESK_ORDER_HANDLING_INST_DIRECTED_ORDER = 4 [(.fix.enum_value) = "DIR", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int DESK_ORDER_HANDLING_INST_DIRECTED_ORDER_VALUE = 4;
  /**
   * <code>DESK_ORDER_HANDLING_INST_EXCHANGE_FOR_PHYSICAL_TRANSACTION = 5 [(.fix.enum_value) = "E.W", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int DESK_ORDER_HANDLING_INST_EXCHANGE_FOR_PHYSICAL_TRANSACTION_VALUE = 5;
  /**
   * <code>DESK_ORDER_HANDLING_INST_FILL_OR_KILL = 6 [(.fix.enum_value) = "FOK", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int DESK_ORDER_HANDLING_INST_FILL_OR_KILL_VALUE = 6;
  /**
   * <code>DESK_ORDER_HANDLING_INST_IMBALANCE_ONLY = 7 [(.fix.enum_value) = "IO", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int DESK_ORDER_HANDLING_INST_IMBALANCE_ONLY_VALUE = 7;
  /**
   * <code>DESK_ORDER_HANDLING_INST_IMMEDIATE_OR_CANCEL = 8 [(.fix.enum_value) = "IOC", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int DESK_ORDER_HANDLING_INST_IMMEDIATE_OR_CANCEL_VALUE = 8;
  /**
   * <code>DESK_ORDER_HANDLING_INST_LIMIT_ON_CLOSE = 9 [(.fix.enum_value) = "LOC", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int DESK_ORDER_HANDLING_INST_LIMIT_ON_CLOSE_VALUE = 9;
  /**
   * <code>DESK_ORDER_HANDLING_INST_LIMIT_ON_OPEN = 10 [(.fix.enum_value) = "LOO", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int DESK_ORDER_HANDLING_INST_LIMIT_ON_OPEN_VALUE = 10;
  /**
   * <code>DESK_ORDER_HANDLING_INST_MARKET_AT_CLOSE = 11 [(.fix.enum_value) = "MAC", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int DESK_ORDER_HANDLING_INST_MARKET_AT_CLOSE_VALUE = 11;
  /**
   * <code>DESK_ORDER_HANDLING_INST_MARKET_AT_OPEN = 12 [(.fix.enum_value) = "MAO", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int DESK_ORDER_HANDLING_INST_MARKET_AT_OPEN_VALUE = 12;
  /**
   * <code>DESK_ORDER_HANDLING_INST_MARKET_ON_CLOSE = 13 [(.fix.enum_value) = "MOC", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int DESK_ORDER_HANDLING_INST_MARKET_ON_CLOSE_VALUE = 13;
  /**
   * <code>DESK_ORDER_HANDLING_INST_MARKET_ON_OPEN = 14 [(.fix.enum_value) = "MOO", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int DESK_ORDER_HANDLING_INST_MARKET_ON_OPEN_VALUE = 14;
  /**
   * <code>DESK_ORDER_HANDLING_INST_MINIMUM_QUANTITY = 15 [(.fix.enum_value) = "MQT", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int DESK_ORDER_HANDLING_INST_MINIMUM_QUANTITY_VALUE = 15;
  /**
   * <code>DESK_ORDER_HANDLING_INST_NOT_HELD = 16 [(.fix.enum_value) = "NH", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int DESK_ORDER_HANDLING_INST_NOT_HELD_VALUE = 16;
  /**
   * <code>DESK_ORDER_HANDLING_INST_OVER_THE_DAY = 17 [(.fix.enum_value) = "OVD", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int DESK_ORDER_HANDLING_INST_OVER_THE_DAY_VALUE = 17;
  /**
   * <code>DESK_ORDER_HANDLING_INST_PEGGED = 18 [(.fix.enum_value) = "PEG", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int DESK_ORDER_HANDLING_INST_PEGGED_VALUE = 18;
  /**
   * <code>DESK_ORDER_HANDLING_INST_RESERVE_SIZE_ORDER = 19 [(.fix.enum_value) = "RSV", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int DESK_ORDER_HANDLING_INST_RESERVE_SIZE_ORDER_VALUE = 19;
  /**
   * <code>DESK_ORDER_HANDLING_INST_SCALE = 20 [(.fix.enum_value) = "SCL", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int DESK_ORDER_HANDLING_INST_SCALE_VALUE = 20;
  /**
   * <code>DESK_ORDER_HANDLING_INST_STOP_STOCK_TRANSACTION = 21 [(.fix.enum_value) = "S.W", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int DESK_ORDER_HANDLING_INST_STOP_STOCK_TRANSACTION_VALUE = 21;
  /**
   * <code>DESK_ORDER_HANDLING_INST_TIME_ORDER = 22 [(.fix.enum_value) = "TMO", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int DESK_ORDER_HANDLING_INST_TIME_ORDER_VALUE = 22;
  /**
   * <code>DESK_ORDER_HANDLING_INST_TRAILING_STOP = 23 [(.fix.enum_value) = "TS", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int DESK_ORDER_HANDLING_INST_TRAILING_STOP_VALUE = 23;
  /**
   * <code>DESK_ORDER_HANDLING_INST_WORK = 24 [(.fix.enum_value) = "WRK", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int DESK_ORDER_HANDLING_INST_WORK_VALUE = 24;


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
  public static DeskOrderHandlingInstEnum valueOf(int value) {
    return forNumber(value);
  }

  public static DeskOrderHandlingInstEnum forNumber(int value) {
    switch (value) {
      case 0: return DESK_ORDER_HANDLING_INST_UNSPECIFIED;
      case 1: return DESK_ORDER_HANDLING_INST_ADD_ON_ORDER;
      case 2: return DESK_ORDER_HANDLING_INST_ALL_OR_NONE;
      case 3: return DESK_ORDER_HANDLING_INST_CASH_NOT_HELD;
      case 4: return DESK_ORDER_HANDLING_INST_DIRECTED_ORDER;
      case 5: return DESK_ORDER_HANDLING_INST_EXCHANGE_FOR_PHYSICAL_TRANSACTION;
      case 6: return DESK_ORDER_HANDLING_INST_FILL_OR_KILL;
      case 7: return DESK_ORDER_HANDLING_INST_IMBALANCE_ONLY;
      case 8: return DESK_ORDER_HANDLING_INST_IMMEDIATE_OR_CANCEL;
      case 9: return DESK_ORDER_HANDLING_INST_LIMIT_ON_CLOSE;
      case 10: return DESK_ORDER_HANDLING_INST_LIMIT_ON_OPEN;
      case 11: return DESK_ORDER_HANDLING_INST_MARKET_AT_CLOSE;
      case 12: return DESK_ORDER_HANDLING_INST_MARKET_AT_OPEN;
      case 13: return DESK_ORDER_HANDLING_INST_MARKET_ON_CLOSE;
      case 14: return DESK_ORDER_HANDLING_INST_MARKET_ON_OPEN;
      case 15: return DESK_ORDER_HANDLING_INST_MINIMUM_QUANTITY;
      case 16: return DESK_ORDER_HANDLING_INST_NOT_HELD;
      case 17: return DESK_ORDER_HANDLING_INST_OVER_THE_DAY;
      case 18: return DESK_ORDER_HANDLING_INST_PEGGED;
      case 19: return DESK_ORDER_HANDLING_INST_RESERVE_SIZE_ORDER;
      case 20: return DESK_ORDER_HANDLING_INST_SCALE;
      case 21: return DESK_ORDER_HANDLING_INST_STOP_STOCK_TRANSACTION;
      case 22: return DESK_ORDER_HANDLING_INST_TIME_ORDER;
      case 23: return DESK_ORDER_HANDLING_INST_TRAILING_STOP;
      case 24: return DESK_ORDER_HANDLING_INST_WORK;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<DeskOrderHandlingInstEnum>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      DeskOrderHandlingInstEnum> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<DeskOrderHandlingInstEnum>() {
          public DeskOrderHandlingInstEnum findValueByNumber(int number) {
            return DeskOrderHandlingInstEnum.forNumber(number);
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
    return org.fixprotocol.components.Common.getDescriptor().getEnumTypes().get(73);
  }

  private static final DeskOrderHandlingInstEnum[] VALUES = values();

  public static DeskOrderHandlingInstEnum valueOf(
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

  private DeskOrderHandlingInstEnum(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:Common.DeskOrderHandlingInstEnum)
}

