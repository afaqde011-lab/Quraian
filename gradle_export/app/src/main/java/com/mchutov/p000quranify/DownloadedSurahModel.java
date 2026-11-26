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
import ym.q;
import ym.r;
import ym.z0;

public final class DownloadedSurahModel extends GeneratedMessageLite<DownloadedSurahModel, r> implements MessageLiteOrBuilder {
    private static final DownloadedSurahModel DEFAULT_INSTANCE;
    private static volatile Parser<DownloadedSurahModel> PARSER = null;
    public static final int SURAHS_FIELD_NUMBER = 1;
    private Internal.ProtobufList<SurahModel> surahs_ = GeneratedMessageLite.emptyProtobufList();

    static {
        DownloadedSurahModel downloadedSurahModel = new DownloadedSurahModel();
        DEFAULT_INSTANCE = downloadedSurahModel;
        GeneratedMessageLite.registerDefaultInstance(DownloadedSurahModel.class, downloadedSurahModel);
    }

    private DownloadedSurahModel() {
    }

    public void addAllSurahs(Iterable<? extends SurahModel> iterable) {
        ensureSurahsIsMutable();
        AbstractMessageLite.addAll(iterable, this.surahs_);
    }

    private void addSurahs(int i11, SurahModel surahModel) {
        surahModel.getClass();
        ensureSurahsIsMutable();
        this.surahs_.add(i11, surahModel);
    }

    public void addSurahs(SurahModel surahModel) {
        surahModel.getClass();
        ensureSurahsIsMutable();
        this.surahs_.add(surahModel);
    }

    public void clearSurahs() {
        this.surahs_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureSurahsIsMutable() {
        Internal.ProtobufList<SurahModel> protobufList = this.surahs_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.surahs_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static DownloadedSurahModel getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static r newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static r newBuilder(DownloadedSurahModel downloadedSurahModel) {
        return DEFAULT_INSTANCE.createBuilder(downloadedSurahModel);
    }

    public static DownloadedSurahModel parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DownloadedSurahModel) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DownloadedSurahModel parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DownloadedSurahModel) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DownloadedSurahModel parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DownloadedSurahModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static DownloadedSurahModel parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DownloadedSurahModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DownloadedSurahModel parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DownloadedSurahModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DownloadedSurahModel parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DownloadedSurahModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static DownloadedSurahModel parseFrom(InputStream inputStream) throws IOException {
        return (DownloadedSurahModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DownloadedSurahModel parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DownloadedSurahModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DownloadedSurahModel parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DownloadedSurahModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static DownloadedSurahModel parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DownloadedSurahModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DownloadedSurahModel parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DownloadedSurahModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DownloadedSurahModel parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DownloadedSurahModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Parser<DownloadedSurahModel> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void removeSurahs(int i11) {
        ensureSurahsIsMutable();
        this.surahs_.remove(i11);
    }

    private void setSurahs(int i11, SurahModel surahModel) {
        surahModel.getClass();
        ensureSurahsIsMutable();
        this.surahs_.set(i11, surahModel);
    }

    @Override
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (q.f23558a[methodToInvoke.ordinal()]) {
            case 1:
                return new DownloadedSurahModel();
            case 2:
                return new r(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"surahs_", SurahModel.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DownloadedSurahModel> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (DownloadedSurahModel.class) {
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

    public SurahModel getSurahs(int i11) {
        return this.surahs_.get(i11);
    }

    public int getSurahsCount() {
        return this.surahs_.size();
    }

    public List<SurahModel> getSurahsList() {
        return this.surahs_;
    }

    public z0 getSurahsOrBuilder(int i11) {
        return this.surahs_.get(i11);
    }

    public List<? extends z0> getSurahsOrBuilderList() {
        return this.surahs_;
    }
}
