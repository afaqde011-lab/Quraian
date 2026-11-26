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
import ym.b;
import ym.j;
import ym.n;
import ym.o;
import ym.p;

public final class AudioStoryLocalModel extends GeneratedMessageLite<AudioStoryLocalModel, o> implements p {
    public static final int AUTHOR_FIELD_NUMBER = 6;
    public static final int COVER_URL_FIELD_NUMBER = 5;
    private static final AudioStoryLocalModel DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 4;
    public static final int EPISODES_FIELD_NUMBER = 7;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile Parser<AudioStoryLocalModel> PARSER = null;
    public static final int SLUG_FIELD_NUMBER = 2;
    public static final int TITLE_FIELD_NUMBER = 3;
    public static final int VERSION_FIELD_NUMBER = 8;
    private AudioStoryAuthorLocalModel author_;
    private int bitField0_;
    private int id_;
    private int version_;
    private String slug_ = "";
    private String title_ = "";
    private String description_ = "";
    private String coverUrl_ = "";
    private Internal.ProtobufList<AudioStoryEpisodeLocalModel> episodes_ = GeneratedMessageLite.emptyProtobufList();

    static {
        AudioStoryLocalModel audioStoryLocalModel = new AudioStoryLocalModel();
        DEFAULT_INSTANCE = audioStoryLocalModel;
        GeneratedMessageLite.registerDefaultInstance(AudioStoryLocalModel.class, audioStoryLocalModel);
    }

    private AudioStoryLocalModel() {
    }

    public void addAllEpisodes(Iterable<? extends AudioStoryEpisodeLocalModel> iterable) {
        ensureEpisodesIsMutable();
        AbstractMessageLite.addAll(iterable, this.episodes_);
    }

    private void addEpisodes(int i, AudioStoryEpisodeLocalModel audioStoryEpisodeLocalModel) {
        audioStoryEpisodeLocalModel.getClass();
        ensureEpisodesIsMutable();
        this.episodes_.add(i, audioStoryEpisodeLocalModel);
    }

    private void addEpisodes(AudioStoryEpisodeLocalModel audioStoryEpisodeLocalModel) {
        audioStoryEpisodeLocalModel.getClass();
        ensureEpisodesIsMutable();
        this.episodes_.add(audioStoryEpisodeLocalModel);
    }

    private void clearAuthor() {
        this.author_ = null;
        this.bitField0_ &= -5;
    }

    private void clearCoverUrl() {
        this.bitField0_ &= -3;
        this.coverUrl_ = getDefaultInstance().getCoverUrl();
    }

    private void clearDescription() {
        this.bitField0_ &= -2;
        this.description_ = getDefaultInstance().getDescription();
    }

