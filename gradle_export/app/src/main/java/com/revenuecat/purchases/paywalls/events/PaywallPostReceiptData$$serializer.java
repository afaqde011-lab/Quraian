package com.revenuecat.purchases.paywalls.events;

import com.revenuecat.purchases.common.HTTPClient;
import g00.c;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.UnknownFieldException;
import l40.a;
import n40.e;
import o40.b;
import o40.d;
import p40.b1;
import p40.e0;
import p40.f;
import p40.o0;
import p40.q0;
import p40.z;
import ta.c0;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/events/PaywallPostReceiptData.$serializer", "Lp40/z;", "Lcom/revenuecat/purchases/paywalls/events/PaywallPostReceiptData;", "<init>", "()V", "", "Ll40/a;", "childSerializers", "()[Ll40/a;", "Lo40/c;", "decoder", "deserialize", "(Lo40/c;)Lcom/revenuecat/purchases/paywalls/events/PaywallPostReceiptData;", "Lo40/d;", "encoder", "value", "Lg00/b0;", "serialize", "(Lo40/d;Lcom/revenuecat/purchases/paywalls/events/PaywallPostReceiptData;)V", "Ln40/e;", "getDescriptor", "()Ln40/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@c
public final class PaywallPostReceiptData$$serializer implements z {
    public static final PaywallPostReceiptData$$serializer INSTANCE;
    private static final q0 descriptor;

    static {
        PaywallPostReceiptData$$serializer paywallPostReceiptData$$serializer = new PaywallPostReceiptData$$serializer();
        INSTANCE = paywallPostReceiptData$$serializer;
        q0 q0Var = new q0("com.revenuecat.purchases.paywalls.events.PaywallPostReceiptData", paywallPostReceiptData$$serializer, 7);
        q0Var.j("paywall_id", false);
        q0Var.j("session_id", false);
        q0Var.j("revision", false);
        q0Var.j("display_mode", false);
        q0Var.j("dark_mode", false);
        q0Var.j("locale", false);
        q0Var.j("offering_id", false);
        descriptor = q0Var;
    }

    private PaywallPostReceiptData$$serializer() {
    }

    @Override
    public a[] childSerializers() {
        b1 b1Var = b1.a;
        return new a[]{c0.G(b1Var), b1Var, e0.a, b1Var, f.a, b1Var, b1Var};
    }

    @Override
    public PaywallPostReceiptData deserialize(o40.c decoder) {
        m.e(decoder, "decoder");
        e descriptor2 = getDescriptor();
        o40.a aVarC = decoder.c(descriptor2);
        int i = 0;
        int iQ = 0;
        boolean zR = false;
        String str = null;
        String strT = null;
        String strT2 = null;
        String strT3 = null;
        String strT4 = null;
        boolean z = true;
        while (z) {
            int iL = aVarC.l(descriptor2);
            switch (iL) {
                case HTTPClient.NO_STATUS_CODE:
                    z = false;
                    break;
                case 0:
                    str = (String) aVarC.v(descriptor2, 0, b1.a, str);
                    i |= 1;
                    break;
                case 1:
                    strT = aVarC.t(descriptor2, 1);
                    i |= 2;
                    break;
                case 2:
                    iQ = aVarC.q(descriptor2, 2);
                    i |= 4;
                    break;
                case 3:
                    strT2 = aVarC.t(descriptor2, 3);
                    i |= 8;
                    break;
                case 4:
                    zR = aVarC.r(descriptor2, 4);
                    i |= 16;
                    break;
                case 5:
                    strT3 = aVarC.t(descriptor2, 5);
                    i |= 32;
                    break;
                case 6:
                    strT4 = aVarC.t(descriptor2, 6);
                    i |= 64;
                    break;
                default:
                    throw new UnknownFieldException(iL);
            }
        }
        aVarC.a(descriptor2);
        return new PaywallPostReceiptData(i, str, strT, iQ, strT2, zR, strT3, strT4, null);
    }

    @Override
    public e getDescriptor() {
        return descriptor;
    }

    @Override
    public void serialize(d encoder, PaywallPostReceiptData value) {
        m.e(encoder, "encoder");
        m.e(value, "value");
        e descriptor2 = getDescriptor();
        b bVarC = encoder.c(descriptor2);
        PaywallPostReceiptData.write$Self$purchases_defaultsBc8Release(value, bVarC, descriptor2);
        bVarC.a(descriptor2);
    }

    @Override
    public a[] typeParametersSerializers() {
        return o0.b;
    }
}
