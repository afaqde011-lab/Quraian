package com.revenuecat.purchases.google.usecase;

import com.google.android.gms.internal.measurement.x5;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.networking.HTTPTimeoutManager;
import com.revenuecat.purchases.strings.BillingStrings;
import g00.b0;
import java.util.concurrent.atomic.AtomicBoolean;
import kh.r;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import qd.h;
import u00.k;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u008f\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\u000b\u0012\u001e\u0010\u000e\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\b0\u0007\u0012*\u0010\u0012\u001a&\u0012\u0004\u0012\u00020\u0010\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\b0\u000fj\u0002`\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0018\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR'\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\u001d\u001a\u0004\b \u0010\u001fR/\u0010\u000e\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0014\u0010%\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lcom/revenuecat/purchases/google/usecase/GetBillingConfigUseCase;", "Lcom/revenuecat/purchases/google/usecase/BillingClientUseCase;", "Lqd/d;", "Lcom/revenuecat/purchases/google/usecase/GetBillingConfigUseCaseParams;", "useCaseParams", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "deviceCache", "Lkotlin/Function1;", "Lg00/b0;", "onReceive", "Lcom/revenuecat/purchases/PurchasesError;", "Lcom/revenuecat/purchases/PurchasesErrorCallback;", "onError", "Lqd/a;", "withConnectedClient", "Lkotlin/Function2;", "", "Lcom/revenuecat/purchases/google/usecase/ExecuteRequestOnUIThreadFunction;", "executeRequestOnUIThread", "<init>", "(Lcom/revenuecat/purchases/google/usecase/GetBillingConfigUseCaseParams;Lcom/revenuecat/purchases/common/caching/DeviceCache;Lu00/k;Lu00/k;Lu00/k;Lu00/n;)V", "executeAsync", "()V", "received", "onOk", "(Lqd/d;)V", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "getDeviceCache", "()Lcom/revenuecat/purchases/common/caching/DeviceCache;", "Lu00/k;", "getOnReceive", "()Lu00/k;", "getOnError", "getWithConnectedClient", "", "getErrorMessage", "()Ljava/lang/String;", "errorMessage", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class GetBillingConfigUseCase extends BillingClientUseCase<qd.d> {
    private final DeviceCache deviceCache;
    private final k onError;
    private final k onReceive;
    private final k withConnectedClient;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqd/a;", "Lg00/b0;", "invoke", "(Lqd/a;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass1 extends n implements k {
        public AnonymousClass1() {
            super(1);
        }

        public static final void invoke$lambda$1(AtomicBoolean atomicBoolean, GetBillingConfigUseCase getBillingConfigUseCase, h result, qd.d dVar) {
            m.e(result, "result");
            if (!atomicBoolean.getAndSet(true)) {
                BillingClientUseCase.processResult$default(getBillingConfigUseCase, result, dVar, null, null, 12, null);
                return;
            }
            LogIntent logIntent = LogIntent.GOOGLE_ERROR;
            GetBillingConfigUseCase$executeAsync$1$invoke$lambda$1$$inlined$log$1 getBillingConfigUseCase$executeAsync$1$invoke$lambda$1$$inlined$log$1 = new GetBillingConfigUseCase$executeAsync$1$invoke$lambda$1$$inlined$log$1(logIntent, result);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        currentLogHandler.d(x5.k(logLevel, new StringBuilder("[Purchases] - ")), (String) getBillingConfigUseCase$executeAsync$1$invoke$lambda$1$$inlined$log$1.invoke());
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) getBillingConfigUseCase$executeAsync$1$invoke$lambda$1$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w(x5.k(logLevel2, new StringBuilder("[Purchases] - ")), (String) getBillingConfigUseCase$executeAsync$1$invoke$lambda$1$$inlined$log$1.invoke());
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i(x5.k(logLevel3, new StringBuilder("[Purchases] - ")), (String) getBillingConfigUseCase$executeAsync$1$invoke$lambda$1$$inlined$log$1.invoke());
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        currentLogHandler4.d(x5.k(logLevel4, new StringBuilder("[Purchases] - ")), (String) getBillingConfigUseCase$executeAsync$1$invoke$lambda$1$$inlined$log$1.invoke());
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) getBillingConfigUseCase$executeAsync$1$invoke$lambda$1$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler5.i(x5.k(logLevel5, new StringBuilder("[Purchases] - ")), (String) getBillingConfigUseCase$executeAsync$1$invoke$lambda$1$$inlined$log$1.invoke());
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        currentLogHandler6.d(x5.k(logLevel6, new StringBuilder("[Purchases] - ")), (String) getBillingConfigUseCase$executeAsync$1$invoke$lambda$1$$inlined$log$1.invoke());
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        currentLogHandler7.d(x5.k(logLevel7, new StringBuilder("[Purchases] - ")), (String) getBillingConfigUseCase$executeAsync$1$invoke$lambda$1$$inlined$log$1.invoke());
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler8.w(x5.k(logLevel8, new StringBuilder("[Purchases] - ")), (String) getBillingConfigUseCase$executeAsync$1$invoke$lambda$1$$inlined$log$1.invoke());
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler9.w(x5.k(logLevel9, new StringBuilder("[Purchases] - ")), (String) getBillingConfigUseCase$executeAsync$1$invoke$lambda$1$$inlined$log$1.invoke());
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) getBillingConfigUseCase$executeAsync$1$invoke$lambda$1$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler10.w(x5.k(logLevel10, new StringBuilder("[Purchases] - ")), (String) getBillingConfigUseCase$executeAsync$1$invoke$lambda$1$$inlined$log$1.invoke());
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) getBillingConfigUseCase$executeAsync$1$invoke$lambda$1$$inlined$log$1.invoke(), null);
                    break;
            }
        }

        @Override
        public Object invoke(Object obj) {
            invoke((qd.a) obj);
            return b0.a;
        }

        public final void invoke(qd.a invoke) {
            m.e(invoke, "$this$invoke");
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            final GetBillingConfigUseCase getBillingConfigUseCase = GetBillingConfigUseCase.this;
            ?? r1 = new Object() {
                public final void a(h hVar, qd.d dVar) {
                    GetBillingConfigUseCase.AnonymousClass1.invoke$lambda$1(atomicBoolean, getBillingConfigUseCase, hVar, dVar);
                }
            };
            qd.b bVar = (qd.b) invoke;
            if (qd.b.k(new qd.b0(bVar, (b) r1), HTTPTimeoutManager.DEFAULT_TIMEOUT_MS, new r(bVar, (Object) r1, 13), bVar.l(), bVar.j()) == null) {
                h hVarO = bVar.o();
                bVar.x(25, 13, hVarO);
                r1.a(hVarO, null);
            }
        }
    }

    public GetBillingConfigUseCase(GetBillingConfigUseCaseParams useCaseParams, DeviceCache deviceCache, k onReceive, k onError, k withConnectedClient, u00.n executeRequestOnUIThread) {
        super(useCaseParams, onError, executeRequestOnUIThread);
        m.e(useCaseParams, "useCaseParams");
        m.e(deviceCache, "deviceCache");
        m.e(onReceive, "onReceive");
        m.e(onError, "onError");
        m.e(withConnectedClient, "withConnectedClient");
        m.e(executeRequestOnUIThread, "executeRequestOnUIThread");
        this.deviceCache = deviceCache;
        this.onReceive = onReceive;
        this.onError = onError;
        this.withConnectedClient = withConnectedClient;
    }

    @Override
    public void executeAsync() {
        this.withConnectedClient.invoke(new AnonymousClass1());
    }

    public final DeviceCache getDeviceCache() {
        return this.deviceCache;
    }

    @Override
    public String getErrorMessage() {
        return "Error getting billing config";
    }

    public final k getOnError() {
        return this.onError;
    }

    public final k getOnReceive() {
        return this.onReceive;
    }

    public final k getWithConnectedClient() {
        return this.withConnectedClient;
    }

    @Override
    public void onOk(qd.d received) {
        if (received == null) {
            this.onError.invoke(new PurchasesError(PurchasesErrorCode.StoreProblemError, BillingStrings.BILLING_CONFIG_NULL_ON_SUCCESS));
            return;
        }
        DeviceCache deviceCache = this.deviceCache;
        String str = received.a;
        m.d(str, "received.countryCode");
        deviceCache.setStorefront$purchases_defaultsBc8Release(str);
        this.onReceive.invoke(received);
    }
}
