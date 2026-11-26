package com.revenuecat.purchases;

import com.google.android.gms.internal.measurement.x5;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.models.StoreTransaction;
import g00.b0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import u00.k;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "Lg00/b0;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class SyncPurchasesHelper$syncPurchases$2$1$2 extends n implements k {
    final boolean $appInBackground;
    final String $appUserID;
    final List<PurchasesError> $errors;
    final k $handleError;
    final k $handleSuccess;
    final boolean $isRestore;
    final StoreTransaction $lastPurchase;
    final StoreTransaction $purchase;
    final SyncPurchasesHelper this$0;

    public SyncPurchasesHelper$syncPurchases$2$1$2(List<PurchasesError> list, StoreTransaction storeTransaction, StoreTransaction storeTransaction2, SyncPurchasesHelper syncPurchasesHelper, String str, boolean z, boolean z2, k kVar, k kVar2) {
        super(1);
        this.$errors = list;
        this.$purchase = storeTransaction;
        this.$lastPurchase = storeTransaction2;
        this.this$0 = syncPurchasesHelper;
        this.$appUserID = str;
        this.$appInBackground = z;
        this.$isRestore = z2;
        this.$handleSuccess = kVar;
        this.$handleError = kVar2;
    }

    @Override
    public Object invoke(Object obj) {
        invoke((PurchasesError) obj);
        return b0.a;
    }

    public final void invoke(PurchasesError error) {
        LogHandler currentLogHandler;
        String strK;
        String str;
        m.e(error, "error");
        LogIntent logIntent = LogIntent.RC_ERROR;
        SyncPurchasesHelper$syncPurchases$2$1$2$invoke$$inlined$log$1 syncPurchasesHelper$syncPurchases$2$1$2$invoke$$inlined$log$1 = new SyncPurchasesHelper$syncPurchases$2$1$2$invoke$$inlined$log$1(logIntent, this.$purchase, error);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    strK = x5.k(logLevel, new StringBuilder("[Purchases] - "));
                    str = (String) syncPurchasesHelper$syncPurchases$2$1$2$invoke$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) syncPurchasesHelper$syncPurchases$2$1$2$invoke$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w(x5.k(logLevel2, new StringBuilder("[Purchases] - ")), (String) syncPurchasesHelper$syncPurchases$2$1$2$invoke$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i(x5.k(logLevel3, new StringBuilder("[Purchases] - ")), (String) syncPurchasesHelper$syncPurchases$2$1$2$invoke$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    strK = x5.k(logLevel4, new StringBuilder("[Purchases] - "));
                    str = (String) syncPurchasesHelper$syncPurchases$2$1$2$invoke$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) syncPurchasesHelper$syncPurchases$2$1$2$invoke$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i(x5.k(logLevel5, new StringBuilder("[Purchases] - ")), (String) syncPurchasesHelper$syncPurchases$2$1$2$invoke$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    strK = x5.k(logLevel6, new StringBuilder("[Purchases] - "));
                    str = (String) syncPurchasesHelper$syncPurchases$2$1$2$invoke$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    strK = x5.k(logLevel7, new StringBuilder("[Purchases] - "));
                    str = (String) syncPurchasesHelper$syncPurchases$2$1$2$invoke$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w(x5.k(logLevel8, new StringBuilder("[Purchases] - ")), (String) syncPurchasesHelper$syncPurchases$2$1$2$invoke$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w(x5.k(logLevel9, new StringBuilder("[Purchases] - ")), (String) syncPurchasesHelper$syncPurchases$2$1$2$invoke$$inlined$log$1.invoke());
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) syncPurchasesHelper$syncPurchases$2$1$2$invoke$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w(x5.k(logLevel10, new StringBuilder("[Purchases] - ")), (String) syncPurchasesHelper$syncPurchases$2$1$2$invoke$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) syncPurchasesHelper$syncPurchases$2$1$2$invoke$$inlined$log$1.invoke(), null);
                break;
        }
        this.$errors.add(error);
        SyncPurchasesHelper.AnonymousClass2.invoke$handleLastPurchase(this.$errors, this.this$0, this.$appUserID, this.$appInBackground, this.$isRestore, this.$handleSuccess, this.$handleError, this.$purchase, this.$lastPurchase);
    }
}
