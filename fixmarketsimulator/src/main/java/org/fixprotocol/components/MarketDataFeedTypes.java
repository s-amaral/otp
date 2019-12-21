// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package org.fixprotocol.components;

/**
 * Protobuf type {@code Common.MarketDataFeedTypes}
 */
public  final class MarketDataFeedTypes extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Common.MarketDataFeedTypes)
    MarketDataFeedTypesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MarketDataFeedTypes.newBuilder() to construct.
  private MarketDataFeedTypes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MarketDataFeedTypes() {
    mdBookType_ = 0;
    mdFeedType_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MarketDataFeedTypes();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MarketDataFeedTypes(
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
          case 9: {

            marketDepth_ = input.readSFixed64();
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            mdBookType_ = rawValue;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            mdFeedType_ = s;
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
    return org.fixprotocol.components.Common.internal_static_Common_MarketDataFeedTypes_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.fixprotocol.components.Common.internal_static_Common_MarketDataFeedTypes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.fixprotocol.components.MarketDataFeedTypes.class, org.fixprotocol.components.MarketDataFeedTypes.Builder.class);
  }

  public static final int MARKET_DEPTH_FIELD_NUMBER = 1;
  private long marketDepth_;
  /**
   * <code>sfixed64 market_depth = 1 [(.fix.tag) = 264, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  public long getMarketDepth() {
    return marketDepth_;
  }

  public static final int MD_BOOK_TYPE_FIELD_NUMBER = 2;
  private int mdBookType_;
  /**
   * <code>.Common.MDBookTypeEnum md_book_type = 2 [(.fix.tag) = 1021, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  public int getMdBookTypeValue() {
    return mdBookType_;
  }
  /**
   * <code>.Common.MDBookTypeEnum md_book_type = 2 [(.fix.tag) = 1021, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  public org.fixprotocol.components.MDBookTypeEnum getMdBookType() {
    @SuppressWarnings("deprecation")
    org.fixprotocol.components.MDBookTypeEnum result = org.fixprotocol.components.MDBookTypeEnum.valueOf(mdBookType_);
    return result == null ? org.fixprotocol.components.MDBookTypeEnum.UNRECOGNIZED : result;
  }

  public static final int MD_FEED_TYPE_FIELD_NUMBER = 3;
  private volatile java.lang.Object mdFeedType_;
  /**
   * <code>string md_feed_type = 3 [(.fix.tag) = 1022, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  public java.lang.String getMdFeedType() {
    java.lang.Object ref = mdFeedType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      mdFeedType_ = s;
      return s;
    }
  }
  /**
   * <code>string md_feed_type = 3 [(.fix.tag) = 1022, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  public com.google.protobuf.ByteString
      getMdFeedTypeBytes() {
    java.lang.Object ref = mdFeedType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      mdFeedType_ = b;
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
    if (marketDepth_ != 0L) {
      output.writeSFixed64(1, marketDepth_);
    }
    if (mdBookType_ != org.fixprotocol.components.MDBookTypeEnum.MD_BOOK_TYPE_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, mdBookType_);
    }
    if (!getMdFeedTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, mdFeedType_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (marketDepth_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeSFixed64Size(1, marketDepth_);
    }
    if (mdBookType_ != org.fixprotocol.components.MDBookTypeEnum.MD_BOOK_TYPE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, mdBookType_);
    }
    if (!getMdFeedTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, mdFeedType_);
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
    if (!(obj instanceof org.fixprotocol.components.MarketDataFeedTypes)) {
      return super.equals(obj);
    }
    org.fixprotocol.components.MarketDataFeedTypes other = (org.fixprotocol.components.MarketDataFeedTypes) obj;

    if (getMarketDepth()
        != other.getMarketDepth()) return false;
    if (mdBookType_ != other.mdBookType_) return false;
    if (!getMdFeedType()
        .equals(other.getMdFeedType())) return false;
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
    hash = (37 * hash) + MARKET_DEPTH_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getMarketDepth());
    hash = (37 * hash) + MD_BOOK_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + mdBookType_;
    hash = (37 * hash) + MD_FEED_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getMdFeedType().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.fixprotocol.components.MarketDataFeedTypes parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.fixprotocol.components.MarketDataFeedTypes parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.fixprotocol.components.MarketDataFeedTypes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.fixprotocol.components.MarketDataFeedTypes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.fixprotocol.components.MarketDataFeedTypes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.fixprotocol.components.MarketDataFeedTypes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.fixprotocol.components.MarketDataFeedTypes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.fixprotocol.components.MarketDataFeedTypes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.fixprotocol.components.MarketDataFeedTypes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.fixprotocol.components.MarketDataFeedTypes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.fixprotocol.components.MarketDataFeedTypes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.fixprotocol.components.MarketDataFeedTypes parseFrom(
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
  public static Builder newBuilder(org.fixprotocol.components.MarketDataFeedTypes prototype) {
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
   * Protobuf type {@code Common.MarketDataFeedTypes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Common.MarketDataFeedTypes)
      org.fixprotocol.components.MarketDataFeedTypesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.fixprotocol.components.Common.internal_static_Common_MarketDataFeedTypes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.fixprotocol.components.Common.internal_static_Common_MarketDataFeedTypes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.fixprotocol.components.MarketDataFeedTypes.class, org.fixprotocol.components.MarketDataFeedTypes.Builder.class);
    }

    // Construct using org.fixprotocol.components.MarketDataFeedTypes.newBuilder()
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
      marketDepth_ = 0L;

      mdBookType_ = 0;

      mdFeedType_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.fixprotocol.components.Common.internal_static_Common_MarketDataFeedTypes_descriptor;
    }

    @java.lang.Override
    public org.fixprotocol.components.MarketDataFeedTypes getDefaultInstanceForType() {
      return org.fixprotocol.components.MarketDataFeedTypes.getDefaultInstance();
    }

    @java.lang.Override
    public org.fixprotocol.components.MarketDataFeedTypes build() {
      org.fixprotocol.components.MarketDataFeedTypes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.fixprotocol.components.MarketDataFeedTypes buildPartial() {
      org.fixprotocol.components.MarketDataFeedTypes result = new org.fixprotocol.components.MarketDataFeedTypes(this);
      result.marketDepth_ = marketDepth_;
      result.mdBookType_ = mdBookType_;
      result.mdFeedType_ = mdFeedType_;
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
      if (other instanceof org.fixprotocol.components.MarketDataFeedTypes) {
        return mergeFrom((org.fixprotocol.components.MarketDataFeedTypes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.fixprotocol.components.MarketDataFeedTypes other) {
      if (other == org.fixprotocol.components.MarketDataFeedTypes.getDefaultInstance()) return this;
      if (other.getMarketDepth() != 0L) {
        setMarketDepth(other.getMarketDepth());
      }
      if (other.mdBookType_ != 0) {
        setMdBookTypeValue(other.getMdBookTypeValue());
      }
      if (!other.getMdFeedType().isEmpty()) {
        mdFeedType_ = other.mdFeedType_;
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
      org.fixprotocol.components.MarketDataFeedTypes parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.fixprotocol.components.MarketDataFeedTypes) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long marketDepth_ ;
    /**
     * <code>sfixed64 market_depth = 1 [(.fix.tag) = 264, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_5_0];</code>
     */
    public long getMarketDepth() {
      return marketDepth_;
    }
    /**
     * <code>sfixed64 market_depth = 1 [(.fix.tag) = 264, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_5_0];</code>
     */
    public Builder setMarketDepth(long value) {
      
      marketDepth_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>sfixed64 market_depth = 1 [(.fix.tag) = 264, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_5_0];</code>
     */
    public Builder clearMarketDepth() {
      
      marketDepth_ = 0L;
      onChanged();
      return this;
    }

    private int mdBookType_ = 0;
    /**
     * <code>.Common.MDBookTypeEnum md_book_type = 2 [(.fix.tag) = 1021, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_5_0];</code>
     */
    public int getMdBookTypeValue() {
      return mdBookType_;
    }
    /**
     * <code>.Common.MDBookTypeEnum md_book_type = 2 [(.fix.tag) = 1021, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_5_0];</code>
     */
    public Builder setMdBookTypeValue(int value) {
      mdBookType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.Common.MDBookTypeEnum md_book_type = 2 [(.fix.tag) = 1021, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_5_0];</code>
     */
    public org.fixprotocol.components.MDBookTypeEnum getMdBookType() {
      @SuppressWarnings("deprecation")
      org.fixprotocol.components.MDBookTypeEnum result = org.fixprotocol.components.MDBookTypeEnum.valueOf(mdBookType_);
      return result == null ? org.fixprotocol.components.MDBookTypeEnum.UNRECOGNIZED : result;
    }
    /**
     * <code>.Common.MDBookTypeEnum md_book_type = 2 [(.fix.tag) = 1021, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_5_0];</code>
     */
    public Builder setMdBookType(org.fixprotocol.components.MDBookTypeEnum value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      mdBookType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.Common.MDBookTypeEnum md_book_type = 2 [(.fix.tag) = 1021, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_5_0];</code>
     */
    public Builder clearMdBookType() {
      
      mdBookType_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object mdFeedType_ = "";
    /**
     * <code>string md_feed_type = 3 [(.fix.tag) = 1022, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_5_0];</code>
     */
    public java.lang.String getMdFeedType() {
      java.lang.Object ref = mdFeedType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        mdFeedType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string md_feed_type = 3 [(.fix.tag) = 1022, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_5_0];</code>
     */
    public com.google.protobuf.ByteString
        getMdFeedTypeBytes() {
      java.lang.Object ref = mdFeedType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        mdFeedType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string md_feed_type = 3 [(.fix.tag) = 1022, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_5_0];</code>
     */
    public Builder setMdFeedType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      mdFeedType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string md_feed_type = 3 [(.fix.tag) = 1022, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_5_0];</code>
     */
    public Builder clearMdFeedType() {
      
      mdFeedType_ = getDefaultInstance().getMdFeedType();
      onChanged();
      return this;
    }
    /**
     * <code>string md_feed_type = 3 [(.fix.tag) = 1022, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_5_0];</code>
     */
    public Builder setMdFeedTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      mdFeedType_ = value;
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


    // @@protoc_insertion_point(builder_scope:Common.MarketDataFeedTypes)
  }

  // @@protoc_insertion_point(class_scope:Common.MarketDataFeedTypes)
  private static final org.fixprotocol.components.MarketDataFeedTypes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.fixprotocol.components.MarketDataFeedTypes();
  }

  public static org.fixprotocol.components.MarketDataFeedTypes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MarketDataFeedTypes>
      PARSER = new com.google.protobuf.AbstractParser<MarketDataFeedTypes>() {
    @java.lang.Override
    public MarketDataFeedTypes parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MarketDataFeedTypes(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MarketDataFeedTypes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MarketDataFeedTypes> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.fixprotocol.components.MarketDataFeedTypes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
