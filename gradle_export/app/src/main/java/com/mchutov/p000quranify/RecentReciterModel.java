package com.mchutov.p000quranify;

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
import ym.k0;
import ym.l0;

public final class RecentReciterModel extends GeneratedMessageLite<RecentReciterModel, l0> implements MessageLiteOrBuilder {
    private static final RecentReciterModel DEFAULT_INSTANCE;
    private static volatile Parser<RecentReciterModel> PARSER = null;
    public static final int RECENT_RECITERS_FIELD_NUMBER = 1;
    private int recentRecitersMemoizedSerializedSize = -1;
    private Internal.IntList recentReciters_ = GeneratedMessageLite.emptyIntList();

    static {
        RecentReciterModel recentReciterModel = new RecentReciterModel();
        DEFAULT_INSTANCE = recentReciterModel;
        GeneratedMessageLite.registerDefaultInstance(RecentReciterModel.class, recentReciterModel);
    }

    private RecentReciterModel() {
    }

    public void addAllRecentReciters(Iterable<? extends Integer> iterable) {
        ensureRecentRecitersIsMutable();
        AbstractMessageLite.addAll(iterable, this.recentReciters_);
    }

    private void addRecentReciters(int i11) {
        ensureRecentRecitersIsMutable();
        this.recentReciters_.addInt(i11);
    }

    public void clearRecentReciters() {
        this.recentReciters_ = GeneratedMessageLite.emptyIntList();
    }

    private void ensureRecentRecitersIsMutable() {
        Internal.IntList intList = this.recentReciters_;
        if (intList.isModifiable()) {
            return;
        }
        this.recentReciters_ = GeneratedMessageLite.mutableCopy(intList);
    }

    public static RecentReciterModel getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static l0 newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static l0 newBuilder(RecentReciterModel recentReciterModel) {
        return DEFAULT_INSTANCE.createBuilder(recentReciterModel);
    }

    public static RecentReciterModel parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RecentReciterModel) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RecentReciterModel parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecentReciterModel) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RecentReciterModel parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (RecentReciterModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static RecentReciterModel parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RecentReciterModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static RecentReciterModel parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RecentReciterModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static RecentReciterModel parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecentReciterModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static RecentReciterModel parseFrom(InputStream inputStream) throws IOException {
        return (RecentReciterModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RecentReciterModel parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecentReciterModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RecentReciterModel parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RecentReciterModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static RecentReciterModel parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RecentReciterModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static RecentReciterModel parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RecentReciterModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RecentReciterModel parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RecentReciterModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Parser<RecentReciterModel> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setRecentReciters(int i11, int i12) {
        ensureRecentRecitersIsMutable();
        this.recentReciters_.setInt(i11, i12);
    }

    @Override
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (k0.f23554a[methodToInvoke.ordinal()]) {
            case 1:
                return new RecentReciterModel();
            case 2:
                return new l0(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001'", new Object[]{"recentReciters_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<RecentReciterModel> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (RecentReciterModel.class) {
                    try {
                        defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = defaultInstanceBasedParser;
                        }
                    } catch (Throwable th2) {
                        throw th2;
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

    public int getRecentReciters(int i11) {
        return this.recentReciters_.getInt(i11);
    }

    public int getRecentRecitersCount() {
        return this.recentReciters_.size();
    }

    public List<Integer> getRecentRecitersList() {
        return this.recentReciters_;
    }
}
