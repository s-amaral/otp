// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package org.fixprotocol.components;

/**
 * Protobuf enum {@code Common.UnderlyingPriceDeterminationMethodEnum}
 */
public enum UnderlyingPriceDeterminationMethodEnum
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>UNDERLYING_PRICE_DETERMINATION_METHOD_UNSPECIFIED = 0;</code>
   */
  UNDERLYING_PRICE_DETERMINATION_METHOD_UNSPECIFIED(0),
  /**
   * <code>UNDERLYING_PRICE_DETERMINATION_METHOD_AVERAGE_VALUE = 1 [(.fix.enum_value) = "4", (.fix.enum_added) = VERSION_FIX_5_0SP1, (.fix.enum_added_ep) = 92];</code>
   */
  UNDERLYING_PRICE_DETERMINATION_METHOD_AVERAGE_VALUE(1),
  /**
   * <code>UNDERLYING_PRICE_DETERMINATION_METHOD_OPTIMAL_VALUE = 2 [(.fix.enum_value) = "3", (.fix.enum_added) = VERSION_FIX_5_0SP1, (.fix.enum_added_ep) = 92];</code>
   */
  UNDERLYING_PRICE_DETERMINATION_METHOD_OPTIMAL_VALUE(2),
  /**
   * <code>UNDERLYING_PRICE_DETERMINATION_METHOD_REGULAR = 3 [(.fix.enum_value) = "1", (.fix.enum_added) = VERSION_FIX_5_0SP1, (.fix.enum_added_ep) = 92];</code>
   */
  UNDERLYING_PRICE_DETERMINATION_METHOD_REGULAR(3),
  /**
   * <code>UNDERLYING_PRICE_DETERMINATION_METHOD_SPECIAL_REFERENCE = 4 [(.fix.enum_value) = "2", (.fix.enum_added) = VERSION_FIX_5_0SP1, (.fix.enum_added_ep) = 92];</code>
   */
  UNDERLYING_PRICE_DETERMINATION_METHOD_SPECIAL_REFERENCE(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>UNDERLYING_PRICE_DETERMINATION_METHOD_UNSPECIFIED = 0;</code>
   */
  public static final int UNDERLYING_PRICE_DETERMINATION_METHOD_UNSPECIFIED_VALUE = 0;
  /**
   * <code>UNDERLYING_PRICE_DETERMINATION_METHOD_AVERAGE_VALUE = 1 [(.fix.enum_value) = "4", (.fix.enum_added) = VERSION_FIX_5_0SP1, (.fix.enum_added_ep) = 92];</code>
   */
  public static final int UNDERLYING_PRICE_DETERMINATION_METHOD_AVERAGE_VALUE_VALUE = 1;
  /**
   * <code>UNDERLYING_PRICE_DETERMINATION_METHOD_OPTIMAL_VALUE = 2 [(.fix.enum_value) = "3", (.fix.enum_added) = VERSION_FIX_5_0SP1, (.fix.enum_added_ep) = 92];</code>
   */
  public static final int UNDERLYING_PRICE_DETERMINATION_METHOD_OPTIMAL_VALUE_VALUE = 2;
  /**
   * <code>UNDERLYING_PRICE_DETERMINATION_METHOD_REGULAR = 3 [(.fix.enum_value) = "1", (.fix.enum_added) = VERSION_FIX_5_0SP1, (.fix.enum_added_ep) = 92];</code>
   */
  public static final int UNDERLYING_PRICE_DETERMINATION_METHOD_REGULAR_VALUE = 3;
  /**
   * <code>UNDERLYING_PRICE_DETERMINATION_METHOD_SPECIAL_REFERENCE = 4 [(.fix.enum_value) = "2", (.fix.enum_added) = VERSION_FIX_5_0SP1, (.fix.enum_added_ep) = 92];</code>
   */
  public static final int UNDERLYING_PRICE_DETERMINATION_METHOD_SPECIAL_REFERENCE_VALUE = 4;


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
  public static UnderlyingPriceDeterminationMethodEnum valueOf(int value) {
    return forNumber(value);
  }

  public static UnderlyingPriceDeterminationMethodEnum forNumber(int value) {
    switch (value) {
      case 0: return UNDERLYING_PRICE_DETERMINATION_METHOD_UNSPECIFIED;
      case 1: return UNDERLYING_PRICE_DETERMINATION_METHOD_AVERAGE_VALUE;
      case 2: return UNDERLYING_PRICE_DETERMINATION_METHOD_OPTIMAL_VALUE;
      case 3: return UNDERLYING_PRICE_DETERMINATION_METHOD_REGULAR;
      case 4: return UNDERLYING_PRICE_DETERMINATION_METHOD_SPECIAL_REFERENCE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<UnderlyingPriceDeterminationMethodEnum>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      UnderlyingPriceDeterminationMethodEnum> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<UnderlyingPriceDeterminationMethodEnum>() {
          public UnderlyingPriceDeterminationMethodEnum findValueByNumber(int number) {
            return UnderlyingPriceDeterminationMethodEnum.forNumber(number);
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
    return org.fixprotocol.components.Common.getDescriptor().getEnumTypes().get(19);
  }

  private static final UnderlyingPriceDeterminationMethodEnum[] VALUES = values();

  public static UnderlyingPriceDeterminationMethodEnum valueOf(
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

  private UnderlyingPriceDeterminationMethodEnum(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:Common.UnderlyingPriceDeterminationMethodEnum)
}
