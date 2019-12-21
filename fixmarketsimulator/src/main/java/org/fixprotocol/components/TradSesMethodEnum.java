// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package org.fixprotocol.components;

/**
 * Protobuf enum {@code Common.TradSesMethodEnum}
 */
public enum TradSesMethodEnum
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>TRAD_SES_METHOD_UNSPECIFIED = 0;</code>
   */
  TRAD_SES_METHOD_UNSPECIFIED(0),
  /**
   * <code>TRAD_SES_METHOD_ELECTRONIC = 1 [(.fix.enum_value) = "1", (.fix.enum_added) = VERSION_FIX_4_2];</code>
   */
  TRAD_SES_METHOD_ELECTRONIC(1),
  /**
   * <code>TRAD_SES_METHOD_OPEN_OUTCRY = 2 [(.fix.enum_value) = "2", (.fix.enum_added) = VERSION_FIX_4_2];</code>
   */
  TRAD_SES_METHOD_OPEN_OUTCRY(2),
  /**
   * <code>TRAD_SES_METHOD_TWO_PARTY = 3 [(.fix.enum_value) = "3", (.fix.enum_added) = VERSION_FIX_4_2];</code>
   */
  TRAD_SES_METHOD_TWO_PARTY(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>TRAD_SES_METHOD_UNSPECIFIED = 0;</code>
   */
  public static final int TRAD_SES_METHOD_UNSPECIFIED_VALUE = 0;
  /**
   * <code>TRAD_SES_METHOD_ELECTRONIC = 1 [(.fix.enum_value) = "1", (.fix.enum_added) = VERSION_FIX_4_2];</code>
   */
  public static final int TRAD_SES_METHOD_ELECTRONIC_VALUE = 1;
  /**
   * <code>TRAD_SES_METHOD_OPEN_OUTCRY = 2 [(.fix.enum_value) = "2", (.fix.enum_added) = VERSION_FIX_4_2];</code>
   */
  public static final int TRAD_SES_METHOD_OPEN_OUTCRY_VALUE = 2;
  /**
   * <code>TRAD_SES_METHOD_TWO_PARTY = 3 [(.fix.enum_value) = "3", (.fix.enum_added) = VERSION_FIX_4_2];</code>
   */
  public static final int TRAD_SES_METHOD_TWO_PARTY_VALUE = 3;


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
  public static TradSesMethodEnum valueOf(int value) {
    return forNumber(value);
  }

  public static TradSesMethodEnum forNumber(int value) {
    switch (value) {
      case 0: return TRAD_SES_METHOD_UNSPECIFIED;
      case 1: return TRAD_SES_METHOD_ELECTRONIC;
      case 2: return TRAD_SES_METHOD_OPEN_OUTCRY;
      case 3: return TRAD_SES_METHOD_TWO_PARTY;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<TradSesMethodEnum>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      TradSesMethodEnum> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<TradSesMethodEnum>() {
          public TradSesMethodEnum findValueByNumber(int number) {
            return TradSesMethodEnum.forNumber(number);
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
    return org.fixprotocol.components.Common.getDescriptor().getEnumTypes().get(145);
  }

  private static final TradSesMethodEnum[] VALUES = values();

  public static TradSesMethodEnum valueOf(
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

  private TradSesMethodEnum(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:Common.TradSesMethodEnum)
}

