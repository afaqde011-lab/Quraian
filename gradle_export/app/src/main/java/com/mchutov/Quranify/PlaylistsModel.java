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
import ym.e0;
import ym.h0;
import ym.i0;

public final class PlaylistsModel extends GeneratedMessageLite<PlaylistsModel, i0> implements MessageLiteOrBuilder {
    private static final PlaylistsModel DEFAULT_INSTANCE;
    private static volatile Parser<PlaylistsModel> PARSER = null;
    public static final int PLAYLISTS_FIELD_NUMBER = 1;
    private Internal.ProtobufList<PlaylistLocalModel> playlists_ = GeneratedMessageLite.emptyProtobufList();

    static {
        PlaylistsModel playlistsModel = new PlaylistsModel();
        DEFAULT_INSTANCE = playlistsModel;
        GeneratedMessageLite.registerDefaultInstance(PlaylistsModel.class, playlistsModel);
    }

    private PlaylistsModel() {
    }

    public void addAllPlaylists(Iterable<? extends PlaylistLocalModel> iterable) {
        ensurePlaylistsIsMutable();
        AbstractMessageLite.addAll(iterable, this.playlists_);
    }

    private void addPlaylists(int i, PlaylistLocalModel playlistLocalModel) {
        playlistLocalModel.getClass();
        ensurePlaylistsIsMutable();
        this.playlists_.add(i, playlistLocalModel);
    }

    private void addPlaylists(PlaylistLocalModel playlistLocalModel) {
        playlistLocalModel.getClass();
        ensurePlaylistsIsMutable();
        this.playlists_.add(playlistLocalModel);
    }

    private void clearPlaylists() {
        this.playlists_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensurePlaylistsIsMutable() {
        Internal.ProtobufList<PlaylistLocalModel> protobufList = this.playlists_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.playlists_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static PlaylistsModel getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static i0 newBuilder() {
        return (i0) DEFAULT_INSTANCE.createBuilder();
    }

    public static i0 newBuilder(PlaylistsModel playlistsModel) {
        return (i0) DEFAULT_INSTANCE.createBuilder(playlistsModel);
    }

    public static PlaylistsModel parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PlaylistsModel) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PlaylistsModel parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlaylistsModel) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PlaylistsModel parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (PlaylistsModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static PlaylistsModel parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlaylistsModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static PlaylistsModel parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (PlaylistsModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static PlaylistsModel parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlaylistsModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static PlaylistsModel parseFrom(InputStream inputStream) throws IOException {
        return (PlaylistsModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PlaylistsModel parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlaylistsModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PlaylistsModel parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PlaylistsModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static PlaylistsModel parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlaylistsModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static PlaylistsModel parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PlaylistsModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PlaylistsModel parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlaylistsModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Parser<PlaylistsModel> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removePlaylists(int i) {
        ensurePlaylistsIsMutable();
        this.playlists_.remove(i);
    }

    private void setPlaylists(int i, PlaylistLocalModel playlistLocalModel) {
        playlistLocalModel.getClass();
        ensurePlaylistsIsMutable();
        this.playlists_.set(i, playlistLocalModel);
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser;
        switch (h0.a[methodToInvoke.ordinal()]) {
            case 1:
                return new PlaylistsModel();
            case 2:
                return new i0(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"playlists_", PlaylistLocalModel.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<PlaylistsModel> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (PlaylistsModel.class) {
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

    public PlaylistLocalModel getPlaylists(int i) {
        return (PlaylistLocalModel) this.playlists_.get(i);
    }

    public int getPlaylistsCount() {
        return this.playlists_.size();
    }

    public List<PlaylistLocalModel> getPlaylistsList() {
        return this.playlists_;
    }

    public e0 getPlaylistsOrBuilder(int i) {
        return (e0) this.playlists_.get(i);
    }

    public List<? extends e0> getPlaylistsOrBuilderList() {
        return this.playlists_;
    }
}
