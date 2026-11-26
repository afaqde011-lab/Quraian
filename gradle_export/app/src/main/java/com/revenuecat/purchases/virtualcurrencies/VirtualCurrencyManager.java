package com.revenuecat.purchases.virtualcurrencies;

import com.google.android.gms.internal.measurement.x5;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.AppConfig;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.identity.IdentityManager;
import com.revenuecat.purchases.interfaces.GetVirtualCurrenciesCallback;
import g00.b0;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import u00.k;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0016\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\r\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\r\u0010\u001fJ\u000f\u0010 \u001a\u0004\u0018\u00010\f¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u0010¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010'¨\u0006("}, d2 = {"Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrencyManager;", "", "Lcom/revenuecat/purchases/identity/IdentityManager;", "identityManager", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "deviceCache", "Lcom/revenuecat/purchases/common/Backend;", "backend", "Lcom/revenuecat/purchases/common/AppConfig;", "appConfig", "<init>", "(Lcom/revenuecat/purchases/identity/IdentityManager;Lcom/revenuecat/purchases/common/caching/DeviceCache;Lcom/revenuecat/purchases/common/Backend;Lcom/revenuecat/purchases/common/AppConfig;)V", "Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrencies;", "virtualCurrencies", "", "appUserID", "Lg00/b0;", "cacheVirtualCurrencies", "(Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrencies;Ljava/lang/String;)V", "", "isAppBackgrounded", "allowStaleCache", "fetchCachedVirtualCurrencies", "(Ljava/lang/String;ZZ)Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrencies;", "Lcom/revenuecat/purchases/interfaces/GetVirtualCurrenciesCallback;", "callback", "fetchVirtualCurrenciesFromBackend", "(Ljava/lang/String;ZLcom/revenuecat/purchases/interfaces/GetVirtualCurrenciesCallback;)V", "completion", "handleVirtualCurrenciesRequestResult", "(Lcom/revenuecat/purchases/interfaces/GetVirtualCurrenciesCallback;Ljava/lang/String;)Lcom/revenuecat/purchases/interfaces/GetVirtualCurrenciesCallback;", "(Lcom/revenuecat/purchases/interfaces/GetVirtualCurrenciesCallback;)V", "cachedVirtualCurrencies", "()Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrencies;", "invalidateVirtualCurrenciesCache", "()V", "Lcom/revenuecat/purchases/identity/IdentityManager;", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "Lcom/revenuecat/purchases/common/Backend;", "Lcom/revenuecat/purchases/common/AppConfig;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class VirtualCurrencyManager {
    private final AppConfig appConfig;
    private final Backend backend;
    private final DeviceCache deviceCache;
    private final IdentityManager identityManager;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrencies;", "it", "Lg00/b0;", "invoke", "(Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrencies;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass1 extends n implements k {
        final GetVirtualCurrenciesCallback $callback;

        public AnonymousClass1(GetVirtualCurrenciesCallback getVirtualCurrenciesCallback) {
            super(1);
            this.$callback = getVirtualCurrenciesCallback;
        }

        @Override
        public Object invoke(Object obj) {
            invoke((VirtualCurrencies) obj);
            return b0.a;
        }

        public final void invoke(VirtualCurrencies it) {
            m.e(it, "it");
            this.$callback.onReceived(it);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "it", "Lg00/b0;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass2 extends n implements k {
        final GetVirtualCurrenciesCallback $callback;

        public AnonymousClass2(GetVirtualCurrenciesCallback getVirtualCurrenciesCallback) {
            super(1);
            this.$callback = getVirtualCurrenciesCallback;
        }

        @Override
        public Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return b0.a;
        }

        public final void invoke(PurchasesError it) {
            m.e(it, "it");
            this.$callback.onError(it);
        }
    }

    public VirtualCurrencyManager(IdentityManager identityManager, DeviceCache deviceCache, Backend backend, AppConfig appConfig) {
        m.e(identityManager, "identityManager");
        m.e(deviceCache, "deviceCache");
        m.e(backend, "backend");
        m.e(appConfig, "appConfig");
        this.identityManager = identityManager;
        this.deviceCache = deviceCache;
        this.backend = backend;
        this.appConfig = appConfig;
    }

    public final void cacheVirtualCurrencies(VirtualCurrencies virtualCurrencies, String appUserID) {
        this.deviceCache.cacheVirtualCurrencies$purchases_defaultsBc8Release(appUserID, virtualCurrencies);
    }

    private final VirtualCurrencies fetchCachedVirtualCurrencies(String appUserID, boolean isAppBackgrounded, boolean allowStaleCache) {
        if (!allowStaleCache && this.deviceCache.isVirtualCurrenciesCacheStale$purchases_defaultsBc8Release(appUserID, isAppBackgrounded)) {
            return null;
        }
        VirtualCurrencies cachedVirtualCurrencies$purchases_defaultsBc8Release = this.deviceCache.getCachedVirtualCurrencies$purchases_defaultsBc8Release(appUserID);
        if (cachedVirtualCurrencies$purchases_defaultsBc8Release == null) {
            LogIntent logIntent = LogIntent.DEBUG;
            VirtualCurrencyManager$fetchCachedVirtualCurrencies$$inlined$log$1 virtualCurrencyManager$fetchCachedVirtualCurrencies$$inlined$log$1 = new VirtualCurrencyManager$fetchCachedVirtualCurrencies$$inlined$log$1(logIntent);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        currentLogHandler.d(x5.k(logLevel, new StringBuilder("[Purchases] - ")), (String) virtualCurrencyManager$fetchCachedVirtualCurrencies$$inlined$log$1.invoke());
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) virtualCurrencyManager$fetchCachedVirtualCurrencies$$inlined$log$1.invoke(), null);
                    return cachedVirtualCurrencies$purchases_defaultsBc8Release;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w(x5.k(logLevel2, new StringBuilder("[Purchases] - ")), (String) virtualCurrencyManager$fetchCachedVirtualCurrencies$$inlined$log$1.invoke());
                        return cachedVirtualCurrencies$purchases_defaultsBc8Release;
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i(x5.k(logLevel3, new StringBuilder("[Purchases] - ")), (String) virtualCurrencyManager$fetchCachedVirtualCurrencies$$inlined$log$1.invoke());
                        return cachedVirtualCurrencies$purchases_defaultsBc8Release;
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        currentLogHandler4.d(x5.k(logLevel4, new StringBuilder("[Purchases] - ")), (String) virtualCurrencyManager$fetchCachedVirtualCurrencies$$inlined$log$1.invoke());
                        return cachedVirtualCurrencies$purchases_defaultsBc8Release;
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) virtualCurrencyManager$fetchCachedVirtualCurrencies$$inlined$log$1.invoke(), null);
                    return cachedVirtualCurrencies$purchases_defaultsBc8Release;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler5.i(x5.k(logLevel5, new StringBuilder("[Purchases] - ")), (String) virtualCurrencyManager$fetchCachedVirtualCurrencies$$inlined$log$1.invoke());
                        return cachedVirtualCurrencies$purchases_defaultsBc8Release;
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        currentLogHandler6.d(x5.k(logLevel6, new StringBuilder("[Purchases] - ")), (String) virtualCurrencyManager$fetchCachedVirtualCurrencies$$inlined$log$1.invoke());
                        return cachedVirtualCurrencies$purchases_defaultsBc8Release;
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        currentLogHandler7.d(x5.k(logLevel7, new StringBuilder("[Purchases] - ")), (String) virtualCurrencyManager$fetchCachedVirtualCurrencies$$inlined$log$1.invoke());
                        return cachedVirtualCurrencies$purchases_defaultsBc8Release;
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler8.w(x5.k(logLevel8, new StringBuilder("[Purchases] - ")), (String) virtualCurrencyManager$fetchCachedVirtualCurrencies$$inlined$log$1.invoke());
                        return cachedVirtualCurrencies$purchases_defaultsBc8Release;
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler9.w(x5.k(logLevel9, new StringBuilder("[Purchases] - ")), (String) virtualCurrencyManager$fetchCachedVirtualCurrencies$$inlined$log$1.invoke());
                        return cachedVirtualCurrencies$purchases_defaultsBc8Release;
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) virtualCurrencyManager$fetchCachedVirtualCurrencies$$inlined$log$1.invoke(), null);
                    return cachedVirtualCurrencies$purchases_defaultsBc8Release;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler10.w(x5.k(logLevel10, new StringBuilder("[Purchases] - ")), (String) virtualCurrencyManager$fetchCachedVirtualCurrencies$$inlined$log$1.invoke());
                        return cachedVirtualCurrencies$purchases_defaultsBc8Release;
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) virtualCurrencyManager$fetchCachedVirtualCurrencies$$inlined$log$1.invoke(), null);
                    return cachedVirtualCurrencies$purchases_defaultsBc8Release;
            }
        }
        return cachedVirtualCurrencies$purchases_defaultsBc8Release;
    }

    private final void fetchVirtualCurrenciesFromBackend(String appUserID, boolean isAppBackgrounded, GetVirtualCurrenciesCallback callback) throws Throwable {
        this.backend.getVirtualCurrencies(appUserID, isAppBackgrounded, new AnonymousClass1(callback), new AnonymousClass2(callback));
    }

    private final GetVirtualCurrenciesCallback handleVirtualCurrenciesRequestResult(final GetVirtualCurrenciesCallback completion, final String appUserID) {
        return new GetVirtualCurrenciesCallback() {
            @Override
            public void onError(PurchasesError error) {
                LogHandler currentLogHandler;
                String strK;
                String str;
                m.e(error, "error");
                LogIntent logIntent = LogIntent.RC_ERROR;
                VirtualCurrencyManager$handleVirtualCurrenciesRequestResult$1$onError$$inlined$log$1 virtualCurrencyManager$handleVirtualCurrenciesRequestResult$1$onError$$inlined$log$1 = new VirtualCurrencyManager$handleVirtualCurrenciesRequestResult$1$onError$$inlined$log$1(logIntent, error);
                switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                    case 1:
                        LogLevel logLevel = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                            strK = x5.k(logLevel, new StringBuilder("[Purchases] - "));
                            str = (String) virtualCurrencyManager$handleVirtualCurrenciesRequestResult$1$onError$$inlined$log$1.invoke();
                            currentLogHandler.d(strK, str);
                        }
                        break;
                    case 2:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) virtualCurrencyManager$handleVirtualCurrenciesRequestResult$1$onError$$inlined$log$1.invoke(), null);
                        break;
                    case 3:
                        LogLevel logLevel2 = LogLevel.WARN;
                        LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                            currentLogHandler2.w(x5.k(logLevel2, new StringBuilder("[Purchases] - ")), (String) virtualCurrencyManager$handleVirtualCurrenciesRequestResult$1$onError$$inlined$log$1.invoke());
                        }
                        break;
                    case 4:
                        LogLevel logLevel3 = LogLevel.INFO;
                        LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                            currentLogHandler3.i(x5.k(logLevel3, new StringBuilder("[Purchases] - ")), (String) virtualCurrencyManager$handleVirtualCurrenciesRequestResult$1$onError$$inlined$log$1.invoke());
                        }
                        break;
                    case 5:
                        LogLevel logLevel4 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                            strK = x5.k(logLevel4, new StringBuilder("[Purchases] - "));
                            str = (String) virtualCurrencyManager$handleVirtualCurrenciesRequestResult$1$onError$$inlined$log$1.invoke();
                            currentLogHandler.d(strK, str);
                        }
                        break;
                    case 6:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) virtualCurrencyManager$handleVirtualCurrenciesRequestResult$1$onError$$inlined$log$1.invoke(), null);
                        break;
                    case 7:
                        LogLevel logLevel5 = LogLevel.INFO;
                        LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                            currentLogHandler4.i(x5.k(logLevel5, new StringBuilder("[Purchases] - ")), (String) virtualCurrencyManager$handleVirtualCurrenciesRequestResult$1$onError$$inlined$log$1.invoke());
                        }
                        break;
                    case 8:
                        LogLevel logLevel6 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                            strK = x5.k(logLevel6, new StringBuilder("[Purchases] - "));
                            str = (String) virtualCurrencyManager$handleVirtualCurrenciesRequestResult$1$onError$$inlined$log$1.invoke();
                            currentLogHandler.d(strK, str);
                        }
                        break;
                    case 9:
                        LogLevel logLevel7 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                            strK = x5.k(logLevel7, new StringBuilder("[Purchases] - "));
                            str = (String) virtualCurrencyManager$handleVirtualCurrenciesRequestResult$1$onError$$inlined$log$1.invoke();
                            currentLogHandler.d(strK, str);
                        }
                        break;
                    case 10:
                        LogLevel logLevel8 = LogLevel.WARN;
                        LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                            currentLogHandler5.w(x5.k(logLevel8, new StringBuilder("[Purchases] - ")), (String) virtualCurrencyManager$handleVirtualCurrenciesRequestResult$1$onError$$inlined$log$1.invoke());
                        }
                        break;
                    case 11:
                        LogLevel logLevel9 = LogLevel.WARN;
                        LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                            currentLogHandler6.w(x5.k(logLevel9, new StringBuilder("[Purchases] - ")), (String) virtualCurrencyManager$handleVirtualCurrenciesRequestResult$1$onError$$inlined$log$1.invoke());
                        }
                        break;
                    case 12:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) virtualCurrencyManager$handleVirtualCurrenciesRequestResult$1$onError$$inlined$log$1.invoke(), null);
                        break;
                    case 13:
                        LogLevel logLevel10 = LogLevel.WARN;
                        LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                            currentLogHandler7.w(x5.k(logLevel10, new StringBuilder("[Purchases] - ")), (String) virtualCurrencyManager$handleVirtualCurrenciesRequestResult$1$onError$$inlined$log$1.invoke());
                        }
                        break;
                    case 14:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) virtualCurrencyManager$handleVirtualCurrenciesRequestResult$1$onError$$inlined$log$1.invoke(), null);
                        break;
                }
                completion.onError(error);
            }

            @Override
            public void onReceived(VirtualCurrencies virtualCurrencies) {
                LogHandler currentLogHandler;
                String strK;
                String str;
                m.e(virtualCurrencies, "virtualCurrencies");
                LogIntent logIntent = LogIntent.RC_SUCCESS;
                VirtualCurrencyManager$handleVirtualCurrenciesRequestResult$1$onReceived$$inlined$log$1 virtualCurrencyManager$handleVirtualCurrenciesRequestResult$1$onReceived$$inlined$log$1 = new VirtualCurrencyManager$handleVirtualCurrenciesRequestResult$1$onReceived$$inlined$log$1(logIntent);
                switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                    case 1:
                        LogLevel logLevel = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                            strK = x5.k(logLevel, new StringBuilder("[Purchases] - "));
                            str = (String) virtualCurrencyManager$handleVirtualCurrenciesRequestResult$1$onReceived$$inlined$log$1.invoke();
                            currentLogHandler.d(strK, str);
                        }
                        break;
                    case 2:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) virtualCurrencyManager$handleVirtualCurrenciesRequestResult$1$onReceived$$inlined$log$1.invoke(), null);
                        break;
                    case 3:
                        LogLevel logLevel2 = LogLevel.WARN;
                        LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                            currentLogHandler2.w(x5.k(logLevel2, new StringBuilder("[Purchases] - ")), (String) virtualCurrencyManager$handleVirtualCurrenciesRequestResult$1$onReceived$$inlined$log$1.invoke());
                        }
                        break;
                    case 4:
                        LogLevel logLevel3 = LogLevel.INFO;
                        LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                            currentLogHandler3.i(x5.k(logLevel3, new StringBuilder("[Purchases] - ")), (String) virtualCurrencyManager$handleVirtualCurrenciesRequestResult$1$onReceived$$inlined$log$1.invoke());
                        }
                        break;
                    case 5:
                        LogLevel logLevel4 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                            strK = x5.k(logLevel4, new StringBuilder("[Purchases] - "));
                            str = (String) virtualCurrencyManager$handleVirtualCurrenciesRequestResult$1$onReceived$$inlined$log$1.invoke();
                            currentLogHandler.d(strK, str);
                        }
                        break;
                    case 6:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) virtualCurrencyManager$handleVirtualCurrenciesRequestResult$1$onReceived$$inlined$log$1.invoke(), null);
                        break;
                    case 7:
                        LogLevel logLevel5 = LogLevel.INFO;
                        LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                            currentLogHandler4.i(x5.k(logLevel5, new StringBuilder("[Purchases] - ")), (String) virtualCurrencyManager$handleVirtualCurrenciesRequestResult$1$onReceived$$inlined$log$1.invoke());
                        }
                        break;
                    case 8:
                        LogLevel logLevel6 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                            strK = x5.k(logLevel6, new StringBuilder("[Purchases] - "));
                            str = (String) virtualCurrencyManager$handleVirtualCurrenciesRequestResult$1$onReceived$$inlined$log$1.invoke();
                            currentLogHandler.d(strK, str);
                        }
                        break;
                    case 9:
                        LogLevel logLevel7 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                            strK = x5.k(logLevel7, new StringBuilder("[Purchases] - "));
                            str = (String) virtualCurrencyManager$handleVirtualCurrenciesRequestResult$1$onReceived$$inlined$log$1.invoke();
                            currentLogHandler.d(strK, str);
                        }
                        break;
                    case 10:
                        LogLevel logLevel8 = LogLevel.WARN;
                        LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                            currentLogHandler5.w(x5.k(logLevel8, new StringBuilder("[Purchases] - ")), (String) virtualCurrencyManager$handleVirtualCurrenciesRequestResult$1$onReceived$$inlined$log$1.invoke());
                        }
                        break;
                    case 11:
                        LogLevel logLevel9 = LogLevel.WARN;
                        LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                            currentLogHandler6.w(x5.k(logLevel9, new StringBuilder("[Purchases] - ")), (String) virtualCurrencyManager$handleVirtualCurrenciesRequestResult$1$onReceived$$inlined$log$1.invoke());
                        }
                        break;
                    case 12:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) virtualCurrencyManager$handleVirtualCurrenciesRequestResult$1$onReceived$$inlined$log$1.invoke(), null);
                        break;
                    case 13:
                        LogLevel logLevel10 = LogLevel.WARN;
                        LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                            currentLogHandler7.w(x5.k(logLevel10, new StringBuilder("[Purchases] - ")), (String) virtualCurrencyManager$handleVirtualCurrenciesRequestResult$1$onReceived$$inlined$log$1.invoke());
                        }
                        break;
                    case 14:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) virtualCurrencyManager$handleVirtualCurrenciesRequestResult$1$onReceived$$inlined$log$1.invoke(), null);
                        break;
                }
                VirtualCurrencyManager.this.cacheVirtualCurrencies(virtualCurrencies, appUserID);
                completion.onReceived(virtualCurrencies);
            }
        };
    }

    public final synchronized VirtualCurrencies cachedVirtualCurrencies() {
        VirtualCurrencies virtualCurrenciesFetchCachedVirtualCurrencies;
        LogHandler currentLogHandler;
        String str;
        String str2;
        try {
            virtualCurrenciesFetchCachedVirtualCurrencies = fetchCachedVirtualCurrencies(this.identityManager.getCurrentAppUserID(), this.appConfig.isAppBackgrounded(), true);
            if (virtualCurrenciesFetchCachedVirtualCurrencies != null) {
                LogIntent logIntent = LogIntent.DEBUG;
                VirtualCurrencyManager$cachedVirtualCurrencies$$inlined$log$1 virtualCurrencyManager$cachedVirtualCurrencies$$inlined$log$1 = new VirtualCurrencyManager$cachedVirtualCurrencies$$inlined$log$1(logIntent);
                switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                    case 1:
                        LogLevel logLevel = LogLevel.DEBUG;
                        LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                            currentLogHandler2.d("[Purchases] - " + logLevel.name(), (String) virtualCurrencyManager$cachedVirtualCurrencies$$inlined$log$1.invoke());
                        }
                        break;
                    case 2:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) virtualCurrencyManager$cachedVirtualCurrencies$$inlined$log$1.invoke(), null);
                        break;
                    case 3:
                        LogLevel logLevel2 = LogLevel.WARN;
                        LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                            currentLogHandler3.w("[Purchases] - " + logLevel2.name(), (String) virtualCurrencyManager$cachedVirtualCurrencies$$inlined$log$1.invoke());
                        }
                        break;
                    case 4:
                        LogLevel logLevel3 = LogLevel.INFO;
                        LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                            currentLogHandler4.i("[Purchases] - " + logLevel3.name(), (String) virtualCurrencyManager$cachedVirtualCurrencies$$inlined$log$1.invoke());
                        }
                        break;
                    case 5:
                        LogLevel logLevel4 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                            str = "[Purchases] - " + logLevel4.name();
                            str2 = (String) virtualCurrencyManager$cachedVirtualCurrencies$$inlined$log$1.invoke();
                            currentLogHandler.d(str, str2);
                        }
                        break;
                    case 6:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) virtualCurrencyManager$cachedVirtualCurrencies$$inlined$log$1.invoke(), null);
                        break;
                    case 7:
                        LogLevel logLevel5 = LogLevel.INFO;
                        LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                            currentLogHandler5.i("[Purchases] - " + logLevel5.name(), (String) virtualCurrencyManager$cachedVirtualCurrencies$$inlined$log$1.invoke());
                        }
                        break;
                    case 8:
                        LogLevel logLevel6 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                            str = "[Purchases] - " + logLevel6.name();
                            str2 = (String) virtualCurrencyManager$cachedVirtualCurrencies$$inlined$log$1.invoke();
                            currentLogHandler.d(str, str2);
                        }
                        break;
                    case 9:
                        LogLevel logLevel7 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                            str = "[Purchases] - " + logLevel7.name();
                            str2 = (String) virtualCurrencyManager$cachedVirtualCurrencies$$inlined$log$1.invoke();
                            currentLogHandler.d(str, str2);
                        }
                        break;
                    case 10:
                        LogLevel logLevel8 = LogLevel.WARN;
                        LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                            currentLogHandler6.w("[Purchases] - " + logLevel8.name(), (String) virtualCurrencyManager$cachedVirtualCurrencies$$inlined$log$1.invoke());
                        }
                        break;
                    case 11:
                        LogLevel logLevel9 = LogLevel.WARN;
                        LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                            currentLogHandler7.w("[Purchases] - " + logLevel9.name(), (String) virtualCurrencyManager$cachedVirtualCurrencies$$inlined$log$1.invoke());
                        }
                        break;
                    case 12:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) virtualCurrencyManager$cachedVirtualCurrencies$$inlined$log$1.invoke(), null);
                        break;
                    case 13:
                        LogLevel logLevel10 = LogLevel.WARN;
                        LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                            currentLogHandler8.w("[Purchases] - " + logLevel10.name(), (String) virtualCurrencyManager$cachedVirtualCurrencies$$inlined$log$1.invoke());
                        }
                        break;
                    case 14:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) virtualCurrencyManager$cachedVirtualCurrencies$$inlined$log$1.invoke(), null);
                        break;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return virtualCurrenciesFetchCachedVirtualCurrencies;
    }

    public final synchronized void invalidateVirtualCurrenciesCache() {
        LogHandler currentLogHandler;
        String str;
        String str2;
        try {
            String currentAppUserID = this.identityManager.getCurrentAppUserID();
            LogIntent logIntent = LogIntent.DEBUG;
            VirtualCurrencyManager$invalidateVirtualCurrenciesCache$$inlined$log$1 virtualCurrencyManager$invalidateVirtualCurrenciesCache$$inlined$log$1 = new VirtualCurrencyManager$invalidateVirtualCurrenciesCache$$inlined$log$1(logIntent);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        currentLogHandler2.d("[Purchases] - " + logLevel.name(), (String) virtualCurrencyManager$invalidateVirtualCurrenciesCache$$inlined$log$1.invoke());
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) virtualCurrencyManager$invalidateVirtualCurrenciesCache$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler3.w("[Purchases] - " + logLevel2.name(), (String) virtualCurrencyManager$invalidateVirtualCurrenciesCache$$inlined$log$1.invoke());
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler4.i("[Purchases] - " + logLevel3.name(), (String) virtualCurrencyManager$invalidateVirtualCurrenciesCache$$inlined$log$1.invoke());
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        str = "[Purchases] - " + logLevel4.name();
                        str2 = (String) virtualCurrencyManager$invalidateVirtualCurrenciesCache$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) virtualCurrencyManager$invalidateVirtualCurrenciesCache$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler5.i("[Purchases] - " + logLevel5.name(), (String) virtualCurrencyManager$invalidateVirtualCurrenciesCache$$inlined$log$1.invoke());
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        str = "[Purchases] - " + logLevel6.name();
                        str2 = (String) virtualCurrencyManager$invalidateVirtualCurrenciesCache$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        str = "[Purchases] - " + logLevel7.name();
                        str2 = (String) virtualCurrencyManager$invalidateVirtualCurrenciesCache$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler6.w("[Purchases] - " + logLevel8.name(), (String) virtualCurrencyManager$invalidateVirtualCurrenciesCache$$inlined$log$1.invoke());
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler7.w("[Purchases] - " + logLevel9.name(), (String) virtualCurrencyManager$invalidateVirtualCurrenciesCache$$inlined$log$1.invoke());
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) virtualCurrencyManager$invalidateVirtualCurrenciesCache$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler8.w("[Purchases] - " + logLevel10.name(), (String) virtualCurrencyManager$invalidateVirtualCurrenciesCache$$inlined$log$1.invoke());
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) virtualCurrencyManager$invalidateVirtualCurrenciesCache$$inlined$log$1.invoke(), null);
                    break;
            }
            this.deviceCache.clearVirtualCurrenciesCache$purchases_defaultsBc8Release(currentAppUserID);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void virtualCurrencies(GetVirtualCurrenciesCallback callback) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        try {
            m.e(callback, "callback");
            String currentAppUserID = this.identityManager.getCurrentAppUserID();
            boolean zIsAppBackgrounded = this.appConfig.isAppBackgrounded();
            VirtualCurrencies virtualCurrenciesFetchCachedVirtualCurrencies = fetchCachedVirtualCurrencies(currentAppUserID, zIsAppBackgrounded, false);
            if (virtualCurrenciesFetchCachedVirtualCurrencies == null) {
                LogIntent logIntent = LogIntent.DEBUG;
                VirtualCurrencyManager$virtualCurrencies$$inlined$log$2 virtualCurrencyManager$virtualCurrencies$$inlined$log$2 = new VirtualCurrencyManager$virtualCurrencies$$inlined$log$2(logIntent);
                switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                    case 1:
                        LogLevel logLevel = LogLevel.DEBUG;
                        LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                            currentLogHandler2.d("[Purchases] - " + logLevel.name(), (String) virtualCurrencyManager$virtualCurrencies$$inlined$log$2.invoke());
                        }
                        break;
                    case 2:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) virtualCurrencyManager$virtualCurrencies$$inlined$log$2.invoke(), null);
                        break;
                    case 3:
                        LogLevel logLevel2 = LogLevel.WARN;
                        LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                            currentLogHandler3.w("[Purchases] - " + logLevel2.name(), (String) virtualCurrencyManager$virtualCurrencies$$inlined$log$2.invoke());
                        }
                        break;
                    case 4:
                        LogLevel logLevel3 = LogLevel.INFO;
                        LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                            currentLogHandler4.i("[Purchases] - " + logLevel3.name(), (String) virtualCurrencyManager$virtualCurrencies$$inlined$log$2.invoke());
                        }
                        break;
                    case 5:
                        LogLevel logLevel4 = LogLevel.DEBUG;
                        LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                            currentLogHandler5.d("[Purchases] - " + logLevel4.name(), (String) virtualCurrencyManager$virtualCurrencies$$inlined$log$2.invoke());
                        }
                        break;
                    case 6:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) virtualCurrencyManager$virtualCurrencies$$inlined$log$2.invoke(), null);
                        break;
                    case 7:
                        LogLevel logLevel5 = LogLevel.INFO;
                        LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                            currentLogHandler6.i("[Purchases] - " + logLevel5.name(), (String) virtualCurrencyManager$virtualCurrencies$$inlined$log$2.invoke());
                        }
                        break;
                    case 8:
                        LogLevel logLevel6 = LogLevel.DEBUG;
                        LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                            currentLogHandler7.d("[Purchases] - " + logLevel6.name(), (String) virtualCurrencyManager$virtualCurrencies$$inlined$log$2.invoke());
                        }
                        break;
                    case 9:
                        LogLevel logLevel7 = LogLevel.DEBUG;
                        LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                            currentLogHandler8.d("[Purchases] - " + logLevel7.name(), (String) virtualCurrencyManager$virtualCurrencies$$inlined$log$2.invoke());
                        }
                        break;
                    case 10:
                        LogLevel logLevel8 = LogLevel.WARN;
                        LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                            currentLogHandler9.w("[Purchases] - " + logLevel8.name(), (String) virtualCurrencyManager$virtualCurrencies$$inlined$log$2.invoke());
                        }
                        break;
                    case 11:
                        LogLevel logLevel9 = LogLevel.WARN;
                        LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                            currentLogHandler10.w("[Purchases] - " + logLevel9.name(), (String) virtualCurrencyManager$virtualCurrencies$$inlined$log$2.invoke());
                        }
                        break;
                    case 12:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) virtualCurrencyManager$virtualCurrencies$$inlined$log$2.invoke(), null);
                        break;
                    case 13:
                        LogLevel logLevel10 = LogLevel.WARN;
                        LogHandler currentLogHandler11 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                            currentLogHandler11.w("[Purchases] - " + logLevel10.name(), (String) virtualCurrencyManager$virtualCurrencies$$inlined$log$2.invoke());
                        }
                        break;
                    case 14:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) virtualCurrencyManager$virtualCurrencies$$inlined$log$2.invoke(), null);
                        break;
                }
                fetchVirtualCurrenciesFromBackend(currentAppUserID, zIsAppBackgrounded, handleVirtualCurrenciesRequestResult(callback, currentAppUserID));
                return;
            }
            LogIntent logIntent2 = LogIntent.DEBUG;
            VirtualCurrencyManager$virtualCurrencies$$inlined$log$1 virtualCurrencyManager$virtualCurrencies$$inlined$log$1 = new VirtualCurrencyManager$virtualCurrencies$$inlined$log$1(logIntent2);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent2.ordinal()]) {
                case 1:
                    LogLevel logLevel11 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel11) <= 0) {
                        str = "[Purchases] - " + logLevel11.name();
                        str2 = (String) virtualCurrencyManager$virtualCurrencies$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) virtualCurrencyManager$virtualCurrencies$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel12 = LogLevel.WARN;
                    LogHandler currentLogHandler12 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel12) <= 0) {
                        currentLogHandler12.w("[Purchases] - " + logLevel12.name(), (String) virtualCurrencyManager$virtualCurrencies$$inlined$log$1.invoke());
                    }
                    break;
                case 4:
                    LogLevel logLevel13 = LogLevel.INFO;
                    LogHandler currentLogHandler13 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel13) <= 0) {
                        currentLogHandler13.i("[Purchases] - " + logLevel13.name(), (String) virtualCurrencyManager$virtualCurrencies$$inlined$log$1.invoke());
                    }
                    break;
                case 5:
                    LogLevel logLevel14 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel14) <= 0) {
                        str = "[Purchases] - " + logLevel14.name();
                        str2 = (String) virtualCurrencyManager$virtualCurrencies$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) virtualCurrencyManager$virtualCurrencies$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel15 = LogLevel.INFO;
                    LogHandler currentLogHandler14 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel15) <= 0) {
                        currentLogHandler14.i("[Purchases] - " + logLevel15.name(), (String) virtualCurrencyManager$virtualCurrencies$$inlined$log$1.invoke());
                    }
                    break;
                case 8:
                    LogLevel logLevel16 = LogLevel.DEBUG;
                    LogHandler currentLogHandler15 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel16) <= 0) {
                        currentLogHandler15.d("[Purchases] - " + logLevel16.name(), (String) virtualCurrencyManager$virtualCurrencies$$inlined$log$1.invoke());
                    }
                    break;
                case 9:
                    LogLevel logLevel17 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel17) <= 0) {
                        str = "[Purchases] - " + logLevel17.name();
                        str2 = (String) virtualCurrencyManager$virtualCurrencies$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 10:
                    LogLevel logLevel18 = LogLevel.WARN;
                    LogHandler currentLogHandler16 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel18) <= 0) {
                        currentLogHandler16.w("[Purchases] - " + logLevel18.name(), (String) virtualCurrencyManager$virtualCurrencies$$inlined$log$1.invoke());
                    }
                    break;
                case 11:
                    LogLevel logLevel19 = LogLevel.WARN;
                    LogHandler currentLogHandler17 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel19) <= 0) {
                        currentLogHandler17.w("[Purchases] - " + logLevel19.name(), (String) virtualCurrencyManager$virtualCurrencies$$inlined$log$1.invoke());
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) virtualCurrencyManager$virtualCurrencies$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel20 = LogLevel.WARN;
                    LogHandler currentLogHandler18 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel20) <= 0) {
                        currentLogHandler18.w("[Purchases] - " + logLevel20.name(), (String) virtualCurrencyManager$virtualCurrencies$$inlined$log$1.invoke());
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) virtualCurrencyManager$virtualCurrencies$$inlined$log$1.invoke(), null);
                    break;
            }
            callback.onReceived(virtualCurrenciesFetchCachedVirtualCurrencies);
        } catch (Throwable th) {
            throw th;
        }
    }
}
