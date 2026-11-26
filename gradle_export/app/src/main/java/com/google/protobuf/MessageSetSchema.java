package com.google.protobuf;

import java.io.IOException;

@CheckReturnValue
final class MessageSetSchema<T> implements Schema<T> {
    private final MessageLite defaultInstance;
    private final ExtensionSchema<?> extensionSchema;
    private final boolean hasExtensions;
    private final UnknownFieldSchema<?, ?> unknownFieldSchema;

    private MessageSetSchema(UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MessageLite messageLite) {
        this.unknownFieldSchema = unknownFieldSchema;
        this.hasExtensions = extensionSchema.hasExtensions(messageLite);
        this.extensionSchema = extensionSchema;
        this.defaultInstance = messageLite;
    }

    private <UT, UB> int getUnknownFieldsSerializedSize(UnknownFieldSchema<UT, UB> unknownFieldSchema, T t4) {
        return unknownFieldSchema.getSerializedSizeAsMessageSet(unknownFieldSchema.getFromMessage(t4));
    }

    private <UT, UB, ET extends FieldSet.FieldDescriptorLite<ET>> void mergeFromHelper(UnknownFieldSchema<UT, UB> unknownFieldSchema, ExtensionSchema<ET> extensionSchema, T t4, Reader reader, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
        UnknownFieldSchema<UT, UB> unknownFieldSchema2;
        UB builderFromMessage = unknownFieldSchema.getBuilderFromMessage(t4);
        Object mutableExtensions = extensionSchema.getMutableExtensions(t4);
        while (reader.getFieldNumber() != Integer.MAX_VALUE) {
            try {
                MessageSetSchema messageSetSchema = this;
                unknownFieldSchema2 = unknownFieldSchema;
                ExtensionSchema<ET> extensionSchema2 = extensionSchema;
                Reader reader2 = reader;
                ExtensionRegistryLite extensionRegistryLite2 = extensionRegistryLite;
                try {
                    if (!messageSetSchema.parseMessageSetItemOrUnknownField(reader2, extensionRegistryLite2, extensionSchema2, mutableExtensions, unknownFieldSchema2, builderFromMessage)) {
                        unknownFieldSchema2.setBuilderToMessage(t4, builderFromMessage);
                        return;
                    }
                    this = (MessageSetSchema<T>) messageSetSchema;
                    reader = reader2;
                    extensionRegistryLite = extensionRegistryLite2;
                    extensionSchema = extensionSchema2;
                    unknownFieldSchema = unknownFieldSchema2;
                } catch (Throwable th2) {
                    th = th2;
                    Throwable th3 = th;
                    unknownFieldSchema2.setBuilderToMessage(t4, builderFromMessage);
                    throw th3;
                }
            } catch (Throwable th4) {
                th = th4;
                unknownFieldSchema2 = unknownFieldSchema;
            }
        }
        unknownFieldSchema.setBuilderToMessage(t4, builderFromMessage);
    }

    public static <T> MessageSetSchema<T> newSchema(UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MessageLite messageLite) {
        return new MessageSetSchema<>(unknownFieldSchema, extensionSchema, messageLite);
    }

    private <UT, UB, ET extends FieldSet.FieldDescriptorLite<ET>> boolean parseMessageSetItemOrUnknownField(Reader reader, ExtensionRegistryLite extensionRegistryLite, ExtensionSchema<ET> extensionSchema, FieldSet<ET> fieldSet, UnknownFieldSchema<UT, UB> unknownFieldSchema, UB ub2) throws IOException {
        int tag = reader.getTag();
        if (tag != WireFormat.MESSAGE_SET_ITEM_TAG) {
            if (WireFormat.getTagWireType(tag) != 2) {
                return reader.skipField();
            }
            Object objFindExtensionByNumber = extensionSchema.findExtensionByNumber(extensionRegistryLite, this.defaultInstance, WireFormat.getTagFieldNumber(tag));
            if (objFindExtensionByNumber == null) {
                return unknownFieldSchema.mergeOneFieldFrom(ub2, reader);
            }
            extensionSchema.parseLengthPrefixedMessageSetItem(reader, objFindExtensionByNumber, extensionRegistryLite, fieldSet);
            return true;
        }
        Object objFindExtensionByNumber2 = null;
        int uInt32 = 0;
        ByteString bytes = null;
        while (reader.getFieldNumber() != Integer.MAX_VALUE) {
            int tag2 = reader.getTag();
            if (tag2 == WireFormat.MESSAGE_SET_TYPE_ID_TAG) {
                uInt32 = reader.readUInt32();
                objFindExtensionByNumber2 = extensionSchema.findExtensionByNumber(extensionRegistryLite, this.defaultInstance, uInt32);
            } else if (tag2 == WireFormat.MESSAGE_SET_MESSAGE_TAG) {
                if (objFindExtensionByNumber2 != null) {
                    extensionSchema.parseLengthPrefixedMessageSetItem(reader, objFindExtensionByNumber2, extensionRegistryLite, fieldSet);
                } else {
                    bytes = reader.readBytes();
                }
            } else if (!reader.skipField()) {
                break;
            }
        }
        if (reader.getTag() != WireFormat.MESSAGE_SET_ITEM_END_TAG) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
        if (bytes != null) {
            if (objFindExtensionByNumber2 != null) {
                extensionSchema.parseMessageSetItem(bytes, objFindExtensionByNumber2, extensionRegistryLite, fieldSet);
            } else {
                unknownFieldSchema.addLengthDelimited(ub2, uInt32, bytes);
            }
        }
        return true;
    }

