package kz;

import b2.i;
import b2.r;
import com.google.android.gms.internal.measurement.z3;
import g1.z6;
import h0.o;
import h0.z1;
import i2.b0;
import i2.t;
import kotlin.jvm.internal.m;
import l1.g0;
import l1.j;
import l1.m1;
import l1.q;
import l1.r1;
import m3.r0;
import q3.u;
import x3.k;
import x3.l;
import z.n;
import z2.w0;

public abstract class g {
    public static final float a = 390;
    public static final float b = 32;

    public static final void a(u00.a onClick, r rVar, j jVar, int i) {
        g0 g0Var;
        m.e(onClick, "onClick");
        g0 g0Var2 = (g0) jVar;
        g0Var2.e0(-2051361878);
        int i2 = (g0Var2.i(onClick) ? 4 : 2) | i | (g0Var2.g(rVar) ? 32 : 16);
        if (g0Var2.S(i2 & 1, (i2 & 19) != 18)) {
            boolean z = g0Var2.k(dl.e.a) == gm.a.B;
            i iVar = b2.b.E;
            w0 w0VarD = o.d(iVar, false);
            int iHashCode = Long.hashCode(g0Var2.T);
            m1 m1VarM = g0Var2.m();
            r rVarC = b2.a.c(rVar, g0Var2);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var2.g0();
            if (g0Var2.S) {
                g0Var2.l(gVar);
            } else {
                g0Var2.q0();
            }
            b3.f fVar = b3.h.f;
            q.I(w0VarD, g0Var2, fVar);
            b3.f fVar2 = b3.h.e;
            q.I(m1VarM, g0Var2, fVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar3 = b3.h.g;
            q.I(numValueOf, g0Var2, fVar3);
            b3.e eVar = b3.h.h;
            q.E(g0Var2, eVar);
            b3.f fVar4 = b3.h.d;
            q.I(rVarC, g0Var2, fVar4);
            b2.o oVar = b2.o.A;
            r rVarE = h0.c.E(w50.c.n(n.f(f2.h.c(z ? z1.d(z1.s(oVar, 0.0f, a, 1), 1.0f) : z1.d(oVar, 1.0f), p0.f.a(b)), dl.a.i, b0.b), true, onClick), 0.0f, 16, 1);
            w0 w0VarD2 = o.d(iVar, false);
            int iHashCode2 = Long.hashCode(g0Var2.T);
            m1 m1VarM2 = g0Var2.m();
            r rVarC2 = b2.a.c(rVarE, g0Var2);
            g0Var2.g0();
            if (g0Var2.S) {
                g0Var2.l(gVar);
            } else {
                g0Var2.q0();
            }
            q.I(w0VarD2, g0Var2, fVar);
            q.I(m1VarM2, g0Var2, fVar2);
            a1.b.v(iHashCode2, g0Var2, fVar3, g0Var2, eVar);
            q.I(rVarC2, g0Var2, fVar4);
            z6.b(z3.U(g0Var2, 2131886730), (r) null, t.b, z != 0 ? kh.o.z(18) : kh.o.z(16), u.D, (q3.i) null, 0L, (l) null, (k) null, kh.o.z(z ? 21 : 20), 0, false, 0, 0, (u00.k) null, (r0) null, g0Var2, 1573248, 0, 260010);
            g0Var = g0Var2;
            g0Var.r(true);
            g0Var.r(true);
        } else {
            g0Var = g0Var2;
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new ev.m(onClick, rVar, i, 6);
        }
    }
}
