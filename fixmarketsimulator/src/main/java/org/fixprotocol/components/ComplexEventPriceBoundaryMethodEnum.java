// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package org.fixprotocol.components;

/**
 * Protobuf enum {@code Common.ComplexEventPriceBoundaryMethodEnum}
 */
public enum ComplexEventPriceBoundaryMethodEnum
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>COMPLEX_EVENT_PRICE_BOUNDARY_METHOD_UNSPECIFIED = 0;</code>
   */
  COMPLEX_EVENT_PRICE_BOUNDARY_METHOD_UNSPECIFIED(0),
  /**
   * <code>COMPLEX_EVENT_PRICE_BOUNDARY_METHOD_EQUAL_TO_COMPLEX_EVENT_PRICE = 1 [(.fix.enum_value) = "3", (.fix.enum_added) = VERSION_FIX_5_0SP1, (.fix.enum_added_ep) = 92];</code>
   */
  COMPLEX_EVENT_PRICE_BOUNDARY_METHOD_EQUAL_TO_COMPLEX_EVENT_PRICE(1),
  /**
   * <code>COMPLEX_EVENT_PRICE_BOUNDARY_METHOD_GREATER_THAN_COMPLEX_EVENT_PRICE = 2 [(.fix.enum_value) = "5", (.fix.enum_added) = VERSION_FIX_5_0SP1, (.fix.enum_added_ep) = 92];</code>
   */
  COMPLEX_EVENT_PRICE_BOUNDARY_METHOD_GREATER_THAN_COMPLEX_EVENT_PRICE(2),
  /**
   * <code>COMPLEX_EVENT_PRICE_BOUNDARY_METHOD_GREATER_THAN_OR_EQUAL_TO_COMPLEX_EVENT_PRICE = 3 [(.fix.enum_value) = "4", (.fix.enum_added) = VERSION_FIX_5_0SP1, (.fix.enum_added_ep) = 92];</code>
   */
  COMPLEX_EVENT_PRICE_BOUNDARY_METHOD_GREATER_THAN_OR_EQUAL_TO_COMPLEX_EVENT_PRICE(3),
  /**
   * <code>COMPLEX_EVENT_PRICE_BOUNDARY_METHOD_LESS_THAN_COMPLEX_EVENT_PRICE = 4 [(.fix.enum_value) = "1", (.fix.enum_added) = VERSION_FIX_5_0SP1, (.fix.enum_added_ep) = 92];</code>
   */
  COMPLEX_EVENT_PRICE_BOUNDARY_METHOD_LESS_THAN_COMPLEX_EVENT_PRICE(4),
  /**
   * <code>COMPLEX_EVENT_PRICE_BOUNDARY_METHOD_LESS_THAN_OR_EQUAL_TO_COMPLEX_EVENT_PRICE = 5 [(.fix.enum_value) = "2", (.fix.enum_added) = VERSION_FIX_5_0SP1, (.fix.enum_added_ep) = 92];</code>
   */
  COMPLEX_EVENT_PRICE_BOUNDARY_METHOD_LESS_THAN_OR_EQUAL_TO_COMPLEX_EVENT_PRICE(5),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>COMPLEX_EVENT_PRICE_BOUNDARY_METHOD_UNSPECIFIED = 0;</code>
   */
  public static final int COMPLEX_EVENT_PRICE_BOUNDARY_METHOD_UNSPECIFIED_VALUE = 0;
  /**
   * <code>COMPLEX_EVENT_PRICE_BOUNDARY_METHOD_EQUAL_TO_COMPLEX_EVENT_PRICE = 1 [(.fix.enum_value) = "3", (.fix.enum_added) = VERSION_FIX_5_0SP1, (.fix.enum_added_ep) = 92];</code>
   */
  public static final int COMPLEX_EVENT_PRICE_BOUNDARY_METHOD_EQUAL_TO_COMPLEX_EVENT_PRICE_VALUE = 1;
  /**
   * <code>COMPLEX_EVENT_PRICE_BOUNDARY_METHOD_GREATER_THAN_COMPLEX_EVENT_PRICE = 2 [(.fix.enum_value) = "5", (.fix.enum_added) = VERSION_FIX_5_0SP1, (.fix.enum_added_ep) = 92];</code>
   */
  public static final int COMPLEX_EVENT_PRICE_BOUNDARY_METHOD_GREATER_THAN_COMPLEX_EVENT_PRICE_VALUE = 2;
  /**
   * <code>COMPLEX_EVENT_PRICE_BOUNDARY_METHOD_GREATER_THAN_OR_EQUAL_TO_COMPLEX_EVENT_PRICE = 3 [(.fix.enum_value) = "4", (.fix.enum_added) = VERSION_FIX_5_0SP1, (.fix.enum_added_ep) = 92];</code>
   */
  public static final int COMPLEX_EVENT_PRICE_BOUNDARY_METHOD_GREATER_THAN_OR_EQUAL_TO_COMPLEX_EVENT_PRICE_VALUE = 3;
  /**
   * <code>COMPLEX_EVENT_PRICE_BOUNDARY_METHOD_LESS_THAN_COMPLEX_EVENT_PRICE = 4 [(.fix.enum_value) = "1", (.fix.enum_added) = VERSION_FIX_5_0SP1, (.fix.enum_added_ep) = 92];</code>
   */
  public static final int COMPLEX_EVENT_PRICE_BOUNDARY_METHOD_LESS_THAN_COMPLEX_EVENT_PRICE_VALUE = 4;
  /**
   * <code>COMPLEX_EVENT_PRICE_BOUNDARY_METHOD_LESS_THAN_OR_EQUAL_TO_COMPLEX_EVENT_PRICE = 5 [(.fix.enum_value) = "2", (.fix.enum_added) = VERSION_FIX_5_0SP1, (.fix.enum_added_ep) = 92];</code>
   */
  public static final int COMPLEX_EVENT_PRICE_BOUNDARY_METHOD_LESS_THAN_OR_EQUAL_TO_COMPLEX_EVENT_PRICE_VALUE = 5;


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
  public static ComplexEventPriceBoundaryMethodEnum valueOf(int value) {
    return forNumber(value);
  }

  public static ComplexEventPriceBoundaryMethodEnum forNumber(int value) {
    switch (value) {
      case 0: return COMPLEX_EVENT_PRICE_BOUNDARY_METHOD_UNSPECIFIED;
      case 1: return COMPLEX_EVENT_PRICE_BOUNDARY_METHOD_EQUAL_TO_COMPLEX_EVENT_PRICE;
      case 2: return COMPLEX_EVENT_PRICE_BOUNDARY_METHOD_GREATER_THAN_COMPLEX_EVENT_PRICE;
      case 3: return COMPLEX_EVENT_PRICE_BOUNDARY_METHOD_GREATER_THAN_OR_EQUAL_TO_COMPLEX_EVENT_PRICE;
      case 4: return COMPLEX_EVENT_PRICE_BOUNDARY_METHOD_LESS_THAN_COMPLEX_EVENT_PRICE;
      case 5: return COMPLEX_EVENT_PRICE_BOUNDARY_METHOD_LESS_THAN_OR_EQUAL_TO_COMPLEX_EVENT_PRICE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ComplexEventPriceBoundaryMethodEnum>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ComplexEventPriceBoundaryMethodEnum> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ComplexEventPriceBoundaryMethodEnum>() {
          public ComplexEventPriceBoundaryMethodEnum findValueByNumber(int number) {
            return ComplexEventPriceBoundaryMethodEnum.forNumber(number);
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
    return org.fixprotocol.components.Common.getDescriptor().getEnumTypes().get(204);
  }

  private static final ComplexEventPriceBoundaryMethodEnum[] VALUES = values();

  public static ComplexEventPriceBoundaryMethodEnum valueOf(
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

  private ComplexEventPriceBoundaryMethodEnum(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:Common.ComplexEventPriceBoundaryMethodEnum)
}
