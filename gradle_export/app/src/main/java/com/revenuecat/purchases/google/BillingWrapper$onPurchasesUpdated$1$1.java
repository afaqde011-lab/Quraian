package com.revenuecat.purchases.google;

import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.models.StoreTransaction;
import g00.b0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import qd.s;
import u00.k;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/models/StoreTransaction;", "storeTxn", "Lg00/b0;", "invoke", "(Lcom/revenuecat/purchases/models/StoreTransaction;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class BillingWrapper$onPurchasesUpdated$1$1 extends n implements k {
    final List<s> $notNullPurchasesList;
    final List<StoreTransaction> $storeTransactions;
    final BillingWrapper this$0;

    public BillingWrapper$onPurchasesUpdated$1$1(List<StoreTransaction> list, List<? extends s> list2, BillingWrapper billingWrapper) {
        super(1);
        this.$storeTransactions = list;
        this.$notNullPurchasesList = list2;
        this.this$0 = billingWrapper;
    }

    @Override
    public Object invoke(Object obj) {
        invoke((StoreTransaction) obj);
        return b0.a;
    }

    public final void invoke(StoreTransaction storeTxn) {
        BillingAbstract.PurchasesUpdatedListener purchasesUpdatedListener;
        m.e(storeTxn, "storeTxn");
        this.$storeTransactions.add(storeTxn);
        if (this.$storeTransactions.size() != this.$notNullPurchasesList.size() || (purchasesUpdatedListener = this.this$0.getPurchasesUpdatedListener()) == null) {
            return;
        }
        purchasesUpdatedListener.onPurchasesUpdated(this.$storeTransactions);
    }
}
