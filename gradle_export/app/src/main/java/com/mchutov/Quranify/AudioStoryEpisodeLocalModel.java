package com.mchutov.quranify;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import ym.h;
import ym.i;
import ym.j;
import ym.m;

public final class AudioStoryEpisodeLocalModel extends GeneratedMessageLite<AudioStoryEpisodeLocalModel, i> implements j {
    public static final int AUDIO_URL_FIELD_NUMBER = 5;
    public static final int AVAILABLE_LANGUAGES_FIELD_NUMBER = 12;
    public static final int COVER_URL_FIELD_NUMBER = 7;
    private static final AudioStoryEpisodeLocalModel DEFAULT_INSTANCE;
    public static final int DURATION_MS_FIELD_NUMBER = 6;
    public static final int FREE_DURATION_MS_FIELD_NUMBER = 10;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int IS_FREE_FIELD_NUMBER = 9;
    public static final int LANGUAGE_FIELD_NUMBER = 3;
    public static final int ORDER_FIELD_NUMBER = 2;
    private static volatile Parser<AudioStoryEpisodeLocalModel> PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 4;
    public static final int TRANSCRIPT_URL_FIELD_NUMBER = 8;
    public static final int VERSION_FIELD_NUMBER = 11;
    private int bitField0_;
    private long durationMs_;
    private long freeDurationMs_;
    private int id_;
    private boolean isFree_;
    private int order_;
    private int version_;
    private String language_ = "";
    private String title_ = "";
    private String audioUrl_ = "";
    private String coverUrl_ = "";
    private String transcriptUrl_ = "";
    private Internal.ProtobufList<AudioStoryLanguageLocalModel> availableLanguages_ = GeneratedMessageLite.emptyProtobufList();

    static {
        AudioStoryEpisodeLocalModel audioStoryEpisodeLocalModel = new AudioStoryEpisodeLocalModel();
        DEFAULT_INSTANCE = audioStoryEpisodeLocalModel;
        GeneratedMessageLite.registerDefaultInstance(AudioStoryEpisodeLocalModel.class, audioStoryEpisodeLocalModel);
    }

    private AudioStoryEpisodeLocalModel() {
    }

    public void addAllAvailableLanguages(Iterable<? extends AudioStoryLanguageLocalModel> iterable) {
        ensureAvailableLanguagesIsMutable();
        AbstractMessageLite.addAll(iterable, this.availableLanguages_);
    }

    private void addAvailableLanguages(int i, AudioStoryLanguageLocalModel audioStoryLanguageLocalModel) {
        audioStoryLanguageLocalModel.getClass();
        ensureAvailableLanguagesIsMutable();
        this.availableLanguages_.add(i, audioStoryLanguageLocalModel);
    }

    private void addAvailableLanguages(AudioStoryLanguageLocalModel audioStoryLanguageLocalModel) {
        audioStoryLanguageLocalModel.getClass();
        ensureAvailableLanguagesIsMutable();
        this.availableLanguages_.add(audioStoryLanguageLocalModel);
    }

    private void clearAudioUrl() {
        this.audioUrl_ = getDefaultInstance().getAudioUrl();
    }

