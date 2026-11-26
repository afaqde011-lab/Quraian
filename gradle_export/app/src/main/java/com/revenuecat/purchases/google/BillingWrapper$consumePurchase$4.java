package com.revenuecat.purchases.google;

import g00.b0;
import kotlin.Metadata;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.m;
import u00.k;
import u00.n;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public class BillingWrapper$consumePurchase$4 extends j implements n {
    public BillingWrapper$consumePurchase$4(Object obj) {
        super(2, 0, BillingWrapper.class, obj, "executeRequestOnUIThread", "executeRequestOnUIThread(Ljava/lang/Long;Lkotlin/jvm/functions/Function1;)V");
    }

    @Override
    public Object invoke(Object obj, Object obj2) {
        invoke((Long) obj, (k) obj2);
        return b0.a;
    }

    public final void invoke(Long l, k p1) {
        m.e(p1, "p1");
        ((BillingWrapper) this.receiver).executeRequestOnUIThread(l, p1);
    }
}
