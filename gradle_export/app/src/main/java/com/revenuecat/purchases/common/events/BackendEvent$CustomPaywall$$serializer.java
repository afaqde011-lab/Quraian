package com.revenuecat.purchases.common.events;

import com.revenuecat.purchases.common.HTTPClient;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
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
import p40.k0;
import p40.o0;
import p40.q0;
import p40.x0;
import p40.z;
import ta.c0;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/common/events/BackendEvent.CustomPaywall.$serializer", "Lp40/z;", "Lcom/revenuecat/purchases/common/events/BackendEvent$CustomPaywall;", "<init>", "()V", "", "Ll40/a;", "childSerializers", "()[Ll40/a;", "Lo40/c;", "decoder", "deserialize", "(Lo40/c;)Lcom/revenuecat/purchases/common/events/BackendEvent$CustomPaywall;", "Lo40/d;", "encoder", "value", "Lg00/b0;", "serialize", "(Lo40/d;Lcom/revenuecat/purchases/common/events/BackendEvent$CustomPaywall;)V", "Ln40/e;", "getDescriptor", "()Ln40/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@c
public final class BackendEvent$CustomPaywall$$serializer implements z {
    public static final BackendEvent$CustomPaywall$$serializer INSTANCE;
    private static final q0 descriptor;

    static {
        BackendEvent$CustomPaywall$$serializer backendEvent$CustomPaywall$$serializer = new BackendEvent$CustomPaywall$$serializer();
        INSTANCE = backendEvent$CustomPaywall$$serializer;
        q0 q0Var = new q0("custom_paywall_event", backendEvent$CustomPaywall$$serializer, 8);
        q0Var.j(DiagnosticsEntry.ID_KEY, false);
        q0Var.j(DiagnosticsEntry.VERSION_KEY, false);
        q0Var.j("type", false);
        q0Var.j("app_user_id", false);
        q0Var.j(DiagnosticsEntry.APP_SESSION_ID_KEY, true);
        q0Var.j(DiagnosticsEntry.TIMESTAMP_KEY, false);
        q0Var.j("paywall_id", true);
        q0Var.j("offering_id", true);
        descriptor = q0Var;
    }

    private BackendEvent$CustomPaywall$$serializer() {
    }

    @Override
    public a[] childSerializers() {
        b1 b1Var = b1.a;
        return new a[]{b1Var, e0.a, b1Var, b1Var, c0.G(b1Var), k0.a, c0.G(b1Var), c0.G(b1Var)};
    }

    @Override
    public BackendEvent.CustomPaywall deserialize(o40.c decoder) {
        m.e(decoder, "decoder");
        e descriptor2 = getDescriptor();
        o40.a aVarC = decoder.c(descriptor2);
        String str = null;
        String strT = null;
        String strT2 = null;
        String strT3 = null;
        String str2 = null;
        long jG = 0;
        int i = 0;
        int iQ = 0;
        boolean z = true;
        String str3 = null;
        while (z) {
            int iL = aVarC.l(descriptor2);
            switch (iL) {
                case HTTPClient.NO_STATUS_CODE:
                    z = false;
                    break;
                case 0:
                    strT = aVarC.t(descriptor2, 0);
                    i |= 1;
                    break;
                case 1:
                    iQ = aVarC.q(descriptor2, 1);
                    i |= 2;
                    break;
                case 2:
                    strT2 = aVarC.t(descriptor2, 2);
                    i |= 4;
                    break;
                case 3:
                    strT3 = aVarC.t(descriptor2, 3);
                    i |= 8;
                    break;
                case 4:
                    str2 = (String) aVarC.v(descriptor2, 4, b1.a, str2);
                    i |= 16;
                    break;
                case 5:
                    jG = aVarC.g(descriptor2, 5);
                    i |= 32;
                    break;
                case 6:
                    str = (String) aVarC.v(descriptor2, 6, b1.a, str);
                    i |= 64;
                    break;
                case 7:
                    str3 = (String) aVarC.v(descriptor2, 7, b1.a, str3);
                    i |= 128;
                    break;
                default:
                    throw new UnknownFieldException(iL);
            }
        }
        aVarC.a(descriptor2);
        return new BackendEvent.CustomPaywall(i, strT, iQ, strT2, strT3, str2, jG, str, str3, (x0) null);
    }

    @Override
    public e getDescriptor() {
        return descriptor;
    }

    @Override
    public void serialize(d encoder, BackendEvent.CustomPaywall value) {
        m.e(encoder, "encoder");
        m.e(value, "value");
        e descriptor2 = getDescriptor();
        b bVarC = encoder.c(descriptor2);
        BackendEvent.CustomPaywall.write$Self$purchases_defaultsBc8Release(value, bVarC, descriptor2);
        bVarC.a(descriptor2);
    }

    @Override
    public a[] typeParametersSerializers() {
        return o0.b;
    }
}
