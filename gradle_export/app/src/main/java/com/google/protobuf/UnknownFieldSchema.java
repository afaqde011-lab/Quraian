package com.google.protobuf;

import java.io.IOException;

@CheckReturnValue
abstract class UnknownFieldSchema<T, B> {
    public abstract void addFixed32(B b7, int i10, int i11);

    public abstract void addFixed64(B b7, int i10, long j9);

    public abstract void addGroup(B b7, int i10, T t4);

    public abstract void addLengthDelimited(B b7, int i10, ByteString byteString);

    public abstract void addVarint(B b7, int i10, long j9);

    public abstract B getBuilderFromMessage(Object obj);

    public abstract T getFromMessage(Object obj);

    public abstract int getSerializedSize(T t4);

    public abstract int getSerializedSizeAsMessageSet(T t4);

    public abstract void makeImmutable(Object obj);

    public abstract T merge(T t4, T t10);

    public final void mergeFrom(B b7, Reader reader) throws IOException {
        while (reader.getFieldNumber() != Integer.MAX_VALUE && mergeOneFieldFrom(b7, reader)) {
        }
    }

    public final boolean mergeOneFieldFrom(B b7, Reader reader) throws IOException {
        int tag = reader.getTag();
        int tagFieldNumber = WireFormat.getTagFieldNumber(tag);
        int tagWireType = WireFormat.getTagWireType(tag);
        if (tagWireType == 0) {
            addVarint(b7, tagFieldNumber, reader.readInt64());
            return true;
        }
        if (tagWireType == 1) {
            addFixed64(b7, tagFieldNumber, reader.readFixed64());
            return true;
        }
        if (tagWireType == 2) {
            addLengthDelimited(b7, tagFieldNumber, reader.readBytes());
            return true;
        }
        if (tagWireType != 3) {
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            addFixed32(b7, tagFieldNumber, reader.readFixed32());
            return true;
        }
        B bNewBuilder = newBuilder();
        int iMakeTag = WireFormat.makeTag(tagFieldNumber, 4);
        mergeFrom(bNewBuilder, reader);
        if (iMakeTag != reader.getTag()) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
        addGroup(b7, tagFieldNumber, toImmutable(bNewBuilder));
        return true;
    }

    public abstract B newBuilder();

    public abstract void setBuilderToMessage(Object obj, B b7);

    public abstract void setToMessage(Object obj, T t4);

    public abstract boolean shouldDiscardUnknownFields(Reader reader);

    public abstract T toImmutable(B b7);

    public abstract void writeAsMessageSetTo(T t4, Writer writer) throws IOException;

    public abstract void writeTo(T t4, Writer writer) throws IOException;
}
