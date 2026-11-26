package com.revenuecat.purchases;

import com.revenuecat.purchases.common.offerings.OfferingsManager;
import com.revenuecat.purchases.identity.IdentityManager;
import com.revenuecat.purchases.interfaces.LogInCallback;
import g00.b0;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import u00.k;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lg00/b0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class PurchasesOrchestrator$logIn$2$1 extends n implements u00.a {
    final LogInCallback $callback;
    final String $newAppUserID;
    final PurchasesOrchestrator this$0;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfo;", "customerInfo", "", "created", "Lg00/b0;", "invoke", "(Lcom/revenuecat/purchases/CustomerInfo;Z)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass1 extends n implements u00.n {
        final LogInCallback $callback;
        final String $newAppUserID;
        final PurchasesOrchestrator this$0;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lg00/b0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class C00061 extends n implements u00.a {
            final LogInCallback $callback;
            final boolean $created;
            final CustomerInfo $customerInfo;
            final PurchasesOrchestrator this$0;

            public C00061(LogInCallback logInCallback, CustomerInfo customerInfo, boolean z, PurchasesOrchestrator purchasesOrchestrator) {
                super(0);
                this.$callback = logInCallback;
                this.$customerInfo = customerInfo;
                this.$created = z;
                this.this$0 = purchasesOrchestrator;
            }

            @Override
            public Object invoke() {
                m45invoke();
                return b0.a;
            }

            public final void m45invoke() {
                LogInCallback logInCallback = this.$callback;
                if (logInCallback != null) {
                    logInCallback.onReceived(this.$customerInfo, this.$created);
                }
                this.this$0.customerInfoUpdateHandler.notifyListeners(this.$customerInfo);
            }
        }

        public AnonymousClass1(PurchasesOrchestrator purchasesOrchestrator, String str, LogInCallback logInCallback) {
            super(2);
            this.this$0 = purchasesOrchestrator;
            this.$newAppUserID = str;
            this.$callback = logInCallback;
        }

        @Override
        public Object invoke(Object obj, Object obj2) {
            invoke((CustomerInfo) obj, ((Boolean) obj2).booleanValue());
            return b0.a;
        }

        public final void invoke(CustomerInfo customerInfo, boolean z) {
            m.e(customerInfo, "customerInfo");
            PurchasesOrchestrator purchasesOrchestrator = this.this$0;
            purchasesOrchestrator.dispatch(new C00061(this.$callback, customerInfo, z, purchasesOrchestrator));
            OfferingsManager.fetchAndCacheOfferings$default(this.this$0.offeringsManager, this.$newAppUserID, this.this$0.getState$purchases_defaultsBc8Release().getAppInBackground(), null, null, 12, null);
            this.this$0.backupManager.dataChanged();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "Lg00/b0;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass2 extends n implements k {
        final LogInCallback $callback;
        final PurchasesOrchestrator this$0;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lg00/b0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class AnonymousClass1 extends n implements u00.a {
            final LogInCallback $callback;
            final PurchasesError $error;

            public AnonymousClass1(LogInCallback logInCallback, PurchasesError purchasesError) {
                super(0);
                this.$callback = logInCallback;
                this.$error = purchasesError;
            }

            @Override
            public Object invoke() {
                m46invoke();
                return b0.a;
            }

            public final void m46invoke() {
                LogInCallback logInCallback = this.$callback;
                if (logInCallback != null) {
                    logInCallback.onError(this.$error);
                }
            }
        }

        public AnonymousClass2(PurchasesOrchestrator purchasesOrchestrator, LogInCallback logInCallback) {
            super(1);
            this.this$0 = purchasesOrchestrator;
            this.$callback = logInCallback;
        }

        @Override
        public Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return b0.a;
        }

        public final void invoke(PurchasesError error) {
            m.e(error, "error");
            this.this$0.dispatch(new AnonymousClass1(this.$callback, error));
        }
    }

    public PurchasesOrchestrator$logIn$2$1(PurchasesOrchestrator purchasesOrchestrator, String str, LogInCallback logInCallback) {
        super(0);
        this.this$0 = purchasesOrchestrator;
        this.$newAppUserID = str;
        this.$callback = logInCallback;
    }

    @Override
    public Object invoke() {
        m44invoke();
        return b0.a;
    }

    public final void m44invoke() {
        IdentityManager identityManager = this.this$0.identityManager;
        String str = this.$newAppUserID;
        identityManager.logIn(str, new AnonymousClass1(this.this$0, str, this.$callback), new AnonymousClass2(this.this$0, this.$callback));
    }
}
