// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package org.fixprotocol.components;

/**
 * Protobuf enum {@code Common.TriggerOrderTypeEnum}
 */
public enum TriggerOrderTypeEnum
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>TRIGGER_ORDER_TYPE_UNSPECIFIED = 0;</code>
   */
  TRIGGER_ORDER_TYPE_UNSPECIFIED(0),
  /**
   * <code>TRIGGER_ORDER_TYPE_LIMIT = 1 [(.fix.enum_value) = "2", (.fix.enum_added) = VERSION_FIX_4_4, (.fix.enum_added_ep) = 35];</code>
   */
  TRIGGER_ORDER_TYPE_LIMIT(1),
  /**
   * <code>TRIGGER_ORDER_TYPE_MARKET = 2 [(.fix.enum_value) = "1", (.fix.enum_added) = VERSION_FIX_4_4, (.fix.enum_added_ep) = 35];</code>
   */
  TRIGGER_ORDER_TYPE_MARKET(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>TRIGGER_ORDER_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int TRIGGER_ORDER_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   * <code>TRIGGER_ORDER_TYPE_LIMIT = 1 [(.fix.enum_value) = "2", (.fix.enum_added) = VERSION_FIX_4_4, (.fix.enum_added_ep) = 35];</code>
   */
  public static final int TRIGGER_ORDER_TYPE_LIMIT_VALUE = 1;
  /**
   * <code>TRIGGER_ORDER_TYPE_MARKET = 2 [(.fix.enum_value) = "1", (.fix.enum_added) = VERSION_FIX_4_4, (.fix.enum_added_ep) = 35];</code>
   */
  public static final int TRIGGER_ORDER_TYPE_MARKET_VALUE = 2;


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
  public static TriggerOrderTypeEnum valueOf(int value) {
    return forNumber(value);
  }

  public static TriggerOrderTypeEnum forNumber(int value) {
    switch (value) {
      case 0: return TRIGGER_ORDER_TYPE_UNSPECIFIED;
      case 1: return TRIGGER_ORDER_TYPE_LIMIT;
      case 2: return TRIGGER_ORDER_TYPE_MARKET;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<TriggerOrderTypeEnum>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      TriggerOrderTypeEnum> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<TriggerOrderTypeEnum>() {
          public TriggerOrderTypeEnum findValueByNumber(int number) {
            return TriggerOrderTypeEnum.forNumber(number);
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
    return org.fixprotocol.components.Common.getDescriptor().getEnumTypes().get(140);
  }

  private static final TriggerOrderTypeEnum[] VALUES = values();

  public static TriggerOrderTypeEnum valueOf(
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

  private TriggerOrderTypeEnum(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:Common.TriggerOrderTypeEnum)
}

