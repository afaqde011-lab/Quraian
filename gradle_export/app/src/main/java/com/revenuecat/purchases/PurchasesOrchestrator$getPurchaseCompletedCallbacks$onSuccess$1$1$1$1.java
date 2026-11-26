package com.revenuecat.purchases;

import com.revenuecat.purchases.interfaces.PurchaseCallback;
import com.revenuecat.purchases.models.StoreTransaction;
import g00.b0;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lg00/b0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class PurchasesOrchestrator$getPurchaseCompletedCallbacks$onSuccess$1$1$1$1 extends n implements u00.a {
    final CustomerInfo $info;
    final PurchaseCallback $purchaseCallback;
    final StoreTransaction $storeTransaction;

    public PurchasesOrchestrator$getPurchaseCompletedCallbacks$onSuccess$1$1$1$1(PurchaseCallback purchaseCallback, StoreTransaction storeTransaction, CustomerInfo customerInfo) {
        super(0);
        this.$purchaseCallback = purchaseCallback;
        this.$storeTransaction = storeTransaction;
        this.$info = customerInfo;
    }

    @Override
    public Object invoke() {
        m43invoke();
        return b0.a;
    }

    public final void m43invoke() {
        this.$purchaseCallback.onCompleted(this.$storeTransaction, this.$info);
    }
}
