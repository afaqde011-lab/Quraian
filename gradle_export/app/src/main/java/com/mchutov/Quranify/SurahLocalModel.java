package com.mchutov.quranify;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import ym.u0;
import ym.v0;
import ym.w0;

public final class SurahLocalModel extends GeneratedMessageLite<SurahLocalModel, v0> implements w0 {
    private static final SurahLocalModel DEFAULT_INSTANCE;
    private static volatile Parser<SurahLocalModel> PARSER = null;
    public static final int SURAHID_FIELD_NUMBER = 1;
    public static final int SURAHNUMBER_FIELD_NUMBER = 2;
    private long surahId_;
    private int surahNumber_;

    static {
        SurahLocalModel surahLocalModel = new SurahLocalModel();
        DEFAULT_INSTANCE = surahLocalModel;
        GeneratedMessageLite.registerDefaultInstance(SurahLocalModel.class, surahLocalModel);
    }

    private SurahLocalModel() {
    }

    private void clearSurahId() {
        this.surahId_ = 0L;
    }

    private void clearSurahNumber() {
        this.surahNumber_ = 0;
    }

    public static SurahLocalModel getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static v0 newBuilder() {
        return (v0) DEFAULT_INSTANCE.createBuilder();
    }

    public static v0 newBuilder(SurahLocalModel surahLocalModel) {
        return (v0) DEFAULT_INSTANCE.createBuilder(surahLocalModel);
    }

    public static SurahLocalModel parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SurahLocalModel) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SurahLocalModel parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SurahLocalModel) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SurahLocalModel parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SurahLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static SurahLocalModel parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SurahLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SurahLocalModel parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SurahLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static SurahLocalModel parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SurahLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static SurahLocalModel parseFrom(InputStream inputStream) throws IOException {
        return (SurahLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SurahLocalModel parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SurahLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SurahLocalModel parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SurahLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static SurahLocalModel parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SurahLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static SurahLocalModel parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SurahLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SurahLocalModel parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SurahLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Parser<SurahLocalModel> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setSurahId(long j) {
        this.surahId_ = j;
    }

    public void setSurahNumber(int i) {
        this.surahNumber_ = i;
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser;
        switch (u0.a[methodToInvoke.ordinal()]) {
            case 1:
                return new SurahLocalModel();
            case 2:
                return new v0(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"surahId_", "surahNumber_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<SurahLocalModel> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (SurahLocalModel.class) {
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

    public long getSurahId() {
        return this.surahId_;
    }

    public int getSurahNumber() {
        return this.surahNumber_;
    }
}
