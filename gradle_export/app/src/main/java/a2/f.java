package a2;

import android.os.Bundle;
import com.google.android.gms.cast.MediaError;
import com.google.protobuf.RuntimeVersion;
import d0.i0;
import d00.z0;
import g00.b0;
import java.lang.annotation.Annotation;
import java.util.UUID;
import l1.q2;
import l1.t;
import p40.v;
import u.s;
import x.p0;
import x.q1;
import x.x;

public final class f implements u00.a {
    public final int A;

    public f(int i10) {
        this.A = i10;
    }

    public final Object invoke() {
        int i10 = this.A;
        b0 b0Var = b0.a;
        switch (i10) {
            case 0:
                q2 q2Var = g.f160a;
                return null;
            case 1:
                q2 q2Var2 = h.f161a;
                return null;
            case 2:
                return new hb.f();
            case 3:
                return x.c.r(x.c.w(MediaError.DetailedErrorCode.TEXT_UNKNOWN, MediaError.DetailedErrorCode.MEDIAKEYS_UNKNOWN, null, 4), p0.B, 4);
            case 4:
                return x.c.r(new q1(1700, MediaError.DetailedErrorCode.MEDIAKEYS_UNKNOWN, x.f16386c), p0.A, 4);
            case 5:
                q2 q2Var3 = al.m.a;
                return null;
            case 6:
                return null;
            case 7:
                throw new IllegalStateException("No default size");
            case 8:
                throw new IllegalStateException("No default context");
            case 9:
                q2 q2Var4 = b6.g.f2168a;
                return null;
            case 10:
                throw new IllegalStateException("No default glance id");
            case 11:
                q2 q2Var5 = b6.g.f2168a;
                return i6.a.B;
            case 12:
                return b0Var;
            case 13:
                return Boolean.TRUE;
            case 14:
                q2 q2Var6 = cq.l.a;
                return null;
            case 15:
                return new v("com.mchutov.quranify.main.presentation.navigation.MainRoute.BottomNavigation", cu.b.INSTANCE, new Annotation[0]);
            case 16:
                return new v("com.mchutov.quranify.main.presentation.navigation.MainRoute.Onboarding", cu.d.INSTANCE, new Annotation[0]);
            case 17:
                float f3 = i0.f4433a;
                return b0Var;
            case TYPE_SINT64_VALUE:
                float f10 = i0.f4433a;
                return Boolean.TRUE;
            case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                return new d00.c();
            case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                return new Bundle();
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                return gm.a.A;
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                return h0.c.e(0.0f, 0.0f, 3);
            case 23:
                return UUID.randomUUID().toString();
            case 24:
                return b0Var;
            case 25:
                t tVar = e.h.f4938a;
                return null;
            case RuntimeVersion.MINOR:
                t tVar2 = e.i.f4939a;
                return null;
            case 27:
                kotlin.jvm.internal.m.e((String) e00.h.a.getValue(), "sksl");
                return new z0();
            case 28:
                kotlin.jvm.internal.m.e((String) e00.h.b.getValue(), "sksl");
                return new z0();
            default:
                return new s(50);
        }
    }
}
