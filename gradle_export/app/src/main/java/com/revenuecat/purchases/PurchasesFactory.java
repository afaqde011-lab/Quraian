package com.revenuecat.purchases;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Process;
import com.google.android.gms.internal.measurement.x5;
import com.revenuecat.purchases.common.AppConfig;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.BackendHelper;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultLocaleProvider;
import com.revenuecat.purchases.common.Delay;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.FileHelper;
import com.revenuecat.purchases.common.HTTPClient;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.OfferingParser;
import com.revenuecat.purchases.common.PlatformInfo;
import com.revenuecat.purchases.common.SharedPreferencesManager;
import com.revenuecat.purchases.common.UtilsKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.caching.LocalTransactionMetadataStore;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsFileHelper;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsHelper;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsSynchronizer;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.common.events.BackendStoredEvent;
import com.revenuecat.purchases.common.events.EventsManager;
import com.revenuecat.purchases.common.events.EventsRequest;
import com.revenuecat.purchases.common.networking.ETagManager;
import com.revenuecat.purchases.common.offerings.OfferingsCache;
import com.revenuecat.purchases.common.offerings.OfferingsFactory;
import com.revenuecat.purchases.common.offerings.OfferingsManager;
import com.revenuecat.purchases.common.offlineentitlements.OfflineCustomerInfoCalculator;
import com.revenuecat.purchases.common.offlineentitlements.OfflineEntitlementsManager;
import com.revenuecat.purchases.common.offlineentitlements.PurchasedProductsFetcher;
import com.revenuecat.purchases.common.subscriberattributes.DeviceIdentifiersFetcher;
import com.revenuecat.purchases.common.verification.SignatureVerificationMode;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases.identity.IdentityManager;
import com.revenuecat.purchases.paywalls.FontLoader;
import com.revenuecat.purchases.paywalls.OfferingFontPreDownloader;
import com.revenuecat.purchases.paywalls.PaywallPresentedCache;
import com.revenuecat.purchases.paywalls.events.PaywallStoredEvent;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributesPoster;
import com.revenuecat.purchases.subscriberattributes.caching.SubscriberAttributesCache;
import com.revenuecat.purchases.utils.AndroidVersionUtilsKt;
import com.revenuecat.purchases.utils.CoilImageDownloader;
import com.revenuecat.purchases.utils.EventsFileHelper;
import com.revenuecat.purchases.utils.IsDebugBuildProvider;
import com.revenuecat.purchases.utils.OfferingImagePreDownloader;
import com.revenuecat.purchases.utils.PurchaseParamsValidator;
import com.revenuecat.purchases.virtualcurrencies.VirtualCurrencyManager;
import f50.k;
import g00.b0;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import u00.p;

