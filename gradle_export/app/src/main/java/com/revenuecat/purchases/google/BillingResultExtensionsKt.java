package com.revenuecat.purchases.google;

import kotlin.Metadata;
import kotlin.jvm.internal.m;
import qd.h;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqd/h;", "", "isSuccessful", "(Lqd/h;)Z", "purchases_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class BillingResultExtensionsKt {
    public static final boolean isSuccessful(h hVar) {
        m.e(hVar, "<this>");
        return hVar.a == 0;
    }
}
