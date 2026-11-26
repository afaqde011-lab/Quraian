package com.revenuecat.purchases.google;

import com.revenuecat.purchases.ProductType;
import g00.b0;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import u00.k;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "subFound", "Lg00/b0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class BillingWrapper$getPurchaseType$1 extends n implements k {
    final k $listener;
    final String $purchaseToken;
    final BillingWrapper this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "inAppFound", "Lg00/b0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass1 extends n implements k {
        final k $listener;

        public AnonymousClass1(k kVar) {
            super(1);
            this.$listener = kVar;
        }

        @Override
        public Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return b0.a;
        }

        public final void invoke(boolean z) {
            if (z) {
                this.$listener.invoke(ProductType.INAPP);
            } else {
                this.$listener.invoke(ProductType.UNKNOWN);
            }
        }
    }

    public BillingWrapper$getPurchaseType$1(k kVar, BillingWrapper billingWrapper, String str) {
        super(1);
        this.$listener = kVar;
        this.this$0 = billingWrapper;
        this.$purchaseToken = str;
    }

    @Override
    public Object invoke(Object obj) {
        invoke(((Boolean) obj).booleanValue());
        return b0.a;
    }

    public final void invoke(boolean z) {
        if (z) {
            this.$listener.invoke(ProductType.SUBS);
            return;
        }
        BillingWrapper billingWrapper = this.this$0;
        String str = this.$purchaseToken;
        k kVar = this.$listener;
        billingWrapper.queryPurchaseType("inapp", str, kVar, new AnonymousClass1(kVar));
    }
}
