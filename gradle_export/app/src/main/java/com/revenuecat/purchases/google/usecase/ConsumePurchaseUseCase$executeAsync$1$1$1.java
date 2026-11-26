package com.revenuecat.purchases.google.usecase;

import com.google.android.gms.internal.measurement.x5;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.PostReceiptInitiationSource;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.google.BillingResultExtensionsBillingIndependentKt;
import com.revenuecat.purchases.google.ErrorsKt;
import com.revenuecat.purchases.strings.PurchaseStrings;
import g00.b0;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import qd.h;
import u00.k;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqd/h;", "errorBillingResult", "Lg00/b0;", "invoke", "(Lqd/h;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class ConsumePurchaseUseCase$executeAsync$1$1$1 extends n implements k {
    final ConsumePurchaseUseCase this$0;

    public ConsumePurchaseUseCase$executeAsync$1$1$1(ConsumePurchaseUseCase consumePurchaseUseCase) {
        super(1);
        this.this$0 = consumePurchaseUseCase;
    }

    @Override
    public Object invoke(Object obj) {
        invoke((h) obj);
        return b0.a;
    }

    public final void invoke(h errorBillingResult) {
        String str;
        LogHandler currentLogHandler;
        String strK;
        String str2;
        m.e(errorBillingResult, "errorBillingResult");
        if (errorBillingResult.a != 8 || this.this$0.useCaseParams.getInitiationSource() != PostReceiptInitiationSource.RESTORE) {
            str = this.this$0.getErrorMessage() + " - " + BillingResultExtensionsBillingIndependentKt.toHumanReadableDescription(errorBillingResult);
            LogIntent logIntent = LogIntent.GOOGLE_ERROR;
            ConsumePurchaseUseCase$executeAsync$1$1$1$invoke$$inlined$log$2 consumePurchaseUseCase$executeAsync$1$1$1$invoke$$inlined$log$2 = new ConsumePurchaseUseCase$executeAsync$1$1$1$invoke$$inlined$log$2(logIntent, str);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        currentLogHandler2.d(x5.k(logLevel, new StringBuilder("[Purchases] - ")), (String) consumePurchaseUseCase$executeAsync$1$1$1$invoke$$inlined$log$2.invoke());
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) consumePurchaseUseCase$executeAsync$1$1$1$invoke$$inlined$log$2.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler3.w(x5.k(logLevel2, new StringBuilder("[Purchases] - ")), (String) consumePurchaseUseCase$executeAsync$1$1$1$invoke$$inlined$log$2.invoke());
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler4.i(x5.k(logLevel3, new StringBuilder("[Purchases] - ")), (String) consumePurchaseUseCase$executeAsync$1$1$1$invoke$$inlined$log$2.invoke());
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        currentLogHandler5.d(x5.k(logLevel4, new StringBuilder("[Purchases] - ")), (String) consumePurchaseUseCase$executeAsync$1$1$1$invoke$$inlined$log$2.invoke());
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) consumePurchaseUseCase$executeAsync$1$1$1$invoke$$inlined$log$2.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler6.i(x5.k(logLevel5, new StringBuilder("[Purchases] - ")), (String) consumePurchaseUseCase$executeAsync$1$1$1$invoke$$inlined$log$2.invoke());
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        currentLogHandler7.d(x5.k(logLevel6, new StringBuilder("[Purchases] - ")), (String) consumePurchaseUseCase$executeAsync$1$1$1$invoke$$inlined$log$2.invoke());
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        currentLogHandler8.d(x5.k(logLevel7, new StringBuilder("[Purchases] - ")), (String) consumePurchaseUseCase$executeAsync$1$1$1$invoke$$inlined$log$2.invoke());
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler9.w(x5.k(logLevel8, new StringBuilder("[Purchases] - ")), (String) consumePurchaseUseCase$executeAsync$1$1$1$invoke$$inlined$log$2.invoke());
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler10.w(x5.k(logLevel9, new StringBuilder("[Purchases] - ")), (String) consumePurchaseUseCase$executeAsync$1$1$1$invoke$$inlined$log$2.invoke());
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) consumePurchaseUseCase$executeAsync$1$1$1$invoke$$inlined$log$2.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler11 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler11.w(x5.k(logLevel10, new StringBuilder("[Purchases] - ")), (String) consumePurchaseUseCase$executeAsync$1$1$1$invoke$$inlined$log$2.invoke());
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) consumePurchaseUseCase$executeAsync$1$1$1$invoke$$inlined$log$2.invoke(), null);
                    break;
            }
        } else {
            LogIntent logIntent2 = LogIntent.GOOGLE_WARNING;
            str = PurchaseStrings.CONSUMING_PURCHASE_ERROR_RESTORE;
            ConsumePurchaseUseCase$executeAsync$1$1$1$invoke$$inlined$log$1 consumePurchaseUseCase$executeAsync$1$1$1$invoke$$inlined$log$1 = new ConsumePurchaseUseCase$executeAsync$1$1$1$invoke$$inlined$log$1(logIntent2, PurchaseStrings.CONSUMING_PURCHASE_ERROR_RESTORE);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent2.ordinal()]) {
                case 1:
                    LogLevel logLevel11 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel11) <= 0) {
                        strK = x5.k(logLevel11, new StringBuilder("[Purchases] - "));
                        str2 = (String) consumePurchaseUseCase$executeAsync$1$1$1$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(strK, str2);
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) consumePurchaseUseCase$executeAsync$1$1$1$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel12 = LogLevel.WARN;
                    LogHandler currentLogHandler12 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel12) <= 0) {
                        currentLogHandler12.w(x5.k(logLevel12, new StringBuilder("[Purchases] - ")), (String) consumePurchaseUseCase$executeAsync$1$1$1$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 4:
                    LogLevel logLevel13 = LogLevel.INFO;
                    LogHandler currentLogHandler13 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel13) <= 0) {
                        currentLogHandler13.i(x5.k(logLevel13, new StringBuilder("[Purchases] - ")), (String) consumePurchaseUseCase$executeAsync$1$1$1$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 5:
                    LogLevel logLevel14 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel14) <= 0) {
                        strK = x5.k(logLevel14, new StringBuilder("[Purchases] - "));
                        str2 = (String) consumePurchaseUseCase$executeAsync$1$1$1$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(strK, str2);
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) consumePurchaseUseCase$executeAsync$1$1$1$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel15 = LogLevel.INFO;
                    LogHandler currentLogHandler14 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel15) <= 0) {
                        currentLogHandler14.i(x5.k(logLevel15, new StringBuilder("[Purchases] - ")), (String) consumePurchaseUseCase$executeAsync$1$1$1$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 8:
                    LogLevel logLevel16 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel16) <= 0) {
                        strK = x5.k(logLevel16, new StringBuilder("[Purchases] - "));
                        str2 = (String) consumePurchaseUseCase$executeAsync$1$1$1$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(strK, str2);
                    }
                    break;
                case 9:
                    LogLevel logLevel17 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel17) <= 0) {
                        strK = x5.k(logLevel17, new StringBuilder("[Purchases] - "));
                        str2 = (String) consumePurchaseUseCase$executeAsync$1$1$1$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(strK, str2);
                    }
                    break;
                case 10:
                    LogLevel logLevel18 = LogLevel.WARN;
                    LogHandler currentLogHandler15 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel18) <= 0) {
                        currentLogHandler15.w(x5.k(logLevel18, new StringBuilder("[Purchases] - ")), (String) consumePurchaseUseCase$executeAsync$1$1$1$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 11:
                    LogLevel logLevel19 = LogLevel.WARN;
                    LogHandler currentLogHandler16 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel19) <= 0) {
                        currentLogHandler16.w(x5.k(logLevel19, new StringBuilder("[Purchases] - ")), (String) consumePurchaseUseCase$executeAsync$1$1$1$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) consumePurchaseUseCase$executeAsync$1$1$1$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel20 = LogLevel.WARN;
                    LogHandler currentLogHandler17 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel20) <= 0) {
                        currentLogHandler17.w(x5.k(logLevel20, new StringBuilder("[Purchases] - ")), (String) consumePurchaseUseCase$executeAsync$1$1$1$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) consumePurchaseUseCase$executeAsync$1$1$1$invoke$$inlined$log$1.invoke(), null);
                    break;
            }
        }
        this.this$0.getOnError().invoke(ErrorsKt.billingResponseToPurchasesError(errorBillingResult.a, str));
    }
}
