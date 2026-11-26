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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/common/events/BackendEvent.Ad.$serializer", "Lp40/z;", "Lcom/revenuecat/purchases/common/events/BackendEvent$Ad;", "<init>", "()V", "", "Ll40/a;", "childSerializers", "()[Ll40/a;", "Lo40/c;", "decoder", "deserialize", "(Lo40/c;)Lcom/revenuecat/purchases/common/events/BackendEvent$Ad;", "Lo40/d;", "encoder", "value", "Lg00/b0;", "serialize", "(Lo40/d;Lcom/revenuecat/purchases/common/events/BackendEvent$Ad;)V", "Ln40/e;", "getDescriptor", "()Ln40/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@c
public final class BackendEvent$Ad$$serializer implements z {
    public static final BackendEvent$Ad$$serializer INSTANCE;
    private static final q0 descriptor;

    static {
        BackendEvent$Ad$$serializer backendEvent$Ad$$serializer = new BackendEvent$Ad$$serializer();
        INSTANCE = backendEvent$Ad$$serializer;
        q0 q0Var = new q0("ad", backendEvent$Ad$$serializer, 16);
        q0Var.j(DiagnosticsEntry.ID_KEY, false);
        q0Var.j(DiagnosticsEntry.VERSION_KEY, false);
        q0Var.j("type", false);
        q0Var.j("timestamp_ms", false);
        q0Var.j("network_name", true);
        q0Var.j("mediator_name", false);
        q0Var.j("ad_format", true);
        q0Var.j("placement", false);
        q0Var.j("ad_unit_id", false);
        q0Var.j("impression_id", false);
        q0Var.j("app_user_id", false);
        q0Var.j(DiagnosticsEntry.APP_SESSION_ID_KEY, false);
        q0Var.j("revenue_micros", true);
        q0Var.j("currency", true);
        q0Var.j("precision", true);
        q0Var.j("mediator_error_code", true);
        descriptor = q0Var;
    }

    private BackendEvent$Ad$$serializer() {
    }

    @Override
    public a[] childSerializers() {
        b1 b1Var = b1.a;
        e0 e0Var = e0.a;
        k0 k0Var = k0.a;
        return new a[]{b1Var, e0Var, b1Var, k0Var, c0.G(b1Var), b1Var, c0.G(b1Var), c0.G(b1Var), b1Var, c0.G(b1Var), b1Var, b1Var, c0.G(k0Var), c0.G(b1Var), c0.G(b1Var), c0.G(e0Var)};
    }

    @Override
    public BackendEvent.Ad deserialize(o40.c decoder) {
        String strT;
        m.e(decoder, "decoder");
        e descriptor2 = getDescriptor();
        o40.a aVarC = decoder.c(descriptor2);
        String str = null;
        Long l = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String strT2 = null;
        Integer num = null;
        String str5 = null;
        String strT3 = null;
        String strT4 = null;
        String strT5 = null;
        String strT6 = null;
        long jG = 0;
        int i = 0;
        boolean z = true;
        int iQ = 0;
        String str6 = null;
        String str7 = null;
        while (z) {
            int iL = aVarC.l(descriptor2);
            switch (iL) {
                case HTTPClient.NO_STATUS_CODE:
                    strT = str3;
                    z = false;
                    break;
                case 0:
                    strT = aVarC.t(descriptor2, 0);
                    i |= 1;
                    break;
                case 1:
                    iQ = aVarC.q(descriptor2, 1);
                    i |= 2;
                    continue;
                case 2:
                    strT2 = aVarC.t(descriptor2, 2);
                    i |= 4;
                    continue;
                case 3:
                    jG = aVarC.g(descriptor2, 3);
                    i |= 8;
                    continue;
                case 4:
                    strT = str3;
                    str5 = (String) aVarC.v(descriptor2, 4, b1.a, str5);
                    i |= 16;
                    break;
                case 5:
                    strT3 = aVarC.t(descriptor2, 5);
                    i |= 32;
                    continue;
                case 6:
                    strT = str3;
                    str = (String) aVarC.v(descriptor2, 6, b1.a, str);
                    i |= 64;
                    break;
                case 7:
                    strT = str3;
                    str6 = (String) aVarC.v(descriptor2, 7, b1.a, str6);
                    i |= 128;
                    break;
                case 8:
                    strT4 = aVarC.t(descriptor2, 8);
                    i |= 256;
                    continue;
                case 9:
                    strT = str3;
                    str7 = (String) aVarC.v(descriptor2, 9, b1.a, str7);
                    i |= 512;
                    break;
                case 10:
                    strT5 = aVarC.t(descriptor2, 10);
                    i |= 1024;
                    continue;
                case 11:
                    strT6 = aVarC.t(descriptor2, 11);
                    i |= 2048;
                    continue;
                case 12:
                    strT = str3;
                    l = (Long) aVarC.v(descriptor2, 12, k0.a, l);
                    i |= 4096;
                    break;
                case 13:
                    strT = str3;
                    str2 = (String) aVarC.v(descriptor2, 13, b1.a, str2);
                    i |= 8192;
                    break;
                case 14:
                    strT = str3;
                    str4 = (String) aVarC.v(descriptor2, 14, b1.a, str4);
                    i |= 16384;
                    break;
                case 15:
                    strT = str3;
                    num = (Integer) aVarC.v(descriptor2, 15, e0.a, num);
                    i |= 32768;
                    break;
                default:
                    throw new UnknownFieldException(iL);
            }
            str3 = strT;
        }
        aVarC.a(descriptor2);
        return new BackendEvent.Ad(i, str3, iQ, strT2, jG, str5, strT3, str, str6, strT4, str7, strT5, strT6, l, str2, str4, num, (x0) null);
    }

    @Override
    public e getDescriptor() {
        return descriptor;
    }

    @Override
    public void serialize(d encoder, BackendEvent.Ad value) {
        m.e(encoder, "encoder");
        m.e(value, "value");
        e descriptor2 = getDescriptor();
        b bVarC = encoder.c(descriptor2);
        BackendEvent.Ad.write$Self$purchases_defaultsBc8Release(value, bVarC, descriptor2);
        bVarC.a(descriptor2);
    }

    @Override
    public a[] typeParametersSerializers() {
        return o0.b;
    }
}
