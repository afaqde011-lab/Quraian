package com.revenuecat.purchases.common.events;

import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.internal.measurement.x5;
import com.revenuecat.purchases.DebugEvent;
import com.revenuecat.purchases.DebugEventListener;
import com.revenuecat.purchases.DebugEventName;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.ads.events.AdEvent;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.Delay;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.FileHelper;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.customercenter.events.CustomerCenterImpressionEvent;
import com.revenuecat.purchases.customercenter.events.CustomerCenterSurveyOptionChosenEvent;
import com.revenuecat.purchases.identity.IdentityManager;
import com.revenuecat.purchases.paywalls.events.CustomPaywallEvent;
import com.revenuecat.purchases.paywalls.events.PaywallEvent;
import com.revenuecat.purchases.paywalls.events.PaywallStoredEvent;
import com.revenuecat.purchases.utils.EventsFileHelper;
import com.revenuecat.purchases.utils.RateLimiter;
import g00.b0;
import g00.k;
import h00.d0;
import h00.q;
import h00.r;
import h00.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.z;
import q30.j;
import q30.l;
import q40.c;
import s30.b;
import u00.a;
import u00.p;
import ze.d;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 H2\u00020\u0001:\u0001HB\u0087\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012<\u0010\u0015\u001a8\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0012\u0012\u0004\u0012\u00020\u00110\r\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00112\b\b\u0002\u0010\u001e\u001a\u00020\u000f¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0011H\u0002¢\u0006\u0004\b!\u0010\"J\u001f\u0010%\u001a\u00020\u00112\u0006\u0010$\u001a\u00020#2\u0006\u0010\u001e\u001a\u00020\u000fH\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0011H\u0002¢\u0006\u0004\b'\u0010\"J\u000f\u0010(\u001a\u00020\u0011H\u0002¢\u0006\u0004\b(\u0010\"J\u000f\u0010)\u001a\u00020\u0011H\u0002¢\u0006\u0004\b)\u0010\"J\u000f\u0010*\u001a\u00020\u0011H\u0002¢\u0006\u0004\b*\u0010\"J\u0017\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070+H\u0002¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050+H\u0002¢\u0006\u0004\b.\u0010-J'\u00100\u001a\u00020\u00112\b\b\u0002\u0010\u001e\u001a\u00020\u000f2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b0\u00101R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00104R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00104R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00105R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00106RJ\u0010\u0015\u001a8\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0012\u0012\u0004\u0012\u00020\u00110\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u00107R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u00108R.\u0010;\u001a\u0004\u0018\u0001092\b\u0010:\u001a\u0004\u0018\u0001098F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u0016\u0010B\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u001e\u0010E\u001a\u00020\u00142\u0006\u0010D\u001a\u00020\u00148B@BX\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u001e\u0010G\u001a\u00020\u00142\u0006\u0010D\u001a\u00020\u00148B@BX\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010F¨\u0006I"}, d2 = {"Lcom/revenuecat/purchases/common/events/EventsManager;", "", "Ljava/util/UUID;", "appSessionID", "Lcom/revenuecat/purchases/utils/EventsFileHelper;", "Lcom/revenuecat/purchases/paywalls/events/PaywallStoredEvent;", "legacyEventsFileHelper", "Lcom/revenuecat/purchases/common/events/BackendStoredEvent;", "fileHelper", "Lcom/revenuecat/purchases/identity/IdentityManager;", "identityManager", "Lcom/revenuecat/purchases/common/Dispatcher;", "eventsDispatcher", "Lkotlin/Function4;", "Lcom/revenuecat/purchases/common/events/EventsRequest;", "Lcom/revenuecat/purchases/common/Delay;", "Lkotlin/Function0;", "Lg00/b0;", "Lkotlin/Function2;", "Lcom/revenuecat/purchases/PurchasesError;", "", "postEvents", "Lcom/revenuecat/purchases/utils/RateLimiter;", "priorityFlushRateLimiter", "<init>", "(Ljava/util/UUID;Lcom/revenuecat/purchases/utils/EventsFileHelper;Lcom/revenuecat/purchases/utils/EventsFileHelper;Lcom/revenuecat/purchases/identity/IdentityManager;Lcom/revenuecat/purchases/common/Dispatcher;Lu00/p;Lcom/revenuecat/purchases/utils/RateLimiter;)V", "Lcom/revenuecat/purchases/common/events/FeatureEvent;", "event", "track", "(Lcom/revenuecat/purchases/common/events/FeatureEvent;)V", "delay", "flushEvents", "(Lcom/revenuecat/purchases/common/Delay;)V", "checkFileSizeAndClearIfNeeded", "()V", "", "batchNumber", "flushNextBatch", "(ILcom/revenuecat/purchases/common/Delay;)V", "performPriorityFlush", "onFlushComplete", "startPendingPriorityFlushIfNeeded", "flushLegacyEvents", "", "getStoredEvents", "()Ljava/util/List;", "getLegacyPaywallsStoredEvents", "command", "enqueue", "(Lcom/revenuecat/purchases/common/Delay;Lu00/a;)V", "appSessionID$1", "Ljava/util/UUID;", "Lcom/revenuecat/purchases/utils/EventsFileHelper;", "Lcom/revenuecat/purchases/identity/IdentityManager;", "Lcom/revenuecat/purchases/common/Dispatcher;", "Lu00/p;", "Lcom/revenuecat/purchases/utils/RateLimiter;", "Lcom/revenuecat/purchases/DebugEventListener;", "value", "debugEventListener", "Lcom/revenuecat/purchases/DebugEventListener;", "getDebugEventListener", "()Lcom/revenuecat/purchases/DebugEventListener;", "setDebugEventListener", "(Lcom/revenuecat/purchases/DebugEventListener;)V", "Ljava/util/concurrent/atomic/AtomicBoolean;", "flushInProgress", "Ljava/util/concurrent/atomic/AtomicBoolean;", "<set-?>", "pendingPriorityFlush", "Z", "legacyFlushTriggered", "Companion", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class EventsManager {
    public static final String AD_EVENTS_FILE_PATH = "RevenueCat/event_store/ad_event_store.jsonl";

    public static final Companion INSTANCE = new Companion(null);
    public static final String EVENTS_FILE_PATH_NEW = "RevenueCat/event_store/event_store.jsonl";
    public static final int EVENTS_TO_CLEAR_ON_LIMIT = 50;
    public static final double FILE_SIZE_LIMIT_KB = 2048.0d;
    private static final int FLUSH_COUNT = 50;
    private static final int MAX_FLUSH_BATCHES = 10;
    private static final String PAYWALL_EVENTS_FILE_PATH = "RevenueCat/paywall_event_store/paywall_event_store.jsonl";
    private static final UUID appSessionID;
    private static final c json;

    private final UUID appSessionID;
    private DebugEventListener debugEventListener;
    private final Dispatcher eventsDispatcher;
    private final EventsFileHelper<BackendStoredEvent> fileHelper;
    private AtomicBoolean flushInProgress;
    private final IdentityManager identityManager;
    private final EventsFileHelper<PaywallStoredEvent> legacyEventsFileHelper;
    private boolean legacyFlushTriggered;
    private boolean pendingPriorityFlush;
    private final p postEvents;
    private final RateLimiter priorityFlushRateLimiter;

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\tJ\u001b\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\tR\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087T¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u0012\u0004\b\u0010\u0010\u0003R\u001a\u0010\u0012\u001a\u00020\u00118\u0006X\u0087T¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u0012\u0004\b\u0014\u0010\u0003R\u001a\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u0018\u0010\u0003R\u001a\u0010\u001a\u001a\u00020\u00198\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u001e8\u0000X\u0080T¢\u0006\u0006\n\u0004\b!\u0010 R\u0014\u0010\"\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\u0013R\u0014\u0010#\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\u0013R\u0014\u0010$\u001a\u00020\u001e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010 ¨\u0006%"}, d2 = {"Lcom/revenuecat/purchases/common/events/EventsManager$Companion;", "", "<init>", "()V", "Lcom/revenuecat/purchases/common/FileHelper;", "fileHelper", "Lcom/revenuecat/purchases/utils/EventsFileHelper;", "Lcom/revenuecat/purchases/common/events/BackendStoredEvent;", "backendEvents", "(Lcom/revenuecat/purchases/common/FileHelper;)Lcom/revenuecat/purchases/utils/EventsFileHelper;", "adEvents", "Lcom/revenuecat/purchases/paywalls/events/PaywallStoredEvent;", "paywalls", "", "FILE_SIZE_LIMIT_KB", "D", "getFILE_SIZE_LIMIT_KB$annotations", "", "EVENTS_TO_CLEAR_ON_LIMIT", "I", "getEVENTS_TO_CLEAR_ON_LIMIT$annotations", "Lq40/c;", "json", "Lq40/c;", "getJson$annotations", "Ljava/util/UUID;", "appSessionID", "Ljava/util/UUID;", "getAppSessionID$purchases_defaultsBc8Release", "()Ljava/util/UUID;", "", "AD_EVENTS_FILE_PATH", "Ljava/lang/String;", "EVENTS_FILE_PATH_NEW", "FLUSH_COUNT", "MAX_FLUSH_BATCHES", "PAYWALL_EVENTS_FILE_PATH", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(f fVar) {
            this();
        }

        public static void getEVENTS_TO_CLEAR_ON_LIMIT$annotations() {
        }

        public static void getFILE_SIZE_LIMIT_KB$annotations() {
        }

        private static void getJson$annotations() {
        }

        public final EventsFileHelper<BackendStoredEvent> adEvents(FileHelper fileHelper) {
            m.e(fileHelper, "fileHelper");
            return new EventsFileHelper<>(fileHelper, EventsManager.AD_EVENTS_FILE_PATH, EventsManager$Companion$adEvents$1.INSTANCE, EventsManager$Companion$adEvents$2.INSTANCE);
        }

        public final EventsFileHelper<BackendStoredEvent> backendEvents(FileHelper fileHelper) {
            m.e(fileHelper, "fileHelper");
            return new EventsFileHelper<>(fileHelper, EventsManager.EVENTS_FILE_PATH_NEW, EventsManager$Companion$backendEvents$1.INSTANCE, EventsManager$Companion$backendEvents$2.INSTANCE);
        }

        public final UUID getAppSessionID$purchases_defaultsBc8Release() {
            return EventsManager.appSessionID;
        }

        public final EventsFileHelper<PaywallStoredEvent> paywalls(FileHelper fileHelper) {
            m.e(fileHelper, "fileHelper");
            return new EventsFileHelper<>(fileHelper, EventsManager.PAYWALL_EVENTS_FILE_PATH, EventsManager$Companion$paywalls$1.INSTANCE, new EventsManager$Companion$paywalls$2(PaywallStoredEvent.INSTANCE));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lg00/b0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass1 extends n implements a {
        final Delay $delay;

        public AnonymousClass1(Delay delay) {
            super(0);
            this.$delay = delay;
        }

        @Override
        public Object invoke() {
            m133invoke();
            return b0.a;
        }

        public final void m133invoke() {
            if (EventsManager.this.flushInProgress.getAndSet(true)) {
                LogLevel logLevel = LogLevel.DEBUG;
                LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    x5.w(logLevel, new StringBuilder("[Purchases] - "), currentLogHandler, "Flush already in progress.");
                    return;
                }
                return;
            }
            DebugEventListener debugEventListener = EventsManager.this.getDebugEventListener();
            if (debugEventListener != null) {
                debugEventListener.onDebugEventReceived(new DebugEvent(DebugEventName.FLUSH_STARTED, null, 2, null));
            }
            EventsManager.this.flushNextBatch(1, this.$delay);
            if (EventsManager.this.legacyFlushTriggered) {
                return;
            }
            EventsManager.this.legacyFlushTriggered = true;
            EventsManager.this.flushLegacyEvents();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lg00/b0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C00921 extends n implements a {
        final EventsFileHelper<PaywallStoredEvent> $legacyEventsFileHelper;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lg00/b0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class AnonymousClass4 extends n implements a {
            final EventsFileHelper<PaywallStoredEvent> $legacyEventsFileHelper;
            final List<PaywallStoredEvent> $storedLegacyEventsWithNullValues;
            final EventsManager this$0;

            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lg00/b0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            public static final class AnonymousClass2 extends n implements a {
                final EventsFileHelper<PaywallStoredEvent> $legacyEventsFileHelper;
                final List<PaywallStoredEvent> $storedLegacyEventsWithNullValues;

                public AnonymousClass2(EventsFileHelper<PaywallStoredEvent> eventsFileHelper, List<PaywallStoredEvent> list) {
                    super(0);
                    this.$legacyEventsFileHelper = eventsFileHelper;
                    this.$storedLegacyEventsWithNullValues = list;
                }

                @Override
                public Object invoke() {
                    m136invoke();
                    return b0.a;
                }

                public final void m136invoke() {
                    this.$legacyEventsFileHelper.clear(this.$storedLegacyEventsWithNullValues.size());
                }
            }

            public AnonymousClass4(EventsManager eventsManager, EventsFileHelper<PaywallStoredEvent> eventsFileHelper, List<PaywallStoredEvent> list) {
                super(0);
                this.this$0 = eventsManager;
                this.$legacyEventsFileHelper = eventsFileHelper;
                this.$storedLegacyEventsWithNullValues = list;
            }

            @Override
            public Object invoke() {
                m135invoke();
                return b0.a;
            }

            public final void m135invoke() {
                LogLevel logLevel = LogLevel.VERBOSE;
                LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    currentLogHandler.v("[Purchases] - " + logLevel.name(), "Legacy event flush: success.");
                }
                EventsManager.enqueue$default(this.this$0, null, new AnonymousClass2(this.$legacyEventsFileHelper, this.$storedLegacyEventsWithNullValues), 1, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "", "shouldMarkAsSynced", "Lg00/b0;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;Z)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class AnonymousClass5 extends n implements u00.n {
            final EventsFileHelper<PaywallStoredEvent> $legacyEventsFileHelper;
            final List<PaywallStoredEvent> $storedLegacyEventsWithNullValues;
            final EventsManager this$0;

            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lg00/b0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            public static final class AnonymousClass2 extends n implements a {
                final EventsFileHelper<PaywallStoredEvent> $legacyEventsFileHelper;
                final boolean $shouldMarkAsSynced;
                final List<PaywallStoredEvent> $storedLegacyEventsWithNullValues;

                public AnonymousClass2(boolean z, EventsFileHelper<PaywallStoredEvent> eventsFileHelper, List<PaywallStoredEvent> list) {
                    super(0);
                    this.$shouldMarkAsSynced = z;
                    this.$legacyEventsFileHelper = eventsFileHelper;
                    this.$storedLegacyEventsWithNullValues = list;
                }

                @Override
                public Object invoke() {
                    m137invoke();
                    return b0.a;
                }

                public final void m137invoke() {
                    if (this.$shouldMarkAsSynced) {
                        this.$legacyEventsFileHelper.clear(this.$storedLegacyEventsWithNullValues.size());
                    }
                }
            }

            public AnonymousClass5(EventsManager eventsManager, EventsFileHelper<PaywallStoredEvent> eventsFileHelper, List<PaywallStoredEvent> list) {
                super(2);
                this.this$0 = eventsManager;
                this.$legacyEventsFileHelper = eventsFileHelper;
                this.$storedLegacyEventsWithNullValues = list;
            }

            @Override
            public Object invoke(Object obj, Object obj2) {
                invoke((PurchasesError) obj, ((Boolean) obj2).booleanValue());
                return b0.a;
            }

            public final void invoke(PurchasesError error, boolean z) {
                m.e(error, "error");
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Legacy event flush error: " + error + '.', null);
                EventsManager.enqueue$default(this.this$0, null, new AnonymousClass2(z, this.$legacyEventsFileHelper, this.$storedLegacyEventsWithNullValues), 1, null);
            }
        }

        public C00921(EventsFileHelper<PaywallStoredEvent> eventsFileHelper) {
            super(0);
            this.$legacyEventsFileHelper = eventsFileHelper;
        }

        @Override
        public Object invoke() {
            m134invoke();
            return b0.a;
        }

        public final void m134invoke() {
            List legacyPaywallsStoredEvents = EventsManager.this.getLegacyPaywallsStoredEvents();
            ArrayList arrayListJ0 = q.J0(legacyPaywallsStoredEvents);
            ArrayList arrayList = new ArrayList(r.q0(arrayListJ0, 10));
            Iterator it = arrayListJ0.iterator();
            while (it.hasNext()) {
                arrayList.add(new BackendStoredEvent.Paywalls(((PaywallStoredEvent) it.next()).toBackendEvent()));
            }
            if (arrayListJ0.isEmpty()) {
                LogLevel logLevel = LogLevel.VERBOSE;
                LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    currentLogHandler.v("[Purchases] - " + logLevel.name(), "No legacy events to sync. Skipping legacy flush.");
                    return;
                }
                return;
            }
            LogLevel logLevel2 = LogLevel.VERBOSE;
            LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                currentLogHandler2.v(x5.k(logLevel2, new StringBuilder("[Purchases] - ")), "Legacy event flush: posting " + arrayList.size() + " events.");
            }
            p pVar = EventsManager.this.postEvents;
            ArrayList arrayList2 = new ArrayList(r.q0(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(BackendStoredEventKt.toBackendEvent((BackendStoredEvent.Paywalls) it2.next()));
            }
            pVar.invoke(new EventsRequest(arrayList2), Delay.LONG, new AnonymousClass4(EventsManager.this, this.$legacyEventsFileHelper, legacyPaywallsStoredEvents), new AnonymousClass5(EventsManager.this, this.$legacyEventsFileHelper, legacyPaywallsStoredEvents));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lg00/b0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass5 extends n implements a {
        final int $batchNumber;
        final long $batchStartTimeMillis;
        final Delay $delay;
        final List<BackendStoredEvent> $storedEventsWithNullValues;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lg00/b0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class AnonymousClass2 extends n implements a {
            final int $batchNumber;
            final Delay $delay;
            final List<BackendStoredEvent> $storedEventsWithNullValues;
            final EventsManager this$0;

            public AnonymousClass2(EventsManager eventsManager, List<? extends BackendStoredEvent> list, int i, Delay delay) {
                super(0);
                this.this$0 = eventsManager;
                this.$storedEventsWithNullValues = list;
                this.$batchNumber = i;
                this.$delay = delay;
            }

            @Override
            public Object invoke() {
                m139invoke();
                return b0.a;
            }

            public final void m139invoke() {
                this.this$0.fileHelper.clear(this.$storedEventsWithNullValues.size());
                this.this$0.flushNextBatch(this.$batchNumber + 1, this.$delay);
            }
        }

        public AnonymousClass5(int i, long j, List<? extends BackendStoredEvent> list, Delay delay) {
            super(0);
            this.$batchNumber = i;
            this.$batchStartTimeMillis = j;
            this.$storedEventsWithNullValues = list;
            this.$delay = delay;
        }

        @Override
        public Object invoke() {
            m138invoke();
            return b0.a;
        }

        public final void m138invoke() {
            int i = this.$batchNumber;
            LogLevel logLevel = LogLevel.VERBOSE;
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler.v(x5.k(logLevel, new StringBuilder("[Purchases] - ")), "New event flush (batch " + i + "): success.");
            }
            DebugEventListener debugEventListener = EventsManager.this.getDebugEventListener();
            if (debugEventListener != null) {
                debugEventListener.onDebugEventReceived(new DebugEvent(DebugEventName.FLUSH_COMPLETED, d0.R(new k("batch_number", String.valueOf(this.$batchNumber)), new k("elapsed_millis", String.valueOf(System.currentTimeMillis() - this.$batchStartTimeMillis)))));
            }
            EventsManager eventsManager = EventsManager.this;
            EventsManager.enqueue$default(eventsManager, null, new AnonymousClass2(eventsManager, this.$storedEventsWithNullValues, this.$batchNumber, this.$delay), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "", "shouldMarkAsSynced", "Lg00/b0;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;Z)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass6 extends n implements u00.n {
        final int $batchNumber;
        final List<BackendStoredEvent> $storedEventsWithNullValues;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lg00/b0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class AnonymousClass3 extends n implements a {
            final boolean $shouldMarkAsSynced;
            final List<BackendStoredEvent> $storedEventsWithNullValues;
            final EventsManager this$0;

            public AnonymousClass3(boolean z, EventsManager eventsManager, List<? extends BackendStoredEvent> list) {
                super(0);
                this.$shouldMarkAsSynced = z;
                this.this$0 = eventsManager;
                this.$storedEventsWithNullValues = list;
            }

            @Override
            public Object invoke() {
                m140invoke();
                return b0.a;
            }

            public final void m140invoke() {
                if (this.$shouldMarkAsSynced) {
                    this.this$0.fileHelper.clear(this.$storedEventsWithNullValues.size());
                }
                this.this$0.onFlushComplete();
            }
        }

        public AnonymousClass6(int i, List<? extends BackendStoredEvent> list) {
            super(2);
            this.$batchNumber = i;
            this.$storedEventsWithNullValues = list;
        }

        @Override
        public Object invoke(Object obj, Object obj2) {
            invoke((PurchasesError) obj, ((Boolean) obj2).booleanValue());
            return b0.a;
        }

        public final void invoke(PurchasesError error, boolean z) {
            m.e(error, "error");
            int i = this.$batchNumber;
            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "New event flush (batch " + i + ") error: " + error + '.', null);
            DebugEventListener debugEventListener = EventsManager.this.getDebugEventListener();
            if (debugEventListener != null) {
                DebugEventName debugEventName = DebugEventName.FLUSH_ERROR;
                i00.f fVar = new i00.f();
                fVar.put("errorCode", error.getCode().name());
                String underlyingErrorMessage = error.getUnderlyingErrorMessage();
                if (underlyingErrorMessage != null) {
                    fVar.put("underlyingErrorMessage", r30.k.h1(80, underlyingErrorMessage));
                }
                debugEventListener.onDebugEventReceived(new DebugEvent(debugEventName, fVar.c()));
            }
            EventsManager eventsManager = EventsManager.this;
            EventsManager.enqueue$default(eventsManager, null, new AnonymousClass3(z, eventsManager, this.$storedEventsWithNullValues), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lq30/j;", "Lcom/revenuecat/purchases/paywalls/events/PaywallStoredEvent;", "sequence", "Lg00/b0;", "invoke", "(Lq30/j;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C00931 extends n implements u00.k {
        final z $events;

        public C00931(z zVar) {
            super(1);
            this.$events = zVar;
        }

        @Override
        public Object invoke(Object obj) {
            invoke((j) obj);
            return b0.a;
        }

        public final void invoke(j sequence) {
            m.e(sequence, "sequence");
            this.$events.A = l.u0(l.t0(sequence, 50));
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lq30/j;", "Lcom/revenuecat/purchases/common/events/BackendStoredEvent;", "sequence", "Lg00/b0;", "invoke", "(Lq30/j;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C00941 extends n implements u00.k {
        final z $events;

        public C00941(z zVar) {
            super(1);
            this.$events = zVar;
        }

        @Override
        public Object invoke(Object obj) {
            invoke((j) obj);
            return b0.a;
        }

        public final void invoke(j sequence) {
            m.e(sequence, "sequence");
            this.$events.A = l.u0(l.t0(sequence, 50));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lg00/b0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C00951 extends n implements a {
        final FeatureEvent $event;
        final EventsManager this$0;

        public C00951(FeatureEvent featureEvent, EventsManager eventsManager) {
            super(0);
            this.$event = featureEvent;
            this.this$0 = eventsManager;
        }

        @Override
        public Object invoke() {
            m141invoke();
            return b0.a;
        }

        public final void m141invoke() {
            BackendStoredEvent backendStoredEvent;
            FeatureEvent featureEvent = this.$event;
            LogLevel logLevel = LogLevel.DEBUG;
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            Config config = Config.INSTANCE;
            if (config.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler.d(x5.k(logLevel, new StringBuilder("[Purchases] - ")), "Tracking event: " + featureEvent);
            }
            FeatureEvent featureEvent2 = this.$event;
            if (featureEvent2 instanceof PaywallEvent) {
                backendStoredEvent = BackendStoredEventKt.toBackendStoredEvent((PaywallEvent) featureEvent2, this.this$0.identityManager.getCurrentAppUserID());
            } else if (featureEvent2 instanceof CustomerCenterImpressionEvent) {
                String currentAppUserID = this.this$0.identityManager.getCurrentAppUserID();
                String string = this.this$0.appSessionID.toString();
                m.d(string, "appSessionID.toString()");
                backendStoredEvent = BackendStoredEventKt.toBackendStoredEvent((CustomerCenterImpressionEvent) featureEvent2, currentAppUserID, string);
            } else if (featureEvent2 instanceof CustomerCenterSurveyOptionChosenEvent) {
                String currentAppUserID2 = this.this$0.identityManager.getCurrentAppUserID();
                String string2 = this.this$0.appSessionID.toString();
                m.d(string2, "appSessionID.toString()");
                backendStoredEvent = BackendStoredEventKt.toBackendStoredEvent((CustomerCenterSurveyOptionChosenEvent) featureEvent2, currentAppUserID2, string2);
            } else if (featureEvent2 instanceof AdEvent.Displayed) {
                String currentAppUserID3 = this.this$0.identityManager.getCurrentAppUserID();
                String string3 = this.this$0.appSessionID.toString();
                m.d(string3, "appSessionID.toString()");
                backendStoredEvent = BackendStoredEventKt.toBackendStoredEvent((AdEvent.Displayed) featureEvent2, currentAppUserID3, string3);
            } else if (featureEvent2 instanceof AdEvent.Open) {
                String currentAppUserID4 = this.this$0.identityManager.getCurrentAppUserID();
                String string4 = this.this$0.appSessionID.toString();
                m.d(string4, "appSessionID.toString()");
                backendStoredEvent = BackendStoredEventKt.toBackendStoredEvent((AdEvent.Open) featureEvent2, currentAppUserID4, string4);
            } else if (featureEvent2 instanceof AdEvent.Revenue) {
                String currentAppUserID5 = this.this$0.identityManager.getCurrentAppUserID();
                String string5 = this.this$0.appSessionID.toString();
                m.d(string5, "appSessionID.toString()");
                backendStoredEvent = BackendStoredEventKt.toBackendStoredEvent((AdEvent.Revenue) featureEvent2, currentAppUserID5, string5);
            } else if (featureEvent2 instanceof AdEvent.Loaded) {
                String currentAppUserID6 = this.this$0.identityManager.getCurrentAppUserID();
                String string6 = this.this$0.appSessionID.toString();
                m.d(string6, "appSessionID.toString()");
                backendStoredEvent = BackendStoredEventKt.toBackendStoredEvent((AdEvent.Loaded) featureEvent2, currentAppUserID6, string6);
            } else if (featureEvent2 instanceof AdEvent.FailedToLoad) {
                String currentAppUserID7 = this.this$0.identityManager.getCurrentAppUserID();
                String string7 = this.this$0.appSessionID.toString();
                m.d(string7, "appSessionID.toString()");
                backendStoredEvent = BackendStoredEventKt.toBackendStoredEvent((AdEvent.FailedToLoad) featureEvent2, currentAppUserID7, string7);
            } else if (featureEvent2 instanceof CustomPaywallEvent.Impression) {
                String currentAppUserID8 = this.this$0.identityManager.getCurrentAppUserID();
                String string8 = this.this$0.appSessionID.toString();
                m.d(string8, "appSessionID.toString()");
                backendStoredEvent = BackendStoredEventKt.toBackendStoredEvent((CustomPaywallEvent.Impression) featureEvent2, currentAppUserID8, string8);
            } else {
                backendStoredEvent = null;
            }
            if (backendStoredEvent != null) {
                this.this$0.checkFileSizeAndClearIfNeeded();
                this.this$0.fileHelper.appendEvent(backendStoredEvent);
                if (this.$event.isPriorityEvent()) {
                    this.this$0.performPriorityFlush();
                    return;
                }
                return;
            }
            FeatureEvent featureEvent3 = this.$event;
            LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
            if (config.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler2.d(x5.k(logLevel, new StringBuilder("[Purchases] - ")), "Backend event not implemented for: " + featureEvent3);
            }
        }
    }

    static {
        UUID uuidRandomUUID = UUID.randomUUID();
        m.d(uuidRandomUUID, "randomUUID()");
        appSessionID = uuidRandomUUID;
        json = d.c(EventsManager$Companion$json$1.INSTANCE);
    }

    public EventsManager(UUID appSessionID2, EventsFileHelper<PaywallStoredEvent> eventsFileHelper, EventsFileHelper<BackendStoredEvent> fileHelper, IdentityManager identityManager, Dispatcher eventsDispatcher, p postEvents, RateLimiter priorityFlushRateLimiter) {
        m.e(appSessionID2, "appSessionID");
        m.e(fileHelper, "fileHelper");
        m.e(identityManager, "identityManager");
        m.e(eventsDispatcher, "eventsDispatcher");
        m.e(postEvents, "postEvents");
        m.e(priorityFlushRateLimiter, "priorityFlushRateLimiter");
        this.appSessionID = appSessionID2;
        this.legacyEventsFileHelper = eventsFileHelper;
        this.fileHelper = fileHelper;
        this.identityManager = identityManager;
        this.eventsDispatcher = eventsDispatcher;
        this.postEvents = postEvents;
        this.priorityFlushRateLimiter = priorityFlushRateLimiter;
        this.flushInProgress = new AtomicBoolean(false);
    }

    public EventsManager(UUID uuid, EventsFileHelper eventsFileHelper, EventsFileHelper eventsFileHelper2, IdentityManager identityManager, Dispatcher dispatcher, p pVar, RateLimiter rateLimiter, int i, f fVar) {
        uuid = (i & 1) != 0 ? appSessionID : uuid;
        if ((i & 64) != 0) {
            s30.a aVar = b.B;
            rateLimiter = new RateLimiter(5, g4.b0(60, s30.d.SECONDS), null);
        }
        this(uuid, eventsFileHelper, eventsFileHelper2, identityManager, dispatcher, pVar, rateLimiter);
    }

    public final void checkFileSizeAndClearIfNeeded() {
        if (this.fileHelper.fileSizeInKB() >= 2048.0d) {
            LogLevel logLevel = LogLevel.WARN;
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler.w("[Purchases] - " + logLevel.name(), "Event store size limit reached. Clearing oldest events to free up space.");
            }
            this.fileHelper.clear(50);
            DebugEventListener debugEventListener = this.debugEventListener;
            if (debugEventListener != null) {
                debugEventListener.onDebugEventReceived(new DebugEvent(DebugEventName.FILE_SIZE_LIMIT_REACHED, null, 2, null));
            }
        }
    }

    private final void enqueue(Delay delay, a command) {
        this.eventsDispatcher.enqueue(new b4.a(7, command), delay);
    }

    public static void enqueue$default(EventsManager eventsManager, Delay delay, a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            delay = Delay.NONE;
        }
        eventsManager.enqueue(delay, aVar);
    }

    public static void flushEvents$default(EventsManager eventsManager, Delay delay, int i, Object obj) {
        if ((i & 1) != 0) {
            delay = Delay.DEFAULT;
        }
        eventsManager.flushEvents(delay);
    }

    public final void flushLegacyEvents() {
        EventsFileHelper<PaywallStoredEvent> eventsFileHelper = this.legacyEventsFileHelper;
        if (eventsFileHelper == null) {
            return;
        }
        enqueue$default(this, null, new C00921(eventsFileHelper), 1, null);
    }

    public final void flushNextBatch(int batchNumber, Delay delay) {
        DebugEventListener debugEventListener;
        if (batchNumber > 10) {
            LogLevel logLevel = LogLevel.VERBOSE;
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler.v("[Purchases] - " + logLevel.name(), "Reached maximum number of flush batches (10). Stopping flush.");
            }
            onFlushComplete();
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        List<BackendStoredEvent> storedEvents = getStoredEvents();
        ArrayList arrayListJ0 = q.J0(storedEvents);
        if (arrayListJ0.isEmpty()) {
            LogLevel logLevel2 = LogLevel.VERBOSE;
            LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                currentLogHandler2.v("[Purchases] - " + logLevel2.name(), "No new events to sync.");
            }
            if (batchNumber == 1 && (debugEventListener = this.debugEventListener) != null) {
                debugEventListener.onDebugEventReceived(new DebugEvent(DebugEventName.FLUSH_SKIPPED_NO_EVENTS, null, 2, null));
            }
            onFlushComplete();
            return;
        }
        LogLevel logLevel3 = LogLevel.VERBOSE;
        LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
            String strK = x5.k(logLevel3, new StringBuilder("[Purchases] - "));
            StringBuilder sbQ = oi.k.q("New event flush (batch ", batchNumber, "): posting ");
            sbQ.append(arrayListJ0.size());
            sbQ.append(" events.");
            currentLogHandler3.v(strK, sbQ.toString());
        }
        p pVar = this.postEvents;
        ArrayList arrayList = new ArrayList(r.q0(arrayListJ0, 10));
        Iterator it = arrayListJ0.iterator();
        while (it.hasNext()) {
            arrayList.add(BackendStoredEventKt.toBackendEvent((BackendStoredEvent) it.next()));
        }
        pVar.invoke(new EventsRequest(arrayList), delay, new AnonymousClass5(batchNumber, jCurrentTimeMillis, storedEvents, delay), new AnonymousClass6(batchNumber, storedEvents));
    }

    public final List<PaywallStoredEvent> getLegacyPaywallsStoredEvents() {
        z zVar = new z();
        zVar.A = x.A;
        EventsFileHelper<PaywallStoredEvent> eventsFileHelper = this.legacyEventsFileHelper;
        if (eventsFileHelper != null) {
            eventsFileHelper.readFile(new C00931(zVar));
        }
        return (List) zVar.A;
    }

    private final List<BackendStoredEvent> getStoredEvents() {
        z zVar = new z();
        zVar.A = x.A;
        this.fileHelper.readFile(new C00941(zVar));
        return (List) zVar.A;
    }

    public final void onFlushComplete() {
        this.flushInProgress.set(false);
        startPendingPriorityFlushIfNeeded();
    }

    public final void performPriorityFlush() {
        this.pendingPriorityFlush = true;
        if (!this.flushInProgress.get()) {
            startPendingPriorityFlushIfNeeded();
            return;
        }
        LogLevel logLevel = LogLevel.DEBUG;
        LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            x5.w(logLevel, new StringBuilder("[Purchases] - "), currentLogHandler, "Flush in progress. Queuing priority flush.");
        }
    }

    private final void startPendingPriorityFlushIfNeeded() {
        if (this.pendingPriorityFlush) {
            this.pendingPriorityFlush = false;
            if (!this.priorityFlushRateLimiter.shouldProceed()) {
                LogLevel logLevel = LogLevel.DEBUG;
                LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    x5.w(logLevel, new StringBuilder("[Purchases] - "), currentLogHandler, "Priority flush rate limited. Skipping.");
                    return;
                }
                return;
            }
            if (this.flushInProgress.getAndSet(true)) {
                LogLevel logLevel2 = LogLevel.DEBUG;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    x5.w(logLevel2, new StringBuilder("[Purchases] - "), currentLogHandler2, "Flush in progress. Queuing priority flush.");
                }
                this.pendingPriorityFlush = true;
                return;
            }
            LogLevel logLevel3 = LogLevel.DEBUG;
            LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                x5.w(logLevel3, new StringBuilder("[Purchases] - "), currentLogHandler3, "Starting priority flush.");
            }
            flushNextBatch(1, Delay.NONE);
        }
    }

    public final synchronized void flushEvents(Delay delay) {
        m.e(delay, "delay");
        enqueue$default(this, null, new AnonymousClass1(delay), 1, null);
    }

    public final synchronized DebugEventListener getDebugEventListener() {
        return this.debugEventListener;
    }

    public final synchronized void setDebugEventListener(DebugEventListener debugEventListener) {
        try {
            this.debugEventListener = debugEventListener;
            this.fileHelper.setDebugEventCallback(debugEventListener != null ? new EventsManager$debugEventListener$callback$1$1(debugEventListener) : null);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void track(FeatureEvent event) {
        m.e(event, "event");
        enqueue$default(this, null, new C00951(event, this), 1, null);
    }
}
