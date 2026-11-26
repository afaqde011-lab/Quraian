package com.revenuecat.purchases.paywalls.events;

import g00.c;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.UnknownFieldException;
import l40.a;
import n40.e;
import o40.b;
import o40.d;
import p40.o0;
import p40.q0;
import p40.z;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/events/PaywallEvent.$serializer", "Lp40/z;", "Lcom/revenuecat/purchases/paywalls/events/PaywallEvent;", "<init>", "()V", "", "Ll40/a;", "childSerializers", "()[Ll40/a;", "Lo40/c;", "decoder", "deserialize", "(Lo40/c;)Lcom/revenuecat/purchases/paywalls/events/PaywallEvent;", "Lo40/d;", "encoder", "value", "Lg00/b0;", "serialize", "(Lo40/d;Lcom/revenuecat/purchases/paywalls/events/PaywallEvent;)V", "Ln40/e;", "getDescriptor", "()Ln40/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@c
public final class PaywallEvent$$serializer implements z {
    public static final PaywallEvent$$serializer INSTANCE;
    private static final q0 descriptor;

    static {
        PaywallEvent$$serializer paywallEvent$$serializer = new PaywallEvent$$serializer();
        INSTANCE = paywallEvent$$serializer;
        q0 q0Var = new q0("com.revenuecat.purchases.paywalls.events.PaywallEvent", paywallEvent$$serializer, 3);
        q0Var.j("creationData", false);
        q0Var.j("data", false);
        q0Var.j("type", false);
        descriptor = q0Var;
    }

    private PaywallEvent$$serializer() {
    }

    @Override
    public a[] childSerializers() {
        return new a[]{PaywallEvent$CreationData$$serializer.INSTANCE, PaywallEventDataSerializer.INSTANCE, PaywallEvent.$childSerializers[2]};
    }

    @Override
    public PaywallEvent deserialize(o40.c decoder) {
        m.e(decoder, "decoder");
        e descriptor2 = getDescriptor();
        o40.a aVarC = decoder.c(descriptor2);
        a[] aVarArr = PaywallEvent.$childSerializers;
        int i = 0;
        PaywallEvent.CreationData creationData = null;
        PaywallEvent.Data data = null;
        PaywallEventType paywallEventType = null;
        boolean z = true;
        while (z) {
            int iL = aVarC.l(descriptor2);
            if (iL == -1) {
                z = false;
            } else if (iL == 0) {
                creationData = (PaywallEvent.CreationData) aVarC.s(descriptor2, 0, PaywallEvent$CreationData$$serializer.INSTANCE, creationData);
                i |= 1;
            } else if (iL == 1) {
                data = (PaywallEvent.Data) aVarC.s(descriptor2, 1, PaywallEventDataSerializer.INSTANCE, data);
                i |= 2;
            } else {
                if (iL != 2) {
                    throw new UnknownFieldException(iL);
                }
                paywallEventType = (PaywallEventType) aVarC.s(descriptor2, 2, aVarArr[2], paywallEventType);
                i |= 4;
            }
        }
        aVarC.a(descriptor2);
        return new PaywallEvent(i, creationData, data, paywallEventType, null);
    }

    @Override
    public e getDescriptor() {
        return descriptor;
    }

    @Override
    public void serialize(d encoder, PaywallEvent value) {
        m.e(encoder, "encoder");
        m.e(value, "value");
        e descriptor2 = getDescriptor();
        b bVarC = encoder.c(descriptor2);
        PaywallEvent.write$Self$purchases_defaultsBc8Release(value, bVarC, descriptor2);
        bVarC.a(descriptor2);
    }

    @Override
    public a[] typeParametersSerializers() {
        return o0.b;
    }
}
