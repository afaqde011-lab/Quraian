package com.revenuecat.purchases.amazon.handler;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.amazon.device.iap.model.PurchaseResponse;
import com.amazon.device.iap.model.Receipt;
import com.amazon.device.iap.model.RequestId;
import com.amazon.device.iap.model.UserData;
import com.google.android.gms.internal.measurement.x5;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.amazon.AmazonStrings;
import com.revenuecat.purchases.amazon.PurchasingServiceProvider;
import com.revenuecat.purchases.amazon.listener.PurchaseResponseListener;
import com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivity;
import com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivityBroadcastReceiver;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import com.revenuecat.purchases.common.DurationExtensionsKt;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.models.StoreProduct;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import s30.b;
import u00.k;
import u00.n;

@Metadata(d1 = {"\u0000\u0081\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u001c\b\u0000\u0018\u00002\u00020\u0001:\u00012B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJU\u0010\u001a\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0018\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00122\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00150\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJM\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0018\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00122\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00150\u0017H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ]\u0010!\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0011\u001a\u00020\u00102\u0018\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00122\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00150\u0017H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u00152\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010(R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010)R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010*R \u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020,0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R \u00101\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u0002000+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010.¨\u00063"}, d2 = {"Lcom/revenuecat/purchases/amazon/handler/PurchaseHandler;", "Lcom/revenuecat/purchases/amazon/listener/PurchaseResponseListener;", "Lcom/revenuecat/purchases/amazon/PurchasingServiceProvider;", "purchasingServiceProvider", "Landroid/content/Context;", "applicationContext", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "diagnosticsTrackerIfEnabled", "Lcom/revenuecat/purchases/common/DateProvider;", "dateProvider", "<init>", "(Lcom/revenuecat/purchases/amazon/PurchasingServiceProvider;Landroid/content/Context;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;Lcom/revenuecat/purchases/common/DateProvider;)V", "Landroid/os/Handler;", "mainHandler", "Landroid/app/Activity;", "activity", "Lcom/revenuecat/purchases/models/StoreProduct;", "storeProduct", "Lkotlin/Function2;", "Lcom/amazon/device/iap/model/Receipt;", "Lcom/amazon/device/iap/model/UserData;", "Lg00/b0;", "onSuccess", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/PurchasesError;", "onError", "startProxyActivity", "(Landroid/os/Handler;Landroid/app/Activity;Lcom/revenuecat/purchases/models/StoreProduct;Lu00/n;Lu00/k;)V", "com/revenuecat/purchases/amazon/handler/PurchaseHandler$createRequestIdResultReceiver$1", "createRequestIdResultReceiver", "(Landroid/os/Handler;Lcom/revenuecat/purchases/models/StoreProduct;Lu00/n;Lu00/k;)Lcom/revenuecat/purchases/amazon/handler/PurchaseHandler$createRequestIdResultReceiver$1;", "", "appUserID", "purchase", "(Landroid/os/Handler;Landroid/app/Activity;Ljava/lang/String;Lcom/revenuecat/purchases/models/StoreProduct;Lu00/n;Lu00/k;)V", "Lcom/amazon/device/iap/model/PurchaseResponse;", "response", "onPurchaseResponse", "(Lcom/amazon/device/iap/model/PurchaseResponse;)V", "Lcom/revenuecat/purchases/amazon/PurchasingServiceProvider;", "Landroid/content/Context;", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "Lcom/revenuecat/purchases/common/DateProvider;", "", "Lcom/revenuecat/purchases/ProductType;", "productTypes", "Ljava/util/Map;", "Lcom/amazon/device/iap/model/RequestId;", "Lcom/revenuecat/purchases/amazon/handler/PurchaseHandler$PurchaseRequest;", "purchaseCallbacks", "PurchaseRequest", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PurchaseHandler implements PurchaseResponseListener {
    private final Context applicationContext;
    private final DateProvider dateProvider;
    private final DiagnosticsTracker diagnosticsTrackerIfEnabled;
    private final Map<String, ProductType> productTypes;
    private final Map<RequestId, PurchaseRequest> purchaseCallbacks;
    private final PurchasingServiceProvider purchasingServiceProvider;

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0082\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\"\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001c\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u000bHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017JV\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\b\u0002\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00062\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u000bHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0013R)\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b)\u0010\u0015R#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010*\u001a\u0004\b+\u0010\u0017¨\u0006,"}, d2 = {"Lcom/revenuecat/purchases/amazon/handler/PurchaseHandler$PurchaseRequest;", "", "Lcom/revenuecat/purchases/models/StoreProduct;", "storeProduct", "Ljava/util/Date;", "startTime", "Lkotlin/Function2;", "Lcom/amazon/device/iap/model/Receipt;", "Lcom/amazon/device/iap/model/UserData;", "Lg00/b0;", "onSuccess", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/PurchasesError;", "onError", "<init>", "(Lcom/revenuecat/purchases/models/StoreProduct;Ljava/util/Date;Lu00/n;Lu00/k;)V", "component1", "()Lcom/revenuecat/purchases/models/StoreProduct;", "component2", "()Ljava/util/Date;", "component3", "()Lu00/n;", "component4", "()Lu00/k;", "copy", "(Lcom/revenuecat/purchases/models/StoreProduct;Ljava/util/Date;Lu00/n;Lu00/k;)Lcom/revenuecat/purchases/amazon/handler/PurchaseHandler$PurchaseRequest;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/revenuecat/purchases/models/StoreProduct;", "getStoreProduct", "Ljava/util/Date;", "getStartTime", "Lu00/n;", "getOnSuccess", "Lu00/k;", "getOnError", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PurchaseRequest {
        private final k onError;
        private final n onSuccess;
        private final Date startTime;
        private final StoreProduct storeProduct;

        public PurchaseRequest(StoreProduct storeProduct, Date startTime, n onSuccess, k onError) {
            m.e(storeProduct, "storeProduct");
            m.e(startTime, "startTime");
            m.e(onSuccess, "onSuccess");
            m.e(onError, "onError");
            this.storeProduct = storeProduct;
            this.startTime = startTime;
            this.onSuccess = onSuccess;
            this.onError = onError;
        }

        public static PurchaseRequest copy$default(PurchaseRequest purchaseRequest, StoreProduct storeProduct, Date date, n nVar, k kVar, int i, Object obj) {
            if ((i & 1) != 0) {
                storeProduct = purchaseRequest.storeProduct;
            }
            if ((i & 2) != 0) {
                date = purchaseRequest.startTime;
            }
            if ((i & 4) != 0) {
                nVar = purchaseRequest.onSuccess;
            }
            if ((i & 8) != 0) {
                kVar = purchaseRequest.onError;
            }
            return purchaseRequest.copy(storeProduct, date, nVar, kVar);
        }

        public final StoreProduct getStoreProduct() {
            return this.storeProduct;
        }

        public final Date getStartTime() {
            return this.startTime;
        }

        public final n getOnSuccess() {
            return this.onSuccess;
        }

        public final k getOnError() {
            return this.onError;
        }

        public final PurchaseRequest copy(StoreProduct storeProduct, Date startTime, n onSuccess, k onError) {
            m.e(storeProduct, "storeProduct");
            m.e(startTime, "startTime");
            m.e(onSuccess, "onSuccess");
            m.e(onError, "onError");
            return new PurchaseRequest(storeProduct, startTime, onSuccess, onError);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PurchaseRequest)) {
                return false;
            }
            PurchaseRequest purchaseRequest = (PurchaseRequest) other;
            return m.a(this.storeProduct, purchaseRequest.storeProduct) && m.a(this.startTime, purchaseRequest.startTime) && m.a(this.onSuccess, purchaseRequest.onSuccess) && m.a(this.onError, purchaseRequest.onError);
        }

        public final k getOnError() {
            return this.onError;
        }

        public final n getOnSuccess() {
            return this.onSuccess;
        }

        public final Date getStartTime() {
            return this.startTime;
        }

        public final StoreProduct getStoreProduct() {
            return this.storeProduct;
        }

        public int hashCode() {
            return this.onError.hashCode() + ((this.onSuccess.hashCode() + ((this.startTime.hashCode() + (this.storeProduct.hashCode() * 31)) * 31)) * 31);
        }

        public String toString() {
            return "PurchaseRequest(storeProduct=" + this.storeProduct + ", startTime=" + this.startTime + ", onSuccess=" + this.onSuccess + ", onError=" + this.onError + ')';
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PurchaseResponse.RequestStatus.values().length];
            try {
                iArr[PurchaseResponse.RequestStatus.SUCCESSFUL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PurchaseResponse.RequestStatus.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PurchaseResponse.RequestStatus.INVALID_SKU.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PurchaseResponse.RequestStatus.ALREADY_PURCHASED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PurchaseResponse.RequestStatus.NOT_SUPPORTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PurchaseHandler(PurchasingServiceProvider purchasingServiceProvider, Context applicationContext, DiagnosticsTracker diagnosticsTracker, DateProvider dateProvider) {
        m.e(purchasingServiceProvider, "purchasingServiceProvider");
        m.e(applicationContext, "applicationContext");
        m.e(dateProvider, "dateProvider");
        this.purchasingServiceProvider = purchasingServiceProvider;
        this.applicationContext = applicationContext;
        this.diagnosticsTrackerIfEnabled = diagnosticsTracker;
        this.dateProvider = dateProvider;
        this.productTypes = new LinkedHashMap();
        this.purchaseCallbacks = new LinkedHashMap();
    }

    public PurchaseHandler(PurchasingServiceProvider purchasingServiceProvider, Context context, DiagnosticsTracker diagnosticsTracker, DateProvider dateProvider, int i, f fVar) {
        this(purchasingServiceProvider, context, diagnosticsTracker, (i & 8) != 0 ? new DefaultDateProvider() : dateProvider);
    }

    private final AnonymousClass1 createRequestIdResultReceiver(Handler mainHandler, final StoreProduct storeProduct, final n onSuccess, final k onError) {
        return new ResultReceiver(mainHandler) {
            @Override
            public void onReceiveResult(int resultCode, Bundle resultData) {
                Object obj;
                PurchaseHandler purchaseHandler = this;
                StoreProduct storeProduct2 = storeProduct;
                n nVar = onSuccess;
                k kVar = onError;
                synchronized (purchaseHandler) {
                    if (resultData != null) {
                        try {
                            obj = resultData.get(ProxyAmazonBillingActivity.EXTRAS_REQUEST_ID);
                        } catch (Throwable th) {
                            throw th;
                        }
                    } else {
                        obj = null;
                    }
                    RequestId requestId = obj instanceof RequestId ? (RequestId) obj : null;
                    if (requestId != null) {
                        purchaseHandler.purchaseCallbacks.put(requestId, new PurchaseRequest(storeProduct2, purchaseHandler.dateProvider.getNow(), nVar, kVar));
                        purchaseHandler.productTypes.put(storeProduct2.getId(), storeProduct2.getType());
                    } else {
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "No RequestId coming from ProxyAmazonBillingActivity", null);
                    }
                }
            }
        };
    }

    private final void startProxyActivity(Handler mainHandler, Activity activity, StoreProduct storeProduct, n onSuccess, k onError) {
        activity.startActivity(ProxyAmazonBillingActivity.INSTANCE.newStartIntent(activity, createRequestIdResultReceiver(mainHandler, storeProduct, onSuccess, onError), storeProduct.getId(), this.purchasingServiceProvider));
    }

    public void onPurchaseResponse(PurchaseResponse response) throws Exception {
        LogHandler currentLogHandler;
        String str;
        String str2;
        PurchaseRequest purchaseRequestRemove;
        PurchasesError purchasesError;
        PurchasesErrorCode code;
        m.e(response, "response");
        try {
            LogIntent logIntent = LogIntent.DEBUG;
            PurchaseHandler$onPurchaseResponse$$inlined$log$1 purchaseHandler$onPurchaseResponse$$inlined$log$1 = new PurchaseHandler$onPurchaseResponse$$inlined$log$1(logIntent, response);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        currentLogHandler2.d("[Purchases] - " + logLevel.name(), (String) purchaseHandler$onPurchaseResponse$$inlined$log$1.invoke());
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchaseHandler$onPurchaseResponse$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler3.w("[Purchases] - " + logLevel2.name(), (String) purchaseHandler$onPurchaseResponse$$inlined$log$1.invoke());
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler4.i("[Purchases] - " + logLevel3.name(), (String) purchaseHandler$onPurchaseResponse$$inlined$log$1.invoke());
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        str = "[Purchases] - " + logLevel4.name();
                        str2 = (String) purchaseHandler$onPurchaseResponse$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Exception in onPurchaseResponse", e);
                    throw e;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchaseHandler$onPurchaseResponse$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler5.i("[Purchases] - " + logLevel5.name(), (String) purchaseHandler$onPurchaseResponse$$inlined$log$1.invoke());
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        str = "[Purchases] - " + logLevel6.name();
                        str2 = (String) purchaseHandler$onPurchaseResponse$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Exception in onPurchaseResponse", e);
                    throw e;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        str = "[Purchases] - " + logLevel7.name();
                        str2 = (String) purchaseHandler$onPurchaseResponse$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Exception in onPurchaseResponse", e);
                    throw e;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler6.w("[Purchases] - " + logLevel8.name(), (String) purchaseHandler$onPurchaseResponse$$inlined$log$1.invoke());
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler7.w("[Purchases] - " + logLevel9.name(), (String) purchaseHandler$onPurchaseResponse$$inlined$log$1.invoke());
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchaseHandler$onPurchaseResponse$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler8.w("[Purchases] - " + logLevel10.name(), (String) purchaseHandler$onPurchaseResponse$$inlined$log$1.invoke());
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchaseHandler$onPurchaseResponse$$inlined$log$1.invoke(), null);
                    break;
            }
            ProxyAmazonBillingActivityBroadcastReceiver.Companion companion = ProxyAmazonBillingActivityBroadcastReceiver.INSTANCE;
            String packageName = this.applicationContext.getPackageName();
            m.d(packageName, "applicationContext.packageName");
            this.applicationContext.sendBroadcast(companion.newPurchaseFinishedIntent(packageName));
            RequestId requestId = response.getRequestId();
            synchronized (this) {
                purchaseRequestRemove = this.purchaseCallbacks.remove(requestId);
            }
            if (purchaseRequestRemove != null) {
                StoreProduct storeProduct = purchaseRequestRemove.getStoreProduct();
                Date startTime = purchaseRequestRemove.getStartTime();
                n onSuccess = purchaseRequestRemove.getOnSuccess();
                k onError = purchaseRequestRemove.getOnError();
                PurchaseResponse.RequestStatus requestStatus = response.getRequestStatus();
                int i = requestStatus == null ? -1 : WhenMappings.$EnumSwitchMapping$0[requestStatus.ordinal()];
                if (i == 1) {
                    purchasesError = null;
                } else if (i == 2) {
                    purchasesError = new PurchasesError(PurchasesErrorCode.PurchaseCancelledError, AmazonStrings.ERROR_PURCHASE_FAILED);
                } else if (i == 3) {
                    purchasesError = new PurchasesError(PurchasesErrorCode.ProductNotAvailableForPurchaseError, AmazonStrings.ERROR_PURCHASE_INVALID_SKU);
                } else if (i != 4) {
                    purchasesError = i != 5 ? new PurchasesError(PurchasesErrorCode.StoreProblemError, AmazonStrings.ERROR_PURCHASE_UNKNOWN) : new PurchasesError(PurchasesErrorCode.StoreProblemError, AmazonStrings.ERROR_PURCHASE_NOT_SUPPORTED);
                } else {
                    purchasesError = new PurchasesError(PurchasesErrorCode.ProductAlreadyPurchasedError, AmazonStrings.ERROR_PURCHASE_ALREADY_OWNED);
                }
                DiagnosticsTracker diagnosticsTracker = this.diagnosticsTrackerIfEnabled;
                if (diagnosticsTracker != null) {
                    diagnosticsTracker.m118trackAmazonPurchaseAttempt9VgGkz4(storeProduct.getId(), response.getRequestStatus().name(), (purchasesError == null || (code = purchasesError.getCode()) == null) ? null : Integer.valueOf(code.getCode()), purchasesError != null ? purchasesError.getMessage() : null, DurationExtensionsKt.between(b.B, startTime, this.dateProvider.getNow()));
                }
                if (purchasesError != null) {
                    onError.invoke(purchasesError);
                    return;
                }
                Receipt receipt = response.getReceipt();
                m.d(receipt, "response.receipt");
                UserData userData = response.getUserData();
                m.d(userData, "response.userData");
                onSuccess.invoke(receipt, userData);
            }
        } catch (Exception e) {
            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Exception in onPurchaseResponse", e);
            throw e;
        }
    }

    @Override
    public void purchase(Handler mainHandler, Activity activity, String appUserID, StoreProduct storeProduct, n onSuccess, k onError) {
        LogHandler currentLogHandler;
        String strK;
        String str;
        m.e(mainHandler, "mainHandler");
        m.e(activity, "activity");
        m.e(appUserID, "appUserID");
        m.e(storeProduct, "storeProduct");
        m.e(onSuccess, "onSuccess");
        m.e(onError, "onError");
        LogIntent logIntent = LogIntent.PURCHASE;
        PurchaseHandler$purchase$$inlined$log$1 purchaseHandler$purchase$$inlined$log$1 = new PurchaseHandler$purchase$$inlined$log$1(logIntent, storeProduct);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    strK = x5.k(logLevel, new StringBuilder("[Purchases] - "));
                    str = (String) purchaseHandler$purchase$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchaseHandler$purchase$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w(x5.k(logLevel2, new StringBuilder("[Purchases] - ")), (String) purchaseHandler$purchase$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i(x5.k(logLevel3, new StringBuilder("[Purchases] - ")), (String) purchaseHandler$purchase$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    strK = x5.k(logLevel4, new StringBuilder("[Purchases] - "));
                    str = (String) purchaseHandler$purchase$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchaseHandler$purchase$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i(x5.k(logLevel5, new StringBuilder("[Purchases] - ")), (String) purchaseHandler$purchase$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    strK = x5.k(logLevel6, new StringBuilder("[Purchases] - "));
                    str = (String) purchaseHandler$purchase$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    strK = x5.k(logLevel7, new StringBuilder("[Purchases] - "));
                    str = (String) purchaseHandler$purchase$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w(x5.k(logLevel8, new StringBuilder("[Purchases] - ")), (String) purchaseHandler$purchase$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w(x5.k(logLevel9, new StringBuilder("[Purchases] - ")), (String) purchaseHandler$purchase$$inlined$log$1.invoke());
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchaseHandler$purchase$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w(x5.k(logLevel10, new StringBuilder("[Purchases] - ")), (String) purchaseHandler$purchase$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchaseHandler$purchase$$inlined$log$1.invoke(), null);
                break;
        }
        startProxyActivity(mainHandler, activity, storeProduct, onSuccess, onError);
    }
}
