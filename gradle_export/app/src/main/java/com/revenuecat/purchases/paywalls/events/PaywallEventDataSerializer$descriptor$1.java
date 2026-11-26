package com.revenuecat.purchases.paywalls.events;

import com.revenuecat.purchases.PresentedOfferingContextSerializer;
import com.revenuecat.purchases.utils.serializers.UUIDSerializer;
import g00.b0;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import n40.a;
import p40.b1;
import p40.e0;
import p40.f;
import p40.u0;
import u00.k;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln40/a;", "Lg00/b0;", "invoke", "(Ln40/a;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class PaywallEventDataSerializer$descriptor$1 extends n implements k {
    public static final PaywallEventDataSerializer$descriptor$1 INSTANCE = new PaywallEventDataSerializer$descriptor$1();

    public PaywallEventDataSerializer$descriptor$1() {
        super(1);
    }

    @Override
    public Object invoke(Object obj) {
        invoke((a) obj);
        return b0.a;
    }

    public final void invoke(a buildClassSerialDescriptor) {
        m.e(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
        buildClassSerialDescriptor.a("paywallIdentifier", PaywallEventDataSerializer.nullableStringSerializer.getDescriptor());
        buildClassSerialDescriptor.a("presentedOfferingContext", PresentedOfferingContextSerializer.INSTANCE.getDescriptor());
        buildClassSerialDescriptor.a("paywallRevision", e0.b);
        buildClassSerialDescriptor.a("sessionIdentifier", UUIDSerializer.INSTANCE.getDescriptor());
        u0 u0Var = b1.b;
        buildClassSerialDescriptor.a("displayMode", u0Var);
        buildClassSerialDescriptor.a("localeIdentifier", u0Var);
        buildClassSerialDescriptor.a("darkMode", f.b);
        buildClassSerialDescriptor.a("exitOfferType", PaywallEventDataSerializer.nullableExitOfferTypeSerializer.getDescriptor());
        buildClassSerialDescriptor.a("exitOfferingIdentifier", PaywallEventDataSerializer.nullableStringSerializer.getDescriptor());
        buildClassSerialDescriptor.a("packageIdentifier", PaywallEventDataSerializer.nullableStringSerializer.getDescriptor());
        buildClassSerialDescriptor.a("productIdentifier", PaywallEventDataSerializer.nullableStringSerializer.getDescriptor());
        buildClassSerialDescriptor.a("errorCode", PaywallEventDataSerializer.nullableIntSerializer.getDescriptor());
        buildClassSerialDescriptor.a("errorMessage", PaywallEventDataSerializer.nullableStringSerializer.getDescriptor());
        buildClassSerialDescriptor.a("offeringIdentifier", u0Var);
    }
}
