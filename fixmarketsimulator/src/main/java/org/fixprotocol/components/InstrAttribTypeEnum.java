// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package org.fixprotocol.components;

/**
 * Protobuf enum {@code Common.InstrAttribTypeEnum}
 */
public enum InstrAttribTypeEnum
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>INSTR_ATTRIB_TYPE_UNSPECIFIED = 0;</code>
   */
  INSTR_ATTRIB_TYPE_UNSPECIFIED(0),
  /**
   * <code>INSTR_ATTRIB_TYPE_CALLABLE = 1 [(.fix.enum_value) = "11", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  INSTR_ATTRIB_TYPE_CALLABLE(1),
  /**
   * <code>INSTR_ATTRIB_TYPE_CALLABLE_BELOW_MATURITY_VALUE = 2 [(.fix.enum_value) = "21", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  INSTR_ATTRIB_TYPE_CALLABLE_BELOW_MATURITY_VALUE(2),
  /**
   * <code>INSTR_ATTRIB_TYPE_CALLABLE_WITHOUT_NOTICE = 3 [(.fix.enum_value) = "22", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  INSTR_ATTRIB_TYPE_CALLABLE_WITHOUT_NOTICE(3),
  /**
   * <code>INSTR_ATTRIB_TYPE_COUPON_PERIOD = 4 [(.fix.enum_value) = "8", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  INSTR_ATTRIB_TYPE_COUPON_PERIOD(4),
  /**
   * <code>INSTR_ATTRIB_TYPE_ESCROWED_TO_MATURITY = 5 [(.fix.enum_value) = "12", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  INSTR_ATTRIB_TYPE_ESCROWED_TO_MATURITY(5),
  /**
   * <code>INSTR_ATTRIB_TYPE_ESCROWED_TO_REDEMPTION_DATE = 6 [(.fix.enum_value) = "13", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  INSTR_ATTRIB_TYPE_ESCROWED_TO_REDEMPTION_DATE(6),
  /**
   * <code>INSTR_ATTRIB_TYPE_FLAT = 7 [(.fix.enum_value) = "1", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  INSTR_ATTRIB_TYPE_FLAT(7),
  /**
   * <code>INSTR_ATTRIB_TYPE_INDEXED = 8 [(.fix.enum_value) = "18", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  INSTR_ATTRIB_TYPE_INDEXED(8),
  /**
   * <code>INSTR_ATTRIB_TYPE_INTEREST_BEARING = 9 [(.fix.enum_value) = "3", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  INSTR_ATTRIB_TYPE_INTEREST_BEARING(9),
  /**
   * <code>INSTR_ATTRIB_TYPE_IN_DEFAULT = 10 [(.fix.enum_value) = "15", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  INSTR_ATTRIB_TYPE_IN_DEFAULT(10),
  /**
   * <code>INSTR_ATTRIB_TYPE_LESS_FEE_FOR_PUT = 11 [(.fix.enum_value) = "6", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  INSTR_ATTRIB_TYPE_LESS_FEE_FOR_PUT(11),
  /**
   * <code>INSTR_ATTRIB_TYPE_NO_PERIODIC_PAYMENTS = 12 [(.fix.enum_value) = "4", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  INSTR_ATTRIB_TYPE_NO_PERIODIC_PAYMENTS(12),
  /**
   * <code>INSTR_ATTRIB_TYPE_ORIGINAL_ISSUE_DISCOUNT = 13 [(.fix.enum_value) = "10", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  INSTR_ATTRIB_TYPE_ORIGINAL_ISSUE_DISCOUNT(13),
  /**
   * <code>INSTR_ATTRIB_TYPE_ORIGINAL_ISSUE_DISCOUNT_PRICE = 14 [(.fix.enum_value) = "20", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  INSTR_ATTRIB_TYPE_ORIGINAL_ISSUE_DISCOUNT_PRICE(14),
  /**
   * <code>INSTR_ATTRIB_TYPE_PRE_REFUNDED = 15 [(.fix.enum_value) = "14", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  INSTR_ATTRIB_TYPE_PRE_REFUNDED(15),
  /**
   * <code>INSTR_ATTRIB_TYPE_STEPPED_COUPON = 16 [(.fix.enum_value) = "7", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  INSTR_ATTRIB_TYPE_STEPPED_COUPON(16),
  /**
   * <code>INSTR_ATTRIB_TYPE_SUBJECT_TO_ALTERNATIVE_MINIMUM_TAX = 17 [(.fix.enum_value) = "19", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  INSTR_ATTRIB_TYPE_SUBJECT_TO_ALTERNATIVE_MINIMUM_TAX(17),
  /**
   * <code>INSTR_ATTRIB_TYPE_TAXABLE = 18 [(.fix.enum_value) = "17", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  INSTR_ATTRIB_TYPE_TAXABLE(18),
  /**
   * <code>INSTR_ATTRIB_TYPE_TEXT = 19 [(.fix.enum_value) = "99", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  INSTR_ATTRIB_TYPE_TEXT(19),
  /**
   * <code>INSTR_ATTRIB_TYPE_UNRATED = 20 [(.fix.enum_value) = "16", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  INSTR_ATTRIB_TYPE_UNRATED(20),
  /**
   * <code>INSTR_ATTRIB_TYPE_VARIABLE_RATE = 21 [(.fix.enum_value) = "5", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  INSTR_ATTRIB_TYPE_VARIABLE_RATE(21),
  /**
   * <code>INSTR_ATTRIB_TYPE_WHEN = 22 [(.fix.enum_value) = "9", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  INSTR_ATTRIB_TYPE_WHEN(22),
  /**
   * <code>INSTR_ATTRIB_TYPE_ZERO_COUPON = 23 [(.fix.enum_value) = "2", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  INSTR_ATTRIB_TYPE_ZERO_COUPON(23),
  /**
   * <code>INSTR_ATTRIB_TYPE_PRICE_TICK_RULES_FOR_SECURITY = 24 [(.fix.enum_value) = "23", (.fix.enum_added) = VERSION_FIX_5_0, (.fix.enum_added_ep) = 42];</code>
   */
  INSTR_ATTRIB_TYPE_PRICE_TICK_RULES_FOR_SECURITY(24),
  /**
   * <code>INSTR_ATTRIB_TYPE_TRADE_TYPE_ELIGIBILITY_DETAILS_FOR_SECURITY = 25 [(.fix.enum_value) = "24", (.fix.enum_added) = VERSION_FIX_5_0, (.fix.enum_added_ep) = 42];</code>
   */
  INSTR_ATTRIB_TYPE_TRADE_TYPE_ELIGIBILITY_DETAILS_FOR_SECURITY(25),
  /**
   * <code>INSTR_ATTRIB_TYPE_INSTRUMENT_DENOMINATOR = 26 [(.fix.enum_value) = "25", (.fix.enum_added) = VERSION_FIX_5_0, (.fix.enum_added_ep) = 52];</code>
   */
  INSTR_ATTRIB_TYPE_INSTRUMENT_DENOMINATOR(26),
  /**
   * <code>INSTR_ATTRIB_TYPE_INSTRUMENT_NUMERATOR = 27 [(.fix.enum_value) = "26", (.fix.enum_added) = VERSION_FIX_5_0, (.fix.enum_added_ep) = 52];</code>
   */
  INSTR_ATTRIB_TYPE_INSTRUMENT_NUMERATOR(27),
  /**
   * <code>INSTR_ATTRIB_TYPE_INSTRUMENT_PRICE_PRECISION = 28 [(.fix.enum_value) = "27", (.fix.enum_added) = VERSION_FIX_5_0, (.fix.enum_added_ep) = 52];</code>
   */
  INSTR_ATTRIB_TYPE_INSTRUMENT_PRICE_PRECISION(28),
  /**
   * <code>INSTR_ATTRIB_TYPE_INSTRUMENT_STRIKE_PRICE = 29 [(.fix.enum_value) = "28", (.fix.enum_added) = VERSION_FIX_5_0, (.fix.enum_added_ep) = 52];</code>
   */
  INSTR_ATTRIB_TYPE_INSTRUMENT_STRIKE_PRICE(29),
  /**
   * <code>INSTR_ATTRIB_TYPE_TRADEABLE_INDICATOR = 30 [(.fix.enum_value) = "29", (.fix.enum_added) = VERSION_FIX_5_0, (.fix.enum_added_ep) = 52];</code>
   */
  INSTR_ATTRIB_TYPE_TRADEABLE_INDICATOR(30),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>INSTR_ATTRIB_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int INSTR_ATTRIB_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   * <code>INSTR_ATTRIB_TYPE_CALLABLE = 1 [(.fix.enum_value) = "11", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int INSTR_ATTRIB_TYPE_CALLABLE_VALUE = 1;
  /**
   * <code>INSTR_ATTRIB_TYPE_CALLABLE_BELOW_MATURITY_VALUE = 2 [(.fix.enum_value) = "21", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int INSTR_ATTRIB_TYPE_CALLABLE_BELOW_MATURITY_VALUE_VALUE = 2;
  /**
   * <code>INSTR_ATTRIB_TYPE_CALLABLE_WITHOUT_NOTICE = 3 [(.fix.enum_value) = "22", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int INSTR_ATTRIB_TYPE_CALLABLE_WITHOUT_NOTICE_VALUE = 3;
  /**
   * <code>INSTR_ATTRIB_TYPE_COUPON_PERIOD = 4 [(.fix.enum_value) = "8", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int INSTR_ATTRIB_TYPE_COUPON_PERIOD_VALUE = 4;
  /**
   * <code>INSTR_ATTRIB_TYPE_ESCROWED_TO_MATURITY = 5 [(.fix.enum_value) = "12", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int INSTR_ATTRIB_TYPE_ESCROWED_TO_MATURITY_VALUE = 5;
  /**
   * <code>INSTR_ATTRIB_TYPE_ESCROWED_TO_REDEMPTION_DATE = 6 [(.fix.enum_value) = "13", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int INSTR_ATTRIB_TYPE_ESCROWED_TO_REDEMPTION_DATE_VALUE = 6;
  /**
   * <code>INSTR_ATTRIB_TYPE_FLAT = 7 [(.fix.enum_value) = "1", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int INSTR_ATTRIB_TYPE_FLAT_VALUE = 7;
  /**
   * <code>INSTR_ATTRIB_TYPE_INDEXED = 8 [(.fix.enum_value) = "18", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int INSTR_ATTRIB_TYPE_INDEXED_VALUE = 8;
  /**
   * <code>INSTR_ATTRIB_TYPE_INTEREST_BEARING = 9 [(.fix.enum_value) = "3", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int INSTR_ATTRIB_TYPE_INTEREST_BEARING_VALUE = 9;
  /**
   * <code>INSTR_ATTRIB_TYPE_IN_DEFAULT = 10 [(.fix.enum_value) = "15", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int INSTR_ATTRIB_TYPE_IN_DEFAULT_VALUE = 10;
  /**
   * <code>INSTR_ATTRIB_TYPE_LESS_FEE_FOR_PUT = 11 [(.fix.enum_value) = "6", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int INSTR_ATTRIB_TYPE_LESS_FEE_FOR_PUT_VALUE = 11;
  /**
   * <code>INSTR_ATTRIB_TYPE_NO_PERIODIC_PAYMENTS = 12 [(.fix.enum_value) = "4", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int INSTR_ATTRIB_TYPE_NO_PERIODIC_PAYMENTS_VALUE = 12;
  /**
   * <code>INSTR_ATTRIB_TYPE_ORIGINAL_ISSUE_DISCOUNT = 13 [(.fix.enum_value) = "10", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int INSTR_ATTRIB_TYPE_ORIGINAL_ISSUE_DISCOUNT_VALUE = 13;
  /**
   * <code>INSTR_ATTRIB_TYPE_ORIGINAL_ISSUE_DISCOUNT_PRICE = 14 [(.fix.enum_value) = "20", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int INSTR_ATTRIB_TYPE_ORIGINAL_ISSUE_DISCOUNT_PRICE_VALUE = 14;
  /**
   * <code>INSTR_ATTRIB_TYPE_PRE_REFUNDED = 15 [(.fix.enum_value) = "14", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int INSTR_ATTRIB_TYPE_PRE_REFUNDED_VALUE = 15;
  /**
   * <code>INSTR_ATTRIB_TYPE_STEPPED_COUPON = 16 [(.fix.enum_value) = "7", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int INSTR_ATTRIB_TYPE_STEPPED_COUPON_VALUE = 16;
  /**
   * <code>INSTR_ATTRIB_TYPE_SUBJECT_TO_ALTERNATIVE_MINIMUM_TAX = 17 [(.fix.enum_value) = "19", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int INSTR_ATTRIB_TYPE_SUBJECT_TO_ALTERNATIVE_MINIMUM_TAX_VALUE = 17;
  /**
   * <code>INSTR_ATTRIB_TYPE_TAXABLE = 18 [(.fix.enum_value) = "17", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int INSTR_ATTRIB_TYPE_TAXABLE_VALUE = 18;
  /**
   * <code>INSTR_ATTRIB_TYPE_TEXT = 19 [(.fix.enum_value) = "99", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int INSTR_ATTRIB_TYPE_TEXT_VALUE = 19;
  /**
   * <code>INSTR_ATTRIB_TYPE_UNRATED = 20 [(.fix.enum_value) = "16", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int INSTR_ATTRIB_TYPE_UNRATED_VALUE = 20;
  /**
   * <code>INSTR_ATTRIB_TYPE_VARIABLE_RATE = 21 [(.fix.enum_value) = "5", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int INSTR_ATTRIB_TYPE_VARIABLE_RATE_VALUE = 21;
  /**
   * <code>INSTR_ATTRIB_TYPE_WHEN = 22 [(.fix.enum_value) = "9", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int INSTR_ATTRIB_TYPE_WHEN_VALUE = 22;
  /**
   * <code>INSTR_ATTRIB_TYPE_ZERO_COUPON = 23 [(.fix.enum_value) = "2", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int INSTR_ATTRIB_TYPE_ZERO_COUPON_VALUE = 23;
  /**
   * <code>INSTR_ATTRIB_TYPE_PRICE_TICK_RULES_FOR_SECURITY = 24 [(.fix.enum_value) = "23", (.fix.enum_added) = VERSION_FIX_5_0, (.fix.enum_added_ep) = 42];</code>
   */
  public static final int INSTR_ATTRIB_TYPE_PRICE_TICK_RULES_FOR_SECURITY_VALUE = 24;
  /**
   * <code>INSTR_ATTRIB_TYPE_TRADE_TYPE_ELIGIBILITY_DETAILS_FOR_SECURITY = 25 [(.fix.enum_value) = "24", (.fix.enum_added) = VERSION_FIX_5_0, (.fix.enum_added_ep) = 42];</code>
   */
  public static final int INSTR_ATTRIB_TYPE_TRADE_TYPE_ELIGIBILITY_DETAILS_FOR_SECURITY_VALUE = 25;
  /**
   * <code>INSTR_ATTRIB_TYPE_INSTRUMENT_DENOMINATOR = 26 [(.fix.enum_value) = "25", (.fix.enum_added) = VERSION_FIX_5_0, (.fix.enum_added_ep) = 52];</code>
   */
  public static final int INSTR_ATTRIB_TYPE_INSTRUMENT_DENOMINATOR_VALUE = 26;
  /**
   * <code>INSTR_ATTRIB_TYPE_INSTRUMENT_NUMERATOR = 27 [(.fix.enum_value) = "26", (.fix.enum_added) = VERSION_FIX_5_0, (.fix.enum_added_ep) = 52];</code>
   */
  public static final int INSTR_ATTRIB_TYPE_INSTRUMENT_NUMERATOR_VALUE = 27;
  /**
   * <code>INSTR_ATTRIB_TYPE_INSTRUMENT_PRICE_PRECISION = 28 [(.fix.enum_value) = "27", (.fix.enum_added) = VERSION_FIX_5_0, (.fix.enum_added_ep) = 52];</code>
   */
  public static final int INSTR_ATTRIB_TYPE_INSTRUMENT_PRICE_PRECISION_VALUE = 28;
  /**
   * <code>INSTR_ATTRIB_TYPE_INSTRUMENT_STRIKE_PRICE = 29 [(.fix.enum_value) = "28", (.fix.enum_added) = VERSION_FIX_5_0, (.fix.enum_added_ep) = 52];</code>
   */
  public static final int INSTR_ATTRIB_TYPE_INSTRUMENT_STRIKE_PRICE_VALUE = 29;
  /**
   * <code>INSTR_ATTRIB_TYPE_TRADEABLE_INDICATOR = 30 [(.fix.enum_value) = "29", (.fix.enum_added) = VERSION_FIX_5_0, (.fix.enum_added_ep) = 52];</code>
   */
  public static final int INSTR_ATTRIB_TYPE_TRADEABLE_INDICATOR_VALUE = 30;


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
  public static InstrAttribTypeEnum valueOf(int value) {
    return forNumber(value);
  }

  public static InstrAttribTypeEnum forNumber(int value) {
    switch (value) {
      case 0: return INSTR_ATTRIB_TYPE_UNSPECIFIED;
      case 1: return INSTR_ATTRIB_TYPE_CALLABLE;
      case 2: return INSTR_ATTRIB_TYPE_CALLABLE_BELOW_MATURITY_VALUE;
      case 3: return INSTR_ATTRIB_TYPE_CALLABLE_WITHOUT_NOTICE;
      case 4: return INSTR_ATTRIB_TYPE_COUPON_PERIOD;
      case 5: return INSTR_ATTRIB_TYPE_ESCROWED_TO_MATURITY;
      case 6: return INSTR_ATTRIB_TYPE_ESCROWED_TO_REDEMPTION_DATE;
      case 7: return INSTR_ATTRIB_TYPE_FLAT;
      case 8: return INSTR_ATTRIB_TYPE_INDEXED;
      case 9: return INSTR_ATTRIB_TYPE_INTEREST_BEARING;
      case 10: return INSTR_ATTRIB_TYPE_IN_DEFAULT;
      case 11: return INSTR_ATTRIB_TYPE_LESS_FEE_FOR_PUT;
      case 12: return INSTR_ATTRIB_TYPE_NO_PERIODIC_PAYMENTS;
      case 13: return INSTR_ATTRIB_TYPE_ORIGINAL_ISSUE_DISCOUNT;
      case 14: return INSTR_ATTRIB_TYPE_ORIGINAL_ISSUE_DISCOUNT_PRICE;
      case 15: return INSTR_ATTRIB_TYPE_PRE_REFUNDED;
      case 16: return INSTR_ATTRIB_TYPE_STEPPED_COUPON;
      case 17: return INSTR_ATTRIB_TYPE_SUBJECT_TO_ALTERNATIVE_MINIMUM_TAX;
      case 18: return INSTR_ATTRIB_TYPE_TAXABLE;
      case 19: return INSTR_ATTRIB_TYPE_TEXT;
      case 20: return INSTR_ATTRIB_TYPE_UNRATED;
      case 21: return INSTR_ATTRIB_TYPE_VARIABLE_RATE;
      case 22: return INSTR_ATTRIB_TYPE_WHEN;
      case 23: return INSTR_ATTRIB_TYPE_ZERO_COUPON;
      case 24: return INSTR_ATTRIB_TYPE_PRICE_TICK_RULES_FOR_SECURITY;
      case 25: return INSTR_ATTRIB_TYPE_TRADE_TYPE_ELIGIBILITY_DETAILS_FOR_SECURITY;
      case 26: return INSTR_ATTRIB_TYPE_INSTRUMENT_DENOMINATOR;
      case 27: return INSTR_ATTRIB_TYPE_INSTRUMENT_NUMERATOR;
      case 28: return INSTR_ATTRIB_TYPE_INSTRUMENT_PRICE_PRECISION;
      case 29: return INSTR_ATTRIB_TYPE_INSTRUMENT_STRIKE_PRICE;
      case 30: return INSTR_ATTRIB_TYPE_TRADEABLE_INDICATOR;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<InstrAttribTypeEnum>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      InstrAttribTypeEnum> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<InstrAttribTypeEnum>() {
          public InstrAttribTypeEnum findValueByNumber(int number) {
            return InstrAttribTypeEnum.forNumber(number);
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
    return org.fixprotocol.components.Common.getDescriptor().getEnumTypes().get(117);
  }

  private static final InstrAttribTypeEnum[] VALUES = values();

  public static InstrAttribTypeEnum valueOf(
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

  private InstrAttribTypeEnum(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:Common.InstrAttribTypeEnum)
}

