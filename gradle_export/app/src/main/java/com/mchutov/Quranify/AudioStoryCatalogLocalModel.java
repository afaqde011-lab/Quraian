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
import ym.c;
import ym.d;
import ym.p;

public final class AudioStoryCatalogLocalModel extends GeneratedMessageLite<AudioStoryCatalogLocalModel, d> implements MessageLiteOrBuilder {
    private static final AudioStoryCatalogLocalModel DEFAULT_INSTANCE;
    public static final int FETCHED_AT_FIELD_NUMBER = 1;
    private static volatile Parser<AudioStoryCatalogLocalModel> PARSER = null;
    public static final int STORIES_FIELD_NUMBER = 2;
    private long fetchedAt_;
    private Internal.ProtobufList<AudioStoryLocalModel> stories_ = GeneratedMessageLite.emptyProtobufList();

    static {
        AudioStoryCatalogLocalModel audioStoryCatalogLocalModel = new AudioStoryCatalogLocalModel();
        DEFAULT_INSTANCE = audioStoryCatalogLocalModel;
        GeneratedMessageLite.registerDefaultInstance(AudioStoryCatalogLocalModel.class, audioStoryCatalogLocalModel);
    }

    private AudioStoryCatalogLocalModel() {
    }

    public void addAllStories(Iterable<? extends AudioStoryLocalModel> iterable) {
        ensureStoriesIsMutable();
        AbstractMessageLite.addAll(iterable, this.stories_);
    }

    private void addStories(int i, AudioStoryLocalModel audioStoryLocalModel) {
        audioStoryLocalModel.getClass();
        ensureStoriesIsMutable();
        this.stories_.add(i, audioStoryLocalModel);
    }

    private void addStories(AudioStoryLocalModel audioStoryLocalModel) {
        audioStoryLocalModel.getClass();
        ensureStoriesIsMutable();
        this.stories_.add(audioStoryLocalModel);
    }

    private void clearFetchedAt() {
        this.fetchedAt_ = 0L;
    }

    private void clearStories() {
        this.stories_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureStoriesIsMutable() {
        Internal.ProtobufList<AudioStoryLocalModel> protobufList = this.stories_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.stories_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static AudioStoryCatalogLocalModel getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static d newBuilder() {
        return (d) DEFAULT_INSTANCE.createBuilder();
    }

    public static d newBuilder(AudioStoryCatalogLocalModel audioStoryCatalogLocalModel) {
        return (d) DEFAULT_INSTANCE.createBuilder(audioStoryCatalogLocalModel);
    }

    public static AudioStoryCatalogLocalModel parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AudioStoryCatalogLocalModel) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AudioStoryCatalogLocalModel parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AudioStoryCatalogLocalModel) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AudioStoryCatalogLocalModel parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (AudioStoryCatalogLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static AudioStoryCatalogLocalModel parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AudioStoryCatalogLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static AudioStoryCatalogLocalModel parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (AudioStoryCatalogLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static AudioStoryCatalogLocalModel parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AudioStoryCatalogLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static AudioStoryCatalogLocalModel parseFrom(InputStream inputStream) throws IOException {
        return (AudioStoryCatalogLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AudioStoryCatalogLocalModel parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AudioStoryCatalogLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AudioStoryCatalogLocalModel parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (AudioStoryCatalogLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AudioStoryCatalogLocalModel parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AudioStoryCatalogLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static AudioStoryCatalogLocalModel parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (AudioStoryCatalogLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AudioStoryCatalogLocalModel parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AudioStoryCatalogLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Parser<AudioStoryCatalogLocalModel> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeStories(int i) {
        ensureStoriesIsMutable();
        this.stories_.remove(i);
    }

    public void setFetchedAt(long j) {
        this.fetchedAt_ = j;
    }

    private void setStories(int i, AudioStoryLocalModel audioStoryLocalModel) {
        audioStoryLocalModel.getClass();
        ensureStoriesIsMutable();
        this.stories_.set(i, audioStoryLocalModel);
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser;
        switch (c.a[methodToInvoke.ordinal()]) {
            case 1:
                return new AudioStoryCatalogLocalModel();
            case 2:
                return new d(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0002\u0002\u001b", new Object[]{"fetchedAt_", "stories_", AudioStoryLocalModel.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<AudioStoryCatalogLocalModel> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (AudioStoryCatalogLocalModel.class) {
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

    public long getFetchedAt() {
        return this.fetchedAt_;
    }

    public AudioStoryLocalModel getStories(int i) {
        return (AudioStoryLocalModel) this.stories_.get(i);
    }

    public int getStoriesCount() {
        return this.stories_.size();
    }

    public List<AudioStoryLocalModel> getStoriesList() {
        return this.stories_;
    }

    public p getStoriesOrBuilder(int i) {
        return (p) this.stories_.get(i);
    }

    public List<? extends p> getStoriesOrBuilderList() {
        return this.stories_;
    }
}
