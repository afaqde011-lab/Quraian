package wr;

import com.google.android.gms.internal.measurement.y3;
import g1.o3;
import g1.v5;
import h0.c1;
import h0.t1;
import h0.v1;
import h0.z1;
import java.util.Iterator;
import l1.m1;
import l1.p2;
import l1.r1;
import z2.w0;

public abstract class h0 {
    public static final float a = 26;

    public static final void a(float f, l1.j jVar, final int i) {
        int i2;
        final float f2;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-293405859);
        if ((i & 6) == 0) {
            i2 = (g0Var.d(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (g0Var.S(i2 & 1, (i2 & 3) != 2)) {
            p2 p2VarB = x.d.b(f, x.c.w(500, 0, (x.v) null, 6), "streakDayProgress", g0Var, (i2 & 14) | 3120, 20);
            f2 = f;
            b2.r rVarI = z1.i(b2.o.A, a);
            long j = dl.a.i;
            long jB = i2.t.b(0.05f, j);
            float f3 = 2;
            boolean zG = g0Var.g(p2VarB);
            Object objN = g0Var.N();
            if (zG || objN == l1.i.a) {
                objN = new ds.l(p2VarB, 14);
                g0Var.n0(objN);
            }
            v5.b((u00.a) objN, rVarI, j, f3, jB, 1, 0.0f, g0Var, 3120, 64);
            g0Var = g0Var;
        } else {
            f2 = f;
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new u00.n() {
                @Override
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iK = l1.q.K(i | 1);
                    h0.a(f2, (l1.j) obj, iK);
                    return g00.b0.a;
                }
            };
        }
    }

    public static final void b(qr.u uVar, float f, l1.j jVar, int i) {
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-1376912046);
        int i2 = (g0Var.e(uVar.ordinal()) ? 4 : 2) | i | (g0Var.d(f) ? 32 : 16);
        if (g0Var.S(i2 & 1, (i2 & 19) != 18)) {
            int iOrdinal = uVar.ordinal();
            b2.o oVar = b2.o.A;
            float f2 = a;
            if (iOrdinal == 0) {
                g0Var.c0(1646029148);
                o3.a(y3.R(2131231095, g0Var, 0), (String) null, z1.i(oVar, f2), dl.a.i, g0Var, 440, 0);
                g0Var.r(false);
            } else if (iOrdinal == 1) {
                g0Var.c0(1646329879);
                o3.a(y3.R(2131231431, g0Var, 0), (String) null, z1.i(oVar, f2), dl.a.V, g0Var, 440, 0);
                g0Var.r(false);
            } else if (iOrdinal == 2) {
                g0Var.c0(1646617063);
                a(f, g0Var, (i2 >> 3) & 14);
                g0Var.r(false);
            } else {
                if (iOrdinal != 3) {
                    throw oi.k.r(g0Var, -362545446, false);
                }
                g0Var.c0(1646745992);
                b2.r rVarI = z1.i(oVar, f2);
                long j = dl.a.i;
                long jB = i2.t.b(0.05f, j);
                float f3 = 2;
                Object objN = g0Var.N();
                if (objN == l1.i.a) {
                    objN = new sy.e(18);
                    g0Var.n0(objN);
                }
                v5.b((u00.a) objN, rVarI, j, f3, jB, 1, 0.0f, g0Var, 3126, 64);
                g0Var = g0Var;
                g0Var.r(false);
            }
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new kn.d(uVar, f, i, 4);
        }
    }

    public static final void c(qr.v vVar, b2.r rVar, l1.j jVar, int i) {
        int i2;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(209176578);
        if ((i & 6) == 0) {
            i2 = (g0Var.g(vVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= g0Var.h(false) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= g0Var.g(rVar) ? 256 : 128;
        }
        if (g0Var.S(i2 & 1, (i2 & 147) != 146)) {
            b2.r rVarE = h0.c.E(z.n.f(f2.h.c(rVar, p0.f.a(16)), vVar.c ? i2.t.b(0.08f, dl.a.i) : i2.t.f, i2.b0.b), 0.0f, 12, 1);
            h0.v vVarA = h0.u.a(h0.i.g(6), b2.b.N, g0Var, 54);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(rVarE, g0Var);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            b3.f fVar = b3.h.f;
            l1.q.I(vVarA, g0Var, fVar);
            b3.f fVar2 = b3.h.e;
            l1.q.I(m1VarM, g0Var, fVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar3 = b3.h.g;
            l1.q.I(numValueOf, g0Var, fVar3);
            b3.e eVar = b3.h.h;
            l1.q.E(g0Var, eVar);
            b3.f fVar4 = b3.h.d;
            l1.q.I(rVarC, g0Var, fVar4);
            p0.e eVar2 = p0.f.a;
            int i3 = (i2 & 112) | 6;
            b2.o oVar = b2.o.A;
            b2.r rVarH = c7.i.H(oVar, false, eVar2);
            w0 w0VarD = h0.o.d(b2.b.A, false);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            b2.r rVarC2 = b2.a.c(rVarH, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(w0VarD, g0Var, fVar);
            l1.q.I(m1VarM2, g0Var, fVar2);
            a1.b.v(iHashCode2, g0Var, fVar3, g0Var, eVar);
            l1.q.I(rVarC2, g0Var, fVar4);
            b(vVar.b, vVar.d, g0Var, 0);
            g0Var.r(true);
            k00.f.a(vVar.a, k.h0(oVar, g0Var, i3), vVar.c ? dl.a.n : i2.t.b(0.5f, dl.a.k), kh.o.z(13), null, q3.u.B, null, 1, 0.0f, null, g0Var, 12782592, 848);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new ct.l((Object) vVar, rVar, i, 15);
        }
    }

    public static final void d(u30.b weeklyStreaks, u00.a onClick, b2.r rVar, l1.j jVar, int i) {
        int i2;
        b2.r rVar2;
        kotlin.jvm.internal.m.e(weeklyStreaks, "weeklyStreaks");
        kotlin.jvm.internal.m.e(onClick, "onClick");
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(2139424717);
        if ((i & 6) == 0) {
            i2 = i | (g0Var.g(weeklyStreaks) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= g0Var.i(onClick) ? 32 : 16;
        }
        int i3 = i2 | 3456;
        if (g0Var.S(i3 & 1, (i3 & 1171) != 1170)) {
            rVar2 = b2.o.A;
            b2.r rVarD = h0.c.D(z1.s(rVar2, 0.0f, 500, 1).V(w50.c.o(rVar2, false, null, onClick, 7)), 20, 12);
            v1 v1VarA = t1.a(h0.i.a, b2.b.K, g0Var, 48);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(rVarD, g0Var);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(v1VarA, g0Var, b3.h.f);
            l1.q.I(m1VarM, g0Var, b3.h.e);
            l1.q.I(Integer.valueOf(iHashCode), g0Var, b3.h.g);
            l1.q.E(g0Var, b3.h.h);
            l1.q.I(rVarC, g0Var, b3.h.d);
            g0Var.c0(-1582102865);
            Iterator<E> it = weeklyStreaks.iterator();
            while (it.hasNext()) {
                qr.v vVar = (qr.v) it.next();
                if (1.0f <= 0.0d) {
                    i0.a.a("invalid weight; must be greater than zero");
                }
                c(vVar, new c1(1.0f, true), g0Var, (i3 >> 6) & 112);
            }
            g0Var.r(false);
            g0Var.r(true);
        } else {
            g0Var.V();
            rVar2 = rVar;
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new bs.f(i, 26, weeklyStreaks, onClick, rVar2);
        }
    }
}
