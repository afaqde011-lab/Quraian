package vp;

import com.mchutov.quranify.billing.BillingException;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.interfaces.PurchaseCallback;
import com.revenuecat.purchases.models.StoreTransaction;
import ri.t1;

public final class p implements PurchaseCallback {
    public final a40.k a;

    public p(a40.k kVar) {
        this.a = kVar;
    }

    @Override
    public final void onCompleted(StoreTransaction storeTransaction, CustomerInfo customerInfo) {
        kotlin.jvm.internal.m.e(storeTransaction, "storeTransaction");
        kotlin.jvm.internal.m.e(customerInfo, "customerInfo");
        this.a.resumeWith(new g00.n(customerInfo));
    }

    @Override
    public final void onError(PurchasesError error, boolean z) {
        kotlin.jvm.internal.m.e(error, "error");
        this.a.resumeWith(new g00.n(t1.s(new BillingException(error))));
    }
}