    private void clearAvailableLanguages() {
        this.availableLanguages_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearCoverUrl() {
        this.bitField0_ &= -2;
        this.coverUrl_ = getDefaultInstance().getCoverUrl();
    }

    private void clearDurationMs() {
        this.durationMs_ = 0L;
    }

    private void clearFreeDurationMs() {
        this.bitField0_ &= -5;
        this.freeDurationMs_ = 0L;
    }

    private void clearId() {
        this.id_ = 0;
    }

    private void clearIsFree() {
        this.isFree_ = false;
    }

    private void clearLanguage() {
        this.language_ = getDefaultInstance().getLanguage();
    }

    private void clearOrder() {
        this.order_ = 0;
    }

    private void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    private void clearTranscriptUrl() {
        this.bitField0_ &= -3;
        this.transcriptUrl_ = getDefaultInstance().getTranscriptUrl();
    }

    private void clearVersion() {
        this.version_ = 0;
    }

    private void ensureAvailableLanguagesIsMutable() {
        Internal.ProtobufList<AudioStoryLanguageLocalModel> protobufList = this.availableLanguages_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.availableLanguages_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static AudioStoryEpisodeLocalModel getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static i newBuilder() {
        return (i) DEFAULT_INSTANCE.createBuilder();
    }

    public static i newBuilder(AudioStoryEpisodeLocalModel audioStoryEpisodeLocalModel) {
        return (i) DEFAULT_INSTANCE.createBuilder(audioStoryEpisodeLocalModel);
    }

    public static AudioStoryEpisodeLocalModel parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AudioStoryEpisodeLocalModel) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AudioStoryEpisodeLocalModel parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AudioStoryEpisodeLocalModel) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AudioStoryEpisodeLocalModel parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (AudioStoryEpisodeLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static AudioStoryEpisodeLocalModel parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AudioStoryEpisodeLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static AudioStoryEpisodeLocalModel parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (AudioStoryEpisodeLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static AudioStoryEpisodeLocalModel parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AudioStoryEpisodeLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static AudioStoryEpisodeLocalModel parseFrom(InputStream inputStream) throws IOException {
        return (AudioStoryEpisodeLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AudioStoryEpisodeLocalModel parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AudioStoryEpisodeLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AudioStoryEpisodeLocalModel parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (AudioStoryEpisodeLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AudioStoryEpisodeLocalModel parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AudioStoryEpisodeLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static AudioStoryEpisodeLocalModel parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (AudioStoryEpisodeLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AudioStoryEpisodeLocalModel parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AudioStoryEpisodeLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Parser<AudioStoryEpisodeLocalModel> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeAvailableLanguages(int i) {
        ensureAvailableLanguagesIsMutable();
        this.availableLanguages_.remove(i);
    }

    public void setAudioUrl(String str) {
        str.getClass();
        this.audioUrl_ = str;
    }

    private void setAudioUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.audioUrl_ = byteString.toStringUtf8();
    }

    private void setAvailableLanguages(int i, AudioStoryLanguageLocalModel audioStoryLanguageLocalModel) {
        audioStoryLanguageLocalModel.getClass();
        ensureAvailableLanguagesIsMutable();
        this.availableLanguages_.set(i, audioStoryLanguageLocalModel);
    }

    public void setCoverUrl(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.coverUrl_ = str;
    }

    private void setCoverUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.coverUrl_ = byteString.toStringUtf8();
        this.bitField0_ |= 1;
    }

    public void setDurationMs(long j) {
        this.durationMs_ = j;
    }

    public void setFreeDurationMs(long j) {
        this.bitField0_ |= 4;
        this.freeDurationMs_ = j;
    }

    public void setId(int i) {
        this.id_ = i;
    }

    public void setIsFree(boolean z) {
        this.isFree_ = z;
    }

    public void setLanguage(String str) {
        str.getClass();
        this.language_ = str;
    }

    private void setLanguageBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.language_ = byteString.toStringUtf8();
    }

    public void setOrder(int i) {
        this.order_ = i;
    }

    public void setTitle(String str) {
        str.getClass();
        this.title_ = str;
    }

    private void setTitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.title_ = byteString.toStringUtf8();
    }

    public void setTranscriptUrl(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.transcriptUrl_ = str;
    }

    private void setTranscriptUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.transcriptUrl_ = byteString.toStringUtf8();
        this.bitField0_ |= 2;
    }

    public void setVersion(int i) {
        this.version_ = i;
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser;
        switch (h.a[methodToInvoke.ordinal()]) {
            case 1:
                return new AudioStoryEpisodeLocalModel();
            case 2:
                return new i(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0000\u0001\u0001\f\f\u0000\u0001\u0000\u0001\u0004\u0002\u0004\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006\u0002\u0007ለ\u0000\bለ\u0001\t\u0007\nဂ\u0002\u000b\u0004\f\u001b", new Object[]{"bitField0_", "id_", "order_", "language_", "title_", "audioUrl_", "durationMs_", "coverUrl_", "transcriptUrl_", "isFree_", "freeDurationMs_", "version_", "availableLanguages_", AudioStoryLanguageLocalModel.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<AudioStoryEpisodeLocalModel> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (AudioStoryEpisodeLocalModel.class) {
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

    public String getAudioUrl() {
        return this.audioUrl_;
    }

    public ByteString getAudioUrlBytes() {
        return ByteString.copyFromUtf8(this.audioUrl_);
    }

    public AudioStoryLanguageLocalModel getAvailableLanguages(int i) {
        return (AudioStoryLanguageLocalModel) this.availableLanguages_.get(i);
    }

    public int getAvailableLanguagesCount() {
        return this.availableLanguages_.size();
    }

    public List<AudioStoryLanguageLocalModel> getAvailableLanguagesList() {
        return this.availableLanguages_;
    }

    public m getAvailableLanguagesOrBuilder(int i) {
        return (m) this.availableLanguages_.get(i);
    }

    public List<? extends m> getAvailableLanguagesOrBuilderList() {
        return this.availableLanguages_;
    }

    public String getCoverUrl() {
        return this.coverUrl_;
    }

    public ByteString getCoverUrlBytes() {
        return ByteString.copyFromUtf8(this.coverUrl_);
    }

    public long getDurationMs() {
        return this.durationMs_;
    }

    public long getFreeDurationMs() {
        return this.freeDurationMs_;
    }

    public int getId() {
        return this.id_;
    }

    public boolean getIsFree() {
        return this.isFree_;
    }

    public String getLanguage() {
        return this.language_;
    }

    public ByteString getLanguageBytes() {
        return ByteString.copyFromUtf8(this.language_);
    }

    public int getOrder() {
        return this.order_;
    }

    public String getTitle() {
        return this.title_;
    }

    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    public String getTranscriptUrl() {
        return this.transcriptUrl_;
    }

    public ByteString getTranscriptUrlBytes() {
        return ByteString.copyFromUtf8(this.transcriptUrl_);
    }

    public int getVersion() {
        return this.version_;
    }

    public boolean hasCoverUrl() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasFreeDurationMs() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasTranscriptUrl() {
        return (this.bitField0_ & 2) != 0;
    }
}
