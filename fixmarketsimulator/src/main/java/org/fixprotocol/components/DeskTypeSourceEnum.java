// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package org.fixprotocol.components;

/**
 * Protobuf enum {@code Common.DeskTypeSourceEnum}
 */
public enum DeskTypeSourceEnum
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>DESK_TYPE_SOURCE_UNSPECIFIED = 0;</code>
   */
  DESK_TYPE_SOURCE_UNSPECIFIED(0),
  /**
   * <code>DESK_TYPE_SOURCE_NASDOATS = 1 [(.fix.enum_value) = "1", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  DESK_TYPE_SOURCE_NASDOATS(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>DESK_TYPE_SOURCE_UNSPECIFIED = 0;</code>
   */
  public static final int DESK_TYPE_SOURCE_UNSPECIFIED_VALUE = 0;
  /**
   * <code>DESK_TYPE_SOURCE_NASDOATS = 1 [(.fix.enum_value) = "1", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int DESK_TYPE_SOURCE_NASDOATS_VALUE = 1;


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
  public static DeskTypeSourceEnum valueOf(int value) {
    return forNumber(value);
  }

  public static DeskTypeSourceEnum forNumber(int value) {
    switch (value) {
      case 0: return DESK_TYPE_SOURCE_UNSPECIFIED;
      case 1: return DESK_TYPE_SOURCE_NASDOATS;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<DeskTypeSourceEnum>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      DeskTypeSourceEnum> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<DeskTypeSourceEnum>() {
          public DeskTypeSourceEnum findValueByNumber(int number) {
            return DeskTypeSourceEnum.forNumber(number);
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
    return org.fixprotocol.components.Common.getDescriptor().getEnumTypes().get(72);
  }

  private static final DeskTypeSourceEnum[] VALUES = values();

  public static DeskTypeSourceEnum valueOf(
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

  private DeskTypeSourceEnum(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:Common.DeskTypeSourceEnum)
}

