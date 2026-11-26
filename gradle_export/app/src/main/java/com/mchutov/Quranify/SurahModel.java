package com.mchutov.quranify;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import ym.x0;
import ym.y0;
import ym.z0;

public final class SurahModel extends GeneratedMessageLite<SurahModel, y0> implements z0 {
    public static final int COLLECTION_ID_FIELD_NUMBER = 5;
    private static final SurahModel DEFAULT_INSTANCE;
    public static final int MIGRATED_FIELD_NUMBER = 7;
    private static volatile Parser<SurahModel> PARSER = null;
    public static final int RECITER_ID_FIELD_NUMBER = 1;
    public static final int SURAH_ID_FIELD_NUMBER = 6;
    public static final int SURAH_NUMBER_FIELD_NUMBER = 2;
    public static final int SURAH_SIZE_FIELD_NUMBER = 4;
    public static final int URI_FIELD_NUMBER = 3;
    private int bitField0_;
    private int collectionId_;
    private boolean migrated_;
    private int reciterId_;
    private long surahId_;
    private int surahNumber_;
    private long surahSize_;
    private String uri_ = "";

    static {
        SurahModel surahModel = new SurahModel();
        DEFAULT_INSTANCE = surahModel;
        GeneratedMessageLite.registerDefaultInstance(SurahModel.class, surahModel);
    }

    private SurahModel() {
    }

    private void clearCollectionId() {
        this.bitField0_ &= -3;
        this.collectionId_ = 0;
    }

    private void clearMigrated() {
        this.bitField0_ &= -9;
        this.migrated_ = false;
    }

    private void clearReciterId() {
        this.reciterId_ = 0;
    }

    private void clearSurahId() {
        this.bitField0_ &= -5;
        this.surahId_ = 0L;
    }

    public void clearSurahNumber() {
        this.bitField0_ &= -2;
        this.surahNumber_ = 0;
    }

    private void clearSurahSize() {
        this.surahSize_ = 0L;
    }

    private void clearUri() {
        this.uri_ = getDefaultInstance().getUri();
    }

    public static SurahModel getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static y0 newBuilder() {
        return (y0) DEFAULT_INSTANCE.createBuilder();
    }

    public static y0 newBuilder(SurahModel surahModel) {
        return (y0) DEFAULT_INSTANCE.createBuilder(surahModel);
    }

    public static SurahModel parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SurahModel) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SurahModel parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SurahModel) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SurahModel parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SurahModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static SurahModel parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SurahModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SurahModel parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SurahModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static SurahModel parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SurahModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static SurahModel parseFrom(InputStream inputStream) throws IOException {
        return (SurahModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SurahModel parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SurahModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SurahModel parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SurahModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static SurahModel parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SurahModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static SurahModel parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SurahModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SurahModel parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SurahModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Parser<SurahModel> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setCollectionId(int i) {
        this.bitField0_ |= 2;
        this.collectionId_ = i;
    }

    public void setMigrated(boolean z) {
        this.bitField0_ |= 8;
        this.migrated_ = z;
    }

    public void setReciterId(int i) {
        this.reciterId_ = i;
    }

    public void setSurahId(long j) {
        this.bitField0_ |= 4;
        this.surahId_ = j;
    }

    private void setSurahNumber(int i) {
        this.bitField0_ |= 1;
        this.surahNumber_ = i;
    }

    public void setSurahSize(long j) {
        this.surahSize_ = j;
    }

    public void setUri(String str) {
        str.getClass();
        this.uri_ = str;
    }

    private void setUriBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.uri_ = byteString.toStringUtf8();
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser;
        switch (x0.a[methodToInvoke.ordinal()]) {
            case 1:
                return new SurahModel();
            case 2:
                return new y0(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0004\u0002င\u0000\u0003Ȉ\u0004\u0002\u0005င\u0001\u0006ဂ\u0002\u0007ဇ\u0003", new Object[]{"bitField0_", "reciterId_", "surahNumber_", "uri_", "surahSize_", "collectionId_", "surahId_", "migrated_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<SurahModel> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (SurahModel.class) {
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

    public int getCollectionId() {
        return this.collectionId_;
    }

    public boolean getMigrated() {
        return this.migrated_;
    }

    public int getReciterId() {
        return this.reciterId_;
    }

    public long getSurahId() {
        return this.surahId_;
    }

    public int getSurahNumber() {
        return this.surahNumber_;
    }

    public long getSurahSize() {
        return this.surahSize_;
    }

    public String getUri() {
        return this.uri_;
    }

    public ByteString getUriBytes() {
        return ByteString.copyFromUtf8(this.uri_);
    }

    public boolean hasCollectionId() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasMigrated() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasSurahId() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasSurahNumber() {
        return (this.bitField0_ & 1) != 0;
    }
}
