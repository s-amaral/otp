// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package org.fixprotocol.components;

public interface DerivativeInstrumentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Common.DerivativeInstrument)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bool deriv_flex_product_eligibility_indicator = 1 [(.fix.tag) = 1243, (.fix.type) = DATATYPE_BOOLEAN, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  boolean getDerivFlexProductEligibilityIndicator();

  /**
   * <code>.fix.Decimal64 derivative_cap_price = 2 [(.fix.tag) = 1321, (.fix.type) = DATATYPE_PRICE, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  boolean hasDerivativeCapPrice();
  /**
   * <code>.fix.Decimal64 derivative_cap_price = 2 [(.fix.tag) = 1321, (.fix.type) = DATATYPE_PRICE, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  org.fixprotocol.components.Fix.Decimal64 getDerivativeCapPrice();
  /**
   * <code>.fix.Decimal64 derivative_cap_price = 2 [(.fix.tag) = 1321, (.fix.type) = DATATYPE_PRICE, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  org.fixprotocol.components.Fix.Decimal64OrBuilder getDerivativeCapPriceOrBuilder();

  /**
   * <code>string derivative_cfi_code = 3 [(.fix.tag) = 1248, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  java.lang.String getDerivativeCfiCode();
  /**
   * <code>string derivative_cfi_code = 3 [(.fix.tag) = 1248, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  com.google.protobuf.ByteString
      getDerivativeCfiCodeBytes();

  /**
   * <code>.fix.Decimal64 derivative_contract_multiplier = 4 [(.fix.tag) = 1266, (.fix.type) = DATATYPE_FLOAT, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  boolean hasDerivativeContractMultiplier();
  /**
   * <code>.fix.Decimal64 derivative_contract_multiplier = 4 [(.fix.tag) = 1266, (.fix.type) = DATATYPE_FLOAT, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  org.fixprotocol.components.Fix.Decimal64 getDerivativeContractMultiplier();
  /**
   * <code>.fix.Decimal64 derivative_contract_multiplier = 4 [(.fix.tag) = 1266, (.fix.type) = DATATYPE_FLOAT, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  org.fixprotocol.components.Fix.Decimal64OrBuilder getDerivativeContractMultiplierOrBuilder();

  /**
   * <code>sfixed32 derivative_contract_settl_month = 5 [(.fix.tag) = 1285, (.fix.type) = DATATYPE_MONTH_YEAR, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  int getDerivativeContractSettlMonth();

  /**
   * <code>string derivative_country_of_issue = 6 [(.fix.tag) = 1258, (.fix.type) = DATATYPE_COUNTRY, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  java.lang.String getDerivativeCountryOfIssue();
  /**
   * <code>string derivative_country_of_issue = 6 [(.fix.tag) = 1258, (.fix.type) = DATATYPE_COUNTRY, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  com.google.protobuf.ByteString
      getDerivativeCountryOfIssueBytes();

  /**
   * <code>string derivative_encoded_issuer = 7 [(.fix.tag) = 1278, (.fix.type) = DATATYPE_DATA, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  java.lang.String getDerivativeEncodedIssuer();
  /**
   * <code>string derivative_encoded_issuer = 7 [(.fix.tag) = 1278, (.fix.type) = DATATYPE_DATA, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  com.google.protobuf.ByteString
      getDerivativeEncodedIssuerBytes();

  /**
   * <code>sfixed64 derivative_encoded_issuer_len = 8 [(.fix.tag) = 1277, (.fix.type) = DATATYPE_LENGTH, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  long getDerivativeEncodedIssuerLen();

  /**
   * <code>string derivative_encoded_security_desc = 9 [(.fix.tag) = 1281, (.fix.type) = DATATYPE_DATA, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  java.lang.String getDerivativeEncodedSecurityDesc();
  /**
   * <code>string derivative_encoded_security_desc = 9 [(.fix.tag) = 1281, (.fix.type) = DATATYPE_DATA, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  com.google.protobuf.ByteString
      getDerivativeEncodedSecurityDescBytes();

  /**
   * <code>sfixed64 derivative_encoded_security_desc_len = 10 [(.fix.tag) = 1280, (.fix.type) = DATATYPE_LENGTH, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  long getDerivativeEncodedSecurityDescLen();

  /**
   * <code>repeated .Common.DerivativeEventsGrp derivative_events_grp = 11 [(.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  java.util.List<org.fixprotocol.components.DerivativeEventsGrp> 
      getDerivativeEventsGrpList();
  /**
   * <code>repeated .Common.DerivativeEventsGrp derivative_events_grp = 11 [(.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  org.fixprotocol.components.DerivativeEventsGrp getDerivativeEventsGrp(int index);
  /**
   * <code>repeated .Common.DerivativeEventsGrp derivative_events_grp = 11 [(.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  int getDerivativeEventsGrpCount();
  /**
   * <code>repeated .Common.DerivativeEventsGrp derivative_events_grp = 11 [(.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  java.util.List<? extends org.fixprotocol.components.DerivativeEventsGrpOrBuilder> 
      getDerivativeEventsGrpOrBuilderList();
  /**
   * <code>repeated .Common.DerivativeEventsGrp derivative_events_grp = 11 [(.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  org.fixprotocol.components.DerivativeEventsGrpOrBuilder getDerivativeEventsGrpOrBuilder(
      int index);

  /**
   * <code>.Common.DerivativeExerciseStyleEnum derivative_exercise_style = 12 [(.fix.tag) = 1299, (.fix.type) = DATATYPE_CHAR, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  int getDerivativeExerciseStyleValue();
  /**
   * <code>.Common.DerivativeExerciseStyleEnum derivative_exercise_style = 12 [(.fix.tag) = 1299, (.fix.type) = DATATYPE_CHAR, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  org.fixprotocol.components.DerivativeExerciseStyleEnum getDerivativeExerciseStyle();

  /**
   * <code>.fix.Decimal64 derivative_floor_price = 13 [(.fix.tag) = 1322, (.fix.type) = DATATYPE_PRICE, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  boolean hasDerivativeFloorPrice();
  /**
   * <code>.fix.Decimal64 derivative_floor_price = 13 [(.fix.tag) = 1322, (.fix.type) = DATATYPE_PRICE, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  org.fixprotocol.components.Fix.Decimal64 getDerivativeFloorPrice();
  /**
   * <code>.fix.Decimal64 derivative_floor_price = 13 [(.fix.tag) = 1322, (.fix.type) = DATATYPE_PRICE, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  org.fixprotocol.components.Fix.Decimal64OrBuilder getDerivativeFloorPriceOrBuilder();

  /**
   * <code>string derivative_instr_registry = 14 [(.fix.tag) = 1257, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  java.lang.String getDerivativeInstrRegistry();
  /**
   * <code>string derivative_instr_registry = 14 [(.fix.tag) = 1257, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  com.google.protobuf.ByteString
      getDerivativeInstrRegistryBytes();

  /**
   * <code>.Common.DerivativeInstrmtAssignmentMethodEnum derivative_instrmt_assignment_method = 15 [(.fix.tag) = 1255, (.fix.type) = DATATYPE_CHAR, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  int getDerivativeInstrmtAssignmentMethodValue();
  /**
   * <code>.Common.DerivativeInstrmtAssignmentMethodEnum derivative_instrmt_assignment_method = 15 [(.fix.tag) = 1255, (.fix.type) = DATATYPE_CHAR, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  org.fixprotocol.components.DerivativeInstrmtAssignmentMethodEnum getDerivativeInstrmtAssignmentMethod();

  /**
   * <code>repeated .Common.DerivativeInstrumentParties derivative_instrument_parties = 16 [(.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  java.util.List<org.fixprotocol.components.DerivativeInstrumentParties> 
      getDerivativeInstrumentPartiesList();
  /**
   * <code>repeated .Common.DerivativeInstrumentParties derivative_instrument_parties = 16 [(.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  org.fixprotocol.components.DerivativeInstrumentParties getDerivativeInstrumentParties(int index);
  /**
   * <code>repeated .Common.DerivativeInstrumentParties derivative_instrument_parties = 16 [(.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  int getDerivativeInstrumentPartiesCount();
  /**
   * <code>repeated .Common.DerivativeInstrumentParties derivative_instrument_parties = 16 [(.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  java.util.List<? extends org.fixprotocol.components.DerivativeInstrumentPartiesOrBuilder> 
      getDerivativeInstrumentPartiesOrBuilderList();
  /**
   * <code>repeated .Common.DerivativeInstrumentParties derivative_instrument_parties = 16 [(.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  org.fixprotocol.components.DerivativeInstrumentPartiesOrBuilder getDerivativeInstrumentPartiesOrBuilder(
      int index);

  /**
   * <code>sfixed32 derivative_issue_date = 17 [(.fix.tag) = 1276, (.fix.type) = DATATYPE_LOCAL_MKT_DATE, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  int getDerivativeIssueDate();

  /**
   * <code>string derivative_issuer = 18 [(.fix.tag) = 1275, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  java.lang.String getDerivativeIssuer();
  /**
   * <code>string derivative_issuer = 18 [(.fix.tag) = 1275, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  com.google.protobuf.ByteString
      getDerivativeIssuerBytes();

  /**
   * <code>.Common.DerivativeListMethodEnum derivative_list_method = 19 [(.fix.tag) = 1320, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  int getDerivativeListMethodValue();
  /**
   * <code>.Common.DerivativeListMethodEnum derivative_list_method = 19 [(.fix.tag) = 1320, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  org.fixprotocol.components.DerivativeListMethodEnum getDerivativeListMethod();

  /**
   * <code>string derivative_locale_of_issue = 20 [(.fix.tag) = 1260, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  java.lang.String getDerivativeLocaleOfIssue();
  /**
   * <code>string derivative_locale_of_issue = 20 [(.fix.tag) = 1260, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  com.google.protobuf.ByteString
      getDerivativeLocaleOfIssueBytes();

  /**
   * <code>sfixed32 derivative_maturity_date = 21 [(.fix.tag) = 1252, (.fix.type) = DATATYPE_LOCAL_MKT_DATE, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  int getDerivativeMaturityDate();

  /**
   * <code>sfixed32 derivative_maturity_month_year = 22 [(.fix.tag) = 1251, (.fix.type) = DATATYPE_MONTH_YEAR, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  int getDerivativeMaturityMonthYear();

  /**
   * <code>.fix.LocalTimeOnly derivative_maturity_time = 23 [(.fix.tag) = 1253, (.fix.type) = DATATYPE_TZ_TIME_ONLY, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  boolean hasDerivativeMaturityTime();
  /**
   * <code>.fix.LocalTimeOnly derivative_maturity_time = 23 [(.fix.tag) = 1253, (.fix.type) = DATATYPE_TZ_TIME_ONLY, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  org.fixprotocol.components.Fix.LocalTimeOnly getDerivativeMaturityTime();
  /**
   * <code>.fix.LocalTimeOnly derivative_maturity_time = 23 [(.fix.tag) = 1253, (.fix.type) = DATATYPE_TZ_TIME_ONLY, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  org.fixprotocol.components.Fix.LocalTimeOnlyOrBuilder getDerivativeMaturityTimeOrBuilder();

  /**
   * <code>.fix.Decimal64 derivative_min_price_increment = 24 [(.fix.tag) = 1267, (.fix.type) = DATATYPE_FLOAT, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  boolean hasDerivativeMinPriceIncrement();
  /**
   * <code>.fix.Decimal64 derivative_min_price_increment = 24 [(.fix.tag) = 1267, (.fix.type) = DATATYPE_FLOAT, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  org.fixprotocol.components.Fix.Decimal64 getDerivativeMinPriceIncrement();
  /**
   * <code>.fix.Decimal64 derivative_min_price_increment = 24 [(.fix.tag) = 1267, (.fix.type) = DATATYPE_FLOAT, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  org.fixprotocol.components.Fix.Decimal64OrBuilder getDerivativeMinPriceIncrementOrBuilder();

  /**
   * <code>.fix.Decimal64 derivative_min_price_increment_amount = 25 [(.fix.tag) = 1268, (.fix.type) = DATATYPE_AMT, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  boolean hasDerivativeMinPriceIncrementAmount();
  /**
   * <code>.fix.Decimal64 derivative_min_price_increment_amount = 25 [(.fix.tag) = 1268, (.fix.type) = DATATYPE_AMT, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  org.fixprotocol.components.Fix.Decimal64 getDerivativeMinPriceIncrementAmount();
  /**
   * <code>.fix.Decimal64 derivative_min_price_increment_amount = 25 [(.fix.tag) = 1268, (.fix.type) = DATATYPE_AMT, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  org.fixprotocol.components.Fix.Decimal64OrBuilder getDerivativeMinPriceIncrementAmountOrBuilder();

  /**
   * <code>sfixed64 derivative_nt_position_limit = 26 [(.fix.tag) = 1274, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  long getDerivativeNtPositionLimit();

  /**
   * <code>bytes derivative_opt_attribute = 27 [(.fix.tag) = 1265, (.fix.type) = DATATYPE_CHAR, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  com.google.protobuf.ByteString getDerivativeOptAttribute();

  /**
   * <code>.fix.Decimal64 derivative_opt_pay_amount = 28 [(.fix.tag) = 1225, (.fix.type) = DATATYPE_AMT, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  boolean hasDerivativeOptPayAmount();
  /**
   * <code>.fix.Decimal64 derivative_opt_pay_amount = 28 [(.fix.tag) = 1225, (.fix.type) = DATATYPE_AMT, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  org.fixprotocol.components.Fix.Decimal64 getDerivativeOptPayAmount();
  /**
   * <code>.fix.Decimal64 derivative_opt_pay_amount = 28 [(.fix.tag) = 1225, (.fix.type) = DATATYPE_AMT, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  org.fixprotocol.components.Fix.Decimal64OrBuilder getDerivativeOptPayAmountOrBuilder();

  /**
   * <code>sfixed64 derivative_position_limit = 29 [(.fix.tag) = 1273, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  long getDerivativePositionLimit();

  /**
   * <code>.Common.DerivativePriceQuoteMethodEnum derivative_price_quote_method = 30 [(.fix.tag) = 1318, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  int getDerivativePriceQuoteMethodValue();
  /**
   * <code>.Common.DerivativePriceQuoteMethodEnum derivative_price_quote_method = 30 [(.fix.tag) = 1318, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  org.fixprotocol.components.DerivativePriceQuoteMethodEnum getDerivativePriceQuoteMethod();

  /**
   * <code>.Common.DerivativePriceUnitOfMeasureEnum derivative_price_unit_of_measure = 31 [(.fix.tag) = 1315, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  int getDerivativePriceUnitOfMeasureValue();
  /**
   * <code>.Common.DerivativePriceUnitOfMeasureEnum derivative_price_unit_of_measure = 31 [(.fix.tag) = 1315, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  org.fixprotocol.components.DerivativePriceUnitOfMeasureEnum getDerivativePriceUnitOfMeasure();

  /**
   * <code>.fix.Decimal64 derivative_price_unit_of_measure_qty = 32 [(.fix.tag) = 1316, (.fix.type) = DATATYPE_QTY, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  boolean hasDerivativePriceUnitOfMeasureQty();
  /**
   * <code>.fix.Decimal64 derivative_price_unit_of_measure_qty = 32 [(.fix.tag) = 1316, (.fix.type) = DATATYPE_QTY, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  org.fixprotocol.components.Fix.Decimal64 getDerivativePriceUnitOfMeasureQty();
  /**
   * <code>.fix.Decimal64 derivative_price_unit_of_measure_qty = 32 [(.fix.tag) = 1316, (.fix.type) = DATATYPE_QTY, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  org.fixprotocol.components.Fix.Decimal64OrBuilder getDerivativePriceUnitOfMeasureQtyOrBuilder();

  /**
   * <code>.Common.DerivativeProductEnum derivative_product = 33 [(.fix.tag) = 1246, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  int getDerivativeProductValue();
  /**
   * <code>.Common.DerivativeProductEnum derivative_product = 33 [(.fix.tag) = 1246, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  org.fixprotocol.components.DerivativeProductEnum getDerivativeProduct();

  /**
   * <code>string derivative_product_complex = 34 [(.fix.tag) = 1228, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  java.lang.String getDerivativeProductComplex();
  /**
   * <code>string derivative_product_complex = 34 [(.fix.tag) = 1228, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  com.google.protobuf.ByteString
      getDerivativeProductComplexBytes();

  /**
   * <code>.Common.DerivativePutOrCallEnum derivative_put_or_call = 35 [(.fix.tag) = 1323, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  int getDerivativePutOrCallValue();
  /**
   * <code>.Common.DerivativePutOrCallEnum derivative_put_or_call = 35 [(.fix.tag) = 1323, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  org.fixprotocol.components.DerivativePutOrCallEnum getDerivativePutOrCall();

  /**
   * <code>repeated .Common.DerivativeSecurityAltIDGrp derivative_security_alt_id_grp = 36 [(.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  java.util.List<org.fixprotocol.components.DerivativeSecurityAltIDGrp> 
      getDerivativeSecurityAltIdGrpList();
  /**
   * <code>repeated .Common.DerivativeSecurityAltIDGrp derivative_security_alt_id_grp = 36 [(.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  org.fixprotocol.components.DerivativeSecurityAltIDGrp getDerivativeSecurityAltIdGrp(int index);
  /**
   * <code>repeated .Common.DerivativeSecurityAltIDGrp derivative_security_alt_id_grp = 36 [(.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  int getDerivativeSecurityAltIdGrpCount();
  /**
   * <code>repeated .Common.DerivativeSecurityAltIDGrp derivative_security_alt_id_grp = 36 [(.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  java.util.List<? extends org.fixprotocol.components.DerivativeSecurityAltIDGrpOrBuilder> 
      getDerivativeSecurityAltIdGrpOrBuilderList();
  /**
   * <code>repeated .Common.DerivativeSecurityAltIDGrp derivative_security_alt_id_grp = 36 [(.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  org.fixprotocol.components.DerivativeSecurityAltIDGrpOrBuilder getDerivativeSecurityAltIdGrpOrBuilder(
      int index);

  /**
   * <code>string derivative_security_desc = 37 [(.fix.tag) = 1279, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  java.lang.String getDerivativeSecurityDesc();
  /**
   * <code>string derivative_security_desc = 37 [(.fix.tag) = 1279, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  com.google.protobuf.ByteString
      getDerivativeSecurityDescBytes();

  /**
   * <code>string derivative_security_exchange = 38 [(.fix.tag) = 1272, (.fix.type) = DATATYPE_EXCHANGE, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  java.lang.String getDerivativeSecurityExchange();
  /**
   * <code>string derivative_security_exchange = 38 [(.fix.tag) = 1272, (.fix.type) = DATATYPE_EXCHANGE, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  com.google.protobuf.ByteString
      getDerivativeSecurityExchangeBytes();

  /**
   * <code>string derivative_security_group = 39 [(.fix.tag) = 1247, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  java.lang.String getDerivativeSecurityGroup();
  /**
   * <code>string derivative_security_group = 39 [(.fix.tag) = 1247, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  com.google.protobuf.ByteString
      getDerivativeSecurityGroupBytes();

  /**
   * <code>string derivative_security_id = 40 [(.fix.tag) = 1216, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  java.lang.String getDerivativeSecurityId();
  /**
   * <code>string derivative_security_id = 40 [(.fix.tag) = 1216, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  com.google.protobuf.ByteString
      getDerivativeSecurityIdBytes();

  /**
   * <code>.Common.DerivativeSecurityIDSourceEnum derivative_security_id_source = 41 [(.fix.tag) = 1217, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  int getDerivativeSecurityIdSourceValue();
  /**
   * <code>.Common.DerivativeSecurityIDSourceEnum derivative_security_id_source = 41 [(.fix.tag) = 1217, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  org.fixprotocol.components.DerivativeSecurityIDSourceEnum getDerivativeSecurityIdSource();

  /**
   * <code>.Common.DerivativeSecurityStatusEnum derivative_security_status = 42 [(.fix.tag) = 1256, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  int getDerivativeSecurityStatusValue();
  /**
   * <code>.Common.DerivativeSecurityStatusEnum derivative_security_status = 42 [(.fix.tag) = 1256, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  org.fixprotocol.components.DerivativeSecurityStatusEnum getDerivativeSecurityStatus();

  /**
   * <code>string derivative_security_sub_type = 43 [(.fix.tag) = 1250, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  java.lang.String getDerivativeSecuritySubType();
  /**
   * <code>string derivative_security_sub_type = 43 [(.fix.tag) = 1250, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  com.google.protobuf.ByteString
      getDerivativeSecuritySubTypeBytes();

  /**
   * <code>.Common.DerivativeSecurityTypeEnum derivative_security_type = 44 [(.fix.tag) = 1249, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  int getDerivativeSecurityTypeValue();
  /**
   * <code>.Common.DerivativeSecurityTypeEnum derivative_security_type = 44 [(.fix.tag) = 1249, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  org.fixprotocol.components.DerivativeSecurityTypeEnum getDerivativeSecurityType();

  /**
   * <code>.Common.DerivativeSecurityXML derivative_security_xml = 45 [(.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  boolean hasDerivativeSecurityXml();
  /**
   * <code>.Common.DerivativeSecurityXML derivative_security_xml = 45 [(.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  org.fixprotocol.components.DerivativeSecurityXML getDerivativeSecurityXml();
  /**
   * <code>.Common.DerivativeSecurityXML derivative_security_xml = 45 [(.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  org.fixprotocol.components.DerivativeSecurityXMLOrBuilder getDerivativeSecurityXmlOrBuilder();

  /**
   * <code>.Common.DerivativeSettlMethodEnum derivative_settl_method = 46 [(.fix.tag) = 1317, (.fix.type) = DATATYPE_CHAR, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  int getDerivativeSettlMethodValue();
  /**
   * <code>.Common.DerivativeSettlMethodEnum derivative_settl_method = 46 [(.fix.tag) = 1317, (.fix.type) = DATATYPE_CHAR, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  org.fixprotocol.components.DerivativeSettlMethodEnum getDerivativeSettlMethod();

  /**
   * <code>string derivative_settle_on_open_flag = 47 [(.fix.tag) = 1254, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  java.lang.String getDerivativeSettleOnOpenFlag();
  /**
   * <code>string derivative_settle_on_open_flag = 47 [(.fix.tag) = 1254, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  com.google.protobuf.ByteString
      getDerivativeSettleOnOpenFlagBytes();

  /**
   * <code>string derivative_state_or_province_of_issue = 48 [(.fix.tag) = 1259, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  java.lang.String getDerivativeStateOrProvinceOfIssue();
  /**
   * <code>string derivative_state_or_province_of_issue = 48 [(.fix.tag) = 1259, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  com.google.protobuf.ByteString
      getDerivativeStateOrProvinceOfIssueBytes();

  /**
   * <code>string derivative_strike_currency = 49 [(.fix.tag) = 1262, (.fix.type) = DATATYPE_CURRENCY, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  java.lang.String getDerivativeStrikeCurrency();
  /**
   * <code>string derivative_strike_currency = 49 [(.fix.tag) = 1262, (.fix.type) = DATATYPE_CURRENCY, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  com.google.protobuf.ByteString
      getDerivativeStrikeCurrencyBytes();

  /**
   * <code>.fix.Decimal64 derivative_strike_multiplier = 50 [(.fix.tag) = 1263, (.fix.type) = DATATYPE_FLOAT, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  boolean hasDerivativeStrikeMultiplier();
  /**
   * <code>.fix.Decimal64 derivative_strike_multiplier = 50 [(.fix.tag) = 1263, (.fix.type) = DATATYPE_FLOAT, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  org.fixprotocol.components.Fix.Decimal64 getDerivativeStrikeMultiplier();
  /**
   * <code>.fix.Decimal64 derivative_strike_multiplier = 50 [(.fix.tag) = 1263, (.fix.type) = DATATYPE_FLOAT, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  org.fixprotocol.components.Fix.Decimal64OrBuilder getDerivativeStrikeMultiplierOrBuilder();

  /**
   * <code>.fix.Decimal64 derivative_strike_price = 51 [(.fix.tag) = 1261, (.fix.type) = DATATYPE_PRICE, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  boolean hasDerivativeStrikePrice();
  /**
   * <code>.fix.Decimal64 derivative_strike_price = 51 [(.fix.tag) = 1261, (.fix.type) = DATATYPE_PRICE, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  org.fixprotocol.components.Fix.Decimal64 getDerivativeStrikePrice();
  /**
   * <code>.fix.Decimal64 derivative_strike_price = 51 [(.fix.tag) = 1261, (.fix.type) = DATATYPE_PRICE, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  org.fixprotocol.components.Fix.Decimal64OrBuilder getDerivativeStrikePriceOrBuilder();

  /**
   * <code>.fix.Decimal64 derivative_strike_value = 52 [(.fix.tag) = 1264, (.fix.type) = DATATYPE_FLOAT, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  boolean hasDerivativeStrikeValue();
  /**
   * <code>.fix.Decimal64 derivative_strike_value = 52 [(.fix.tag) = 1264, (.fix.type) = DATATYPE_FLOAT, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  org.fixprotocol.components.Fix.Decimal64 getDerivativeStrikeValue();
  /**
   * <code>.fix.Decimal64 derivative_strike_value = 52 [(.fix.tag) = 1264, (.fix.type) = DATATYPE_FLOAT, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  org.fixprotocol.components.Fix.Decimal64OrBuilder getDerivativeStrikeValueOrBuilder();

  /**
   * <code>string derivative_symbol = 53 [(.fix.tag) = 1214, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  java.lang.String getDerivativeSymbol();
  /**
   * <code>string derivative_symbol = 53 [(.fix.tag) = 1214, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  com.google.protobuf.ByteString
      getDerivativeSymbolBytes();

  /**
   * <code>.Common.DerivativeSymbolSfxEnum derivative_symbol_sfx = 54 [(.fix.tag) = 1215, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  int getDerivativeSymbolSfxValue();
  /**
   * <code>.Common.DerivativeSymbolSfxEnum derivative_symbol_sfx = 54 [(.fix.tag) = 1215, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  org.fixprotocol.components.DerivativeSymbolSfxEnum getDerivativeSymbolSfx();

  /**
   * <code>.Common.DerivativeTimeUnitEnum derivative_time_unit = 55 [(.fix.tag) = 1271, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  int getDerivativeTimeUnitValue();
  /**
   * <code>.Common.DerivativeTimeUnitEnum derivative_time_unit = 55 [(.fix.tag) = 1271, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  org.fixprotocol.components.DerivativeTimeUnitEnum getDerivativeTimeUnit();

  /**
   * <code>.Common.DerivativeUnitOfMeasureEnum derivative_unit_of_measure = 56 [(.fix.tag) = 1269, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  int getDerivativeUnitOfMeasureValue();
  /**
   * <code>.Common.DerivativeUnitOfMeasureEnum derivative_unit_of_measure = 56 [(.fix.tag) = 1269, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  org.fixprotocol.components.DerivativeUnitOfMeasureEnum getDerivativeUnitOfMeasure();

  /**
   * <code>.fix.Decimal64 derivative_unit_of_measure_qty = 57 [(.fix.tag) = 1270, (.fix.type) = DATATYPE_QTY, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  boolean hasDerivativeUnitOfMeasureQty();
  /**
   * <code>.fix.Decimal64 derivative_unit_of_measure_qty = 57 [(.fix.tag) = 1270, (.fix.type) = DATATYPE_QTY, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  org.fixprotocol.components.Fix.Decimal64 getDerivativeUnitOfMeasureQty();
  /**
   * <code>.fix.Decimal64 derivative_unit_of_measure_qty = 57 [(.fix.tag) = 1270, (.fix.type) = DATATYPE_QTY, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  org.fixprotocol.components.Fix.Decimal64OrBuilder getDerivativeUnitOfMeasureQtyOrBuilder();

  /**
   * <code>.Common.DerivativeValuationMethodEnum derivative_valuation_method = 58 [(.fix.tag) = 1319, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  int getDerivativeValuationMethodValue();
  /**
   * <code>.Common.DerivativeValuationMethodEnum derivative_valuation_method = 58 [(.fix.tag) = 1319, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  org.fixprotocol.components.DerivativeValuationMethodEnum getDerivativeValuationMethod();

  /**
   * <code>.Common.DerivativeContractMultiplierUnitEnum derivative_contract_multiplier_unit = 59 [(.fix.tag) = 1438, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_5_0SP1, (.fix.field_added_ep) = 80];</code>
   */
  int getDerivativeContractMultiplierUnitValue();
  /**
   * <code>.Common.DerivativeContractMultiplierUnitEnum derivative_contract_multiplier_unit = 59 [(.fix.tag) = 1438, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_5_0SP1, (.fix.field_added_ep) = 80];</code>
   */
  org.fixprotocol.components.DerivativeContractMultiplierUnitEnum getDerivativeContractMultiplierUnit();

  /**
   * <code>.Common.DerivativeFlowScheduleTypeEnum derivative_flow_schedule_type = 60 [(.fix.tag) = 1442, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_5_0SP1, (.fix.field_added_ep) = 80];</code>
   */
  int getDerivativeFlowScheduleTypeValue();
  /**
   * <code>.Common.DerivativeFlowScheduleTypeEnum derivative_flow_schedule_type = 60 [(.fix.tag) = 1442, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_5_0SP1, (.fix.field_added_ep) = 80];</code>
   */
  org.fixprotocol.components.DerivativeFlowScheduleTypeEnum getDerivativeFlowScheduleType();

  /**
   * <code>fixed32 derivative_flow_schedule_type_reserved100plus = 61 [(.fix.tag) = 1442, (.fix.type) = DATATYPE_RESERVED100PLUS, (.fix.field_added) = VERSION_FIX_5_0SP1, (.fix.field_added_ep) = 80];</code>
   */
  int getDerivativeFlowScheduleTypeReserved100Plus();

  public org.fixprotocol.components.DerivativeInstrument.DerivativeFlowScheduleTypeUnionCase getDerivativeFlowScheduleTypeUnionCase();
}