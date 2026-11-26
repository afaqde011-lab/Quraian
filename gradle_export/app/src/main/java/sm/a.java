package sm;

import g1.z6;
import h0.m2;
import h0.t0;
import h0.z1;
import java.util.WeakHashMap;
import l1.m1;
import l1.p2;
import l1.r1;
import m3.r0;
import z2.w0;

public abstract class a {
    public static final float a = 44;

    public static final void a(String title, float f, b2.r rVar, float f2, l1.j jVar, int i) {
        l1.g0 g0Var;
        float f3;
        float f4;
        boolean z;
        kotlin.jvm.internal.m.e(title, "title");
        l1.g0 g0Var2 = (l1.g0) jVar;
        g0Var2.e0(-532303862);
        int i2 = i | (g0Var2.g(title) ? 4 : 2) | (g0Var2.d(f) ? 32 : 16) | (g0Var2.g(rVar) ? 256 : 128) | 3072;
        if (g0Var2.S(i2 & 1, (i2 & 1171) != 1170)) {
            gm.a aVar = (gm.a) g0Var2.k(dl.e.a);
            WeakHashMap weakHashMap = m2.w;
            t0 t0VarL = h0.c.l(h0.b.e(g0Var2).g, g0Var2);
            float fB = x.x.a.b(ab.a0.x(f, 0.0f, 1.0f));
            long j = dl.a.L;
            long jB = i2.t.b(fB * 1.0f, j);
            long jB2 = i2.t.b(fB * 0.9f, j);
            long jB3 = i2.t.b(fB * 0.55f, j);
            boolean z2 = aVar == gm.a.A;
            b2.r rVarD = z1.d(rVar, 1.0f);
            w0 w0VarD = h0.o.d(b2.b.A, false);
            int iHashCode = Long.hashCode(g0Var2.T);
            m1 m1VarM = g0Var2.m();
            b2.r rVarC = b2.a.c(rVarD, g0Var2);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var2.g0();
            if (g0Var2.S) {
                g0Var2.l(gVar);
            } else {
                g0Var2.q0();
            }
            b3.f fVar = b3.h.f;
            l1.q.I(w0VarD, g0Var2, fVar);
            b3.f fVar2 = b3.h.e;
            l1.q.I(m1VarM, g0Var2, fVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar3 = b3.h.g;
            l1.q.I(numValueOf, g0Var2, fVar3);
            b3.e eVar = b3.h.h;
            l1.q.E(g0Var2, eVar);
            boolean z3 = z2;
            b3.f fVar4 = b3.h.d;
            l1.q.I(rVarC, g0Var2, fVar4);
            b2.i iVar = b2.b.B;
            h0.s sVar = h0.s.a;
            b2.o oVar = b2.o.A;
            b2.r rVarD2 = z1.d(sVar.a(oVar, iVar), 1.0f);
            float fC = t0VarL.c();
            float f5 = a;
            h0.o.a(z.n.e(z1.e(rVarD2, fC + f5), sg.f.P(va.a.S(new i2.t[]{new i2.t(jB), new i2.t(jB2), new i2.t(jB3), new i2.t(i2.t.f)}), 0.0f, 0.0f, 14), (i2.t0) null, 6), g0Var2, 0);
            if (z3) {
                g0Var2.c0(1090549449);
                b2.r rVarE = z1.e(h0.c.M(z1.d(oVar, 1.0f), h0.c.e), f5);
                w0 w0VarD2 = h0.o.d(b2.b.E, false);
                int iHashCode2 = Long.hashCode(g0Var2.T);
                m1 m1VarM2 = g0Var2.m();
                b2.r rVarC2 = b2.a.c(rVarE, g0Var2);
                g0Var2.g0();
                if (g0Var2.S) {
                    g0Var2.l(gVar);
                } else {
                    g0Var2.q0();
                }
                l1.q.I(w0VarD2, g0Var2, fVar);
                l1.q.I(m1VarM2, g0Var2, fVar2);
                a1.b.v(iHashCode2, g0Var2, fVar3, g0Var2, eVar);
                l1.q.I(rVarC2, g0Var2, fVar4);
                f4 = f5;
                z6.b(title, f2.h.a(z1.d(oVar, 1.0f), fB), dl.a.n, kh.o.z(17), q3.u.D, (q3.i) null, 0L, (x3.l) null, new x3.k(3), kh.o.z(20), 2, false, 1, 0, (u00.k) null, (r0) null, g0Var2, (i2 & 14) | 1597824, 25008, 238504);
                g0Var = g0Var2;
                z = true;
                g0Var.r(true);
                g0Var.r(false);
            } else {
                g0Var = g0Var2;
                f4 = f5;
                z = true;
                g0Var.c0(1091296146);
                g0Var.r(false);
            }
            g0Var.r(z);
            f3 = f4;
        } else {
            g0Var = g0Var2;
            g0Var.V();
            f3 = f2;
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new kn.a(title, f, rVar, f3, i);
        }
    }

    public static final p2 b(j0.v listState, l1.j jVar) {
        kotlin.jvm.internal.m.e(listState, "listState");
        boolean zG = ((l1.g0) jVar).g(listState);
        l1.g0 g0Var = (l1.g0) jVar;
        Object objN = g0Var.N();
        if (zG || objN == l1.i.a) {
            objN = l1.q.r(new el.b(listState, 11));
            g0Var.n0(objN);
        }
        return (p2) objN;
    }

    public static final p2 c(k0.y gridState, l1.j jVar) {
        kotlin.jvm.internal.m.e(gridState, "gridState");
        boolean zG = ((l1.g0) jVar).g(gridState);
        l1.g0 g0Var = (l1.g0) jVar;
        Object objN = g0Var.N();
        if (zG || objN == l1.i.a) {
            objN = l1.q.r(new hw.d(gridState, 4));
            g0Var.n0(objN);
        }
        return (p2) objN;
    }
}
