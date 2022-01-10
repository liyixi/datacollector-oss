/*
 * Copyright 2017 StreamSets Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Oneof.proto

package com.streamsets.pipeline.lib.util;

public final class OneofProto {
  private OneofProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface OneofOrBuilder extends
      // @@protoc_insertion_point(interface_extends:util.Oneof)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int32 oneofInt = 10;</code>
     */
    int getOneofInt();

    /**
     * <code>optional string oneofString = 2;</code>
     */
    String getOneofString();
    /**
     * <code>optional string oneofString = 2;</code>
     */
    com.google.protobuf.ByteString
        getOneofStringBytes();

    public Oneof.OneofNameCase getOneofNameCase();
  }
  /**
   * Protobuf type {@code util.Oneof}
   */
  public  static final class Oneof extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:util.Oneof)
      OneofOrBuilder {
    // Use Oneof.newBuilder() to construct.
    private Oneof(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private Oneof() {
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private Oneof(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry) {
      this();
      int mutable_bitField0_ = 0;
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
                done = true;
              }
              break;
            }
            case 18: {
              String s = input.readStringRequireUtf8();
              oneofNameCase_ = 2;
              oneofName_ = s;
              break;
            }
            case 80: {
              oneofNameCase_ = 10;
              oneofName_ = input.readInt32();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw new RuntimeException(e.setUnfinishedMessage(this));
      } catch (java.io.IOException e) {
        throw new RuntimeException(
            new com.google.protobuf.InvalidProtocolBufferException(
                e.getMessage()).setUnfinishedMessage(this));
      } finally {
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return OneofProto.internal_static_util_Oneof_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return OneofProto.internal_static_util_Oneof_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Oneof.class, Builder.class);
    }

    private int oneofNameCase_ = 0;
    private Object oneofName_;
    public enum OneofNameCase
        implements com.google.protobuf.Internal.EnumLite {
      ONEOFINT(10),
      ONEOFSTRING(2),
      ONEOFNAME_NOT_SET(0);
      private int value = 0;
      private OneofNameCase(int value) {
        this.value = value;
      }
      public static OneofNameCase valueOf(int value) {
        switch (value) {
          case 10: return ONEOFINT;
          case 2: return ONEOFSTRING;
          case 0: return ONEOFNAME_NOT_SET;
          default: throw new IllegalArgumentException(
            "Value is undefined for this oneof enum.");
        }
      }
      public int getNumber() {
        return this.value;
      }
    };

    public OneofNameCase
    getOneofNameCase() {
      return OneofNameCase.valueOf(
          oneofNameCase_);
    }

    public static final int ONEOFINT_FIELD_NUMBER = 10;
    /**
     * <code>optional int32 oneofInt = 10;</code>
     */
    public int getOneofInt() {
      if (oneofNameCase_ == 10) {
        return (Integer) oneofName_;
      }
      return 0;
    }

    public static final int ONEOFSTRING_FIELD_NUMBER = 2;
    /**
     * <code>optional string oneofString = 2;</code>
     */
    public String getOneofString() {
      Object ref = "";
      if (oneofNameCase_ == 2) {
        ref = oneofName_;
      }
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (oneofNameCase_ == 2) {
          oneofName_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string oneofString = 2;</code>
     */
    public com.google.protobuf.ByteString
        getOneofStringBytes() {
      Object ref = "";
      if (oneofNameCase_ == 2) {
        ref = oneofName_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        if (oneofNameCase_ == 2) {
          oneofName_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (oneofNameCase_ == 2) {
        com.google.protobuf.GeneratedMessage.writeString(output, 2, oneofName_);
      }
      if (oneofNameCase_ == 10) {
        output.writeInt32(
            10, (int)((Integer) oneofName_));
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (oneofNameCase_ == 2) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(2, oneofName_);
      }
      if (oneofNameCase_ == 10) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(
              10, (int)((Integer) oneofName_));
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    public static Oneof parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Oneof parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Oneof parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Oneof parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Oneof parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static Oneof parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static Oneof parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static Oneof parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static Oneof parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static Oneof parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(Oneof prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code util.Oneof}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:util.Oneof)
        OneofOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return OneofProto.internal_static_util_Oneof_descriptor;
      }

      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return OneofProto.internal_static_util_Oneof_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                Oneof.class, Builder.class);
      }

      // Construct using com.streamsets.pipeline.lib.util.OneofProto.Oneof.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        oneofNameCase_ = 0;
        oneofName_ = null;
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return OneofProto.internal_static_util_Oneof_descriptor;
      }

      public Oneof getDefaultInstanceForType() {
        return Oneof.getDefaultInstance();
      }

      public Oneof build() {
        Oneof result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public Oneof buildPartial() {
        Oneof result = new Oneof(this);
        if (oneofNameCase_ == 10) {
          result.oneofName_ = oneofName_;
        }
        if (oneofNameCase_ == 2) {
          result.oneofName_ = oneofName_;
        }
        result.oneofNameCase_ = oneofNameCase_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof Oneof) {
          return mergeFrom((Oneof)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(Oneof other) {
        if (other == Oneof.getDefaultInstance()) return this;
        switch (other.getOneofNameCase()) {
          case ONEOFINT: {
            setOneofInt(other.getOneofInt());
            break;
          }
          case ONEOFSTRING: {
            oneofNameCase_ = 2;
            oneofName_ = other.oneofName_;
            onChanged();
            break;
          }
          case ONEOFNAME_NOT_SET: {
            break;
          }
        }
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        Oneof parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (Oneof) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int oneofNameCase_ = 0;
      private Object oneofName_;
      public OneofNameCase
          getOneofNameCase() {
        return OneofNameCase.valueOf(
            oneofNameCase_);
      }

      public Builder clearOneofName() {
        oneofNameCase_ = 0;
        oneofName_ = null;
        onChanged();
        return this;
      }


      /**
       * <code>optional int32 oneofInt = 10;</code>
       */
      public int getOneofInt() {
        if (oneofNameCase_ == 10) {
          return (Integer) oneofName_;
        }
        return 0;
      }
      /**
       * <code>optional int32 oneofInt = 10;</code>
       */
      public Builder setOneofInt(int value) {
        oneofNameCase_ = 10;
        oneofName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 oneofInt = 10;</code>
       */
      public Builder clearOneofInt() {
        if (oneofNameCase_ == 10) {
          oneofNameCase_ = 0;
          oneofName_ = null;
          onChanged();
        }
        return this;
      }

      /**
       * <code>optional string oneofString = 2;</code>
       */
      public String getOneofString() {
        Object ref = "";
        if (oneofNameCase_ == 2) {
          ref = oneofName_;
        }
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          if (oneofNameCase_ == 2) {
            oneofName_ = s;
          }
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>optional string oneofString = 2;</code>
       */
      public com.google.protobuf.ByteString
          getOneofStringBytes() {
        Object ref = "";
        if (oneofNameCase_ == 2) {
          ref = oneofName_;
        }
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          if (oneofNameCase_ == 2) {
            oneofName_ = b;
          }
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string oneofString = 2;</code>
       */
      public Builder setOneofString(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  oneofNameCase_ = 2;
        oneofName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string oneofString = 2;</code>
       */
      public Builder clearOneofString() {
        if (oneofNameCase_ == 2) {
          oneofNameCase_ = 0;
          oneofName_ = null;
          onChanged();
        }
        return this;
      }
      /**
       * <code>optional string oneofString = 2;</code>
       */
      public Builder setOneofStringBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        oneofNameCase_ = 2;
        oneofName_ = value;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:util.Oneof)
    }

    // @@protoc_insertion_point(class_scope:util.Oneof)
    private static final Oneof DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new Oneof();
    }

    public static Oneof getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Oneof>
        PARSER = new com.google.protobuf.AbstractParser<Oneof>() {
      public Oneof parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        try {
          return new Oneof(input, extensionRegistry);
        } catch (RuntimeException e) {
          if (e.getCause() instanceof
              com.google.protobuf.InvalidProtocolBufferException) {
            throw (com.google.protobuf.InvalidProtocolBufferException)
                e.getCause();
          }
          throw e;
        }
      }
    };

    public static com.google.protobuf.Parser<Oneof> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<Oneof> getParserForType() {
      return PARSER;
    }

    public Oneof getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_util_Oneof_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_util_Oneof_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\013Oneof.proto\022\004util\"@\n\005Oneof\022\022\n\010oneofInt" +
      "\030\n \001(\005H\000\022\025\n\013oneofString\030\002 \001(\tH\000B\014\n\noneof" +
      "_nameB.\n com.streamsets.pipeline.lib.uti" +
      "lB\nOneofProtob\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_util_Oneof_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_util_Oneof_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_util_Oneof_descriptor,
        new String[] { "OneofInt", "OneofString", "OneofName", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
