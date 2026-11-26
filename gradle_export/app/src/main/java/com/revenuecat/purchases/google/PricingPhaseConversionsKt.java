package com.revenuecat.purchases.google;

import com.revenuecat.purchases.models.Period;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.models.PricingPhase;
import com.revenuecat.purchases.models.RecurrenceMode;
import com.revenuecat.purchases.models.RecurrenceModeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import qd.n;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqd/n;", "Lcom/revenuecat/purchases/models/PricingPhase;", "toRevenueCatPricingPhase", "(Lqd/n;)Lcom/revenuecat/purchases/models/PricingPhase;", "purchases_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PricingPhaseConversionsKt {
    public static final PricingPhase toRevenueCatPricingPhase(n nVar) {
        m.e(nVar, "<this>");
        Period.Companion companion = Period.INSTANCE;
        String billingPeriod = nVar.d;
        m.d(billingPeriod, "billingPeriod");
        Period periodCreate = companion.create(billingPeriod);
        RecurrenceMode recurrenceMode = RecurrenceModeKt.toRecurrenceMode(Integer.valueOf(nVar.f));
        Integer numValueOf = Integer.valueOf(nVar.e);
        String formattedPrice = nVar.a;
        m.d(formattedPrice, "formattedPrice");
        long j = nVar.b;
        String priceCurrencyCode = nVar.c;
        m.d(priceCurrencyCode, "priceCurrencyCode");
        return new PricingPhase(periodCreate, recurrenceMode, numValueOf, new Price(formattedPrice, j, priceCurrencyCode));
    }
}
