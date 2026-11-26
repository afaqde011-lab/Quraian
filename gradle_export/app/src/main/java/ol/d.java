package ol;

import b2.o;
import b2.r;
import b3.g;
import b3.h;
import com.google.android.gms.internal.measurement.y3;
import dl.e;
import g1.o3;
import g1.z6;
import h0.c1;
import h0.i;
import h0.t1;
import h0.v1;
import h0.z1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.m;
import l1.g0;
import l1.j;
import l1.m1;
import l1.q;
import l1.r1;
import m3.r0;
import p0.f;
import q3.u;
import x3.k;
import x3.l;
import z.n;

public abstract class d {
    public static final float a = 420;

    public static final void a(String message, r rVar, c cVar, j jVar, int i) {
        int i2;
        long j;
        m.e(message, "message");
        g0 g0Var = (g0) jVar;
        g0Var.e0(1087227451);
        int i3 = i | (g0Var.g(message) ? 4 : 2) | (g0Var.g(rVar) ? 32 : 16) | (g0Var.e(cVar.ordinal()) ? 256 : 128);
        if (g0Var.S(i3 & 1, (i3 & 147) != 146)) {
            Object objK = g0Var.k(e.a);
            gm.a aVar = gm.a.B;
            o oVar = o.A;
            r rVarS = objK == aVar ? z1.s(oVar, 0.0f, a, 1) : z1.d(oVar, 1.0f);
            float f = 20;
            r rVarC = h0.c.C(n.f(rVar.V(rVarS), dl.a.K, f.a(f)), 16);
            v1 v1VarA = t1.a(i.g(8), b2.b.K, g0Var, 54);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            r rVarC2 = b2.a.c(rVarC, g0Var);
            b3.i.c.getClass();
            g gVar = h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            q.I(v1VarA, g0Var, h.f);
            q.I(m1VarM, g0Var, h.e);
            q.I(Integer.valueOf(iHashCode), g0Var, h.g);
            q.E(g0Var, h.h);
            q.I(rVarC2, g0Var, h.d);
            int iOrdinal = cVar.ordinal();
            if (iOrdinal == 0) {
                i2 = 2131231401;
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = 2131231400;
            }
            m2.b bVarR = y3.R(i2, g0Var, 0);
            int iOrdinal2 = cVar.ordinal();
            if (iOrdinal2 == 0) {
                j = dl.a.i;
            } else {
                if (iOrdinal2 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                j = dl.a.U;
            }
            o3.a(bVarR, (String) null, z1.m(oVar, f), j, g0Var, 440, 0);
            long j2 = dl.a.k;
            long jZ = kh.o.z(14);
            long jZ2 = kh.o.z(18);
            u uVar = u.J;
            if (1.0f <= 0.0d) {
                i0.a.a("invalid weight; must be greater than zero");
            }
            z6.b(message, new c1(1.0f, false), j2, jZ, uVar, (q3.i) null, 0L, (l) null, (k) null, jZ2, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, (14 & i3) | 1597824, 48, 260008);
            g0Var = g0Var;
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new b1.n(i, 22, message, rVar, cVar);
        }
    }
}
