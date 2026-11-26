package com.revenuecat.purchases.google;

import com.revenuecat.purchases.models.StoreTransaction;
import g00.b0;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import u00.k;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "token", "Lg00/b0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class BillingWrapper$consumeAndSave$addToken$1 extends n implements k {
    final StoreTransaction $purchase;
    final BillingWrapper this$0;

    public BillingWrapper$consumeAndSave$addToken$1(BillingWrapper billingWrapper, StoreTransaction storeTransaction) {
        super(1);
        this.this$0 = billingWrapper;
        this.$purchase = storeTransaction;
    }

    @Override
    public Object invoke(Object obj) {
        invoke((String) obj);
        return b0.a;
    }

    public final void invoke(String token) {
        m.e(token, "token");
        this.this$0.deviceCache.addSuccessfullyPostedToken(token, this.$purchase.getIsAutoRenewing());
    }
}
