package com.revenuecat.purchases.deeplinks;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.measurement.x5;
import com.revenuecat.purchases.CustomerInfoUpdateHandler;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.WebPurchaseRedemption;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.offlineentitlements.OfflineEntitlementsManager;
import com.revenuecat.purchases.identity.IdentityManager;
import com.revenuecat.purchases.interfaces.RedeemWebPurchaseListener;
import g00.b0;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import u00.a;
import u00.k;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0017\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u000e¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010!R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\"¨\u0006#"}, d2 = {"Lcom/revenuecat/purchases/deeplinks/WebPurchaseRedemptionHelper;", "", "Lcom/revenuecat/purchases/common/Backend;", "backend", "Lcom/revenuecat/purchases/identity/IdentityManager;", "identityManager", "Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;", "offlineEntitlementsManager", "Lcom/revenuecat/purchases/CustomerInfoUpdateHandler;", "customerInfoUpdateHandler", "Landroid/os/Handler;", "mainHandler", "<init>", "(Lcom/revenuecat/purchases/common/Backend;Lcom/revenuecat/purchases/identity/IdentityManager;Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;Lcom/revenuecat/purchases/CustomerInfoUpdateHandler;Landroid/os/Handler;)V", "Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener;", "resultListener", "Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener$Result;", "result", "Lg00/b0;", "dispatchResult", "(Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener;Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener$Result;)V", "Lkotlin/Function0;", "action", "dispatch", "(Lu00/a;)V", "Lcom/revenuecat/purchases/WebPurchaseRedemption;", "webPurchaseRedemption", "listener", "handleRedeemWebPurchase", "(Lcom/revenuecat/purchases/WebPurchaseRedemption;Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener;)V", "Lcom/revenuecat/purchases/common/Backend;", "Lcom/revenuecat/purchases/identity/IdentityManager;", "Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;", "Lcom/revenuecat/purchases/CustomerInfoUpdateHandler;", "Landroid/os/Handler;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class WebPurchaseRedemptionHelper {
    private final Backend backend;
    private final CustomerInfoUpdateHandler customerInfoUpdateHandler;
    private final IdentityManager identityManager;
    private final Handler mainHandler;
    private final OfflineEntitlementsManager offlineEntitlementsManager;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lg00/b0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass1 extends n implements a {
        final RedeemWebPurchaseListener.Result $result;
        final RedeemWebPurchaseListener $resultListener;

        public AnonymousClass1(RedeemWebPurchaseListener redeemWebPurchaseListener, RedeemWebPurchaseListener.Result result) {
            super(0);
            this.$resultListener = redeemWebPurchaseListener;
            this.$result = result;
        }

        @Override
        public Object invoke() {
            m147invoke();
            return b0.a;
        }

        public final void m147invoke() {
            this.$resultListener.handleResult(this.$result);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener$Result;", "result", "Lg00/b0;", "invoke", "(Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener$Result;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass2 extends n implements k {
        final RedeemWebPurchaseListener $listener;

        public AnonymousClass2(RedeemWebPurchaseListener redeemWebPurchaseListener) {
            super(1);
            this.$listener = redeemWebPurchaseListener;
        }

        @Override
        public Object invoke(Object obj) {
            invoke((RedeemWebPurchaseListener.Result) obj);
            return b0.a;
        }

        public final void invoke(RedeemWebPurchaseListener.Result result) {
            m.e(result, "result");
            if (!(result instanceof RedeemWebPurchaseListener.Result.Success)) {
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Error redeeming web purchase: " + result, null);
                WebPurchaseRedemptionHelper.this.dispatchResult(this.$listener, result);
                return;
            }
            LogLevel logLevel = LogLevel.DEBUG;
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                x5.w(logLevel, new StringBuilder("[Purchases] - "), currentLogHandler, "Successfully redeemed web purchase. Updating customer info.");
            }
            WebPurchaseRedemptionHelper.this.offlineEntitlementsManager.resetOfflineCustomerInfoCache();
            WebPurchaseRedemptionHelper.this.customerInfoUpdateHandler.cacheAndNotifyListeners(((RedeemWebPurchaseListener.Result.Success) result).getCustomerInfo());
            WebPurchaseRedemptionHelper.this.dispatchResult(this.$listener, result);
        }
    }

    public WebPurchaseRedemptionHelper(Backend backend, IdentityManager identityManager, OfflineEntitlementsManager offlineEntitlementsManager, CustomerInfoUpdateHandler customerInfoUpdateHandler, Handler handler) {
        m.e(backend, "backend");
        m.e(identityManager, "identityManager");
        m.e(offlineEntitlementsManager, "offlineEntitlementsManager");
        m.e(customerInfoUpdateHandler, "customerInfoUpdateHandler");
        this.backend = backend;
        this.identityManager = identityManager;
        this.offlineEntitlementsManager = offlineEntitlementsManager;
        this.customerInfoUpdateHandler = customerInfoUpdateHandler;
        this.mainHandler = handler;
    }

    public WebPurchaseRedemptionHelper(Backend backend, IdentityManager identityManager, OfflineEntitlementsManager offlineEntitlementsManager, CustomerInfoUpdateHandler customerInfoUpdateHandler, Handler handler, int i, f fVar) {
        this(backend, identityManager, offlineEntitlementsManager, customerInfoUpdateHandler, (i & 16) != 0 ? new Handler(Looper.getMainLooper()) : handler);
    }

    private final void dispatch(a action) {
        if (m.a(Thread.currentThread(), Looper.getMainLooper().getThread())) {
            action.invoke();
            return;
        }
        Handler handler = this.mainHandler;
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.post(new b4.a(9, action));
    }

    public final void dispatchResult(RedeemWebPurchaseListener resultListener, RedeemWebPurchaseListener.Result result) {
        dispatch(new AnonymousClass1(resultListener, result));
    }

    public final void handleRedeemWebPurchase(WebPurchaseRedemption webPurchaseRedemption, RedeemWebPurchaseListener listener) {
        m.e(webPurchaseRedemption, "webPurchaseRedemption");
        m.e(listener, "listener");
        LogLevel logLevel = LogLevel.DEBUG;
        LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            x5.w(logLevel, new StringBuilder("[Purchases] - "), currentLogHandler, "Starting web purchase redemption.");
        }
        this.backend.postRedeemWebPurchase(this.identityManager.getCurrentAppUserID(), webPurchaseRedemption.getRedemptionToken(), new AnonymousClass2(listener));
    }
}
