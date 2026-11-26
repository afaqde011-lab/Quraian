package com.mchutov.quranify;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import ym.o0;
import ym.p0;
import ym.q0;

public final class RecitersModel extends GeneratedMessageLite<RecitersModel, q0> implements MessageLiteOrBuilder {
    private static final RecitersModel DEFAULT_INSTANCE;
    private static volatile Parser<RecitersModel> PARSER = null;
    public static final int RECITERS_FIELD_NUMBER = 1;
    private Internal.ProtobufList<Reciter> reciters_ = GeneratedMessageLite.emptyProtobufList();

    static {
        RecitersModel recitersModel = new RecitersModel();
        DEFAULT_INSTANCE = recitersModel;
        GeneratedMessageLite.registerDefaultInstance(RecitersModel.class, recitersModel);
    }

    private RecitersModel() {
    }

    public void addAllReciters(Iterable<? extends Reciter> iterable) {
        ensureRecitersIsMutable();
        AbstractMessageLite.addAll(iterable, this.reciters_);
    }

    private void addReciters(int i, Reciter reciter) {
        reciter.getClass();
        ensureRecitersIsMutable();
        this.reciters_.add(i, reciter);
    }

    private void addReciters(Reciter reciter) {
        reciter.getClass();
        ensureRecitersIsMutable();
        this.reciters_.add(reciter);
    }

    private void clearReciters() {
        this.reciters_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureRecitersIsMutable() {
        Internal.ProtobufList<Reciter> protobufList = this.reciters_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.reciters_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static RecitersModel getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static q0 newBuilder() {
        return (q0) DEFAULT_INSTANCE.createBuilder();
    }

    public static q0 newBuilder(RecitersModel recitersModel) {
        return (q0) DEFAULT_INSTANCE.createBuilder(recitersModel);
    }

    public static RecitersModel parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RecitersModel) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RecitersModel parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecitersModel) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RecitersModel parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (RecitersModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static RecitersModel parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RecitersModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static RecitersModel parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RecitersModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static RecitersModel parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecitersModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static RecitersModel parseFrom(InputStream inputStream) throws IOException {
        return (RecitersModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RecitersModel parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecitersModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RecitersModel parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RecitersModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static RecitersModel parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RecitersModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static RecitersModel parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RecitersModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RecitersModel parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RecitersModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Parser<RecitersModel> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeReciters(int i) {
        ensureRecitersIsMutable();
        this.reciters_.remove(i);
    }

    private void setReciters(int i, Reciter reciter) {
        reciter.getClass();
        ensureRecitersIsMutable();
        this.reciters_.set(i, reciter);
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser;
        switch (p0.a[methodToInvoke.ordinal()]) {
            case 1:
                return new RecitersModel();
            case 2:
                return new q0(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"reciters_", Reciter.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<RecitersModel> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (RecitersModel.class) {
                    try {
                        defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = defaultInstanceBasedParser;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return defaultInstanceBasedParser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public Reciter getReciters(int i) {
        return (Reciter) this.reciters_.get(i);
    }

    public int getRecitersCount() {
        return this.reciters_.size();
    }

    public List<Reciter> getRecitersList() {
        return this.reciters_;
    }

    public o0 getRecitersOrBuilder(int i) {
        return (o0) this.reciters_.get(i);
    }

    public List<? extends o0> getRecitersOrBuilderList() {
        return this.reciters_;
    }
}
