package com.revenuecat.purchases;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.measurement.x5;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import com.revenuecat.purchases.common.DurationExtensionsKt;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.common.offlineentitlements.OfflineEntitlementsManager;
import com.revenuecat.purchases.common.responses.CustomerInfoResponseJsonKeys;
import com.revenuecat.purchases.identity.IdentityManager;
import com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback;
import com.revenuecat.purchases.strings.CustomerInfoStrings;
import com.revenuecat.purchases.utils.Result;
import g00.b0;
import h00.y;
import java.util.Arrays;
import java.util.Date;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import org.json.JSONException;
import org.json.JSONObject;
import u00.k;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000 H2\u00020\u0001:\u0001HBW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ?\u0010 \u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u000e2\u0016\b\u0002\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0018H\u0002¢\u0006\u0004\b \u0010!JC\u0010%\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u000e2\"\b\u0002\u0010\u001b\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\"\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0018H\u0002¢\u0006\u0004\b%\u0010&J?\u0010'\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u000e2\u0016\b\u0002\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0018H\u0002¢\u0006\u0004\b'\u0010!J?\u0010(\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u000e2\u0016\b\u0002\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0018H\u0002¢\u0006\u0004\b(\u0010!J\u0019\u0010)\u001a\u0004\u0018\u00010#2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b)\u0010*J'\u0010+\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020\u000eH\u0002¢\u0006\u0004\b.\u0010/J/\u00105\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020\u000e2\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u00020\u00192\u0006\u00104\u001a\u000203H\u0002¢\u0006\u0004\b5\u00106J\u001d\u00109\u001a\u00020\u001a2\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u001a07H\u0002¢\u0006\u0004\b9\u0010:JC\u0010=\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010;\u001a\u0002032\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u000e2\b\b\u0002\u0010-\u001a\u00020\u000e2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010<¢\u0006\u0004\b=\u0010>R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010?R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010@R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010AR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010BR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010CR\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010DR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010ER\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010FR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010G¨\u0006I"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfoHelper;", "", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "deviceCache", "Lcom/revenuecat/purchases/common/Backend;", "backend", "Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;", "offlineEntitlementsManager", "Lcom/revenuecat/purchases/CustomerInfoUpdateHandler;", "customerInfoUpdateHandler", "Lcom/revenuecat/purchases/PostPendingTransactionsHelper;", "postPendingTransactionsHelper", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "diagnosticsTrackerIfEnabled", "", "uiPreviewMode", "Lcom/revenuecat/purchases/common/DateProvider;", "dateProvider", "Landroid/os/Handler;", "handler", "<init>", "(Lcom/revenuecat/purchases/common/caching/DeviceCache;Lcom/revenuecat/purchases/common/Backend;Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;Lcom/revenuecat/purchases/CustomerInfoUpdateHandler;Lcom/revenuecat/purchases/PostPendingTransactionsHelper;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;ZLcom/revenuecat/purchases/common/DateProvider;Landroid/os/Handler;)V", "", "appUserID", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/CustomerInfoDataResult;", "Lg00/b0;", "callback", "getCustomerInfoCacheOnly", "(Ljava/lang/String;Lu00/k;)V", "appInBackground", "allowSharingPlayStoreAccount", "postPendingPurchasesAndFetchCustomerInfo", "(Ljava/lang/String;ZZLu00/k;)V", "Lcom/revenuecat/purchases/utils/Result;", "Lcom/revenuecat/purchases/CustomerInfo;", "Lcom/revenuecat/purchases/PurchasesError;", "getCustomerInfoFetchOnly", "(Ljava/lang/String;ZLu00/k;)V", "getCustomerInfoCachedOrFetched", "getCustomerInfoNotStaledCachedOrFetched", "getCachedCustomerInfo", "(Ljava/lang/String;)Lcom/revenuecat/purchases/CustomerInfo;", "updateCachedCustomerInfoIfStale", "(Ljava/lang/String;ZZ)V", "trackDiagnostics", "trackGetCustomerInfoStartedIfNeeded", "(Z)V", "Ljava/util/Date;", "startTime", "customerInfoDataResult", "Lcom/revenuecat/purchases/CacheFetchPolicy;", "cacheFetchPolicy", "trackGetCustomerInfoResultIfNeeded", "(ZLjava/util/Date;Lcom/revenuecat/purchases/CustomerInfoDataResult;Lcom/revenuecat/purchases/CacheFetchPolicy;)V", "Lkotlin/Function0;", "action", "dispatch", "(Lu00/a;)V", "fetchPolicy", "Lcom/revenuecat/purchases/interfaces/ReceiveCustomerInfoCallback;", "retrieveCustomerInfo", "(Ljava/lang/String;Lcom/revenuecat/purchases/CacheFetchPolicy;ZZZLcom/revenuecat/purchases/interfaces/ReceiveCustomerInfoCallback;)V", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "Lcom/revenuecat/purchases/common/Backend;", "Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;", "Lcom/revenuecat/purchases/CustomerInfoUpdateHandler;", "Lcom/revenuecat/purchases/PostPendingTransactionsHelper;", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "Z", "Lcom/revenuecat/purchases/common/DateProvider;", "Landroid/os/Handler;", "Companion", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CustomerInfoHelper {

    public static final Companion INSTANCE = new Companion(null);
    private final Backend backend;
    private final CustomerInfoUpdateHandler customerInfoUpdateHandler;
    private final DateProvider dateProvider;
    private final DeviceCache deviceCache;
    private final DiagnosticsTracker diagnosticsTrackerIfEnabled;
    private final Handler handler;
    private final OfflineEntitlementsManager offlineEntitlementsManager;
    private final PostPendingTransactionsHelper postPendingTransactionsHelper;
    private final boolean uiPreviewMode;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\u0003\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfoHelper$Companion;", "", "()V", "createPreviewCustomerInfo", "Lcom/revenuecat/purchases/CustomerInfo;", "createPreviewCustomerInfo$purchases_defaultsBc8Release", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(f fVar) {
            this();
        }

        public final CustomerInfo createPreviewCustomerInfo$purchases_defaultsBc8Release() throws JSONException {
            Date date = new Date();
            VerificationResult verificationResult = VerificationResult.NOT_REQUESTED;
            y yVar = y.A;
            EntitlementInfos entitlementInfos = new EntitlementInfos(yVar, verificationResult);
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(CustomerInfoResponseJsonKeys.SUBSCRIPTIONS, new JSONObject());
            jSONObject2.put(CustomerInfoResponseJsonKeys.NON_SUBSCRIPTIONS, new JSONObject());
            jSONObject.put(CustomerInfoResponseJsonKeys.SUBSCRIBER, jSONObject2);
            return new CustomerInfo(entitlementInfos, yVar, yVar, date, 3, date, IdentityManager.UI_PREVIEW_MODE_APP_USER_ID, null, null, jSONObject);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CacheFetchPolicy.values().length];
            try {
                iArr[CacheFetchPolicy.CACHE_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CacheFetchPolicy.FETCH_CURRENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CacheFetchPolicy.CACHED_OR_FETCHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CacheFetchPolicy.NOT_STALE_CACHED_OR_CURRENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lg00/b0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass2 extends n implements u00.a {
        final CustomerInfo $cachedCustomerInfo;
        final k $callback;

        public AnonymousClass2(k kVar, CustomerInfo customerInfo) {
            super(0);
            this.$callback = kVar;
            this.$cachedCustomerInfo = customerInfo;
        }

        @Override
        public Object invoke() {
            m11invoke();
            return b0.a;
        }

        public final void m11invoke() {
            this.$callback.invoke(new CustomerInfoDataResult(new Result.Success(this.$cachedCustomerInfo), null, 2, 0 == true ? 1 : 0));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lg00/b0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass3 extends n implements u00.a {
        final k $callback;
        final PurchasesError $error;

        public AnonymousClass3(k kVar, PurchasesError purchasesError) {
            super(0);
            this.$callback = kVar;
            this.$error = purchasesError;
        }

        @Override
        public Object invoke() {
            m12invoke();
            return b0.a;
        }

        public final void m12invoke() {
            this.$callback.invoke(new CustomerInfoDataResult(new Result.Error(this.$error), null, 2, 0 == true ? 1 : 0));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lg00/b0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C00302 extends n implements u00.a {
        final CustomerInfo $cachedCustomerInfo;
        final k $callback;

        public C00302(k kVar, CustomerInfo customerInfo) {
            super(0);
            this.$callback = kVar;
            this.$cachedCustomerInfo = customerInfo;
        }

        @Override
        public Object invoke() {
            m13invoke();
            return b0.a;
        }

        public final void m13invoke() {
            k kVar = this.$callback;
            if (kVar != null) {
                kVar.invoke(new CustomerInfoDataResult(new Result.Success(this.$cachedCustomerInfo), null, 2, 0 == true ? 1 : 0));
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfo;", "info", "Lg00/b0;", "invoke", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass1 extends n implements k {
        final k $callback;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lg00/b0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class AnonymousClass2 extends n implements u00.a {
            final k $callback;
            final CustomerInfo $info;

            public AnonymousClass2(k kVar, CustomerInfo customerInfo) {
                super(0);
                this.$callback = kVar;
                this.$info = customerInfo;
            }

            @Override
            public Object invoke() {
                m14invoke();
                return b0.a;
            }

            public final void m14invoke() {
                k kVar = this.$callback;
                if (kVar != null) {
                    kVar.invoke(new Result.Success(this.$info));
                }
            }
        }

        public AnonymousClass1(k kVar) {
            super(1);
            this.$callback = kVar;
        }

        @Override
        public Object invoke(Object obj) {
            invoke((CustomerInfo) obj);
            return b0.a;
        }

        public final void invoke(CustomerInfo info) {
            LogHandler currentLogHandler;
            String strK;
            String str;
            m.e(info, "info");
            LogIntent logIntent = LogIntent.RC_SUCCESS;
            CustomerInfoHelper$getCustomerInfoFetchOnly$1$invoke$$inlined$log$1 customerInfoHelper$getCustomerInfoFetchOnly$1$invoke$$inlined$log$1 = new CustomerInfoHelper$getCustomerInfoFetchOnly$1$invoke$$inlined$log$1(logIntent);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        strK = x5.k(logLevel, new StringBuilder("[Purchases] - "));
                        str = (String) customerInfoHelper$getCustomerInfoFetchOnly$1$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(strK, str);
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) customerInfoHelper$getCustomerInfoFetchOnly$1$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w(x5.k(logLevel2, new StringBuilder("[Purchases] - ")), (String) customerInfoHelper$getCustomerInfoFetchOnly$1$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i(x5.k(logLevel3, new StringBuilder("[Purchases] - ")), (String) customerInfoHelper$getCustomerInfoFetchOnly$1$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        strK = x5.k(logLevel4, new StringBuilder("[Purchases] - "));
                        str = (String) customerInfoHelper$getCustomerInfoFetchOnly$1$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(strK, str);
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) customerInfoHelper$getCustomerInfoFetchOnly$1$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler4.i(x5.k(logLevel5, new StringBuilder("[Purchases] - ")), (String) customerInfoHelper$getCustomerInfoFetchOnly$1$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        strK = x5.k(logLevel6, new StringBuilder("[Purchases] - "));
                        str = (String) customerInfoHelper$getCustomerInfoFetchOnly$1$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(strK, str);
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        strK = x5.k(logLevel7, new StringBuilder("[Purchases] - "));
                        str = (String) customerInfoHelper$getCustomerInfoFetchOnly$1$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(strK, str);
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler5.w(x5.k(logLevel8, new StringBuilder("[Purchases] - ")), (String) customerInfoHelper$getCustomerInfoFetchOnly$1$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler6.w(x5.k(logLevel9, new StringBuilder("[Purchases] - ")), (String) customerInfoHelper$getCustomerInfoFetchOnly$1$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) customerInfoHelper$getCustomerInfoFetchOnly$1$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler7.w(x5.k(logLevel10, new StringBuilder("[Purchases] - ")), (String) customerInfoHelper$getCustomerInfoFetchOnly$1$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) customerInfoHelper$getCustomerInfoFetchOnly$1$invoke$$inlined$log$1.invoke(), null);
                    break;
            }
            CustomerInfoHelper.this.offlineEntitlementsManager.resetOfflineCustomerInfoCache();
            CustomerInfoHelper.this.customerInfoUpdateHandler.cacheAndNotifyListeners(info);
            CustomerInfoHelper.this.dispatch(new AnonymousClass2(this.$callback, info));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "backendError", "", "isServerError", "Lg00/b0;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;Z)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C00312 extends n implements u00.n {
        final String $appUserID;
        final k $callback;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfo;", "offlineComputedCustomerInfo", "Lg00/b0;", "invoke", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class C00002 extends n implements k {
            final k $callback;
            final CustomerInfoHelper this$0;

            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lg00/b0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            public static final class AnonymousClass1 extends n implements u00.a {
                final k $callback;
                final CustomerInfo $offlineComputedCustomerInfo;

                public AnonymousClass1(k kVar, CustomerInfo customerInfo) {
                    super(0);
                    this.$callback = kVar;
                    this.$offlineComputedCustomerInfo = customerInfo;
                }

                @Override
                public Object invoke() {
                    m15invoke();
                    return b0.a;
                }

                public final void m15invoke() {
                    k kVar = this.$callback;
                    if (kVar != null) {
                        kVar.invoke(new Result.Success(this.$offlineComputedCustomerInfo));
                    }
                }
            }

            public C00002(CustomerInfoHelper customerInfoHelper, k kVar) {
                super(1);
                this.this$0 = customerInfoHelper;
                this.$callback = kVar;
            }

            @Override
            public Object invoke(Object obj) {
                invoke((CustomerInfo) obj);
                return b0.a;
            }

            public final void invoke(CustomerInfo offlineComputedCustomerInfo) {
                m.e(offlineComputedCustomerInfo, "offlineComputedCustomerInfo");
                this.this$0.customerInfoUpdateHandler.notifyListeners(offlineComputedCustomerInfo);
                this.this$0.dispatch(new AnonymousClass1(this.$callback, offlineComputedCustomerInfo));
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "it", "Lg00/b0;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class AnonymousClass3 extends n implements k {
            final PurchasesError $backendError;
            final k $callback;
            final CustomerInfoHelper this$0;

            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lg00/b0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            public static final class AnonymousClass1 extends n implements u00.a {
                final PurchasesError $backendError;
                final k $callback;

                public AnonymousClass1(k kVar, PurchasesError purchasesError) {
                    super(0);
                    this.$callback = kVar;
                    this.$backendError = purchasesError;
                }

                @Override
                public Object invoke() {
                    m16invoke();
                    return b0.a;
                }

                public final void m16invoke() {
                    k kVar = this.$callback;
                    if (kVar != null) {
                        kVar.invoke(new Result.Error(this.$backendError));
                    }
                }
            }

            public AnonymousClass3(CustomerInfoHelper customerInfoHelper, k kVar, PurchasesError purchasesError) {
                super(1);
                this.this$0 = customerInfoHelper;
                this.$callback = kVar;
                this.$backendError = purchasesError;
            }

            @Override
            public Object invoke(Object obj) {
                invoke((PurchasesError) obj);
                return b0.a;
            }

            public final void invoke(PurchasesError it) {
                m.e(it, "it");
                this.this$0.dispatch(new AnonymousClass1(this.$callback, this.$backendError));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lg00/b0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class AnonymousClass4 extends n implements u00.a {
            final PurchasesError $backendError;
            final k $callback;

            public AnonymousClass4(k kVar, PurchasesError purchasesError) {
                super(0);
                this.$callback = kVar;
                this.$backendError = purchasesError;
            }

            @Override
            public Object invoke() {
                m17invoke();
                return b0.a;
            }

            public final void m17invoke() {
                k kVar = this.$callback;
                if (kVar != null) {
                    kVar.invoke(new Result.Error(this.$backendError));
                }
            }
        }

        public C00312(String str, k kVar) {
            super(2);
            this.$appUserID = str;
            this.$callback = kVar;
        }

        @Override
        public Object invoke(Object obj, Object obj2) {
            invoke((PurchasesError) obj, ((Boolean) obj2).booleanValue());
            return b0.a;
        }

        public final void invoke(PurchasesError backendError, boolean z) {
            m.e(backendError, "backendError");
            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", String.format(CustomerInfoStrings.ERROR_FETCHING_CUSTOMER_INFO, Arrays.copyOf(new Object[]{backendError}, 1)), null);
            CustomerInfoHelper.this.deviceCache.clearCustomerInfoCacheTimestamp$purchases_defaultsBc8Release(this.$appUserID);
            if (CustomerInfoHelper.this.offlineEntitlementsManager.shouldCalculateOfflineCustomerInfoInGetCustomerInfoRequest(z, this.$appUserID)) {
                CustomerInfoHelper.this.offlineEntitlementsManager.calculateAndCacheOfflineCustomerInfo(this.$appUserID, new C00002(CustomerInfoHelper.this, this.$callback), new AnonymousClass3(CustomerInfoHelper.this, this.$callback, backendError));
            } else {
                CustomerInfoHelper.this.dispatch(new AnonymousClass4(this.$callback, backendError));
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/SyncPendingPurchaseResult;", "syncResult", "Lg00/b0;", "invoke", "(Lcom/revenuecat/purchases/SyncPendingPurchaseResult;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C00321 extends n implements k {
        final boolean $appInBackground;
        final String $appUserID;
        final k $callback;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lg00/b0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class AnonymousClass2 extends n implements u00.a {
            final k $callback;
            final SyncPendingPurchaseResult $syncResult;

            public AnonymousClass2(k kVar, SyncPendingPurchaseResult syncPendingPurchaseResult) {
                super(0);
                this.$callback = kVar;
                this.$syncResult = syncPendingPurchaseResult;
            }

            @Override
            public Object invoke() {
                m18invoke();
                return b0.a;
            }

            public final void m18invoke() {
                k kVar = this.$callback;
                if (kVar != null) {
                    kVar.invoke(new CustomerInfoDataResult(new Result.Success(((SyncPendingPurchaseResult.Success) this.$syncResult).getCustomerInfo()), Boolean.TRUE));
                }
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/revenuecat/purchases/utils/Result;", "Lcom/revenuecat/purchases/CustomerInfo;", "Lcom/revenuecat/purchases/PurchasesError;", "result", "Lg00/b0;", "invoke", "(Lcom/revenuecat/purchases/utils/Result;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class AnonymousClass3 extends n implements k {
            final k $callback;

            public AnonymousClass3(k kVar) {
                super(1);
                this.$callback = kVar;
            }

            @Override
            public Object invoke(Object obj) {
                invoke((Result<CustomerInfo, PurchasesError>) obj);
                return b0.a;
            }

            public final void invoke(Result<CustomerInfo, PurchasesError> result) {
                m.e(result, "result");
                k kVar = this.$callback;
                if (kVar != null) {
                    kVar.invoke(new CustomerInfoDataResult(result, Boolean.TRUE));
                }
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/revenuecat/purchases/utils/Result;", "Lcom/revenuecat/purchases/CustomerInfo;", "Lcom/revenuecat/purchases/PurchasesError;", "result", "Lg00/b0;", "invoke", "(Lcom/revenuecat/purchases/utils/Result;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class AnonymousClass4 extends n implements k {
            final k $callback;

            public AnonymousClass4(k kVar) {
                super(1);
                this.$callback = kVar;
            }

            @Override
            public Object invoke(Object obj) {
                invoke((Result<CustomerInfo, PurchasesError>) obj);
                return b0.a;
            }

            public final void invoke(Result<CustomerInfo, PurchasesError> result) {
                m.e(result, "result");
                k kVar = this.$callback;
                if (kVar != null) {
                    kVar.invoke(new CustomerInfoDataResult(result, null, 2, 0 == true ? 1 : 0));
                }
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/revenuecat/purchases/utils/Result;", "Lcom/revenuecat/purchases/CustomerInfo;", "Lcom/revenuecat/purchases/PurchasesError;", "result", "Lg00/b0;", "invoke", "(Lcom/revenuecat/purchases/utils/Result;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class AnonymousClass5 extends n implements k {
            final k $callback;

            public AnonymousClass5(k kVar) {
                super(1);
                this.$callback = kVar;
            }

            @Override
            public Object invoke(Object obj) {
                invoke((Result<CustomerInfo, PurchasesError>) obj);
                return b0.a;
            }

            public final void invoke(Result<CustomerInfo, PurchasesError> result) {
                m.e(result, "result");
                k kVar = this.$callback;
                if (kVar != null) {
                    kVar.invoke(new CustomerInfoDataResult(result, Boolean.FALSE));
                }
            }
        }

        public C00321(String str, boolean z, k kVar) {
            super(1);
            this.$appUserID = str;
            this.$appInBackground = z;
            this.$callback = kVar;
        }

        @Override
        public Object invoke(Object obj) {
            invoke((SyncPendingPurchaseResult) obj);
            return b0.a;
        }

        public final void invoke(SyncPendingPurchaseResult syncResult) {
            LogHandler currentLogHandler;
            String strK;
            String str;
            m.e(syncResult, "syncResult");
            if (!(syncResult instanceof SyncPendingPurchaseResult.Success)) {
                if (syncResult instanceof SyncPendingPurchaseResult.Error) {
                    CustomerInfoHelper.this.getCustomerInfoFetchOnly(this.$appUserID, this.$appInBackground, new AnonymousClass3(this.$callback));
                    return;
                } else if (syncResult instanceof SyncPendingPurchaseResult.AutoSyncDisabled) {
                    CustomerInfoHelper.this.getCustomerInfoFetchOnly(this.$appUserID, this.$appInBackground, new AnonymousClass4(this.$callback));
                    return;
                } else {
                    if (syncResult instanceof SyncPendingPurchaseResult.NoPendingPurchasesToSync) {
                        CustomerInfoHelper.this.getCustomerInfoFetchOnly(this.$appUserID, this.$appInBackground, new AnonymousClass5(this.$callback));
                        return;
                    }
                    return;
                }
            }
            LogIntent logIntent = LogIntent.RC_SUCCESS;
            CustomerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$1$invoke$$inlined$log$1 customerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$1$invoke$$inlined$log$1 = new CustomerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$1$invoke$$inlined$log$1(logIntent);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        strK = x5.k(logLevel, new StringBuilder("[Purchases] - "));
                        str = (String) customerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$1$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(strK, str);
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) customerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$1$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w(x5.k(logLevel2, new StringBuilder("[Purchases] - ")), (String) customerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$1$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i(x5.k(logLevel3, new StringBuilder("[Purchases] - ")), (String) customerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$1$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        strK = x5.k(logLevel4, new StringBuilder("[Purchases] - "));
                        str = (String) customerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$1$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(strK, str);
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) customerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$1$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler4.i(x5.k(logLevel5, new StringBuilder("[Purchases] - ")), (String) customerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$1$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        strK = x5.k(logLevel6, new StringBuilder("[Purchases] - "));
                        str = (String) customerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$1$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(strK, str);
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        strK = x5.k(logLevel7, new StringBuilder("[Purchases] - "));
                        str = (String) customerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$1$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(strK, str);
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler5.w(x5.k(logLevel8, new StringBuilder("[Purchases] - ")), (String) customerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$1$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler6.w(x5.k(logLevel9, new StringBuilder("[Purchases] - ")), (String) customerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$1$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) customerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$1$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler7.w(x5.k(logLevel10, new StringBuilder("[Purchases] - ")), (String) customerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$1$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) customerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$1$invoke$$inlined$log$1.invoke(), null);
                    break;
            }
            CustomerInfoHelper.this.dispatch(new AnonymousClass2(this.$callback, syncResult));
        }
    }

    public CustomerInfoHelper(DeviceCache deviceCache, Backend backend, OfflineEntitlementsManager offlineEntitlementsManager, CustomerInfoUpdateHandler customerInfoUpdateHandler, PostPendingTransactionsHelper postPendingTransactionsHelper, DiagnosticsTracker diagnosticsTracker, boolean z, DateProvider dateProvider, Handler handler) {
        m.e(deviceCache, "deviceCache");
        m.e(backend, "backend");
        m.e(offlineEntitlementsManager, "offlineEntitlementsManager");
        m.e(customerInfoUpdateHandler, "customerInfoUpdateHandler");
        m.e(postPendingTransactionsHelper, "postPendingTransactionsHelper");
        m.e(dateProvider, "dateProvider");
        m.e(handler, "handler");
        this.deviceCache = deviceCache;
        this.backend = backend;
        this.offlineEntitlementsManager = offlineEntitlementsManager;
        this.customerInfoUpdateHandler = customerInfoUpdateHandler;
        this.postPendingTransactionsHelper = postPendingTransactionsHelper;
        this.diagnosticsTrackerIfEnabled = diagnosticsTracker;
        this.uiPreviewMode = z;
        this.dateProvider = dateProvider;
        this.handler = handler;
    }

    public CustomerInfoHelper(DeviceCache deviceCache, Backend backend, OfflineEntitlementsManager offlineEntitlementsManager, CustomerInfoUpdateHandler customerInfoUpdateHandler, PostPendingTransactionsHelper postPendingTransactionsHelper, DiagnosticsTracker diagnosticsTracker, boolean z, DateProvider dateProvider, Handler handler, int i, f fVar) {
        this(deviceCache, backend, offlineEntitlementsManager, customerInfoUpdateHandler, postPendingTransactionsHelper, diagnosticsTracker, (i & 64) != 0 ? false : z, (i & 128) != 0 ? new DefaultDateProvider() : dateProvider, (i & 256) != 0 ? new Handler(Looper.getMainLooper()) : handler);
    }

    public final void dispatch(u00.a action) {
        if (m.a(Thread.currentThread(), this.handler.getLooper().getThread())) {
            action.invoke();
        } else {
            this.handler.post(new a(action, 0));
        }
    }

    private final CustomerInfo getCachedCustomerInfo(String appUserID) {
        CustomerInfo offlineCustomerInfo = this.offlineEntitlementsManager.get_offlineCustomerInfo();
        return offlineCustomerInfo == null ? this.deviceCache.getCachedCustomerInfo$purchases_defaultsBc8Release(appUserID) : offlineCustomerInfo;
    }

    private final void getCustomerInfoCacheOnly(String appUserID, k callback) {
        LogHandler currentLogHandler;
        String strK;
        String str;
        if (callback == null) {
            return;
        }
        CustomerInfo cachedCustomerInfo = getCachedCustomerInfo(appUserID);
        if (cachedCustomerInfo == null) {
            PurchasesError purchasesError = new PurchasesError(PurchasesErrorCode.CustomerInfoError, CustomerInfoStrings.MISSING_CACHED_CUSTOMER_INFO);
            LogUtilsKt.errorLog(purchasesError);
            dispatch(new AnonymousClass3(callback, purchasesError));
            return;
        }
        LogIntent logIntent = LogIntent.DEBUG;
        CustomerInfoHelper$getCustomerInfoCacheOnly$$inlined$log$1 customerInfoHelper$getCustomerInfoCacheOnly$$inlined$log$1 = new CustomerInfoHelper$getCustomerInfoCacheOnly$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    strK = x5.k(logLevel, new StringBuilder("[Purchases] - "));
                    str = (String) customerInfoHelper$getCustomerInfoCacheOnly$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) customerInfoHelper$getCustomerInfoCacheOnly$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w(x5.k(logLevel2, new StringBuilder("[Purchases] - ")), (String) customerInfoHelper$getCustomerInfoCacheOnly$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i(x5.k(logLevel3, new StringBuilder("[Purchases] - ")), (String) customerInfoHelper$getCustomerInfoCacheOnly$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    strK = x5.k(logLevel4, new StringBuilder("[Purchases] - "));
                    str = (String) customerInfoHelper$getCustomerInfoCacheOnly$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) customerInfoHelper$getCustomerInfoCacheOnly$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i(x5.k(logLevel5, new StringBuilder("[Purchases] - ")), (String) customerInfoHelper$getCustomerInfoCacheOnly$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    strK = x5.k(logLevel6, new StringBuilder("[Purchases] - "));
                    str = (String) customerInfoHelper$getCustomerInfoCacheOnly$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    strK = x5.k(logLevel7, new StringBuilder("[Purchases] - "));
                    str = (String) customerInfoHelper$getCustomerInfoCacheOnly$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w(x5.k(logLevel8, new StringBuilder("[Purchases] - ")), (String) customerInfoHelper$getCustomerInfoCacheOnly$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w(x5.k(logLevel9, new StringBuilder("[Purchases] - ")), (String) customerInfoHelper$getCustomerInfoCacheOnly$$inlined$log$1.invoke());
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) customerInfoHelper$getCustomerInfoCacheOnly$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w(x5.k(logLevel10, new StringBuilder("[Purchases] - ")), (String) customerInfoHelper$getCustomerInfoCacheOnly$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) customerInfoHelper$getCustomerInfoCacheOnly$$inlined$log$1.invoke(), null);
                break;
        }
        dispatch(new AnonymousClass2(callback, cachedCustomerInfo));
    }

    private final void getCustomerInfoCachedOrFetched(String appUserID, boolean appInBackground, boolean allowSharingPlayStoreAccount, k callback) {
        LogHandler currentLogHandler;
        String strK;
        String str;
        CustomerInfo cachedCustomerInfo = getCachedCustomerInfo(appUserID);
        if (cachedCustomerInfo == null) {
            LogIntent logIntent = LogIntent.DEBUG;
            CustomerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$2 customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$2 = new CustomerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$2(logIntent);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        currentLogHandler2.d(x5.k(logLevel, new StringBuilder("[Purchases] - ")), (String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$2.invoke());
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$2.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler3.w(x5.k(logLevel2, new StringBuilder("[Purchases] - ")), (String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$2.invoke());
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler4.i(x5.k(logLevel3, new StringBuilder("[Purchases] - ")), (String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$2.invoke());
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        currentLogHandler5.d(x5.k(logLevel4, new StringBuilder("[Purchases] - ")), (String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$2.invoke());
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$2.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler6.i(x5.k(logLevel5, new StringBuilder("[Purchases] - ")), (String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$2.invoke());
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        currentLogHandler7.d(x5.k(logLevel6, new StringBuilder("[Purchases] - ")), (String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$2.invoke());
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        currentLogHandler8.d(x5.k(logLevel7, new StringBuilder("[Purchases] - ")), (String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$2.invoke());
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler9.w(x5.k(logLevel8, new StringBuilder("[Purchases] - ")), (String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$2.invoke());
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler10.w(x5.k(logLevel9, new StringBuilder("[Purchases] - ")), (String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$2.invoke());
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$2.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler11 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler11.w(x5.k(logLevel10, new StringBuilder("[Purchases] - ")), (String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$2.invoke());
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$2.invoke(), null);
                    break;
            }
            postPendingPurchasesAndFetchCustomerInfo(appUserID, appInBackground, allowSharingPlayStoreAccount, callback);
            return;
        }
        LogIntent logIntent2 = LogIntent.DEBUG;
        CustomerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$1 customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$1 = new CustomerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$1(logIntent2);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent2.ordinal()]) {
            case 1:
                LogLevel logLevel11 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel11) <= 0) {
                    strK = x5.k(logLevel11, new StringBuilder("[Purchases] - "));
                    str = (String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel12 = LogLevel.WARN;
                LogHandler currentLogHandler12 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel12) <= 0) {
                    currentLogHandler12.w(x5.k(logLevel12, new StringBuilder("[Purchases] - ")), (String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel13 = LogLevel.INFO;
                LogHandler currentLogHandler13 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel13) <= 0) {
                    currentLogHandler13.i(x5.k(logLevel13, new StringBuilder("[Purchases] - ")), (String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel14 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel14) <= 0) {
                    strK = x5.k(logLevel14, new StringBuilder("[Purchases] - "));
                    str = (String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel15 = LogLevel.INFO;
                LogHandler currentLogHandler14 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel15) <= 0) {
                    currentLogHandler14.i(x5.k(logLevel15, new StringBuilder("[Purchases] - ")), (String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel16 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel16) <= 0) {
                    strK = x5.k(logLevel16, new StringBuilder("[Purchases] - "));
                    str = (String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 9:
                LogLevel logLevel17 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel17) <= 0) {
                    strK = x5.k(logLevel17, new StringBuilder("[Purchases] - "));
                    str = (String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 10:
                LogLevel logLevel18 = LogLevel.WARN;
                LogHandler currentLogHandler15 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel18) <= 0) {
                    currentLogHandler15.w(x5.k(logLevel18, new StringBuilder("[Purchases] - ")), (String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel19 = LogLevel.WARN;
                LogHandler currentLogHandler16 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel19) <= 0) {
                    currentLogHandler16.w(x5.k(logLevel19, new StringBuilder("[Purchases] - ")), (String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$1.invoke());
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel20 = LogLevel.WARN;
                LogHandler currentLogHandler17 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel20) <= 0) {
                    currentLogHandler17.w(x5.k(logLevel20, new StringBuilder("[Purchases] - ")), (String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$1.invoke(), null);
                break;
        }
        dispatch(new C00302(callback, cachedCustomerInfo));
        updateCachedCustomerInfoIfStale(appUserID, appInBackground, allowSharingPlayStoreAccount);
    }

    public static void getCustomerInfoCachedOrFetched$default(CustomerInfoHelper customerInfoHelper, String str, boolean z, boolean z2, k kVar, int i, Object obj) {
        if ((i & 8) != 0) {
            kVar = null;
        }
        customerInfoHelper.getCustomerInfoCachedOrFetched(str, z, z2, kVar);
    }

    public final void getCustomerInfoFetchOnly(String appUserID, boolean appInBackground, k callback) {
        this.deviceCache.setCustomerInfoCacheTimestampToNow$purchases_defaultsBc8Release(appUserID);
        this.backend.getCustomerInfo(appUserID, appInBackground, new AnonymousClass1(callback), new C00312(appUserID, callback));
    }

    public static void getCustomerInfoFetchOnly$default(CustomerInfoHelper customerInfoHelper, String str, boolean z, k kVar, int i, Object obj) {
        if ((i & 4) != 0) {
            kVar = null;
        }
        customerInfoHelper.getCustomerInfoFetchOnly(str, z, kVar);
    }

    private final void getCustomerInfoNotStaledCachedOrFetched(String appUserID, boolean appInBackground, boolean allowSharingPlayStoreAccount, k callback) {
        if (this.deviceCache.isCustomerInfoCacheStale$purchases_defaultsBc8Release(appUserID, appInBackground)) {
            postPendingPurchasesAndFetchCustomerInfo(appUserID, appInBackground, allowSharingPlayStoreAccount, callback);
        } else {
            getCustomerInfoCachedOrFetched(appUserID, appInBackground, allowSharingPlayStoreAccount, callback);
        }
    }

    public static void getCustomerInfoNotStaledCachedOrFetched$default(CustomerInfoHelper customerInfoHelper, String str, boolean z, boolean z2, k kVar, int i, Object obj) {
        if ((i & 8) != 0) {
            kVar = null;
        }
        customerInfoHelper.getCustomerInfoNotStaledCachedOrFetched(str, z, z2, kVar);
    }

    private final void postPendingPurchasesAndFetchCustomerInfo(String appUserID, boolean appInBackground, boolean allowSharingPlayStoreAccount, k callback) {
        this.postPendingTransactionsHelper.syncPendingPurchaseQueue(allowSharingPlayStoreAccount, new C00321(appUserID, appInBackground, callback));
    }

    public static void postPendingPurchasesAndFetchCustomerInfo$default(CustomerInfoHelper customerInfoHelper, String str, boolean z, boolean z2, k kVar, int i, Object obj) {
        if ((i & 8) != 0) {
            kVar = null;
        }
        customerInfoHelper.postPendingPurchasesAndFetchCustomerInfo(str, z, z2, kVar);
    }

    public static void retrieveCustomerInfo$default(CustomerInfoHelper customerInfoHelper, String str, CacheFetchPolicy cacheFetchPolicy, boolean z, boolean z2, boolean z3, ReceiveCustomerInfoCallback receiveCustomerInfoCallback, int i, Object obj) {
        if ((i & 16) != 0) {
            z3 = false;
        }
        boolean z4 = z3;
        if ((i & 32) != 0) {
            receiveCustomerInfoCallback = null;
        }
        customerInfoHelper.retrieveCustomerInfo(str, cacheFetchPolicy, z, z2, z4, receiveCustomerInfoCallback);
    }

    public final void trackGetCustomerInfoResultIfNeeded(boolean trackDiagnostics, Date startTime, CustomerInfoDataResult customerInfoDataResult, CacheFetchPolicy cacheFetchPolicy) {
        CustomerInfo customerInfo;
        PurchasesError purchasesError;
        PurchasesErrorCode code;
        EntitlementInfos entitlements;
        if (!trackDiagnostics || this.diagnosticsTrackerIfEnabled == null) {
            return;
        }
        long jBetween = DurationExtensionsKt.between(s30.b.B, startTime, this.dateProvider.getNow());
        Result<CustomerInfo, PurchasesError> result = customerInfoDataResult.getResult();
        Integer numValueOf = null;
        if (result instanceof Result.Success) {
            customerInfo = (CustomerInfo) ((Result.Success) customerInfoDataResult.getResult()).getValue();
        } else {
            if (!(result instanceof Result.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            customerInfo = null;
        }
        Result<CustomerInfo, PurchasesError> result2 = customerInfoDataResult.getResult();
        if (result2 instanceof Result.Success) {
            purchasesError = null;
        } else {
            if (!(result2 instanceof Result.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            purchasesError = (PurchasesError) ((Result.Error) customerInfoDataResult.getResult()).getValue();
        }
        DiagnosticsTracker diagnosticsTracker = this.diagnosticsTrackerIfEnabled;
        VerificationResult verification = (customerInfo == null || (entitlements = customerInfo.getEntitlements()) == null) ? null : entitlements.getVerification();
        Boolean hadUnsyncedPurchasesBefore = customerInfoDataResult.getHadUnsyncedPurchasesBefore();
        String message = purchasesError != null ? purchasesError.getMessage() : null;
        if (purchasesError != null && (code = purchasesError.getCode()) != null) {
            numValueOf = Integer.valueOf(code.getCode());
        }
        diagnosticsTracker.m121trackGetCustomerInfoResult17CK4j0(cacheFetchPolicy, verification, hadUnsyncedPurchasesBefore, message, numValueOf, jBetween);
    }

    private final void trackGetCustomerInfoStartedIfNeeded(boolean trackDiagnostics) {
        DiagnosticsTracker diagnosticsTracker;
        if (!trackDiagnostics || (diagnosticsTracker = this.diagnosticsTrackerIfEnabled) == null) {
            return;
        }
        diagnosticsTracker.trackGetCustomerInfoStarted();
    }

    private final void updateCachedCustomerInfoIfStale(String appUserID, boolean appInBackground, boolean allowSharingPlayStoreAccount) {
        LogHandler currentLogHandler;
        String strK;
        String str;
        if (this.deviceCache.isCustomerInfoCacheStale$purchases_defaultsBc8Release(appUserID, appInBackground)) {
            LogIntent logIntent = LogIntent.DEBUG;
            CustomerInfoHelper$updateCachedCustomerInfoIfStale$$inlined$log$1 customerInfoHelper$updateCachedCustomerInfoIfStale$$inlined$log$1 = new CustomerInfoHelper$updateCachedCustomerInfoIfStale$$inlined$log$1(logIntent, appInBackground);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        strK = x5.k(logLevel, new StringBuilder("[Purchases] - "));
                        str = (String) customerInfoHelper$updateCachedCustomerInfoIfStale$$inlined$log$1.invoke();
                        currentLogHandler.d(strK, str);
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) customerInfoHelper$updateCachedCustomerInfoIfStale$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w(x5.k(logLevel2, new StringBuilder("[Purchases] - ")), (String) customerInfoHelper$updateCachedCustomerInfoIfStale$$inlined$log$1.invoke());
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i(x5.k(logLevel3, new StringBuilder("[Purchases] - ")), (String) customerInfoHelper$updateCachedCustomerInfoIfStale$$inlined$log$1.invoke());
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        strK = x5.k(logLevel4, new StringBuilder("[Purchases] - "));
                        str = (String) customerInfoHelper$updateCachedCustomerInfoIfStale$$inlined$log$1.invoke();
                        currentLogHandler.d(strK, str);
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) customerInfoHelper$updateCachedCustomerInfoIfStale$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler4.i(x5.k(logLevel5, new StringBuilder("[Purchases] - ")), (String) customerInfoHelper$updateCachedCustomerInfoIfStale$$inlined$log$1.invoke());
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        strK = x5.k(logLevel6, new StringBuilder("[Purchases] - "));
                        str = (String) customerInfoHelper$updateCachedCustomerInfoIfStale$$inlined$log$1.invoke();
                        currentLogHandler.d(strK, str);
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        strK = x5.k(logLevel7, new StringBuilder("[Purchases] - "));
                        str = (String) customerInfoHelper$updateCachedCustomerInfoIfStale$$inlined$log$1.invoke();
                        currentLogHandler.d(strK, str);
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler5.w(x5.k(logLevel8, new StringBuilder("[Purchases] - ")), (String) customerInfoHelper$updateCachedCustomerInfoIfStale$$inlined$log$1.invoke());
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler6.w(x5.k(logLevel9, new StringBuilder("[Purchases] - ")), (String) customerInfoHelper$updateCachedCustomerInfoIfStale$$inlined$log$1.invoke());
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) customerInfoHelper$updateCachedCustomerInfoIfStale$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler7.w(x5.k(logLevel10, new StringBuilder("[Purchases] - ")), (String) customerInfoHelper$updateCachedCustomerInfoIfStale$$inlined$log$1.invoke());
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) customerInfoHelper$updateCachedCustomerInfoIfStale$$inlined$log$1.invoke(), null);
                    break;
            }
            postPendingPurchasesAndFetchCustomerInfo$default(this, appUserID, appInBackground, allowSharingPlayStoreAccount, null, 8, null);
        }
    }

    public final void retrieveCustomerInfo(String appUserID, CacheFetchPolicy fetchPolicy, boolean appInBackground, boolean allowSharingPlayStoreAccount, boolean trackDiagnostics, ReceiveCustomerInfoCallback callback) {
        m.e(appUserID, "appUserID");
        m.e(fetchPolicy, "fetchPolicy");
        if (this.uiPreviewMode) {
            if (callback != null) {
                dispatch(new CustomerInfoHelper$retrieveCustomerInfo$1$1(callback));
                return;
            }
            return;
        }
        LogLevel logLevel = LogLevel.DEBUG;
        LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            currentLogHandler.d(x5.k(logLevel, new StringBuilder("[Purchases] - ")), String.format(CustomerInfoStrings.RETRIEVING_CUSTOMER_INFO, Arrays.copyOf(new Object[]{fetchPolicy}, 1)));
        }
        trackGetCustomerInfoStartedIfNeeded(trackDiagnostics);
        CustomerInfoHelper$retrieveCustomerInfo$callbackWithDiagnostics$1 customerInfoHelper$retrieveCustomerInfo$callbackWithDiagnostics$1 = (callback != null || trackDiagnostics) ? new CustomerInfoHelper$retrieveCustomerInfo$callbackWithDiagnostics$1(this, trackDiagnostics, this.dateProvider.getNow(), fetchPolicy, callback) : null;
        int i = WhenMappings.$EnumSwitchMapping$0[fetchPolicy.ordinal()];
        if (i == 1) {
            getCustomerInfoCacheOnly(appUserID, customerInfoHelper$retrieveCustomerInfo$callbackWithDiagnostics$1);
            return;
        }
        if (i == 2) {
            postPendingPurchasesAndFetchCustomerInfo(appUserID, appInBackground, allowSharingPlayStoreAccount, customerInfoHelper$retrieveCustomerInfo$callbackWithDiagnostics$1);
        } else if (i == 3) {
            getCustomerInfoCachedOrFetched(appUserID, appInBackground, allowSharingPlayStoreAccount, customerInfoHelper$retrieveCustomerInfo$callbackWithDiagnostics$1);
        } else {
            if (i != 4) {
                return;
            }
            getCustomerInfoNotStaledCachedOrFetched(appUserID, appInBackground, allowSharingPlayStoreAccount, customerInfoHelper$retrieveCustomerInfo$callbackWithDiagnostics$1);
        }
    }
}
