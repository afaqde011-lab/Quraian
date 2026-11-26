package com.revenuecat.purchases.google.usecase;

import ab.a0;
import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.internal.measurement.x5;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.DurationExtensionsKt;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.google.BillingResponse;
import com.revenuecat.purchases.google.BillingResultExtensionsBillingIndependentKt;
import com.revenuecat.purchases.google.ErrorsKt;
import g00.b0;
import java.io.PrintWriter;
import java.io.StringWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.m;
import qd.h;
import u00.k;
import u00.n;
import z00.g;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002BS\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\b\u0012*\u0010\r\u001a&\u0012\u0004\u0012\u00020\u000b\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0004\u0012\u00020\u00070\nj\u0002`\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u0017\u001a\u00020\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00070\u00052\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J+\u0010\u0019\u001a\u00020\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00070\u00052\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u000b¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0007H&¢\u0006\u0004\b\u001f\u0010\u001bJ\u0017\u0010!\u001a\u00020\u00072\u0006\u0010 \u001a\u00028\u0000H&¢\u0006\u0004\b!\u0010\"JI\u0010%\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010#\u001a\u00028\u00002\u0014\b\u0002\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u00052\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b%\u0010&J)\u0010)\u001a\u00020\u0007*\u0004\u0018\u00010'2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00070\u0005H\u0004¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010+R$\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010,R;\u0010\r\u001a&\u0012\u0004\u0012\u00020\u000b\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0004\u0012\u00020\u00070\nj\u0002`\f8\u0006¢\u0006\f\n\u0004\b\r\u0010-\u001a\u0004\b.\u0010/R\u001a\u00101\u001a\u0002008\u0014X\u0094D¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082D¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00108\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00107R\u001c\u0010:\u001a\u0002098\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b<\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006>"}, d2 = {"Lcom/revenuecat/purchases/google/usecase/BillingClientUseCase;", "T", "", "Lcom/revenuecat/purchases/google/usecase/UseCaseParams;", "useCaseParams", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/PurchasesError;", "Lg00/b0;", "Lcom/revenuecat/purchases/PurchasesErrorCallback;", "onError", "Lkotlin/Function2;", "", "Lcom/revenuecat/purchases/google/usecase/ExecuteRequestOnUIThreadFunction;", "executeRequestOnUIThread", "<init>", "(Lcom/revenuecat/purchases/google/usecase/UseCaseParams;Lu00/k;Lu00/n;)V", "", "getStackTrace", "()Ljava/lang/String;", "Lqd/h;", "billingResult", "forwardError", "(Lqd/h;)V", "backoffOrRetryNetworkError", "(Lu00/k;Lqd/h;)V", "backoffOrErrorIfServiceUnavailable", "retryWithBackoff", "()V", "delayMilliseconds", "run", "(J)V", "executeAsync", "received", "onOk", "(Ljava/lang/Object;)V", "response", "onSuccess", "processResult", "(Lqd/h;Ljava/lang/Object;Lu00/k;Lu00/k;)V", "Lqd/a;", "receivingFunction", "withConnectedClient", "(Lqd/a;Lu00/k;)V", "Lcom/revenuecat/purchases/google/usecase/UseCaseParams;", "Lu00/k;", "Lu00/n;", "getExecuteRequestOnUIThread", "()Lu00/n;", "", "backoffForNetworkErrors", "Z", "getBackoffForNetworkErrors", "()Z", "", "maxRetries", "I", "retryAttempt", "Ls30/b;", "retryBackoff", "J", "getErrorMessage", "errorMessage", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class BillingClientUseCase<T> {
    private final boolean backoffForNetworkErrors;
    private final n executeRequestOnUIThread;
    private final int maxRetries;
    private final k onError;
    private int retryAttempt;
    private long retryBackoff;
    private final UseCaseParams useCaseParams;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public class AnonymousClass1 extends j implements k {
        public AnonymousClass1(Object obj) {
            super(1, 0, BillingClientUseCase.class, obj, "onOk", "onOk(Ljava/lang/Object;)V");
        }

        @Override
        public Object invoke(Object obj) {
            m148invoke(obj);
            return b0.a;
        }

        public final void m148invoke(T t) {
            ((BillingClientUseCase) this.receiver).onOk(t);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public class AnonymousClass2 extends j implements k {
        public AnonymousClass2(Object obj) {
            super(1, 0, BillingClientUseCase.class, obj, "forwardError", "forwardError(Lcom/android/billingclient/api/BillingResult;)V");
        }

        @Override
        public Object invoke(Object obj) {
            invoke((h) obj);
            return b0.a;
        }

        public final void invoke(h p0) {
            m.e(p0, "p0");
            ((BillingClientUseCase) this.receiver).forwardError(p0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lcom/revenuecat/purchases/PurchasesError;", "connectionError", "Lg00/b0;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C01171 extends kotlin.jvm.internal.n implements k {
        final BillingClientUseCase<T> this$0;

        public C01171(BillingClientUseCase<T> billingClientUseCase) {
            super(1);
            this.this$0 = billingClientUseCase;
        }

        @Override
        public Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return b0.a;
        }

        public final void invoke(PurchasesError purchasesError) {
            if (purchasesError == null) {
                this.this$0.executeAsync();
            } else {
                ((BillingClientUseCase) this.this$0).onError.invoke(purchasesError);
            }
        }
    }

    public BillingClientUseCase(UseCaseParams useCaseParams, k onError, n executeRequestOnUIThread) {
        m.e(useCaseParams, "useCaseParams");
        m.e(onError, "onError");
        m.e(executeRequestOnUIThread, "executeRequestOnUIThread");
        this.useCaseParams = useCaseParams;
        this.onError = onError;
        this.executeRequestOnUIThread = executeRequestOnUIThread;
        this.maxRetries = 3;
        this.retryBackoff = BillingClientUseCaseKt.RETRY_TIMER_START;
    }

    private final void backoffOrErrorIfServiceUnavailable(k onError, h billingResult) {
        LogHandler currentLogHandler;
        String strK;
        String str;
        LogIntent logIntent = LogIntent.GOOGLE_WARNING;
        BillingClientUseCase$backoffOrErrorIfServiceUnavailable$$inlined$log$1 billingClientUseCase$backoffOrErrorIfServiceUnavailable$$inlined$log$1 = new BillingClientUseCase$backoffOrErrorIfServiceUnavailable$$inlined$log$1(logIntent, this);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    strK = x5.k(logLevel, new StringBuilder("[Purchases] - "));
                    str = (String) billingClientUseCase$backoffOrErrorIfServiceUnavailable$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingClientUseCase$backoffOrErrorIfServiceUnavailable$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w(x5.k(logLevel2, new StringBuilder("[Purchases] - ")), (String) billingClientUseCase$backoffOrErrorIfServiceUnavailable$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i(x5.k(logLevel3, new StringBuilder("[Purchases] - ")), (String) billingClientUseCase$backoffOrErrorIfServiceUnavailable$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    strK = x5.k(logLevel4, new StringBuilder("[Purchases] - "));
                    str = (String) billingClientUseCase$backoffOrErrorIfServiceUnavailable$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingClientUseCase$backoffOrErrorIfServiceUnavailable$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i(x5.k(logLevel5, new StringBuilder("[Purchases] - ")), (String) billingClientUseCase$backoffOrErrorIfServiceUnavailable$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    strK = x5.k(logLevel6, new StringBuilder("[Purchases] - "));
                    str = (String) billingClientUseCase$backoffOrErrorIfServiceUnavailable$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    strK = x5.k(logLevel7, new StringBuilder("[Purchases] - "));
                    str = (String) billingClientUseCase$backoffOrErrorIfServiceUnavailable$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w(x5.k(logLevel8, new StringBuilder("[Purchases] - ")), (String) billingClientUseCase$backoffOrErrorIfServiceUnavailable$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w(x5.k(logLevel9, new StringBuilder("[Purchases] - ")), (String) billingClientUseCase$backoffOrErrorIfServiceUnavailable$$inlined$log$1.invoke());
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingClientUseCase$backoffOrErrorIfServiceUnavailable$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w(x5.k(logLevel10, new StringBuilder("[Purchases] - ")), (String) billingClientUseCase$backoffOrErrorIfServiceUnavailable$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingClientUseCase$backoffOrErrorIfServiceUnavailable$$inlined$log$1.invoke(), null);
                break;
        }
        if (s30.b.c(this.retryBackoff, this.useCaseParams.getAppInBackground() ? BillingClientUseCaseKt.getRETRY_TIMER_MAX_TIME() : BillingClientUseCaseKt.getRETRY_TIMER_SERVICE_UNAVAILABLE_MAX_TIME_FOREGROUND()) < 0) {
            retryWithBackoff();
        } else {
            onError.invoke(billingResult);
        }
    }

    private final void backoffOrRetryNetworkError(k onError, h billingResult) {
        int i;
        if (getBackoffForNetworkErrors() && s30.b.c(this.retryBackoff, BillingClientUseCaseKt.getRETRY_TIMER_MAX_TIME()) < 0) {
            retryWithBackoff();
        } else if (getBackoffForNetworkErrors() || (i = this.retryAttempt) >= this.maxRetries) {
            onError.invoke(billingResult);
        } else {
            this.retryAttempt = i + 1;
            executeAsync();
        }
    }

    public final void forwardError(h billingResult) {
        LogHandler currentLogHandler;
        String strK;
        String str;
        String str2 = getErrorMessage() + " - " + BillingResultExtensionsBillingIndependentKt.toHumanReadableDescription(billingResult);
        LogIntent logIntent = LogIntent.GOOGLE_ERROR;
        BillingClientUseCase$forwardError$$inlined$log$1 billingClientUseCase$forwardError$$inlined$log$1 = new BillingClientUseCase$forwardError$$inlined$log$1(logIntent, str2);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    strK = x5.k(logLevel, new StringBuilder("[Purchases] - "));
                    str = (String) billingClientUseCase$forwardError$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingClientUseCase$forwardError$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w(x5.k(logLevel2, new StringBuilder("[Purchases] - ")), (String) billingClientUseCase$forwardError$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i(x5.k(logLevel3, new StringBuilder("[Purchases] - ")), (String) billingClientUseCase$forwardError$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    strK = x5.k(logLevel4, new StringBuilder("[Purchases] - "));
                    str = (String) billingClientUseCase$forwardError$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingClientUseCase$forwardError$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i(x5.k(logLevel5, new StringBuilder("[Purchases] - ")), (String) billingClientUseCase$forwardError$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    strK = x5.k(logLevel6, new StringBuilder("[Purchases] - "));
                    str = (String) billingClientUseCase$forwardError$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    strK = x5.k(logLevel7, new StringBuilder("[Purchases] - "));
                    str = (String) billingClientUseCase$forwardError$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w(x5.k(logLevel8, new StringBuilder("[Purchases] - ")), (String) billingClientUseCase$forwardError$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w(x5.k(logLevel9, new StringBuilder("[Purchases] - ")), (String) billingClientUseCase$forwardError$$inlined$log$1.invoke());
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingClientUseCase$forwardError$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w(x5.k(logLevel10, new StringBuilder("[Purchases] - ")), (String) billingClientUseCase$forwardError$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingClientUseCase$forwardError$$inlined$log$1.invoke(), null);
                break;
        }
        k kVar = this.onError;
        PurchasesError purchasesErrorBillingResponseToPurchasesError = ErrorsKt.billingResponseToPurchasesError(billingResult.a, str2);
        LogUtilsKt.errorLog(purchasesErrorBillingResponseToPurchasesError);
        kVar.invoke(purchasesErrorBillingResponseToPurchasesError);
    }

    public final String getStackTrace() {
        StringWriter stringWriter = new StringWriter();
        new Throwable().printStackTrace(new PrintWriter(stringWriter));
        String string = stringWriter.toString();
        m.d(string, "stringWriter.toString()");
        return string;
    }

    public static void processResult$default(BillingClientUseCase billingClientUseCase, h hVar, Object obj, k kVar, k kVar2, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: processResult");
        }
        if ((i & 4) != 0) {
            kVar = new AnonymousClass1(billingClientUseCase);
        }
        if ((i & 8) != 0) {
            kVar2 = new AnonymousClass2(billingClientUseCase);
        }
        billingClientUseCase.processResult(hVar, obj, kVar, kVar2);
    }

    private final void retryWithBackoff() {
        long j = this.retryBackoff;
        long jC = s30.b.D;
        long j2 = s30.b.C;
        if (s30.b.g(j)) {
            jC = j;
        } else {
            long j3 = j >> 1;
            long j4 = 2;
            long j5 = j3 * j4;
            if ((1 & ((int) j)) == 0) {
                if (-2147483647L <= j3 && j3 < 2147483648L) {
                    jC = g4.D(j5);
                } else if (j5 / j4 == j3) {
                    jC = (-4611686018426999999L > j5 || j5 >= 4611686018427000000L) ? g4.C(j5 / ((long) 1000000)) : g4.D(j5);
                } else {
                    long j6 = 1000000;
                    long j7 = j3 / j6;
                    long j8 = j7 * j4;
                    long j9 = (((j3 - (j7 * j6)) * j4) / j6) + j8;
                    if (j8 / j4 != j7 || (j9 ^ j8) < 0) {
                        if (Integer.signum(2) * Long.signum(j3) > 0) {
                            jC = j2;
                        }
                    } else {
                        jC = g4.C(a0.B(j9, new g(-4611686018427387903L, 4611686018427387903L)));
                    }
                }
            } else if (j5 / j4 == j3) {
                jC = g4.C(a0.B(j5, new g(-4611686018427387903L, 4611686018427387903L)));
            } else {
                if (Integer.signum(2) * Long.signum(j3) > 0) {
                    jC = j2;
                }
            }
        }
        this.retryBackoff = DurationExtensionsKt.m113minQTBD994(jC, BillingClientUseCaseKt.getRETRY_TIMER_MAX_TIME());
        run(s30.b.e(j));
    }

    public static void run$default(BillingClientUseCase billingClientUseCase, long j, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: run");
        }
        if ((i & 1) != 0) {
            j = 0;
        }
        billingClientUseCase.run(j);
    }

    public abstract void executeAsync();

    public boolean getBackoffForNetworkErrors() {
        return this.backoffForNetworkErrors;
    }

    public abstract String getErrorMessage();

    public final n getExecuteRequestOnUIThread() {
        return this.executeRequestOnUIThread;
    }

    public abstract void onOk(T received);

    public final void processResult(h billingResult, T response, k onSuccess, k onError) {
        LogHandler currentLogHandler;
        String strK;
        String str;
        m.e(billingResult, "billingResult");
        m.e(onSuccess, "onSuccess");
        m.e(onError, "onError");
        BillingResponse billingResponseFromCode = BillingResponse.INSTANCE.fromCode(billingResult.a);
        if (m.a(billingResponseFromCode, BillingResponse.OK.INSTANCE)) {
            this.retryBackoff = BillingClientUseCaseKt.RETRY_TIMER_START;
            onSuccess.invoke(response);
            return;
        }
        if (!m.a(billingResponseFromCode, BillingResponse.ServiceDisconnected.INSTANCE)) {
            if (m.a(billingResponseFromCode, BillingResponse.ServiceUnavailable.INSTANCE)) {
                backoffOrErrorIfServiceUnavailable(onError, billingResult);
                return;
            }
            if (m.a(billingResponseFromCode, BillingResponse.NetworkError.INSTANCE) ? true : m.a(billingResponseFromCode, BillingResponse.Error.INSTANCE)) {
                backoffOrRetryNetworkError(onError, billingResult);
                return;
            } else {
                onError.invoke(billingResult);
                return;
            }
        }
        LogIntent logIntent = LogIntent.GOOGLE_ERROR;
        BillingClientUseCase$processResult$$inlined$log$1 billingClientUseCase$processResult$$inlined$log$1 = new BillingClientUseCase$processResult$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    strK = x5.k(logLevel, new StringBuilder("[Purchases] - "));
                    str = (String) billingClientUseCase$processResult$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingClientUseCase$processResult$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w(x5.k(logLevel2, new StringBuilder("[Purchases] - ")), (String) billingClientUseCase$processResult$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i(x5.k(logLevel3, new StringBuilder("[Purchases] - ")), (String) billingClientUseCase$processResult$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    strK = x5.k(logLevel4, new StringBuilder("[Purchases] - "));
                    str = (String) billingClientUseCase$processResult$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingClientUseCase$processResult$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i(x5.k(logLevel5, new StringBuilder("[Purchases] - ")), (String) billingClientUseCase$processResult$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    strK = x5.k(logLevel6, new StringBuilder("[Purchases] - "));
                    str = (String) billingClientUseCase$processResult$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    strK = x5.k(logLevel7, new StringBuilder("[Purchases] - "));
                    str = (String) billingClientUseCase$processResult$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w(x5.k(logLevel8, new StringBuilder("[Purchases] - ")), (String) billingClientUseCase$processResult$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w(x5.k(logLevel9, new StringBuilder("[Purchases] - ")), (String) billingClientUseCase$processResult$$inlined$log$1.invoke());
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingClientUseCase$processResult$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w(x5.k(logLevel10, new StringBuilder("[Purchases] - ")), (String) billingClientUseCase$processResult$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingClientUseCase$processResult$$inlined$log$1.invoke(), null);
                break;
        }
        run$default(this, 0L, 1, null);
    }

    public final void run(long delayMilliseconds) {
        this.executeRequestOnUIThread.invoke(Long.valueOf(delayMilliseconds), new C01171(this));
    }

    public final void withConnectedClient(qd.a aVar, k receivingFunction) {
        b0 b0Var;
        m.e(receivingFunction, "receivingFunction");
        if (aVar == null) {
            b0Var = null;
        } else {
            if (!((qd.b) aVar).N()) {
                aVar = null;
            }
            if (aVar != null) {
                receivingFunction.invoke(aVar);
                b0Var = b0.a;
            } else {
                b0Var = null;
            }
        }
        if (b0Var == null) {
            LogIntent logIntent = LogIntent.GOOGLE_WARNING;
            BillingClientUseCase$withConnectedClient$$inlined$log$1 billingClientUseCase$withConnectedClient$$inlined$log$1 = new BillingClientUseCase$withConnectedClient$$inlined$log$1(logIntent, this);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        currentLogHandler.d(x5.k(logLevel, new StringBuilder("[Purchases] - ")), (String) billingClientUseCase$withConnectedClient$$inlined$log$1.invoke());
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingClientUseCase$withConnectedClient$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w(x5.k(logLevel2, new StringBuilder("[Purchases] - ")), (String) billingClientUseCase$withConnectedClient$$inlined$log$1.invoke());
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i(x5.k(logLevel3, new StringBuilder("[Purchases] - ")), (String) billingClientUseCase$withConnectedClient$$inlined$log$1.invoke());
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        currentLogHandler4.d(x5.k(logLevel4, new StringBuilder("[Purchases] - ")), (String) billingClientUseCase$withConnectedClient$$inlined$log$1.invoke());
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingClientUseCase$withConnectedClient$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler5.i(x5.k(logLevel5, new StringBuilder("[Purchases] - ")), (String) billingClientUseCase$withConnectedClient$$inlined$log$1.invoke());
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        currentLogHandler6.d(x5.k(logLevel6, new StringBuilder("[Purchases] - ")), (String) billingClientUseCase$withConnectedClient$$inlined$log$1.invoke());
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        currentLogHandler7.d(x5.k(logLevel7, new StringBuilder("[Purchases] - ")), (String) billingClientUseCase$withConnectedClient$$inlined$log$1.invoke());
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler8.w(x5.k(logLevel8, new StringBuilder("[Purchases] - ")), (String) billingClientUseCase$withConnectedClient$$inlined$log$1.invoke());
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler9.w(x5.k(logLevel9, new StringBuilder("[Purchases] - ")), (String) billingClientUseCase$withConnectedClient$$inlined$log$1.invoke());
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingClientUseCase$withConnectedClient$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler10.w(x5.k(logLevel10, new StringBuilder("[Purchases] - ")), (String) billingClientUseCase$withConnectedClient$$inlined$log$1.invoke());
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingClientUseCase$withConnectedClient$$inlined$log$1.invoke(), null);
                    break;
            }
        }
    }
}
