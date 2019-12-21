// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package org.fixprotocol.components;

/**
 * Protobuf enum {@code Common.DerivativeListMethodEnum}
 */
public enum DerivativeListMethodEnum
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>DERIVATIVE_LIST_METHOD_UNSPECIFIED = 0;</code>
   */
  DERIVATIVE_LIST_METHOD_UNSPECIFIED(0),
  /**
   * <code>DERIVATIVE_LIST_METHOD_PRE_LISTED_ONLY = 1 [(.fix.enum_value) = "0", (.fix.enum_added) = VERSION_FIX_5_0, (.fix.enum_added_ep) = 52];</code>
   */
  DERIVATIVE_LIST_METHOD_PRE_LISTED_ONLY(1),
  /**
   * <code>DERIVATIVE_LIST_METHOD_USER_REQUESTED = 2 [(.fix.enum_value) = "1", (.fix.enum_added) = VERSION_FIX_5_0, (.fix.enum_added_ep) = 52];</code>
   */
  DERIVATIVE_LIST_METHOD_USER_REQUESTED(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>DERIVATIVE_LIST_METHOD_UNSPECIFIED = 0;</code>
   */
  public static final int DERIVATIVE_LIST_METHOD_UNSPECIFIED_VALUE = 0;
  /**
   * <code>DERIVATIVE_LIST_METHOD_PRE_LISTED_ONLY = 1 [(.fix.enum_value) = "0", (.fix.enum_added) = VERSION_FIX_5_0, (.fix.enum_added_ep) = 52];</code>
   */
  public static final int DERIVATIVE_LIST_METHOD_PRE_LISTED_ONLY_VALUE = 1;
  /**
   * <code>DERIVATIVE_LIST_METHOD_USER_REQUESTED = 2 [(.fix.enum_value) = "1", (.fix.enum_added) = VERSION_FIX_5_0, (.fix.enum_added_ep) = 52];</code>
   */
  public static final int DERIVATIVE_LIST_METHOD_USER_REQUESTED_VALUE = 2;


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
  public static DerivativeListMethodEnum valueOf(int value) {
    return forNumber(value);
  }

  public static DerivativeListMethodEnum forNumber(int value) {
    switch (value) {
      case 0: return DERIVATIVE_LIST_METHOD_UNSPECIFIED;
      case 1: return DERIVATIVE_LIST_METHOD_PRE_LISTED_ONLY;
      case 2: return DERIVATIVE_LIST_METHOD_USER_REQUESTED;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<DerivativeListMethodEnum>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      DerivativeListMethodEnum> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<DerivativeListMethodEnum>() {
          public DerivativeListMethodEnum findValueByNumber(int number) {
            return DerivativeListMethodEnum.forNumber(number);
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
    return org.fixprotocol.components.Common.getDescriptor().getEnumTypes().get(188);
  }

  private static final DerivativeListMethodEnum[] VALUES = values();

  public static DerivativeListMethodEnum valueOf(
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

  private DerivativeListMethodEnum(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:Common.DerivativeListMethodEnum)
}

