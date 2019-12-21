// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package org.fixprotocol.components;

/**
 * Protobuf enum {@code Common.DisplayWhenEnum}
 */
public enum DisplayWhenEnum
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>DISPLAY_WHEN_UNSPECIFIED = 0;</code>
   */
  DISPLAY_WHEN_UNSPECIFIED(0),
  /**
   * <code>DISPLAY_WHEN_EXHAUST = 1 [(.fix.enum_value) = "2", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  DISPLAY_WHEN_EXHAUST(1),
  /**
   * <code>DISPLAY_WHEN_IMMEDIATE = 2 [(.fix.enum_value) = "1", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  DISPLAY_WHEN_IMMEDIATE(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>DISPLAY_WHEN_UNSPECIFIED = 0;</code>
   */
  public static final int DISPLAY_WHEN_UNSPECIFIED_VALUE = 0;
  /**
   * <code>DISPLAY_WHEN_EXHAUST = 1 [(.fix.enum_value) = "2", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int DISPLAY_WHEN_EXHAUST_VALUE = 1;
  /**
   * <code>DISPLAY_WHEN_IMMEDIATE = 2 [(.fix.enum_value) = "1", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int DISPLAY_WHEN_IMMEDIATE_VALUE = 2;


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
  public static DisplayWhenEnum valueOf(int value) {
    return forNumber(value);
  }

  public static DisplayWhenEnum forNumber(int value) {
    switch (value) {
      case 0: return DISPLAY_WHEN_UNSPECIFIED;
      case 1: return DISPLAY_WHEN_EXHAUST;
      case 2: return DISPLAY_WHEN_IMMEDIATE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<DisplayWhenEnum>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      DisplayWhenEnum> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<DisplayWhenEnum>() {
          public DisplayWhenEnum findValueByNumber(int number) {
            return DisplayWhenEnum.forNumber(number);
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
    return org.fixprotocol.components.Common.getDescriptor().getEnumTypes().get(132);
  }

  private static final DisplayWhenEnum[] VALUES = values();

  public static DisplayWhenEnum valueOf(
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

  private DisplayWhenEnum(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:Common.DisplayWhenEnum)
}
