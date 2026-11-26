package qt;

import android.content.Context;
import android.content.res.Configuration;
import b2.o;
import b2.r;
import c3.l2;
import c3.m0;
import c3.o0;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.internal.measurement.z3;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import g00.b0;
import g1.o3;
import g1.v5;
import g1.z6;
import h0.a0;
import h0.c1;
import h0.t1;
import h0.v;
import h0.v1;
import h0.w;
import h0.z1;
import i2.t;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.m;
import l1.g0;
import l1.m1;
import l1.q;
import l1.r1;
import m3.r0;
import oo.y0;
import ot.p;
import ot.s;
import q3.u;
import u00.n;
import w.b2;
import x.y;
import x3.l;
import z2.d1;
import z2.w0;

public abstract class a {
    public static final v1.c a = new v1.c(new ny.a(12), 83070411, false);
    public static final v1.c b = new v1.c(new ny.a(13), 2031159756, false);
    public static final v1.c c = new v1.c(new ny.a(14), 1224663554, false);

    public static final void a(ot.e eVar, l1.j jVar, int i) {
        int i2;
        g0 g0Var = (g0) jVar;
        g0Var.e0(-929320429);
        int i3 = i | (g0Var.e(eVar.ordinal()) ? 4 : 2);
        if (g0Var.S(i3 & 1, (i3 & 3) != 2)) {
            r rVarD = z1.d(o.A, 1.0f);
            v1 v1VarA = t1.a(h0.i.e, b2.b.J, g0Var, 6);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            r rVarC = b2.a.c(rVarD, g0Var);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            q.I(v1VarA, g0Var, b3.h.f);
            q.I(m1VarM, g0Var, b3.h.e);
            q.I(Integer.valueOf(iHashCode), g0Var, b3.h.g);
            q.E(g0Var, b3.h.h);
            q.I(rVarC, g0Var, b3.h.d);
            int iOrdinal = eVar.ordinal();
            if (iOrdinal == 0) {
                i2 = 2131886631;
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = 2131887100;
            }
            String strU = z3.U(g0Var, i2);
            if (1.0f <= 0.0d) {
                i0.a.a("invalid weight; must be greater than zero");
            }
            z6.b(strU, new c1(1.0f, true), dl.a.k, kh.o.z(17), u.M, (q3.i) null, 0L, (l) null, new x3.k(3), 0L, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 1597440, 0, 261032);
            g0Var = g0Var;
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new m3.a(eVar, i, 14);
        }
    }

