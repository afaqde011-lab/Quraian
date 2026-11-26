package com.mchutov.p000quranify;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.RuntimeVersion;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import ym.a;
import ym.b;

public final class AudioStoryAuthorLocalModel extends GeneratedMessageLite<AudioStoryAuthorLocalModel, b> implements MessageLiteOrBuilder {
    private static final AudioStoryAuthorLocalModel DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile Parser<AudioStoryAuthorLocalModel> PARSER = null;
    public static final int PHOTO_URL_FIELD_NUMBER = 3;
    private int bitField0_;
    private int id_;
    private String name_ = RuntimeVersion.SUFFIX;
    private String photoUrl_ = RuntimeVersion.SUFFIX;

    static {
        AudioStoryAuthorLocalModel audioStoryAuthorLocalModel = new AudioStoryAuthorLocalModel();
        DEFAULT_INSTANCE = audioStoryAuthorLocalModel;
        GeneratedMessageLite.registerDefaultInstance(AudioStoryAuthorLocalModel.class, audioStoryAuthorLocalModel);
    }

    private AudioStoryAuthorLocalModel() {
    }

    private void clearId() {
        this.bitField0_ &= -2;
        this.id_ = 0;
    }

    private void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    private void clearPhotoUrl() {
        this.bitField0_ &= -3;
        this.photoUrl_ = getDefaultInstance().getPhotoUrl();
    }

    public static AudioStoryAuthorLocalModel getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static b newBuilder(AudioStoryAuthorLocalModel audioStoryAuthorLocalModel) {
        return DEFAULT_INSTANCE.createBuilder(audioStoryAuthorLocalModel);
    }

    public static AudioStoryAuthorLocalModel parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AudioStoryAuthorLocalModel) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AudioStoryAuthorLocalModel parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AudioStoryAuthorLocalModel) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AudioStoryAuthorLocalModel parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (AudioStoryAuthorLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static AudioStoryAuthorLocalModel parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AudioStoryAuthorLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static AudioStoryAuthorLocalModel parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (AudioStoryAuthorLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static AudioStoryAuthorLocalModel parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AudioStoryAuthorLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static AudioStoryAuthorLocalModel parseFrom(InputStream inputStream) throws IOException {
        return (AudioStoryAuthorLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AudioStoryAuthorLocalModel parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AudioStoryAuthorLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AudioStoryAuthorLocalModel parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (AudioStoryAuthorLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AudioStoryAuthorLocalModel parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AudioStoryAuthorLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static AudioStoryAuthorLocalModel parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (AudioStoryAuthorLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AudioStoryAuthorLocalModel parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AudioStoryAuthorLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Parser<AudioStoryAuthorLocalModel> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setId(int i11) {
        this.bitField0_ |= 1;
        this.id_ = i11;
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
        this.bitField0_ |= 2;
        this.photoUrl_ = str;
    }

    private void setPhotoUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.photoUrl_ = byteString.toStringUtf8();
        this.bitField0_ |= 2;
    }

    @Override
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (a.f23545a[methodToInvoke.ordinal()]) {
            case 1:
                return new AudioStoryAuthorLocalModel();
            case 2:
                return new b(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002Ȉ\u0003ለ\u0001", new Object[]{"bitField0_", "id_", "name_", "photoUrl_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<AudioStoryAuthorLocalModel> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (AudioStoryAuthorLocalModel.class) {
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

    public int getId() {
        return this.id_;
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

    public boolean hasId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasPhotoUrl() {
        return (this.bitField0_ & 2) != 0;
    }
}
