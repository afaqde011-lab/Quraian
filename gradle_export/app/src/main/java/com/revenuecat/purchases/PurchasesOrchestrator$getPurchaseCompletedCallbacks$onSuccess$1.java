package com.revenuecat.purchases;

import com.revenuecat.purchases.interfaces.PurchaseCallback;
import com.revenuecat.purchases.models.StoreTransaction;
import g00.b0;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/revenuecat/purchases/models/StoreTransaction;", "storeTransaction", "Lcom/revenuecat/purchases/CustomerInfo;", "info", "Lg00/b0;", "invoke", "(Lcom/revenuecat/purchases/models/StoreTransaction;Lcom/revenuecat/purchases/CustomerInfo;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class PurchasesOrchestrator$getPurchaseCompletedCallbacks$onSuccess$1 extends n implements u00.n {
    final PurchasesOrchestrator this$0;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lg00/b0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass1 extends n implements u00.a {
        final CustomerInfo $info;
        final StoreTransaction $storeTransaction;
        final PurchasesOrchestrator this$0;

        public AnonymousClass1(PurchasesOrchestrator purchasesOrchestrator, CustomerInfo customerInfo, StoreTransaction storeTransaction) {
            super(0);
            this.this$0 = purchasesOrchestrator;
            this.$info = customerInfo;
            this.$storeTransaction = storeTransaction;
        }

        @Override
        public Object invoke() {
            m42invoke();
            return b0.a;
        }

        public final void m42invoke() {
            this.this$0.blockstoreHelper.storeUserIdIfNeeded(this.$info);
            PurchaseCallback purchaseCallback = this.this$0.getPurchaseCallback(this.$storeTransaction.getProductIds().get(0));
            if (purchaseCallback != null) {
                this.this$0.dispatch(new PurchasesOrchestrator$getPurchaseCompletedCallbacks$onSuccess$1$1$1$1(purchaseCallback, this.$storeTransaction, this.$info));
            }
        }
    }

    public PurchasesOrchestrator$getPurchaseCompletedCallbacks$onSuccess$1(PurchasesOrchestrator purchasesOrchestrator) {
        super(2);
        this.this$0 = purchasesOrchestrator;
    }

    @Override
    public Object invoke(Object obj, Object obj2) {
        invoke((StoreTransaction) obj, (CustomerInfo) obj2);
        return b0.a;
    }

    public final void invoke(StoreTransaction storeTransaction, CustomerInfo info) {
        m.e(storeTransaction, "storeTransaction");
        m.e(info, "info");
        this.this$0.backupManager.dataChanged();
        this.this$0.blockstoreHelper.aliasCurrentAndStoredUserIdsIfNeeded(new AnonymousClass1(this.this$0, info, storeTransaction));
    }
}