    private void clearEpisodes() {
        this.episodes_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearId() {
        this.id_ = 0;
    }

    private void clearSlug() {
        this.slug_ = getDefaultInstance().getSlug();
    }

    private void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    private void clearVersion() {
        this.version_ = 0;
    }

    private void ensureEpisodesIsMutable() {
        Internal.ProtobufList<AudioStoryEpisodeLocalModel> protobufList = this.episodes_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.episodes_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static AudioStoryLocalModel getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeAuthor(AudioStoryAuthorLocalModel audioStoryAuthorLocalModel) {
        audioStoryAuthorLocalModel.getClass();
        AudioStoryAuthorLocalModel audioStoryAuthorLocalModel2 = this.author_;
        if (audioStoryAuthorLocalModel2 == null || audioStoryAuthorLocalModel2 == AudioStoryAuthorLocalModel.getDefaultInstance()) {
            this.author_ = audioStoryAuthorLocalModel;
        } else {
            this.author_ = (AudioStoryAuthorLocalModel) ((b) AudioStoryAuthorLocalModel.newBuilder(this.author_).mergeFrom(audioStoryAuthorLocalModel)).buildPartial();
        }
        this.bitField0_ |= 4;
    }

    public static o newBuilder() {
        return (o) DEFAULT_INSTANCE.createBuilder();
    }

    public static o newBuilder(AudioStoryLocalModel audioStoryLocalModel) {
        return (o) DEFAULT_INSTANCE.createBuilder(audioStoryLocalModel);
    }

    public static AudioStoryLocalModel parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AudioStoryLocalModel) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AudioStoryLocalModel parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AudioStoryLocalModel) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AudioStoryLocalModel parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (AudioStoryLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static AudioStoryLocalModel parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AudioStoryLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static AudioStoryLocalModel parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (AudioStoryLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static AudioStoryLocalModel parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AudioStoryLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static AudioStoryLocalModel parseFrom(InputStream inputStream) throws IOException {
        return (AudioStoryLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AudioStoryLocalModel parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AudioStoryLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AudioStoryLocalModel parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (AudioStoryLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AudioStoryLocalModel parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AudioStoryLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static AudioStoryLocalModel parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (AudioStoryLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AudioStoryLocalModel parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AudioStoryLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Parser<AudioStoryLocalModel> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeEpisodes(int i) {
        ensureEpisodesIsMutable();
        this.episodes_.remove(i);
    }

    public void setAuthor(AudioStoryAuthorLocalModel audioStoryAuthorLocalModel) {
        audioStoryAuthorLocalModel.getClass();
        this.author_ = audioStoryAuthorLocalModel;
        this.bitField0_ |= 4;
    }

    public void setCoverUrl(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.coverUrl_ = str;
    }

    private void setCoverUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.coverUrl_ = byteString.toStringUtf8();
        this.bitField0_ |= 2;
    }

    public void setDescription(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.description_ = str;
    }

    private void setDescriptionBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.description_ = byteString.toStringUtf8();
        this.bitField0_ |= 1;
    }

    private void setEpisodes(int i, AudioStoryEpisodeLocalModel audioStoryEpisodeLocalModel) {
        audioStoryEpisodeLocalModel.getClass();
        ensureEpisodesIsMutable();
        this.episodes_.set(i, audioStoryEpisodeLocalModel);
    }

    public void setId(int i) {
        this.id_ = i;
    }

    public void setSlug(String str) {
        str.getClass();
        this.slug_ = str;
    }

    private void setSlugBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.slug_ = byteString.toStringUtf8();
    }

    public void setTitle(String str) {
        str.getClass();
        this.title_ = str;
    }

    private void setTitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.title_ = byteString.toStringUtf8();
    }

    public void setVersion(int i) {
        this.version_ = i;
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser;
        switch (n.a[methodToInvoke.ordinal()]) {
            case 1:
                return new AudioStoryLocalModel();
            case 2:
                return new o(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u0004\u0002Ȉ\u0003Ȉ\u0004ለ\u0000\u0005ለ\u0001\u0006ဉ\u0002\u0007\u001b\b\u0004", new Object[]{"bitField0_", "id_", "slug_", "title_", "description_", "coverUrl_", "author_", "episodes_", AudioStoryEpisodeLocalModel.class, "version_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<AudioStoryLocalModel> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (AudioStoryLocalModel.class) {
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

    public AudioStoryAuthorLocalModel getAuthor() {
        AudioStoryAuthorLocalModel audioStoryAuthorLocalModel = this.author_;
        return audioStoryAuthorLocalModel == null ? AudioStoryAuthorLocalModel.getDefaultInstance() : audioStoryAuthorLocalModel;
    }

    public String getCoverUrl() {
        return this.coverUrl_;
    }

    public ByteString getCoverUrlBytes() {
        return ByteString.copyFromUtf8(this.coverUrl_);
    }

    public String getDescription() {
        return this.description_;
    }

    public ByteString getDescriptionBytes() {
        return ByteString.copyFromUtf8(this.description_);
    }

    public AudioStoryEpisodeLocalModel getEpisodes(int i) {
        return (AudioStoryEpisodeLocalModel) this.episodes_.get(i);
    }

    public int getEpisodesCount() {
        return this.episodes_.size();
    }

    public List<AudioStoryEpisodeLocalModel> getEpisodesList() {
        return this.episodes_;
    }

    public j getEpisodesOrBuilder(int i) {
        return (j) this.episodes_.get(i);
    }

    public List<? extends j> getEpisodesOrBuilderList() {
        return this.episodes_;
    }

    public int getId() {
        return this.id_;
    }

    public String getSlug() {
        return this.slug_;
    }

    public ByteString getSlugBytes() {
        return ByteString.copyFromUtf8(this.slug_);
    }

    public String getTitle() {
        return this.title_;
    }

    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    public int getVersion() {
        return this.version_;
    }

    public boolean hasAuthor() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasCoverUrl() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasDescription() {
        return (this.bitField0_ & 1) != 0;
    }
}
