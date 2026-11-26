package qz;

import b2.g;
import b2.o;
import b2.r;
import b3.h;
import g00.k;
import gv.f0;
import h0.i;
import h0.u;
import h0.v;
import h0.w;
import h0.z1;
import i2.b0;
import i2.t;
import i2.t0;
import l1.g0;
import l1.j;
import l1.m1;
import l1.q;
import l1.r1;
import z.n;

public abstract class f {
    public static final float a = 16;

    public static final void a(boolean z, r rVar, v1.c cVar, j jVar, int i) {
        int i2;
        v1.c cVar2 = cVar;
        g0 g0Var = (g0) jVar;
        g0Var.e0(-190568961);
        if ((i & 6) == 0) {
            i2 = (g0Var.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= g0Var.g(rVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= g0Var.i(cVar2) ? 256 : 128;
        }
        if (g0Var.S(i2 & 1, (i2 & 147) != 146)) {
            r rVarD = z1.d(rVar, 1.0f);
            h0.d dVar = i.c;
            g gVar = b2.b.M;
            v vVarA = u.a(dVar, gVar, g0Var, 0);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            r rVarC = b2.a.c(rVarD, g0Var);
            b3.i.c.getClass();
            b3.g gVar2 = h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar2);
            } else {
                g0Var.q0();
            }
            b3.f fVar = h.f;
            q.I(vVarA, g0Var, fVar);
            b3.f fVar2 = h.e;
            q.I(m1VarM, g0Var, fVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar3 = h.g;
            q.I(numValueOf, g0Var, fVar3);
            b3.e eVar = h.h;
            q.E(g0Var, eVar);
            b3.f fVar4 = h.d;
            q.I(rVarC, g0Var, fVar4);
            r rVarM = o.A;
            r rVarE = z1.e(z1.d(rVarM, 1.0f), a);
            k kVar = new k(Float.valueOf(0.0f), new t(t.f));
            Float fValueOf = Float.valueOf(0.4f);
            int i3 = i2;
            long j = dl.a.L;
            h0.o.a(n.e(rVarE, sg.f.Q(new k[]{kVar, new k(fValueOf, new t(j)), new k(Float.valueOf(1.0f), new t(j))}), (t0) null, 6), g0Var, 0);
            r rVarF = n.f(z1.d(rVarM, 1.0f), j, b0.b);
            if (!z) {
                rVarM = h0.c.M(h0.c.M(rVarM, h0.c.g), h0.c.f);
            }
            float f = 16;
            r rVarG = h0.c.G(h0.c.E(rVarF.V(rVarM), f, 0.0f, 2), 0.0f, 0.0f, 0.0f, f, 7);
            int i4 = ((i3 << 3) & 7168) | 48;
            v vVarA2 = u.a(i.g(f), gVar, g0Var, 6);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            r rVarC2 = b2.a.c(rVarG, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar2);
            } else {
                g0Var.q0();
            }
            q.I(vVarA2, g0Var, fVar);
            q.I(m1VarM2, g0Var, fVar2);
            a1.b.v(iHashCode2, g0Var, fVar3, g0Var, eVar);
            q.I(rVarC2, g0Var, fVar4);
            cVar2 = cVar;
            cVar2.invoke(w.a, g0Var, Integer.valueOf(((i4 >> 6) & 112) | 6));
            g0Var.r(true);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new f0(z, rVar, cVar2, i, 3, (byte) 0);
        }
    }
}
