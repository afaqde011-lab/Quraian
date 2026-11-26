package ev;

import android.content.res.Configuration;
import as.d0;
import bt.t0;
import c3.l2;
import c3.m0;
import c3.o1;
import c3.t2;
import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.internal.measurement.z3;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import g1.o3;
import g1.v5;
import g1.z6;
import h0.c1;
import h0.e1;
import h0.m2;
import h0.p1;
import h0.z1;
import i2.o0;
import java.util.WeakHashMap;
import l1.g0;
import l1.m1;
import l1.r1;
import m3.r0;
import qd.s0;
import z2.w0;

public abstract class s {
    public static final float b;
    public static final float c;
    public static final float g;
    public static final float h;
    public static final float i;
    public static final float a = 32;
    public static final float d = 84;
    public static final float e = 52;
    public static final float f = RCHTTPStatusCodes.BAD_REQUEST;

    static {
        float f2 = 16;
        b = f2;
        float f3 = 24;
        c = f3;
        g = f3;
        h = f2;
        i = f2;
    }

    public static final void a(final jk.a aVar, final boolean z, final boolean z2, final boolean z3, final boolean z4, final u00.a aVar2, final b2.r rVar, l1.j jVar, final int i2) {
        int i3;
        g0 g0Var = (g0) jVar;
        g0Var.e0(1086437466);
        if ((i2 & 6) == 0) {
            i3 = (g0Var.i(aVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= g0Var.h(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= g0Var.h(z2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= g0Var.h(z3) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= g0Var.h(z4) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= g0Var.i(aVar2) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= g0Var.g(rVar) ? 1048576 : 524288;
        }
        if (g0Var.S(i3 & 1, (599187 & i3) != 599186)) {
            b2.r rVarD = z1.d(rVar, 1.0f);
            w0 w0VarD = h0.o.d(b2.b.A, false);
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
            b3.f fVar = b3.h.f;
            l1.q.I(w0VarD, g0Var, fVar);
            b3.f fVar2 = b3.h.e;
            l1.q.I(m1VarM, g0Var, fVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar3 = b3.h.g;
            l1.q.I(numValueOf, g0Var, fVar3);
            b3.e eVar = b3.h.h;
            l1.q.E(g0Var, eVar);
            b3.f fVar4 = b3.h.d;
            l1.q.I(rVarC, g0Var, fVar4);
            long j = dl.a.q;
            h0.s sVar = h0.s.a;
            bi.b.e(aVar, j, sVar.b(), 0.6f, i, g0Var, (i3 & 14) | 27648);
            b2.i iVar = b2.b.B;
            b2.r rVar2 = b2.o.A;
            b2.r rVarN = w50.c.n(z.n.f(f2.h.c(z1.e(z1.d(h0.c.D(h0.c.G(sVar.a(rVar2, iVar), 0.0f, g, 0.0f, 0.0f, 13).V(z2 ? h0.c.M(rVar2, h0.c.g) : h0.c.G(rVar2, 0.0f, 0.0f, 0.0f, h, 7)), b, 10).V(z ? z1.s(rVar2, 0.0f, f, 1) : rVar2), 1.0f), e), p0.f.a), dl.a.i, i2.b0.b), z3, aVar2);
            w0 w0VarD2 = h0.o.d(b2.b.E, false);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            b2.r rVarC2 = b2.a.c(rVarN, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(w0VarD2, g0Var, fVar);
            l1.q.I(m1VarM2, g0Var, fVar2);
            a1.b.v(iHashCode2, g0Var, fVar3, g0Var, eVar);
            l1.q.I(rVarC2, g0Var, fVar4);
            if (z4) {
                g0Var.c0(-1140925818);
                v5.a(z1.m(rVar2, 22), dl.a.L, 2, 0L, 0, 0.0f, g0Var, 390, 56);
                g0Var = g0Var;
                g0Var.r(false);
            } else {
                g0Var.c0(-1140687645);
                z6.b(z3.U(g0Var, 2131887068), (b2.r) null, dl.a.L, kh.o.z(16), q3.u.K, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(20), 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 1597440, 48, 260010);
                g0Var = g0Var;
                g0Var.r(false);
            }
            g0Var.r(true);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new u00.n() {
                @Override
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    s.a(aVar, z, z2, z3, z4, aVar2, rVar, (l1.j) obj, l1.q.K(i2 | 1));
                    return g00.b0.a;
                }
            };
        }
    }

    public static final void b(u00.a aVar, b2.r rVar, l1.j jVar, int i2) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(-81028164);
        int i3 = (g0Var.i(aVar) ? 4 : 2) | i2 | (g0Var.g(rVar) ? 32 : 16);
        if (g0Var.S(i3 & 1, (i3 & 19) != 18)) {
            h0.v vVarA = h0.u.a(h0.i.g(12), b2.b.N, g0Var, 54);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(rVar, g0Var);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(vVarA, g0Var, b3.h.f);
            l1.q.I(m1VarM, g0Var, b3.h.e);
            l1.q.I(Integer.valueOf(iHashCode), g0Var, b3.h.g);
            l1.q.E(g0Var, b3.h.h);
            l1.q.I(rVarC, g0Var, b3.h.d);
            b2.o oVar = b2.o.A;
            o3.a(y3.R(2131231349, g0Var, 0), (String) null, z1.m(oVar, 40), dl.a.Q, g0Var, 440, 0);
            z6.b(z3.U(g0Var, 2131887147), (b2.r) null, dl.a.k, kh.o.z(15), (q3.u) null, (q3.i) null, 0L, (x3.l) null, new x3.k(3), kh.o.z(20), 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 24576, 48, 259050);
            String strU = z3.U(g0Var, 2131886944);
            long j = dl.a.i;
            z6.b(strU, h0.c.D(w50.c.n(z.n.f(f2.h.c(oVar, p0.f.a), i2.t.b(0.1f, j), i2.b0.b), true, aVar), 20, 10), j, kh.o.z(15), q3.u.K, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(20), 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 1597440, 48, 260008);
            g0Var = g0Var;
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new m(aVar, rVar, i2, 0);
        }
    }

    public static final void c(t tVar, u00.k kVar, boolean z, boolean z2, l1.j jVar, int i2) {
        int i3;
        g0 g0Var;
        float fA;
        int i4;
        l1.c cVar;
        b2.r rVar;
        boolean z3;
        g0 g0Var2 = (g0) jVar;
        g0Var2.e0(450267521);
        if ((i2 & 6) == 0) {
            i3 = (g0Var2.g(tVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= g0Var2.i(kVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= g0Var2.h(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= g0Var2.h(z2) ? 2048 : 1024;
        }
        if (g0Var2.S(i3 & 1, (i3 & 1171) != 1170)) {
            j0.v vVarA = j0.x.a(0, g0Var2, 3);
            int i5 = i3;
            kk.c cVarD = kk.e.d(g0Var2);
            t2 t2Var = (t2) g0Var2.k(o1.q);
            g2.l lVar = (g2.l) g0Var2.k(o1.i);
            if (z2) {
                g0Var2.c0(737287883);
                WeakHashMap weakHashMap = m2.w;
                fA = h0.c.l(h0.b.e(g0Var2).e, g0Var2).a();
                g0Var2.r(false);
            } else {
                g0Var2.c0(737377783);
                g0Var2.r(false);
                fA = h;
            }
            boolean z4 = !tVar.l;
            boolean zG = g0Var2.g(vVarA) | g0Var2.g(t2Var) | g0Var2.i(lVar);
            Object objN = g0Var2.N();
            float f2 = fA;
            l1.c cVar2 = l1.i.a;
            if (zG || objN == cVar2) {
                p pVar = new p(vVarA, t2Var, lVar, null, 0);
                g0Var2.n0(pVar);
                objN = pVar;
            }
            l1.q.i(vVarA, g0Var2, (u00.n) objN);
            h0.a0 a0Var = z1.c;
            w0 w0VarD = h0.o.d(b2.b.A, false);
            int iHashCode = Long.hashCode(g0Var2.T);
            m1 m1VarM = g0Var2.m();
            b2.r rVarC = b2.a.c(a0Var, g0Var2);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var2.g0();
            if (g0Var2.S) {
                g0Var2.l(gVar);
            } else {
                g0Var2.q0();
            }
            l1.q.I(w0VarD, g0Var2, b3.h.f);
            l1.q.I(m1VarM, g0Var2, b3.h.e);
            l1.q.I(Integer.valueOf(iHashCode), g0Var2, b3.h.g);
            l1.q.E(g0Var2, b3.h.h);
            l1.q.I(rVarC, g0Var2, b3.h.d);
            boolean zL0 = r30.k.L0(tVar.c);
            float f3 = b;
            b2.r rVar2 = b2.o.A;
            if (zL0 || !((h00.b) tVar.a).isEmpty()) {
                g0Var2.c0(1174992031);
                b2.r rVarF = z.n.f(f2.h.c(h0.c.E(kk.e.a(a0Var, cVarD), f3, 0.0f, 2), p0.f.a(c)), i2.t.b(0.1f, dl.a.i), i2.b0.b);
                p1 p1VarG = h0.c.g(0.0f, 0.0f, 0.0f, d + f2, 7);
                boolean zH = ((i5 & 14) == 4) | g0Var2.h(z4) | ((i5 & 112) == 32);
                Object objN2 = g0Var2.N();
                if (zH || objN2 == cVar2) {
                    i4 = 0;
                    objN2 = new n(tVar, z4, kVar, i4);
                    g0Var2.n0(objN2);
                } else {
                    i4 = 0;
                }
                g0Var = g0Var2;
                cVar = cVar2;
                boolean z5 = i4;
                rVar = rVar2;
                k00.f.d(rVarF, vVarA, p1VarG, null, null, null, false, null, (u00.k) objN2, g0Var, 0, 504);
                g0Var.r(z5);
                z3 = z5;
            } else {
                g0Var2.c0(1174675521);
                s0.J(h0.c.G(h0.c.E(rVar2, f3, 0.0f, 2), 0.0f, 12, 0.0f, 0.0f, 13), false, g0Var2, 54, 0);
                g0Var2.r(false);
                z3 = false;
                cVar = cVar2;
                g0Var = g0Var2;
                rVar = rVar2;
            }
            b2.r rVarA = h0.s.a.a(rVar, b2.b.H);
            boolean z6 = tVar.l;
            boolean z7 = (i5 & 112) == 32 ? true : z3;
            Object objN3 = g0Var.N();
            if (z7 || objN3 == cVar) {
                objN3 = new t0(21, kVar);
                g0Var.n0(objN3);
            }
            a(cVarD, z, z2, z4, z6, (u00.a) objN3, rVarA, g0Var, (i5 >> 3) & 1008);
            g0Var.r(true);
        } else {
            g0Var = g0Var2;
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new iz.o(tVar, kVar, z, z2, i2);
        }
    }

    public static final void d(boolean z, u00.a aVar, l1.j jVar, int i2) {
        int i3;
        b2.r rVarL;
        g0 g0Var = (g0) jVar;
        g0Var.e0(-1731432241);
        int i4 = i2 | (g0Var.h(z) ? 4 : 2) | (g0Var.i(aVar) ? 32 : 16);
        if (g0Var.S(i4 & 1, (i4 & 19) != 18)) {
            b2.r rVar = b2.o.A;
            b2.r rVarD = z1.d(rVar, 1.0f);
            if (z) {
                g0Var.c0(1459550858);
                b2.r rVarM = h0.c.M(rVar, h0.c.e);
                WeakHashMap weakHashMap = m2.w;
                rVarL = h0.c.L(rVarM, new e1(h0.b.e(g0Var).b, h0.c.l));
                g0Var.r(false);
            } else {
                g0Var.c0(1459751459);
                g0Var.r(false);
                rVarL = rVar;
            }
            b2.r rVarG = h0.c.G(h0.c.E(rVarD.V(rVarL), b, 0.0f, 2), 0.0f, 16, 0.0f, 12, 5);
            w0 w0VarD = h0.o.d(b2.b.E, false);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(rVarG, g0Var);
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
            b2.r rVarA = h0.s.a.a(rVar, b2.b.D);
            m2.b bVarR = y3.R(2131231104, g0Var, 0);
            String strU = z3.U(g0Var, 2131886127);
            kk.c cVarD = kk.e.d(g0Var);
            long j = dl.a.i;
            ta.c0.a(bVarR, strU, aVar, cVarD, i2.t.b(0.1f, j), rVarA, 0.0f, 0.0f, j, g0Var, 8 | ((i4 << 3) & 896));
            z6.b(z3.U(g0Var, 2131887070), h0.c.E(rVar, 48, 0.0f, 2), dl.a.k, kh.o.z(17), q3.u.L, (q3.i) null, 0L, (x3.l) null, new x3.k(3), kh.o.z(22), 2, false, 1, 0, (u00.k) null, (r0) null, g0Var, 1597488, 25008, 238504);
            i3 = 1;
            g0Var.r(true);
        } else {
            i3 = 1;
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new c00.n(z, aVar, i2, i3);
        }
    }

    public static final void e(t uiState, u00.k kVar, boolean z, l1.j jVar, int i2, int i3) {
        boolean z2;
        boolean z3;
        boolean z4;
        r1 r1VarT;
        boolean z5;
        Configuration configuration;
        boolean z6;
        l2 l2VarU;
        o0 o0Var;
        float f2;
        b2.r rVarM;
        b3.g gVar;
        boolean z7;
        int i4;
        boolean z8;
        l1.c cVar;
        Object obj;
        boolean z9;
        Object obj2;
        int i5;
        boolean z11;
        boolean z12;
        int i6;
        boolean z13;
        ?? r11;
        int i7;
        l1.c cVar2;
        u00.k kVar2;
        Object obj3;
        pu.e eVar;
        ?? r14;
        Object obj4;
        ?? r15;
        Object obj5;
        ?? r16;
        Object obj6;
        u00.k onAction = kVar;
        b2.i iVar = b2.b.E;
        kotlin.jvm.internal.m.e(uiState, "uiState");
        boolean z14 = uiState.b;
        kotlin.jvm.internal.m.e(onAction, "onAction");
        g0 g0Var = (g0) jVar;
        g0Var.e0(-900795278);
        int i8 = (g0Var.g(uiState) ? 4 : 2) | i2;
        if ((i2 & 48) == 0) {
            i8 |= g0Var.i(onAction) ? 32 : 16;
        }
        int i9 = i3 & 4;
        if (i9 == 0) {
            if ((i2 & 384) == 0) {
                z2 = z;
                i8 |= g0Var.h(z2) ? 256 : 128;
            }
            if ((i8 & 147) != 146) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (g0Var.S(i8 & 1, z3)) {
                if (i9 != 0) {
                    z5 = false;
                } else {
                    z5 = z2;
                }
                sg.f fVar = cm.a.A;
                configuration = (Configuration) g0Var.k(c3.o0.a);
                fVar.getClass();
                if (sg.f.J(configuration) == cm.a.B) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                l2VarU = m0.u(g0Var);
                if (z5) {
                    g0Var.c0(-635929776);
                    g0Var.r(false);
                } else {
                    g0Var.c0(-636055667);
                    g4.d(54, i2.t.f, g0Var, true);
                    g0Var.r(false);
                }
                o0Var = i2.b0.b;
                f2 = a;
                if (z5) {
                    rVarM = z.n.f(f2.h.c(z1.c, p0.f.a(f2)), dl.a.q, o0Var);
                } else {
                    rVarM = h0.c.M(u2.f.a(z.n.f(f2.h.c(z1.c, p0.f.c(f2, f2, 0.0f, 0.0f, 12)), dl.a.q, o0Var), l2VarU, (u2.d) null), h0.c.f);
                }
                h0.v vVarA = h0.u.a(h0.i.c, b2.b.M, g0Var, 0);
                int iHashCode = Long.hashCode(g0Var.T);
                m1 m1VarM = g0Var.m();
                b2.r rVarC = b2.a.c(rVarM, g0Var);
                b3.i.c.getClass();
                gVar = b3.h.b;
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar);
                } else {
                    g0Var.q0();
                }
                b3.f fVar2 = b3.h.f;
                l1.q.I(vVarA, g0Var, fVar2);
                b3.f fVar3 = b3.h.e;
                l1.q.I(m1VarM, g0Var, fVar3);
                Integer numValueOf = Integer.valueOf(iHashCode);
                b3.f fVar4 = b3.h.g;
                l1.q.I(numValueOf, g0Var, fVar4);
                b3.e eVar2 = b3.h.h;
                l1.q.E(g0Var, eVar2);
                b3.f fVar5 = b3.h.d;
                l1.q.I(rVarC, g0Var, fVar5);
                z7 = !z5;
                i4 = i8 & 112;
                if (i4 == 32) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                Object objN = g0Var.N();
                cVar = l1.i.a;
                obj = objN;
                if (z8 || objN == cVar) {
                    t0 t0Var = new t0(20, onAction);
                    g0Var.n0(t0Var);
                    obj = t0Var;
                }
                d(z7, (u00.a) obj, g0Var, 0);
                String str = uiState.c;
                if (i4 == 32) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                Object objN2 = g0Var.N();
                if (!z9 || objN2 == cVar) {
                    d0 d0Var = new d0(14, onAction);
                    g0Var.n0(d0Var);
                    obj2 = d0Var;
                } else {
                    obj2 = objN2;
                }
                b2.o oVar = b2.o.A;
                float f3 = b;
                i5 = i8;
                z11 = z6;
                kh.n.n(3072, h0.c.G(h0.c.E(oVar, f3, 0.0f, 2), 0.0f, 0.0f, 0.0f, 24, 7), str, g0Var, (u00.k) obj2, z11);
                b2.r rVarD = z1.d(oVar, 1.0f);
                if (1.0f <= 0.0d) {
                    i0.a.a("invalid weight; must be greater than zero");
                }
                b2.r rVarV = rVarD.V(new c1(1.0f, true));
                w0 w0VarD = h0.o.d(b2.b.A, false);
                int iHashCode2 = Long.hashCode(g0Var.T);
                m1 m1VarM2 = g0Var.m();
                b2.r rVarC2 = b2.a.c(rVarV, g0Var);
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar);
                } else {
                    g0Var.q0();
                }
                l1.q.I(w0VarD, g0Var, fVar2);
                l1.q.I(m1VarM2, g0Var, fVar3);
                a1.b.v(iHashCode2, g0Var, fVar4, g0Var, eVar2);
                l1.q.I(rVarC2, g0Var, fVar5);
                z12 = uiState.h;
                h0.s sVar = h0.s.a;
                if (z12 || z14) {
                    i6 = i4;
                    z13 = true;
                    r11 = 0;
                    r11 = 0;
                    i7 = 32;
                    if (uiState.i || z14 || z12) {
                        g0Var.c0(-1894524561);
                        onAction = kVar;
                        cVar2 = cVar;
                        c(uiState, onAction, z11, z7, g0Var, i5 & 126);
                        g0Var.r(false);
                    } else {
                        g0Var.c0(1399001259);
                        b2.r rVarC3 = h0.c.C(sVar.a(oVar, iVar), f3);
                        boolean z15 = i6 == 32;
                        Object objN3 = g0Var.N();
                        if (z15 || objN3 == cVar) {
                            kVar2 = kVar;
                            t0 t0Var2 = new t0(22, kVar2);
                            g0Var.n0(t0Var2);
                            obj3 = t0Var2;
                        } else {
                            kVar2 = kVar;
                            obj3 = objN3;
                        }
                        b((u00.a) obj3, rVarC3, g0Var, 0);
                        g0Var.r(false);
                        cVar2 = cVar;
                        onAction = kVar2;
                    }
                } else {
                    g0Var.c0(-1894539737);
                    z13 = true;
                    v5.a(sVar.a(oVar, iVar), dl.a.i, 0.0f, 0L, 0, 0.0f, g0Var, 0, 60);
                    g0Var = g0Var;
                    g0Var.r(false);
                    i6 = i4;
                    r11 = 0;
                    i7 = 32;
                    cVar2 = cVar;
                    onAction = kVar;
                }
                g0Var.r(z13);
                g0Var.r(z13);
                if (uiState.j) {
                    g0Var.c0(-633920015);
                    if (i6 == i7) {
                        r15 = z13;
                    } else {
                        r15 = r11;
                    }
                    Object objN4 = g0Var.N();
                    obj5 = objN4;
                    if (r15 == 0 || objN4 == cVar2) {
                        t0 t0Var3 = new t0(23, onAction);
                        g0Var.n0(t0Var3);
                        obj5 = t0Var3;
                    }
                    u00.a aVar = (u00.a) obj5;
                    if (i6 == i7) {
                        r16 = z13;
                    } else {
                        r16 = r11;
                    }
                    Object objN5 = g0Var.N();
                    obj6 = objN5;
                    if (r16 == 0 || objN5 == cVar2) {
                        t0 t0Var4 = new t0(24, onAction);
                        g0Var.n0(t0Var4);
                        obj6 = t0Var4;
                    }
                    k00.f.j(aVar, (u00.a) obj6, g0Var, r11);
                    g0Var.r((boolean) r11);
                } else {
                    g0Var.c0(-633705712);
                    g0Var.r((boolean) r11);
                }
                eVar = uiState.k;
                if (eVar == null) {
                    g0Var.c0(-633665165);
                    g0Var.r((boolean) r11);
                } else {
                    g0Var.c0(-633665164);
                    if (i6 == i7) {
                        r14 = z13;
                    } else {
                        r14 = r11;
                    }
                    Object objN6 = g0Var.N();
                    obj4 = objN6;
                    if (r14 == 0 || objN6 == cVar2) {
                        t0 t0Var5 = new t0(25, onAction);
                        g0Var.n0(t0Var5);
                        obj4 = t0Var5;
                    }
                    k00.f.f(eVar, (u00.a) obj4, g0Var, r11);
                    g0Var.r((boolean) r11);
                }
                z4 = z5;
            } else {
                g0Var.V();
                z4 = z2;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.d = new az.l(uiState, onAction, z4, i2, i3, 2);
            }
        }
        i8 |= 384;
        z2 = z;
        if ((i8 & 147) != 146) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (g0Var.S(i8 & 1, z3)) {
            if (i9 != 0) {
                z5 = false;
            } else {
                z5 = z2;
            }
            sg.f fVar6 = cm.a.A;
            configuration = (Configuration) g0Var.k(c3.o0.a);
            fVar6.getClass();
            if (sg.f.J(configuration) == cm.a.B) {
                z6 = true;
            } else {
                z6 = false;
            }
            l2VarU = m0.u(g0Var);
            if (z5) {
                g0Var.c0(-636055667);
                g4.d(54, i2.t.f, g0Var, true);
                g0Var.r(false);
            } else {
                g0Var.c0(-635929776);
                g0Var.r(false);
            }
            o0Var = i2.b0.b;
            f2 = a;
            if (z5) {
                rVarM = z.n.f(f2.h.c(z1.c, p0.f.a(f2)), dl.a.q, o0Var);
            } else {
                rVarM = h0.c.M(u2.f.a(z.n.f(f2.h.c(z1.c, p0.f.c(f2, f2, 0.0f, 0.0f, 12)), dl.a.q, o0Var), l2VarU, (u2.d) null), h0.c.f);
            }
            h0.v vVarA2 = h0.u.a(h0.i.c, b2.b.M, g0Var, 0);
            int iHashCode3 = Long.hashCode(g0Var.T);
            m1 m1VarM3 = g0Var.m();
            b2.r rVarC4 = b2.a.c(rVarM, g0Var);
            b3.i.c.getClass();
            gVar = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            b3.f fVar7 = b3.h.f;
            l1.q.I(vVarA2, g0Var, fVar7);
            b3.f fVar8 = b3.h.e;
            l1.q.I(m1VarM3, g0Var, fVar8);
            Integer numValueOf2 = Integer.valueOf(iHashCode3);
            b3.f fVar9 = b3.h.g;
            l1.q.I(numValueOf2, g0Var, fVar9);
            b3.e eVar3 = b3.h.h;
            l1.q.E(g0Var, eVar3);
            b3.f fVar10 = b3.h.d;
            l1.q.I(rVarC4, g0Var, fVar10);
            z7 = !z5;
            i4 = i8 & 112;
            if (i4 == 32) {
                z8 = true;
            } else {
                z8 = false;
            }
            Object objN7 = g0Var.N();
            cVar = l1.i.a;
            obj = objN7;
            if (z8) {
                t0 t0Var6 = new t0(20, onAction);
                g0Var.n0(t0Var6);
                obj = t0Var6;
            } else {
                t0 t0Var7 = new t0(20, onAction);
                g0Var.n0(t0Var7);
                obj = t0Var7;
            }
            d(z7, (u00.a) obj, g0Var, 0);
            String str2 = uiState.c;
            if (i4 == 32) {
                z9 = true;
            } else {
                z9 = false;
            }
            Object objN8 = g0Var.N();
            if (z9) {
                d0 d0Var2 = new d0(14, onAction);
                g0Var.n0(d0Var2);
                obj2 = d0Var2;
            } else {
                d0 d0Var3 = new d0(14, onAction);
                g0Var.n0(d0Var3);
                obj2 = d0Var3;
            }
            b2.o oVar2 = b2.o.A;
            float f4 = b;
            i5 = i8;
            z11 = z6;
            kh.n.n(3072, h0.c.G(h0.c.E(oVar2, f4, 0.0f, 2), 0.0f, 0.0f, 0.0f, 24, 7), str2, g0Var, (u00.k) obj2, z11);
            b2.r rVarD2 = z1.d(oVar2, 1.0f);
            if (1.0f <= 0.0d) {
                i0.a.a("invalid weight; must be greater than zero");
            }
            b2.r rVarV2 = rVarD2.V(new c1(1.0f, true));
            w0 w0VarD2 = h0.o.d(b2.b.A, false);
            int iHashCode4 = Long.hashCode(g0Var.T);
            m1 m1VarM4 = g0Var.m();
            b2.r rVarC5 = b2.a.c(rVarV2, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(w0VarD2, g0Var, fVar7);
            l1.q.I(m1VarM4, g0Var, fVar8);
            a1.b.v(iHashCode4, g0Var, fVar9, g0Var, eVar3);
            l1.q.I(rVarC5, g0Var, fVar10);
            z12 = uiState.h;
            h0.s sVar2 = h0.s.a;
            if (z12) {
                i6 = i4;
                z13 = true;
                r11 = 0;
                r11 = 0;
                i7 = 32;
                if (uiState.i) {
                    g0Var.c0(-1894524561);
                    onAction = kVar;
                    cVar2 = cVar;
                    c(uiState, onAction, z11, z7, g0Var, i5 & 126);
                    g0Var.r(false);
                } else {
                    g0Var.c0(-1894524561);
                    onAction = kVar;
                    cVar2 = cVar;
                    c(uiState, onAction, z11, z7, g0Var, i5 & 126);
                    g0Var.r(false);
                }
            } else {
                i6 = i4;
                z13 = true;
                r11 = 0;
                r11 = 0;
                i7 = 32;
                if (uiState.i) {
                    g0Var.c0(-1894524561);
                    onAction = kVar;
                    cVar2 = cVar;
                    c(uiState, onAction, z11, z7, g0Var, i5 & 126);
                    g0Var.r(false);
                } else {
                    g0Var.c0(-1894524561);
                    onAction = kVar;
                    cVar2 = cVar;
                    c(uiState, onAction, z11, z7, g0Var, i5 & 126);
                    g0Var.r(false);
                }
            }
            g0Var.r(z13);
            g0Var.r(z13);
            if (uiState.j) {
                g0Var.c0(-633920015);
                if (i6 == i7) {
                    r15 = z13;
                } else {
                    r15 = r11;
                }
                Object objN9 = g0Var.N();
                obj5 = objN9;
                if (r15 == 0) {
                    t0 t0Var8 = new t0(23, onAction);
                    g0Var.n0(t0Var8);
                    obj5 = t0Var8;
                } else {
                    t0 t0Var9 = new t0(23, onAction);
                    g0Var.n0(t0Var9);
                    obj5 = t0Var9;
                }
                u00.a aVar2 = (u00.a) obj5;
                if (i6 == i7) {
                    r16 = z13;
                } else {
                    r16 = r11;
                }
                Object objN10 = g0Var.N();
                obj6 = objN10;
                if (r16 == 0) {
                    t0 t0Var10 = new t0(24, onAction);
                    g0Var.n0(t0Var10);
                    obj6 = t0Var10;
                } else {
                    t0 t0Var11 = new t0(24, onAction);
                    g0Var.n0(t0Var11);
                    obj6 = t0Var11;
                }
                k00.f.j(aVar2, (u00.a) obj6, g0Var, r11);
                g0Var.r((boolean) r11);
            } else {
                g0Var.c0(-633705712);
                g0Var.r((boolean) r11);
            }
            eVar = uiState.k;
            if (eVar == null) {
                g0Var.c0(-633665165);
                g0Var.r((boolean) r11);
            } else {
                g0Var.c0(-633665164);
                if (i6 == i7) {
                    r14 = z13;
                } else {
                    r14 = r11;
                }
                Object objN11 = g0Var.N();
                obj4 = objN11;
                if (r14 == 0) {
                    t0 t0Var12 = new t0(25, onAction);
                    g0Var.n0(t0Var12);
                    obj4 = t0Var12;
                } else {
                    t0 t0Var13 = new t0(25, onAction);
                    g0Var.n0(t0Var13);
                    obj4 = t0Var13;
                }
                k00.f.f(eVar, (u00.a) obj4, g0Var, r11);
                g0Var.r((boolean) r11);
            }
            z4 = z5;
        } else {
            g0Var.V();
            z4 = z2;
        }
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new az.l(uiState, onAction, z4, i2, i3, 2);
        }
    }
}
