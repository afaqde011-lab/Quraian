package com.mchutov.p000quranify;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.google.protobuf.RuntimeVersion;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import ym.k;
import ym.l;
import ym.m;

public final class AudioStoryLanguageLocalModel extends GeneratedMessageLite<AudioStoryLanguageLocalModel, l> implements m {
    public static final int CODE_FIELD_NUMBER = 1;
    private static final AudioStoryLanguageLocalModel DEFAULT_INSTANCE;
    public static final int LABEL_FIELD_NUMBER = 2;
    private static volatile Parser<AudioStoryLanguageLocalModel> PARSER;
    private String code_ = RuntimeVersion.SUFFIX;
    private String label_ = RuntimeVersion.SUFFIX;

    static {
        AudioStoryLanguageLocalModel audioStoryLanguageLocalModel = new AudioStoryLanguageLocalModel();
        DEFAULT_INSTANCE = audioStoryLanguageLocalModel;
        GeneratedMessageLite.registerDefaultInstance(AudioStoryLanguageLocalModel.class, audioStoryLanguageLocalModel);
    }

    private AudioStoryLanguageLocalModel() {
    }

    private void clearCode() {
        this.code_ = getDefaultInstance().getCode();
    }

    private void clearLabel() {
        this.label_ = getDefaultInstance().getLabel();
    }

    public static AudioStoryLanguageLocalModel getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static l newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static l newBuilder(AudioStoryLanguageLocalModel audioStoryLanguageLocalModel) {
        return DEFAULT_INSTANCE.createBuilder(audioStoryLanguageLocalModel);
    }

    public static AudioStoryLanguageLocalModel parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AudioStoryLanguageLocalModel) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AudioStoryLanguageLocalModel parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AudioStoryLanguageLocalModel) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AudioStoryLanguageLocalModel parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (AudioStoryLanguageLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static AudioStoryLanguageLocalModel parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AudioStoryLanguageLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static AudioStoryLanguageLocalModel parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (AudioStoryLanguageLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static AudioStoryLanguageLocalModel parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AudioStoryLanguageLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static AudioStoryLanguageLocalModel parseFrom(InputStream inputStream) throws IOException {
        return (AudioStoryLanguageLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AudioStoryLanguageLocalModel parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AudioStoryLanguageLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AudioStoryLanguageLocalModel parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (AudioStoryLanguageLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AudioStoryLanguageLocalModel parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AudioStoryLanguageLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static AudioStoryLanguageLocalModel parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (AudioStoryLanguageLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AudioStoryLanguageLocalModel parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AudioStoryLanguageLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Parser<AudioStoryLanguageLocalModel> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setCode(String str) {
        str.getClass();
        this.code_ = str;
    }

    private void setCodeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.code_ = byteString.toStringUtf8();
    }

    public void setLabel(String str) {
        str.getClass();
        this.label_ = str;
    }

    private void setLabelBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.label_ = byteString.toStringUtf8();
    }

    @Override
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (k.f23553a[methodToInvoke.ordinal()]) {
            case 1:
                return new AudioStoryLanguageLocalModel();
            case 2:
                return new l(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"code_", "label_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<AudioStoryLanguageLocalModel> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (AudioStoryLanguageLocalModel.class) {
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

    public String getCode() {
        return this.code_;
    }

    public ByteString getCodeBytes() {
        return ByteString.copyFromUtf8(this.code_);
    }

    public String getLabel() {
        return this.label_;
    }

    public ByteString getLabelBytes() {
        return ByteString.copyFromUtf8(this.label_);
    }
}
