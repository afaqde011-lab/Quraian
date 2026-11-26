package com.revenuecat.purchases.utils;

import com.revenuecat.purchases.DebugEvent;
import com.revenuecat.purchases.DebugEventName;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.FileHelper;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.utils.Event;
import g00.b0;
import h00.y;
import i00.f;
import kotlin.Metadata;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import org.json.JSONObject;
import q30.d;
import q30.j;
import q30.l;
import u00.k;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u0000 +*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001+BG\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u0004\u0018\u00018\u00002\u0006\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00028\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u0019\u001a\u00020\u00112\u001a\u0010\u0018\u001a\u0016\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0017\u0012\u0004\u0012\u00020\u00110\b¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001c\u001a\u00020\u00112\u0018\u0010\u0018\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u0017\u0012\u0004\u0012\u00020\u00110\b¢\u0006\u0004\b\u001c\u0010\u001aJ\u0015\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u0011¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010$R\"\u0010\t\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010%R\"\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010%R0\u0010'\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u0011\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010%\u001a\u0004\b(\u0010)\"\u0004\b*\u0010\u001a¨\u0006,"}, d2 = {"Lcom/revenuecat/purchases/utils/EventsFileHelper;", "Lcom/revenuecat/purchases/utils/Event;", "T", "", "Lcom/revenuecat/purchases/common/FileHelper;", "fileHelper", "", "filePath", "Lkotlin/Function1;", "eventSerializer", "eventDeserializer", "<init>", "(Lcom/revenuecat/purchases/common/FileHelper;Ljava/lang/String;Lu00/k;Lu00/k;)V", "string", "mapToEvent", "(Ljava/lang/String;)Lcom/revenuecat/purchases/utils/Event;", "event", "Lg00/b0;", "appendEvent", "(Lcom/revenuecat/purchases/utils/Event;)V", "", "fileSizeInKB", "()D", "Lq30/j;", "block", "readFile", "(Lu00/k;)V", "Lorg/json/JSONObject;", "readFileAsJson", "", "eventsToDeleteCount", "clear", "(I)V", "deleteFile", "()V", "Lcom/revenuecat/purchases/common/FileHelper;", "Ljava/lang/String;", "Lu00/k;", "Lcom/revenuecat/purchases/DebugEvent;", "debugEventCallback", "getDebugEventCallback", "()Lu00/k;", "setDebugEventCallback", "Companion", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class EventsFileHelper<T extends Event> {
    public static final int MAX_EVENT_PROPERTY_SIZE = 80;
    private k debugEventCallback;
    private final k eventDeserializer;
    private final k eventSerializer;
    private final FileHelper fileHelper;
    private final String filePath;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/revenuecat/purchases/utils/Event;", "T", "", "e", "Lg00/b0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass1 extends n implements k {
        final EventsFileHelper<T> this$0;

        public AnonymousClass1(EventsFileHelper<T> eventsFileHelper) {
            super(1);
            this.this$0 = eventsFileHelper;
        }

        @Override
        public Object invoke(Object obj) {
            invoke((Throwable) obj);
            return b0.a;
        }

        public final void invoke(Throwable e) {
            m.e(e, "e");
            k debugEventCallback = this.this$0.getDebugEventCallback();
            if (debugEventCallback != null) {
                DebugEventName debugEventName = DebugEventName.REMOVE_LINES_EXCEPTION;
                f fVar = new f();
                String strN = a0.a.b(e.getClass()).n();
                if (strN == null) {
                    strN = "Unknown";
                }
                fVar.put("exceptionType", strN);
                String message = e.getMessage();
                if (message != null) {
                    fVar.put("message", r30.k.h1(80, message));
                }
                debugEventCallback.invoke(new DebugEvent(debugEventName, fVar.c()));
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/revenuecat/purchases/utils/Event;", "T", "Lq30/j;", "", "sequence", "Lg00/b0;", "invoke", "(Lq30/j;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C01271 extends n implements k {
        final k $block;
        final EventsFileHelper<T> this$0;

        @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "T", "Lcom/revenuecat/purchases/utils/Event;", "line", "", "invoke", "(Ljava/lang/String;)Lcom/revenuecat/purchases/utils/Event;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class C00201 extends n implements k {
            final EventsFileHelper<T> this$0;

            public C00201(EventsFileHelper<T> eventsFileHelper) {
                super(1);
                this.this$0 = eventsFileHelper;
            }

            @Override
            public final T invoke(String line) {
                m.e(line, "line");
                return (T) this.this$0.mapToEvent(line);
            }
        }

        public C01271(k kVar, EventsFileHelper<T> eventsFileHelper) {
            super(1);
            this.$block = kVar;
            this.this$0 = eventsFileHelper;
        }

        @Override
        public Object invoke(Object obj) {
            invoke((j) obj);
            return b0.a;
        }

        public final void invoke(j sequence) {
            m.e(sequence, "sequence");
            this.$block.invoke(l.r0(sequence, new C00201(this.this$0)));
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/revenuecat/purchases/utils/Event;", "T", "Lq30/j;", "", "sequence", "Lg00/b0;", "invoke", "(Lq30/j;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C01281 extends n implements k {
        final k $block;

        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lorg/json/JSONObject;", "T", "Lcom/revenuecat/purchases/utils/Event;", "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class C00211 extends n implements k {
            public static final C00211 INSTANCE = new C00211();

            public C00211() {
                super(1);
            }

            @Override
            public final JSONObject invoke(String it) {
                m.e(it, "it");
                return new JSONObject(it);
            }
        }

        public C01281(k kVar) {
            super(1);
            this.$block = kVar;
        }

        @Override
        public Object invoke(Object obj) {
            invoke((j) obj);
            return b0.a;
        }

        public final void invoke(j sequence) {
            m.e(sequence, "sequence");
            this.$block.invoke(l.r0(sequence, C00211.INSTANCE));
        }
    }

    public EventsFileHelper(FileHelper fileHelper, String filePath, k kVar, k kVar2) {
        m.e(fileHelper, "fileHelper");
        m.e(filePath, "filePath");
        this.fileHelper = fileHelper;
        this.filePath = filePath;
        this.eventSerializer = kVar;
        this.eventDeserializer = kVar2;
    }

    public EventsFileHelper(FileHelper fileHelper, String str, k kVar, k kVar2, int i, kotlin.jvm.internal.f fVar) {
        this(fileHelper, str, (i & 4) != 0 ? null : kVar, (i & 8) != 0 ? null : kVar2);
    }

    public final T mapToEvent(String string) {
        k kVar = this.eventDeserializer;
        if (kVar == null) {
            k kVar2 = this.debugEventCallback;
            if (kVar2 != null) {
                kVar2.invoke(new DebugEvent(DebugEventName.DESERIALIZATION_ERROR, y.A));
                return null;
            }
        } else {
            try {
                return (T) kVar.invoke(string);
            } catch (SerializationException e) {
                k kVar3 = this.debugEventCallback;
                if (kVar3 != null) {
                    DebugEventName debugEventName = DebugEventName.DESERIALIZATION_ERROR;
                    f fVar = new f();
                    fVar.put("exceptionType", "SerializationException");
                    String message = e.getMessage();
                    if (message != null) {
                        fVar.put("message", r30.k.h1(80, message));
                    }
                    kVar3.invoke(new DebugEvent(debugEventName, fVar.c()));
                }
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Error parsing event from file: " + string, e);
            } catch (IllegalArgumentException e2) {
                k kVar4 = this.debugEventCallback;
                if (kVar4 != null) {
                    DebugEventName debugEventName2 = DebugEventName.DESERIALIZATION_ERROR;
                    f fVar2 = new f();
                    fVar2.put("exceptionType", "IllegalArgumentException");
                    String message2 = e2.getMessage();
                    if (message2 != null) {
                        fVar2.put("message", r30.k.h1(80, message2));
                    }
                    kVar4.invoke(new DebugEvent(debugEventName2, fVar2.c()));
                }
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Error parsing event from file: " + string, e2);
            }
        }
        return null;
    }

    public final synchronized void appendEvent(T event) {
        String string;
        try {
            m.e(event, "event");
            try {
                FileHelper fileHelper = this.fileHelper;
                String str = this.filePath;
                StringBuilder sb = new StringBuilder();
                k kVar = this.eventSerializer;
                if (kVar == null || (string = (String) kVar.invoke(event)) == null) {
                    string = event.toString();
                }
                sb.append(string);
                sb.append('\n');
                fileHelper.appendToFile(str, sb.toString());
            } catch (Exception e) {
                k kVar2 = this.debugEventCallback;
                if (kVar2 != null) {
                    DebugEventName debugEventName = DebugEventName.APPEND_EVENT_EXCEPTION;
                    f fVar = new f();
                    String strN = a0.a.b(e.getClass()).n();
                    if (strN == null) {
                        strN = "Unknown";
                    }
                    fVar.put("exceptionType", strN);
                    String message = e.getMessage();
                    if (message != null) {
                        fVar.put("message", r30.k.h1(80, message));
                    }
                    kVar2.invoke(new DebugEvent(debugEventName, fVar.c()));
                }
                throw e;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void clear(int eventsToDeleteCount) {
        this.fileHelper.removeFirstLinesFromFile(this.filePath, eventsToDeleteCount, new AnonymousClass1(this));
    }

    public final synchronized void deleteFile() {
        if (!this.fileHelper.deleteFile(this.filePath)) {
            LogLevel logLevel = LogLevel.VERBOSE;
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler.v("[Purchases] - " + logLevel.name(), "Failed to delete events file in " + this.filePath + '.');
            }
        }
    }

    public final synchronized double fileSizeInKB() {
        return this.fileHelper.fileSizeInKB(this.filePath);
    }

    public final k getDebugEventCallback() {
        return this.debugEventCallback;
    }

    public final synchronized void readFile(k block) {
        try {
            m.e(block, "block");
            if (this.eventDeserializer == null || this.fileHelper.fileIsEmpty(this.filePath)) {
                block.invoke(d.a);
            } else {
                this.fileHelper.readFilePerLines(this.filePath, new C01271(block, this));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void readFileAsJson(k block) {
        try {
            m.e(block, "block");
            if (this.fileHelper.fileIsEmpty(this.filePath)) {
                block.invoke(d.a);
            } else {
                this.fileHelper.readFilePerLines(this.filePath, new C01281(block));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void setDebugEventCallback(k kVar) {
        this.debugEventCallback = kVar;
    }
}
