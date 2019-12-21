// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package org.fixprotocol.components;

/**
 * Protobuf enum {@code Common.DiscretionLimitTypeEnum}
 */
public enum DiscretionLimitTypeEnum
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>DISCRETION_LIMIT_TYPE_UNSPECIFIED = 0;</code>
   */
  DISCRETION_LIMIT_TYPE_UNSPECIFIED(0),
  /**
   * <code>DISCRETION_LIMIT_TYPE_OR_BETTER = 1 [(.fix.enum_value) = "0", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  DISCRETION_LIMIT_TYPE_OR_BETTER(1),
  /**
   * <code>DISCRETION_LIMIT_TYPE_OR_WORSE = 2 [(.fix.enum_value) = "2", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  DISCRETION_LIMIT_TYPE_OR_WORSE(2),
  /**
   * <code>DISCRETION_LIMIT_TYPE_STRICT = 3 [(.fix.enum_value) = "1", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  DISCRETION_LIMIT_TYPE_STRICT(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>DISCRETION_LIMIT_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int DISCRETION_LIMIT_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   * <code>DISCRETION_LIMIT_TYPE_OR_BETTER = 1 [(.fix.enum_value) = "0", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int DISCRETION_LIMIT_TYPE_OR_BETTER_VALUE = 1;
  /**
   * <code>DISCRETION_LIMIT_TYPE_OR_WORSE = 2 [(.fix.enum_value) = "2", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int DISCRETION_LIMIT_TYPE_OR_WORSE_VALUE = 2;
  /**
   * <code>DISCRETION_LIMIT_TYPE_STRICT = 3 [(.fix.enum_value) = "1", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int DISCRETION_LIMIT_TYPE_STRICT_VALUE = 3;


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
  public static DiscretionLimitTypeEnum valueOf(int value) {
    return forNumber(value);
  }

  public static DiscretionLimitTypeEnum forNumber(int value) {
    switch (value) {
      case 0: return DISCRETION_LIMIT_TYPE_UNSPECIFIED;
      case 1: return DISCRETION_LIMIT_TYPE_OR_BETTER;
      case 2: return DISCRETION_LIMIT_TYPE_OR_WORSE;
      case 3: return DISCRETION_LIMIT_TYPE_STRICT;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<DiscretionLimitTypeEnum>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      DiscretionLimitTypeEnum> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<DiscretionLimitTypeEnum>() {
          public DiscretionLimitTypeEnum findValueByNumber(int number) {
            return DiscretionLimitTypeEnum.forNumber(number);
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
    return org.fixprotocol.components.Common.getDescriptor().getEnumTypes().get(5);
  }

  private static final DiscretionLimitTypeEnum[] VALUES = values();

  public static DiscretionLimitTypeEnum valueOf(
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

  private DiscretionLimitTypeEnum(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:Common.DiscretionLimitTypeEnum)
}

