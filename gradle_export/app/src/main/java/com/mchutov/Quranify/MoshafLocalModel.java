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
import ym.w;
import ym.w0;
import ym.x;
import ym.y;

public final class MoshafLocalModel extends GeneratedMessageLite<MoshafLocalModel, x> implements y {
    private static final MoshafLocalModel DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int MOSHAF_TYPE_FIELD_NUMBER = 4;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile Parser<MoshafLocalModel> PARSER = null;
    public static final int SERVER_FIELD_NUMBER = 3;
    public static final int SURAH_NUMBER_FIELD_NUMBER = 6;
    private int id_;
    private int moshafType_;
    private String name_ = "";
    private String server_ = "";
    private Internal.ProtobufList<SurahLocalModel> surahNumber_ = GeneratedMessageLite.emptyProtobufList();

    static {
        MoshafLocalModel moshafLocalModel = new MoshafLocalModel();
        DEFAULT_INSTANCE = moshafLocalModel;
        GeneratedMessageLite.registerDefaultInstance(MoshafLocalModel.class, moshafLocalModel);
    }

    private MoshafLocalModel() {
    }

    public void addAllSurahNumber(Iterable<? extends SurahLocalModel> iterable) {
        ensureSurahNumberIsMutable();
        AbstractMessageLite.addAll(iterable, this.surahNumber_);
    }

    private void addSurahNumber(int i, SurahLocalModel surahLocalModel) {
        surahLocalModel.getClass();
        ensureSurahNumberIsMutable();
        this.surahNumber_.add(i, surahLocalModel);
    }

    private void addSurahNumber(SurahLocalModel surahLocalModel) {
        surahLocalModel.getClass();
        ensureSurahNumberIsMutable();
        this.surahNumber_.add(surahLocalModel);
    }

    private void clearId() {
        this.id_ = 0;
    }

    private void clearMoshafType() {
        this.moshafType_ = 0;
    }

    private void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    private void clearServer() {
        this.server_ = getDefaultInstance().getServer();
    }

    private void clearSurahNumber() {
        this.surahNumber_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureSurahNumberIsMutable() {
        Internal.ProtobufList<SurahLocalModel> protobufList = this.surahNumber_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.surahNumber_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static MoshafLocalModel getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static x newBuilder() {
        return (x) DEFAULT_INSTANCE.createBuilder();
    }

    public static x newBuilder(MoshafLocalModel moshafLocalModel) {
        return (x) DEFAULT_INSTANCE.createBuilder(moshafLocalModel);
    }

    public static MoshafLocalModel parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MoshafLocalModel) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MoshafLocalModel parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MoshafLocalModel) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MoshafLocalModel parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MoshafLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MoshafLocalModel parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MoshafLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static MoshafLocalModel parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MoshafLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static MoshafLocalModel parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MoshafLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static MoshafLocalModel parseFrom(InputStream inputStream) throws IOException {
        return (MoshafLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MoshafLocalModel parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MoshafLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MoshafLocalModel parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MoshafLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static MoshafLocalModel parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MoshafLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static MoshafLocalModel parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MoshafLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MoshafLocalModel parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MoshafLocalModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Parser<MoshafLocalModel> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeSurahNumber(int i) {
        ensureSurahNumberIsMutable();
        this.surahNumber_.remove(i);
    }

    public void setId(int i) {
        this.id_ = i;
    }

    public void setMoshafType(int i) {
        this.moshafType_ = i;
    }

    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    private void setNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.name_ = byteString.toStringUtf8();
    }

    public void setServer(String str) {
        str.getClass();
        this.server_ = str;
    }

    private void setServerBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.server_ = byteString.toStringUtf8();
    }

    private void setSurahNumber(int i, SurahLocalModel surahLocalModel) {
        surahLocalModel.getClass();
        ensureSurahNumberIsMutable();
        this.surahNumber_.set(i, surahLocalModel);
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser;
        switch (w.a[methodToInvoke.ordinal()]) {
            case 1:
                return new MoshafLocalModel();
            case 2:
                return new x(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0006\u0005\u0000\u0001\u0000\u0001\u0004\u0002Ȉ\u0003Ȉ\u0004\u0004\u0006\u001b", new Object[]{"id_", "name_", "server_", "moshafType_", "surahNumber_", SurahLocalModel.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<MoshafLocalModel> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (MoshafLocalModel.class) {
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

    public int getMoshafType() {
        return this.moshafType_;
    }

    public String getName() {
        return this.name_;
    }

    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    public String getServer() {
        return this.server_;
    }

    public ByteString getServerBytes() {
        return ByteString.copyFromUtf8(this.server_);
    }

    public SurahLocalModel getSurahNumber(int i) {
        return (SurahLocalModel) this.surahNumber_.get(i);
    }

    public int getSurahNumberCount() {
        return this.surahNumber_.size();
    }

    public List<SurahLocalModel> getSurahNumberList() {
        return this.surahNumber_;
    }

    public w0 getSurahNumberOrBuilder(int i) {
        return (w0) this.surahNumber_.get(i);
    }

    public List<? extends w0> getSurahNumberOrBuilderList() {
        return this.surahNumber_;
    }
}
