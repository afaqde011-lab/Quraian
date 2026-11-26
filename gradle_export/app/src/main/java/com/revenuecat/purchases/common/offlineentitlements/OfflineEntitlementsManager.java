package com.revenuecat.purchases.common.offlineentitlements;

import com.google.android.gms.internal.measurement.x5;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.Store;
import com.revenuecat.purchases.common.AppConfig;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.strings.OfflineEntitlementsStrings;
import g00.b0;
import g00.k;
import h00.q;
import h00.x;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import va.a;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010%\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e¢\u0006\u0004\b\u0019\u0010\u001aJ=\u0010 \u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00152\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00110\u001b2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00110\u001b¢\u0006\u0004\b \u0010!J'\u0010#\u001a\u00020\u00112\u0018\b\u0002\u0010\"\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001b¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010(R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010)R\"\u0010+\u001a\u0004\u0018\u00010\u001c2\b\u0010*\u001a\u0004\u0018\u00010\u001c8B@BX\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,RN\u00101\u001a<\u0012\u0004\u0012\u00020\u0015\u00122\u00120\u0012,\u0012*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00110\u001b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00110\u001b0/j\u0002`00.0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0013\u00105\u001a\u0004\u0018\u00010\u001c8F¢\u0006\u0006\u001a\u0004\b3\u00104¨\u00066"}, d2 = {"Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;", "", "Lcom/revenuecat/purchases/common/Backend;", "backend", "Lcom/revenuecat/purchases/common/offlineentitlements/OfflineCustomerInfoCalculator;", "offlineCustomerInfoCalculator", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "deviceCache", "Lcom/revenuecat/purchases/common/AppConfig;", "appConfig", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "diagnosticsTracker", "<init>", "(Lcom/revenuecat/purchases/common/Backend;Lcom/revenuecat/purchases/common/offlineentitlements/OfflineCustomerInfoCalculator;Lcom/revenuecat/purchases/common/caching/DeviceCache;Lcom/revenuecat/purchases/common/AppConfig;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;)V", "", "isOfflineEntitlementsEnabled", "()Z", "Lg00/b0;", "resetOfflineCustomerInfoCache", "()V", "isServerError", "", "appUserId", "shouldCalculateOfflineCustomerInfoInGetCustomerInfoRequest", "(ZLjava/lang/String;)Z", "shouldCalculateOfflineCustomerInfoInPostReceipt", "(Z)Z", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/CustomerInfo;", "onSuccess", "Lcom/revenuecat/purchases/PurchasesError;", "onError", "calculateAndCacheOfflineCustomerInfo", "(Ljava/lang/String;Lu00/k;Lu00/k;)V", "completion", "updateProductEntitlementMappingCacheIfStale", "(Lu00/k;)V", "Lcom/revenuecat/purchases/common/Backend;", "Lcom/revenuecat/purchases/common/offlineentitlements/OfflineCustomerInfoCalculator;", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "Lcom/revenuecat/purchases/common/AppConfig;", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "<set-?>", "_offlineCustomerInfo", "Lcom/revenuecat/purchases/CustomerInfo;", "", "", "Lg00/k;", "Lcom/revenuecat/purchases/common/offlineentitlements/OfflineCustomerInfoCallback;", "offlineCustomerInfoCallbackCache", "Ljava/util/Map;", "getOfflineCustomerInfo", "()Lcom/revenuecat/purchases/CustomerInfo;", "offlineCustomerInfo", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OfflineEntitlementsManager {
    private CustomerInfo _offlineCustomerInfo;
    private final AppConfig appConfig;
    private final Backend backend;
    private final DeviceCache deviceCache;
    private final DiagnosticsTracker diagnosticsTracker;
    private final OfflineCustomerInfoCalculator offlineCustomerInfoCalculator;
    private final Map<String, List<k>> offlineCustomerInfoCallbackCache;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfo;", "customerInfo", "Lg00/b0;", "invoke", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass2 extends n implements u00.k {
        final String $appUserId;

        public AnonymousClass2(String str) {
            super(1);
            this.$appUserId = str;
        }

        @Override
        public Object invoke(Object obj) {
            invoke((CustomerInfo) obj);
            return b0.a;
        }

        public final void invoke(CustomerInfo customerInfo) {
            m.e(customerInfo, "customerInfo");
            OfflineEntitlementsManager offlineEntitlementsManager = OfflineEntitlementsManager.this;
            String str = this.$appUserId;
            synchronized (offlineEntitlementsManager) {
                try {
                    LogLevel logLevel = LogLevel.WARN;
                    LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        currentLogHandler.w("[Purchases] - " + logLevel.name(), OfflineEntitlementsStrings.USING_OFFLINE_ENTITLEMENTS_CUSTOMER_INFO);
                    }
                    DiagnosticsTracker diagnosticsTracker = offlineEntitlementsManager.diagnosticsTracker;
                    if (diagnosticsTracker != null) {
                        diagnosticsTracker.trackEnteredOfflineEntitlementsMode();
                    }
                    offlineEntitlementsManager._offlineCustomerInfo = customerInfo;
                    String cachedAppUserID$purchases_defaultsBc8Release = offlineEntitlementsManager.deviceCache.getCachedAppUserID$purchases_defaultsBc8Release();
                    if (cachedAppUserID$purchases_defaultsBc8Release != null) {
                        offlineEntitlementsManager.deviceCache.clearCustomerInfoCache$purchases_defaultsBc8Release(cachedAppUserID$purchases_defaultsBc8Release);
                    }
                    List list = (List) offlineEntitlementsManager.offlineCustomerInfoCallbackCache.remove(str);
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((u00.k) ((k) it.next()).A).invoke(customerInfo);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "it", "Lg00/b0;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass3 extends n implements u00.k {
        final String $appUserId;

        public AnonymousClass3(String str) {
            super(1);
            this.$appUserId = str;
        }

        @Override
        public Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return b0.a;
        }

        public final void invoke(PurchasesError it) {
            m.e(it, "it");
            OfflineEntitlementsManager offlineEntitlementsManager = OfflineEntitlementsManager.this;
            String str = this.$appUserId;
            synchronized (offlineEntitlementsManager) {
                List list = (List) offlineEntitlementsManager.offlineCustomerInfoCallbackCache.remove(str);
                if (list != null) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        ((u00.k) ((k) it2.next()).B).invoke(it);
                    }
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/common/offlineentitlements/ProductEntitlementMapping;", "productEntitlementMapping", "Lg00/b0;", "invoke", "(Lcom/revenuecat/purchases/common/offlineentitlements/ProductEntitlementMapping;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C01042 extends n implements u00.k {
        final u00.k $completion;

        public C01042(u00.k kVar) {
            super(1);
            this.$completion = kVar;
        }

        @Override
        public Object invoke(Object obj) {
            invoke((ProductEntitlementMapping) obj);
            return b0.a;
        }

        public final void invoke(ProductEntitlementMapping productEntitlementMapping) {
            m.e(productEntitlementMapping, "productEntitlementMapping");
            OfflineEntitlementsManager.this.deviceCache.cacheProductEntitlementMapping$purchases_defaultsBc8Release(productEntitlementMapping);
            LogLevel logLevel = LogLevel.DEBUG;
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                x5.w(logLevel, new StringBuilder("[Purchases] - "), currentLogHandler, OfflineEntitlementsStrings.SUCCESSFULLY_UPDATED_PRODUCT_ENTITLEMENTS);
            }
            u00.k kVar = this.$completion;
            if (kVar != null) {
                kVar.invoke(null);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "e", "Lg00/b0;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C01053 extends n implements u00.k {
        final u00.k $completion;

        public C01053(u00.k kVar) {
            super(1);
            this.$completion = kVar;
        }

        @Override
        public Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return b0.a;
        }

        public final void invoke(PurchasesError e) {
            m.e(e, "e");
            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", String.format(OfflineEntitlementsStrings.ERROR_UPDATING_PRODUCT_ENTITLEMENTS, Arrays.copyOf(new Object[]{e}, 1)), null);
            u00.k kVar = this.$completion;
            if (kVar != null) {
                kVar.invoke(e);
            }
        }
    }

    public OfflineEntitlementsManager(Backend backend, OfflineCustomerInfoCalculator offlineCustomerInfoCalculator, DeviceCache deviceCache, AppConfig appConfig, DiagnosticsTracker diagnosticsTracker) {
        m.e(backend, "backend");
        m.e(offlineCustomerInfoCalculator, "offlineCustomerInfoCalculator");
        m.e(deviceCache, "deviceCache");
        m.e(appConfig, "appConfig");
        this.backend = backend;
        this.offlineCustomerInfoCalculator = offlineCustomerInfoCalculator;
        this.deviceCache = deviceCache;
        this.appConfig = appConfig;
        this.diagnosticsTracker = diagnosticsTracker;
        this.offlineCustomerInfoCallbackCache = new LinkedHashMap();
    }

    private final boolean isOfflineEntitlementsEnabled() {
        return this.appConfig.getFinishTransactions() && this.appConfig.getEnableOfflineEntitlements() && !this.appConfig.getCustomEntitlementComputation() && this.appConfig.getStore() != Store.TEST_STORE;
    }

    public static void updateProductEntitlementMappingCacheIfStale$default(OfflineEntitlementsManager offlineEntitlementsManager, u00.k kVar, int i, Object obj) {
        if ((i & 1) != 0) {
            kVar = null;
        }
        offlineEntitlementsManager.updateProductEntitlementMappingCacheIfStale(kVar);
    }

    public final void calculateAndCacheOfflineCustomerInfo(String appUserId, u00.k onSuccess, u00.k onError) {
        m.e(appUserId, "appUserId");
        m.e(onSuccess, "onSuccess");
        m.e(onError, "onError");
        if (!this.appConfig.getEnableOfflineEntitlements()) {
            onError.invoke(new PurchasesError(PurchasesErrorCode.UnsupportedError, OfflineEntitlementsStrings.OFFLINE_ENTITLEMENTS_NOT_ENABLED));
            return;
        }
        synchronized (this) {
            try {
                boolean zContainsKey = this.offlineCustomerInfoCallbackCache.containsKey(appUserId);
                List<k> list = this.offlineCustomerInfoCallbackCache.get(appUserId);
                if (list == null) {
                    list = x.A;
                }
                this.offlineCustomerInfoCallbackCache.put(appUserId, q.Y0(a.R(new k(onSuccess, onError)), list));
                if (!zContainsKey) {
                    this.offlineCustomerInfoCalculator.computeOfflineCustomerInfo(appUserId, new AnonymousClass2(appUserId), new AnonymousClass3(appUserId));
                    return;
                }
                LogLevel logLevel = LogLevel.DEBUG;
                LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    currentLogHandler.d("[Purchases] - " + logLevel.name(), String.format(OfflineEntitlementsStrings.ALREADY_CALCULATING_OFFLINE_CUSTOMER_INFO, Arrays.copyOf(new Object[]{appUserId}, 1)));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final CustomerInfo get_offlineCustomerInfo() {
        return this._offlineCustomerInfo;
    }

    public final synchronized void resetOfflineCustomerInfoCache() {
        try {
            if (this._offlineCustomerInfo != null) {
                LogLevel logLevel = LogLevel.DEBUG;
                LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    currentLogHandler.d("[Purchases] - " + logLevel.name(), OfflineEntitlementsStrings.RESETTING_OFFLINE_CUSTOMER_INFO_CACHE);
                }
                this._offlineCustomerInfo = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final boolean shouldCalculateOfflineCustomerInfoInGetCustomerInfoRequest(boolean isServerError, String appUserId) {
        m.e(appUserId, "appUserId");
        return isServerError && isOfflineEntitlementsEnabled() && this.deviceCache.getCachedCustomerInfo$purchases_defaultsBc8Release(appUserId) == null;
    }

    public final boolean shouldCalculateOfflineCustomerInfoInPostReceipt(boolean isServerError) {
        return isServerError && isOfflineEntitlementsEnabled();
    }

    public final void updateProductEntitlementMappingCacheIfStale(u00.k completion) {
        if (!isOfflineEntitlementsEnabled() || !this.deviceCache.isProductEntitlementMappingCacheStale$purchases_defaultsBc8Release()) {
            if (completion != null) {
                completion.invoke(null);
            }
        } else {
            LogLevel logLevel = LogLevel.DEBUG;
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                x5.w(logLevel, new StringBuilder("[Purchases] - "), currentLogHandler, OfflineEntitlementsStrings.UPDATING_PRODUCT_ENTITLEMENT_MAPPING);
            }
            this.backend.getProductEntitlementMapping(new C01042(completion), new C01053(completion));
        }
    }
}
