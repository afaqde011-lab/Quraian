package com.revenuecat.purchases.models;

import kotlin.Metadata;
import kotlin.jvm.internal.m;
import l40.a;
import n40.e;
import o40.b;
import o40.c;
import o40.d;
import p40.e0;
import ri.t1;
import ta.c0;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013R\u001a\u0010\u0018\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/revenuecat/purchases/models/PricingPhaseSerializer;", "Ll40/a;", "Lcom/revenuecat/purchases/models/PricingPhase;", "<init>", "()V", "Lo40/d;", "encoder", "value", "Lg00/b0;", "serialize", "(Lo40/d;Lcom/revenuecat/purchases/models/PricingPhase;)V", "Lo40/c;", "decoder", "deserialize", "(Lo40/c;)Lcom/revenuecat/purchases/models/PricingPhase;", "", "nullableIntSerializer", "Ll40/a;", "BILLING_PERIOD_INDEX", "I", "RECURRENCE_MODE_INDEX", "BILLING_CYCLE_COUNT_INDEX", "PRICE_INDEX", "Ln40/e;", "descriptor", "Ln40/e;", "getDescriptor", "()Ln40/e;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PricingPhaseSerializer implements a {
    private static final int BILLING_CYCLE_COUNT_INDEX = 2;
    private static final int BILLING_PERIOD_INDEX = 0;
    private static final int PRICE_INDEX = 3;
    private static final int RECURRENCE_MODE_INDEX = 1;
    public static final PricingPhaseSerializer INSTANCE = new PricingPhaseSerializer();
    private static final a nullableIntSerializer = c0.G(e0.a);
    private static final e descriptor = t1.k("PricingPhase", new e[0], PricingPhaseSerializer$descriptor$1.INSTANCE);

    private PricingPhaseSerializer() {
    }

    @Override
    public PricingPhase deserialize(c decoder) {
        m.e(decoder, "decoder");
        e descriptor2 = getDescriptor();
        o40.a aVarC = decoder.c(descriptor2);
        Period period = null;
        RecurrenceMode recurrenceMode = null;
        Integer num = null;
        Price price = null;
        while (true) {
            PricingPhaseSerializer pricingPhaseSerializer = INSTANCE;
            int iL = aVarC.l(pricingPhaseSerializer.getDescriptor());
            if (iL == -1) {
                m.b(period);
                m.b(recurrenceMode);
                m.b(price);
                PricingPhase pricingPhase = new PricingPhase(period, recurrenceMode, num, price);
                aVarC.a(descriptor2);
                return pricingPhase;
            }
            if (iL == 0) {
                period = (Period) aVarC.s(pricingPhaseSerializer.getDescriptor(), 0, PeriodSerializer.INSTANCE, null);
            } else if (iL == 1) {
                recurrenceMode = (RecurrenceMode) aVarC.s(pricingPhaseSerializer.getDescriptor(), 1, RecurrenceModeSerializer.INSTANCE, null);
            } else if (iL == 2) {
                num = (Integer) aVarC.s(pricingPhaseSerializer.getDescriptor(), 2, nullableIntSerializer, null);
            } else {
                if (iL != 3) {
                    throw new IllegalStateException(("Unexpected index: " + iL).toString());
                }
                price = (Price) aVarC.s(pricingPhaseSerializer.getDescriptor(), 3, PriceSerializer.INSTANCE, null);
            }
        }
    }

    @Override
    public e getDescriptor() {
        return descriptor;
    }

    @Override
    public void serialize(d encoder, PricingPhase value) {
        m.e(encoder, "encoder");
        m.e(value, "value");
        e descriptor2 = getDescriptor();
        b bVarC = encoder.c(descriptor2);
        PricingPhaseSerializer pricingPhaseSerializer = INSTANCE;
        bVarC.C(pricingPhaseSerializer.getDescriptor(), 0, PeriodSerializer.INSTANCE, value.getBillingPeriod());
        bVarC.C(pricingPhaseSerializer.getDescriptor(), 1, RecurrenceModeSerializer.INSTANCE, value.getRecurrenceMode());
        bVarC.C(pricingPhaseSerializer.getDescriptor(), 2, nullableIntSerializer, value.getBillingCycleCount());
        bVarC.C(pricingPhaseSerializer.getDescriptor(), 3, PriceSerializer.INSTANCE, value.getPrice());
        bVarC.a(descriptor2);
    }
}
