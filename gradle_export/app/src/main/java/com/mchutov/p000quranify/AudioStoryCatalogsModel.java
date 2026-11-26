package com.mchutov.p000quranify;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;
import ym.e;
import ym.f;
import ym.g;

public final class AudioStoryCatalogsModel extends GeneratedMessageLite<AudioStoryCatalogsModel, f> implements MessageLiteOrBuilder {
    public static final int CATALOGS_FIELD_NUMBER = 1;
    private static final AudioStoryCatalogsModel DEFAULT_INSTANCE;
    private static volatile Parser<AudioStoryCatalogsModel> PARSER;
    private MapFieldLite<String, AudioStoryCatalogLocalModel> catalogs_ = MapFieldLite.emptyMapField();

    static {
        AudioStoryCatalogsModel audioStoryCatalogsModel = new AudioStoryCatalogsModel();
        DEFAULT_INSTANCE = audioStoryCatalogsModel;
        GeneratedMessageLite.registerDefaultInstance(AudioStoryCatalogsModel.class, audioStoryCatalogsModel);
    }

    private AudioStoryCatalogsModel() {
    }

    public static AudioStoryCatalogsModel getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public Map<String, AudioStoryCatalogLocalModel> getMutableCatalogsMap() {
        return internalGetMutableCatalogs();
    }

    private MapFieldLite<String, AudioStoryCatalogLocalModel> internalGetCatalogs() {
        return this.catalogs_;
    }

    private MapFieldLite<String, AudioStoryCatalogLocalModel> internalGetMutableCatalogs() {
        if (!this.catalogs_.isMutable()) {
            this.catalogs_ = this.catalogs_.mutableCopy();
        }
        return this.catalogs_;
    }

    public static f newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static f newBuilder(AudioStoryCatalogsModel audioStoryCatalogsModel) {
        return DEFAULT_INSTANCE.createBuilder(audioStoryCatalogsModel);
    }

    public static AudioStoryCatalogsModel parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AudioStoryCatalogsModel) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AudioStoryCatalogsModel parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AudioStoryCatalogsModel) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AudioStoryCatalogsModel parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (AudioStoryCatalogsModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static AudioStoryCatalogsModel parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AudioStoryCatalogsModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static AudioStoryCatalogsModel parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (AudioStoryCatalogsModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static AudioStoryCatalogsModel parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AudioStoryCatalogsModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static AudioStoryCatalogsModel parseFrom(InputStream inputStream) throws IOException {
        return (AudioStoryCatalogsModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AudioStoryCatalogsModel parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AudioStoryCatalogsModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AudioStoryCatalogsModel parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (AudioStoryCatalogsModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AudioStoryCatalogsModel parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AudioStoryCatalogsModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static AudioStoryCatalogsModel parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (AudioStoryCatalogsModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AudioStoryCatalogsModel parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AudioStoryCatalogsModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Parser<AudioStoryCatalogsModel> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public boolean containsCatalogs(String str) {
        str.getClass();
        return internalGetCatalogs().containsKey(str);
    }

    @Override
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (e.f23548a[methodToInvoke.ordinal()]) {
            case 1:
                return new AudioStoryCatalogsModel();
            case 2:
                return new f(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"catalogs_", g.f23550a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<AudioStoryCatalogsModel> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (AudioStoryCatalogsModel.class) {
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

    @Deprecated
    public Map<String, AudioStoryCatalogLocalModel> getCatalogs() {
        return getCatalogsMap();
    }

    public int getCatalogsCount() {
        return internalGetCatalogs().size();
    }

    public Map<String, AudioStoryCatalogLocalModel> getCatalogsMap() {
        return Collections.unmodifiableMap(internalGetCatalogs());
    }

    public AudioStoryCatalogLocalModel getCatalogsOrDefault(String str, AudioStoryCatalogLocalModel audioStoryCatalogLocalModel) {
        str.getClass();
        MapFieldLite<String, AudioStoryCatalogLocalModel> mapFieldLiteInternalGetCatalogs = internalGetCatalogs();
        return mapFieldLiteInternalGetCatalogs.containsKey(str) ? mapFieldLiteInternalGetCatalogs.get(str) : audioStoryCatalogLocalModel;
    }

    public AudioStoryCatalogLocalModel getCatalogsOrThrow(String str) {
        str.getClass();
        MapFieldLite<String, AudioStoryCatalogLocalModel> mapFieldLiteInternalGetCatalogs = internalGetCatalogs();
        if (mapFieldLiteInternalGetCatalogs.containsKey(str)) {
            return mapFieldLiteInternalGetCatalogs.get(str);
        }
        throw new IllegalArgumentException();
    }
}
