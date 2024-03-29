package serializable.protobuf;

public final class PersonOuterClass {
    private PersonOuterClass() {}
    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistry registry) {
    }
    public interface PersonOrBuilder extends
            // @@protoc_insertion_point(interface_extends:Person)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>required string name = 1;</code>
         */
        boolean hasName();
        /**
         * <code>required string name = 1;</code>
         */
        String getName();
        /**
         * <code>required string name = 1;</code>
         */
        com.google.protobuf.ByteString
        getNameBytes();

        /**
         * <code>required int32 id = 2;</code>
         */
        boolean hasId();
        /**
         * <code>required int32 id = 2;</code>
         */
        int getId();

        /**
         * <code>required string email = 3;</code>
         */
        boolean hasEmail();
        /**
         * <code>required string email = 3;</code>
         */
        String getEmail();
        /**
         * <code>required string email = 3;</code>
         */
        com.google.protobuf.ByteString
        getEmailBytes();
    }
    /**
     * Protobuf type {@code Person}
     */
    public static final class Person extends
            com.google.protobuf.GeneratedMessage implements
            // @@protoc_insertion_point(message_implements:Person)
            PersonOrBuilder {
        // Use Person.newBuilder() to construct.
        private Person(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.unknownFields = builder.getUnknownFields();
        }
        private Person(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

        private static final Person defaultInstance;
        public static Person getDefaultInstance() {
            return defaultInstance;
        }

        public Person getDefaultInstanceForType() {
            return defaultInstance;
        }

        private final com.google.protobuf.UnknownFieldSet unknownFields;
        @Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private Person(
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
                        case 10: {
                            com.google.protobuf.ByteString bs = input.readBytes();
                            bitField0_ |= 0x00000001;
                            name_ = bs;
                            break;
                        }
                        case 16: {
                            bitField0_ |= 0x00000002;
                            id_ = input.readInt32();
                            break;
                        }
                        case 26: {
                            com.google.protobuf.ByteString bs = input.readBytes();
                            bitField0_ |= 0x00000004;
                            email_ = bs;
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
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return PersonOuterClass.internal_static_Person_descriptor;
        }

        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return PersonOuterClass.internal_static_Person_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            Person.class, Builder.class);
        }

        public static com.google.protobuf.Parser<Person> PARSER =
                new com.google.protobuf.AbstractParser<Person>() {
                    public Person parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new Person(input, extensionRegistry);
                    }
                };

        @Override
        public com.google.protobuf.Parser<Person> getParserForType() {
            return PARSER;
        }

        private int bitField0_;
        public static final int NAME_FIELD_NUMBER = 1;
        private Object name_;
        /**
         * <code>required string name = 1;</code>
         */
        public boolean hasName() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        /**
         * <code>required string name = 1;</code>
         */
        public String getName() {
            Object ref = name_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    name_ = s;
                }
                return s;
            }
        }
        /**
         * <code>required string name = 1;</code>
         */
        public com.google.protobuf.ByteString
        getNameBytes() {
            Object ref = name_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                name_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int ID_FIELD_NUMBER = 2;
        private int id_;
        /**
         * <code>required int32 id = 2;</code>
         */
        public boolean hasId() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }
        /**
         * <code>required int32 id = 2;</code>
         */
        public int getId() {
            return id_;
        }

        public static final int EMAIL_FIELD_NUMBER = 3;
        private Object email_;
        /**
         * <code>required string email = 3;</code>
         */
        public boolean hasEmail() {
            return ((bitField0_ & 0x00000004) == 0x00000004);
        }
        /**
         * <code>required string email = 3;</code>
         */
        public String getEmail() {
            Object ref = email_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    email_ = s;
                }
                return s;
            }
        }
        /**
         * <code>required string email = 3;</code>
         */
        public com.google.protobuf.ByteString
        getEmailBytes() {
            Object ref = email_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                email_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        private void initFields() {
            name_ = "";
            id_ = 0;
            email_ = "";
        }
        private byte memoizedIsInitialized = -1;
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            if (!hasName()) {
                memoizedIsInitialized = 0;
                return false;
            }
            if (!hasId()) {
                memoizedIsInitialized = 0;
                return false;
            }
            if (!hasEmail()) {
                memoizedIsInitialized = 0;
                return false;
            }
            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            getSerializedSize();
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                output.writeBytes(1, getNameBytes());
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                output.writeInt32(2, id_);
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                output.writeBytes(3, getEmailBytes());
            }
            getUnknownFields().writeTo(output);
        }

        private int memoizedSerializedSize = -1;
        public int getSerializedSize() {
            int size = memoizedSerializedSize;
            if (size != -1) return size;

            size = 0;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(1, getNameBytes());
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(2, id_);
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(3, getEmailBytes());
            }
            size += getUnknownFields().getSerializedSize();
            memoizedSerializedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;
        @Override
        protected Object writeReplace()
                throws java.io.ObjectStreamException {
            return super.writeReplace();
        }

        public static Person parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static Person parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static Person parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static Person parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static Person parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static Person parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }
        public static Person parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input);
        }
        public static Person parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input, extensionRegistry);
        }
        public static Person parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static Person parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() { return Builder.create(); }
        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder(Person prototype) {
            return newBuilder().mergeFrom(prototype);
        }
        public Builder toBuilder() { return newBuilder(this); }

        @Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * Protobuf type {@code Person}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessage.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:Person)
                PersonOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return PersonOuterClass.internal_static_Person_descriptor;
            }

            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return PersonOuterClass.internal_static_Person_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                Person.class, Builder.class);
            }

            // Construct using PersonOuterClass.Person.newBuilder()
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
                name_ = "";
                bitField0_ = (bitField0_ & ~0x00000001);
                id_ = 0;
                bitField0_ = (bitField0_ & ~0x00000002);
                email_ = "";
                bitField0_ = (bitField0_ & ~0x00000004);
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return PersonOuterClass.internal_static_Person_descriptor;
            }

            public Person getDefaultInstanceForType() {
                return Person.getDefaultInstance();
            }

            public Person build() {
                Person result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public Person buildPartial() {
                Person result = new Person(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.name_ = name_;
                if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                    to_bitField0_ |= 0x00000002;
                }
                result.id_ = id_;
                if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
                    to_bitField0_ |= 0x00000004;
                }
                result.email_ = email_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof Person) {
                    return mergeFrom((Person)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(Person other) {
                if (other == Person.getDefaultInstance()) return this;
                if (other.hasName()) {
                    bitField0_ |= 0x00000001;
                    name_ = other.name_;
                    onChanged();
                }
                if (other.hasId()) {
                    setId(other.getId());
                }
                if (other.hasEmail()) {
                    bitField0_ |= 0x00000004;
                    email_ = other.email_;
                    onChanged();
                }
                this.mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasName()) {

                    return false;
                }
                if (!hasId()) {

                    return false;
                }
                if (!hasEmail()) {

                    return false;
                }
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                Person parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (Person) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            private int bitField0_;

            private Object name_ = "";
            /**
             * <code>required string name = 1;</code>
             */
            public boolean hasName() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            /**
             * <code>required string name = 1;</code>
             */
            public String getName() {
                Object ref = name_;
                if (!(ref instanceof String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) {
                        name_ = s;
                    }
                    return s;
                } else {
                    return (String) ref;
                }
            }
            /**
             * <code>required string name = 1;</code>
             */
            public com.google.protobuf.ByteString
            getNameBytes() {
                Object ref = name_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (String) ref);
                    name_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>required string name = 1;</code>
             */
            public Builder setName(
                    String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000001;
                name_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>required string name = 1;</code>
             */
            public Builder clearName() {
                bitField0_ = (bitField0_ & ~0x00000001);
                name_ = getDefaultInstance().getName();
                onChanged();
                return this;
            }
            /**
             * <code>required string name = 1;</code>
             */
            public Builder setNameBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000001;
                name_ = value;
                onChanged();
                return this;
            }

            private int id_ ;
            /**
             * <code>required int32 id = 2;</code>
             */
            public boolean hasId() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }
            /**
             * <code>required int32 id = 2;</code>
             */
            public int getId() {
                return id_;
            }
            /**
             * <code>required int32 id = 2;</code>
             */
            public Builder setId(int value) {
                bitField0_ |= 0x00000002;
                id_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>required int32 id = 2;</code>
             */
            public Builder clearId() {
                bitField0_ = (bitField0_ & ~0x00000002);
                id_ = 0;
                onChanged();
                return this;
            }

            private Object email_ = "";
            /**
             * <code>required string email = 3;</code>
             */
            public boolean hasEmail() {
                return ((bitField0_ & 0x00000004) == 0x00000004);
            }
            /**
             * <code>required string email = 3;</code>
             */
            public String getEmail() {
                Object ref = email_;
                if (!(ref instanceof String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) {
                        email_ = s;
                    }
                    return s;
                } else {
                    return (String) ref;
                }
            }
            /**
             * <code>required string email = 3;</code>
             */
            public com.google.protobuf.ByteString
            getEmailBytes() {
                Object ref = email_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (String) ref);
                    email_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>required string email = 3;</code>
             */
            public Builder setEmail(
                    String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000004;
                email_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>required string email = 3;</code>
             */
            public Builder clearEmail() {
                bitField0_ = (bitField0_ & ~0x00000004);
                email_ = getDefaultInstance().getEmail();
                onChanged();
                return this;
            }
            /**
             * <code>required string email = 3;</code>
             */
            public Builder setEmailBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000004;
                email_ = value;
                onChanged();
                return this;
            }

            // @@protoc_insertion_point(builder_scope:Person)
        }

        static {
            defaultInstance = new Person(true);
            defaultInstance.initFields();
        }

        // @@protoc_insertion_point(class_scope:Person)
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_Person_descriptor;
    private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internal_static_Person_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor
    getDescriptor() {
        return descriptor;
    }
    private static com.google.protobuf.Descriptors.FileDescriptor
            descriptor;
    static {
        String[] descriptorData = {
                "\n\014Person.proto\"1\n\006Person\022\014\n\004name\030\001 \002(\t\022\n" +
                        "\n\002id\030\002 \002(\005\022\r\n\005email\030\003 \002(\t"
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
        internal_static_Person_descriptor =
                getDescriptor().getMessageTypes().get(0);
        internal_static_Person_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                internal_static_Person_descriptor,
                new String[] { "Name", "Id", "Email", });
    }

    // @@protoc_insertion_point(outer_class_scope)
}
