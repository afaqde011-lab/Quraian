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
import ym.r0;
import ym.s0;
import ym.t0;

public final class SocialLinkLocalModel extends GeneratedMessageLite<SocialLinkLocalModel, s0> implements t0 {
    private static final SocialLinkLocalModel DEFAULT_INSTANCE;
    public static final int LABEL_FIELD_NUMBER = 3;
    private static volatile Parser<SocialLinkLocalModel> PARSER = null;
    public static final int PLATFORM_FIELD_NUMBER = 1;
    public static final int URL_FIELD_NUMBER = 2;
    private String platform_ = "";
    private String url_ = "";
    private String label_ = "";

    static {
        SocialLinkLocalModel socialLinkLocalModel = new SocialLinkLocalModel();
        DEFAULT_INSTANCE = socialLinkLocalModel;
        GeneratedMessageLite.registerDefaultInstance(SocialLinkLocalModel.class, socialLinkLocalModel);
    }

    private SocialLinkLocalModel() {
    }

    private void clearLabel() {
        this.label_ = getDefaultInstance().getLabel();
    }

    private void clearPlatform() {
        this.platform_ = getDefaultInstance().getPlatform();
    }

    private void clearUrl() {
        this.url_ = getDefaultInstance().getUrl();
    }

    public static SocialLinkLocalModel getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static s0 newBuilder() {
        return (s0) DEFAULT_INSTANCE.createBuilder();
    }

    public static s0 newBuilder(SocialLinkLocalModel socialLinkLocalModel) {
        return (s0) DEFAULT_INSTANCE.createBuilder(socialLinkLocalModel);
    }

    public static SocialLinkLocalModel parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SocialLinkLocalModel) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SocialLinkLocalModel parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SocialLinkLocalModel) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SocialLinkLocalModel parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SocialLinkLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static SocialLinkLocalModel parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SocialLinkLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SocialLinkLocalModel parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SocialLinkLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static SocialLinkLocalModel parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SocialLinkLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static SocialLinkLocalModel parseFrom(InputStream inputStream) throws IOException {
        return (SocialLinkLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SocialLinkLocalModel parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SocialLinkLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SocialLinkLocalModel parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SocialLinkLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static SocialLinkLocalModel parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SocialLinkLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static SocialLinkLocalModel parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SocialLinkLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SocialLinkLocalModel parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SocialLinkLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Parser<SocialLinkLocalModel> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setLabel(String str) {
        str.getClass();
        this.label_ = str;
    }

    private void setLabelBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.label_ = byteString.toStringUtf8();
    }

    public void setPlatform(String str) {
        str.getClass();
        this.platform_ = str;
    }

    private void setPlatformBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.platform_ = byteString.toStringUtf8();
    }

    public void setUrl(String str) {
        str.getClass();
        this.url_ = str;
    }

    private void setUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.url_ = byteString.toStringUtf8();
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser;
        switch (r0.a[methodToInvoke.ordinal()]) {
            case 1:
                return new SocialLinkLocalModel();
            case 2:
                return new s0(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"platform_", "url_", "label_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<SocialLinkLocalModel> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (SocialLinkLocalModel.class) {
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

    public String getLabel() {
        return this.label_;
    }

    public ByteString getLabelBytes() {
        return ByteString.copyFromUtf8(this.label_);
    }

    public String getPlatform() {
        return this.platform_;
    }

    public ByteString getPlatformBytes() {
        return ByteString.copyFromUtf8(this.platform_);
    }

    public String getUrl() {
        return this.url_;
    }

    public ByteString getUrlBytes() {
        return ByteString.copyFromUtf8(this.url_);
    }
}
