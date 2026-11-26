package com.revenuecat.purchases;

import com.google.android.gms.internal.measurement.x5;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.UtilsKt;
import com.revenuecat.purchases.models.PurchaseState;
import com.revenuecat.purchases.models.StoreTransaction;
import g00.b0;
import h00.d0;
import h00.q;
import h00.r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import u00.k;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "Lcom/revenuecat/purchases/models/StoreTransaction;", "purchasesByHashedToken", "Lg00/b0;", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class PostPendingTransactionsHelper$syncPendingPurchaseQueue$3$1 extends n implements k {
    final boolean $allowSharingPlayStoreAccount;
    final String $appUserID;
    final k $callback;
    final PostPendingTransactionsHelper this$0;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lg00/b0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass2 extends n implements u00.a {
        final boolean $allowSharingPlayStoreAccount;
        final String $appUserID;
        final k $callback;
        final Set<String> $pendingTransactionsTokens;
        final PostPendingTransactionsHelper this$0;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lg00/b0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class AnonymousClass1 extends n implements u00.a {
            final k $callback;

            public AnonymousClass1(k kVar) {
                super(0);
                this.$callback = kVar;
            }

            @Override
            public Object invoke() {
                m31invoke();
                return b0.a;
            }

            public final void m31invoke() {
                k kVar = this.$callback;
                if (kVar != null) {
                    kVar.invoke(SyncPendingPurchaseResult.NoPendingPurchasesToSync.INSTANCE);
                }
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "it", "Lg00/b0;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class C00012 extends n implements k {
            final k $callback;

            public C00012(k kVar) {
                super(1);
                this.$callback = kVar;
            }

            @Override
            public Object invoke(Object obj) {
                invoke((PurchasesError) obj);
                return b0.a;
            }

            public final void invoke(PurchasesError it) {
                m.e(it, "it");
                k kVar = this.$callback;
                if (kVar != null) {
                    kVar.invoke(new SyncPendingPurchaseResult.Error(it));
                }
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfo;", "it", "Lg00/b0;", "invoke", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class AnonymousClass3 extends n implements k {
            final k $callback;

            public AnonymousClass3(k kVar) {
                super(1);
                this.$callback = kVar;
            }

            @Override
            public Object invoke(Object obj) {
                invoke((CustomerInfo) obj);
                return b0.a;
            }

            public final void invoke(CustomerInfo it) {
                m.e(it, "it");
                k kVar = this.$callback;
                if (kVar != null) {
                    kVar.invoke(new SyncPendingPurchaseResult.Success(it));
                }
            }
        }

        public AnonymousClass2(PostPendingTransactionsHelper postPendingTransactionsHelper, String str, boolean z, Set<String> set, k kVar) {
            super(0);
            this.this$0 = postPendingTransactionsHelper;
            this.$appUserID = str;
            this.$allowSharingPlayStoreAccount = z;
            this.$pendingTransactionsTokens = set;
            this.$callback = kVar;
        }

        @Override
        public Object invoke() {
            m30invoke();
            return b0.a;
        }

        public final void m30invoke() {
            this.this$0.postReceiptHelper.postRemainingCachedTransactionMetadata(this.$appUserID, this.$allowSharingPlayStoreAccount, this.$pendingTransactionsTokens, new AnonymousClass1(this.$callback), new C00012(this.$callback), new AnonymousClass3(this.$callback));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "Lg00/b0;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass3 extends n implements k {
        final boolean $allowSharingPlayStoreAccount;
        final String $appUserID;
        final k $callback;
        final Set<String> $pendingTransactionsTokens;
        final PostPendingTransactionsHelper this$0;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lg00/b0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class AnonymousClass1 extends n implements u00.a {
            final k $callback;
            final PurchasesError $error;

            public AnonymousClass1(k kVar, PurchasesError purchasesError) {
                super(0);
                this.$callback = kVar;
                this.$error = purchasesError;
            }

            @Override
            public Object invoke() {
                m32invoke();
                return b0.a;
            }

            public final void m32invoke() {
                LogHandler currentLogHandler;
                String strK;
                String str;
                LogIntent logIntent = LogIntent.DEBUG;
                PostPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$3$1$invoke$$inlined$log$1 postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$3$1$invoke$$inlined$log$1 = new PostPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$3$1$invoke$$inlined$log$1(logIntent);
                switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                    case 1:
                        LogLevel logLevel = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                            strK = x5.k(logLevel, new StringBuilder("[Purchases] - "));
                            str = (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$3$1$invoke$$inlined$log$1.invoke();
                            currentLogHandler.d(strK, str);
                        }
                        break;
                    case 2:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$3$1$invoke$$inlined$log$1.invoke(), null);
                        break;
                    case 3:
                        LogLevel logLevel2 = LogLevel.WARN;
                        LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                            currentLogHandler2.w(x5.k(logLevel2, new StringBuilder("[Purchases] - ")), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$3$1$invoke$$inlined$log$1.invoke());
                        }
                        break;
                    case 4:
                        LogLevel logLevel3 = LogLevel.INFO;
                        LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                            currentLogHandler3.i(x5.k(logLevel3, new StringBuilder("[Purchases] - ")), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$3$1$invoke$$inlined$log$1.invoke());
                        }
                        break;
                    case 5:
                        LogLevel logLevel4 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                            strK = x5.k(logLevel4, new StringBuilder("[Purchases] - "));
                            str = (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$3$1$invoke$$inlined$log$1.invoke();
                            currentLogHandler.d(strK, str);
                        }
                        break;
                    case 6:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$3$1$invoke$$inlined$log$1.invoke(), null);
                        break;
                    case 7:
                        LogLevel logLevel5 = LogLevel.INFO;
                        LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                            currentLogHandler4.i(x5.k(logLevel5, new StringBuilder("[Purchases] - ")), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$3$1$invoke$$inlined$log$1.invoke());
                        }
                        break;
                    case 8:
                        LogLevel logLevel6 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                            strK = x5.k(logLevel6, new StringBuilder("[Purchases] - "));
                            str = (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$3$1$invoke$$inlined$log$1.invoke();
                            currentLogHandler.d(strK, str);
                        }
                        break;
                    case 9:
                        LogLevel logLevel7 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                            strK = x5.k(logLevel7, new StringBuilder("[Purchases] - "));
                            str = (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$3$1$invoke$$inlined$log$1.invoke();
                            currentLogHandler.d(strK, str);
                        }
                        break;
                    case 10:
                        LogLevel logLevel8 = LogLevel.WARN;
                        LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                            currentLogHandler5.w(x5.k(logLevel8, new StringBuilder("[Purchases] - ")), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$3$1$invoke$$inlined$log$1.invoke());
                        }
                        break;
                    case 11:
                        LogLevel logLevel9 = LogLevel.WARN;
                        LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                            currentLogHandler6.w(x5.k(logLevel9, new StringBuilder("[Purchases] - ")), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$3$1$invoke$$inlined$log$1.invoke());
                        }
                        break;
                    case 12:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$3$1$invoke$$inlined$log$1.invoke(), null);
                        break;
                    case 13:
                        LogLevel logLevel10 = LogLevel.WARN;
                        LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                            currentLogHandler7.w(x5.k(logLevel10, new StringBuilder("[Purchases] - ")), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$3$1$invoke$$inlined$log$1.invoke());
                        }
                        break;
                    case 14:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$3$1$invoke$$inlined$log$1.invoke(), null);
                        break;
                }
                k kVar = this.$callback;
                if (kVar != null) {
                    kVar.invoke(new SyncPendingPurchaseResult.Error(this.$error));
                }
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "it", "Lg00/b0;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class AnonymousClass2 extends n implements k {
            final k $callback;
            final PurchasesError $error;

            public AnonymousClass2(k kVar, PurchasesError purchasesError) {
                super(1);
                this.$callback = kVar;
                this.$error = purchasesError;
            }

            @Override
            public Object invoke(Object obj) {
                invoke((PurchasesError) obj);
                return b0.a;
            }

            public final void invoke(PurchasesError it) {
                m.e(it, "it");
                k kVar = this.$callback;
                if (kVar != null) {
                    kVar.invoke(new SyncPendingPurchaseResult.Error(this.$error));
                }
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfo;", "it", "Lg00/b0;", "invoke", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class C00023 extends n implements k {
            final k $callback;

            public C00023(k kVar) {
                super(1);
                this.$callback = kVar;
            }

            @Override
            public Object invoke(Object obj) {
                invoke((CustomerInfo) obj);
                return b0.a;
            }

            public final void invoke(CustomerInfo it) {
                m.e(it, "it");
                k kVar = this.$callback;
                if (kVar != null) {
                    kVar.invoke(new SyncPendingPurchaseResult.Success(it));
                }
            }
        }

        public AnonymousClass3(PostPendingTransactionsHelper postPendingTransactionsHelper, String str, boolean z, Set<String> set, k kVar) {
            super(1);
            this.this$0 = postPendingTransactionsHelper;
            this.$appUserID = str;
            this.$allowSharingPlayStoreAccount = z;
            this.$pendingTransactionsTokens = set;
            this.$callback = kVar;
        }

        @Override
        public Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return b0.a;
        }

        public final void invoke(PurchasesError error) {
            m.e(error, "error");
            this.this$0.postReceiptHelper.postRemainingCachedTransactionMetadata(this.$appUserID, this.$allowSharingPlayStoreAccount, this.$pendingTransactionsTokens, new AnonymousClass1(this.$callback, error), new AnonymousClass2(this.$callback, error), new C00023(this.$callback));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfo;", "customerInfo", "Lg00/b0;", "invoke", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass4 extends n implements k {
        final boolean $allowSharingPlayStoreAccount;
        final String $appUserID;
        final k $callback;
        final Set<String> $pendingTransactionsTokens;
        final PostPendingTransactionsHelper this$0;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lg00/b0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class AnonymousClass1 extends n implements u00.a {
            final k $callback;
            final CustomerInfo $customerInfo;

            public AnonymousClass1(k kVar, CustomerInfo customerInfo) {
                super(0);
                this.$callback = kVar;
                this.$customerInfo = customerInfo;
            }

            @Override
            public Object invoke() {
                m33invoke();
                return b0.a;
            }

            public final void m33invoke() {
                LogHandler currentLogHandler;
                String strK;
                String str;
                LogIntent logIntent = LogIntent.DEBUG;
                PostPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$4$1$invoke$$inlined$log$1 postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$4$1$invoke$$inlined$log$1 = new PostPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$4$1$invoke$$inlined$log$1(logIntent);
                switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                    case 1:
                        LogLevel logLevel = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                            strK = x5.k(logLevel, new StringBuilder("[Purchases] - "));
                            str = (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$4$1$invoke$$inlined$log$1.invoke();
                            currentLogHandler.d(strK, str);
                        }
                        break;
                    case 2:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$4$1$invoke$$inlined$log$1.invoke(), null);
                        break;
                    case 3:
                        LogLevel logLevel2 = LogLevel.WARN;
                        LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                            currentLogHandler2.w(x5.k(logLevel2, new StringBuilder("[Purchases] - ")), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$4$1$invoke$$inlined$log$1.invoke());
                        }
                        break;
                    case 4:
                        LogLevel logLevel3 = LogLevel.INFO;
                        LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                            currentLogHandler3.i(x5.k(logLevel3, new StringBuilder("[Purchases] - ")), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$4$1$invoke$$inlined$log$1.invoke());
                        }
                        break;
                    case 5:
                        LogLevel logLevel4 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                            strK = x5.k(logLevel4, new StringBuilder("[Purchases] - "));
                            str = (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$4$1$invoke$$inlined$log$1.invoke();
                            currentLogHandler.d(strK, str);
                        }
                        break;
                    case 6:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$4$1$invoke$$inlined$log$1.invoke(), null);
                        break;
                    case 7:
                        LogLevel logLevel5 = LogLevel.INFO;
                        LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                            currentLogHandler4.i(x5.k(logLevel5, new StringBuilder("[Purchases] - ")), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$4$1$invoke$$inlined$log$1.invoke());
                        }
                        break;
                    case 8:
                        LogLevel logLevel6 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                            strK = x5.k(logLevel6, new StringBuilder("[Purchases] - "));
                            str = (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$4$1$invoke$$inlined$log$1.invoke();
                            currentLogHandler.d(strK, str);
                        }
                        break;
                    case 9:
                        LogLevel logLevel7 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                            strK = x5.k(logLevel7, new StringBuilder("[Purchases] - "));
                            str = (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$4$1$invoke$$inlined$log$1.invoke();
                            currentLogHandler.d(strK, str);
                        }
                        break;
                    case 10:
                        LogLevel logLevel8 = LogLevel.WARN;
                        LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                            currentLogHandler5.w(x5.k(logLevel8, new StringBuilder("[Purchases] - ")), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$4$1$invoke$$inlined$log$1.invoke());
                        }
                        break;
                    case 11:
                        LogLevel logLevel9 = LogLevel.WARN;
                        LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                            currentLogHandler6.w(x5.k(logLevel9, new StringBuilder("[Purchases] - ")), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$4$1$invoke$$inlined$log$1.invoke());
                        }
                        break;
                    case 12:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$4$1$invoke$$inlined$log$1.invoke(), null);
                        break;
                    case 13:
                        LogLevel logLevel10 = LogLevel.WARN;
                        LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                            currentLogHandler7.w(x5.k(logLevel10, new StringBuilder("[Purchases] - ")), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$4$1$invoke$$inlined$log$1.invoke());
                        }
                        break;
                    case 14:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$4$1$invoke$$inlined$log$1.invoke(), null);
                        break;
                }
                k kVar = this.$callback;
                if (kVar != null) {
                    kVar.invoke(new SyncPendingPurchaseResult.Success(this.$customerInfo));
                }
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "it", "Lg00/b0;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class AnonymousClass2 extends n implements k {
            final k $callback;

            public AnonymousClass2(k kVar) {
                super(1);
                this.$callback = kVar;
            }

            @Override
            public Object invoke(Object obj) {
                invoke((PurchasesError) obj);
                return b0.a;
            }

            public final void invoke(PurchasesError it) {
                m.e(it, "it");
                k kVar = this.$callback;
                if (kVar != null) {
                    kVar.invoke(new SyncPendingPurchaseResult.Error(it));
                }
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfo;", "it", "Lg00/b0;", "invoke", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class AnonymousClass3 extends n implements k {
            final k $callback;

            public AnonymousClass3(k kVar) {
                super(1);
                this.$callback = kVar;
            }

            @Override
            public Object invoke(Object obj) {
                invoke((CustomerInfo) obj);
                return b0.a;
            }

            public final void invoke(CustomerInfo it) {
                m.e(it, "it");
                k kVar = this.$callback;
                if (kVar != null) {
                    kVar.invoke(new SyncPendingPurchaseResult.Success(it));
                }
            }
        }

        public AnonymousClass4(PostPendingTransactionsHelper postPendingTransactionsHelper, String str, boolean z, Set<String> set, k kVar) {
            super(1);
            this.this$0 = postPendingTransactionsHelper;
            this.$appUserID = str;
            this.$allowSharingPlayStoreAccount = z;
            this.$pendingTransactionsTokens = set;
            this.$callback = kVar;
        }

        @Override
        public Object invoke(Object obj) {
            invoke((CustomerInfo) obj);
            return b0.a;
        }

        public final void invoke(CustomerInfo customerInfo) {
            m.e(customerInfo, "customerInfo");
            this.this$0.postReceiptHelper.postRemainingCachedTransactionMetadata(this.$appUserID, this.$allowSharingPlayStoreAccount, this.$pendingTransactionsTokens, new AnonymousClass1(this.$callback, customerInfo), new AnonymousClass2(this.$callback), new AnonymousClass3(this.$callback));
        }
    }

    public PostPendingTransactionsHelper$syncPendingPurchaseQueue$3$1(PostPendingTransactionsHelper postPendingTransactionsHelper, boolean z, String str, k kVar) {
        super(1);
        this.this$0 = postPendingTransactionsHelper;
        this.$allowSharingPlayStoreAccount = z;
        this.$appUserID = str;
        this.$callback = kVar;
    }

    @Override
    public Object invoke(Object obj) {
        invoke((Map<String, StoreTransaction>) obj);
        return b0.a;
    }

    public final void invoke(Map<String, StoreTransaction> purchasesByHashedToken) {
        LogHandler currentLogHandler;
        String strK;
        Object objInvoke;
        m.e(purchasesByHashedToken, "purchasesByHashedToken");
        for (Map.Entry<String, StoreTransaction> entry : purchasesByHashedToken.entrySet()) {
            String key = entry.getKey();
            StoreTransaction value = entry.getValue();
            LogIntent logIntent = LogIntent.DEBUG;
            PostPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$invoke$lambda$1$$inlined$log$1 postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$invoke$lambda$1$$inlined$log$1 = new PostPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$invoke$lambda$1$$inlined$log$1(logIntent, value, key);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        strK = x5.k(logLevel, new StringBuilder("[Purchases] - "));
                        objInvoke = postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$invoke$lambda$1$$inlined$log$1.invoke();
                        break;
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$invoke$lambda$1$$inlined$log$1.invoke(), null);
                    continue;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w(x5.k(logLevel2, new StringBuilder("[Purchases] - ")), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$invoke$lambda$1$$inlined$log$1.invoke());
                    } else {
                        continue;
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i(x5.k(logLevel3, new StringBuilder("[Purchases] - ")), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$invoke$lambda$1$$inlined$log$1.invoke());
                    } else {
                        continue;
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        strK = x5.k(logLevel4, new StringBuilder("[Purchases] - "));
                        objInvoke = postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$invoke$lambda$1$$inlined$log$1.invoke();
                        break;
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$invoke$lambda$1$$inlined$log$1.invoke(), null);
                    continue;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler4.i(x5.k(logLevel5, new StringBuilder("[Purchases] - ")), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$invoke$lambda$1$$inlined$log$1.invoke());
                    } else {
                        continue;
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        strK = x5.k(logLevel6, new StringBuilder("[Purchases] - "));
                        objInvoke = postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$invoke$lambda$1$$inlined$log$1.invoke();
                        break;
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        strK = x5.k(logLevel7, new StringBuilder("[Purchases] - "));
                        objInvoke = postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$invoke$lambda$1$$inlined$log$1.invoke();
                        break;
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler5.w(x5.k(logLevel8, new StringBuilder("[Purchases] - ")), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$invoke$lambda$1$$inlined$log$1.invoke());
                    } else {
                        continue;
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler6.w(x5.k(logLevel9, new StringBuilder("[Purchases] - ")), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$invoke$lambda$1$$inlined$log$1.invoke());
                    } else {
                        continue;
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$invoke$lambda$1$$inlined$log$1.invoke(), null);
                    continue;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler7.w(x5.k(logLevel10, new StringBuilder("[Purchases] - ")), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$invoke$lambda$1$$inlined$log$1.invoke());
                    } else {
                        continue;
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$invoke$lambda$1$$inlined$log$1.invoke(), null);
                    continue;
                default:
                    continue;
            }
            currentLogHandler.d(strK, (String) objInvoke);
        }
        this.this$0.deviceCache.cleanPreviouslySentTokens$purchases_defaultsBc8Release(purchasesByHashedToken.keySet());
        List<StoreTransaction> activePurchasesNotInCache$purchases_defaultsBc8Release = this.this$0.deviceCache.getActivePurchasesNotInCache$purchases_defaultsBc8Release(purchasesByHashedToken);
        List<StoreTransaction> purchasesWithAutoRenewingChange$purchases_defaultsBc8Release = this.this$0.deviceCache.getPurchasesWithAutoRenewingChange$purchases_defaultsBc8Release(purchasesByHashedToken);
        ArrayList arrayList = new ArrayList(r.q0(purchasesWithAutoRenewingChange$purchases_defaultsBc8Release, 10));
        Iterator<T> it = purchasesWithAutoRenewingChange$purchases_defaultsBc8Release.iterator();
        while (it.hasNext()) {
            arrayList.add(UtilsKt.sha1(((StoreTransaction) it.next()).getPurchaseToken()));
        }
        this.this$0.deviceCache.saveAutoRenewingStatus$purchases_defaultsBc8Release(d0.S(purchasesByHashedToken, q.r1(arrayList)));
        ArrayList arrayListY0 = q.Y0(purchasesWithAutoRenewingChange$purchases_defaultsBc8Release, activePurchasesNotInCache$purchases_defaultsBc8Release);
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayListY0) {
            if (hashSet.add(((StoreTransaction) obj).getPurchaseToken())) {
                arrayList2.add(obj);
            }
        }
        Collection<StoreTransaction> collectionValues = purchasesByHashedToken.values();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : collectionValues) {
            if (((StoreTransaction) obj2).getPurchaseState() == PurchaseState.PENDING) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList(r.q0(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((StoreTransaction) it2.next()).getPurchaseToken());
        }
        Set setR1 = q.r1(arrayList4);
        PostPendingTransactionsHelper postPendingTransactionsHelper = this.this$0;
        boolean z = this.$allowSharingPlayStoreAccount;
        String str = this.$appUserID;
        postPendingTransactionsHelper.postTransactionsWithCompletion(arrayList2, z, str, new AnonymousClass2(postPendingTransactionsHelper, str, z, setR1, this.$callback), new AnonymousClass3(this.this$0, this.$appUserID, this.$allowSharingPlayStoreAccount, setR1, this.$callback), new AnonymousClass4(this.this$0, this.$appUserID, this.$allowSharingPlayStoreAccount, setR1, this.$callback));
    }
}
