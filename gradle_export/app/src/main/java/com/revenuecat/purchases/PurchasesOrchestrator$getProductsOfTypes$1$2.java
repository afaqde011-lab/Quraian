package com.revenuecat.purchases;

import com.revenuecat.purchases.interfaces.GetStoreProductsCallback;
import g00.b0;
import java.util.Date;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import u00.k;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "it", "Lg00/b0;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class PurchasesOrchestrator$getProductsOfTypes$1$2 extends n implements k {
    final GetStoreProductsCallback $callback;
    final Date $nonNullStartTime;
    final Set<String> $productIds;
    final PurchasesOrchestrator this$0;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lg00/b0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass1 extends n implements u00.a {
        final GetStoreProductsCallback $callback;
        final PurchasesError $it;
        final Date $nonNullStartTime;
        final Set<String> $productIds;
        final PurchasesOrchestrator this$0;

        public AnonymousClass1(PurchasesOrchestrator purchasesOrchestrator, Date date, Set<String> set, PurchasesError purchasesError, GetStoreProductsCallback getStoreProductsCallback) {
            super(0);
            this.this$0 = purchasesOrchestrator;
            this.$nonNullStartTime = date;
            this.$productIds = set;
            this.$it = purchasesError;
            this.$callback = getStoreProductsCallback;
        }

        @Override
        public Object invoke() {
            m41invoke();
            return b0.a;
        }

        public final void m41invoke() {
            PurchasesOrchestrator purchasesOrchestrator = this.this$0;
            Date date = this.$nonNullStartTime;
            Set<String> set = this.$productIds;
            purchasesOrchestrator.trackGetProductsResult(date, set, set, this.$it);
            this.$callback.onError(this.$it);
        }
    }

    public PurchasesOrchestrator$getProductsOfTypes$1$2(PurchasesOrchestrator purchasesOrchestrator, Date date, Set<String> set, GetStoreProductsCallback getStoreProductsCallback) {
        super(1);
        this.this$0 = purchasesOrchestrator;
        this.$nonNullStartTime = date;
        this.$productIds = set;
        this.$callback = getStoreProductsCallback;
    }

    @Override
    public Object invoke(Object obj) {
        invoke((PurchasesError) obj);
        return b0.a;
    }

    public final void invoke(PurchasesError it) {
        m.e(it, "it");
        PurchasesOrchestrator purchasesOrchestrator = this.this$0;
        purchasesOrchestrator.dispatch(new AnonymousClass1(purchasesOrchestrator, this.$nonNullStartTime, this.$productIds, it, this.$callback));
    }
}
