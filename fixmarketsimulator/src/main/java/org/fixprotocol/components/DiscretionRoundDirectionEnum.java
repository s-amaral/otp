// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package org.fixprotocol.components;

/**
 * Protobuf enum {@code Common.DiscretionRoundDirectionEnum}
 */
public enum DiscretionRoundDirectionEnum
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>DISCRETION_ROUND_DIRECTION_UNSPECIFIED = 0;</code>
   */
  DISCRETION_ROUND_DIRECTION_UNSPECIFIED(0),
  /**
   * <code>DISCRETION_ROUND_DIRECTION_MORE_AGGRESSIVE = 1 [(.fix.enum_value) = "1", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  DISCRETION_ROUND_DIRECTION_MORE_AGGRESSIVE(1),
  /**
   * <code>DISCRETION_ROUND_DIRECTION_MORE_PASSIVE = 2 [(.fix.enum_value) = "2", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  DISCRETION_ROUND_DIRECTION_MORE_PASSIVE(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>DISCRETION_ROUND_DIRECTION_UNSPECIFIED = 0;</code>
   */
  public static final int DISCRETION_ROUND_DIRECTION_UNSPECIFIED_VALUE = 0;
  /**
   * <code>DISCRETION_ROUND_DIRECTION_MORE_AGGRESSIVE = 1 [(.fix.enum_value) = "1", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int DISCRETION_ROUND_DIRECTION_MORE_AGGRESSIVE_VALUE = 1;
  /**
   * <code>DISCRETION_ROUND_DIRECTION_MORE_PASSIVE = 2 [(.fix.enum_value) = "2", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int DISCRETION_ROUND_DIRECTION_MORE_PASSIVE_VALUE = 2;


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
  public static DiscretionRoundDirectionEnum valueOf(int value) {
    return forNumber(value);
  }

  public static DiscretionRoundDirectionEnum forNumber(int value) {
    switch (value) {
      case 0: return DISCRETION_ROUND_DIRECTION_UNSPECIFIED;
      case 1: return DISCRETION_ROUND_DIRECTION_MORE_AGGRESSIVE;
      case 2: return DISCRETION_ROUND_DIRECTION_MORE_PASSIVE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<DiscretionRoundDirectionEnum>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      DiscretionRoundDirectionEnum> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<DiscretionRoundDirectionEnum>() {
          public DiscretionRoundDirectionEnum findValueByNumber(int number) {
            return DiscretionRoundDirectionEnum.forNumber(number);
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
    return org.fixprotocol.components.Common.getDescriptor().getEnumTypes().get(6);
  }

  private static final DiscretionRoundDirectionEnum[] VALUES = values();

  public static DiscretionRoundDirectionEnum valueOf(
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

  private DiscretionRoundDirectionEnum(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:Common.DiscretionRoundDirectionEnum)
}

