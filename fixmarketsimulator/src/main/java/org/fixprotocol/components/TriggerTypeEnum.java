// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package org.fixprotocol.components;

/**
 * Protobuf enum {@code Common.TriggerTypeEnum}
 */
public enum TriggerTypeEnum
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>TRIGGER_TYPE_UNSPECIFIED = 0;</code>
   */
  TRIGGER_TYPE_UNSPECIFIED(0),
  /**
   * <code>TRIGGER_TYPE_NEXT_AUCTION = 1 [(.fix.enum_value) = "3", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  TRIGGER_TYPE_NEXT_AUCTION(1),
  /**
   * <code>TRIGGER_TYPE_PARTIAL_EXECUTION = 2 [(.fix.enum_value) = "1", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  TRIGGER_TYPE_PARTIAL_EXECUTION(2),
  /**
   * <code>TRIGGER_TYPE_PRICE_MOVEMENT = 3 [(.fix.enum_value) = "4", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  TRIGGER_TYPE_PRICE_MOVEMENT(3),
  /**
   * <code>TRIGGER_TYPE_SPECIFIED_TRADING_SESSION = 4 [(.fix.enum_value) = "2", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  TRIGGER_TYPE_SPECIFIED_TRADING_SESSION(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>TRIGGER_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int TRIGGER_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   * <code>TRIGGER_TYPE_NEXT_AUCTION = 1 [(.fix.enum_value) = "3", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int TRIGGER_TYPE_NEXT_AUCTION_VALUE = 1;
  /**
   * <code>TRIGGER_TYPE_PARTIAL_EXECUTION = 2 [(.fix.enum_value) = "1", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int TRIGGER_TYPE_PARTIAL_EXECUTION_VALUE = 2;
  /**
   * <code>TRIGGER_TYPE_PRICE_MOVEMENT = 3 [(.fix.enum_value) = "4", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int TRIGGER_TYPE_PRICE_MOVEMENT_VALUE = 3;
  /**
   * <code>TRIGGER_TYPE_SPECIFIED_TRADING_SESSION = 4 [(.fix.enum_value) = "2", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int TRIGGER_TYPE_SPECIFIED_TRADING_SESSION_VALUE = 4;


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
  public static TriggerTypeEnum valueOf(int value) {
    return forNumber(value);
  }

  public static TriggerTypeEnum forNumber(int value) {
    switch (value) {
      case 0: return TRIGGER_TYPE_UNSPECIFIED;
      case 1: return TRIGGER_TYPE_NEXT_AUCTION;
      case 2: return TRIGGER_TYPE_PARTIAL_EXECUTION;
      case 3: return TRIGGER_TYPE_PRICE_MOVEMENT;
      case 4: return TRIGGER_TYPE_SPECIFIED_TRADING_SESSION;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<TriggerTypeEnum>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      TriggerTypeEnum> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<TriggerTypeEnum>() {
          public TriggerTypeEnum findValueByNumber(int number) {
            return TriggerTypeEnum.forNumber(number);
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
    return org.fixprotocol.components.Common.getDescriptor().getEnumTypes().get(134);
  }

  private static final TriggerTypeEnum[] VALUES = values();

  public static TriggerTypeEnum valueOf(
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

  private TriggerTypeEnum(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:Common.TriggerTypeEnum)
}

