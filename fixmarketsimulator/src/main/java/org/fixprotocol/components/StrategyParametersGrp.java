// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package org.fixprotocol.components;

/**
 * Protobuf type {@code Common.StrategyParametersGrp}
 */
public  final class StrategyParametersGrp extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Common.StrategyParametersGrp)
    StrategyParametersGrpOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StrategyParametersGrp.newBuilder() to construct.
  private StrategyParametersGrp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StrategyParametersGrp() {
    strategyParameterName_ = "";
    strategyParameterType_ = 0;
    strategyParameterValue_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new StrategyParametersGrp();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private StrategyParametersGrp(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            strategyParameterName_ = s;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            strategyParameterType_ = rawValue;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            strategyParameterValue_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.fixprotocol.components.Common.internal_static_Common_StrategyParametersGrp_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.fixprotocol.components.Common.internal_static_Common_StrategyParametersGrp_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.fixprotocol.components.StrategyParametersGrp.class, org.fixprotocol.components.StrategyParametersGrp.Builder.class);
  }

  public static final int STRATEGY_PARAMETER_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object strategyParameterName_;
  /**
   * <code>string strategy_parameter_name = 1 [(.fix.tag) = 958, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  public java.lang.String getStrategyParameterName() {
    java.lang.Object ref = strategyParameterName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      strategyParameterName_ = s;
      return s;
    }
  }
  /**
   * <code>string strategy_parameter_name = 1 [(.fix.tag) = 958, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  public com.google.protobuf.ByteString
      getStrategyParameterNameBytes() {
    java.lang.Object ref = strategyParameterName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      strategyParameterName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STRATEGY_PARAMETER_TYPE_FIELD_NUMBER = 2;
  private int strategyParameterType_;
  /**
   * <code>.Common.StrategyParameterTypeEnum strategy_parameter_type = 2 [(.fix.tag) = 959, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  public int getStrategyParameterTypeValue() {
    return strategyParameterType_;
  }
  /**
   * <code>.Common.StrategyParameterTypeEnum strategy_parameter_type = 2 [(.fix.tag) = 959, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  public org.fixprotocol.components.StrategyParameterTypeEnum getStrategyParameterType() {
    @SuppressWarnings("deprecation")
    org.fixprotocol.components.StrategyParameterTypeEnum result = org.fixprotocol.components.StrategyParameterTypeEnum.valueOf(strategyParameterType_);
    return result == null ? org.fixprotocol.components.StrategyParameterTypeEnum.UNRECOGNIZED : result;
  }

  public static final int STRATEGY_PARAMETER_VALUE_FIELD_NUMBER = 3;
  private volatile java.lang.Object strategyParameterValue_;
  /**
   * <code>string strategy_parameter_value = 3 [(.fix.tag) = 960, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  public java.lang.String getStrategyParameterValue() {
    java.lang.Object ref = strategyParameterValue_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      strategyParameterValue_ = s;
      return s;
    }
  }
  /**
   * <code>string strategy_parameter_value = 3 [(.fix.tag) = 960, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  public com.google.protobuf.ByteString
      getStrategyParameterValueBytes() {
    java.lang.Object ref = strategyParameterValue_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      strategyParameterValue_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getStrategyParameterNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, strategyParameterName_);
    }
    if (strategyParameterType_ != org.fixprotocol.components.StrategyParameterTypeEnum.STRATEGY_PARAMETER_TYPE_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, strategyParameterType_);
    }
    if (!getStrategyParameterValueBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, strategyParameterValue_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getStrategyParameterNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, strategyParameterName_);
    }
    if (strategyParameterType_ != org.fixprotocol.components.StrategyParameterTypeEnum.STRATEGY_PARAMETER_TYPE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, strategyParameterType_);
    }
    if (!getStrategyParameterValueBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, strategyParameterValue_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.fixprotocol.components.StrategyParametersGrp)) {
      return super.equals(obj);
    }
    org.fixprotocol.components.StrategyParametersGrp other = (org.fixprotocol.components.StrategyParametersGrp) obj;

    if (!getStrategyParameterName()
        .equals(other.getStrategyParameterName())) return false;
    if (strategyParameterType_ != other.strategyParameterType_) return false;
    if (!getStrategyParameterValue()
        .equals(other.getStrategyParameterValue())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + STRATEGY_PARAMETER_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getStrategyParameterName().hashCode();
    hash = (37 * hash) + STRATEGY_PARAMETER_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + strategyParameterType_;
    hash = (37 * hash) + STRATEGY_PARAMETER_VALUE_FIELD_NUMBER;
    hash = (53 * hash) + getStrategyParameterValue().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.fixprotocol.components.StrategyParametersGrp parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.fixprotocol.components.StrategyParametersGrp parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.fixprotocol.components.StrategyParametersGrp parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.fixprotocol.components.StrategyParametersGrp parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.fixprotocol.components.StrategyParametersGrp parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.fixprotocol.components.StrategyParametersGrp parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.fixprotocol.components.StrategyParametersGrp parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.fixprotocol.components.StrategyParametersGrp parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.fixprotocol.components.StrategyParametersGrp parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.fixprotocol.components.StrategyParametersGrp parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.fixprotocol.components.StrategyParametersGrp parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.fixprotocol.components.StrategyParametersGrp parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.fixprotocol.components.StrategyParametersGrp prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code Common.StrategyParametersGrp}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Common.StrategyParametersGrp)
      org.fixprotocol.components.StrategyParametersGrpOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.fixprotocol.components.Common.internal_static_Common_StrategyParametersGrp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.fixprotocol.components.Common.internal_static_Common_StrategyParametersGrp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.fixprotocol.components.StrategyParametersGrp.class, org.fixprotocol.components.StrategyParametersGrp.Builder.class);
    }

    // Construct using org.fixprotocol.components.StrategyParametersGrp.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      strategyParameterName_ = "";

      strategyParameterType_ = 0;

      strategyParameterValue_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.fixprotocol.components.Common.internal_static_Common_StrategyParametersGrp_descriptor;
    }

    @java.lang.Override
    public org.fixprotocol.components.StrategyParametersGrp getDefaultInstanceForType() {
      return org.fixprotocol.components.StrategyParametersGrp.getDefaultInstance();
    }

    @java.lang.Override
    public org.fixprotocol.components.StrategyParametersGrp build() {
      org.fixprotocol.components.StrategyParametersGrp result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.fixprotocol.components.StrategyParametersGrp buildPartial() {
      org.fixprotocol.components.StrategyParametersGrp result = new org.fixprotocol.components.StrategyParametersGrp(this);
      result.strategyParameterName_ = strategyParameterName_;
      result.strategyParameterType_ = strategyParameterType_;
      result.strategyParameterValue_ = strategyParameterValue_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.fixprotocol.components.StrategyParametersGrp) {
        return mergeFrom((org.fixprotocol.components.StrategyParametersGrp)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.fixprotocol.components.StrategyParametersGrp other) {
      if (other == org.fixprotocol.components.StrategyParametersGrp.getDefaultInstance()) return this;
      if (!other.getStrategyParameterName().isEmpty()) {
        strategyParameterName_ = other.strategyParameterName_;
        onChanged();
      }
      if (other.strategyParameterType_ != 0) {
        setStrategyParameterTypeValue(other.getStrategyParameterTypeValue());
      }
      if (!other.getStrategyParameterValue().isEmpty()) {
        strategyParameterValue_ = other.strategyParameterValue_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.fixprotocol.components.StrategyParametersGrp parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.fixprotocol.components.StrategyParametersGrp) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object strategyParameterName_ = "";
    /**
     * <code>string strategy_parameter_name = 1 [(.fix.tag) = 958, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
     */
    public java.lang.String getStrategyParameterName() {
      java.lang.Object ref = strategyParameterName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        strategyParameterName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string strategy_parameter_name = 1 [(.fix.tag) = 958, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
     */
    public com.google.protobuf.ByteString
        getStrategyParameterNameBytes() {
      java.lang.Object ref = strategyParameterName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        strategyParameterName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string strategy_parameter_name = 1 [(.fix.tag) = 958, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
     */
    public Builder setStrategyParameterName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      strategyParameterName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string strategy_parameter_name = 1 [(.fix.tag) = 958, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
     */
    public Builder clearStrategyParameterName() {
      
      strategyParameterName_ = getDefaultInstance().getStrategyParameterName();
      onChanged();
      return this;
    }
    /**
     * <code>string strategy_parameter_name = 1 [(.fix.tag) = 958, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
     */
    public Builder setStrategyParameterNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      strategyParameterName_ = value;
      onChanged();
      return this;
    }

    private int strategyParameterType_ = 0;
    /**
     * <code>.Common.StrategyParameterTypeEnum strategy_parameter_type = 2 [(.fix.tag) = 959, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_4_4];</code>
     */
    public int getStrategyParameterTypeValue() {
      return strategyParameterType_;
    }
    /**
     * <code>.Common.StrategyParameterTypeEnum strategy_parameter_type = 2 [(.fix.tag) = 959, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_4_4];</code>
     */
    public Builder setStrategyParameterTypeValue(int value) {
      strategyParameterType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.Common.StrategyParameterTypeEnum strategy_parameter_type = 2 [(.fix.tag) = 959, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_4_4];</code>
     */
    public org.fixprotocol.components.StrategyParameterTypeEnum getStrategyParameterType() {
      @SuppressWarnings("deprecation")
      org.fixprotocol.components.StrategyParameterTypeEnum result = org.fixprotocol.components.StrategyParameterTypeEnum.valueOf(strategyParameterType_);
      return result == null ? org.fixprotocol.components.StrategyParameterTypeEnum.UNRECOGNIZED : result;
    }
    /**
     * <code>.Common.StrategyParameterTypeEnum strategy_parameter_type = 2 [(.fix.tag) = 959, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_4_4];</code>
     */
    public Builder setStrategyParameterType(org.fixprotocol.components.StrategyParameterTypeEnum value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      strategyParameterType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.Common.StrategyParameterTypeEnum strategy_parameter_type = 2 [(.fix.tag) = 959, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_4_4];</code>
     */
    public Builder clearStrategyParameterType() {
      
      strategyParameterType_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object strategyParameterValue_ = "";
    /**
     * <code>string strategy_parameter_value = 3 [(.fix.tag) = 960, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
     */
    public java.lang.String getStrategyParameterValue() {
      java.lang.Object ref = strategyParameterValue_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        strategyParameterValue_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string strategy_parameter_value = 3 [(.fix.tag) = 960, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
     */
    public com.google.protobuf.ByteString
        getStrategyParameterValueBytes() {
      java.lang.Object ref = strategyParameterValue_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        strategyParameterValue_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string strategy_parameter_value = 3 [(.fix.tag) = 960, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
     */
    public Builder setStrategyParameterValue(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      strategyParameterValue_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string strategy_parameter_value = 3 [(.fix.tag) = 960, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
     */
    public Builder clearStrategyParameterValue() {
      
      strategyParameterValue_ = getDefaultInstance().getStrategyParameterValue();
      onChanged();
      return this;
    }
    /**
     * <code>string strategy_parameter_value = 3 [(.fix.tag) = 960, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
     */
    public Builder setStrategyParameterValueBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      strategyParameterValue_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:Common.StrategyParametersGrp)
  }

  // @@protoc_insertion_point(class_scope:Common.StrategyParametersGrp)
  private static final org.fixprotocol.components.StrategyParametersGrp DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.fixprotocol.components.StrategyParametersGrp();
  }

  public static org.fixprotocol.components.StrategyParametersGrp getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StrategyParametersGrp>
      PARSER = new com.google.protobuf.AbstractParser<StrategyParametersGrp>() {
    @java.lang.Override
    public StrategyParametersGrp parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new StrategyParametersGrp(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<StrategyParametersGrp> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StrategyParametersGrp> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.fixprotocol.components.StrategyParametersGrp getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
