// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package org.fixprotocol.components;

/**
 * Protobuf enum {@code Common.TradSesModeEnum}
 */
public enum TradSesModeEnum
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>TRAD_SES_MODE_UNSPECIFIED = 0;</code>
   */
  TRAD_SES_MODE_UNSPECIFIED(0),
  /**
   * <code>TRAD_SES_MODE_PRODUCTION = 1 [(.fix.enum_value) = "3", (.fix.enum_added) = VERSION_FIX_4_2];</code>
   */
  TRAD_SES_MODE_PRODUCTION(1),
  /**
   * <code>TRAD_SES_MODE_SIMULATED = 2 [(.fix.enum_value) = "2", (.fix.enum_added) = VERSION_FIX_4_2];</code>
   */
  TRAD_SES_MODE_SIMULATED(2),
  /**
   * <code>TRAD_SES_MODE_TESTING = 3 [(.fix.enum_value) = "1", (.fix.enum_added) = VERSION_FIX_4_2];</code>
   */
  TRAD_SES_MODE_TESTING(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>TRAD_SES_MODE_UNSPECIFIED = 0;</code>
   */
  public static final int TRAD_SES_MODE_UNSPECIFIED_VALUE = 0;
  /**
   * <code>TRAD_SES_MODE_PRODUCTION = 1 [(.fix.enum_value) = "3", (.fix.enum_added) = VERSION_FIX_4_2];</code>
   */
  public static final int TRAD_SES_MODE_PRODUCTION_VALUE = 1;
  /**
   * <code>TRAD_SES_MODE_SIMULATED = 2 [(.fix.enum_value) = "2", (.fix.enum_added) = VERSION_FIX_4_2];</code>
   */
  public static final int TRAD_SES_MODE_SIMULATED_VALUE = 2;
  /**
   * <code>TRAD_SES_MODE_TESTING = 3 [(.fix.enum_value) = "1", (.fix.enum_added) = VERSION_FIX_4_2];</code>
   */
  public static final int TRAD_SES_MODE_TESTING_VALUE = 3;


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
  public static TradSesModeEnum valueOf(int value) {
    return forNumber(value);
  }

  public static TradSesModeEnum forNumber(int value) {
    switch (value) {
      case 0: return TRAD_SES_MODE_UNSPECIFIED;
      case 1: return TRAD_SES_MODE_PRODUCTION;
      case 2: return TRAD_SES_MODE_SIMULATED;
      case 3: return TRAD_SES_MODE_TESTING;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<TradSesModeEnum>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      TradSesModeEnum> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<TradSesModeEnum>() {
          public TradSesModeEnum findValueByNumber(int number) {
            return TradSesModeEnum.forNumber(number);
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
    return org.fixprotocol.components.Common.getDescriptor().getEnumTypes().get(146);
  }

  private static final TradSesModeEnum[] VALUES = values();

  public static TradSesModeEnum valueOf(
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

  private TradSesModeEnum(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:Common.TradSesModeEnum)
}
