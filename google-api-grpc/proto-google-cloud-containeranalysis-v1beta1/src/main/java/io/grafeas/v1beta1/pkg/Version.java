// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/containeranalysis/v1beta1/package/package.proto

package io.grafeas.v1beta1.pkg;

/**
 * <pre>
 * Version contains structured information about the version of a package.
 * </pre>
 *
 * Protobuf type {@code grafeas.v1beta1.package.Version}
 */
public  final class Version extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:grafeas.v1beta1.package.Version)
    VersionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Version.newBuilder() to construct.
  private Version(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Version() {
    epoch_ = 0;
    name_ = "";
    revision_ = "";
    kind_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Version(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 8: {

            epoch_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            revision_ = s;
            break;
          }
          case 32: {
            int rawValue = input.readEnum();

            kind_ = rawValue;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
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
    return io.grafeas.v1beta1.pkg.PackageOuterClass.internal_static_grafeas_v1beta1_package_Version_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grafeas.v1beta1.pkg.PackageOuterClass.internal_static_grafeas_v1beta1_package_Version_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grafeas.v1beta1.pkg.Version.class, io.grafeas.v1beta1.pkg.Version.Builder.class);
  }

  /**
   * <pre>
   * Whether this is an ordinary package version or a sentinel MIN/MAX version.
   * </pre>
   *
   * Protobuf enum {@code grafeas.v1beta1.package.Version.VersionKind}
   */
  public enum VersionKind
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Unknown.
     * </pre>
     *
     * <code>VERSION_KIND_UNSPECIFIED = 0;</code>
     */
    VERSION_KIND_UNSPECIFIED(0),
    /**
     * <pre>
     * A standard package version, defined by the other fields.
     * </pre>
     *
     * <code>NORMAL = 1;</code>
     */
    NORMAL(1),
    /**
     * <pre>
     * A special version representing negative infinity, other fields are
     * ignored.
     * </pre>
     *
     * <code>MINIMUM = 2;</code>
     */
    MINIMUM(2),
    /**
     * <pre>
     * A special version representing positive infinity, other fields are
     * ignored.
     * </pre>
     *
     * <code>MAXIMUM = 3;</code>
     */
    MAXIMUM(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Unknown.
     * </pre>
     *
     * <code>VERSION_KIND_UNSPECIFIED = 0;</code>
     */
    public static final int VERSION_KIND_UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * A standard package version, defined by the other fields.
     * </pre>
     *
     * <code>NORMAL = 1;</code>
     */
    public static final int NORMAL_VALUE = 1;
    /**
     * <pre>
     * A special version representing negative infinity, other fields are
     * ignored.
     * </pre>
     *
     * <code>MINIMUM = 2;</code>
     */
    public static final int MINIMUM_VALUE = 2;
    /**
     * <pre>
     * A special version representing positive infinity, other fields are
     * ignored.
     * </pre>
     *
     * <code>MAXIMUM = 3;</code>
     */
    public static final int MAXIMUM_VALUE = 3;


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
    public static VersionKind valueOf(int value) {
      return forNumber(value);
    }

    public static VersionKind forNumber(int value) {
      switch (value) {
        case 0: return VERSION_KIND_UNSPECIFIED;
        case 1: return NORMAL;
        case 2: return MINIMUM;
        case 3: return MAXIMUM;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<VersionKind>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        VersionKind> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<VersionKind>() {
            public VersionKind findValueByNumber(int number) {
              return VersionKind.forNumber(number);
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
      return io.grafeas.v1beta1.pkg.Version.getDescriptor().getEnumTypes().get(0);
    }

    private static final VersionKind[] VALUES = values();

    public static VersionKind valueOf(
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

    private VersionKind(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:grafeas.v1beta1.package.Version.VersionKind)
  }

  public static final int EPOCH_FIELD_NUMBER = 1;
  private int epoch_;
  /**
   * <pre>
   * Used to correct mistakes in the version numbering scheme.
   * </pre>
   *
   * <code>int32 epoch = 1;</code>
   */
  public int getEpoch() {
    return epoch_;
  }

  public static final int NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * The main part of the version name.
   * </pre>
   *
   * <code>string name = 2;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The main part of the version name.
   * </pre>
   *
   * <code>string name = 2;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REVISION_FIELD_NUMBER = 3;
  private volatile java.lang.Object revision_;
  /**
   * <pre>
   * The iteration of the package build from the above version.
   * </pre>
   *
   * <code>string revision = 3;</code>
   */
  public java.lang.String getRevision() {
    java.lang.Object ref = revision_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      revision_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The iteration of the package build from the above version.
   * </pre>
   *
   * <code>string revision = 3;</code>
   */
  public com.google.protobuf.ByteString
      getRevisionBytes() {
    java.lang.Object ref = revision_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      revision_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int KIND_FIELD_NUMBER = 4;
  private int kind_;
  /**
   * <pre>
   * Distinguish between sentinel MIN/MAX versions and normal versions. If
   * kind is not NORMAL, then the other fields are ignored.
   * </pre>
   *
   * <code>.grafeas.v1beta1.package.Version.VersionKind kind = 4;</code>
   */
  public int getKindValue() {
    return kind_;
  }
  /**
   * <pre>
   * Distinguish between sentinel MIN/MAX versions and normal versions. If
   * kind is not NORMAL, then the other fields are ignored.
   * </pre>
   *
   * <code>.grafeas.v1beta1.package.Version.VersionKind kind = 4;</code>
   */
  public io.grafeas.v1beta1.pkg.Version.VersionKind getKind() {
    @SuppressWarnings("deprecation")
    io.grafeas.v1beta1.pkg.Version.VersionKind result = io.grafeas.v1beta1.pkg.Version.VersionKind.valueOf(kind_);
    return result == null ? io.grafeas.v1beta1.pkg.Version.VersionKind.UNRECOGNIZED : result;
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
    if (epoch_ != 0) {
      output.writeInt32(1, epoch_);
    }
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
    }
    if (!getRevisionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, revision_);
    }
    if (kind_ != io.grafeas.v1beta1.pkg.Version.VersionKind.VERSION_KIND_UNSPECIFIED.getNumber()) {
      output.writeEnum(4, kind_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (epoch_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, epoch_);
    }
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
    }
    if (!getRevisionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, revision_);
    }
    if (kind_ != io.grafeas.v1beta1.pkg.Version.VersionKind.VERSION_KIND_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, kind_);
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
    if (!(obj instanceof io.grafeas.v1beta1.pkg.Version)) {
      return super.equals(obj);
    }
    io.grafeas.v1beta1.pkg.Version other = (io.grafeas.v1beta1.pkg.Version) obj;

    boolean result = true;
    result = result && (getEpoch()
        == other.getEpoch());
    result = result && getName()
        .equals(other.getName());
    result = result && getRevision()
        .equals(other.getRevision());
    result = result && kind_ == other.kind_;
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + EPOCH_FIELD_NUMBER;
    hash = (53 * hash) + getEpoch();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + REVISION_FIELD_NUMBER;
    hash = (53 * hash) + getRevision().hashCode();
    hash = (37 * hash) + KIND_FIELD_NUMBER;
    hash = (53 * hash) + kind_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grafeas.v1beta1.pkg.Version parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grafeas.v1beta1.pkg.Version parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grafeas.v1beta1.pkg.Version parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grafeas.v1beta1.pkg.Version parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grafeas.v1beta1.pkg.Version parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grafeas.v1beta1.pkg.Version parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grafeas.v1beta1.pkg.Version parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grafeas.v1beta1.pkg.Version parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grafeas.v1beta1.pkg.Version parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grafeas.v1beta1.pkg.Version parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grafeas.v1beta1.pkg.Version parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grafeas.v1beta1.pkg.Version parseFrom(
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
  public static Builder newBuilder(io.grafeas.v1beta1.pkg.Version prototype) {
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
   * <pre>
   * Version contains structured information about the version of a package.
   * </pre>
   *
   * Protobuf type {@code grafeas.v1beta1.package.Version}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:grafeas.v1beta1.package.Version)
      io.grafeas.v1beta1.pkg.VersionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grafeas.v1beta1.pkg.PackageOuterClass.internal_static_grafeas_v1beta1_package_Version_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grafeas.v1beta1.pkg.PackageOuterClass.internal_static_grafeas_v1beta1_package_Version_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grafeas.v1beta1.pkg.Version.class, io.grafeas.v1beta1.pkg.Version.Builder.class);
    }

    // Construct using io.grafeas.v1beta1.pkg.Version.newBuilder()
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
      epoch_ = 0;

      name_ = "";

      revision_ = "";

      kind_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grafeas.v1beta1.pkg.PackageOuterClass.internal_static_grafeas_v1beta1_package_Version_descriptor;
    }

    @java.lang.Override
    public io.grafeas.v1beta1.pkg.Version getDefaultInstanceForType() {
      return io.grafeas.v1beta1.pkg.Version.getDefaultInstance();
    }

    @java.lang.Override
    public io.grafeas.v1beta1.pkg.Version build() {
      io.grafeas.v1beta1.pkg.Version result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grafeas.v1beta1.pkg.Version buildPartial() {
      io.grafeas.v1beta1.pkg.Version result = new io.grafeas.v1beta1.pkg.Version(this);
      result.epoch_ = epoch_;
      result.name_ = name_;
      result.revision_ = revision_;
      result.kind_ = kind_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.grafeas.v1beta1.pkg.Version) {
        return mergeFrom((io.grafeas.v1beta1.pkg.Version)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grafeas.v1beta1.pkg.Version other) {
      if (other == io.grafeas.v1beta1.pkg.Version.getDefaultInstance()) return this;
      if (other.getEpoch() != 0) {
        setEpoch(other.getEpoch());
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.getRevision().isEmpty()) {
        revision_ = other.revision_;
        onChanged();
      }
      if (other.kind_ != 0) {
        setKindValue(other.getKindValue());
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
      io.grafeas.v1beta1.pkg.Version parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grafeas.v1beta1.pkg.Version) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int epoch_ ;
    /**
     * <pre>
     * Used to correct mistakes in the version numbering scheme.
     * </pre>
     *
     * <code>int32 epoch = 1;</code>
     */
    public int getEpoch() {
      return epoch_;
    }
    /**
     * <pre>
     * Used to correct mistakes in the version numbering scheme.
     * </pre>
     *
     * <code>int32 epoch = 1;</code>
     */
    public Builder setEpoch(int value) {
      
      epoch_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Used to correct mistakes in the version numbering scheme.
     * </pre>
     *
     * <code>int32 epoch = 1;</code>
     */
    public Builder clearEpoch() {
      
      epoch_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * The main part of the version name.
     * </pre>
     *
     * <code>string name = 2;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The main part of the version name.
     * </pre>
     *
     * <code>string name = 2;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The main part of the version name.
     * </pre>
     *
     * <code>string name = 2;</code>
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The main part of the version name.
     * </pre>
     *
     * <code>string name = 2;</code>
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The main part of the version name.
     * </pre>
     *
     * <code>string name = 2;</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object revision_ = "";
    /**
     * <pre>
     * The iteration of the package build from the above version.
     * </pre>
     *
     * <code>string revision = 3;</code>
     */
    public java.lang.String getRevision() {
      java.lang.Object ref = revision_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        revision_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The iteration of the package build from the above version.
     * </pre>
     *
     * <code>string revision = 3;</code>
     */
    public com.google.protobuf.ByteString
        getRevisionBytes() {
      java.lang.Object ref = revision_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        revision_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The iteration of the package build from the above version.
     * </pre>
     *
     * <code>string revision = 3;</code>
     */
    public Builder setRevision(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      revision_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The iteration of the package build from the above version.
     * </pre>
     *
     * <code>string revision = 3;</code>
     */
    public Builder clearRevision() {
      
      revision_ = getDefaultInstance().getRevision();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The iteration of the package build from the above version.
     * </pre>
     *
     * <code>string revision = 3;</code>
     */
    public Builder setRevisionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      revision_ = value;
      onChanged();
      return this;
    }

    private int kind_ = 0;
    /**
     * <pre>
     * Distinguish between sentinel MIN/MAX versions and normal versions. If
     * kind is not NORMAL, then the other fields are ignored.
     * </pre>
     *
     * <code>.grafeas.v1beta1.package.Version.VersionKind kind = 4;</code>
     */
    public int getKindValue() {
      return kind_;
    }
    /**
     * <pre>
     * Distinguish between sentinel MIN/MAX versions and normal versions. If
     * kind is not NORMAL, then the other fields are ignored.
     * </pre>
     *
     * <code>.grafeas.v1beta1.package.Version.VersionKind kind = 4;</code>
     */
    public Builder setKindValue(int value) {
      kind_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Distinguish between sentinel MIN/MAX versions and normal versions. If
     * kind is not NORMAL, then the other fields are ignored.
     * </pre>
     *
     * <code>.grafeas.v1beta1.package.Version.VersionKind kind = 4;</code>
     */
    public io.grafeas.v1beta1.pkg.Version.VersionKind getKind() {
      @SuppressWarnings("deprecation")
      io.grafeas.v1beta1.pkg.Version.VersionKind result = io.grafeas.v1beta1.pkg.Version.VersionKind.valueOf(kind_);
      return result == null ? io.grafeas.v1beta1.pkg.Version.VersionKind.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Distinguish between sentinel MIN/MAX versions and normal versions. If
     * kind is not NORMAL, then the other fields are ignored.
     * </pre>
     *
     * <code>.grafeas.v1beta1.package.Version.VersionKind kind = 4;</code>
     */
    public Builder setKind(io.grafeas.v1beta1.pkg.Version.VersionKind value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      kind_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Distinguish between sentinel MIN/MAX versions and normal versions. If
     * kind is not NORMAL, then the other fields are ignored.
     * </pre>
     *
     * <code>.grafeas.v1beta1.package.Version.VersionKind kind = 4;</code>
     */
    public Builder clearKind() {
      
      kind_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:grafeas.v1beta1.package.Version)
  }

  // @@protoc_insertion_point(class_scope:grafeas.v1beta1.package.Version)
  private static final io.grafeas.v1beta1.pkg.Version DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grafeas.v1beta1.pkg.Version();
  }

  public static io.grafeas.v1beta1.pkg.Version getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Version>
      PARSER = new com.google.protobuf.AbstractParser<Version>() {
    @java.lang.Override
    public Version parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Version(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Version> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Version> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grafeas.v1beta1.pkg.Version getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
