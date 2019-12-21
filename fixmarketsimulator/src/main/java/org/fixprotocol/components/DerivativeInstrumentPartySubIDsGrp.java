// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package org.fixprotocol.components;

/**
 * Protobuf type {@code Common.DerivativeInstrumentPartySubIDsGrp}
 */
public  final class DerivativeInstrumentPartySubIDsGrp extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Common.DerivativeInstrumentPartySubIDsGrp)
    DerivativeInstrumentPartySubIDsGrpOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DerivativeInstrumentPartySubIDsGrp.newBuilder() to construct.
  private DerivativeInstrumentPartySubIDsGrp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DerivativeInstrumentPartySubIDsGrp() {
    derivativeInstrumentPartySubId_ = "";
    derivativeInstrumentPartySubIdType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DerivativeInstrumentPartySubIDsGrp();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DerivativeInstrumentPartySubIDsGrp(
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

            derivativeInstrumentPartySubId_ = s;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            derivativeInstrumentPartySubIdType_ = rawValue;
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
    return org.fixprotocol.components.Common.internal_static_Common_DerivativeInstrumentPartySubIDsGrp_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.fixprotocol.components.Common.internal_static_Common_DerivativeInstrumentPartySubIDsGrp_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.fixprotocol.components.DerivativeInstrumentPartySubIDsGrp.class, org.fixprotocol.components.DerivativeInstrumentPartySubIDsGrp.Builder.class);
  }

  public static final int DERIVATIVE_INSTRUMENT_PARTY_SUB_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object derivativeInstrumentPartySubId_;
  /**
   * <code>string derivative_instrument_party_sub_id = 1 [(.fix.tag) = 1297, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  public java.lang.String getDerivativeInstrumentPartySubId() {
    java.lang.Object ref = derivativeInstrumentPartySubId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      derivativeInstrumentPartySubId_ = s;
      return s;
    }
  }
  /**
   * <code>string derivative_instrument_party_sub_id = 1 [(.fix.tag) = 1297, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  public com.google.protobuf.ByteString
      getDerivativeInstrumentPartySubIdBytes() {
    java.lang.Object ref = derivativeInstrumentPartySubId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      derivativeInstrumentPartySubId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DERIVATIVE_INSTRUMENT_PARTY_SUB_ID_TYPE_FIELD_NUMBER = 2;
  private int derivativeInstrumentPartySubIdType_;
  /**
   * <code>.Common.DerivativeInstrumentPartySubIDTypeEnum derivative_instrument_party_sub_id_type = 2 [(.fix.tag) = 1298, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  public int getDerivativeInstrumentPartySubIdTypeValue() {
    return derivativeInstrumentPartySubIdType_;
  }
  /**
   * <code>.Common.DerivativeInstrumentPartySubIDTypeEnum derivative_instrument_party_sub_id_type = 2 [(.fix.tag) = 1298, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  public org.fixprotocol.components.DerivativeInstrumentPartySubIDTypeEnum getDerivativeInstrumentPartySubIdType() {
    @SuppressWarnings("deprecation")
    org.fixprotocol.components.DerivativeInstrumentPartySubIDTypeEnum result = org.fixprotocol.components.DerivativeInstrumentPartySubIDTypeEnum.valueOf(derivativeInstrumentPartySubIdType_);
    return result == null ? org.fixprotocol.components.DerivativeInstrumentPartySubIDTypeEnum.UNRECOGNIZED : result;
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
    if (!getDerivativeInstrumentPartySubIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, derivativeInstrumentPartySubId_);
    }
    if (derivativeInstrumentPartySubIdType_ != org.fixprotocol.components.DerivativeInstrumentPartySubIDTypeEnum.DERIVATIVE_INSTRUMENT_PARTY_SUB_ID_TYPE_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, derivativeInstrumentPartySubIdType_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getDerivativeInstrumentPartySubIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, derivativeInstrumentPartySubId_);
    }
    if (derivativeInstrumentPartySubIdType_ != org.fixprotocol.components.DerivativeInstrumentPartySubIDTypeEnum.DERIVATIVE_INSTRUMENT_PARTY_SUB_ID_TYPE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, derivativeInstrumentPartySubIdType_);
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
    if (!(obj instanceof org.fixprotocol.components.DerivativeInstrumentPartySubIDsGrp)) {
      return super.equals(obj);
    }
    org.fixprotocol.components.DerivativeInstrumentPartySubIDsGrp other = (org.fixprotocol.components.DerivativeInstrumentPartySubIDsGrp) obj;

    if (!getDerivativeInstrumentPartySubId()
        .equals(other.getDerivativeInstrumentPartySubId())) return false;
    if (derivativeInstrumentPartySubIdType_ != other.derivativeInstrumentPartySubIdType_) return false;
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
    hash = (37 * hash) + DERIVATIVE_INSTRUMENT_PARTY_SUB_ID_FIELD_NUMBER;
    hash = (53 * hash) + getDerivativeInstrumentPartySubId().hashCode();
    hash = (37 * hash) + DERIVATIVE_INSTRUMENT_PARTY_SUB_ID_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + derivativeInstrumentPartySubIdType_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.fixprotocol.components.DerivativeInstrumentPartySubIDsGrp parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.fixprotocol.components.DerivativeInstrumentPartySubIDsGrp parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.fixprotocol.components.DerivativeInstrumentPartySubIDsGrp parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.fixprotocol.components.DerivativeInstrumentPartySubIDsGrp parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.fixprotocol.components.DerivativeInstrumentPartySubIDsGrp parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.fixprotocol.components.DerivativeInstrumentPartySubIDsGrp parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.fixprotocol.components.DerivativeInstrumentPartySubIDsGrp parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.fixprotocol.components.DerivativeInstrumentPartySubIDsGrp parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.fixprotocol.components.DerivativeInstrumentPartySubIDsGrp parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.fixprotocol.components.DerivativeInstrumentPartySubIDsGrp parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.fixprotocol.components.DerivativeInstrumentPartySubIDsGrp parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.fixprotocol.components.DerivativeInstrumentPartySubIDsGrp parseFrom(
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
  public static Builder newBuilder(org.fixprotocol.components.DerivativeInstrumentPartySubIDsGrp prototype) {
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
   * Protobuf type {@code Common.DerivativeInstrumentPartySubIDsGrp}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Common.DerivativeInstrumentPartySubIDsGrp)
      org.fixprotocol.components.DerivativeInstrumentPartySubIDsGrpOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.fixprotocol.components.Common.internal_static_Common_DerivativeInstrumentPartySubIDsGrp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.fixprotocol.components.Common.internal_static_Common_DerivativeInstrumentPartySubIDsGrp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.fixprotocol.components.DerivativeInstrumentPartySubIDsGrp.class, org.fixprotocol.components.DerivativeInstrumentPartySubIDsGrp.Builder.class);
    }

    // Construct using org.fixprotocol.components.DerivativeInstrumentPartySubIDsGrp.newBuilder()
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
      derivativeInstrumentPartySubId_ = "";

      derivativeInstrumentPartySubIdType_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.fixprotocol.components.Common.internal_static_Common_DerivativeInstrumentPartySubIDsGrp_descriptor;
    }

    @java.lang.Override
    public org.fixprotocol.components.DerivativeInstrumentPartySubIDsGrp getDefaultInstanceForType() {
      return org.fixprotocol.components.DerivativeInstrumentPartySubIDsGrp.getDefaultInstance();
    }

    @java.lang.Override
    public org.fixprotocol.components.DerivativeInstrumentPartySubIDsGrp build() {
      org.fixprotocol.components.DerivativeInstrumentPartySubIDsGrp result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.fixprotocol.components.DerivativeInstrumentPartySubIDsGrp buildPartial() {
      org.fixprotocol.components.DerivativeInstrumentPartySubIDsGrp result = new org.fixprotocol.components.DerivativeInstrumentPartySubIDsGrp(this);
      result.derivativeInstrumentPartySubId_ = derivativeInstrumentPartySubId_;
      result.derivativeInstrumentPartySubIdType_ = derivativeInstrumentPartySubIdType_;
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
      if (other instanceof org.fixprotocol.components.DerivativeInstrumentPartySubIDsGrp) {
        return mergeFrom((org.fixprotocol.components.DerivativeInstrumentPartySubIDsGrp)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.fixprotocol.components.DerivativeInstrumentPartySubIDsGrp other) {
      if (other == org.fixprotocol.components.DerivativeInstrumentPartySubIDsGrp.getDefaultInstance()) return this;
      if (!other.getDerivativeInstrumentPartySubId().isEmpty()) {
        derivativeInstrumentPartySubId_ = other.derivativeInstrumentPartySubId_;
        onChanged();
      }
      if (other.derivativeInstrumentPartySubIdType_ != 0) {
        setDerivativeInstrumentPartySubIdTypeValue(other.getDerivativeInstrumentPartySubIdTypeValue());
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
      org.fixprotocol.components.DerivativeInstrumentPartySubIDsGrp parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.fixprotocol.components.DerivativeInstrumentPartySubIDsGrp) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object derivativeInstrumentPartySubId_ = "";
    /**
     * <code>string derivative_instrument_party_sub_id = 1 [(.fix.tag) = 1297, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_5_0];</code>
     */
    public java.lang.String getDerivativeInstrumentPartySubId() {
      java.lang.Object ref = derivativeInstrumentPartySubId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        derivativeInstrumentPartySubId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string derivative_instrument_party_sub_id = 1 [(.fix.tag) = 1297, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_5_0];</code>
     */
    public com.google.protobuf.ByteString
        getDerivativeInstrumentPartySubIdBytes() {
      java.lang.Object ref = derivativeInstrumentPartySubId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        derivativeInstrumentPartySubId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string derivative_instrument_party_sub_id = 1 [(.fix.tag) = 1297, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_5_0];</code>
     */
    public Builder setDerivativeInstrumentPartySubId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      derivativeInstrumentPartySubId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string derivative_instrument_party_sub_id = 1 [(.fix.tag) = 1297, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_5_0];</code>
     */
    public Builder clearDerivativeInstrumentPartySubId() {
      
      derivativeInstrumentPartySubId_ = getDefaultInstance().getDerivativeInstrumentPartySubId();
      onChanged();
      return this;
    }
    /**
     * <code>string derivative_instrument_party_sub_id = 1 [(.fix.tag) = 1297, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_5_0];</code>
     */
    public Builder setDerivativeInstrumentPartySubIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      derivativeInstrumentPartySubId_ = value;
      onChanged();
      return this;
    }

    private int derivativeInstrumentPartySubIdType_ = 0;
    /**
     * <code>.Common.DerivativeInstrumentPartySubIDTypeEnum derivative_instrument_party_sub_id_type = 2 [(.fix.tag) = 1298, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_5_0];</code>
     */
    public int getDerivativeInstrumentPartySubIdTypeValue() {
      return derivativeInstrumentPartySubIdType_;
    }
    /**
     * <code>.Common.DerivativeInstrumentPartySubIDTypeEnum derivative_instrument_party_sub_id_type = 2 [(.fix.tag) = 1298, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_5_0];</code>
     */
    public Builder setDerivativeInstrumentPartySubIdTypeValue(int value) {
      derivativeInstrumentPartySubIdType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.Common.DerivativeInstrumentPartySubIDTypeEnum derivative_instrument_party_sub_id_type = 2 [(.fix.tag) = 1298, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_5_0];</code>
     */
    public org.fixprotocol.components.DerivativeInstrumentPartySubIDTypeEnum getDerivativeInstrumentPartySubIdType() {
      @SuppressWarnings("deprecation")
      org.fixprotocol.components.DerivativeInstrumentPartySubIDTypeEnum result = org.fixprotocol.components.DerivativeInstrumentPartySubIDTypeEnum.valueOf(derivativeInstrumentPartySubIdType_);
      return result == null ? org.fixprotocol.components.DerivativeInstrumentPartySubIDTypeEnum.UNRECOGNIZED : result;
    }
    /**
     * <code>.Common.DerivativeInstrumentPartySubIDTypeEnum derivative_instrument_party_sub_id_type = 2 [(.fix.tag) = 1298, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_5_0];</code>
     */
    public Builder setDerivativeInstrumentPartySubIdType(org.fixprotocol.components.DerivativeInstrumentPartySubIDTypeEnum value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      derivativeInstrumentPartySubIdType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.Common.DerivativeInstrumentPartySubIDTypeEnum derivative_instrument_party_sub_id_type = 2 [(.fix.tag) = 1298, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_5_0];</code>
     */
    public Builder clearDerivativeInstrumentPartySubIdType() {
      
      derivativeInstrumentPartySubIdType_ = 0;
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


    // @@protoc_insertion_point(builder_scope:Common.DerivativeInstrumentPartySubIDsGrp)
  }

  // @@protoc_insertion_point(class_scope:Common.DerivativeInstrumentPartySubIDsGrp)
  private static final org.fixprotocol.components.DerivativeInstrumentPartySubIDsGrp DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.fixprotocol.components.DerivativeInstrumentPartySubIDsGrp();
  }

  public static org.fixprotocol.components.DerivativeInstrumentPartySubIDsGrp getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DerivativeInstrumentPartySubIDsGrp>
      PARSER = new com.google.protobuf.AbstractParser<DerivativeInstrumentPartySubIDsGrp>() {
    @java.lang.Override
    public DerivativeInstrumentPartySubIDsGrp parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DerivativeInstrumentPartySubIDsGrp(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DerivativeInstrumentPartySubIDsGrp> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DerivativeInstrumentPartySubIDsGrp> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.fixprotocol.components.DerivativeInstrumentPartySubIDsGrp getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

