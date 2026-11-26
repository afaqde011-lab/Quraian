package com.mchutov.quranify;

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
import ym.s;
import ym.t;

public final class FavoriteReciterModel extends GeneratedMessageLite<FavoriteReciterModel, t> implements MessageLiteOrBuilder {
    private static final FavoriteReciterModel DEFAULT_INSTANCE;
    public static final int FAVORITE_RECITERS_FIELD_NUMBER = 1;
    private static volatile Parser<FavoriteReciterModel> PARSER;
    private int favoriteRecitersMemoizedSerializedSize = -1;
    private Internal.IntList favoriteReciters_ = GeneratedMessageLite.emptyIntList();

    static {
        FavoriteReciterModel favoriteReciterModel = new FavoriteReciterModel();
        DEFAULT_INSTANCE = favoriteReciterModel;
        GeneratedMessageLite.registerDefaultInstance(FavoriteReciterModel.class, favoriteReciterModel);
    }

    private FavoriteReciterModel() {
    }

    public void addAllFavoriteReciters(Iterable<? extends Integer> iterable) {
        ensureFavoriteRecitersIsMutable();
        AbstractMessageLite.addAll(iterable, this.favoriteReciters_);
    }

    private void addFavoriteReciters(int i) {
        ensureFavoriteRecitersIsMutable();
        this.favoriteReciters_.addInt(i);
    }

    public void clearFavoriteReciters() {
        this.favoriteReciters_ = GeneratedMessageLite.emptyIntList();
    }

    private void ensureFavoriteRecitersIsMutable() {
        Internal.IntList intList = this.favoriteReciters_;
        if (intList.isModifiable()) {
            return;
        }
        this.favoriteReciters_ = GeneratedMessageLite.mutableCopy(intList);
    }

    public static FavoriteReciterModel getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static t newBuilder() {
        return (t) DEFAULT_INSTANCE.createBuilder();
    }

    public static t newBuilder(FavoriteReciterModel favoriteReciterModel) {
        return (t) DEFAULT_INSTANCE.createBuilder(favoriteReciterModel);
    }

    public static FavoriteReciterModel parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FavoriteReciterModel) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FavoriteReciterModel parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FavoriteReciterModel) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FavoriteReciterModel parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FavoriteReciterModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FavoriteReciterModel parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FavoriteReciterModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FavoriteReciterModel parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FavoriteReciterModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FavoriteReciterModel parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FavoriteReciterModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static FavoriteReciterModel parseFrom(InputStream inputStream) throws IOException {
        return (FavoriteReciterModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FavoriteReciterModel parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FavoriteReciterModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FavoriteReciterModel parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FavoriteReciterModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static FavoriteReciterModel parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FavoriteReciterModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FavoriteReciterModel parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FavoriteReciterModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FavoriteReciterModel parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FavoriteReciterModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Parser<FavoriteReciterModel> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setFavoriteReciters(int i, int i2) {
        ensureFavoriteRecitersIsMutable();
        this.favoriteReciters_.setInt(i, i2);
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser;
        switch (s.a[methodToInvoke.ordinal()]) {
            case 1:
                return new FavoriteReciterModel();
            case 2:
                return new t(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001'", new Object[]{"favoriteReciters_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FavoriteReciterModel> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (FavoriteReciterModel.class) {
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

    public int getFavoriteReciters(int i) {
        return this.favoriteReciters_.getInt(i);
    }

    public int getFavoriteRecitersCount() {
        return this.favoriteReciters_.size();
    }

    public List<Integer> getFavoriteRecitersList() {
        return this.favoriteReciters_;
    }
}
