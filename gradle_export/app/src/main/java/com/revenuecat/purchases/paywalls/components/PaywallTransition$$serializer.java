package com.revenuecat.purchases.paywalls.components;

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
import p40.x0;
import p40.z;
import ta.c0;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/components/PaywallTransition.$serializer", "Lp40/z;", "Lcom/revenuecat/purchases/paywalls/components/PaywallTransition;", "<init>", "()V", "", "Ll40/a;", "childSerializers", "()[Ll40/a;", "Lo40/c;", "decoder", "deserialize", "(Lo40/c;)Lcom/revenuecat/purchases/paywalls/components/PaywallTransition;", "Lo40/d;", "encoder", "value", "Lg00/b0;", "serialize", "(Lo40/d;Lcom/revenuecat/purchases/paywalls/components/PaywallTransition;)V", "Ln40/e;", "getDescriptor", "()Ln40/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@c
public final class PaywallTransition$$serializer implements z {
    public static final PaywallTransition$$serializer INSTANCE;
    private static final q0 descriptor;

    static {
        PaywallTransition$$serializer paywallTransition$$serializer = new PaywallTransition$$serializer();
        INSTANCE = paywallTransition$$serializer;
        q0 q0Var = new q0("com.revenuecat.purchases.paywalls.components.PaywallTransition", paywallTransition$$serializer, 3);
        q0Var.j("type", true);
        q0Var.j("displacement_strategy", false);
        q0Var.j("animation", true);
        descriptor = q0Var;
    }

    private PaywallTransition$$serializer() {
    }

    @Override
    public a[] childSerializers() {
        return new a[]{TransitionTypeSerializer.INSTANCE, DisplacementStrategyDeserializer.INSTANCE, c0.G(PaywallAnimation$$serializer.INSTANCE)};
    }

    @Override
    public PaywallTransition deserialize(o40.c decoder) {
        m.e(decoder, "decoder");
        e descriptor2 = getDescriptor();
        o40.a aVarC = decoder.c(descriptor2);
        int i = 0;
        PaywallTransition.TransitionType transitionType = null;
        PaywallTransition.DisplacementStrategy displacementStrategy = null;
        PaywallAnimation paywallAnimation = null;
        boolean z = true;
        while (z) {
            int iL = aVarC.l(descriptor2);
            if (iL == -1) {
                z = false;
            } else if (iL == 0) {
                transitionType = (PaywallTransition.TransitionType) aVarC.s(descriptor2, 0, TransitionTypeSerializer.INSTANCE, transitionType);
                i |= 1;
            } else if (iL == 1) {
                displacementStrategy = (PaywallTransition.DisplacementStrategy) aVarC.s(descriptor2, 1, DisplacementStrategyDeserializer.INSTANCE, displacementStrategy);
                i |= 2;
            } else {
                if (iL != 2) {
                    throw new UnknownFieldException(iL);
                }
                paywallAnimation = (PaywallAnimation) aVarC.v(descriptor2, 2, PaywallAnimation$$serializer.INSTANCE, paywallAnimation);
                i |= 4;
            }
        }
        aVarC.a(descriptor2);
        return new PaywallTransition(i, transitionType, displacementStrategy, paywallAnimation, (x0) null);
    }

    @Override
    public e getDescriptor() {
        return descriptor;
    }

    @Override
    public void serialize(d encoder, PaywallTransition value) {
        m.e(encoder, "encoder");
        m.e(value, "value");
        e descriptor2 = getDescriptor();
        b bVarC = encoder.c(descriptor2);
        PaywallTransition.write$Self$purchases_defaultsBc8Release(value, bVarC, descriptor2);
        bVarC.a(descriptor2);
    }

    @Override
    public a[] typeParametersSerializers() {
        return o0.b;
    }
}
