// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package org.fixprotocol.components;

/**
 * Protobuf enum {@code Common.RoundingDirectionEnum}
 */
public enum RoundingDirectionEnum
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>ROUNDING_DIRECTION_UNSPECIFIED = 0;</code>
   */
  ROUNDING_DIRECTION_UNSPECIFIED(0),
  /**
   * <code>ROUNDING_DIRECTION_ROUND_DOWN = 1 [(.fix.enum_value) = "1", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  ROUNDING_DIRECTION_ROUND_DOWN(1),
  /**
   * <code>ROUNDING_DIRECTION_ROUND_TO_NEAREST = 2 [(.fix.enum_value) = "0", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  ROUNDING_DIRECTION_ROUND_TO_NEAREST(2),
  /**
   * <code>ROUNDING_DIRECTION_ROUND_UP = 3 [(.fix.enum_value) = "2", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  ROUNDING_DIRECTION_ROUND_UP(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>ROUNDING_DIRECTION_UNSPECIFIED = 0;</code>
   */
  public static final int ROUNDING_DIRECTION_UNSPECIFIED_VALUE = 0;
  /**
   * <code>ROUNDING_DIRECTION_ROUND_DOWN = 1 [(.fix.enum_value) = "1", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  public static final int ROUNDING_DIRECTION_ROUND_DOWN_VALUE = 1;
  /**
   * <code>ROUNDING_DIRECTION_ROUND_TO_NEAREST = 2 [(.fix.enum_value) = "0", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  public static final int ROUNDING_DIRECTION_ROUND_TO_NEAREST_VALUE = 2;
  /**
   * <code>ROUNDING_DIRECTION_ROUND_UP = 3 [(.fix.enum_value) = "2", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  public static final int ROUNDING_DIRECTION_ROUND_UP_VALUE = 3;


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
  public static RoundingDirectionEnum valueOf(int value) {
    return forNumber(value);
  }

  public static RoundingDirectionEnum forNumber(int value) {
    switch (value) {
      case 0: return ROUNDING_DIRECTION_UNSPECIFIED;
      case 1: return ROUNDING_DIRECTION_ROUND_DOWN;
      case 2: return ROUNDING_DIRECTION_ROUND_TO_NEAREST;
      case 3: return ROUNDING_DIRECTION_ROUND_UP;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<RoundingDirectionEnum>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      RoundingDirectionEnum> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<RoundingDirectionEnum>() {
          public RoundingDirectionEnum findValueByNumber(int number) {
            return RoundingDirectionEnum.forNumber(number);
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
    return org.fixprotocol.components.Common.getDescriptor().getEnumTypes().get(49);
  }

  private static final RoundingDirectionEnum[] VALUES = values();

  public static RoundingDirectionEnum valueOf(
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

  private RoundingDirectionEnum(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:Common.RoundingDirectionEnum)
}
