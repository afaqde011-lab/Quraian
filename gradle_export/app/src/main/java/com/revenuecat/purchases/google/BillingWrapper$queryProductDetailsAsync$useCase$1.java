package com.revenuecat.purchases.google;

import g00.b0;
import kotlin.Metadata;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.m;
import u00.k;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public class BillingWrapper$queryProductDetailsAsync$useCase$1 extends j implements k {
    public BillingWrapper$queryProductDetailsAsync$useCase$1(Object obj) {
        super(1, 0, BillingWrapper.class, obj, "withConnectedClient", "withConnectedClient(Lkotlin/jvm/functions/Function1;)V");
    }

    @Override
    public Object invoke(Object obj) {
        invoke((k) obj);
        return b0.a;
    }

    public final void invoke(k p0) {
        m.e(p0, "p0");
        ((BillingWrapper) this.receiver).withConnectedClient(p0);
    }
}
