package iz;

import b2.r;
import com.google.android.gms.internal.measurement.z3;
import g00.b0;
import h0.w;
import h0.z1;
import l1.g0;
import l1.m1;
import l1.r1;
import l1.z0;
import w.c0;
import w.x0;
import w.y0;
import z2.w0;

public abstract class j {
    public static final float a = 24;

    public static final void a(int i, r rVar, l1.j jVar, boolean z) {
        boolean z2;
        g0 g0Var = (g0) jVar;
        g0Var.e0(-505914994);
        int i2 = (g0Var.h(z) ? 32 : 16) | i;
        if (g0Var.S(i2 & 1, (i2 & 147) != 146)) {
            w0 w0VarD = h0.o.d(b2.b.A, false);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            r rVarC = b2.a.c(rVar, g0Var);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(w0VarD, g0Var, b3.h.f);
            l1.q.I(m1VarM, g0Var, b3.h.e);
            l1.q.I(Integer.valueOf(iHashCode), g0Var, b3.h.g);
            l1.q.E(g0Var, b3.h.h);
            l1.q.I(rVarC, g0Var, b3.h.d);
            z2 = z;
            c0.b(w.a, z2, z1.c, (x0) null, (y0) null, (String) null, d.c, g0Var, 1573254 | (i2 & 112), 28);
            g0Var.r(true);
        } else {
            z2 = z;
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new ix.f(z2, rVar, i, 2);
        }
    }

    public static final void b(final boolean z, final boolean z2, final boolean z3, final u00.a onDismiss, final u00.a onInputChanged, final u00.k onSubmit, l1.j jVar, final int i) {
        int i2;
        boolean z4;
        boolean z5;
        kotlin.jvm.internal.m.e(onDismiss, "onDismiss");
        kotlin.jvm.internal.m.e(onInputChanged, "onInputChanged");
        kotlin.jvm.internal.m.e(onSubmit, "onSubmit");
        g0 g0Var = (g0) jVar;
        g0Var.e0(-493666151);
        if ((i & 6) == 0) {
            i2 = (g0Var.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            z4 = z2;
            i2 |= g0Var.h(z4) ? 32 : 16;
        } else {
            z4 = z2;
        }
        if ((i & 384) == 0) {
            z5 = z3;
            i2 |= g0Var.h(z5) ? 256 : 128;
        } else {
            z5 = z3;
        }
        if ((i & 3072) == 0) {
            i2 |= g0Var.i(onDismiss) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= g0Var.i(onInputChanged) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= g0Var.i(onSubmit) ? 131072 : 65536;
        }
        int i3 = i2;
        if (!g0Var.S(i3 & 1, (74899 & i3) != 74898)) {
            g0Var.V();
        } else if (z) {
            g0Var.c0(-839890878);
            Object objN = g0Var.N();
            if (objN == l1.i.a) {
                objN = l1.q.z("");
                g0Var.n0(objN);
            }
            wr.k.H(z3.U(g0Var, 2131887132), z3.U(g0Var, 2131887128), onDismiss, z1.q(b2.o.A, 350), 0L, null, null, v1.d.d(2020617725, new f(z4, onSubmit, onDismiss, onInputChanged, z5, (z0) objN), g0Var), g0Var, ((i3 >> 3) & 896) | 12585984, 112);
            g0Var.r(false);
        } else {
            g0Var.c0(-834441047);
            g0Var.r(false);
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new u00.n() {
                @Override
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    j.b(z, z2, z3, onDismiss, onInputChanged, onSubmit, (l1.j) obj, l1.q.K(i | 1));
                    return b0.a;
                }
            };
        }
    }
}