    private <UT, UB> void writeUnknownFieldsHelper(UnknownFieldSchema<UT, UB> unknownFieldSchema, T t4, Writer writer) throws IOException {
        unknownFieldSchema.writeAsMessageSetTo(unknownFieldSchema.getFromMessage(t4), writer);
    }

    @Override
    public boolean equals(T t4, T t10) {
        if (!this.unknownFieldSchema.getFromMessage(t4).equals(this.unknownFieldSchema.getFromMessage(t10))) {
            return false;
        }
        if (this.hasExtensions) {
            return this.extensionSchema.getExtensions(t4).equals(this.extensionSchema.getExtensions(t10));
        }
        return true;
    }

    @Override
    public int getSerializedSize(T t4) {
        int unknownFieldsSerializedSize = getUnknownFieldsSerializedSize(this.unknownFieldSchema, t4);
        return this.hasExtensions ? unknownFieldsSerializedSize + this.extensionSchema.getExtensions(t4).getMessageSetSerializedSize() : unknownFieldsSerializedSize;
    }

    @Override
    public int hashCode(T t4) {
        int iHashCode = this.unknownFieldSchema.getFromMessage(t4).hashCode();
        return this.hasExtensions ? (iHashCode * 53) + this.extensionSchema.getExtensions(t4).hashCode() : iHashCode;
    }

    @Override
    public final boolean isInitialized(T t4) {
        return this.extensionSchema.getExtensions(t4).isInitialized();
    }

    @Override
    public void makeImmutable(T t4) {
        this.unknownFieldSchema.makeImmutable(t4);
        this.extensionSchema.makeImmutable(t4);
    }

    @Override
    public void mergeFrom(T t4, Reader reader, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
        mergeFromHelper(this.unknownFieldSchema, this.extensionSchema, t4, reader, extensionRegistryLite);
    }

    @Override
    public void mergeFrom(T t4, T t10) {
        SchemaUtil.mergeUnknownFields(this.unknownFieldSchema, t4, t10);
        if (this.hasExtensions) {
            SchemaUtil.mergeExtensions(this.extensionSchema, t4, t10);
        }
    }

