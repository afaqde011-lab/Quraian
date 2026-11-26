package eq;

import a10.h0;
import b2.o;
import b2.r;
import bv.k1;
import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.internal.measurement.z3;
import d0.o2;
import g1.o3;
import g1.z6;
import h0.a0;
import h0.u;
import h0.v;
import h0.z1;
import i2.b0;
import i2.t;
import kotlin.NoWhenBranchMatchedException;
import l1.g0;
import l1.m1;
import l1.q;
import l1.r1;
import l1.z0;
import m3.r0;
import u00.n;
import x.e0;
import x.p0;
import x.x;
import z2.d0;
import z2.w0;

public abstract class a {
    public static final v1.c a = new v1.c(new ax.a(11), -1659561625, false);

    public static final void a(final int i, final r rVar, l1.j jVar, final u00.k kVar) {
        int i2;
        g0 g0Var = (g0) jVar;
        g0Var.e0(1883012873);
        int i3 = i | 48;
        if (g0Var.S(i3 & 1, (i3 & 19) != 18)) {
            int iOrdinal = ((gm.a) g0Var.k(dl.e.a)).ordinal();
            if (iOrdinal == 0) {
                i2 = 72;
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = 96;
            }
            e0 e0VarH = x.c.h(x.c.s("partyIconPulse", g0Var, 0), 1.0f, 1.1f, x.c.r(x.c.w(750, 0, x.a, 2), p0.B, 4), "partyIconScale", g0Var, 29112, 0);
            o2.f fVarH0 = g4.h0(2131231351, g0Var, 6);
            long j = dl.a.i;
            r rVar2 = o.A;
            r rVarN = d0.n(z1.m(rVar2, i2), kVar);
            boolean zG = g0Var.g(e0VarH);
            Object objN = g0Var.N();
            if (zG || objN == l1.i.a) {
                objN = new k1(e0VarH, 1);
                g0Var.n0(objN);
            }
            o3.b(fVarH0, (String) null, b0.p(rVarN, (u00.k) objN), j, g0Var, 48, 0);
            rVar = rVar2;
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            final int i4 = 0;
            r1VarT.d = new n(kVar, rVar, i, i4) {
                public final int A;
                public final u00.k B;
                public final r C;

                {
                    this.A = i4;
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = this.A;
                    l1.j jVar2 = (l1.j) obj;
                    ((Integer) obj2).getClass();
                    switch (i5) {
                        case 0:
                            a.a(q.K(7), this.C, jVar2, this.B);
                            break;
                        default:
                            y3.c(q.K(1), this.C, jVar2, this.B);
                            break;
                    }
                    return g00.b0.a;
                }
            };
        }
    }

    public static final void b(r rVar, l1.j jVar, int i) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(585426932);
        if (g0Var.S(i & 1, (i & 3) != 2)) {
            Object objN = g0Var.N();
            Object obj = l1.i.a;
            if (objN == obj) {
                objN = q.z((Object) null);
                g0Var.n0(objN);
            }
            z0 z0Var = (z0) objN;
            Object objN2 = g0Var.N();
            if (objN2 == obj) {
                objN2 = q.z((Object) null);
                g0Var.n0(objN2);
            }
            z0 z0Var2 = (z0) objN2;
            a0 a0Var = z1.c;
            r rVarV = rVar.V(a0Var);
            Object objN3 = g0Var.N();
            if (objN3 == obj) {
                objN3 = new o2(z0Var, 2);
                g0Var.n0(objN3);
            }
            r rVarN = d0.n(rVarV, (u00.k) objN3);
            w0 w0VarD = h0.o.d(b2.b.A, false);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            r rVarC = b2.a.c(rVarN, g0Var);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            b3.f fVar = b3.h.f;
            q.I(w0VarD, g0Var, fVar);
            b3.f fVar2 = b3.h.e;
            q.I(m1VarM, g0Var, fVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar3 = b3.h.g;
            q.I(numValueOf, g0Var, fVar3);
            b3.e eVar = b3.h.h;
            q.E(g0Var, eVar);
            b3.f fVar4 = b3.h.d;
            q.I(rVarC, g0Var, fVar4);
            r rVarF = z.n.f(a0Var, t.b(0.82f, dl.a.L), b0.b);
            w0 w0VarD2 = h0.o.d(b2.b.E, false);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            r rVarC2 = b2.a.c(rVarF, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            q.I(w0VarD2, g0Var, fVar);
            q.I(m1VarM2, g0Var, fVar2);
            a1.b.v(iHashCode2, g0Var, fVar3, g0Var, eVar);
            q.I(rVarC2, g0Var, fVar4);
            b2.g gVar2 = b2.b.N;
            h0.f fVarG = h0.i.g(16);
            r rVarC3 = h0.c.C(o.A, 24);
            v vVarA = u.a(fVarG, gVar2, g0Var, 54);
            int iHashCode3 = Long.hashCode(g0Var.T);
            m1 m1VarM3 = g0Var.m();
            r rVarC4 = b2.a.c(rVarC3, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            q.I(vVarA, g0Var, fVar);
            q.I(m1VarM3, g0Var, fVar2);
            a1.b.v(iHashCode3, g0Var, fVar3, g0Var, eVar);
            q.I(rVarC4, g0Var, fVar4);
            Object objN4 = g0Var.N();
            if (objN4 == obj) {
                objN4 = new h(z0Var, z0Var2, 0);
                g0Var.n0(objN4);
            }
            a(6, null, g0Var, (u00.k) objN4);
            z6.b(z3.U(g0Var, 2131886912), (r) null, dl.a.i, kh.o.z(24), q3.u.M, dl.f.a, 0L, (x3.l) null, new x3.k(3), 0L, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 1597440, 0, 260906);
            g0Var = g0Var;
            g0Var.r(true);
            g0Var.r(true);
            h2.b bVar = (h2.b) z0Var2.getValue();
            if (bVar == null) {
                g0Var.c0(-560512106);
                g0Var.r(false);
            } else {
                g0Var.c0(-560512105);
                h0.e(bVar.a, a0Var, g0Var, 48);
                g0Var.r(false);
            }
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new bs.b(rVar, i, 5);
        }
    }
}
