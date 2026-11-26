package up;

import b2.o;
import b2.r;
import ct.z;
import h0.z1;
import l1.g0;
import l1.j;
import l1.m1;
import l1.q;
import l1.r1;
import q3.u;
import z2.w0;

public abstract class d {
    public static final float a = 16;

    public static final void a(int i, r rVar, String str, j jVar, boolean z) {
        int i2;
        g0 g0Var;
        r rVar2;
        boolean z2;
        g0 g0Var2 = (g0) jVar;
        g0Var2.e0(-588629848);
        if ((i & 6) == 0) {
            i2 = (g0Var2.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= g0Var2.h(z) ? 256 : 128;
        }
        if (!g0Var2.S(i3 & 1, (i3 & 147) != 146)) {
            g0Var = g0Var2;
            g0Var.V();
            rVar2 = rVar;
        } else {
            if (!z && str == null) {
                r1 r1VarT = g0Var2.t();
                if (r1VarT != null) {
                    r1VarT.d = new z(str, i, z);
                    return;
                }
                return;
            }
            rVar2 = o.A;
            r rVarV = z1.d(rVar2, 1.0f).V(z ? z1.e(rVar2, a) : rVar2);
            w0 w0VarD = h0.o.d(b2.b.A, false);
            int iHashCode = Long.hashCode(g0Var2.T);
            m1 m1VarM = g0Var2.m();
            r rVarC = b2.a.c(rVarV, g0Var2);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var2.g0();
            if (g0Var2.S) {
                g0Var2.l(gVar);
            } else {
                g0Var2.q0();
            }
            q.I(w0VarD, g0Var2, b3.h.f);
            q.I(m1VarM, g0Var2, b3.h.e);
            q.I(Integer.valueOf(iHashCode), g0Var2, b3.h.g);
            q.E(g0Var2, b3.h.h);
            q.I(rVarC, g0Var2, b3.h.d);
            if (str != null) {
                g0Var2.c0(168869360);
                z2 = true;
                k00.f.a(str, null, dl.a.U, kh.o.z(12), new y3.o(kh.o.z(16)), u.B, null, 1, 0.0f, null, g0Var2, (i3 & 14) | 12807168, 834);
                g0Var = g0Var2;
                g0Var.r(false);
            } else {
                g0Var = g0Var2;
                z2 = true;
                g0Var.c0(169119220);
                g0Var.r(false);
            }
            g0Var.r(z2);
        }
        r1 r1VarT2 = g0Var.t();
        if (r1VarT2 != null) {
            r1VarT2.d = new ct.h(str, rVar2, z, i, 7);
        }
    }
}