    @Override
    public void mergeFrom(T t4, byte[] bArr, int i10, int i11, ArrayDecoders.Registers registers) throws IOException {
        int iDecodeVarint32;
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) t4;
        UnknownFieldSetLite unknownFieldSetLiteNewInstance = generatedMessageLite.unknownFields;
        if (unknownFieldSetLiteNewInstance == UnknownFieldSetLite.getDefaultInstance()) {
            unknownFieldSetLiteNewInstance = UnknownFieldSetLite.newInstance();
            generatedMessageLite.unknownFields = unknownFieldSetLiteNewInstance;
        }
        UnknownFieldSetLite unknownFieldSetLite = unknownFieldSetLiteNewInstance;
        FieldSet<GeneratedMessageLite.ExtensionDescriptor> fieldSetEnsureExtensionsAreMutable = ((GeneratedMessageLite.ExtendableMessage) t4).ensureExtensionsAreMutable();
        GeneratedMessageLite.GeneratedExtension generatedExtension = null;
        while (i10 < i11) {
            int iDecodeVarint33 = ArrayDecoders.decodeVarint32(bArr, i10, registers);
            int i12 = registers.int1;
            if (i12 == WireFormat.MESSAGE_SET_ITEM_TAG) {
                int i13 = i11;
                ArrayDecoders.Registers registers2 = registers;
                int i14 = 0;
                ByteString byteString = null;
                while (true) {
                    if (iDecodeVarint33 >= i13) {
                        iDecodeVarint32 = iDecodeVarint33;
                        break;
                    }
                    iDecodeVarint32 = ArrayDecoders.decodeVarint32(bArr, iDecodeVarint33, registers2);
                    int i15 = registers2.int1;
                    int tagFieldNumber = WireFormat.getTagFieldNumber(i15);
                    int tagWireType = WireFormat.getTagWireType(i15);
                    if (tagFieldNumber != 2) {
                        if (tagFieldNumber == 3) {
                            if (generatedExtension != null) {
                                iDecodeVarint33 = ArrayDecoders.decodeMessageField(Protobuf.getInstance().schemaFor((Class) generatedExtension.getMessageDefaultInstance().getClass()), bArr, iDecodeVarint32, i13, registers2);
                                fieldSetEnsureExtensionsAreMutable.setField(generatedExtension.descriptor, registers2.object1);
                            } else if (tagWireType == 2) {
                                iDecodeVarint33 = ArrayDecoders.decodeBytes(bArr, iDecodeVarint32, registers2);
                                byteString = (ByteString) registers2.object1;
                            }
                        }
                        if (i15 == WireFormat.MESSAGE_SET_ITEM_END_TAG) {
                            break;
                        } else {
                            iDecodeVarint33 = ArrayDecoders.skipField(i15, bArr, iDecodeVarint32, i13, registers2);
                        }
                    } else if (tagWireType == 0) {
                        iDecodeVarint33 = ArrayDecoders.decodeVarint32(bArr, iDecodeVarint32, registers2);
                        i14 = registers2.int1;
                        generatedExtension = (GeneratedMessageLite.GeneratedExtension) this.extensionSchema.findExtensionByNumber(registers2.extensionRegistry, this.defaultInstance, i14);
                    } else {
                        if (i15 == WireFormat.MESSAGE_SET_ITEM_END_TAG) {
                            break;
                            break;
                        }
                        iDecodeVarint33 = ArrayDecoders.skipField(i15, bArr, iDecodeVarint32, i13, registers2);
                    }
                }
                if (byteString != null) {
                    unknownFieldSetLite.storeField(WireFormat.makeTag(i14, 2), byteString);
                }
                i10 = iDecodeVarint32;
                i11 = i13;
                registers = registers2;
            } else if (WireFormat.getTagWireType(i12) == 2) {
                generatedExtension = (GeneratedMessageLite.GeneratedExtension) this.extensionSchema.findExtensionByNumber(registers.extensionRegistry, this.defaultInstance, WireFormat.getTagFieldNumber(i12));
                if (generatedExtension != null) {
                    i10 = ArrayDecoders.decodeMessageField(Protobuf.getInstance().schemaFor((Class) generatedExtension.getMessageDefaultInstance().getClass()), bArr, iDecodeVarint33, i11, registers);
                    fieldSetEnsureExtensionsAreMutable.setField(generatedExtension.descriptor, registers.object1);
                } else {
                    i10 = ArrayDecoders.decodeUnknownField(i12, bArr, iDecodeVarint33, i11, unknownFieldSetLite, registers);
                }
            } else {
                i10 = ArrayDecoders.skipField(i12, bArr, iDecodeVarint33, i11, registers);
            }
        }
        if (i10 != i11) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    @Override
    public T newInstance() {
        MessageLite messageLite = this.defaultInstance;
        return messageLite instanceof GeneratedMessageLite ? (T) ((GeneratedMessageLite) messageLite).newMutableInstance() : (T) messageLite.newBuilderForType().buildPartial();
    }

    @Override
    public void writeTo(T t4, Writer writer) throws IOException {
        for (T t10 : this.extensionSchema.getExtensions(t4)) {
            FieldSet.FieldDescriptorLite fieldDescriptorLite = (FieldSet.FieldDescriptorLite) t10.getKey();
            if (fieldDescriptorLite.getLiteJavaType() != WireFormat.JavaType.MESSAGE || fieldDescriptorLite.isRepeated() || fieldDescriptorLite.isPacked()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (t10 instanceof LazyField.LazyEntry) {
                writer.writeMessageSetItem(fieldDescriptorLite.getNumber(), ((LazyField.LazyEntry) t10).getField().toByteString());
            } else {
                writer.writeMessageSetItem(fieldDescriptorLite.getNumber(), t10.getValue());
            }
        }
        writeUnknownFieldsHelper(this.unknownFieldSchema, t4, writer);
    }
}