    public static final void b(final ot.o oVar, l1.j jVar, final int i) {
        r1 r1VarT;
        n nVar;
        g0 g0Var = (g0) jVar;
        g0Var.e0(-51596493);
        int i2 = (g0Var.g(oVar) ? 4 : 2) | i;
        if (g0Var.S(i2 & 1, (i2 & 3) != 2)) {
            Context context = (Context) g0Var.k(o0.b);
            String str = oVar.e;
            o oVar2 = o.A;
            d1 d1Var = z2.o.a;
            if (str == null || str.length() == 0) {
                g0Var.c0(487832655);
                g0Var.r(false);
                String str2 = oVar.f;
                if (str2 == null || str2.length() == 0) {
                    g0Var.c0(488589954);
                    c(g0Var, 0);
                    g0Var.r(false);
                } else {
                    g0Var.c0(487934707);
                    wb.h hVar = new wb.h(context);
                    hVar.c = str2;
                    hVar.b();
                    mb.l.d(hVar.a(), f2.h.c(z1.m(oVar2, 28), p0.f.a(4)), c, d1Var, g0Var, 1597488, 128936);
                    g0Var.r(false);
                }
            } else {
                g0Var.c0(487355038);
                wb.h hVar2 = new wb.h(context);
                hVar2.c = "file:///android_asset/".concat(str);
                hVar2.b();
                mb.l.d(hVar2.a(), f2.h.c(z1.m(oVar2, 28), p0.f.a(4)), a, d1Var, g0Var, 1572912, 128952);
                g0Var.r(false);
                r1VarT = g0Var.t();
                if (r1VarT == null) {
                    return;
                }
                final int i3 = 0;
                nVar = new n(oVar, i, i3) {
                    public final int A;
                    public final ot.o B;

                    {
                        this.A = i3;
                    }

                    @Override
                    public final Object invoke(Object obj, Object obj2) {
                        int i4 = this.A;
                        l1.j jVar2 = (l1.j) obj;
                        ((Integer) obj2).getClass();
                        switch (i4) {
                            case 0:
                                a.b(this.B, jVar2, q.K(1));
                                break;
                            default:
                                a.b(this.B, jVar2, q.K(1));
                                break;
                        }
                        return b0.a;
                    }
                };
            }
            r1VarT.d = nVar;
        }
        g0Var.V();
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            final int i4 = 1;
            nVar = new n(oVar, i, i4) {
                public final int A;
                public final ot.o B;

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
                            a.b(this.B, jVar2, q.K(1));
                            break;
                        default:
                            a.b(this.B, jVar2, q.K(1));
                            break;
                    }
                    return b0.a;
                }
            };
            r1VarT.d = nVar;
        }
    }

    public static final void c(l1.j jVar, int i) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(-1724351923);
        if (g0Var.S(i & 1, i != 0)) {
            o3.a(y3.R(2131231188, g0Var, 0), (String) null, z1.m(o.A, 24), dl.a.k, g0Var, 440, 0);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new qs.c(i, 15);
        }
    }

    public static final void d(ot.o oVar, boolean z, ot.n nVar, u00.a aVar, l1.j jVar, int i) {
        long j;
        float f;
        g0 g0Var = (g0) jVar;
        g0Var.e0(1665712265);
        int i2 = i | (g0Var.g(oVar) ? 4 : 2) | (g0Var.h(z) ? 32 : 16) | (g0Var.g(nVar) ? 256 : 128) | (g0Var.i(aVar) ? 2048 : 1024);
        if (g0Var.S(i2 & 1, (i2 & 1171) != 1170)) {
            if (z) {
                j = dl.a.i;
                f = 0.15f;
            } else {
                j = dl.a.i;
                f = 0.0f;
            }
            float f2 = 8;
            float f3 = 12;
            r rVarF = h0.c.F(w50.c.n(z.n.f(h0.c.D(z1.d(o.A, 1.0f), f2, 4), ((t) b2.a(t.b(f, j), (y) null, (String) null, g0Var, 0, 14).getValue()).a, p0.f.a(20)), true, aVar), f2, f2, f3, f2);
            v1 v1VarA = t1.a(h0.i.a, b2.b.K, g0Var, 48);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            r rVarC = b2.a.c(rVarF, g0Var);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            b3.f fVar = b3.h.f;
            q.I(v1VarA, g0Var, fVar);
            b3.f fVar2 = b3.h.e;
            q.I(m1VarM, g0Var, fVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar3 = b3.h.g;
            q.I(numValueOf, g0Var, fVar3);
            b3.e eVar = b3.h.h;
            q.E(g0Var, eVar);
            b3.f fVar4 = b3.h.d;
            q.I(rVarC, g0Var, fVar4);
            if (1.0f <= 0.0d) {
                i0.a.a("invalid weight; must be greater than zero");
            }
            c1 c1Var = new c1(1.0f, true);
            v1 v1VarA2 = t1.a(h0.i.g(f3), b2.b.J, g0Var, 6);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            r rVarC2 = b2.a.c(c1Var, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            q.I(v1VarA2, g0Var, fVar);
            q.I(m1VarM2, g0Var, fVar2);
            a1.b.v(iHashCode2, g0Var, fVar3, g0Var, eVar);
            q.I(rVarC2, g0Var, fVar4);
            b(oVar, g0Var, i2 & 14);
            if (1.0f <= 0.0d) {
                i0.a.a("invalid weight; must be greater than zero");
            }
            c1 c1Var2 = new c1(1.0f, true);
            v vVarA = h0.u.a(h0.i.c, b2.b.M, g0Var, 0);
            int iHashCode3 = Long.hashCode(g0Var.T);
            m1 m1VarM3 = g0Var.m();
            r rVarC3 = b2.a.c(c1Var2, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            q.I(vVarA, g0Var, fVar);
            q.I(m1VarM3, g0Var, fVar2);
            a1.b.v(iHashCode3, g0Var, fVar3, g0Var, eVar);
            q.I(rVarC3, g0Var, fVar4);
            String str = oVar.c;
            long j2 = dl.a.k;
            z6.b(str, (r) null, j2, kh.o.z(17), u.L, (q3.i) null, 0L, (l) null, (x3.k) null, 0L, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 1597440, 0, 262058);
            z6.b(oVar.d, (r) null, t.b(0.5f, j2), kh.o.z(15), (u) null, (q3.i) null, 0L, (l) null, (x3.k) null, 0L, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 24576, 0, 262122);
            g0Var = g0Var;
            g0Var.r(true);
            g0Var.r(true);
            f(z, oVar.j, nVar, g0Var, (i2 & 896) | ((i2 >> 3) & 14));
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new c00.l(oVar, z, nVar, aVar, i, 5);
        }
    }

    public static final void e(j uiState, u00.k kVar, l1.j jVar, int i) {
        float f;
        Object obj;
        r rVar;
        boolean z;
        float f2;
        int i2;
        u00.k kVar2;
        u00.k kVar3;
        u00.k onAction = kVar;
        m.e(uiState, "uiState");
        ot.t tVar = uiState.b;
        m.e(onAction, "onAction");
        g0 g0Var = (g0) jVar;
        g0Var.e0(-575157078);
        int i3 = i | (g0Var.g(uiState) ? 4 : 2) | (g0Var.i(onAction) ? 32 : 16);
        if (g0Var.S(i3 & 1, (i3 & 19) != 18)) {
            l2 l2VarU = m0.u(g0Var);
            boolean z2 = (uiState.c.equals(uiState.d) || !(tVar instanceof ot.r) || ((ot.r) tVar).a.isEmpty()) ? false : true;
            boolean z3 = ((Configuration) g0Var.k(o0.a)).screenWidthDp > 600;
            a0 a0Var = z1.c;
            float f3 = 32;
            boolean z4 = z2;
            r rVarM = h0.c.M(u2.f.a(z.n.f(f2.h.c(a0Var, p0.f.c(f3, f3, 0.0f, 0.0f, 12)), dl.a.M, i2.b0.b), l2VarU, (u2.d) null), h0.c.g);
            w0 w0VarD = h0.o.d(b2.b.A, false);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            r rVarC = b2.a.c(rVarM, g0Var);
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
            h0.o.a(z.n.p(a0Var, z.n.l(g0Var), false, 14), g0Var, 0);
            float f4 = 16;
            r rVarE = h0.c.E(a0Var, f4, 0.0f, 2);
            b2.g gVar2 = b2.b.N;
            v vVarA = h0.u.a(h0.i.c, gVar2, g0Var, 48);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            r rVarC2 = b2.a.c(rVarE, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            q.I(vVarA, g0Var, fVar);
            q.I(m1VarM2, g0Var, fVar2);
            a1.b.v(iHashCode2, g0Var, fVar3, g0Var, eVar);
            q.I(rVarC2, g0Var, fVar4);
            kl.a.a(null, false, g0Var, 48, 1);
            r rVar2 = o.A;
            h0.c.h(z1.e(rVar2, 20), g0Var);
            a(uiState.a, g0Var, 0);
            h0.c.h(z1.e(rVar2, f4), g0Var);
            boolean z5 = tVar instanceof ot.q;
            Object obj2 = l1.i.a;
            if (z5 || (tVar instanceof s)) {
                f = f4;
                obj = obj2;
                rVar = rVar2;
                z = z4;
                f2 = f3;
                i2 = 16;
                g0Var.c0(1417979071);
                r rVarD = z1.d(w.a(rVar, 1.0f), 1.0f);
                w0 w0VarD2 = h0.o.d(b2.b.E, false);
                int iHashCode3 = Long.hashCode(g0Var.T);
                m1 m1VarM3 = g0Var.m();
                r rVarC3 = b2.a.c(rVarD, g0Var);
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar);
                } else {
                    g0Var.q0();
                }
                q.I(w0VarD2, g0Var, fVar);
                q.I(m1VarM3, g0Var, fVar2);
                a1.b.v(iHashCode3, g0Var, fVar3, g0Var, eVar);
                q.I(rVarC3, g0Var, fVar4);
                v5.a((r) null, dl.a.k, 0.0f, 0L, 0, 0.0f, g0Var, 0, 61);
                g0Var.r(true);
                g0Var.r(false);
            } else if (tVar instanceof p) {
                g0Var.c0(1418421348);
                r rVarD2 = z1.d(w.a(rVar2, 1.0f), 1.0f);
                v vVarA2 = h0.u.a(h0.i.e, gVar2, g0Var, 54);
                int iHashCode4 = Long.hashCode(g0Var.T);
                m1 m1VarM4 = g0Var.m();
                r rVarC4 = b2.a.c(rVarD2, g0Var);
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar);
                } else {
                    g0Var.q0();
                }
                q.I(vVarA2, g0Var, fVar);
                q.I(m1VarM4, g0Var, fVar2);
                a1.b.v(iHashCode4, g0Var, fVar3, g0Var, eVar);
                q.I(rVarC4, g0Var, fVar4);
                String str = ((p) tVar).a;
                long j = dl.a.k;
                i2 = 16;
                f = f4;
                f2 = f3;
                rVar = rVar2;
                obj = obj2;
                z6.b(str, (r) null, t.b(0.5f, j), 0L, (u) null, (q3.i) null, 0L, (l) null, new x3.k(3), 0L, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 0, 0, 261114);
                h0.c.h(z1.e(rVar, 12), g0Var);
                String strU = z3.U(g0Var, 2131887065);
                u uVar = u.K;
                boolean z6 = (i3 & 112) == 32;
                Object objN = g0Var.N();
                if (z6 || objN == obj) {
                    kVar3 = kVar;
                    objN = new y0(29, kVar3);
                    g0Var.n0(objN);
                } else {
                    kVar3 = kVar;
                }
                z6.b(strU, w50.c.o(rVar, false, null, (u00.a) objN, 7), j, 0L, uVar, (q3.i) null, 0L, (l) null, (x3.k) null, 0L, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 1572864, 0, 262072);
                g0Var = g0Var;
                g0Var.r(true);
                g0Var.r(false);
                z = z4;
            } else {
                f = f4;
                obj = obj2;
                rVar = rVar2;
                f2 = f3;
                i2 = 16;
                if (!(tVar instanceof ot.r)) {
                    throw oi.k.r(g0Var, -1339734698, false);
                }
                g0Var.c0(1419532512);
                r rVarA = w.a(rVar, 1.0f);
                r rVarE2 = h0.c.E(z.n.f(u2.f.a(z3 ? z1.q(rVarA, RCHTTPStatusCodes.BAD_REQUEST) : z1.d(rVarA, 1.0f), l2VarU, (u2.d) null), t.b(0.05f, dl.a.i), p0.f.a(24)), 0.0f, 8, 1);
                boolean zI = g0Var.i(tVar) | ((i3 & 14) == 4) | ((i3 & 112) == 32);
                Object objN2 = g0Var.N();
                if (zI || objN2 == obj) {
                    objN2 = new q0.t1(2, tVar, uiState, kVar);
                    g0Var.n0(objN2);
                }
                z = z4;
                k00.f.d(rVarE2, null, null, null, null, null, false, null, (u00.k) objN2, g0Var, 0, 510);
                g0Var = g0Var;
                g0Var.r(false);
            }
            float f5 = f;
            h0.c.h(z1.e(rVar, f5), g0Var);
            String strU2 = z3.U(g0Var, 2131887329);
            long jB = z ? dl.a.q : t.b(0.4f, dl.a.q);
            long jZ = kh.o.z(i2);
            u uVar2 = u.D;
            r rVarF = z.n.f(z3 ? z1.q(rVar, RCHTTPStatusCodes.BAD_REQUEST) : z1.d(rVar, 1.0f), z ? dl.a.i : t.b(0.35f, dl.a.i), p0.f.a(f2));
            boolean z7 = (i3 & 112) == 32;
            Object objN3 = g0Var.N();
            if (z7 || objN3 == obj) {
                kVar2 = kVar;
                objN3 = new h(0, kVar2);
                g0Var.n0(objN3);
            } else {
                kVar2 = kVar;
            }
            g0 g0Var2 = g0Var;
            onAction = kVar2;
            z6.b(strU2, h0.c.E(w50.c.o(rVarF, z, null, (u00.a) objN3, 6), 0.0f, f5, 1), jB, jZ, uVar2, (q3.i) null, 0L, (l) null, new x3.k(3), 0L, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var2, 1597440, 0, 261032);
            g0Var = g0Var2;
            h0.c.h(z1.e(rVar, 8), g0Var);
            g0Var.r(true);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new l0.g0(uiState, onAction, i, 18);
        }
    }

    public static final void f(boolean z, boolean z2, ot.n nVar, l1.j jVar, int i) {
        int i2;
        g0 g0Var = (g0) jVar;
        g0Var.e0(1084926708);
        if ((i & 6) == 0) {
            i2 = (g0Var.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (g0Var.h(z2) ? 32 : 16) | (g0Var.g(nVar) ? 256 : 128);
        if (g0Var.S(i3 & 1, (i3 & 147) != 146)) {
            o oVar = o.A;
            if (z) {
                g0Var.c0(1422818659);
                o3.a(y3.R(2131231095, g0Var, 0), (String) null, z1.m(oVar, 24), dl.a.i, g0Var, 440, 0);
                g0Var.r(false);
            } else if (nVar instanceof ot.l) {
                g0Var.c0(1423110121);
                v5.a(z1.m(oVar, 24), dl.a.k, 2, 0L, 0, 0.0f, g0Var, 390, 56);
                g0Var = g0Var;
                g0Var.r(false);
            } else if (z2 || (nVar instanceof ot.m)) {
                g0Var.c0(1423365189);
                h0.o.a(z1.m(oVar, 24), g0Var, 6);
                g0Var.r(false);
            } else {
                g0Var.c0(1423474774);
                o3.a(y3.R(2131231121, g0Var, 0), (String) null, z1.m(oVar, 24), t.b(0.5f, dl.a.i), g0Var, 440, 0);
                g0Var.r(false);
            }
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new ct.f(z, z2, nVar, i);
        }
    }
}
