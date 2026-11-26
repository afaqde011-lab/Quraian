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
import ym.u;
import ym.v;

public final class ListeningTimerModel extends GeneratedMessageLite<ListeningTimerModel, v> implements MessageLiteOrBuilder {
    private static final ListeningTimerModel DEFAULT_INSTANCE;
    public static final int OVERALL_PASSED_MS_FIELD_NUMBER = 3;
    public static final int OVERALL_PASSED_SECONDS_FIELD_NUMBER = 2;
    private static volatile Parser<ListeningTimerModel> PARSER = null;
    public static final int TODAYS_DATE_FIELD_NUMBER = 1;
    private long overallPassedMs_;
    private long overallPassedSeconds_;
    private String todaysDate_ = "";

    static {
        ListeningTimerModel listeningTimerModel = new ListeningTimerModel();
        DEFAULT_INSTANCE = listeningTimerModel;
        GeneratedMessageLite.registerDefaultInstance(ListeningTimerModel.class, listeningTimerModel);
    }

    private ListeningTimerModel() {
    }

    private void clearOverallPassedMs() {
        this.overallPassedMs_ = 0L;
    }

    private void clearOverallPassedSeconds() {
        this.overallPassedSeconds_ = 0L;
    }

    private void clearTodaysDate() {
        this.todaysDate_ = getDefaultInstance().getTodaysDate();
    }

    public static ListeningTimerModel getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static v newBuilder() {
        return (v) DEFAULT_INSTANCE.createBuilder();
    }

    public static v newBuilder(ListeningTimerModel listeningTimerModel) {
        return (v) DEFAULT_INSTANCE.createBuilder(listeningTimerModel);
    }

    public static ListeningTimerModel parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ListeningTimerModel) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ListeningTimerModel parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ListeningTimerModel) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ListeningTimerModel parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ListeningTimerModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ListeningTimerModel parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ListeningTimerModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ListeningTimerModel parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ListeningTimerModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ListeningTimerModel parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ListeningTimerModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static ListeningTimerModel parseFrom(InputStream inputStream) throws IOException {
        return (ListeningTimerModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ListeningTimerModel parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ListeningTimerModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ListeningTimerModel parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ListeningTimerModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ListeningTimerModel parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ListeningTimerModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ListeningTimerModel parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ListeningTimerModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ListeningTimerModel parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ListeningTimerModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Parser<ListeningTimerModel> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setOverallPassedMs(long j) {
        this.overallPassedMs_ = j;
    }

    public void setOverallPassedSeconds(long j) {
        this.overallPassedSeconds_ = j;
    }

    public void setTodaysDate(String str) {
        str.getClass();
        this.todaysDate_ = str;
    }

    private void setTodaysDateBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.todaysDate_ = byteString.toStringUtf8();
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser;
        switch (u.a[methodToInvoke.ordinal()]) {
            case 1:
                return new ListeningTimerModel();
            case 2:
                return new v(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\u0002", new Object[]{"todaysDate_", "overallPassedSeconds_", "overallPassedMs_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ListeningTimerModel> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (ListeningTimerModel.class) {
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

    public long getOverallPassedMs() {
        return this.overallPassedMs_;
    }

    public long getOverallPassedSeconds() {
        return this.overallPassedSeconds_;
    }

    public String getTodaysDate() {
        return this.todaysDate_;
    }

    public ByteString getTodaysDateBytes() {
        return ByteString.copyFromUtf8(this.todaysDate_);
    }
}
