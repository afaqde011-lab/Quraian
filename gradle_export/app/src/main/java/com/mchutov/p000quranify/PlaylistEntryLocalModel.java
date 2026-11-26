package com.mchutov.p000quranify;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.google.protobuf.RuntimeVersion;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import ym.a0;
import ym.b0;
import ym.g0;
import ym.z;

public final class PlaylistEntryLocalModel extends GeneratedMessageLite<PlaylistEntryLocalModel, a0> implements b0 {
    public static final int AUDIO_URL_FIELD_NUMBER = 3;
    private static final PlaylistEntryLocalModel DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile Parser<PlaylistEntryLocalModel> PARSER = null;
    public static final int RECITER_FIELD_NUMBER = 5;
    public static final int SURAH_NUMBER_FIELD_NUMBER = 4;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int TITLE_OTHER_LANGUAGES_FIELD_NUMBER = 6;
    private int bitField0_;
    private long id_;
    private PlaylistReciterLocalModel reciter_;
    private int surahNumber_;
    private String title_ = RuntimeVersion.SUFFIX;
    private String audioUrl_ = RuntimeVersion.SUFFIX;
    private Internal.ProtobufList<String> titleOtherLanguages_ = GeneratedMessageLite.emptyProtobufList();

    static {
        PlaylistEntryLocalModel playlistEntryLocalModel = new PlaylistEntryLocalModel();
        DEFAULT_INSTANCE = playlistEntryLocalModel;
        GeneratedMessageLite.registerDefaultInstance(PlaylistEntryLocalModel.class, playlistEntryLocalModel);
    }

    private PlaylistEntryLocalModel() {
    }

    public void addAllTitleOtherLanguages(Iterable<String> iterable) {
        ensureTitleOtherLanguagesIsMutable();
        AbstractMessageLite.addAll(iterable, this.titleOtherLanguages_);
    }

    private void addTitleOtherLanguages(String str) {
        str.getClass();
        ensureTitleOtherLanguagesIsMutable();
        this.titleOtherLanguages_.add(str);
    }

    private void addTitleOtherLanguagesBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensureTitleOtherLanguagesIsMutable();
        this.titleOtherLanguages_.add(byteString.toStringUtf8());
    }

    private void clearAudioUrl() {
        this.bitField0_ &= -3;
        this.audioUrl_ = getDefaultInstance().getAudioUrl();
    }

    private void clearId() {
        this.id_ = 0L;
    }

    private void clearReciter() {
        this.reciter_ = null;
        this.bitField0_ &= -5;
    }

    private void clearSurahNumber() {
        this.surahNumber_ = 0;
    }

    private void clearTitle() {
        this.bitField0_ &= -2;
        this.title_ = getDefaultInstance().getTitle();
    }

    private void clearTitleOtherLanguages() {
        this.titleOtherLanguages_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureTitleOtherLanguagesIsMutable() {
        Internal.ProtobufList<String> protobufList = this.titleOtherLanguages_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.titleOtherLanguages_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static PlaylistEntryLocalModel getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeReciter(PlaylistReciterLocalModel playlistReciterLocalModel) {
        playlistReciterLocalModel.getClass();
        PlaylistReciterLocalModel playlistReciterLocalModel2 = this.reciter_;
        if (playlistReciterLocalModel2 == null || playlistReciterLocalModel2 == PlaylistReciterLocalModel.getDefaultInstance()) {
            this.reciter_ = playlistReciterLocalModel;
        } else {
            this.reciter_ = (PlaylistReciterLocalModel) ((g0) PlaylistReciterLocalModel.newBuilder(this.reciter_).mergeFrom(playlistReciterLocalModel)).buildPartial();
        }
        this.bitField0_ |= 4;
    }

    public static a0 newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static a0 newBuilder(PlaylistEntryLocalModel playlistEntryLocalModel) {
        return DEFAULT_INSTANCE.createBuilder(playlistEntryLocalModel);
    }

    public static PlaylistEntryLocalModel parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PlaylistEntryLocalModel) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PlaylistEntryLocalModel parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlaylistEntryLocalModel) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PlaylistEntryLocalModel parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (PlaylistEntryLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static PlaylistEntryLocalModel parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlaylistEntryLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static PlaylistEntryLocalModel parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (PlaylistEntryLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static PlaylistEntryLocalModel parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlaylistEntryLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static PlaylistEntryLocalModel parseFrom(InputStream inputStream) throws IOException {
        return (PlaylistEntryLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PlaylistEntryLocalModel parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlaylistEntryLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PlaylistEntryLocalModel parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PlaylistEntryLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static PlaylistEntryLocalModel parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlaylistEntryLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static PlaylistEntryLocalModel parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PlaylistEntryLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PlaylistEntryLocalModel parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlaylistEntryLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Parser<PlaylistEntryLocalModel> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setAudioUrl(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.audioUrl_ = str;
    }

    private void setAudioUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.audioUrl_ = byteString.toStringUtf8();
        this.bitField0_ |= 2;
    }

    public void setId(long j9) {
        this.id_ = j9;
    }

    public void setReciter(PlaylistReciterLocalModel playlistReciterLocalModel) {
        playlistReciterLocalModel.getClass();
        this.reciter_ = playlistReciterLocalModel;
        this.bitField0_ |= 4;
    }

    public void setSurahNumber(int i11) {
        this.surahNumber_ = i11;
    }

    public void setTitle(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.title_ = str;
    }

    private void setTitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.title_ = byteString.toStringUtf8();
        this.bitField0_ |= 1;
    }

    private void setTitleOtherLanguages(int i11, String str) {
        str.getClass();
        ensureTitleOtherLanguagesIsMutable();
        this.titleOtherLanguages_.set(i11, str);
    }

    @Override
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (z.f23565a[methodToInvoke.ordinal()]) {
            case 1:
                return new PlaylistEntryLocalModel();
            case 2:
                return new a0(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u0002\u0002ለ\u0000\u0003ለ\u0001\u0004\u0004\u0005ဉ\u0002\u0006Ț", new Object[]{"bitField0_", "id_", "title_", "audioUrl_", "surahNumber_", "reciter_", "titleOtherLanguages_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<PlaylistEntryLocalModel> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (PlaylistEntryLocalModel.class) {
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

    public String getAudioUrl() {
        return this.audioUrl_;
    }

    public ByteString getAudioUrlBytes() {
        return ByteString.copyFromUtf8(this.audioUrl_);
    }

    public long getId() {
        return this.id_;
    }

    public PlaylistReciterLocalModel getReciter() {
        PlaylistReciterLocalModel playlistReciterLocalModel = this.reciter_;
        return playlistReciterLocalModel == null ? PlaylistReciterLocalModel.getDefaultInstance() : playlistReciterLocalModel;
    }

    public int getSurahNumber() {
        return this.surahNumber_;
    }

    public String getTitle() {
        return this.title_;
    }

    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    public String getTitleOtherLanguages(int i11) {
        return this.titleOtherLanguages_.get(i11);
    }

    public ByteString getTitleOtherLanguagesBytes(int i11) {
        return ByteString.copyFromUtf8(this.titleOtherLanguages_.get(i11));
    }

    public int getTitleOtherLanguagesCount() {
        return this.titleOtherLanguages_.size();
    }

    public List<String> getTitleOtherLanguagesList() {
        return this.titleOtherLanguages_;
    }

    public boolean hasAudioUrl() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasReciter() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasTitle() {
        return (this.bitField0_ & 1) != 0;
    }
}
