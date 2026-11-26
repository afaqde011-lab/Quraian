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
import ym.b0;
import ym.c0;
import ym.d0;
import ym.e0;

public final class PlaylistLocalModel extends GeneratedMessageLite<PlaylistLocalModel, d0> implements e0 {
    public static final int COVER_URL_FIELD_NUMBER = 6;
    private static final PlaylistLocalModel DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 5;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int IS_SPECIAL_FIELD_NUMBER = 7;
    private static volatile Parser<PlaylistLocalModel> PARSER = null;
    public static final int SLUG_FIELD_NUMBER = 2;
    public static final int SUBTITLE_FIELD_NUMBER = 4;
    public static final int SURAHS_FIELD_NUMBER = 8;
    public static final int TITLE_FIELD_NUMBER = 3;
    public static final int TITLE_OTHER_LANGUAGES_FIELD_NUMBER = 9;
    private int id_;
    private boolean isSpecial_;
    private String slug_ = RuntimeVersion.SUFFIX;
    private String title_ = RuntimeVersion.SUFFIX;
    private String subtitle_ = RuntimeVersion.SUFFIX;
    private String description_ = RuntimeVersion.SUFFIX;
    private String coverUrl_ = RuntimeVersion.SUFFIX;
    private Internal.ProtobufList<PlaylistEntryLocalModel> surahs_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<String> titleOtherLanguages_ = GeneratedMessageLite.emptyProtobufList();

    static {
        PlaylistLocalModel playlistLocalModel = new PlaylistLocalModel();
        DEFAULT_INSTANCE = playlistLocalModel;
        GeneratedMessageLite.registerDefaultInstance(PlaylistLocalModel.class, playlistLocalModel);
    }

    private PlaylistLocalModel() {
    }

    public void addAllSurahs(Iterable<? extends PlaylistEntryLocalModel> iterable) {
        ensureSurahsIsMutable();
        AbstractMessageLite.addAll(iterable, this.surahs_);
    }

    public void addAllTitleOtherLanguages(Iterable<String> iterable) {
        ensureTitleOtherLanguagesIsMutable();
        AbstractMessageLite.addAll(iterable, this.titleOtherLanguages_);
    }

    private void addSurahs(int i11, PlaylistEntryLocalModel playlistEntryLocalModel) {
        playlistEntryLocalModel.getClass();
        ensureSurahsIsMutable();
        this.surahs_.add(i11, playlistEntryLocalModel);
    }

    private void addSurahs(PlaylistEntryLocalModel playlistEntryLocalModel) {
        playlistEntryLocalModel.getClass();
        ensureSurahsIsMutable();
        this.surahs_.add(playlistEntryLocalModel);
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

    private void clearCoverUrl() {
        this.coverUrl_ = getDefaultInstance().getCoverUrl();
    }

    private void clearDescription() {
        this.description_ = getDefaultInstance().getDescription();
    }

    private void clearId() {
        this.id_ = 0;
    }

    private void clearIsSpecial() {
        this.isSpecial_ = false;
    }

    private void clearSlug() {
        this.slug_ = getDefaultInstance().getSlug();
    }

    private void clearSubtitle() {
        this.subtitle_ = getDefaultInstance().getSubtitle();
    }

    private void clearSurahs() {
        this.surahs_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    private void clearTitleOtherLanguages() {
        this.titleOtherLanguages_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureSurahsIsMutable() {
        Internal.ProtobufList<PlaylistEntryLocalModel> protobufList = this.surahs_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.surahs_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureTitleOtherLanguagesIsMutable() {
        Internal.ProtobufList<String> protobufList = this.titleOtherLanguages_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.titleOtherLanguages_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static PlaylistLocalModel getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static d0 newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static d0 newBuilder(PlaylistLocalModel playlistLocalModel) {
        return DEFAULT_INSTANCE.createBuilder(playlistLocalModel);
    }

    public static PlaylistLocalModel parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PlaylistLocalModel) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PlaylistLocalModel parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlaylistLocalModel) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PlaylistLocalModel parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (PlaylistLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static PlaylistLocalModel parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlaylistLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static PlaylistLocalModel parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (PlaylistLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static PlaylistLocalModel parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlaylistLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static PlaylistLocalModel parseFrom(InputStream inputStream) throws IOException {
        return (PlaylistLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PlaylistLocalModel parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlaylistLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PlaylistLocalModel parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PlaylistLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static PlaylistLocalModel parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlaylistLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static PlaylistLocalModel parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PlaylistLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PlaylistLocalModel parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlaylistLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Parser<PlaylistLocalModel> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeSurahs(int i11) {
        ensureSurahsIsMutable();
        this.surahs_.remove(i11);
    }

    public void setCoverUrl(String str) {
        str.getClass();
        this.coverUrl_ = str;
    }

    private void setCoverUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.coverUrl_ = byteString.toStringUtf8();
    }

    public void setDescription(String str) {
        str.getClass();
        this.description_ = str;
    }

    private void setDescriptionBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.description_ = byteString.toStringUtf8();
    }

    public void setId(int i11) {
        this.id_ = i11;
    }

    public void setIsSpecial(boolean z11) {
        this.isSpecial_ = z11;
    }

    public void setSlug(String str) {
        str.getClass();
        this.slug_ = str;
    }

    private void setSlugBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.slug_ = byteString.toStringUtf8();
    }

    public void setSubtitle(String str) {
        str.getClass();
        this.subtitle_ = str;
    }

    private void setSubtitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.subtitle_ = byteString.toStringUtf8();
    }

    private void setSurahs(int i11, PlaylistEntryLocalModel playlistEntryLocalModel) {
        playlistEntryLocalModel.getClass();
        ensureSurahsIsMutable();
        this.surahs_.set(i11, playlistEntryLocalModel);
    }

    public void setTitle(String str) {
        str.getClass();
        this.title_ = str;
    }

    private void setTitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.title_ = byteString.toStringUtf8();
    }

    private void setTitleOtherLanguages(int i11, String str) {
        str.getClass();
        ensureTitleOtherLanguagesIsMutable();
        this.titleOtherLanguages_.set(i11, str);
    }

    @Override
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (c0.f23547a[methodToInvoke.ordinal()]) {
            case 1:
                return new PlaylistLocalModel();
            case 2:
                return new d0(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0002\u0000\u0001\u0004\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007\u0007\b\u001b\tȚ", new Object[]{"id_", "slug_", "title_", "subtitle_", "description_", "coverUrl_", "isSpecial_", "surahs_", PlaylistEntryLocalModel.class, "titleOtherLanguages_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<PlaylistLocalModel> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (PlaylistLocalModel.class) {
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

    public int getId() {
        return this.id_;
    }

    public boolean getIsSpecial() {
        return this.isSpecial_;
    }

    public String getSlug() {
        return this.slug_;
    }

    public ByteString getSlugBytes() {
        return ByteString.copyFromUtf8(this.slug_);
    }

    public String getSubtitle() {
        return this.subtitle_;
    }

    public ByteString getSubtitleBytes() {
        return ByteString.copyFromUtf8(this.subtitle_);
    }

    public PlaylistEntryLocalModel getSurahs(int i11) {
        return this.surahs_.get(i11);
    }

    public int getSurahsCount() {
        return this.surahs_.size();
    }

    public List<PlaylistEntryLocalModel> getSurahsList() {
        return this.surahs_;
    }

    public b0 getSurahsOrBuilder(int i11) {
        return this.surahs_.get(i11);
    }

    public List<? extends b0> getSurahsOrBuilderList() {
        return this.surahs_;
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
}
