package com.revenuecat.purchases.common.events;

import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import com.revenuecat.purchases.common.HTTPClient;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
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
import p40.k0;
import p40.o0;
import p40.q0;
import p40.x0;
import p40.z;
import ta.c0;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/common/events/BackendEvent.Paywalls.$serializer", "Lp40/z;", "Lcom/revenuecat/purchases/common/events/BackendEvent$Paywalls;", "<init>", "()V", "", "Ll40/a;", "childSerializers", "()[Ll40/a;", "Lo40/c;", "decoder", "deserialize", "(Lo40/c;)Lcom/revenuecat/purchases/common/events/BackendEvent$Paywalls;", "Lo40/d;", "encoder", "value", "Lg00/b0;", "serialize", "(Lo40/d;Lcom/revenuecat/purchases/common/events/BackendEvent$Paywalls;)V", "Ln40/e;", "getDescriptor", "()Ln40/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@c
public final class BackendEvent$Paywalls$$serializer implements z {
    public static final BackendEvent$Paywalls$$serializer INSTANCE;
    private static final q0 descriptor;

    static {
        BackendEvent$Paywalls$$serializer backendEvent$Paywalls$$serializer = new BackendEvent$Paywalls$$serializer();
        INSTANCE = backendEvent$Paywalls$$serializer;
        q0 q0Var = new q0("paywalls", backendEvent$Paywalls$$serializer, 18);
        q0Var.j(DiagnosticsEntry.ID_KEY, false);
        q0Var.j(DiagnosticsEntry.VERSION_KEY, false);
        q0Var.j("type", false);
        q0Var.j("app_user_id", false);
        q0Var.j("session_id", false);
        q0Var.j("offering_id", false);
        q0Var.j("paywall_id", false);
        q0Var.j("paywall_revision", false);
        q0Var.j(DiagnosticsEntry.TIMESTAMP_KEY, false);
        q0Var.j("display_mode", false);
        q0Var.j("dark_mode", false);
        q0Var.j("locale", false);
        q0Var.j("exit_offer_type", true);
        q0Var.j("exit_offering_id", true);
        q0Var.j("package_id", true);
        q0Var.j(DiagnosticsTracker.PRODUCT_ID_KEY, true);
        q0Var.j(DiagnosticsTracker.ERROR_CODE_KEY, true);
        q0Var.j(DiagnosticsTracker.ERROR_MESSAGE_KEY, true);
        descriptor = q0Var;
    }

    private BackendEvent$Paywalls$$serializer() {
    }

    @Override
    public a[] childSerializers() {
        b1 b1Var = b1.a;
        e0 e0Var = e0.a;
        return new a[]{b1Var, e0Var, b1Var, b1Var, b1Var, b1Var, c0.G(b1Var), e0Var, k0.a, b1Var, f.a, b1Var, c0.G(b1Var), c0.G(b1Var), c0.G(b1Var), c0.G(b1Var), c0.G(e0Var), c0.G(b1Var)};
    }

    @Override
    public BackendEvent.Paywalls deserialize(o40.c decoder) {
        int i;
        m.e(decoder, "decoder");
        e descriptor2 = getDescriptor();
        o40.a aVarC = decoder.c(descriptor2);
        String str = null;
        String str2 = null;
        Integer num = null;
        String strT = null;
        String str3 = null;
        String strT2 = null;
        String strT3 = null;
        String strT4 = null;
        String strT5 = null;
        String str4 = null;
        String strT6 = null;
        String strT7 = null;
        long jG = 0;
        int i2 = 0;
        boolean z = true;
        int iQ = 0;
        int iQ2 = 0;
        boolean zR = false;
        String str5 = null;
        String str6 = null;
        while (z) {
            int iL = aVarC.l(descriptor2);
            switch (iL) {
                case HTTPClient.NO_STATUS_CODE:
                    strT = strT;
                    z = false;
                    strT = strT;
                    break;
                case 0:
                    strT = aVarC.t(descriptor2, 0);
                    i2 |= 1;
                    strT = strT;
                    break;
                case 1:
                    iQ = aVarC.q(descriptor2, 1);
                    i2 |= 2;
                    break;
                case 2:
                    strT2 = aVarC.t(descriptor2, 2);
                    i2 |= 4;
                    break;
                case 3:
                    strT3 = aVarC.t(descriptor2, 3);
                    i2 |= 8;
                    break;
                case 4:
                    strT4 = aVarC.t(descriptor2, 4);
                    i2 |= 16;
                    break;
                case 5:
                    strT5 = aVarC.t(descriptor2, 5);
                    i2 |= 32;
                    break;
                case 6:
                    strT = strT;
                    str4 = (String) aVarC.v(descriptor2, 6, b1.a, str4);
                    i2 |= 64;
                    strT = strT;
                    break;
                case 7:
                    iQ2 = aVarC.q(descriptor2, 7);
                    i2 |= 128;
                    break;
                case 8:
                    jG = aVarC.g(descriptor2, 8);
                    i2 |= 256;
                    break;
                case 9:
                    strT6 = aVarC.t(descriptor2, 9);
                    i2 |= 512;
                    break;
                case 10:
                    zR = aVarC.r(descriptor2, 10);
                    i2 |= 1024;
                    break;
                case 11:
                    strT7 = aVarC.t(descriptor2, 11);
                    i2 |= 2048;
                    break;
                case 12:
                    strT = strT;
                    str = (String) aVarC.v(descriptor2, 12, b1.a, str);
                    i2 |= 4096;
                    strT = strT;
                    break;
                case 13:
                    strT = strT;
                    str5 = (String) aVarC.v(descriptor2, 13, b1.a, str5);
                    i2 |= 8192;
                    strT = strT;
                    break;
                case 14:
                    strT = strT;
                    str6 = (String) aVarC.v(descriptor2, 14, b1.a, str6);
                    i2 |= 16384;
                    strT = strT;
                    break;
                case 15:
                    str2 = (String) aVarC.v(descriptor2, 15, b1.a, str2);
                    i = 32768;
                    i2 |= i;
                    strT = strT;
                    break;
                case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                    num = (Integer) aVarC.v(descriptor2, 16, e0.a, num);
                    i = 65536;
                    i2 |= i;
                    strT = strT;
                    break;
                case 17:
                    str3 = (String) aVarC.v(descriptor2, 17, b1.a, str3);
                    i = 131072;
                    i2 |= i;
                    strT = strT;
                    break;
                default:
                    throw new UnknownFieldException(iL);
            }
        }
        aVarC.a(descriptor2);
        return new BackendEvent.Paywalls(i2, strT, iQ, strT2, strT3, strT4, strT5, str4, iQ2, jG, strT6, zR, strT7, str, str5, str6, str2, num, str3, (x0) null);
    }

    @Override
    public e getDescriptor() {
        return descriptor;
    }

    @Override
    public void serialize(d encoder, BackendEvent.Paywalls value) {
        m.e(encoder, "encoder");
        m.e(value, "value");
        e descriptor2 = getDescriptor();
        b bVarC = encoder.c(descriptor2);
        BackendEvent.Paywalls.write$Self$purchases_defaultsBc8Release(value, bVarC, descriptor2);
        bVarC.a(descriptor2);
    }

    @Override
    public a[] typeParametersSerializers() {
        return o0.b;
    }
}
