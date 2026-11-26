package com.revenuecat.purchases.google;

import kotlin.Metadata;
import kotlin.jvm.internal.m;
import oi.k;
import qd.h;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lqd/h;", "", "toHumanReadableDescription", "(Lqd/h;)Ljava/lang/String;", "", "getOnPurchasesUpdatedSubResponseCodeName", "(I)Ljava/lang/String;", "purchases_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class BillingResultExtensionsBillingIndependentKt {
    private static final String getOnPurchasesUpdatedSubResponseCodeName(int i) {
        if (i == 0) {
            return "NO_APPLICABLE_SUB_RESPONSE_CODE";
        }
        if (i != 1) {
            return i != 2 ? k.h("UNKNOWN_SUB_RESPONSE_CODE (", i, ')') : "USER_INELIGIBLE";
        }
        return "PAYMENT_DECLINED_DUE_TO_INSUFFICIENT_FUNDS";
    }

    public static final String toHumanReadableDescription(h hVar) {
        m.e(hVar, "<this>");
        StringBuilder sb = new StringBuilder("DebugMessage: ");
        sb.append(hVar.c);
        sb.append(". ErrorCode: ");
        sb.append(ErrorsKt.getBillingResponseCodeName(hVar.a));
        sb.append(". SubResponseCode: ");
        return g4.c.k(sb, getOnPurchasesUpdatedSubResponseCodeName(hVar.b), '.');
    }
}
