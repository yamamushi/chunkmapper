// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PATH/HeightsContainer.proto

package com.chunkmapper.protoc;

public final class HeightsContainer {
  private HeightsContainer() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface HeightsOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // repeated int32 lats = 1 [packed = true];
    /**
     * <code>repeated int32 lats = 1 [packed = true];</code>
     */
    java.util.List<java.lang.Integer> getLatsList();
    /**
     * <code>repeated int32 lats = 1 [packed = true];</code>
     */
    int getLatsCount();
    /**
     * <code>repeated int32 lats = 1 [packed = true];</code>
     */
    int getLats(int index);

    // repeated int32 lons = 2 [packed = true];
    /**
     * <code>repeated int32 lons = 2 [packed = true];</code>
     */
    java.util.List<java.lang.Integer> getLonsList();
    /**
     * <code>repeated int32 lons = 2 [packed = true];</code>
     */
    int getLonsCount();
    /**
     * <code>repeated int32 lons = 2 [packed = true];</code>
     */
    int getLons(int index);
  }
  /**
   * Protobuf type {@code Heights}
   */
  public static final class Heights extends
      com.google.protobuf.GeneratedMessage
      implements HeightsOrBuilder {
    // Use Heights.newBuilder() to construct.
    private Heights(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private Heights(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final Heights defaultInstance;
    public static Heights getDefaultInstance() {
      return defaultInstance;
    }

    public Heights getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private Heights(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                lats_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000001;
              }
              lats_.add(input.readInt32());
              break;
            }
            case 10: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001) && input.getBytesUntilLimit() > 0) {
                lats_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                lats_.add(input.readInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 16: {
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                lons_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000002;
              }
              lons_.add(input.readInt32());
              break;
            }
            case 18: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002) && input.getBytesUntilLimit() > 0) {
                lons_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000002;
              }
              while (input.getBytesUntilLimit() > 0) {
                lons_.add(input.readInt32());
              }
              input.popLimit(limit);
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          lats_ = java.util.Collections.unmodifiableList(lats_);
        }
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          lons_ = java.util.Collections.unmodifiableList(lons_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.chunkmapper.protoc.HeightsContainer.internal_static_Heights_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.chunkmapper.protoc.HeightsContainer.internal_static_Heights_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.chunkmapper.protoc.HeightsContainer.Heights.class, com.chunkmapper.protoc.HeightsContainer.Heights.Builder.class);
    }

    public static com.google.protobuf.Parser<Heights> PARSER =
        new com.google.protobuf.AbstractParser<Heights>() {
      public Heights parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Heights(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<Heights> getParserForType() {
      return PARSER;
    }

    // repeated int32 lats = 1 [packed = true];
    public static final int LATS_FIELD_NUMBER = 1;
    private java.util.List<java.lang.Integer> lats_;
    /**
     * <code>repeated int32 lats = 1 [packed = true];</code>
     */
    public java.util.List<java.lang.Integer>
        getLatsList() {
      return lats_;
    }
    /**
     * <code>repeated int32 lats = 1 [packed = true];</code>
     */
    public int getLatsCount() {
      return lats_.size();
    }
    /**
     * <code>repeated int32 lats = 1 [packed = true];</code>
     */
    public int getLats(int index) {
      return lats_.get(index);
    }
    private int latsMemoizedSerializedSize = -1;

    // repeated int32 lons = 2 [packed = true];
    public static final int LONS_FIELD_NUMBER = 2;
    private java.util.List<java.lang.Integer> lons_;
    /**
     * <code>repeated int32 lons = 2 [packed = true];</code>
     */
    public java.util.List<java.lang.Integer>
        getLonsList() {
      return lons_;
    }
    /**
     * <code>repeated int32 lons = 2 [packed = true];</code>
     */
    public int getLonsCount() {
      return lons_.size();
    }
    /**
     * <code>repeated int32 lons = 2 [packed = true];</code>
     */
    public int getLons(int index) {
      return lons_.get(index);
    }
    private int lonsMemoizedSerializedSize = -1;

    private void initFields() {
      lats_ = java.util.Collections.emptyList();
      lons_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (getLatsList().size() > 0) {
        output.writeRawVarint32(10);
        output.writeRawVarint32(latsMemoizedSerializedSize);
      }
      for (int i = 0; i < lats_.size(); i++) {
        output.writeInt32NoTag(lats_.get(i));
      }
      if (getLonsList().size() > 0) {
        output.writeRawVarint32(18);
        output.writeRawVarint32(lonsMemoizedSerializedSize);
      }
      for (int i = 0; i < lons_.size(); i++) {
        output.writeInt32NoTag(lons_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < lats_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(lats_.get(i));
        }
        size += dataSize;
        if (!getLatsList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        latsMemoizedSerializedSize = dataSize;
      }
      {
        int dataSize = 0;
        for (int i = 0; i < lons_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(lons_.get(i));
        }
        size += dataSize;
        if (!getLonsList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        lonsMemoizedSerializedSize = dataSize;
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.chunkmapper.protoc.HeightsContainer.Heights parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chunkmapper.protoc.HeightsContainer.Heights parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chunkmapper.protoc.HeightsContainer.Heights parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chunkmapper.protoc.HeightsContainer.Heights parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chunkmapper.protoc.HeightsContainer.Heights parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chunkmapper.protoc.HeightsContainer.Heights parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.chunkmapper.protoc.HeightsContainer.Heights parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.chunkmapper.protoc.HeightsContainer.Heights parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.chunkmapper.protoc.HeightsContainer.Heights parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chunkmapper.protoc.HeightsContainer.Heights parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.chunkmapper.protoc.HeightsContainer.Heights prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code Heights}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.chunkmapper.protoc.HeightsContainer.HeightsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.chunkmapper.protoc.HeightsContainer.internal_static_Heights_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.chunkmapper.protoc.HeightsContainer.internal_static_Heights_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.chunkmapper.protoc.HeightsContainer.Heights.class, com.chunkmapper.protoc.HeightsContainer.Heights.Builder.class);
      }

      // Construct using com.chunkmapper.protoc.HeightsContainer.Heights.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        lats_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        lons_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.chunkmapper.protoc.HeightsContainer.internal_static_Heights_descriptor;
      }

      public com.chunkmapper.protoc.HeightsContainer.Heights getDefaultInstanceForType() {
        return com.chunkmapper.protoc.HeightsContainer.Heights.getDefaultInstance();
      }

      public com.chunkmapper.protoc.HeightsContainer.Heights build() {
        com.chunkmapper.protoc.HeightsContainer.Heights result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.chunkmapper.protoc.HeightsContainer.Heights buildPartial() {
        com.chunkmapper.protoc.HeightsContainer.Heights result = new com.chunkmapper.protoc.HeightsContainer.Heights(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          lats_ = java.util.Collections.unmodifiableList(lats_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.lats_ = lats_;
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          lons_ = java.util.Collections.unmodifiableList(lons_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.lons_ = lons_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.chunkmapper.protoc.HeightsContainer.Heights) {
          return mergeFrom((com.chunkmapper.protoc.HeightsContainer.Heights)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.chunkmapper.protoc.HeightsContainer.Heights other) {
        if (other == com.chunkmapper.protoc.HeightsContainer.Heights.getDefaultInstance()) return this;
        if (!other.lats_.isEmpty()) {
          if (lats_.isEmpty()) {
            lats_ = other.lats_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureLatsIsMutable();
            lats_.addAll(other.lats_);
          }
          onChanged();
        }
        if (!other.lons_.isEmpty()) {
          if (lons_.isEmpty()) {
            lons_ = other.lons_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureLonsIsMutable();
            lons_.addAll(other.lons_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.chunkmapper.protoc.HeightsContainer.Heights parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.chunkmapper.protoc.HeightsContainer.Heights) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // repeated int32 lats = 1 [packed = true];
      private java.util.List<java.lang.Integer> lats_ = java.util.Collections.emptyList();
      private void ensureLatsIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          lats_ = new java.util.ArrayList<java.lang.Integer>(lats_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated int32 lats = 1 [packed = true];</code>
       */
      public java.util.List<java.lang.Integer>
          getLatsList() {
        return java.util.Collections.unmodifiableList(lats_);
      }
      /**
       * <code>repeated int32 lats = 1 [packed = true];</code>
       */
      public int getLatsCount() {
        return lats_.size();
      }
      /**
       * <code>repeated int32 lats = 1 [packed = true];</code>
       */
      public int getLats(int index) {
        return lats_.get(index);
      }
      /**
       * <code>repeated int32 lats = 1 [packed = true];</code>
       */
      public Builder setLats(
          int index, int value) {
        ensureLatsIsMutable();
        lats_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 lats = 1 [packed = true];</code>
       */
      public Builder addLats(int value) {
        ensureLatsIsMutable();
        lats_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 lats = 1 [packed = true];</code>
       */
      public Builder addAllLats(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureLatsIsMutable();
        super.addAll(values, lats_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 lats = 1 [packed = true];</code>
       */
      public Builder clearLats() {
        lats_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      // repeated int32 lons = 2 [packed = true];
      private java.util.List<java.lang.Integer> lons_ = java.util.Collections.emptyList();
      private void ensureLonsIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          lons_ = new java.util.ArrayList<java.lang.Integer>(lons_);
          bitField0_ |= 0x00000002;
         }
      }
      /**
       * <code>repeated int32 lons = 2 [packed = true];</code>
       */
      public java.util.List<java.lang.Integer>
          getLonsList() {
        return java.util.Collections.unmodifiableList(lons_);
      }
      /**
       * <code>repeated int32 lons = 2 [packed = true];</code>
       */
      public int getLonsCount() {
        return lons_.size();
      }
      /**
       * <code>repeated int32 lons = 2 [packed = true];</code>
       */
      public int getLons(int index) {
        return lons_.get(index);
      }
      /**
       * <code>repeated int32 lons = 2 [packed = true];</code>
       */
      public Builder setLons(
          int index, int value) {
        ensureLonsIsMutable();
        lons_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 lons = 2 [packed = true];</code>
       */
      public Builder addLons(int value) {
        ensureLonsIsMutable();
        lons_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 lons = 2 [packed = true];</code>
       */
      public Builder addAllLons(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureLonsIsMutable();
        super.addAll(values, lons_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 lons = 2 [packed = true];</code>
       */
      public Builder clearLons() {
        lons_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:Heights)
    }

    static {
      defaultInstance = new Heights(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:Heights)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_Heights_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_Heights_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033PATH/HeightsContainer.proto\"-\n\007Heights" +
      "\022\020\n\004lats\030\001 \003(\005B\002\020\001\022\020\n\004lons\030\002 \003(\005B\002\020\001B\030\n\026" +
      "com.chunkmapper.protoc"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_Heights_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_Heights_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_Heights_descriptor,
              new java.lang.String[] { "Lats", "Lons", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
