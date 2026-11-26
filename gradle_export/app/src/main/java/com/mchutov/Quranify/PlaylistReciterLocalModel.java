package com.mchutov.quranify;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import ym.f0;
import ym.g0;

public final class PlaylistReciterLocalModel extends GeneratedMessageLite<PlaylistReciterLocalModel, g0> implements MessageLiteOrBuilder {
    private static final PlaylistReciterLocalModel DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int IS_NEW_FIELD_NUMBER = 4;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile Parser<PlaylistReciterLocalModel> PARSER = null;
    public static final int PHOTO_URL_FIELD_NUMBER = 3;
    private int id_;
    private boolean isNew_;
    private String name_ = "";
    private String photoUrl_ = "";

    static {
        PlaylistReciterLocalModel playlistReciterLocalModel = new PlaylistReciterLocalModel();
        DEFAULT_INSTANCE = playlistReciterLocalModel;
        GeneratedMessageLite.registerDefaultInstance(PlaylistReciterLocalModel.class, playlistReciterLocalModel);
    }

    private PlaylistReciterLocalModel() {
    }

    private void clearId() {
        this.id_ = 0;
    }

    private void clearIsNew() {
        this.isNew_ = false;
    }

    private void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    private void clearPhotoUrl() {
        this.photoUrl_ = getDefaultInstance().getPhotoUrl();
    }

    public static PlaylistReciterLocalModel getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static g0 newBuilder() {
        return (g0) DEFAULT_INSTANCE.createBuilder();
    }

    public static g0 newBuilder(PlaylistReciterLocalModel playlistReciterLocalModel) {
        return (g0) DEFAULT_INSTANCE.createBuilder(playlistReciterLocalModel);
    }

    public static PlaylistReciterLocalModel parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PlaylistReciterLocalModel) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PlaylistReciterLocalModel parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlaylistReciterLocalModel) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PlaylistReciterLocalModel parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (PlaylistReciterLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static PlaylistReciterLocalModel parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlaylistReciterLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static PlaylistReciterLocalModel parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (PlaylistReciterLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static PlaylistReciterLocalModel parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlaylistReciterLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static PlaylistReciterLocalModel parseFrom(InputStream inputStream) throws IOException {
        return (PlaylistReciterLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PlaylistReciterLocalModel parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlaylistReciterLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PlaylistReciterLocalModel parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PlaylistReciterLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static PlaylistReciterLocalModel parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlaylistReciterLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static PlaylistReciterLocalModel parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PlaylistReciterLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PlaylistReciterLocalModel parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlaylistReciterLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Parser<PlaylistReciterLocalModel> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setId(int i) {
        this.id_ = i;
    }

    public void setIsNew(boolean z) {
        this.isNew_ = z;
    }

    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    private void setNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.name_ = byteString.toStringUtf8();
    }

    public void setPhotoUrl(String str) {
        str.getClass();
        this.photoUrl_ = str;
    }

    private void setPhotoUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.photoUrl_ = byteString.toStringUtf8();
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser;
        switch (f0.a[methodToInvoke.ordinal()]) {
            case 1:
                return new PlaylistReciterLocalModel();
            case 2:
                return new g0(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002Ȉ\u0003Ȉ\u0004\u0007", new Object[]{"id_", "name_", "photoUrl_", "isNew_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<PlaylistReciterLocalModel> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (PlaylistReciterLocalModel.class) {
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

    public int getId() {
        return this.id_;
    }

    public boolean getIsNew() {
        return this.isNew_;
    }

    public String getName() {
        return this.name_;
    }

    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    public String getPhotoUrl() {
        return this.photoUrl_;
    }

    public ByteString getPhotoUrlBytes() {
        return ByteString.copyFromUtf8(this.photoUrl_);
    }
}
