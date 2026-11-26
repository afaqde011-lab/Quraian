package com.revenuecat.purchases.paywalls;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import g00.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.UnknownFieldException;
import l40.a;
import n40.e;
import o40.b;
import o40.d;
import p40.b1;
import p40.o0;
import p40.q0;
import p40.z;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/PaywallData.Configuration.Tier.$serializer", "Lp40/z;", "Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Tier;", "<init>", "()V", "", "Ll40/a;", "childSerializers", "()[Ll40/a;", "Lo40/c;", "decoder", "deserialize", "(Lo40/c;)Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Tier;", "Lo40/d;", "encoder", "value", "Lg00/b0;", "serialize", "(Lo40/d;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Tier;)V", "Ln40/e;", "getDescriptor", "()Ln40/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@c
public final class PaywallData$Configuration$Tier$$serializer implements z {
    public static final PaywallData$Configuration$Tier$$serializer INSTANCE;
    private static final q0 descriptor;

    static {
        PaywallData$Configuration$Tier$$serializer paywallData$Configuration$Tier$$serializer = new PaywallData$Configuration$Tier$$serializer();
        INSTANCE = paywallData$Configuration$Tier$$serializer;
        q0 q0Var = new q0("com.revenuecat.purchases.paywalls.PaywallData.Configuration.Tier", paywallData$Configuration$Tier$$serializer, 3);
        q0Var.j(DiagnosticsEntry.ID_KEY, false);
        q0Var.j("packages", false);
        q0Var.j("default_package", false);
        descriptor = q0Var;
    }

    private PaywallData$Configuration$Tier$$serializer() {
    }

    @Override
    public a[] childSerializers() {
        a aVar = PaywallData.Configuration.Tier.$childSerializers[1];
        b1 b1Var = b1.a;
        return new a[]{b1Var, aVar, b1Var};
    }

    @Override
    public PaywallData.Configuration.Tier deserialize(o40.c decoder) {
        m.e(decoder, "decoder");
        e descriptor2 = getDescriptor();
        o40.a aVarC = decoder.c(descriptor2);
        a[] aVarArr = PaywallData.Configuration.Tier.$childSerializers;
        int i = 0;
        String strT = null;
        List list = null;
        String strT2 = null;
        boolean z = true;
        while (z) {
            int iL = aVarC.l(descriptor2);
            if (iL == -1) {
                z = false;
            } else if (iL == 0) {
                strT = aVarC.t(descriptor2, 0);
                i |= 1;
            } else if (iL == 1) {
                list = (List) aVarC.s(descriptor2, 1, aVarArr[1], list);
                i |= 2;
            } else {
                if (iL != 2) {
                    throw new UnknownFieldException(iL);
                }
                strT2 = aVarC.t(descriptor2, 2);
                i |= 4;
            }
        }
        aVarC.a(descriptor2);
        return new PaywallData.Configuration.Tier(i, strT, list, strT2, null);
    }

    @Override
    public e getDescriptor() {
        return descriptor;
    }

    @Override
    public void serialize(d encoder, PaywallData.Configuration.Tier value) {
        m.e(encoder, "encoder");
        m.e(value, "value");
        e descriptor2 = getDescriptor();
        b bVarC = encoder.c(descriptor2);
        PaywallData.Configuration.Tier.write$Self$purchases_defaultsBc8Release(value, bVarC, descriptor2);
        bVarC.a(descriptor2);
    }

    @Override
    public a[] typeParametersSerializers() {
        return o0.b;
    }
}
