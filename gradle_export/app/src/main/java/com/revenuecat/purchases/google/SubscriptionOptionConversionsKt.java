package com.revenuecat.purchases.google;

import com.revenuecat.purchases.models.GoogleInstallmentsInfo;
import com.revenuecat.purchases.models.GoogleSubscriptionOption;
import h00.q;
import h00.r;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import qd.l;
import qd.n;
import qd.o;
import qd.p;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\"\u001a\u0010\n\u001a\u0004\u0018\u00010\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\"\u0018\u0010\f\u001a\u00020\u000b*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u0018\u0010\u0012\u001a\u00020\u000f*\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lqd/o;", "", "productId", "Lqd/p;", "productDetails", "Lcom/revenuecat/purchases/models/GoogleSubscriptionOption;", "toSubscriptionOption", "(Lqd/o;Ljava/lang/String;Lqd/p;)Lcom/revenuecat/purchases/models/GoogleSubscriptionOption;", "getSubscriptionBillingPeriod", "(Lqd/o;)Ljava/lang/String;", "subscriptionBillingPeriod", "", "isBasePlan", "(Lqd/o;)Z", "Lqd/l;", "Lcom/revenuecat/purchases/models/GoogleInstallmentsInfo;", "getInstallmentsInfo", "(Lqd/l;)Lcom/revenuecat/purchases/models/GoogleInstallmentsInfo;", "installmentsInfo", "purchases_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SubscriptionOptionConversionsKt {
    private static final GoogleInstallmentsInfo getInstallmentsInfo(l lVar) {
        return new GoogleInstallmentsInfo(lVar.a, lVar.b);
    }

    public static final String getSubscriptionBillingPeriod(o oVar) {
        m.e(oVar, "<this>");
        ArrayList arrayList = oVar.d.B;
        m.d(arrayList, "this.pricingPhases.pricingPhaseList");
        n nVar = (n) q.U0(arrayList);
        if (nVar != null) {
            return nVar.d;
        }
        return null;
    }

    public static final boolean isBasePlan(o oVar) {
        m.e(oVar, "<this>");
        return oVar.d.B.size() == 1;
    }

    public static final GoogleSubscriptionOption toSubscriptionOption(o oVar, String productId, p productDetails) {
        m.e(oVar, "<this>");
        m.e(productId, "productId");
        m.e(productDetails, "productDetails");
        ArrayList<n> arrayList = oVar.d.B;
        m.d(arrayList, "pricingPhases.pricingPhaseList");
        ArrayList arrayList2 = new ArrayList(r.q0(arrayList, 10));
        for (n it : arrayList) {
            m.d(it, "it");
            arrayList2.add(PricingPhaseConversionsKt.toRevenueCatPricingPhase(it));
        }
        String basePlanId = oVar.a;
        m.d(basePlanId, "basePlanId");
        String str = oVar.b;
        ArrayList offerTags = oVar.e;
        m.d(offerTags, "offerTags");
        String offerToken = oVar.c;
        m.d(offerToken, "offerToken");
        l lVar = oVar.f;
        return new GoogleSubscriptionOption(productId, basePlanId, str, arrayList2, offerTags, productDetails, offerToken, null, lVar != null ? getInstallmentsInfo(lVar) : null);
    }
}
