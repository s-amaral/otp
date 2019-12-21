// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package org.fixprotocol.components;

/**
 * Protobuf enum {@code Common.UnderlyingTimeUnitEnum}
 */
public enum UnderlyingTimeUnitEnum
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>UNDERLYING_TIME_UNIT_UNSPECIFIED = 0;</code>
   */
  UNDERLYING_TIME_UNIT_UNSPECIFIED(0),
  /**
   * <code>UNDERLYING_TIME_UNIT_DAY = 1 [(.fix.enum_value) = "D", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  UNDERLYING_TIME_UNIT_DAY(1),
  /**
   * <code>UNDERLYING_TIME_UNIT_HOUR = 2 [(.fix.enum_value) = "H", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  UNDERLYING_TIME_UNIT_HOUR(2),
  /**
   * <code>UNDERLYING_TIME_UNIT_MINUTE = 3 [(.fix.enum_value) = "Min", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  UNDERLYING_TIME_UNIT_MINUTE(3),
  /**
   * <code>UNDERLYING_TIME_UNIT_MONTH = 4 [(.fix.enum_value) = "Mo", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  UNDERLYING_TIME_UNIT_MONTH(4),
  /**
   * <code>UNDERLYING_TIME_UNIT_SECOND = 5 [(.fix.enum_value) = "S", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  UNDERLYING_TIME_UNIT_SECOND(5),
  /**
   * <code>UNDERLYING_TIME_UNIT_WEEK = 6 [(.fix.enum_value) = "Wk", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  UNDERLYING_TIME_UNIT_WEEK(6),
  /**
   * <code>UNDERLYING_TIME_UNIT_YEAR = 7 [(.fix.enum_value) = "Yr", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  UNDERLYING_TIME_UNIT_YEAR(7),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>UNDERLYING_TIME_UNIT_UNSPECIFIED = 0;</code>
   */
  public static final int UNDERLYING_TIME_UNIT_UNSPECIFIED_VALUE = 0;
  /**
   * <code>UNDERLYING_TIME_UNIT_DAY = 1 [(.fix.enum_value) = "D", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int UNDERLYING_TIME_UNIT_DAY_VALUE = 1;
  /**
   * <code>UNDERLYING_TIME_UNIT_HOUR = 2 [(.fix.enum_value) = "H", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int UNDERLYING_TIME_UNIT_HOUR_VALUE = 2;
  /**
   * <code>UNDERLYING_TIME_UNIT_MINUTE = 3 [(.fix.enum_value) = "Min", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int UNDERLYING_TIME_UNIT_MINUTE_VALUE = 3;
  /**
   * <code>UNDERLYING_TIME_UNIT_MONTH = 4 [(.fix.enum_value) = "Mo", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int UNDERLYING_TIME_UNIT_MONTH_VALUE = 4;
  /**
   * <code>UNDERLYING_TIME_UNIT_SECOND = 5 [(.fix.enum_value) = "S", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int UNDERLYING_TIME_UNIT_SECOND_VALUE = 5;
  /**
   * <code>UNDERLYING_TIME_UNIT_WEEK = 6 [(.fix.enum_value) = "Wk", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int UNDERLYING_TIME_UNIT_WEEK_VALUE = 6;
  /**
   * <code>UNDERLYING_TIME_UNIT_YEAR = 7 [(.fix.enum_value) = "Yr", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int UNDERLYING_TIME_UNIT_YEAR_VALUE = 7;


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
  public static UnderlyingTimeUnitEnum valueOf(int value) {
    return forNumber(value);
  }

  public static UnderlyingTimeUnitEnum forNumber(int value) {
    switch (value) {
      case 0: return UNDERLYING_TIME_UNIT_UNSPECIFIED;
      case 1: return UNDERLYING_TIME_UNIT_DAY;
      case 2: return UNDERLYING_TIME_UNIT_HOUR;
      case 3: return UNDERLYING_TIME_UNIT_MINUTE;
      case 4: return UNDERLYING_TIME_UNIT_MONTH;
      case 5: return UNDERLYING_TIME_UNIT_SECOND;
      case 6: return UNDERLYING_TIME_UNIT_WEEK;
      case 7: return UNDERLYING_TIME_UNIT_YEAR;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<UnderlyingTimeUnitEnum>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      UnderlyingTimeUnitEnum> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<UnderlyingTimeUnitEnum>() {
          public UnderlyingTimeUnitEnum findValueByNumber(int number) {
            return UnderlyingTimeUnitEnum.forNumber(number);
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
    return org.fixprotocol.components.Common.getDescriptor().getEnumTypes().get(84);
  }

  private static final UnderlyingTimeUnitEnum[] VALUES = values();

  public static UnderlyingTimeUnitEnum valueOf(
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

  private UnderlyingTimeUnitEnum(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:Common.UnderlyingTimeUnitEnum)
}

