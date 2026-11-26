package com.revenuecat.purchases.common.diagnostics;

import com.google.android.gms.internal.measurement.x5;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.LogWrapperKt;
import g00.b0;
import h00.x;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.z;
import org.json.JSONObject;
import q30.j;
import q30.l;
import u00.a;
import u00.k;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 $2\u00020\u0001:\u0001$B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0017\u001a\u00020\u000e2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u000e¢\u0006\u0004\b\u0019\u0010\u0010J\u000f\u0010\u001a\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001a\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001eR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001fR\u0017\u0010!\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#¨\u0006%"}, d2 = {"Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsSynchronizer;", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsEventTrackerListener;", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsHelper;", "diagnosticsHelper", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsFileHelper;", "diagnosticsFileHelper", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "diagnosticsTracker", "Lcom/revenuecat/purchases/common/Backend;", "backend", "Lcom/revenuecat/purchases/common/Dispatcher;", "diagnosticsDispatcher", "<init>", "(Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsHelper;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsFileHelper;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;Lcom/revenuecat/purchases/common/Backend;Lcom/revenuecat/purchases/common/Dispatcher;)V", "Lg00/b0;", "syncDiagnosticsFileIfBigEnough", "()V", "", "Lorg/json/JSONObject;", "getEventsToSync", "()Ljava/util/List;", "Lkotlin/Function0;", "command", "enqueue", "(Lu00/a;)V", "syncDiagnosticsFileIfNeeded", "onEventTracked", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsHelper;", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsFileHelper;", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "Lcom/revenuecat/purchases/common/Backend;", "Lcom/revenuecat/purchases/common/Dispatcher;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isSyncing", "Ljava/util/concurrent/atomic/AtomicBoolean;", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "Companion", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DiagnosticsSynchronizer implements DiagnosticsEventTrackerListener {

    public static final Companion INSTANCE = new Companion(null);
    public static final int MAX_EVENTS_TO_SYNC_PER_REQUEST = 200;
    public static final int MAX_NUMBER_POST_RETRIES = 3;
    private final Backend backend;
    private final Dispatcher diagnosticsDispatcher;
    private final DiagnosticsFileHelper diagnosticsFileHelper;
    private final DiagnosticsHelper diagnosticsHelper;
    private final DiagnosticsTracker diagnosticsTracker;
    private final AtomicBoolean isSyncing;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\u0002¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsSynchronizer$Companion;", "", "()V", "MAX_EVENTS_TO_SYNC_PER_REQUEST", "", "getMAX_EVENTS_TO_SYNC_PER_REQUEST$annotations", "MAX_NUMBER_POST_RETRIES", "getMAX_NUMBER_POST_RETRIES$annotations", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(f fVar) {
            this();
        }

        public static void getMAX_EVENTS_TO_SYNC_PER_REQUEST$annotations() {
        }

        public static void getMAX_NUMBER_POST_RETRIES$annotations() {
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lq30/j;", "Lorg/json/JSONObject;", "sequence", "Lg00/b0;", "invoke", "(Lq30/j;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass1 extends n implements k {
        final z $eventsToSync;

        public AnonymousClass1(z zVar) {
            super(1);
            this.$eventsToSync = zVar;
        }

        @Override
        public Object invoke(Object obj) {
            invoke((j) obj);
            return b0.a;
        }

        public final void invoke(j sequence) {
            m.e(sequence, "sequence");
            this.$eventsToSync.A = l.u0(l.t0(sequence, 200));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lg00/b0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C00891 extends n implements a {
        public C00891() {
            super(0);
        }

        @Override
        public Object invoke() {
            m116invoke();
            return b0.a;
        }

        public final void m116invoke() {
            if (DiagnosticsSynchronizer.this.diagnosticsFileHelper.isDiagnosticsFileBigEnoughToSync()) {
                LogLevel logLevel = LogLevel.VERBOSE;
                LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    currentLogHandler.v("[Purchases] - " + logLevel.name(), "Diagnostics file is big enough to sync. Syncing it.");
                }
                DiagnosticsSynchronizer.this.syncDiagnosticsFileIfNeeded();
            }
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lg00/b0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C00901 extends n implements a {

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lorg/json/JSONObject;", "it", "Lg00/b0;", "invoke", "(Lorg/json/JSONObject;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class AnonymousClass3 extends n implements k {
            final int $diagnosticsCount;
            final DiagnosticsSynchronizer this$0;

            public AnonymousClass3(DiagnosticsSynchronizer diagnosticsSynchronizer, int i) {
                super(1);
                this.this$0 = diagnosticsSynchronizer;
                this.$diagnosticsCount = i;
            }

            @Override
            public Object invoke(Object obj) {
                invoke((JSONObject) obj);
                return b0.a;
            }

            public final void invoke(JSONObject it) {
                m.e(it, "it");
                LogLevel logLevel = LogLevel.VERBOSE;
                LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    currentLogHandler.v("[Purchases] - " + logLevel.name(), "Synced diagnostics file successfully.");
                }
                this.this$0.diagnosticsHelper.clearConsecutiveNumberOfErrors();
                this.this$0.diagnosticsFileHelper.clear(this.$diagnosticsCount);
                this.this$0.getIsSyncing().set(false);
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "", "shouldRetry", "Lg00/b0;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;Z)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class AnonymousClass4 extends n implements u00.n {
            final DiagnosticsSynchronizer this$0;

            public AnonymousClass4(DiagnosticsSynchronizer diagnosticsSynchronizer) {
                super(2);
                this.this$0 = diagnosticsSynchronizer;
            }

            @Override
            public Object invoke(Object obj, Object obj2) {
                invoke((PurchasesError) obj, ((Boolean) obj2).booleanValue());
                return b0.a;
            }

            public final void invoke(PurchasesError error, boolean z) {
                m.e(error, "error");
                if (z) {
                    LogLevel logLevel = LogLevel.VERBOSE;
                    LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    Config config = Config.INSTANCE;
                    if (config.getLogLevel().compareTo(logLevel) <= 0) {
                        currentLogHandler.v(x5.k(logLevel, new StringBuilder("[Purchases] - ")), "Error syncing diagnostics file: " + error + ". Will retry the next time the SDK is initialized");
                    }
                    if (this.this$0.diagnosticsHelper.increaseConsecutiveNumberOfErrors() >= 3) {
                        LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                        if (config.getLogLevel().compareTo(logLevel) <= 0) {
                            currentLogHandler2.v(x5.k(logLevel, new StringBuilder("[Purchases] - ")), "Error syncing diagnostics file: " + error + ". This was the final attempt (3). Deleting diagnostics file without posting.");
                        }
                        this.this$0.diagnosticsHelper.resetDiagnosticsStatus();
                        this.this$0.diagnosticsTracker.trackMaxDiagnosticsSyncRetriesReached();
                    }
                } else {
                    LogLevel logLevel2 = LogLevel.VERBOSE;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler3.v(x5.k(logLevel2, new StringBuilder("[Purchases] - ")), "Error syncing diagnostics file: " + error + ". Deleting diagnostics file without retrying.");
                    }
                    this.this$0.diagnosticsHelper.resetDiagnosticsStatus();
                    this.this$0.diagnosticsTracker.trackClearingDiagnosticsAfterFailedSync();
                }
                this.this$0.getIsSyncing().set(false);
            }
        }

        public C00901() {
            super(0);
        }

        @Override
        public Object invoke() throws Throwable {
            m117invoke();
            return b0.a;
        }

        public final void m117invoke() throws Throwable {
            try {
                if (DiagnosticsSynchronizer.this.getIsSyncing().getAndSet(true)) {
                    LogLevel logLevel = LogLevel.VERBOSE;
                    LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        currentLogHandler.v("[Purchases] - " + logLevel.name(), "Already syncing diagnostics file.");
                        return;
                    }
                    return;
                }
                List<? extends JSONObject> eventsToSync = DiagnosticsSynchronizer.this.getEventsToSync();
                int size = eventsToSync.size();
                if (size != 0) {
                    DiagnosticsSynchronizer.this.backend.postDiagnostics(eventsToSync, new AnonymousClass3(DiagnosticsSynchronizer.this, size), new AnonymousClass4(DiagnosticsSynchronizer.this));
                    return;
                }
                LogLevel logLevel2 = LogLevel.VERBOSE;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.v("[Purchases] - " + logLevel2.name(), "No diagnostics to sync.");
                }
                DiagnosticsSynchronizer.this.getIsSyncing().set(false);
            } catch (Exception e) {
                LogLevel logLevel3 = LogLevel.VERBOSE;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.v(x5.k(logLevel3, new StringBuilder("[Purchases] - ")), "Error syncing diagnostics file: " + e);
                }
                try {
                    DiagnosticsSynchronizer.this.diagnosticsHelper.resetDiagnosticsStatus();
                } catch (IOException e2) {
                    LogLevel logLevel4 = LogLevel.VERBOSE;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        currentLogHandler4.v(x5.k(logLevel4, new StringBuilder("[Purchases] - ")), "Error deleting diagnostics file: " + e2);
                    }
                }
                DiagnosticsSynchronizer.this.getIsSyncing().set(false);
            }
        }
    }

    public DiagnosticsSynchronizer(DiagnosticsHelper diagnosticsHelper, DiagnosticsFileHelper diagnosticsFileHelper, DiagnosticsTracker diagnosticsTracker, Backend backend, Dispatcher diagnosticsDispatcher) {
        m.e(diagnosticsHelper, "diagnosticsHelper");
        m.e(diagnosticsFileHelper, "diagnosticsFileHelper");
        m.e(diagnosticsTracker, "diagnosticsTracker");
        m.e(backend, "backend");
        m.e(diagnosticsDispatcher, "diagnosticsDispatcher");
        this.diagnosticsHelper = diagnosticsHelper;
        this.diagnosticsFileHelper = diagnosticsFileHelper;
        this.diagnosticsTracker = diagnosticsTracker;
        this.backend = backend;
        this.diagnosticsDispatcher = diagnosticsDispatcher;
        this.isSyncing = new AtomicBoolean(false);
    }

    private final void enqueue(a command) {
        Dispatcher.enqueue$default(this.diagnosticsDispatcher, new b4.a(5, command), null, 2, null);
    }

    public final List<JSONObject> getEventsToSync() {
        z zVar = new z();
        zVar.A = x.A;
        this.diagnosticsFileHelper.readFileAsJson(new AnonymousClass1(zVar));
        return (List) zVar.A;
    }

    private final void syncDiagnosticsFileIfBigEnough() {
        enqueue(new C00891());
    }

    public final AtomicBoolean getIsSyncing() {
        return this.isSyncing;
    }

    @Override
    public void onEventTracked() {
        syncDiagnosticsFileIfBigEnough();
    }

    public final void syncDiagnosticsFileIfNeeded() {
        enqueue(new C00901());
    }
}
