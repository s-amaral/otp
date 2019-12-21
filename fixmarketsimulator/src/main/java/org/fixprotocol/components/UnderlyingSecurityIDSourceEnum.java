// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package org.fixprotocol.components;

/**
 * Protobuf enum {@code Common.UnderlyingSecurityIDSourceEnum}
 */
public enum UnderlyingSecurityIDSourceEnum
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>UNDERLYING_SECURITY_ID_SOURCE_UNSPECIFIED = 0;</code>
   */
  UNDERLYING_SECURITY_ID_SOURCE_UNSPECIFIED(0),
  /**
   * <code>UNDERLYING_SECURITY_ID_SOURCE_CUSIP = 1 [(.fix.enum_value) = "1", (.fix.enum_added) = VERSION_FIX_2_7];</code>
   */
  UNDERLYING_SECURITY_ID_SOURCE_CUSIP(1),
  /**
   * <code>UNDERLYING_SECURITY_ID_SOURCE_QUIK = 2 [(.fix.enum_value) = "3", (.fix.enum_added) = VERSION_FIX_2_7];</code>
   */
  UNDERLYING_SECURITY_ID_SOURCE_QUIK(2),
  /**
   * <code>UNDERLYING_SECURITY_ID_SOURCE_SEDOL = 3 [(.fix.enum_value) = "2", (.fix.enum_added) = VERSION_FIX_2_7];</code>
   */
  UNDERLYING_SECURITY_ID_SOURCE_SEDOL(3),
  /**
   * <code>UNDERLYING_SECURITY_ID_SOURCE_ISIN_NUMBER = 4 [(.fix.enum_value) = "4", (.fix.enum_added) = VERSION_FIX_3_0];</code>
   */
  UNDERLYING_SECURITY_ID_SOURCE_ISIN_NUMBER(4),
  /**
   * <code>UNDERLYING_SECURITY_ID_SOURCE_RIC_CODE = 5 [(.fix.enum_value) = "5", (.fix.enum_added) = VERSION_FIX_3_0];</code>
   */
  UNDERLYING_SECURITY_ID_SOURCE_RIC_CODE(5),
  /**
   * <code>UNDERLYING_SECURITY_ID_SOURCE_ISO_COUNTRY_CODE = 6 [(.fix.enum_value) = "7", (.fix.enum_added) = VERSION_FIX_4_1];</code>
   */
  UNDERLYING_SECURITY_ID_SOURCE_ISO_COUNTRY_CODE(6),
  /**
   * <code>UNDERLYING_SECURITY_ID_SOURCE_ISO_CURRENCY_CODE = 7 [(.fix.enum_value) = "6", (.fix.enum_added) = VERSION_FIX_4_1];</code>
   */
  UNDERLYING_SECURITY_ID_SOURCE_ISO_CURRENCY_CODE(7),
  /**
   * <code>UNDERLYING_SECURITY_ID_SOURCE_CONSOLIDATED_TAPE_ASSOCIATION = 8 [(.fix.enum_value) = "9", (.fix.enum_added) = VERSION_FIX_4_2];</code>
   */
  UNDERLYING_SECURITY_ID_SOURCE_CONSOLIDATED_TAPE_ASSOCIATION(8),
  /**
   * <code>UNDERLYING_SECURITY_ID_SOURCE_EXCHANGE_SYMBOL = 9 [(.fix.enum_value) = "8", (.fix.enum_added) = VERSION_FIX_4_2];</code>
   */
  UNDERLYING_SECURITY_ID_SOURCE_EXCHANGE_SYMBOL(9),
  /**
   * <code>UNDERLYING_SECURITY_ID_SOURCE_BELGIAN = 10 [(.fix.enum_value) = "F", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  UNDERLYING_SECURITY_ID_SOURCE_BELGIAN(10),
  /**
   * <code>UNDERLYING_SECURITY_ID_SOURCE_BLOOMBERG_SYMBOL = 11 [(.fix.enum_value) = "A", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  UNDERLYING_SECURITY_ID_SOURCE_BLOOMBERG_SYMBOL(11),
  /**
   * <code>UNDERLYING_SECURITY_ID_SOURCE_COMMON = 12 [(.fix.enum_value) = "G", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  UNDERLYING_SECURITY_ID_SOURCE_COMMON(12),
  /**
   * <code>UNDERLYING_SECURITY_ID_SOURCE_DUTCH = 13 [(.fix.enum_value) = "C", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  UNDERLYING_SECURITY_ID_SOURCE_DUTCH(13),
  /**
   * <code>UNDERLYING_SECURITY_ID_SOURCE_SICOVAM = 14 [(.fix.enum_value) = "E", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  UNDERLYING_SECURITY_ID_SOURCE_SICOVAM(14),
  /**
   * <code>UNDERLYING_SECURITY_ID_SOURCE_VALOREN = 15 [(.fix.enum_value) = "D", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  UNDERLYING_SECURITY_ID_SOURCE_VALOREN(15),
  /**
   * <code>UNDERLYING_SECURITY_ID_SOURCE_WERTPAPIER = 16 [(.fix.enum_value) = "B", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  UNDERLYING_SECURITY_ID_SOURCE_WERTPAPIER(16),
  /**
   * <code>UNDERLYING_SECURITY_ID_SOURCE_CLEARING_HOUSE = 17 [(.fix.enum_value) = "H", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  UNDERLYING_SECURITY_ID_SOURCE_CLEARING_HOUSE(17),
  /**
   * <code>UNDERLYING_SECURITY_ID_SOURCE_ISDA_FPML_SPECIFICATION = 18 [(.fix.enum_value) = "I", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  UNDERLYING_SECURITY_ID_SOURCE_ISDA_FPML_SPECIFICATION(18),
  /**
   * <code>UNDERLYING_SECURITY_ID_SOURCE_OPTION_PRICE_REPORTING_AUTHORITY = 19 [(.fix.enum_value) = "J", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  UNDERLYING_SECURITY_ID_SOURCE_OPTION_PRICE_REPORTING_AUTHORITY(19),
  /**
   * <code>UNDERLYING_SECURITY_ID_SOURCE_LETTER_OF_CREDIT = 20 [(.fix.enum_value) = "L", (.fix.enum_added) = VERSION_FIX_4_4, (.fix.enum_added_ep) = 8];</code>
   */
  UNDERLYING_SECURITY_ID_SOURCE_LETTER_OF_CREDIT(20),
  /**
   * <code>UNDERLYING_SECURITY_ID_SOURCE_ISDA_FPML_URL = 21 [(.fix.enum_value) = "K", (.fix.enum_added) = VERSION_FIX_4_4, (.fix.enum_added_ep) = 15];</code>
   */
  UNDERLYING_SECURITY_ID_SOURCE_ISDA_FPML_URL(21),
  /**
   * <code>UNDERLYING_SECURITY_ID_SOURCE_MARKETPLACE_ASSIGNED_IDENTIFIER = 22 [(.fix.enum_value) = "M", (.fix.enum_added) = VERSION_FIX_5_0, (.fix.enum_added_ep) = 58];</code>
   */
  UNDERLYING_SECURITY_ID_SOURCE_MARKETPLACE_ASSIGNED_IDENTIFIER(22),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>UNDERLYING_SECURITY_ID_SOURCE_UNSPECIFIED = 0;</code>
   */
  public static final int UNDERLYING_SECURITY_ID_SOURCE_UNSPECIFIED_VALUE = 0;
  /**
   * <code>UNDERLYING_SECURITY_ID_SOURCE_CUSIP = 1 [(.fix.enum_value) = "1", (.fix.enum_added) = VERSION_FIX_2_7];</code>
   */
  public static final int UNDERLYING_SECURITY_ID_SOURCE_CUSIP_VALUE = 1;
  /**
   * <code>UNDERLYING_SECURITY_ID_SOURCE_QUIK = 2 [(.fix.enum_value) = "3", (.fix.enum_added) = VERSION_FIX_2_7];</code>
   */
  public static final int UNDERLYING_SECURITY_ID_SOURCE_QUIK_VALUE = 2;
  /**
   * <code>UNDERLYING_SECURITY_ID_SOURCE_SEDOL = 3 [(.fix.enum_value) = "2", (.fix.enum_added) = VERSION_FIX_2_7];</code>
   */
  public static final int UNDERLYING_SECURITY_ID_SOURCE_SEDOL_VALUE = 3;
  /**
   * <code>UNDERLYING_SECURITY_ID_SOURCE_ISIN_NUMBER = 4 [(.fix.enum_value) = "4", (.fix.enum_added) = VERSION_FIX_3_0];</code>
   */
  public static final int UNDERLYING_SECURITY_ID_SOURCE_ISIN_NUMBER_VALUE = 4;
  /**
   * <code>UNDERLYING_SECURITY_ID_SOURCE_RIC_CODE = 5 [(.fix.enum_value) = "5", (.fix.enum_added) = VERSION_FIX_3_0];</code>
   */
  public static final int UNDERLYING_SECURITY_ID_SOURCE_RIC_CODE_VALUE = 5;
  /**
   * <code>UNDERLYING_SECURITY_ID_SOURCE_ISO_COUNTRY_CODE = 6 [(.fix.enum_value) = "7", (.fix.enum_added) = VERSION_FIX_4_1];</code>
   */
  public static final int UNDERLYING_SECURITY_ID_SOURCE_ISO_COUNTRY_CODE_VALUE = 6;
  /**
   * <code>UNDERLYING_SECURITY_ID_SOURCE_ISO_CURRENCY_CODE = 7 [(.fix.enum_value) = "6", (.fix.enum_added) = VERSION_FIX_4_1];</code>
   */
  public static final int UNDERLYING_SECURITY_ID_SOURCE_ISO_CURRENCY_CODE_VALUE = 7;
  /**
   * <code>UNDERLYING_SECURITY_ID_SOURCE_CONSOLIDATED_TAPE_ASSOCIATION = 8 [(.fix.enum_value) = "9", (.fix.enum_added) = VERSION_FIX_4_2];</code>
   */
  public static final int UNDERLYING_SECURITY_ID_SOURCE_CONSOLIDATED_TAPE_ASSOCIATION_VALUE = 8;
  /**
   * <code>UNDERLYING_SECURITY_ID_SOURCE_EXCHANGE_SYMBOL = 9 [(.fix.enum_value) = "8", (.fix.enum_added) = VERSION_FIX_4_2];</code>
   */
  public static final int UNDERLYING_SECURITY_ID_SOURCE_EXCHANGE_SYMBOL_VALUE = 9;
  /**
   * <code>UNDERLYING_SECURITY_ID_SOURCE_BELGIAN = 10 [(.fix.enum_value) = "F", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  public static final int UNDERLYING_SECURITY_ID_SOURCE_BELGIAN_VALUE = 10;
  /**
   * <code>UNDERLYING_SECURITY_ID_SOURCE_BLOOMBERG_SYMBOL = 11 [(.fix.enum_value) = "A", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  public static final int UNDERLYING_SECURITY_ID_SOURCE_BLOOMBERG_SYMBOL_VALUE = 11;
  /**
   * <code>UNDERLYING_SECURITY_ID_SOURCE_COMMON = 12 [(.fix.enum_value) = "G", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  public static final int UNDERLYING_SECURITY_ID_SOURCE_COMMON_VALUE = 12;
  /**
   * <code>UNDERLYING_SECURITY_ID_SOURCE_DUTCH = 13 [(.fix.enum_value) = "C", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  public static final int UNDERLYING_SECURITY_ID_SOURCE_DUTCH_VALUE = 13;
  /**
   * <code>UNDERLYING_SECURITY_ID_SOURCE_SICOVAM = 14 [(.fix.enum_value) = "E", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  public static final int UNDERLYING_SECURITY_ID_SOURCE_SICOVAM_VALUE = 14;
  /**
   * <code>UNDERLYING_SECURITY_ID_SOURCE_VALOREN = 15 [(.fix.enum_value) = "D", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  public static final int UNDERLYING_SECURITY_ID_SOURCE_VALOREN_VALUE = 15;
  /**
   * <code>UNDERLYING_SECURITY_ID_SOURCE_WERTPAPIER = 16 [(.fix.enum_value) = "B", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  public static final int UNDERLYING_SECURITY_ID_SOURCE_WERTPAPIER_VALUE = 16;
  /**
   * <code>UNDERLYING_SECURITY_ID_SOURCE_CLEARING_HOUSE = 17 [(.fix.enum_value) = "H", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int UNDERLYING_SECURITY_ID_SOURCE_CLEARING_HOUSE_VALUE = 17;
  /**
   * <code>UNDERLYING_SECURITY_ID_SOURCE_ISDA_FPML_SPECIFICATION = 18 [(.fix.enum_value) = "I", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int UNDERLYING_SECURITY_ID_SOURCE_ISDA_FPML_SPECIFICATION_VALUE = 18;
  /**
   * <code>UNDERLYING_SECURITY_ID_SOURCE_OPTION_PRICE_REPORTING_AUTHORITY = 19 [(.fix.enum_value) = "J", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int UNDERLYING_SECURITY_ID_SOURCE_OPTION_PRICE_REPORTING_AUTHORITY_VALUE = 19;
  /**
   * <code>UNDERLYING_SECURITY_ID_SOURCE_LETTER_OF_CREDIT = 20 [(.fix.enum_value) = "L", (.fix.enum_added) = VERSION_FIX_4_4, (.fix.enum_added_ep) = 8];</code>
   */
  public static final int UNDERLYING_SECURITY_ID_SOURCE_LETTER_OF_CREDIT_VALUE = 20;
  /**
   * <code>UNDERLYING_SECURITY_ID_SOURCE_ISDA_FPML_URL = 21 [(.fix.enum_value) = "K", (.fix.enum_added) = VERSION_FIX_4_4, (.fix.enum_added_ep) = 15];</code>
   */
  public static final int UNDERLYING_SECURITY_ID_SOURCE_ISDA_FPML_URL_VALUE = 21;
  /**
   * <code>UNDERLYING_SECURITY_ID_SOURCE_MARKETPLACE_ASSIGNED_IDENTIFIER = 22 [(.fix.enum_value) = "M", (.fix.enum_added) = VERSION_FIX_5_0, (.fix.enum_added_ep) = 58];</code>
   */
  public static final int UNDERLYING_SECURITY_ID_SOURCE_MARKETPLACE_ASSIGNED_IDENTIFIER_VALUE = 22;


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
  public static UnderlyingSecurityIDSourceEnum valueOf(int value) {
    return forNumber(value);
  }

  public static UnderlyingSecurityIDSourceEnum forNumber(int value) {
    switch (value) {
      case 0: return UNDERLYING_SECURITY_ID_SOURCE_UNSPECIFIED;
      case 1: return UNDERLYING_SECURITY_ID_SOURCE_CUSIP;
      case 2: return UNDERLYING_SECURITY_ID_SOURCE_QUIK;
      case 3: return UNDERLYING_SECURITY_ID_SOURCE_SEDOL;
      case 4: return UNDERLYING_SECURITY_ID_SOURCE_ISIN_NUMBER;
      case 5: return UNDERLYING_SECURITY_ID_SOURCE_RIC_CODE;
      case 6: return UNDERLYING_SECURITY_ID_SOURCE_ISO_COUNTRY_CODE;
      case 7: return UNDERLYING_SECURITY_ID_SOURCE_ISO_CURRENCY_CODE;
      case 8: return UNDERLYING_SECURITY_ID_SOURCE_CONSOLIDATED_TAPE_ASSOCIATION;
      case 9: return UNDERLYING_SECURITY_ID_SOURCE_EXCHANGE_SYMBOL;
      case 10: return UNDERLYING_SECURITY_ID_SOURCE_BELGIAN;
      case 11: return UNDERLYING_SECURITY_ID_SOURCE_BLOOMBERG_SYMBOL;
      case 12: return UNDERLYING_SECURITY_ID_SOURCE_COMMON;
      case 13: return UNDERLYING_SECURITY_ID_SOURCE_DUTCH;
      case 14: return UNDERLYING_SECURITY_ID_SOURCE_SICOVAM;
      case 15: return UNDERLYING_SECURITY_ID_SOURCE_VALOREN;
      case 16: return UNDERLYING_SECURITY_ID_SOURCE_WERTPAPIER;
      case 17: return UNDERLYING_SECURITY_ID_SOURCE_CLEARING_HOUSE;
      case 18: return UNDERLYING_SECURITY_ID_SOURCE_ISDA_FPML_SPECIFICATION;
      case 19: return UNDERLYING_SECURITY_ID_SOURCE_OPTION_PRICE_REPORTING_AUTHORITY;
      case 20: return UNDERLYING_SECURITY_ID_SOURCE_LETTER_OF_CREDIT;
      case 21: return UNDERLYING_SECURITY_ID_SOURCE_ISDA_FPML_URL;
      case 22: return UNDERLYING_SECURITY_ID_SOURCE_MARKETPLACE_ASSIGNED_IDENTIFIER;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<UnderlyingSecurityIDSourceEnum>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      UnderlyingSecurityIDSourceEnum> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<UnderlyingSecurityIDSourceEnum>() {
          public UnderlyingSecurityIDSourceEnum findValueByNumber(int number) {
            return UnderlyingSecurityIDSourceEnum.forNumber(number);
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
    return org.fixprotocol.components.Common.getDescriptor().getEnumTypes().get(75);
  }

  private static final UnderlyingSecurityIDSourceEnum[] VALUES = values();

  public static UnderlyingSecurityIDSourceEnum valueOf(
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

  private UnderlyingSecurityIDSourceEnum(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:Common.UnderlyingSecurityIDSourceEnum)
}

