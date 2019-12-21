// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package org.fixprotocol.components;

/**
 * Protobuf type {@code Common.CompIDReqGrp}
 */
public  final class CompIDReqGrp extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Common.CompIDReqGrp)
    CompIDReqGrpOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CompIDReqGrp.newBuilder() to construct.
  private CompIDReqGrp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CompIDReqGrp() {
    deskId_ = "";
    locationId_ = "";
    refCompId_ = "";
    refSubId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CompIDReqGrp();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CompIDReqGrp(
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

            deskId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            locationId_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            refCompId_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            refSubId_ = s;
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
    return org.fixprotocol.components.Common.internal_static_Common_CompIDReqGrp_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.fixprotocol.components.Common.internal_static_Common_CompIDReqGrp_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.fixprotocol.components.CompIDReqGrp.class, org.fixprotocol.components.CompIDReqGrp.Builder.class);
  }

  public static final int DESK_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object deskId_;
  /**
   * <code>string desk_id = 1 [(.fix.tag) = 284, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  public java.lang.String getDeskId() {
    java.lang.Object ref = deskId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      deskId_ = s;
      return s;
    }
  }
  /**
   * <code>string desk_id = 1 [(.fix.tag) = 284, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  public com.google.protobuf.ByteString
      getDeskIdBytes() {
    java.lang.Object ref = deskId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      deskId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LOCATION_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object locationId_;
  /**
   * <code>string location_id = 2 [(.fix.tag) = 283, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  public java.lang.String getLocationId() {
    java.lang.Object ref = locationId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      locationId_ = s;
      return s;
    }
  }
  /**
   * <code>string location_id = 2 [(.fix.tag) = 283, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  public com.google.protobuf.ByteString
      getLocationIdBytes() {
    java.lang.Object ref = locationId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      locationId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REF_COMP_ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object refCompId_;
  /**
   * <code>string ref_comp_id = 3 [(.fix.tag) = 930, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  public java.lang.String getRefCompId() {
    java.lang.Object ref = refCompId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      refCompId_ = s;
      return s;
    }
  }
  /**
   * <code>string ref_comp_id = 3 [(.fix.tag) = 930, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  public com.google.protobuf.ByteString
      getRefCompIdBytes() {
    java.lang.Object ref = refCompId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      refCompId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REF_SUB_ID_FIELD_NUMBER = 4;
  private volatile java.lang.Object refSubId_;
  /**
   * <code>string ref_sub_id = 4 [(.fix.tag) = 931, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  public java.lang.String getRefSubId() {
    java.lang.Object ref = refSubId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      refSubId_ = s;
      return s;
    }
  }
  /**
   * <code>string ref_sub_id = 4 [(.fix.tag) = 931, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  public com.google.protobuf.ByteString
      getRefSubIdBytes() {
    java.lang.Object ref = refSubId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      refSubId_ = b;
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
    if (!getDeskIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, deskId_);
    }
    if (!getLocationIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, locationId_);
    }
    if (!getRefCompIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, refCompId_);
    }
    if (!getRefSubIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, refSubId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getDeskIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, deskId_);
    }
    if (!getLocationIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, locationId_);
    }
    if (!getRefCompIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, refCompId_);
    }
    if (!getRefSubIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, refSubId_);
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
    if (!(obj instanceof org.fixprotocol.components.CompIDReqGrp)) {
      return super.equals(obj);
    }
    org.fixprotocol.components.CompIDReqGrp other = (org.fixprotocol.components.CompIDReqGrp) obj;

    if (!getDeskId()
        .equals(other.getDeskId())) return false;
    if (!getLocationId()
        .equals(other.getLocationId())) return false;
    if (!getRefCompId()
        .equals(other.getRefCompId())) return false;
    if (!getRefSubId()
        .equals(other.getRefSubId())) return false;
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
    hash = (37 * hash) + DESK_ID_FIELD_NUMBER;
    hash = (53 * hash) + getDeskId().hashCode();
    hash = (37 * hash) + LOCATION_ID_FIELD_NUMBER;
    hash = (53 * hash) + getLocationId().hashCode();
    hash = (37 * hash) + REF_COMP_ID_FIELD_NUMBER;
    hash = (53 * hash) + getRefCompId().hashCode();
    hash = (37 * hash) + REF_SUB_ID_FIELD_NUMBER;
    hash = (53 * hash) + getRefSubId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.fixprotocol.components.CompIDReqGrp parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.fixprotocol.components.CompIDReqGrp parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.fixprotocol.components.CompIDReqGrp parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.fixprotocol.components.CompIDReqGrp parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.fixprotocol.components.CompIDReqGrp parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.fixprotocol.components.CompIDReqGrp parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.fixprotocol.components.CompIDReqGrp parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.fixprotocol.components.CompIDReqGrp parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.fixprotocol.components.CompIDReqGrp parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.fixprotocol.components.CompIDReqGrp parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.fixprotocol.components.CompIDReqGrp parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.fixprotocol.components.CompIDReqGrp parseFrom(
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
  public static Builder newBuilder(org.fixprotocol.components.CompIDReqGrp prototype) {
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
   * Protobuf type {@code Common.CompIDReqGrp}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Common.CompIDReqGrp)
      org.fixprotocol.components.CompIDReqGrpOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.fixprotocol.components.Common.internal_static_Common_CompIDReqGrp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.fixprotocol.components.Common.internal_static_Common_CompIDReqGrp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.fixprotocol.components.CompIDReqGrp.class, org.fixprotocol.components.CompIDReqGrp.Builder.class);
    }

    // Construct using org.fixprotocol.components.CompIDReqGrp.newBuilder()
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
      deskId_ = "";

      locationId_ = "";

      refCompId_ = "";

      refSubId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.fixprotocol.components.Common.internal_static_Common_CompIDReqGrp_descriptor;
    }

    @java.lang.Override
    public org.fixprotocol.components.CompIDReqGrp getDefaultInstanceForType() {
      return org.fixprotocol.components.CompIDReqGrp.getDefaultInstance();
    }

    @java.lang.Override
    public org.fixprotocol.components.CompIDReqGrp build() {
      org.fixprotocol.components.CompIDReqGrp result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.fixprotocol.components.CompIDReqGrp buildPartial() {
      org.fixprotocol.components.CompIDReqGrp result = new org.fixprotocol.components.CompIDReqGrp(this);
      result.deskId_ = deskId_;
      result.locationId_ = locationId_;
      result.refCompId_ = refCompId_;
      result.refSubId_ = refSubId_;
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
      if (other instanceof org.fixprotocol.components.CompIDReqGrp) {
        return mergeFrom((org.fixprotocol.components.CompIDReqGrp)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.fixprotocol.components.CompIDReqGrp other) {
      if (other == org.fixprotocol.components.CompIDReqGrp.getDefaultInstance()) return this;
      if (!other.getDeskId().isEmpty()) {
        deskId_ = other.deskId_;
        onChanged();
      }
      if (!other.getLocationId().isEmpty()) {
        locationId_ = other.locationId_;
        onChanged();
      }
      if (!other.getRefCompId().isEmpty()) {
        refCompId_ = other.refCompId_;
        onChanged();
      }
      if (!other.getRefSubId().isEmpty()) {
        refSubId_ = other.refSubId_;
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
      org.fixprotocol.components.CompIDReqGrp parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.fixprotocol.components.CompIDReqGrp) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object deskId_ = "";
    /**
     * <code>string desk_id = 1 [(.fix.tag) = 284, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
     */
    public java.lang.String getDeskId() {
      java.lang.Object ref = deskId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        deskId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string desk_id = 1 [(.fix.tag) = 284, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
     */
    public com.google.protobuf.ByteString
        getDeskIdBytes() {
      java.lang.Object ref = deskId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        deskId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string desk_id = 1 [(.fix.tag) = 284, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
     */
    public Builder setDeskId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      deskId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string desk_id = 1 [(.fix.tag) = 284, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
     */
    public Builder clearDeskId() {
      
      deskId_ = getDefaultInstance().getDeskId();
      onChanged();
      return this;
    }
    /**
     * <code>string desk_id = 1 [(.fix.tag) = 284, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
     */
    public Builder setDeskIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      deskId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object locationId_ = "";
    /**
     * <code>string location_id = 2 [(.fix.tag) = 283, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
     */
    public java.lang.String getLocationId() {
      java.lang.Object ref = locationId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        locationId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string location_id = 2 [(.fix.tag) = 283, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
     */
    public com.google.protobuf.ByteString
        getLocationIdBytes() {
      java.lang.Object ref = locationId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        locationId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string location_id = 2 [(.fix.tag) = 283, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
     */
    public Builder setLocationId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      locationId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string location_id = 2 [(.fix.tag) = 283, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
     */
    public Builder clearLocationId() {
      
      locationId_ = getDefaultInstance().getLocationId();
      onChanged();
      return this;
    }
    /**
     * <code>string location_id = 2 [(.fix.tag) = 283, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
     */
    public Builder setLocationIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      locationId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object refCompId_ = "";
    /**
     * <code>string ref_comp_id = 3 [(.fix.tag) = 930, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
     */
    public java.lang.String getRefCompId() {
      java.lang.Object ref = refCompId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        refCompId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string ref_comp_id = 3 [(.fix.tag) = 930, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
     */
    public com.google.protobuf.ByteString
        getRefCompIdBytes() {
      java.lang.Object ref = refCompId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        refCompId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string ref_comp_id = 3 [(.fix.tag) = 930, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
     */
    public Builder setRefCompId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      refCompId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string ref_comp_id = 3 [(.fix.tag) = 930, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
     */
    public Builder clearRefCompId() {
      
      refCompId_ = getDefaultInstance().getRefCompId();
      onChanged();
      return this;
    }
    /**
     * <code>string ref_comp_id = 3 [(.fix.tag) = 930, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
     */
    public Builder setRefCompIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      refCompId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object refSubId_ = "";
    /**
     * <code>string ref_sub_id = 4 [(.fix.tag) = 931, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
     */
    public java.lang.String getRefSubId() {
      java.lang.Object ref = refSubId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        refSubId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string ref_sub_id = 4 [(.fix.tag) = 931, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
     */
    public com.google.protobuf.ByteString
        getRefSubIdBytes() {
      java.lang.Object ref = refSubId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        refSubId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string ref_sub_id = 4 [(.fix.tag) = 931, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
     */
    public Builder setRefSubId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      refSubId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string ref_sub_id = 4 [(.fix.tag) = 931, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
     */
    public Builder clearRefSubId() {
      
      refSubId_ = getDefaultInstance().getRefSubId();
      onChanged();
      return this;
    }
    /**
     * <code>string ref_sub_id = 4 [(.fix.tag) = 931, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
     */
    public Builder setRefSubIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      refSubId_ = value;
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


    // @@protoc_insertion_point(builder_scope:Common.CompIDReqGrp)
  }

  // @@protoc_insertion_point(class_scope:Common.CompIDReqGrp)
  private static final org.fixprotocol.components.CompIDReqGrp DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.fixprotocol.components.CompIDReqGrp();
  }

  public static org.fixprotocol.components.CompIDReqGrp getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CompIDReqGrp>
      PARSER = new com.google.protobuf.AbstractParser<CompIDReqGrp>() {
    @java.lang.Override
    public CompIDReqGrp parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CompIDReqGrp(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CompIDReqGrp> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CompIDReqGrp> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.fixprotocol.components.CompIDReqGrp getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

