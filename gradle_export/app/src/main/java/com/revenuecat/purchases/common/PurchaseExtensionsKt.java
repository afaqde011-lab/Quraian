package com.revenuecat.purchases.common;

import android.text.TextUtils;
import h00.q;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import qd.s;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u0018\u0010\u0005\u001a\u00020\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0003¨\u0006\u0006"}, d2 = {"Lqd/s;", "", "toHumanReadableDescription", "(Lqd/s;)Ljava/lang/String;", "getFirstProductId", "firstProductId", "purchases_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PurchaseExtensionsKt {
    public static final String getFirstProductId(s sVar) {
        m.e(sVar, "<this>");
        Object obj = sVar.a().get(0);
        m.d(obj, "products[0]");
        return (String) obj;
    }

    public static final String toHumanReadableDescription(s sVar) {
        m.e(sVar, "<this>");
        StringBuilder sb = new StringBuilder("productIds: ");
        sb.append(q.R0(sVar.a(), null, "[", "]", null, 57));
        sb.append(", orderId: ");
        String strOptString = sVar.c.optString("orderId");
        if (TextUtils.isEmpty(strOptString)) {
            strOptString = null;
        }
        sb.append(strOptString);
        sb.append(", purchaseToken: ");
        sb.append(sVar.b());
        return sb.toString();
    }
}