@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 02\u00020\u0001:\u000201B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010\t\u001a\u00020\bH\u0002JF\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0002JV\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#2\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020%2\b\b\u0002\u0010'\u001a\u00020(J\u0010\u0010)\u001a\u00020*2\u0006\u0010\u001b\u001a\u00020\u001cH\u0007J\f\u0010+\u001a\u00020,*\u00020-H\u0002J\u0014\u0010.\u001a\u00020%*\u00020-2\u0006\u0010/\u001a\u00020(H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lcom/revenuecat/purchases/PurchasesFactory;", "", "isDebugBuild", "Lcom/revenuecat/purchases/utils/IsDebugBuildProvider;", "apiKeyValidator", "Lcom/revenuecat/purchases/APIKeyValidator;", "(Lcom/revenuecat/purchases/utils/IsDebugBuildProvider;Lcom/revenuecat/purchases/APIKeyValidator;)V", "createDefaultExecutor", "Ljava/util/concurrent/ExecutorService;", "createEventsExecutor", "createEventsManager", "Lcom/revenuecat/purchases/common/events/EventsManager;", "identityManager", "Lcom/revenuecat/purchases/identity/IdentityManager;", "eventsDispatcher", "Lcom/revenuecat/purchases/common/Dispatcher;", "backend", "Lcom/revenuecat/purchases/common/Backend;", "legacyEventsFileHelper", "Lcom/revenuecat/purchases/utils/EventsFileHelper;", "Lcom/revenuecat/purchases/paywalls/events/PaywallStoredEvent;", "fileHelper", "Lcom/revenuecat/purchases/common/events/BackendStoredEvent;", "baseURL", "Ljava/net/URL;", "createPurchases", "Lcom/revenuecat/purchases/Purchases;", "configuration", "Lcom/revenuecat/purchases/PurchasesConfiguration;", "platformInfo", "Lcom/revenuecat/purchases/common/PlatformInfo;", "proxyURL", "overrideBillingAbstract", "Lcom/revenuecat/purchases/common/BillingAbstract;", "forceServerErrorStrategy", "Lcom/revenuecat/purchases/ForceServerErrorStrategy;", "forceSigningError", "", "runningIntegrationTests", "baseUrlString", "", "validateConfiguration", "Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;", "getApplication", "Landroid/app/Application;", "Landroid/content/Context;", "hasPermission", "permission", "Companion", "LowPriorityThreadFactory", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PurchasesFactory {

    public static final Companion INSTANCE = new Companion(null);
    private final APIKeyValidator apiKeyValidator;
    private final IsDebugBuildProvider isDebugBuild;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001d\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0001¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/PurchasesFactory$Companion;", "", "()V", "shouldInitializeDiagnostics", "", "diagnosticsEnabled", "uiPreviewMode", "shouldInitializeDiagnostics$purchases_defaultsBc8Release", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(f fVar) {
            this();
        }

        public final boolean shouldInitializeDiagnostics$purchases_defaultsBc8Release(boolean diagnosticsEnabled, boolean uiPreviewMode) {
            return diagnosticsEnabled && !uiPreviewMode;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/revenuecat/purchases/PurchasesFactory$LowPriorityThreadFactory;", "Ljava/util/concurrent/ThreadFactory;", "threadName", "", "(Ljava/lang/String;)V", "newThread", "Ljava/lang/Thread;", "r", "Ljava/lang/Runnable;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class LowPriorityThreadFactory implements ThreadFactory {
        private final String threadName;

        public LowPriorityThreadFactory(String threadName) {
            m.e(threadName, "threadName");
            this.threadName = threadName;
        }

        public static final void newThread$lambda$1(Runnable runnable) {
            if (runnable != null) {
                Process.setThreadPriority(5);
                runnable.run();
            }
        }

        @Override
        public Thread newThread(Runnable r) {
            return new Thread(new a(r, 4), this.threadName);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\r\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u0007H\n¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/revenuecat/purchases/common/events/EventsRequest;", "request", "Lcom/revenuecat/purchases/common/Delay;", "delay", "Lkotlin/Function0;", "Lg00/b0;", "onSuccess", "Lkotlin/Function2;", "Lcom/revenuecat/purchases/PurchasesError;", "", "onError", "invoke", "(Lcom/revenuecat/purchases/common/events/EventsRequest;Lcom/revenuecat/purchases/common/Delay;Lu00/a;Lu00/n;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass1 extends n implements p {
        final Backend $backend;
        final URL $baseURL;

        public AnonymousClass1(Backend backend, URL url) {
            super(4);
            this.$backend = backend;
            this.$baseURL = url;
        }

        @Override
        public Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            invoke((EventsRequest) obj, (Delay) obj2, (u00.a) obj3, (u00.n) obj4);
            return b0.a;
        }

        public final void invoke(EventsRequest request, Delay delay, u00.a onSuccess, u00.n onError) {
            m.e(request, "request");
            m.e(delay, "delay");
            m.e(onSuccess, "onSuccess");
            m.e(onError, "onError");
            this.$backend.postEvents(request, this.$baseURL, delay, onSuccess, onError);
        }
    }

    public PurchasesFactory(IsDebugBuildProvider isDebugBuild, APIKeyValidator apiKeyValidator) {
        m.e(isDebugBuild, "isDebugBuild");
        m.e(apiKeyValidator, "apiKeyValidator");
        this.isDebugBuild = isDebugBuild;
        this.apiKeyValidator = apiKeyValidator;
    }

    public PurchasesFactory(IsDebugBuildProvider isDebugBuildProvider, APIKeyValidator aPIKeyValidator, int i, f fVar) {
        this(isDebugBuildProvider, (i & 2) != 0 ? new APIKeyValidator() : aPIKeyValidator);
    }

    private final ExecutorService createDefaultExecutor() {
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        m.d(scheduledExecutorServiceNewSingleThreadScheduledExecutor, "newSingleThreadScheduledExecutor()");
        return scheduledExecutorServiceNewSingleThreadScheduledExecutor;
    }

    private final ExecutorService createEventsExecutor() {
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new LowPriorityThreadFactory("revenuecat-events-thread"));
        m.d(scheduledExecutorServiceNewSingleThreadScheduledExecutor, "newSingleThreadScheduled…venuecat-events-thread\"))");
        return scheduledExecutorServiceNewSingleThreadScheduledExecutor;
    }

    private final EventsManager createEventsManager(IdentityManager identityManager, Dispatcher eventsDispatcher, Backend backend, EventsFileHelper<PaywallStoredEvent> legacyEventsFileHelper, EventsFileHelper<BackendStoredEvent> fileHelper, URL baseURL) {
        return new EventsManager(null, legacyEventsFileHelper, fileHelper, identityManager, eventsDispatcher, new AnonymousClass1(backend, baseURL), null, 65, null);
    }

    public static Purchases createPurchases$default(PurchasesFactory purchasesFactory, PurchasesConfiguration purchasesConfiguration, PlatformInfo platformInfo, URL url, BillingAbstract billingAbstract, ForceServerErrorStrategy forceServerErrorStrategy, boolean z, boolean z2, String str, int i, Object obj) {
        if ((i & 8) != 0) {
            billingAbstract = null;
        }
        if ((i & 16) != 0) {
            forceServerErrorStrategy = null;
        }
        if ((i & 32) != 0) {
            z = false;
        }
        if ((i & 64) != 0) {
            z2 = false;
        }
        if ((i & 128) != 0) {
            str = AppConfig.baseUrlString;
        }
        return purchasesFactory.createPurchases(purchasesConfiguration, platformInfo, url, billingAbstract, forceServerErrorStrategy, z, z2, str);
    }

    private final Application getApplication(Context context) {
        Context applicationContext = context.getApplicationContext();
        m.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
        return (Application) applicationContext;
    }

    private final boolean hasPermission(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    public final Purchases createPurchases(PurchasesConfiguration configuration, PlatformInfo platformInfo, URL proxyURL, BillingAbstract overrideBillingAbstract, ForceServerErrorStrategy forceServerErrorStrategy, boolean forceSigningError, boolean runningIntegrationTests, String baseUrlString) {
        Context context;
        AppConfig appConfig;
        Dispatcher dispatcher;
        DiagnosticsTracker diagnosticsTracker;
        DiagnosticsHelper diagnosticsHelper;
        DiagnosticsFileHelper diagnosticsFileHelper;
        SignatureVerificationMode signatureVerificationModeFromEntitlementVerificationMode$default;
        PurchasesStateCache purchasesStateCache;
        Application application;
        DeviceCache deviceCache;
        Backend backend;
        BillingAbstract billingAbstract;
        Dispatcher dispatcher2;
        Backend backend2;
        DiagnosticsTracker diagnosticsTracker2;
        DiagnosticsSynchronizer diagnosticsSynchronizer;
        int[] iArr;
        m.e(configuration, "configuration");
        m.e(platformInfo, "platformInfo");
        m.e(baseUrlString, "baseUrlString");
        APIKeyValidator.ValidationResult validationResultValidateConfiguration = validateConfiguration(configuration);
        Store store = validationResultValidateConfiguration == APIKeyValidator.ValidationResult.SIMULATED_STORE ? Store.TEST_STORE : configuration.getStore();
        Application application2 = getApplication(configuration.getContext());
        AppConfig appConfig2 = new AppConfig(configuration.getContext(), configuration.getPurchasesAreCompletedBy(), configuration.getShowInAppMessagesAutomatically(), platformInfo, proxyURL, store, this.isDebugBuild.invoke(), validationResultValidateConfiguration, configuration.getDangerousSettings(), runningIntegrationTests, forceSigningError, baseUrlString);
        if (UtilsKt.isDeviceProtectedStorageCompat(configuration.getContext())) {
            LogLevel logLevel = LogLevel.DEBUG;
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                x5.w(logLevel, new StringBuilder("[Purchases] - "), currentLogHandler, "‼️ Using device-protected storage. Make sure to *always* configure Purchases with a Context object created using `createDeviceProtectedStorageContext()` to avoid undefined behavior.\nSee https://developer.android.com/reference/android/content/Context#createDeviceProtectedStorageContext() for more info.");
            }
            context = configuration.getContext();
        } else {
            context = application2;
        }
        try {
            SharedPreferences sharedPreferences = new SharedPreferencesManager(context, null, null, 6, null).getSharedPreferences();
            ETagManager eTagManager = new ETagManager(context, null, null, 6, null);
            Dispatcher dispatcher3 = new Dispatcher(createDefaultExecutor(), null, runningIntegrationTests, 2, null);
            ExecutorService service = configuration.getService();
            if (service == null) {
                service = createDefaultExecutor();
            }
            int i = 2;
            f fVar = null;
            Handler handler = null;
            Dispatcher dispatcher4 = new Dispatcher(service, handler, runningIntegrationTests, i, fVar);
            Dispatcher dispatcher5 = new Dispatcher(createEventsExecutor(), handler, runningIntegrationTests, i, fVar);
            Companion companion = INSTANCE;
            if (companion.shouldInitializeDiagnostics$purchases_defaultsBc8Release(configuration.getDiagnosticsEnabled(), appConfig2.getUiPreviewMode()) && AndroidVersionUtilsKt.isAndroidNOrNewer()) {
                DiagnosticsFileHelper diagnosticsFileHelper2 = new DiagnosticsFileHelper(new FileHelper(context));
                DiagnosticsHelper diagnosticsHelper2 = new DiagnosticsHelper(context, diagnosticsFileHelper2, null, 4, null);
                DiagnosticsTracker diagnosticsTracker3 = new DiagnosticsTracker(appConfig2, diagnosticsFileHelper2, diagnosticsHelper2, dispatcher5, null, 16, null);
                appConfig = appConfig2;
                dispatcher = dispatcher5;
                diagnosticsHelper = diagnosticsHelper2;
                diagnosticsFileHelper = diagnosticsFileHelper2;
                diagnosticsTracker = diagnosticsTracker3;
            } else {
                appConfig = appConfig2;
                dispatcher = dispatcher5;
                if (companion.shouldInitializeDiagnostics$purchases_defaultsBc8Release(configuration.getDiagnosticsEnabled(), appConfig.getUiPreviewMode())) {
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w("[Purchases] - " + logLevel2.name(), "Diagnostics are only supported on Android N or newer.");
                    }
                }
                diagnosticsTracker = null;
                diagnosticsHelper = null;
                diagnosticsFileHelper = null;
            }
            try {
                signatureVerificationModeFromEntitlementVerificationMode$default = SignatureVerificationMode.Companion.fromEntitlementVerificationMode$default(SignatureVerificationMode.INSTANCE, configuration.getVerificationMode(), null, 2, null);
            } catch (IllegalStateException e) {
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Error creating signature verifier: " + e.getMessage() + ". Disabling signature verification.", null);
                signatureVerificationModeFromEntitlementVerificationMode$default = SignatureVerificationMode.Disabled.INSTANCE;
            }
            SigningManager signingManager = new SigningManager(signatureVerificationModeFromEntitlementVerificationMode$default, appConfig, configuration.getApiKey());
            DeviceCache deviceCache2 = new DeviceCache(sharedPreferences, configuration.getApiKey(), null, 4, null);
            DefaultLocaleProvider defaultLocaleProvider = new DefaultLocaleProvider();
            DiagnosticsTracker diagnosticsTracker4 = diagnosticsTracker;
            HTTPClient hTTPClient = new HTTPClient(appConfig, eTagManager, diagnosticsTracker4, signingManager, deviceCache2, null, 0 == true ? 1 : 0, defaultLocaleProvider, forceServerErrorStrategy, null, null, 1632, null);
            DiagnosticsTracker diagnosticsTracker5 = diagnosticsTracker4;
            BackendHelper backendHelper = new BackendHelper(configuration.getApiKey(), dispatcher4, appConfig, hTTPClient);
            AppConfig appConfig3 = appConfig;
            Backend backend3 = new Backend(appConfig3, dispatcher4, dispatcher, hTTPClient, backendHelper);
            PurchasesStateCache purchasesStateCache2 = new PurchasesStateCache(new PurchasesState(null, null, null, false, false, 31, null));
            if (overrideBillingAbstract == null) {
                application = application2;
                BillingAbstract billingAbstractCreateBilling = BillingFactory.INSTANCE.createBilling(store, application, backendHelper, deviceCache2, PurchasesAreCompletedByKt.getFinishTransactions(configuration.getPurchasesAreCompletedBy()), diagnosticsTracker5, purchasesStateCache2, configuration.getPendingTransactionsForPrepaidPlansEnabled(), configuration.getGalaxyBillingMode(), backend3);
                deviceCache = deviceCache2;
                purchasesStateCache = purchasesStateCache2;
                backend = backend3;
                diagnosticsTracker5 = diagnosticsTracker5;
                billingAbstract = billingAbstractCreateBilling;
            } else {
                purchasesStateCache = purchasesStateCache2;
                application = application2;
                deviceCache = deviceCache2;
                backend = backend3;
                billingAbstract = overrideBillingAbstract;
            }
            SubscriberAttributesPoster subscriberAttributesPoster = new SubscriberAttributesPoster(backendHelper);
            DeviceIdentifiersFetcher deviceIdentifiersFetcherCreateAttributionFetcher = AttributionFetcherFactory.INSTANCE.createAttributionFetcher(configuration.getStore(), dispatcher4);
            SubscriberAttributesCache subscriberAttributesCache = new SubscriberAttributesCache(deviceCache);
            SubscriberAttributesManager subscriberAttributesManager = new SubscriberAttributesManager(subscriberAttributesCache, subscriberAttributesPoster, deviceIdentifiersFetcherCreateAttributionFetcher, configuration.getAutomaticDeviceIdentifierCollectionEnabled());
            DateProvider dateProvider = null;
            DeviceCache deviceCache3 = deviceCache;
            BillingAbstract billingAbstract2 = billingAbstract;
            OfflineCustomerInfoCalculator offlineCustomerInfoCalculator = new OfflineCustomerInfoCalculator(new PurchasedProductsFetcher(deviceCache3, billingAbstract2, dateProvider, 4, null), appConfig3, diagnosticsTracker5, dateProvider, 8, 0 == true ? 1 : 0);
            Backend backend4 = backend;
            DiagnosticsTracker diagnosticsTracker6 = diagnosticsTracker5;
            OfflineEntitlementsManager offlineEntitlementsManager = new OfflineEntitlementsManager(backend4, offlineCustomerInfoCalculator, deviceCache3, appConfig3, diagnosticsTracker6);
            OfferingsCache offeringsCache = new OfferingsCache(deviceCache3, null, 0 == true ? 1 : 0, defaultLocaleProvider, 6, null);
            IdentityManager identityManager = new IdentityManager(deviceCache3, subscriberAttributesCache, subscriberAttributesManager, offeringsCache, backend4, offlineEntitlementsManager, dispatcher3, appConfig3.getUiPreviewMode());
            CustomerInfoUpdateHandler customerInfoUpdateHandler = new CustomerInfoUpdateHandler(deviceCache3, identityManager, offlineEntitlementsManager, appConfig3, diagnosticsTracker6, null, 32, null);
            PaywallPresentedCache paywallPresentedCache = new PaywallPresentedCache();
            PostReceiptHelper postReceiptHelper = new PostReceiptHelper(appConfig3, backend4, billingAbstract2, customerInfoUpdateHandler, deviceCache3, subscriberAttributesManager, offlineEntitlementsManager, paywallPresentedCache, new LocalTransactionMetadataStore(context, configuration.getApiKey(), 0 == true ? 1 : 0, null, 12, null));
            PostTransactionWithProductDetailsHelper postTransactionWithProductDetailsHelper = new PostTransactionWithProductDetailsHelper(billingAbstract2, postReceiptHelper);
            PostPendingTransactionsHelper postPendingTransactionsHelper = new PostPendingTransactionsHelper(appConfig3, deviceCache3, billingAbstract2, dispatcher4, identityManager, postTransactionWithProductDetailsHelper, postReceiptHelper);
            CustomerInfoHelper customerInfoHelper = new CustomerInfoHelper(deviceCache3, backend4, offlineEntitlementsManager, customerInfoUpdateHandler, postPendingTransactionsHelper, diagnosticsTracker6, appConfig3.getUiPreviewMode(), null, null, 384, null);
            OfferingParser offeringParserCreateOfferingParser = OfferingParserFactory.INSTANCE.createOfferingParser(store);
            if (diagnosticsFileHelper == null || diagnosticsHelper == null || diagnosticsTracker6 == null || !AndroidVersionUtilsKt.isAndroidNOrNewer()) {
                dispatcher2 = dispatcher;
                backend2 = backend4;
                diagnosticsTracker2 = diagnosticsTracker6;
                diagnosticsSynchronizer = null;
            } else {
                Dispatcher dispatcher6 = dispatcher;
                diagnosticsSynchronizer = new DiagnosticsSynchronizer(diagnosticsHelper, diagnosticsFileHelper, diagnosticsTracker6, backend4, dispatcher6);
                backend2 = backend4;
                dispatcher2 = dispatcher6;
                diagnosticsTracker2 = diagnosticsTracker6;
                diagnosticsTracker2.setListener(diagnosticsSynchronizer);
            }
            DiagnosticsTracker diagnosticsTracker7 = diagnosticsTracker2;
            SyncPurchasesHelper syncPurchasesHelper = new SyncPurchasesHelper(billingAbstract2, identityManager, customerInfoHelper, postReceiptHelper, diagnosticsTracker7, null, 32, null);
            Context context2 = context;
            FontLoader fontLoader = new FontLoader(context2, null, null, null, 14, null);
            DiagnosticsSynchronizer diagnosticsSynchronizer2 = diagnosticsSynchronizer;
            Dispatcher dispatcher7 = dispatcher2;
            Backend backend5 = backend2;
            OfferingsManager offeringsManager = new OfferingsManager(offeringsCache, backend5, new OfferingsFactory(billingAbstract2, offeringParserCreateOfferingParser, dispatcher3, appConfig3), new OfferingImagePreDownloader(false, new CoilImageDownloader(application), 1, null), diagnosticsTracker7, new OfferingFontPreDownloader(context2, fontLoader), appConfig3.getUiPreviewMode(), 0 == true ? 1 : 0, null, 384, null);
            LogIntent logIntent = LogIntent.DEBUG;
            PurchasesFactory$createPurchases$lambda$8$$inlined$log$1 purchasesFactory$createPurchases$lambda$8$$inlined$log$1 = new PurchasesFactory$createPurchases$lambda$8$$inlined$log$1(logIntent);
            int[] iArr2 = LogWrapperKt.WhenMappings.$EnumSwitchMapping$0;
            switch (iArr2[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel3 = LogLevel.DEBUG;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.d(x5.k(logLevel3, new StringBuilder("[Purchases] - ")), (String) purchasesFactory$createPurchases$lambda$8$$inlined$log$1.invoke());
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesFactory$createPurchases$lambda$8$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel4 = LogLevel.WARN;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        currentLogHandler4.w(x5.k(logLevel4, new StringBuilder("[Purchases] - ")), (String) purchasesFactory$createPurchases$lambda$8$$inlined$log$1.invoke());
                    }
                    break;
                case 4:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler5.i(x5.k(logLevel5, new StringBuilder("[Purchases] - ")), (String) purchasesFactory$createPurchases$lambda$8$$inlined$log$1.invoke());
                    }
                    break;
                case 5:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        currentLogHandler6.d(x5.k(logLevel6, new StringBuilder("[Purchases] - ")), (String) purchasesFactory$createPurchases$lambda$8$$inlined$log$1.invoke());
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesFactory$createPurchases$lambda$8$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel7 = LogLevel.INFO;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        currentLogHandler7.i(x5.k(logLevel7, new StringBuilder("[Purchases] - ")), (String) purchasesFactory$createPurchases$lambda$8$$inlined$log$1.invoke());
                    }
                    break;
                case 8:
                    LogLevel logLevel8 = LogLevel.DEBUG;
                    LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler8.d(x5.k(logLevel8, new StringBuilder("[Purchases] - ")), (String) purchasesFactory$createPurchases$lambda$8$$inlined$log$1.invoke());
                    }
                    break;
                case 9:
                    LogLevel logLevel9 = LogLevel.DEBUG;
                    LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler9.d(x5.k(logLevel9, new StringBuilder("[Purchases] - ")), (String) purchasesFactory$createPurchases$lambda$8$$inlined$log$1.invoke());
                    }
                    break;
                case 10:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler10.w(x5.k(logLevel10, new StringBuilder("[Purchases] - ")), (String) purchasesFactory$createPurchases$lambda$8$$inlined$log$1.invoke());
                    }
                    break;
                case 11:
                    LogLevel logLevel11 = LogLevel.WARN;
                    LogHandler currentLogHandler11 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel11) <= 0) {
                        currentLogHandler11.w(x5.k(logLevel11, new StringBuilder("[Purchases] - ")), (String) purchasesFactory$createPurchases$lambda$8$$inlined$log$1.invoke());
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesFactory$createPurchases$lambda$8$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel12 = LogLevel.WARN;
                    LogHandler currentLogHandler12 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel12) <= 0) {
                        currentLogHandler12.w(x5.k(logLevel12, new StringBuilder("[Purchases] - ")), (String) purchasesFactory$createPurchases$lambda$8$$inlined$log$1.invoke());
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesFactory$createPurchases$lambda$8$$inlined$log$1.invoke(), null);
                    break;
            }
            PurchasesFactory$createPurchases$lambda$8$$inlined$log$2 purchasesFactory$createPurchases$lambda$8$$inlined$log$2 = new PurchasesFactory$createPurchases$lambda$8$$inlined$log$2(logIntent);
            switch (iArr2[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel13 = LogLevel.DEBUG;
                    LogHandler currentLogHandler13 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel13) <= 0) {
                        currentLogHandler13.d(x5.k(logLevel13, new StringBuilder("[Purchases] - ")), (String) purchasesFactory$createPurchases$lambda$8$$inlined$log$2.invoke());
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesFactory$createPurchases$lambda$8$$inlined$log$2.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel14 = LogLevel.WARN;
                    LogHandler currentLogHandler14 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel14) <= 0) {
                        currentLogHandler14.w(x5.k(logLevel14, new StringBuilder("[Purchases] - ")), (String) purchasesFactory$createPurchases$lambda$8$$inlined$log$2.invoke());
                    }
                    break;
                case 4:
                    LogLevel logLevel15 = LogLevel.INFO;
                    LogHandler currentLogHandler15 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel15) <= 0) {
                        currentLogHandler15.i(x5.k(logLevel15, new StringBuilder("[Purchases] - ")), (String) purchasesFactory$createPurchases$lambda$8$$inlined$log$2.invoke());
                    }
                    break;
                case 5:
                    LogLevel logLevel16 = LogLevel.DEBUG;
                    LogHandler currentLogHandler16 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel16) <= 0) {
                        currentLogHandler16.d(x5.k(logLevel16, new StringBuilder("[Purchases] - ")), (String) purchasesFactory$createPurchases$lambda$8$$inlined$log$2.invoke());
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesFactory$createPurchases$lambda$8$$inlined$log$2.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel17 = LogLevel.INFO;
                    LogHandler currentLogHandler17 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel17) <= 0) {
                        currentLogHandler17.i(x5.k(logLevel17, new StringBuilder("[Purchases] - ")), (String) purchasesFactory$createPurchases$lambda$8$$inlined$log$2.invoke());
                    }
                    break;
                case 8:
                    LogLevel logLevel18 = LogLevel.DEBUG;
                    LogHandler currentLogHandler18 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel18) <= 0) {
                        currentLogHandler18.d(x5.k(logLevel18, new StringBuilder("[Purchases] - ")), (String) purchasesFactory$createPurchases$lambda$8$$inlined$log$2.invoke());
                    }
                    break;
                case 9:
                    LogLevel logLevel19 = LogLevel.DEBUG;
                    LogHandler currentLogHandler19 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel19) <= 0) {
                        currentLogHandler19.d(x5.k(logLevel19, new StringBuilder("[Purchases] - ")), (String) purchasesFactory$createPurchases$lambda$8$$inlined$log$2.invoke());
                    }
                    break;
                case 10:
                    LogLevel logLevel20 = LogLevel.WARN;
                    LogHandler currentLogHandler20 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel20) <= 0) {
                        currentLogHandler20.w(x5.k(logLevel20, new StringBuilder("[Purchases] - ")), (String) purchasesFactory$createPurchases$lambda$8$$inlined$log$2.invoke());
                    }
                    break;
                case 11:
                    LogLevel logLevel21 = LogLevel.WARN;
                    LogHandler currentLogHandler21 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel21) <= 0) {
                        currentLogHandler21.w(x5.k(logLevel21, new StringBuilder("[Purchases] - ")), (String) purchasesFactory$createPurchases$lambda$8$$inlined$log$2.invoke());
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesFactory$createPurchases$lambda$8$$inlined$log$2.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel22 = LogLevel.WARN;
                    LogHandler currentLogHandler22 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel22) <= 0) {
                        currentLogHandler22.w(x5.k(logLevel22, new StringBuilder("[Purchases] - ")), (String) purchasesFactory$createPurchases$lambda$8$$inlined$log$2.invoke());
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesFactory$createPurchases$lambda$8$$inlined$log$2.invoke(), null);
                    break;
            }
            PurchasesFactory$createPurchases$lambda$8$$inlined$log$3 purchasesFactory$createPurchases$lambda$8$$inlined$log$3 = new PurchasesFactory$createPurchases$lambda$8$$inlined$log$3(logIntent, appConfig3);
            switch (iArr2[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel23 = LogLevel.DEBUG;
                    LogHandler currentLogHandler23 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel23) <= 0) {
                        currentLogHandler23.d(x5.k(logLevel23, new StringBuilder("[Purchases] - ")), (String) purchasesFactory$createPurchases$lambda$8$$inlined$log$3.invoke());
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesFactory$createPurchases$lambda$8$$inlined$log$3.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel24 = LogLevel.WARN;
                    LogHandler currentLogHandler24 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel24) <= 0) {
                        currentLogHandler24.w(x5.k(logLevel24, new StringBuilder("[Purchases] - ")), (String) purchasesFactory$createPurchases$lambda$8$$inlined$log$3.invoke());
                    }
                    break;
                case 4:
                    LogLevel logLevel25 = LogLevel.INFO;
                    LogHandler currentLogHandler25 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel25) <= 0) {
                        currentLogHandler25.i(x5.k(logLevel25, new StringBuilder("[Purchases] - ")), (String) purchasesFactory$createPurchases$lambda$8$$inlined$log$3.invoke());
                    }
                    break;
                case 5:
                    LogLevel logLevel26 = LogLevel.DEBUG;
                    LogHandler currentLogHandler26 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel26) <= 0) {
                        currentLogHandler26.d(x5.k(logLevel26, new StringBuilder("[Purchases] - ")), (String) purchasesFactory$createPurchases$lambda$8$$inlined$log$3.invoke());
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesFactory$createPurchases$lambda$8$$inlined$log$3.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel27 = LogLevel.INFO;
                    LogHandler currentLogHandler27 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel27) <= 0) {
                        currentLogHandler27.i(x5.k(logLevel27, new StringBuilder("[Purchases] - ")), (String) purchasesFactory$createPurchases$lambda$8$$inlined$log$3.invoke());
                    }
                    break;
                case 8:
                    LogLevel logLevel28 = LogLevel.DEBUG;
                    LogHandler currentLogHandler28 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel28) <= 0) {
                        currentLogHandler28.d(x5.k(logLevel28, new StringBuilder("[Purchases] - ")), (String) purchasesFactory$createPurchases$lambda$8$$inlined$log$3.invoke());
                    }
                    break;
                case 9:
                    LogLevel logLevel29 = LogLevel.DEBUG;
                    LogHandler currentLogHandler29 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel29) <= 0) {
                        currentLogHandler29.d(x5.k(logLevel29, new StringBuilder("[Purchases] - ")), (String) purchasesFactory$createPurchases$lambda$8$$inlined$log$3.invoke());
                    }
                    break;
                case 10:
                    LogLevel logLevel30 = LogLevel.WARN;
                    LogHandler currentLogHandler30 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel30) <= 0) {
                        currentLogHandler30.w(x5.k(logLevel30, new StringBuilder("[Purchases] - ")), (String) purchasesFactory$createPurchases$lambda$8$$inlined$log$3.invoke());
                    }
                    break;
                case 11:
                    LogLevel logLevel31 = LogLevel.WARN;
                    LogHandler currentLogHandler31 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel31) <= 0) {
                        currentLogHandler31.w(x5.k(logLevel31, new StringBuilder("[Purchases] - ")), (String) purchasesFactory$createPurchases$lambda$8$$inlined$log$3.invoke());
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesFactory$createPurchases$lambda$8$$inlined$log$3.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel32 = LogLevel.WARN;
                    LogHandler currentLogHandler32 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel32) <= 0) {
                        currentLogHandler32.w(x5.k(logLevel32, new StringBuilder("[Purchases] - ")), (String) purchasesFactory$createPurchases$lambda$8$$inlined$log$3.invoke());
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesFactory$createPurchases$lambda$8$$inlined$log$3.invoke(), null);
                    break;
            }
            LogIntent logIntent2 = LogIntent.USER;
            PurchasesFactory$createPurchases$lambda$8$$inlined$log$4 purchasesFactory$createPurchases$lambda$8$$inlined$log$4 = new PurchasesFactory$createPurchases$lambda$8$$inlined$log$4(logIntent2, configuration);
            switch (iArr2[logIntent2.ordinal()]) {
                case 1:
                    iArr = iArr2;
                    LogLevel logLevel33 = LogLevel.DEBUG;
                    LogHandler currentLogHandler33 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel33) <= 0) {
                        currentLogHandler33.d(x5.k(logLevel33, new StringBuilder("[Purchases] - ")), (String) purchasesFactory$createPurchases$lambda$8$$inlined$log$4.invoke());
                    }
                    break;
                case 2:
                    iArr = iArr2;
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesFactory$createPurchases$lambda$8$$inlined$log$4.invoke(), null);
                    break;
                case 3:
                    iArr = iArr2;
                    LogLevel logLevel34 = LogLevel.WARN;
                    LogHandler currentLogHandler34 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel34) <= 0) {
                        currentLogHandler34.w(x5.k(logLevel34, new StringBuilder("[Purchases] - ")), (String) purchasesFactory$createPurchases$lambda$8$$inlined$log$4.invoke());
                    }
                    break;
                case 4:
                    iArr = iArr2;
                    LogLevel logLevel35 = LogLevel.INFO;
                    LogHandler currentLogHandler35 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel35) <= 0) {
                        currentLogHandler35.i(x5.k(logLevel35, new StringBuilder("[Purchases] - ")), (String) purchasesFactory$createPurchases$lambda$8$$inlined$log$4.invoke());
                    }
                    break;
                case 5:
                    iArr = iArr2;
                    LogLevel logLevel36 = LogLevel.DEBUG;
                    LogHandler currentLogHandler36 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel36) <= 0) {
                        currentLogHandler36.d(x5.k(logLevel36, new StringBuilder("[Purchases] - ")), (String) purchasesFactory$createPurchases$lambda$8$$inlined$log$4.invoke());
                    }
                    break;
                case 6:
                    iArr = iArr2;
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesFactory$createPurchases$lambda$8$$inlined$log$4.invoke(), null);
                    break;
                case 7:
                    iArr = iArr2;
                    LogLevel logLevel37 = LogLevel.INFO;
                    LogHandler currentLogHandler37 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel37) <= 0) {
                        currentLogHandler37.i(x5.k(logLevel37, new StringBuilder("[Purchases] - ")), (String) purchasesFactory$createPurchases$lambda$8$$inlined$log$4.invoke());
                    }
                    break;
                case 8:
                    iArr = iArr2;
                    LogLevel logLevel38 = LogLevel.DEBUG;
                    LogHandler currentLogHandler38 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel38) <= 0) {
                        currentLogHandler38.d(x5.k(logLevel38, new StringBuilder("[Purchases] - ")), (String) purchasesFactory$createPurchases$lambda$8$$inlined$log$4.invoke());
                    }
                    break;
                case 9:
                    iArr = iArr2;
                    LogLevel logLevel39 = LogLevel.DEBUG;
                    LogHandler currentLogHandler39 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel39) <= 0) {
                        currentLogHandler39.d(x5.k(logLevel39, new StringBuilder("[Purchases] - ")), (String) purchasesFactory$createPurchases$lambda$8$$inlined$log$4.invoke());
                    }
                    break;
                case 10:
                    iArr = iArr2;
                    LogLevel logLevel40 = LogLevel.WARN;
                    LogHandler currentLogHandler40 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel40) <= 0) {
                        currentLogHandler40.w(x5.k(logLevel40, new StringBuilder("[Purchases] - ")), (String) purchasesFactory$createPurchases$lambda$8$$inlined$log$4.invoke());
                    }
                    break;
                case 11:
                    iArr = iArr2;
                    LogLevel logLevel41 = LogLevel.WARN;
                    LogHandler currentLogHandler41 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel41) <= 0) {
                        currentLogHandler41.w(x5.k(logLevel41, new StringBuilder("[Purchases] - ")), (String) purchasesFactory$createPurchases$lambda$8$$inlined$log$4.invoke());
                    }
                    break;
                case 12:
                    iArr = iArr2;
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesFactory$createPurchases$lambda$8$$inlined$log$4.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel42 = LogLevel.WARN;
                    LogHandler currentLogHandler42 = LogWrapperKt.getCurrentLogHandler();
                    iArr = iArr2;
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel42) <= 0) {
                        currentLogHandler42.w(x5.k(logLevel42, new StringBuilder("[Purchases] - ")), (String) purchasesFactory$createPurchases$lambda$8$$inlined$log$4.invoke());
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesFactory$createPurchases$lambda$8$$inlined$log$4.invoke(), null);
                default:
                    iArr = iArr2;
                    break;
            }
            PurchasesFactory$createPurchases$lambda$8$$inlined$log$5 purchasesFactory$createPurchases$lambda$8$$inlined$log$5 = new PurchasesFactory$createPurchases$lambda$8$$inlined$log$5(logIntent, configuration);
            switch (iArr[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel43 = LogLevel.DEBUG;
                    LogHandler currentLogHandler43 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel43) <= 0) {
                        currentLogHandler43.d(x5.k(logLevel43, new StringBuilder("[Purchases] - ")), (String) purchasesFactory$createPurchases$lambda$8$$inlined$log$5.invoke());
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesFactory$createPurchases$lambda$8$$inlined$log$5.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel44 = LogLevel.WARN;
                    LogHandler currentLogHandler44 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel44) <= 0) {
                        currentLogHandler44.w(x5.k(logLevel44, new StringBuilder("[Purchases] - ")), (String) purchasesFactory$createPurchases$lambda$8$$inlined$log$5.invoke());
                    }
                    break;
                case 4:
                    LogLevel logLevel45 = LogLevel.INFO;
                    LogHandler currentLogHandler45 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel45) <= 0) {
                        currentLogHandler45.i(x5.k(logLevel45, new StringBuilder("[Purchases] - ")), (String) purchasesFactory$createPurchases$lambda$8$$inlined$log$5.invoke());
                    }
                    break;
                case 5:
                    LogLevel logLevel46 = LogLevel.DEBUG;
                    LogHandler currentLogHandler46 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel46) <= 0) {
                        currentLogHandler46.d(x5.k(logLevel46, new StringBuilder("[Purchases] - ")), (String) purchasesFactory$createPurchases$lambda$8$$inlined$log$5.invoke());
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesFactory$createPurchases$lambda$8$$inlined$log$5.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel47 = LogLevel.INFO;
                    LogHandler currentLogHandler47 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel47) <= 0) {
                        currentLogHandler47.i(x5.k(logLevel47, new StringBuilder("[Purchases] - ")), (String) purchasesFactory$createPurchases$lambda$8$$inlined$log$5.invoke());
                    }
                    break;
                case 8:
                    LogLevel logLevel48 = LogLevel.DEBUG;
                    LogHandler currentLogHandler48 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel48) <= 0) {
                        currentLogHandler48.d(x5.k(logLevel48, new StringBuilder("[Purchases] - ")), (String) purchasesFactory$createPurchases$lambda$8$$inlined$log$5.invoke());
                    }
                    break;
                case 9:
                    LogLevel logLevel49 = LogLevel.DEBUG;
                    LogHandler currentLogHandler49 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel49) <= 0) {
                        currentLogHandler49.d(x5.k(logLevel49, new StringBuilder("[Purchases] - ")), (String) purchasesFactory$createPurchases$lambda$8$$inlined$log$5.invoke());
                    }
                    break;
                case 10:
                    LogLevel logLevel50 = LogLevel.WARN;
                    LogHandler currentLogHandler50 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel50) <= 0) {
                        currentLogHandler50.w(x5.k(logLevel50, new StringBuilder("[Purchases] - ")), (String) purchasesFactory$createPurchases$lambda$8$$inlined$log$5.invoke());
                    }
                    break;
                case 11:
                    LogLevel logLevel51 = LogLevel.WARN;
                    LogHandler currentLogHandler51 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel51) <= 0) {
                        currentLogHandler51.w(x5.k(logLevel51, new StringBuilder("[Purchases] - ")), (String) purchasesFactory$createPurchases$lambda$8$$inlined$log$5.invoke());
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesFactory$createPurchases$lambda$8$$inlined$log$5.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel52 = LogLevel.WARN;
                    LogHandler currentLogHandler52 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel52) <= 0) {
                        currentLogHandler52.w(x5.k(logLevel52, new StringBuilder("[Purchases] - ")), (String) purchasesFactory$createPurchases$lambda$8$$inlined$log$5.invoke());
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesFactory$createPurchases$lambda$8$$inlined$log$5.invoke(), null);
                    break;
            }
            VirtualCurrencyManager virtualCurrencyManager = new VirtualCurrencyManager(identityManager, deviceCache3, backend5, appConfig3);
            PurchaseParamsValidator purchaseParamsValidator = new PurchaseParamsValidator();
            EventsManager.Companion companion2 = EventsManager.INSTANCE;
            EventsFileHelper<PaywallStoredEvent> eventsFileHelperPaywalls = companion2.paywalls(new FileHelper(application));
            EventsFileHelper<BackendStoredEvent> eventsFileHelperBackendEvents = companion2.backendEvents(new FileHelper(application));
            AppConfig.Companion companion3 = AppConfig.INSTANCE;
            return new Purchases(new PurchasesOrchestrator(application, configuration.getAppUserID(), backend5, billingAbstract2, deviceCache3, identityManager, subscriberAttributesManager, appConfig3, customerInfoHelper, customerInfoUpdateHandler, diagnosticsSynchronizer2, diagnosticsTracker7, null, offlineEntitlementsManager, postReceiptHelper, postTransactionWithProductDetailsHelper, postPendingTransactionsHelper, syncPurchasesHelper, offeringsManager, createEventsManager(identityManager, dispatcher7, backend5, eventsFileHelperPaywalls, eventsFileHelperBackendEvents, companion3.getPaywallEventsURL()), createEventsManager(identityManager, dispatcher7, backend5, null, companion2.adEvents(new FileHelper(application)), companion3.getAdEventsURL()), paywallPresentedCache, purchasesStateCache, null, dispatcher3, configuration, fontLoader, defaultLocaleProvider, null, virtualCurrencyManager, purchaseParamsValidator, null, null, null, null, null, -1870655488, 15, null));
        } catch (IllegalStateException e2) {
            if (k.s(configuration.getContext())) {
                throw e2;
            }
            throw new IllegalStateException("Trying to configure Purchases while the device is locked. If you need to support this scenario, ensure you *always* configure Purchases with a Context created with `createDeviceProtectedStorageContext()` to avoid undefined behavior.\nSee https://developer.android.com/reference/android/content/Context#createDeviceProtectedStorageContext() for more info.", e2);
        }
    }

    public final APIKeyValidator.ValidationResult validateConfiguration(PurchasesConfiguration configuration) {
        m.e(configuration, "configuration");
        if (!hasPermission(configuration.getContext(), "android.permission.INTERNET")) {
            throw new IllegalArgumentException("Purchases requires INTERNET permission.");
        }
        if (r30.k.L0(configuration.getApiKey())) {
            throw new IllegalArgumentException("API key must be set. Get this from the RevenueCat web app");
        }
        APIKeyValidator.ValidationResult validationResultValidateAndLog = this.apiKeyValidator.validateAndLog(configuration.getApiKey(), configuration.getStore());
        if (this.isDebugBuild.invoke() || validationResultValidateAndLog != APIKeyValidator.ValidationResult.SIMULATED_STORE || configuration.getDangerousSettings().getUiPreviewMode()) {
            if (configuration.getContext().getApplicationContext() instanceof Application) {
                return validationResultValidateAndLog;
            }
            throw new IllegalArgumentException("Needs an application context.");
        }
        String strRedactApiKey = this.apiKeyValidator.redactApiKey(configuration.getApiKey());
        LogUtilsKt.errorLog(new PurchasesError(PurchasesErrorCode.ConfigurationError, a1.b.p("Test Store API key used in release build: ", strRedactApiKey, ". Please configure the Play Store/Amazon app on the RevenueCat dashboard and use its corresponding API key before releasing. Visit https://rev.cat/sdk-test-store to learn more.")));
        SimulatedStoreErrorDialogActivity.INSTANCE.show(configuration.getContext(), strRedactApiKey);
        return validationResultValidateAndLog;
    }
}
