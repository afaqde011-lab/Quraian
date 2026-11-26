package com.revenuecat.purchases;

import com.google.android.gms.internal.measurement.x5;
import com.revenuecat.purchases.common.AppConfig;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.identity.IdentityManager;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.utils.Result;
import g00.b0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import u00.k;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011Jc\u0010!\u001a\u00020\u001a2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001a0\u001c2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001a0\u001cH\u0002¢\u0006\u0004\b!\u0010\"Jg\u0010%\u001a\u00020\u001a2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0018\u0010$\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001d0#0\u00122\u0016\b\u0002\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u001c2\u0016\b\u0002\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u001cH\u0002¢\u0006\u0004\b%\u0010&J-\u0010)\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u00152\u0016\b\u0002\u0010(\u001a\u0010\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u001c¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010+R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010,R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010-R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010.R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010/R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00100R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00101¨\u00062"}, d2 = {"Lcom/revenuecat/purchases/PostPendingTransactionsHelper;", "", "Lcom/revenuecat/purchases/common/AppConfig;", "appConfig", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "deviceCache", "Lcom/revenuecat/purchases/common/BillingAbstract;", "billing", "Lcom/revenuecat/purchases/common/Dispatcher;", "dispatcher", "Lcom/revenuecat/purchases/identity/IdentityManager;", "identityManager", "Lcom/revenuecat/purchases/PostTransactionWithProductDetailsHelper;", "postTransactionWithProductDetailsHelper", "Lcom/revenuecat/purchases/PostReceiptHelper;", "postReceiptHelper", "<init>", "(Lcom/revenuecat/purchases/common/AppConfig;Lcom/revenuecat/purchases/common/caching/DeviceCache;Lcom/revenuecat/purchases/common/BillingAbstract;Lcom/revenuecat/purchases/common/Dispatcher;Lcom/revenuecat/purchases/identity/IdentityManager;Lcom/revenuecat/purchases/PostTransactionWithProductDetailsHelper;Lcom/revenuecat/purchases/PostReceiptHelper;)V", "", "Lcom/revenuecat/purchases/models/StoreTransaction;", "transactionsToSync", "", "allowSharingPlayStoreAccount", "", "appUserID", "Lkotlin/Function0;", "Lg00/b0;", "onNoTransactionsToSync", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/PurchasesError;", "onError", "Lcom/revenuecat/purchases/CustomerInfo;", "onSuccess", "postTransactionsWithCompletion", "(Ljava/util/List;ZLjava/lang/String;Lu00/a;Lu00/k;Lu00/k;)V", "Lcom/revenuecat/purchases/utils/Result;", "results", "callCompletionFromResults", "(Ljava/util/List;Ljava/util/List;Lu00/k;Lu00/k;)V", "Lcom/revenuecat/purchases/SyncPendingPurchaseResult;", "callback", "syncPendingPurchaseQueue", "(ZLu00/k;)V", "Lcom/revenuecat/purchases/common/AppConfig;", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "Lcom/revenuecat/purchases/common/BillingAbstract;", "Lcom/revenuecat/purchases/common/Dispatcher;", "Lcom/revenuecat/purchases/identity/IdentityManager;", "Lcom/revenuecat/purchases/PostTransactionWithProductDetailsHelper;", "Lcom/revenuecat/purchases/PostReceiptHelper;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PostPendingTransactionsHelper {
    private final AppConfig appConfig;
    private final BillingAbstract billing;
    private final DeviceCache deviceCache;
    private final Dispatcher dispatcher;
    private final IdentityManager identityManager;
    private final PostReceiptHelper postReceiptHelper;
    private final PostTransactionWithProductDetailsHelper postTransactionWithProductDetailsHelper;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/revenuecat/purchases/models/StoreTransaction;", "<anonymous parameter 0>", "Lcom/revenuecat/purchases/CustomerInfo;", "customerInfo", "Lg00/b0;", "invoke", "(Lcom/revenuecat/purchases/models/StoreTransaction;Lcom/revenuecat/purchases/CustomerInfo;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass2 extends n implements u00.n {
        final k $onError;
        final k $onSuccess;
        final List<Result<CustomerInfo, PurchasesError>> $results;
        final List<StoreTransaction> $transactionsToSync;
        final PostPendingTransactionsHelper this$0;

        public AnonymousClass2(List<Result<CustomerInfo, PurchasesError>> list, PostPendingTransactionsHelper postPendingTransactionsHelper, List<StoreTransaction> list2, k kVar, k kVar2) {
            super(2);
            this.$results = list;
            this.this$0 = postPendingTransactionsHelper;
            this.$transactionsToSync = list2;
            this.$onError = kVar;
            this.$onSuccess = kVar2;
        }

        @Override
        public Object invoke(Object obj, Object obj2) {
            invoke((StoreTransaction) obj, (CustomerInfo) obj2);
            return b0.a;
        }

        public final void invoke(StoreTransaction storeTransaction, CustomerInfo customerInfo) {
            m.e(storeTransaction, "<anonymous parameter 0>");
            m.e(customerInfo, "customerInfo");
            this.$results.add(new Result.Success(customerInfo));
            this.this$0.callCompletionFromResults(this.$transactionsToSync, this.$results, this.$onError, this.$onSuccess);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/revenuecat/purchases/models/StoreTransaction;", "<anonymous parameter 0>", "Lcom/revenuecat/purchases/PurchasesError;", "purchasesError", "Lg00/b0;", "invoke", "(Lcom/revenuecat/purchases/models/StoreTransaction;Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass3 extends n implements u00.n {
        final k $onError;
        final k $onSuccess;
        final List<Result<CustomerInfo, PurchasesError>> $results;
        final List<StoreTransaction> $transactionsToSync;
        final PostPendingTransactionsHelper this$0;

        public AnonymousClass3(List<Result<CustomerInfo, PurchasesError>> list, PostPendingTransactionsHelper postPendingTransactionsHelper, List<StoreTransaction> list2, k kVar, k kVar2) {
            super(2);
            this.$results = list;
            this.this$0 = postPendingTransactionsHelper;
            this.$transactionsToSync = list2;
            this.$onError = kVar;
            this.$onSuccess = kVar2;
        }

        @Override
        public Object invoke(Object obj, Object obj2) {
            invoke((StoreTransaction) obj, (PurchasesError) obj2);
            return b0.a;
        }

        public final void invoke(StoreTransaction storeTransaction, PurchasesError purchasesError) {
            m.e(storeTransaction, "<anonymous parameter 0>");
            m.e(purchasesError, "purchasesError");
            this.$results.add(new Result.Error(purchasesError));
            this.this$0.callCompletionFromResults(this.$transactionsToSync, this.$results, this.$onError, this.$onSuccess);
        }
    }

    public PostPendingTransactionsHelper(AppConfig appConfig, DeviceCache deviceCache, BillingAbstract billing, Dispatcher dispatcher, IdentityManager identityManager, PostTransactionWithProductDetailsHelper postTransactionWithProductDetailsHelper, PostReceiptHelper postReceiptHelper) {
        m.e(appConfig, "appConfig");
        m.e(deviceCache, "deviceCache");
        m.e(billing, "billing");
        m.e(dispatcher, "dispatcher");
        m.e(identityManager, "identityManager");
        m.e(postTransactionWithProductDetailsHelper, "postTransactionWithProductDetailsHelper");
        m.e(postReceiptHelper, "postReceiptHelper");
        this.appConfig = appConfig;
        this.deviceCache = deviceCache;
        this.billing = billing;
        this.dispatcher = dispatcher;
        this.identityManager = identityManager;
        this.postTransactionWithProductDetailsHelper = postTransactionWithProductDetailsHelper;
        this.postReceiptHelper = postReceiptHelper;
    }

    public final void callCompletionFromResults(List<StoreTransaction> transactionsToSync, List<? extends Result<CustomerInfo, PurchasesError>> results, k onError, k onSuccess) {
        if (transactionsToSync.size() == results.size()) {
            int i = 0;
            for (Object obj : results) {
                int i2 = i + 1;
                if (i < 0) {
                    va.a.k0();
                    throw null;
                }
                Result result = (Result) obj;
                if (result instanceof Result.Error) {
                    if (onError != null) {
                        onError.invoke(((Result.Error) result).getValue());
                        return;
                    }
                    return;
                } else {
                    if (i == results.size() - 1 && onSuccess != null) {
                        m.c(result, "null cannot be cast to non-null type com.revenuecat.purchases.utils.Result.Success<com.revenuecat.purchases.CustomerInfo>");
                        onSuccess.invoke(((Result.Success) result).getValue());
                    }
                    i = i2;
                }
            }
        }
    }

    public static void callCompletionFromResults$default(PostPendingTransactionsHelper postPendingTransactionsHelper, List list, List list2, k kVar, k kVar2, int i, Object obj) {
        if ((i & 4) != 0) {
            kVar = null;
        }
        if ((i & 8) != 0) {
            kVar2 = null;
        }
        postPendingTransactionsHelper.callCompletionFromResults(list, list2, kVar, kVar2);
    }

    public final void postTransactionsWithCompletion(List<StoreTransaction> transactionsToSync, boolean allowSharingPlayStoreAccount, String appUserID, u00.a onNoTransactionsToSync, k onError, k onSuccess) {
        LogHandler currentLogHandler;
        String strK;
        String str;
        if (!transactionsToSync.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            this.postTransactionWithProductDetailsHelper.postTransactions(transactionsToSync, allowSharingPlayStoreAccount, appUserID, PostReceiptInitiationSource.UNSYNCED_ACTIVE_PURCHASES, false, new AnonymousClass2(arrayList, this, transactionsToSync, onError, onSuccess), new AnonymousClass3(arrayList, this, transactionsToSync, onError, onSuccess));
            return;
        }
        LogIntent logIntent = LogIntent.DEBUG;
        PostPendingTransactionsHelper$postTransactionsWithCompletion$$inlined$log$1 postPendingTransactionsHelper$postTransactionsWithCompletion$$inlined$log$1 = new PostPendingTransactionsHelper$postTransactionsWithCompletion$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    strK = x5.k(logLevel, new StringBuilder("[Purchases] - "));
                    str = (String) postPendingTransactionsHelper$postTransactionsWithCompletion$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) postPendingTransactionsHelper$postTransactionsWithCompletion$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w(x5.k(logLevel2, new StringBuilder("[Purchases] - ")), (String) postPendingTransactionsHelper$postTransactionsWithCompletion$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i(x5.k(logLevel3, new StringBuilder("[Purchases] - ")), (String) postPendingTransactionsHelper$postTransactionsWithCompletion$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    strK = x5.k(logLevel4, new StringBuilder("[Purchases] - "));
                    str = (String) postPendingTransactionsHelper$postTransactionsWithCompletion$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) postPendingTransactionsHelper$postTransactionsWithCompletion$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i(x5.k(logLevel5, new StringBuilder("[Purchases] - ")), (String) postPendingTransactionsHelper$postTransactionsWithCompletion$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    strK = x5.k(logLevel6, new StringBuilder("[Purchases] - "));
                    str = (String) postPendingTransactionsHelper$postTransactionsWithCompletion$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    strK = x5.k(logLevel7, new StringBuilder("[Purchases] - "));
                    str = (String) postPendingTransactionsHelper$postTransactionsWithCompletion$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w(x5.k(logLevel8, new StringBuilder("[Purchases] - ")), (String) postPendingTransactionsHelper$postTransactionsWithCompletion$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w(x5.k(logLevel9, new StringBuilder("[Purchases] - ")), (String) postPendingTransactionsHelper$postTransactionsWithCompletion$$inlined$log$1.invoke());
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) postPendingTransactionsHelper$postTransactionsWithCompletion$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w(x5.k(logLevel10, new StringBuilder("[Purchases] - ")), (String) postPendingTransactionsHelper$postTransactionsWithCompletion$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) postPendingTransactionsHelper$postTransactionsWithCompletion$$inlined$log$1.invoke(), null);
                break;
        }
        onNoTransactionsToSync.invoke();
    }

    public static void syncPendingPurchaseQueue$default(PostPendingTransactionsHelper postPendingTransactionsHelper, boolean z, k kVar, int i, Object obj) {
        if ((i & 2) != 0) {
            kVar = null;
        }
        postPendingTransactionsHelper.syncPendingPurchaseQueue(z, kVar);
    }

    public static final void syncPendingPurchaseQueue$lambda$2(PostPendingTransactionsHelper postPendingTransactionsHelper, String str, boolean z, k kVar) {
        postPendingTransactionsHelper.billing.queryPurchases(str, new PostPendingTransactionsHelper$syncPendingPurchaseQueue$3$1(postPendingTransactionsHelper, z, str, kVar), new PostPendingTransactionsHelper$syncPendingPurchaseQueue$3$2(kVar));
    }

    public final void syncPendingPurchaseQueue(boolean allowSharingPlayStoreAccount, k callback) {
        LogHandler currentLogHandler;
        String strK;
        String str;
        if (this.appConfig.getDangerousSettings().getAutoSyncPurchases()) {
            LogIntent logIntent = LogIntent.DEBUG;
            PostPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$2 postPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$2 = new PostPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$2(logIntent);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        currentLogHandler2.d(x5.k(logLevel, new StringBuilder("[Purchases] - ")), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$2.invoke());
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$2.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler3.w(x5.k(logLevel2, new StringBuilder("[Purchases] - ")), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$2.invoke());
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler4.i(x5.k(logLevel3, new StringBuilder("[Purchases] - ")), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$2.invoke());
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        currentLogHandler5.d(x5.k(logLevel4, new StringBuilder("[Purchases] - ")), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$2.invoke());
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$2.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler6.i(x5.k(logLevel5, new StringBuilder("[Purchases] - ")), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$2.invoke());
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        currentLogHandler7.d(x5.k(logLevel6, new StringBuilder("[Purchases] - ")), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$2.invoke());
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        currentLogHandler8.d(x5.k(logLevel7, new StringBuilder("[Purchases] - ")), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$2.invoke());
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler9.w(x5.k(logLevel8, new StringBuilder("[Purchases] - ")), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$2.invoke());
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler10.w(x5.k(logLevel9, new StringBuilder("[Purchases] - ")), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$2.invoke());
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$2.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler11 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler11.w(x5.k(logLevel10, new StringBuilder("[Purchases] - ")), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$2.invoke());
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$2.invoke(), null);
                    break;
            }
            Dispatcher.enqueue$default(this.dispatcher, new c(this, this.identityManager.getCurrentAppUserID(), allowSharingPlayStoreAccount, callback), null, 2, null);
            return;
        }
        LogIntent logIntent2 = LogIntent.DEBUG;
        PostPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$1 postPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$1 = new PostPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$1(logIntent2);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent2.ordinal()]) {
            case 1:
                LogLevel logLevel11 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel11) <= 0) {
                    strK = x5.k(logLevel11, new StringBuilder("[Purchases] - "));
                    str = (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel12 = LogLevel.WARN;
                LogHandler currentLogHandler12 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel12) <= 0) {
                    currentLogHandler12.w(x5.k(logLevel12, new StringBuilder("[Purchases] - ")), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel13 = LogLevel.INFO;
                LogHandler currentLogHandler13 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel13) <= 0) {
                    currentLogHandler13.i(x5.k(logLevel13, new StringBuilder("[Purchases] - ")), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel14 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel14) <= 0) {
                    strK = x5.k(logLevel14, new StringBuilder("[Purchases] - "));
                    str = (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel15 = LogLevel.INFO;
                LogHandler currentLogHandler14 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel15) <= 0) {
                    currentLogHandler14.i(x5.k(logLevel15, new StringBuilder("[Purchases] - ")), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel16 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel16) <= 0) {
                    strK = x5.k(logLevel16, new StringBuilder("[Purchases] - "));
                    str = (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 9:
                LogLevel logLevel17 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel17) <= 0) {
                    strK = x5.k(logLevel17, new StringBuilder("[Purchases] - "));
                    str = (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 10:
                LogLevel logLevel18 = LogLevel.WARN;
                LogHandler currentLogHandler15 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel18) <= 0) {
                    currentLogHandler15.w(x5.k(logLevel18, new StringBuilder("[Purchases] - ")), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel19 = LogLevel.WARN;
                LogHandler currentLogHandler16 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel19) <= 0) {
                    currentLogHandler16.w(x5.k(logLevel19, new StringBuilder("[Purchases] - ")), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$1.invoke());
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel20 = LogLevel.WARN;
                LogHandler currentLogHandler17 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel20) <= 0) {
                    currentLogHandler17.w(x5.k(logLevel20, new StringBuilder("[Purchases] - ")), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$1.invoke(), null);
                break;
        }
        if (callback != null) {
            callback.invoke(SyncPendingPurchaseResult.AutoSyncDisabled.INSTANCE);
        }
    }
}
