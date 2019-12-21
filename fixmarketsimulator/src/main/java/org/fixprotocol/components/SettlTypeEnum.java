// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package org.fixprotocol.components;

/**
 * Protobuf enum {@code Common.SettlTypeEnum}
 */
public enum SettlTypeEnum
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>SETTL_TYPE_UNSPECIFIED = 0;</code>
   */
  SETTL_TYPE_UNSPECIFIED(0),
  /**
   * <code>SETTL_TYPE_CASH = 1 [(.fix.enum_value) = "1", (.fix.enum_added) = VERSION_FIX_2_7];</code>
   */
  SETTL_TYPE_CASH(1),
  /**
   * <code>SETTL_TYPE_FUTURE = 2 [(.fix.enum_value) = "6", (.fix.enum_added) = VERSION_FIX_2_7];</code>
   */
  SETTL_TYPE_FUTURE(2),
  /**
   * <code>SETTL_TYPE_NEXT_DAY = 3 [(.fix.enum_value) = "2", (.fix.enum_added) = VERSION_FIX_2_7];</code>
   */
  SETTL_TYPE_NEXT_DAY(3),
  /**
   * <code>SETTL_TYPE_REGULAR = 4 [(.fix.enum_value) = "0", (.fix.enum_added) = VERSION_FIX_2_7];</code>
   */
  SETTL_TYPE_REGULAR(4),
  /**
   * <code>SETTL_TYPE_SELLERS_OPTION = 5 [(.fix.enum_value) = "8", (.fix.enum_added) = VERSION_FIX_2_7];</code>
   */
  SETTL_TYPE_SELLERS_OPTION(5),
  /**
   * <code>SETTL_TYPE_TPLUS2 = 6 [(.fix.enum_value) = "3", (.fix.enum_added) = VERSION_FIX_2_7];</code>
   */
  SETTL_TYPE_TPLUS2(6),
  /**
   * <code>SETTL_TYPE_TPLUS3 = 7 [(.fix.enum_value) = "4", (.fix.enum_added) = VERSION_FIX_2_7];</code>
   */
  SETTL_TYPE_TPLUS3(7),
  /**
   * <code>SETTL_TYPE_TPLUS4 = 8 [(.fix.enum_value) = "5", (.fix.enum_added) = VERSION_FIX_2_7];</code>
   */
  SETTL_TYPE_TPLUS4(8),
  /**
   * <code>SETTL_TYPE_WHEN_AND_IF_ISSUED = 9 [(.fix.enum_value) = "7", (.fix.enum_added) = VERSION_FIX_2_7];</code>
   */
  SETTL_TYPE_WHEN_AND_IF_ISSUED(9),
  /**
   * <code>SETTL_TYPE_TPLUS5 = 10 [(.fix.enum_value) = "9", (.fix.enum_added) = VERSION_FIX_3_0];</code>
   */
  SETTL_TYPE_TPLUS5(10),
  /**
   * <code>SETTL_TYPE_FX_SPOT_NEXT_SETTLEMENT = 11 [(.fix.enum_value) = "C", (.fix.enum_added) = VERSION_FIX_4_4, (.fix.enum_added_ep) = 21];</code>
   */
  SETTL_TYPE_FX_SPOT_NEXT_SETTLEMENT(11),
  /**
   * <code>SETTL_TYPE_BROKEN_DATE = 12 [(.fix.enum_value) = "B", (.fix.enum_added) = VERSION_FIX_4_4, (.fix.enum_added_ep) = 25];</code>
   */
  SETTL_TYPE_BROKEN_DATE(12),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>SETTL_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int SETTL_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   * <code>SETTL_TYPE_CASH = 1 [(.fix.enum_value) = "1", (.fix.enum_added) = VERSION_FIX_2_7];</code>
   */
  public static final int SETTL_TYPE_CASH_VALUE = 1;
  /**
   * <code>SETTL_TYPE_FUTURE = 2 [(.fix.enum_value) = "6", (.fix.enum_added) = VERSION_FIX_2_7];</code>
   */
  public static final int SETTL_TYPE_FUTURE_VALUE = 2;
  /**
   * <code>SETTL_TYPE_NEXT_DAY = 3 [(.fix.enum_value) = "2", (.fix.enum_added) = VERSION_FIX_2_7];</code>
   */
  public static final int SETTL_TYPE_NEXT_DAY_VALUE = 3;
  /**
   * <code>SETTL_TYPE_REGULAR = 4 [(.fix.enum_value) = "0", (.fix.enum_added) = VERSION_FIX_2_7];</code>
   */
  public static final int SETTL_TYPE_REGULAR_VALUE = 4;
  /**
   * <code>SETTL_TYPE_SELLERS_OPTION = 5 [(.fix.enum_value) = "8", (.fix.enum_added) = VERSION_FIX_2_7];</code>
   */
  public static final int SETTL_TYPE_SELLERS_OPTION_VALUE = 5;
  /**
   * <code>SETTL_TYPE_TPLUS2 = 6 [(.fix.enum_value) = "3", (.fix.enum_added) = VERSION_FIX_2_7];</code>
   */
  public static final int SETTL_TYPE_TPLUS2_VALUE = 6;
  /**
   * <code>SETTL_TYPE_TPLUS3 = 7 [(.fix.enum_value) = "4", (.fix.enum_added) = VERSION_FIX_2_7];</code>
   */
  public static final int SETTL_TYPE_TPLUS3_VALUE = 7;
  /**
   * <code>SETTL_TYPE_TPLUS4 = 8 [(.fix.enum_value) = "5", (.fix.enum_added) = VERSION_FIX_2_7];</code>
   */
  public static final int SETTL_TYPE_TPLUS4_VALUE = 8;
  /**
   * <code>SETTL_TYPE_WHEN_AND_IF_ISSUED = 9 [(.fix.enum_value) = "7", (.fix.enum_added) = VERSION_FIX_2_7];</code>
   */
  public static final int SETTL_TYPE_WHEN_AND_IF_ISSUED_VALUE = 9;
  /**
   * <code>SETTL_TYPE_TPLUS5 = 10 [(.fix.enum_value) = "9", (.fix.enum_added) = VERSION_FIX_3_0];</code>
   */
  public static final int SETTL_TYPE_TPLUS5_VALUE = 10;
  /**
   * <code>SETTL_TYPE_FX_SPOT_NEXT_SETTLEMENT = 11 [(.fix.enum_value) = "C", (.fix.enum_added) = VERSION_FIX_4_4, (.fix.enum_added_ep) = 21];</code>
   */
  public static final int SETTL_TYPE_FX_SPOT_NEXT_SETTLEMENT_VALUE = 11;
  /**
   * <code>SETTL_TYPE_BROKEN_DATE = 12 [(.fix.enum_value) = "B", (.fix.enum_added) = VERSION_FIX_4_4, (.fix.enum_added_ep) = 25];</code>
   */
  public static final int SETTL_TYPE_BROKEN_DATE_VALUE = 12;


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
  public static SettlTypeEnum valueOf(int value) {
    return forNumber(value);
  }

  public static SettlTypeEnum forNumber(int value) {
    switch (value) {
      case 0: return SETTL_TYPE_UNSPECIFIED;
      case 1: return SETTL_TYPE_CASH;
      case 2: return SETTL_TYPE_FUTURE;
      case 3: return SETTL_TYPE_NEXT_DAY;
      case 4: return SETTL_TYPE_REGULAR;
      case 5: return SETTL_TYPE_SELLERS_OPTION;
      case 6: return SETTL_TYPE_TPLUS2;
      case 7: return SETTL_TYPE_TPLUS3;
      case 8: return SETTL_TYPE_TPLUS4;
      case 9: return SETTL_TYPE_WHEN_AND_IF_ISSUED;
      case 10: return SETTL_TYPE_TPLUS5;
      case 11: return SETTL_TYPE_FX_SPOT_NEXT_SETTLEMENT;
      case 12: return SETTL_TYPE_BROKEN_DATE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<SettlTypeEnum>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      SettlTypeEnum> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<SettlTypeEnum>() {
          public SettlTypeEnum findValueByNumber(int number) {
            return SettlTypeEnum.forNumber(number);
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
    return org.fixprotocol.components.Common.getDescriptor().getEnumTypes().get(106);
  }

  private static final SettlTypeEnum[] VALUES = values();

  public static SettlTypeEnum valueOf(
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

  private SettlTypeEnum(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:Common.SettlTypeEnum)
}

