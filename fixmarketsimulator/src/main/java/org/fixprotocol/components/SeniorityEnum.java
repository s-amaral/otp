// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package org.fixprotocol.components;

/**
 * Protobuf enum {@code Common.SeniorityEnum}
 */
public enum SeniorityEnum
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>SENIORITY_UNSPECIFIED = 0;</code>
   */
  SENIORITY_UNSPECIFIED(0),
  /**
   * <code>SENIORITY_SENIOR = 1 [(.fix.enum_value) = "SR", (.fix.enum_added) = VERSION_FIX_5_0SP1, (.fix.enum_added_ep) = 83];</code>
   */
  SENIORITY_SENIOR(1),
  /**
   * <code>SENIORITY_SENIOR_SECURED = 2 [(.fix.enum_value) = "SD", (.fix.enum_added) = VERSION_FIX_5_0SP1, (.fix.enum_added_ep) = 83];</code>
   */
  SENIORITY_SENIOR_SECURED(2),
  /**
   * <code>SENIORITY_SUBORDINATED = 3 [(.fix.enum_value) = "SB", (.fix.enum_added) = VERSION_FIX_5_0SP1, (.fix.enum_added_ep) = 83];</code>
   */
  SENIORITY_SUBORDINATED(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>SENIORITY_UNSPECIFIED = 0;</code>
   */
  public static final int SENIORITY_UNSPECIFIED_VALUE = 0;
  /**
   * <code>SENIORITY_SENIOR = 1 [(.fix.enum_value) = "SR", (.fix.enum_added) = VERSION_FIX_5_0SP1, (.fix.enum_added_ep) = 83];</code>
   */
  public static final int SENIORITY_SENIOR_VALUE = 1;
  /**
   * <code>SENIORITY_SENIOR_SECURED = 2 [(.fix.enum_value) = "SD", (.fix.enum_added) = VERSION_FIX_5_0SP1, (.fix.enum_added_ep) = 83];</code>
   */
  public static final int SENIORITY_SENIOR_SECURED_VALUE = 2;
  /**
   * <code>SENIORITY_SUBORDINATED = 3 [(.fix.enum_value) = "SB", (.fix.enum_added) = VERSION_FIX_5_0SP1, (.fix.enum_added_ep) = 83];</code>
   */
  public static final int SENIORITY_SUBORDINATED_VALUE = 3;


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
  public static SeniorityEnum valueOf(int value) {
    return forNumber(value);
  }

  public static SeniorityEnum forNumber(int value) {
    switch (value) {
      case 0: return SENIORITY_UNSPECIFIED;
      case 1: return SENIORITY_SENIOR;
      case 2: return SENIORITY_SENIOR_SECURED;
      case 3: return SENIORITY_SUBORDINATED;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<SeniorityEnum>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      SeniorityEnum> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<SeniorityEnum>() {
          public SeniorityEnum findValueByNumber(int number) {
            return SeniorityEnum.forNumber(number);
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
    return org.fixprotocol.components.Common.getDescriptor().getEnumTypes().get(16);
  }

  private static final SeniorityEnum[] VALUES = values();

  public static SeniorityEnum valueOf(
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

  private SeniorityEnum(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:Common.SeniorityEnum)
}

