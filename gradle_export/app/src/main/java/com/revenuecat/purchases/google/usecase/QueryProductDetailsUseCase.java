package com.revenuecat.purchases.google.usecase;

import com.google.android.gms.internal.measurement.x5;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.DurationExtensionsKt;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.google.BillingClientParamBuildersKt;
import com.revenuecat.purchases.google.ProductTypeConversionsKt;
import com.revenuecat.purchases.google.QueryProductDetailsParamsBuilderException;
import com.revenuecat.purchases.google.StoreProductConversionsKt;
import g00.b0;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import qd.h;
import qd.p;
import qd.q;
import qd.w;
import qd.x;
import qd.z;
import u00.k;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0012\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0091\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u001c\u0010\n\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\b0\u0005j\u0002`\t\u0012\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\u0005j\u0002`\f\u0012\u001e\u0010\u000f\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b0\u0005\u0012\u0004\u0012\u00020\b0\u0005\u0012*\u0010\u0013\u001a&\u0012\u0004\u0012\u00020\u0011\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\b0\u0005\u0012\u0004\u0012\u00020\b0\u0010j\u0002`\u0012¢\u0006\u0004\b\u0014\u0010\u0015J5\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ5\u0010$\u001a\u00020\b2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00170\u00192\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u00172\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\bH\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020\b2\u0006\u0010,\u001a\u00020\u0002H\u0016¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010/R-\u0010\n\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\b0\u0005j\u0002`\t8\u0006¢\u0006\f\n\u0004\b\n\u00100\u001a\u0004\b1\u00102R'\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\u0005j\u0002`\f8\u0006¢\u0006\f\n\u0004\b\r\u00100\u001a\u0004\b3\u00102R/\u0010\u000f\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b0\u0005\u0012\u0004\u0012\u00020\b0\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u00100\u001a\u0004\b4\u00102R\u0014\u00107\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00106¨\u00068"}, d2 = {"Lcom/revenuecat/purchases/google/usecase/QueryProductDetailsUseCase;", "Lcom/revenuecat/purchases/google/usecase/BillingClientUseCase;", "Lqd/x;", "Lcom/revenuecat/purchases/google/usecase/QueryProductDetailsUseCaseParams;", "useCaseParams", "Lkotlin/Function1;", "", "Lcom/revenuecat/purchases/models/StoreProduct;", "Lg00/b0;", "Lcom/revenuecat/purchases/common/StoreProductsCallback;", "onReceive", "Lcom/revenuecat/purchases/PurchasesError;", "Lcom/revenuecat/purchases/PurchasesErrorCallback;", "onError", "Lqd/a;", "withConnectedClient", "Lkotlin/Function2;", "", "Lcom/revenuecat/purchases/google/usecase/ExecuteRequestOnUIThreadFunction;", "executeRequestOnUIThread", "<init>", "(Lcom/revenuecat/purchases/google/usecase/QueryProductDetailsUseCaseParams;Lu00/k;Lu00/k;Lu00/k;Lu00/n;)V", "billingClient", "", "productType", "", "productIds", "Lqd/q;", "listener", "queryProductDetailsAsyncEnsuringOneResponse", "(Lqd/a;Ljava/lang/String;Ljava/util/Set;Lqd/q;)V", "requestedProductIds", "Lqd/h;", "billingResult", "Ljava/util/Date;", "requestStartTime", "trackGoogleQueryProductDetailsRequestIfNeeded", "(Ljava/util/Set;Ljava/lang/String;Lqd/h;Ljava/util/Date;)V", "", "statusCode", "convertUnfetchedProductStatusCodeToString", "(I)Ljava/lang/String;", "executeAsync", "()V", "received", "onOk", "(Lqd/x;)V", "Lcom/revenuecat/purchases/google/usecase/QueryProductDetailsUseCaseParams;", "Lu00/k;", "getOnReceive", "()Lu00/k;", "getOnError", "getWithConnectedClient", "getErrorMessage", "()Ljava/lang/String;", "errorMessage", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class QueryProductDetailsUseCase extends BillingClientUseCase<x> {
    private final k onError;
    private final k onReceive;
    private final QueryProductDetailsUseCaseParams useCaseParams;
    private final k withConnectedClient;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqd/a;", "Lg00/b0;", "invoke", "(Lqd/a;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass2 extends n implements k {
        final Set<String> $nonEmptyProductIds;

        public AnonymousClass2(Set<String> set) {
            super(1);
            this.$nonEmptyProductIds = set;
        }

        @Override
        public Object invoke(Object obj) throws Throwable {
            invoke((qd.a) obj);
            return b0.a;
        }

        public final void invoke(qd.a invoke) throws Throwable {
            m.e(invoke, "$this$invoke");
            String googleProductType = ProductTypeConversionsKt.toGoogleProductType(QueryProductDetailsUseCase.this.useCaseParams.getProductType());
            if (googleProductType == null) {
                googleProductType = "inapp";
            }
            try {
                QueryProductDetailsUseCase queryProductDetailsUseCase = QueryProductDetailsUseCase.this;
                queryProductDetailsUseCase.queryProductDetailsAsyncEnsuringOneResponse(invoke, googleProductType, this.$nonEmptyProductIds, new a(queryProductDetailsUseCase));
            } catch (QueryProductDetailsParamsBuilderException e) {
                k onError = QueryProductDetailsUseCase.this.getOnError();
                PurchasesErrorCode purchasesErrorCode = PurchasesErrorCode.StoreProblemError;
                StringBuilder sb = new StringBuilder();
                sb.append(e.getMessage());
                sb.append(": ");
                Throwable cause = e.getCause();
                sb.append(cause != null ? cause.getMessage() : null);
                onError.invoke(new PurchasesError(purchasesErrorCode, sb.toString()));
            }
        }
    }

    public QueryProductDetailsUseCase(QueryProductDetailsUseCaseParams useCaseParams, k onReceive, k onError, k withConnectedClient, u00.n executeRequestOnUIThread) {
        super(useCaseParams, onError, executeRequestOnUIThread);
        m.e(useCaseParams, "useCaseParams");
        m.e(onReceive, "onReceive");
        m.e(onError, "onError");
        m.e(withConnectedClient, "withConnectedClient");
        m.e(executeRequestOnUIThread, "executeRequestOnUIThread");
        this.useCaseParams = useCaseParams;
        this.onReceive = onReceive;
        this.onError = onError;
        this.withConnectedClient = withConnectedClient;
    }

    public final String convertUnfetchedProductStatusCodeToString(int statusCode) {
        if (statusCode == 0) {
            return "UNKNOWN";
        }
        if (statusCode == 2) {
            return "INVALID_PRODUCT_ID_FORMAT";
        }
        if (statusCode != 3) {
            return statusCode != 4 ? g4.c.f(statusCode, "UNKNOWN_STATUS_CODE: ") : "NO_ELIGIBLE_OFFER";
        }
        return "PRODUCT_NOT_FOUND";
    }

    public final synchronized void queryProductDetailsAsyncEnsuringOneResponse(qd.a billingClient, final String productType, final Set<String> productIds, final q listener) throws Throwable {
        try {
            try {
                w wVarBuildQueryProductDetailsParams = BillingClientParamBuildersKt.buildQueryProductDetailsParams(productType, productIds);
                final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                final Date now = this.useCaseParams.getDateProvider().getNow();
                billingClient.f(wVarBuildQueryProductDetailsParams, (c) new q() {
                    public final void b(h hVar, x xVar) {
                        QueryProductDetailsUseCase.queryProductDetailsAsyncEnsuringOneResponse$lambda$14(atomicBoolean, this, productIds, productType, now, listener, hVar, xVar);
                    }
                });
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public static final void queryProductDetailsAsyncEnsuringOneResponse$lambda$14(AtomicBoolean atomicBoolean, QueryProductDetailsUseCase queryProductDetailsUseCase, Set set, String str, Date date, q qVar, h billingResult, x productDetailsList) {
        m.e(billingResult, "billingResult");
        m.e(productDetailsList, "productDetailsList");
        if (!atomicBoolean.getAndSet(true)) {
            queryProductDetailsUseCase.trackGoogleQueryProductDetailsRequestIfNeeded(set, str, billingResult, date);
            qVar.b(billingResult, productDetailsList);
            return;
        }
        LogIntent logIntent = LogIntent.GOOGLE_ERROR;
        QueryProductDetailsUseCase$queryProductDetailsAsyncEnsuringOneResponse$lambda$14$$inlined$log$1 queryProductDetailsUseCase$queryProductDetailsAsyncEnsuringOneResponse$lambda$14$$inlined$log$1 = new QueryProductDetailsUseCase$queryProductDetailsAsyncEnsuringOneResponse$lambda$14$$inlined$log$1(logIntent, billingResult);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    currentLogHandler.d(x5.k(logLevel, new StringBuilder("[Purchases] - ")), (String) queryProductDetailsUseCase$queryProductDetailsAsyncEnsuringOneResponse$lambda$14$$inlined$log$1.invoke());
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) queryProductDetailsUseCase$queryProductDetailsAsyncEnsuringOneResponse$lambda$14$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w(x5.k(logLevel2, new StringBuilder("[Purchases] - ")), (String) queryProductDetailsUseCase$queryProductDetailsAsyncEnsuringOneResponse$lambda$14$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i(x5.k(logLevel3, new StringBuilder("[Purchases] - ")), (String) queryProductDetailsUseCase$queryProductDetailsAsyncEnsuringOneResponse$lambda$14$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    currentLogHandler4.d(x5.k(logLevel4, new StringBuilder("[Purchases] - ")), (String) queryProductDetailsUseCase$queryProductDetailsAsyncEnsuringOneResponse$lambda$14$$inlined$log$1.invoke());
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) queryProductDetailsUseCase$queryProductDetailsAsyncEnsuringOneResponse$lambda$14$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler5.i(x5.k(logLevel5, new StringBuilder("[Purchases] - ")), (String) queryProductDetailsUseCase$queryProductDetailsAsyncEnsuringOneResponse$lambda$14$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    currentLogHandler6.d(x5.k(logLevel6, new StringBuilder("[Purchases] - ")), (String) queryProductDetailsUseCase$queryProductDetailsAsyncEnsuringOneResponse$lambda$14$$inlined$log$1.invoke());
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    currentLogHandler7.d(x5.k(logLevel7, new StringBuilder("[Purchases] - ")), (String) queryProductDetailsUseCase$queryProductDetailsAsyncEnsuringOneResponse$lambda$14$$inlined$log$1.invoke());
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler8.w(x5.k(logLevel8, new StringBuilder("[Purchases] - ")), (String) queryProductDetailsUseCase$queryProductDetailsAsyncEnsuringOneResponse$lambda$14$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler9.w(x5.k(logLevel9, new StringBuilder("[Purchases] - ")), (String) queryProductDetailsUseCase$queryProductDetailsAsyncEnsuringOneResponse$lambda$14$$inlined$log$1.invoke());
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) queryProductDetailsUseCase$queryProductDetailsAsyncEnsuringOneResponse$lambda$14$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler10.w(x5.k(logLevel10, new StringBuilder("[Purchases] - ")), (String) queryProductDetailsUseCase$queryProductDetailsAsyncEnsuringOneResponse$lambda$14$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) queryProductDetailsUseCase$queryProductDetailsAsyncEnsuringOneResponse$lambda$14$$inlined$log$1.invoke(), null);
                break;
        }
    }

    private final void trackGoogleQueryProductDetailsRequestIfNeeded(Set<String> requestedProductIds, String productType, h billingResult, Date requestStartTime) {
        DiagnosticsTracker diagnosticsTrackerIfEnabled = this.useCaseParams.getDiagnosticsTrackerIfEnabled();
        if (diagnosticsTrackerIfEnabled != null) {
            int i = billingResult.a;
            String str = billingResult.c;
            m.d(str, "billingResult.debugMessage");
            diagnosticsTrackerIfEnabled.m124trackGoogleQueryProductDetailsRequest9VgGkz4(requestedProductIds, productType, i, str, DurationExtensionsKt.between(s30.b.B, requestStartTime, this.useCaseParams.getDateProvider().getNow()));
        }
    }

    @Override
    public void executeAsync() {
        LogHandler currentLogHandler;
        String strK;
        String str;
        Set<String> productIds = this.useCaseParams.getProductIds();
        ArrayList arrayList = new ArrayList();
        for (Object obj : productIds) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        Set setR1 = h00.q.r1(arrayList);
        if (!setR1.isEmpty()) {
            this.withConnectedClient.invoke(new AnonymousClass2(setR1));
            return;
        }
        LogIntent logIntent = LogIntent.DEBUG;
        QueryProductDetailsUseCase$executeAsync$$inlined$log$1 queryProductDetailsUseCase$executeAsync$$inlined$log$1 = new QueryProductDetailsUseCase$executeAsync$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    strK = x5.k(logLevel, new StringBuilder("[Purchases] - "));
                    str = (String) queryProductDetailsUseCase$executeAsync$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) queryProductDetailsUseCase$executeAsync$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w(x5.k(logLevel2, new StringBuilder("[Purchases] - ")), (String) queryProductDetailsUseCase$executeAsync$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i(x5.k(logLevel3, new StringBuilder("[Purchases] - ")), (String) queryProductDetailsUseCase$executeAsync$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    strK = x5.k(logLevel4, new StringBuilder("[Purchases] - "));
                    str = (String) queryProductDetailsUseCase$executeAsync$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) queryProductDetailsUseCase$executeAsync$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i(x5.k(logLevel5, new StringBuilder("[Purchases] - ")), (String) queryProductDetailsUseCase$executeAsync$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    strK = x5.k(logLevel6, new StringBuilder("[Purchases] - "));
                    str = (String) queryProductDetailsUseCase$executeAsync$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    strK = x5.k(logLevel7, new StringBuilder("[Purchases] - "));
                    str = (String) queryProductDetailsUseCase$executeAsync$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w(x5.k(logLevel8, new StringBuilder("[Purchases] - ")), (String) queryProductDetailsUseCase$executeAsync$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w(x5.k(logLevel9, new StringBuilder("[Purchases] - ")), (String) queryProductDetailsUseCase$executeAsync$$inlined$log$1.invoke());
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) queryProductDetailsUseCase$executeAsync$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w(x5.k(logLevel10, new StringBuilder("[Purchases] - ")), (String) queryProductDetailsUseCase$executeAsync$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) queryProductDetailsUseCase$executeAsync$$inlined$log$1.invoke(), null);
                break;
        }
        this.onReceive.invoke(h00.x.A);
    }

    @Override
    public String getErrorMessage() {
        return "Error when fetching products";
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
    public void onOk(x received) {
        LogHandler currentLogHandler;
        String strK;
        Object objInvoke;
        LogHandler currentLogHandler2;
        String strK2;
        Object objInvoke2;
        LogHandler currentLogHandler3;
        String strK3;
        String str;
        LogHandler currentLogHandler4;
        String strK4;
        String str2;
        m.e(received, "received");
        List list = received.a;
        List<z> it = received.b;
        LogIntent logIntent = LogIntent.DEBUG;
        QueryProductDetailsUseCase$onOk$$inlined$log$1 queryProductDetailsUseCase$onOk$$inlined$log$1 = new QueryProductDetailsUseCase$onOk$$inlined$log$1(logIntent, this);
        int[] iArr = LogWrapperKt.WhenMappings.$EnumSwitchMapping$0;
        switch (iArr[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    strK4 = x5.k(logLevel, new StringBuilder("[Purchases] - "));
                    str2 = (String) queryProductDetailsUseCase$onOk$$inlined$log$1.invoke();
                    currentLogHandler4.d(strK4, str2);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) queryProductDetailsUseCase$onOk$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler5.w(x5.k(logLevel2, new StringBuilder("[Purchases] - ")), (String) queryProductDetailsUseCase$onOk$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler6.i(x5.k(logLevel3, new StringBuilder("[Purchases] - ")), (String) queryProductDetailsUseCase$onOk$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    strK4 = x5.k(logLevel4, new StringBuilder("[Purchases] - "));
                    str2 = (String) queryProductDetailsUseCase$onOk$$inlined$log$1.invoke();
                    currentLogHandler4.d(strK4, str2);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) queryProductDetailsUseCase$onOk$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler7.i(x5.k(logLevel5, new StringBuilder("[Purchases] - ")), (String) queryProductDetailsUseCase$onOk$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    strK4 = x5.k(logLevel6, new StringBuilder("[Purchases] - "));
                    str2 = (String) queryProductDetailsUseCase$onOk$$inlined$log$1.invoke();
                    currentLogHandler4.d(strK4, str2);
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    strK4 = x5.k(logLevel7, new StringBuilder("[Purchases] - "));
                    str2 = (String) queryProductDetailsUseCase$onOk$$inlined$log$1.invoke();
                    currentLogHandler4.d(strK4, str2);
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler8.w(x5.k(logLevel8, new StringBuilder("[Purchases] - ")), (String) queryProductDetailsUseCase$onOk$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler9.w(x5.k(logLevel9, new StringBuilder("[Purchases] - ")), (String) queryProductDetailsUseCase$onOk$$inlined$log$1.invoke());
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) queryProductDetailsUseCase$onOk$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler10.w(x5.k(logLevel10, new StringBuilder("[Purchases] - ")), (String) queryProductDetailsUseCase$onOk$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) queryProductDetailsUseCase$onOk$$inlined$log$1.invoke(), null);
                break;
        }
        LogIntent logIntent2 = LogIntent.PURCHASE;
        QueryProductDetailsUseCase$onOk$$inlined$log$2 queryProductDetailsUseCase$onOk$$inlined$log$2 = new QueryProductDetailsUseCase$onOk$$inlined$log$2(logIntent2, received);
        switch (iArr[logIntent2.ordinal()]) {
            case 1:
                LogLevel logLevel11 = LogLevel.DEBUG;
                LogHandler currentLogHandler11 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel11) <= 0) {
                    currentLogHandler11.d(x5.k(logLevel11, new StringBuilder("[Purchases] - ")), (String) queryProductDetailsUseCase$onOk$$inlined$log$2.invoke());
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) queryProductDetailsUseCase$onOk$$inlined$log$2.invoke(), null);
                break;
            case 3:
                LogLevel logLevel12 = LogLevel.WARN;
                LogHandler currentLogHandler12 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel12) <= 0) {
                    currentLogHandler12.w(x5.k(logLevel12, new StringBuilder("[Purchases] - ")), (String) queryProductDetailsUseCase$onOk$$inlined$log$2.invoke());
                }
                break;
            case 4:
                LogLevel logLevel13 = LogLevel.INFO;
                LogHandler currentLogHandler13 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel13) <= 0) {
                    currentLogHandler13.i(x5.k(logLevel13, new StringBuilder("[Purchases] - ")), (String) queryProductDetailsUseCase$onOk$$inlined$log$2.invoke());
                }
                break;
            case 5:
                LogLevel logLevel14 = LogLevel.DEBUG;
                LogHandler currentLogHandler14 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel14) <= 0) {
                    currentLogHandler14.d(x5.k(logLevel14, new StringBuilder("[Purchases] - ")), (String) queryProductDetailsUseCase$onOk$$inlined$log$2.invoke());
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) queryProductDetailsUseCase$onOk$$inlined$log$2.invoke(), null);
                break;
            case 7:
                LogLevel logLevel15 = LogLevel.INFO;
                LogHandler currentLogHandler15 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel15) <= 0) {
                    currentLogHandler15.i(x5.k(logLevel15, new StringBuilder("[Purchases] - ")), (String) queryProductDetailsUseCase$onOk$$inlined$log$2.invoke());
                }
                break;
            case 8:
                LogLevel logLevel16 = LogLevel.DEBUG;
                LogHandler currentLogHandler16 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel16) <= 0) {
                    currentLogHandler16.d(x5.k(logLevel16, new StringBuilder("[Purchases] - ")), (String) queryProductDetailsUseCase$onOk$$inlined$log$2.invoke());
                }
                break;
            case 9:
                LogLevel logLevel17 = LogLevel.DEBUG;
                LogHandler currentLogHandler17 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel17) <= 0) {
                    currentLogHandler17.d(x5.k(logLevel17, new StringBuilder("[Purchases] - ")), (String) queryProductDetailsUseCase$onOk$$inlined$log$2.invoke());
                }
                break;
            case 10:
                LogLevel logLevel18 = LogLevel.WARN;
                LogHandler currentLogHandler18 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel18) <= 0) {
                    currentLogHandler18.w(x5.k(logLevel18, new StringBuilder("[Purchases] - ")), (String) queryProductDetailsUseCase$onOk$$inlined$log$2.invoke());
                }
                break;
            case 11:
                LogLevel logLevel19 = LogLevel.WARN;
                LogHandler currentLogHandler19 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel19) <= 0) {
                    currentLogHandler19.w(x5.k(logLevel19, new StringBuilder("[Purchases] - ")), (String) queryProductDetailsUseCase$onOk$$inlined$log$2.invoke());
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) queryProductDetailsUseCase$onOk$$inlined$log$2.invoke(), null);
                break;
            case 13:
                LogLevel logLevel20 = LogLevel.WARN;
                LogHandler currentLogHandler20 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel20) <= 0) {
                    currentLogHandler20.w(x5.k(logLevel20, new StringBuilder("[Purchases] - ")), (String) queryProductDetailsUseCase$onOk$$inlined$log$2.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) queryProductDetailsUseCase$onOk$$inlined$log$2.invoke(), null);
                break;
        }
        m.d(it, "it");
        if ((!it.isEmpty() ? it : null) != null) {
            LogIntent logIntent3 = LogIntent.INFO;
            QueryProductDetailsUseCase$onOk$lambda$6$$inlined$log$1 queryProductDetailsUseCase$onOk$lambda$6$$inlined$log$1 = new QueryProductDetailsUseCase$onOk$lambda$6$$inlined$log$1(logIntent3, received);
            switch (iArr[logIntent3.ordinal()]) {
                case 1:
                    LogLevel logLevel21 = LogLevel.DEBUG;
                    currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel21) <= 0) {
                        strK3 = x5.k(logLevel21, new StringBuilder("[Purchases] - "));
                        str = (String) queryProductDetailsUseCase$onOk$lambda$6$$inlined$log$1.invoke();
                        currentLogHandler3.d(strK3, str);
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) queryProductDetailsUseCase$onOk$lambda$6$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel22 = LogLevel.WARN;
                    LogHandler currentLogHandler21 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel22) <= 0) {
                        currentLogHandler21.w(x5.k(logLevel22, new StringBuilder("[Purchases] - ")), (String) queryProductDetailsUseCase$onOk$lambda$6$$inlined$log$1.invoke());
                    }
                    break;
                case 4:
                    LogLevel logLevel23 = LogLevel.INFO;
                    LogHandler currentLogHandler22 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel23) <= 0) {
                        currentLogHandler22.i(x5.k(logLevel23, new StringBuilder("[Purchases] - ")), (String) queryProductDetailsUseCase$onOk$lambda$6$$inlined$log$1.invoke());
                    }
                    break;
                case 5:
                    LogLevel logLevel24 = LogLevel.DEBUG;
                    currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel24) <= 0) {
                        strK3 = x5.k(logLevel24, new StringBuilder("[Purchases] - "));
                        str = (String) queryProductDetailsUseCase$onOk$lambda$6$$inlined$log$1.invoke();
                        currentLogHandler3.d(strK3, str);
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) queryProductDetailsUseCase$onOk$lambda$6$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel25 = LogLevel.INFO;
                    LogHandler currentLogHandler23 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel25) <= 0) {
                        currentLogHandler23.i(x5.k(logLevel25, new StringBuilder("[Purchases] - ")), (String) queryProductDetailsUseCase$onOk$lambda$6$$inlined$log$1.invoke());
                    }
                    break;
                case 8:
                    LogLevel logLevel26 = LogLevel.DEBUG;
                    currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel26) <= 0) {
                        strK3 = x5.k(logLevel26, new StringBuilder("[Purchases] - "));
                        str = (String) queryProductDetailsUseCase$onOk$lambda$6$$inlined$log$1.invoke();
                        currentLogHandler3.d(strK3, str);
                    }
                    break;
                case 9:
                    LogLevel logLevel27 = LogLevel.DEBUG;
                    currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel27) <= 0) {
                        strK3 = x5.k(logLevel27, new StringBuilder("[Purchases] - "));
                        str = (String) queryProductDetailsUseCase$onOk$lambda$6$$inlined$log$1.invoke();
                        currentLogHandler3.d(strK3, str);
                    }
                    break;
                case 10:
                    LogLevel logLevel28 = LogLevel.WARN;
                    LogHandler currentLogHandler24 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel28) <= 0) {
                        currentLogHandler24.w(x5.k(logLevel28, new StringBuilder("[Purchases] - ")), (String) queryProductDetailsUseCase$onOk$lambda$6$$inlined$log$1.invoke());
                    }
                    break;
                case 11:
                    LogLevel logLevel29 = LogLevel.WARN;
                    LogHandler currentLogHandler25 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel29) <= 0) {
                        currentLogHandler25.w(x5.k(logLevel29, new StringBuilder("[Purchases] - ")), (String) queryProductDetailsUseCase$onOk$lambda$6$$inlined$log$1.invoke());
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) queryProductDetailsUseCase$onOk$lambda$6$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel30 = LogLevel.WARN;
                    LogHandler currentLogHandler26 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel30) <= 0) {
                        currentLogHandler26.w(x5.k(logLevel30, new StringBuilder("[Purchases] - ")), (String) queryProductDetailsUseCase$onOk$lambda$6$$inlined$log$1.invoke());
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) queryProductDetailsUseCase$onOk$lambda$6$$inlined$log$1.invoke(), null);
                    break;
            }
        }
        List<p> list2 = !list.isEmpty() ? list : null;
        if (list2 != null) {
            for (p pVar : list2) {
                LogIntent logIntent4 = LogIntent.PURCHASE;
                QueryProductDetailsUseCase$onOk$lambda$9$$inlined$log$1 queryProductDetailsUseCase$onOk$lambda$9$$inlined$log$1 = new QueryProductDetailsUseCase$onOk$lambda$9$$inlined$log$1(logIntent4, pVar);
                switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent4.ordinal()]) {
                    case 1:
                        LogLevel logLevel31 = LogLevel.DEBUG;
                        currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel31) <= 0) {
                            strK2 = x5.k(logLevel31, new StringBuilder("[Purchases] - "));
                            objInvoke2 = queryProductDetailsUseCase$onOk$lambda$9$$inlined$log$1.invoke();
                            break;
                        }
                        break;
                    case 2:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) queryProductDetailsUseCase$onOk$lambda$9$$inlined$log$1.invoke(), null);
                        continue;
                    case 3:
                        LogLevel logLevel32 = LogLevel.WARN;
                        LogHandler currentLogHandler27 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel32) <= 0) {
                            currentLogHandler27.w(x5.k(logLevel32, new StringBuilder("[Purchases] - ")), (String) queryProductDetailsUseCase$onOk$lambda$9$$inlined$log$1.invoke());
                        } else {
                            continue;
                        }
                        break;
                    case 4:
                        LogLevel logLevel33 = LogLevel.INFO;
                        LogHandler currentLogHandler28 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel33) <= 0) {
                            currentLogHandler28.i(x5.k(logLevel33, new StringBuilder("[Purchases] - ")), (String) queryProductDetailsUseCase$onOk$lambda$9$$inlined$log$1.invoke());
                        } else {
                            continue;
                        }
                        break;
                    case 5:
                        LogLevel logLevel34 = LogLevel.DEBUG;
                        currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel34) <= 0) {
                            strK2 = x5.k(logLevel34, new StringBuilder("[Purchases] - "));
                            objInvoke2 = queryProductDetailsUseCase$onOk$lambda$9$$inlined$log$1.invoke();
                            break;
                        }
                        break;
                    case 6:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) queryProductDetailsUseCase$onOk$lambda$9$$inlined$log$1.invoke(), null);
                        continue;
                    case 7:
                        LogLevel logLevel35 = LogLevel.INFO;
                        LogHandler currentLogHandler29 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel35) <= 0) {
                            currentLogHandler29.i(x5.k(logLevel35, new StringBuilder("[Purchases] - ")), (String) queryProductDetailsUseCase$onOk$lambda$9$$inlined$log$1.invoke());
                        } else {
                            continue;
                        }
                        break;
                    case 8:
                        LogLevel logLevel36 = LogLevel.DEBUG;
                        currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel36) <= 0) {
                            strK2 = x5.k(logLevel36, new StringBuilder("[Purchases] - "));
                            objInvoke2 = queryProductDetailsUseCase$onOk$lambda$9$$inlined$log$1.invoke();
                            break;
                        }
                        break;
                    case 9:
                        LogLevel logLevel37 = LogLevel.DEBUG;
                        currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel37) <= 0) {
                            strK2 = x5.k(logLevel37, new StringBuilder("[Purchases] - "));
                            objInvoke2 = queryProductDetailsUseCase$onOk$lambda$9$$inlined$log$1.invoke();
                            break;
                        }
                        break;
                    case 10:
                        LogLevel logLevel38 = LogLevel.WARN;
                        LogHandler currentLogHandler30 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel38) <= 0) {
                            currentLogHandler30.w(x5.k(logLevel38, new StringBuilder("[Purchases] - ")), (String) queryProductDetailsUseCase$onOk$lambda$9$$inlined$log$1.invoke());
                        } else {
                            continue;
                        }
                        break;
                    case 11:
                        LogLevel logLevel39 = LogLevel.WARN;
                        LogHandler currentLogHandler31 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel39) <= 0) {
                            currentLogHandler31.w(x5.k(logLevel39, new StringBuilder("[Purchases] - ")), (String) queryProductDetailsUseCase$onOk$lambda$9$$inlined$log$1.invoke());
                        } else {
                            continue;
                        }
                        break;
                    case 12:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) queryProductDetailsUseCase$onOk$lambda$9$$inlined$log$1.invoke(), null);
                        continue;
                    case 13:
                        LogLevel logLevel40 = LogLevel.WARN;
                        LogHandler currentLogHandler32 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel40) <= 0) {
                            currentLogHandler32.w(x5.k(logLevel40, new StringBuilder("[Purchases] - ")), (String) queryProductDetailsUseCase$onOk$lambda$9$$inlined$log$1.invoke());
                        } else {
                            continue;
                        }
                        break;
                    case 14:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) queryProductDetailsUseCase$onOk$lambda$9$$inlined$log$1.invoke(), null);
                        continue;
                    default:
                        continue;
                }
                currentLogHandler2.d(strK2, (String) objInvoke2);
            }
        }
        if (it.isEmpty()) {
            it = null;
        }
        if (it != null) {
            for (z zVar : it) {
                LogIntent logIntent5 = LogIntent.INFO;
                QueryProductDetailsUseCase$onOk$lambda$12$$inlined$log$1 queryProductDetailsUseCase$onOk$lambda$12$$inlined$log$1 = new QueryProductDetailsUseCase$onOk$lambda$12$$inlined$log$1(logIntent5, zVar, this);
                switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent5.ordinal()]) {
                    case 1:
                        LogLevel logLevel41 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel41) <= 0) {
                            strK = x5.k(logLevel41, new StringBuilder("[Purchases] - "));
                            objInvoke = queryProductDetailsUseCase$onOk$lambda$12$$inlined$log$1.invoke();
                            break;
                        }
                        break;
                    case 2:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) queryProductDetailsUseCase$onOk$lambda$12$$inlined$log$1.invoke(), null);
                        continue;
                    case 3:
                        LogLevel logLevel42 = LogLevel.WARN;
                        LogHandler currentLogHandler33 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel42) <= 0) {
                            currentLogHandler33.w(x5.k(logLevel42, new StringBuilder("[Purchases] - ")), (String) queryProductDetailsUseCase$onOk$lambda$12$$inlined$log$1.invoke());
                        } else {
                            continue;
                        }
                        break;
                    case 4:
                        LogLevel logLevel43 = LogLevel.INFO;
                        LogHandler currentLogHandler34 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel43) <= 0) {
                            currentLogHandler34.i(x5.k(logLevel43, new StringBuilder("[Purchases] - ")), (String) queryProductDetailsUseCase$onOk$lambda$12$$inlined$log$1.invoke());
                        } else {
                            continue;
                        }
                        break;
                    case 5:
                        LogLevel logLevel44 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel44) <= 0) {
                            strK = x5.k(logLevel44, new StringBuilder("[Purchases] - "));
                            objInvoke = queryProductDetailsUseCase$onOk$lambda$12$$inlined$log$1.invoke();
                            break;
                        }
                        break;
                    case 6:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) queryProductDetailsUseCase$onOk$lambda$12$$inlined$log$1.invoke(), null);
                        continue;
                    case 7:
                        LogLevel logLevel45 = LogLevel.INFO;
                        LogHandler currentLogHandler35 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel45) <= 0) {
                            currentLogHandler35.i(x5.k(logLevel45, new StringBuilder("[Purchases] - ")), (String) queryProductDetailsUseCase$onOk$lambda$12$$inlined$log$1.invoke());
                        } else {
                            continue;
                        }
                        break;
                    case 8:
                        LogLevel logLevel46 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel46) <= 0) {
                            strK = x5.k(logLevel46, new StringBuilder("[Purchases] - "));
                            objInvoke = queryProductDetailsUseCase$onOk$lambda$12$$inlined$log$1.invoke();
                            break;
                        }
                        break;
                    case 9:
                        LogLevel logLevel47 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel47) <= 0) {
                            strK = x5.k(logLevel47, new StringBuilder("[Purchases] - "));
                            objInvoke = queryProductDetailsUseCase$onOk$lambda$12$$inlined$log$1.invoke();
                            break;
                        }
                        break;
                    case 10:
                        LogLevel logLevel48 = LogLevel.WARN;
                        LogHandler currentLogHandler36 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel48) <= 0) {
                            currentLogHandler36.w(x5.k(logLevel48, new StringBuilder("[Purchases] - ")), (String) queryProductDetailsUseCase$onOk$lambda$12$$inlined$log$1.invoke());
                        } else {
                            continue;
                        }
                        break;
                    case 11:
                        LogLevel logLevel49 = LogLevel.WARN;
                        LogHandler currentLogHandler37 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel49) <= 0) {
                            currentLogHandler37.w(x5.k(logLevel49, new StringBuilder("[Purchases] - ")), (String) queryProductDetailsUseCase$onOk$lambda$12$$inlined$log$1.invoke());
                        } else {
                            continue;
                        }
                        break;
                    case 12:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) queryProductDetailsUseCase$onOk$lambda$12$$inlined$log$1.invoke(), null);
                        continue;
                    case 13:
                        LogLevel logLevel50 = LogLevel.WARN;
                        LogHandler currentLogHandler38 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel50) <= 0) {
                            currentLogHandler38.w(x5.k(logLevel50, new StringBuilder("[Purchases] - ")), (String) queryProductDetailsUseCase$onOk$lambda$12$$inlined$log$1.invoke());
                        } else {
                            continue;
                        }
                        break;
                    case 14:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) queryProductDetailsUseCase$onOk$lambda$12$$inlined$log$1.invoke(), null);
                        continue;
                    default:
                        continue;
                }
                currentLogHandler.d(strK, (String) objInvoke);
            }
        }
        m.d(list, "received.productDetailsList");
        this.onReceive.invoke(StoreProductConversionsKt.toStoreProducts(list));
    }
}
