package bs;

import a1.s0;
import android.content.Context;
import android.content.res.Configuration;
import as.e0;
import as.u0;
import b2.r;
import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.internal.measurement.z3;
import g1.z6;
import h0.a0;
import h0.c1;
import h0.o;
import h0.p1;
import h0.s;
import h0.t1;
import h0.u;
import h0.v;
import h0.v1;
import h0.z1;
import i2.b0;
import i2.o0;
import i2.t;
import i2.t0;
import java.util.Collection;
import kotlin.jvm.internal.m;
import l1.g0;
import l1.m1;
import l1.p2;
import l1.q;
import l1.r1;
import m3.r0;
import u00.k;
import x.y;
import x3.l;
import z.n;
import z2.p;
import z2.w0;

public abstract class a {
    public static final v1.c a = new v1.c(new al.c(7), 250509508, false);
    public static final v1.c b = new v1.c(new al.c(8), 1467652781, false);
    public static final v1.c c = new v1.c(new al.c(9), 1983877680, false);
    public static final v1.c d = new v1.c(new al.c(10), -920974489, false);

    public static final void a(r rVar, l1.j jVar, int i) {
        int i2;
        g0 g0Var = (g0) jVar;
        g0Var.e0(-640993832);
        if ((i & 6) == 0) {
            i2 = (g0Var.g(rVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (g0Var.S(i2 & 1, (i2 & 3) != 2)) {
            o2.f fVarH0 = g4.h0(2131231389, g0Var, 6);
            long j = dl.a.L;
            r rVarF = n.f(rVar, j, b0.b);
            w0 w0VarD = o.d(b2.b.E, false);
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
            q.I(w0VarD, g0Var, b3.h.f);
            q.I(m1VarM, g0Var, b3.h.e);
            q.I(Integer.valueOf(iHashCode), g0Var, b3.h.g);
            q.E(g0Var, b3.h.h);
            q.I(rVarC, g0Var, b3.h.d);
            a0 a0Var = z1.c;
            float f = 100;
            r rVarB = f2.h.b(a0Var, f, (o0) null);
            Object objN = g0Var.N();
            l1.c cVar = l1.i.a;
            if (objN == cVar) {
                objN = new s0(20);
                g0Var.n0(objN);
            }
            r rVarP = b0.p(rVarB, (k) objN);
            long j2 = dl.a.i;
            z3.k(fVarH0, (String) null, rVarP, j2, g0Var, 48);
            r rVarB2 = f2.h.b(h0.c.m(z1.d(b2.o.A, 0.55f), 1.0f), f, (o0) null);
            Object objN2 = g0Var.N();
            if (objN2 == cVar) {
                objN2 = new s0(21);
                g0Var.n0(objN2);
            }
            z3.k(fVarH0, (String) null, b0.p(rVarB2, (k) objN2), j2, g0Var, 48);
            o.a(n.e(a0Var, sg.f.Q(new g00.k[]{new g00.k(Float.valueOf(0.0f), new t(t.b(0.0f, j))), new g00.k(Float.valueOf(0.55f), new t(t.b(0.35f, j))), new g00.k(Float.valueOf(1.0f), new t(t.b(0.7f, j)))}), (t0) null, 6), g0Var, 0);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new h(rVar, i, 0);
        }
    }

    public static final void b(r rVar, l1.j jVar, int i) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(1534983904);
        int i2 = (g0Var.g(rVar) ? 4 : 2) | i;
        if (g0Var.S(i2 & 1, (i2 & 3) != 2)) {
            r rVarF = n.f(f2.h.c(z1.m(rVar, 102), p0.f.a), t.b(0.1f, dl.a.i), b0.b);
            w0 w0VarD = o.d(b2.b.E, false);
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
            q.I(w0VarD, g0Var, b3.h.f);
            q.I(m1VarM, g0Var, b3.h.e);
            q.I(Integer.valueOf(iHashCode), g0Var, b3.h.g);
            q.E(g0Var, b3.h.h);
            q.I(rVarC, g0Var, b3.h.d);
            wr.k.h(null, 54, 16, dl.a.f, g0Var, 432, 1);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new b(rVar, i, 2);
        }
    }

    public static final void c(r rVar, l1.j jVar, int i) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(-907180364);
        int i2 = (g0Var.g(rVar) ? 4 : 2) | i;
        if (g0Var.S(i2 & 1, (i2 & 3) != 2)) {
            r rVarC = h0.c.C(n.f(f2.h.c(z1.d(rVar, 1.0f), p0.f.a(24)), t.b(0.1f, dl.a.i), b0.b), 20);
            v vVarA = u.a(h0.i.c, b2.b.N, g0Var, 48);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            r rVarC2 = b2.a.c(rVarC, g0Var);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            q.I(vVarA, g0Var, b3.h.f);
            q.I(m1VarM, g0Var, b3.h.e);
            q.I(Integer.valueOf(iHashCode), g0Var, b3.h.g);
            q.E(g0Var, b3.h.h);
            q.I(rVarC2, g0Var, b3.h.d);
            z6.b(z3.U(g0Var, 2131887110), (r) null, dl.a.k, kh.o.z(17), q3.u.L, (q3.i) null, 0L, (l) null, new x3.k(3), kh.o.z(17), 0, false, 0, 0, (k) null, (r0) null, g0Var, 1597440, 48, 258986);
            z6.b(z3.U(g0Var, 2131887109), h0.c.G(b2.o.A, 0.0f, 8, 0.0f, 0.0f, 13), dl.a.o, kh.o.z(15), q3.u.J, (q3.i) null, 0L, (l) null, new x3.k(3), kh.o.z(15), 0, false, 0, 0, (k) null, (r0) null, g0Var, 1597488, 48, 258984);
            g0Var = g0Var;
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new b(rVar, i, 0);
        }
    }

    public static final void d(l1.j jVar, int i) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(-1216492259);
        if (g0Var.S(i & 1, i != 0)) {
            float f = 24;
            b2.o oVar = b2.o.A;
            r rVarD = z1.d(h0.c.E(oVar, f, 0.0f, 2), 1.0f);
            v1 v1VarA = t1.a(h0.i.g(f), b2.b.J, g0Var, 6);
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
            ox.g.d(16, 54, 0, z1.m(oVar, 220), g0Var);
            if (1.0f <= 0.0d) {
                i0.a.a("invalid weight; must be greater than zero");
            }
            c1 c1Var = new c1(1.0f, true);
            v vVarA = u.a(h0.i.c, b2.b.M, g0Var, 0);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            r rVarC2 = b2.a.c(c1Var, g0Var);
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
            ox.g.d(0.0f, 6, 2, z1.n(oVar, 280, 32), g0Var);
            float f2 = 12;
            ox.g.d(0.0f, 6, 2, z1.n(h0.c.G(oVar, 0.0f, f2, 0.0f, 0.0f, 13), 160, 18), g0Var);
            h0.c.h(z1.e(h0.c.G(oVar, 0.0f, f2, 0.0f, 0.0f, 13), ox.g.b), g0Var);
            g0Var.r(true);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new ax.c(i, 17);
        }
    }

    public static final void e(dw.a aVar, r rVar, l1.j jVar, int i) {
        r rVar2;
        g0 g0Var = (g0) jVar;
        g0Var.e0(-207835482);
        int i2 = (g0Var.i(aVar) ? 4 : 2) | i | 48;
        if (g0Var.S(i2 & 1, (i2 & 19) != 18)) {
            Context context = (Context) g0Var.k(c3.o0.b);
            String str = aVar.f;
            if (r30.k.L0(str) || aVar.c()) {
                str = null;
            }
            boolean zG = g0Var.g(str) | g0Var.g(context);
            Object objN = g0Var.N();
            if (zG || objN == l1.i.a) {
                wb.h hVar = new wb.h(context);
                hVar.c = str;
                hVar.c(1200);
                hVar.b();
                objN = hVar.a();
                g0Var.n0(objN);
            }
            mb.j jVarI = mb.l.i((wb.i) objN, (p) null, g0Var, 0, 62);
            b2.i iVar = b2.b.E;
            w0 w0VarD = o.d(iVar, false);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            rVar2 = b2.o.A;
            r rVarC = b2.a.c(rVar2, g0Var);
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
            r rVarG0 = rd.a.g0(160, 0, dl.a.s, n.f(f2.h.c(z1.m(rVar2, 220), p0.f.a(16)), aVar.c() ? dl.a.q : dl.a.s, b0.b), (str == null || (jVarI.j() instanceof mb.g)) ? false : true);
            w0 w0VarD2 = o.d(iVar, false);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            r rVarC2 = b2.a.c(rVarG0, g0Var);
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
            if (aVar.c()) {
                g0Var.c0(-1126715569);
                wr.k.h(null, 64, 0.0f, dl.a.h, g0Var, 48, 5);
                g0Var.r(false);
            } else if (str != null) {
                g0Var.c0(-1126493733);
                n.c(jVarI, (String) null, z1.c, (b2.d) null, z2.o.a, 0.0f, g0Var, 25008, 104);
                g0Var = g0Var;
                g0Var.r(false);
            } else {
                g0Var.c0(-1126226544);
                g0Var.r(false);
            }
            g0Var.r(true);
            g0Var.r(true);
        } else {
            g0Var.V();
            rVar2 = rVar;
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new d(aVar, rVar2, i, 0);
        }
    }

    public static final void f(dw.a aVar, int i, u00.a onPlayClicked, u00.a onShuffleClicked, r rVar, boolean z, l1.j jVar, int i2) {
        g0 g0Var;
        r1 r1VarT;
        c cVar;
        u00.a aVar2;
        String strO;
        r rVar2;
        boolean z2;
        long j;
        r rVar3;
        u00.a aVar3;
        u00.a aVar4;
        m.e(onPlayClicked, "onPlayClicked");
        m.e(onShuffleClicked, "onShuffleClicked");
        g0 g0Var2 = (g0) jVar;
        g0Var2.e0(-1516762359);
        int i3 = i2 | (g0Var2.i(aVar) ? 4 : 2) | (g0Var2.e(i) ? 32 : 16) | (g0Var2.i(onPlayClicked) ? 256 : 128) | (g0Var2.i(onShuffleClicked) ? 2048 : 1024) | (g0Var2.h(z) ? 131072 : 65536);
        if (g0Var2.S(i3 & 1, (74899 & i3) != 74898)) {
            if (aVar == null) {
                r1VarT = g0Var2.t();
                if (r1VarT == null) {
                    return;
                } else {
                    cVar = new c(aVar, i, onPlayClicked, onShuffleClicked, rVar, z, i2, 0);
                }
            } else {
                String str = aVar.e;
                boolean z3 = aVar.g;
                boolean z4 = (i3 & 112) == 32;
                Object objN = g0Var2.N();
                if (z4 || objN == l1.i.a) {
                    objN = Boolean.valueOf(i > 0);
                    g0Var2.n0(objN);
                }
                boolean zBooleanValue = ((Boolean) objN).booleanValue();
                p2 p2VarB = x.d.b(zBooleanValue ? 1.0f : 0.6f, (y) null, (String) null, g0Var2, 0, 30);
                float f = 24;
                r rVarD = z1.d(h0.c.E(rVar, f, 0.0f, 2), 1.0f);
                v1 v1VarA = t1.a(h0.i.g(f), b2.b.J, g0Var2, 6);
                int iHashCode = Long.hashCode(g0Var2.T);
                m1 m1VarM = g0Var2.m();
                r rVarC = b2.a.c(rVarD, g0Var2);
                b3.i.c.getClass();
                u00.a aVar5 = b3.h.b;
                g0Var2.g0();
                if (g0Var2.S) {
                    g0Var2.l(aVar5);
                } else {
                    g0Var2.q0();
                }
                b3.f fVar = b3.h.f;
                q.I(v1VarA, g0Var2, fVar);
                b3.f fVar2 = b3.h.e;
                q.I(m1VarM, g0Var2, fVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                b3.f fVar3 = b3.h.g;
                q.I(numValueOf, g0Var2, fVar3);
                b3.e eVar = b3.h.h;
                q.E(g0Var2, eVar);
                b3.f fVar4 = b3.h.d;
                q.I(rVarC, g0Var2, fVar4);
                e(aVar, null, g0Var2, 8);
                if (1.0f <= 0.0d) {
                    i0.a.a("invalid weight; must be greater than zero");
                }
                c1 c1Var = new c1(1.0f, true);
                v vVarA = u.a(h0.i.c, b2.b.M, g0Var2, 0);
                int iHashCode2 = Long.hashCode(g0Var2.T);
                m1 m1VarM2 = g0Var2.m();
                r rVarC2 = b2.a.c(c1Var, g0Var2);
                g0Var2.g0();
                if (g0Var2.S) {
                    aVar2 = aVar5;
                    g0Var2.l(aVar2);
                } else {
                    aVar2 = aVar5;
                    g0Var2.q0();
                }
                q.I(vVarA, g0Var2, fVar);
                q.I(m1VarM2, g0Var2, fVar2);
                a1.b.v(iHashCode2, g0Var2, fVar3, g0Var2, eVar);
                q.I(rVarC2, g0Var2, fVar4);
                if (z3) {
                    strO = oi.k.o(g0Var2, -1191736616, 2131887117, g0Var2, false);
                } else {
                    g0Var2.c0(-1191641539);
                    g0Var2.r(false);
                    strO = aVar.c;
                }
                long jZ = kh.o.z(32);
                long jZ2 = kh.o.z(32);
                long j2 = dl.a.i;
                u00.a aVar6 = aVar2;
                z6.b(strO, (r) null, j2, jZ, q3.u.M, (q3.i) null, 0L, (l) null, (x3.k) null, jZ2, 2, false, 2, 0, (k) null, (r0) null, g0Var2, 1597440, 25008, 239530);
                g0 g0Var3 = g0Var2;
                r rVar4 = b2.o.A;
                if (z3) {
                    g0Var3.c0(-1191287116);
                    l(aVar, j2, h0.c.G(rVar4, 0.0f, 12, 0.0f, 0.0f, 13), 0.0f, 0L, 0L, 0, g0Var3, 392, 120);
                    g0Var3 = g0Var3;
                    g0Var3.r(false);
                    z2 = false;
                    j2 = j2;
                    rVar2 = rVar4;
                } else {
                    g0Var3.c0(-1191008705);
                    String str2 = aVar.d;
                    if (r30.k.L0(str2)) {
                        str2 = null;
                    }
                    if (str2 == null) {
                        g0Var3.c0(-1191008706);
                        g0Var3.r(false);
                        z2 = false;
                        rVar2 = rVar4;
                    } else {
                        g0Var3.c0(-1191008705);
                        rVar2 = rVar4;
                        z2 = false;
                        z6.b(str2, h0.c.G(rVar4, 0.0f, 12, 0.0f, 0.0f, 13), j2, kh.o.z(18), q3.u.J, (q3.i) null, 0L, (l) null, (x3.k) null, kh.o.z(18), 0, false, 0, 0, (k) null, (r0) null, g0Var3, 1597488, 48, 260008);
                        g0Var3 = g0Var3;
                        g0Var3.r(false);
                    }
                    g0Var3.r(z2);
                }
                if (r30.k.L0(str) || z) {
                    j = j2;
                    g0Var3.c0(-1190052107);
                    rVar3 = rVar2;
                    h0.c.h(z1.e(rVar3, 12), g0Var3);
                    g0Var3.r(z2);
                } else {
                    g0Var3.c0(-1190530344);
                    r rVar5 = rVar2;
                    g0 g0Var4 = g0Var3;
                    j = j2;
                    z6.b(str, h0.c.E(z1.d(rVar5, 1.0f), 0.0f, 12, 1), t.b(0.5f, j2), kh.o.z(13), q3.u.B, (q3.i) null, 0L, (l) null, (x3.k) null, kh.o.z(18), 2, false, 2, 0, (k) null, (r0) null, g0Var4, 1597488, 25008, 239528);
                    g0Var3 = g0Var4;
                    g0Var3.r(z2);
                    rVar3 = rVar5;
                }
                r rVarD2 = z1.d(rVar3, 1.0f);
                h0.f fVarG = h0.i.g(16);
                b2.h hVar = b2.b.K;
                v1 v1VarA2 = t1.a(fVarG, hVar, g0Var3, 54);
                int iHashCode3 = Long.hashCode(g0Var3.T);
                m1 m1VarM3 = g0Var3.m();
                r rVarC3 = b2.a.c(rVarD2, g0Var3);
                g0Var3.g0();
                if (g0Var3.S) {
                    aVar3 = aVar6;
                    g0Var3.l(aVar3);
                } else {
                    aVar3 = aVar6;
                    g0Var3.q0();
                }
                q.I(v1VarA2, g0Var3, fVar);
                q.I(m1VarM3, g0Var3, fVar2);
                a1.b.v(iHashCode3, g0Var3, fVar3, g0Var3, eVar);
                q.I(rVarC3, g0Var3, fVar4);
                r rVarC4 = f2.h.c(z1.m(rVar3, 44), p0.f.a);
                long j3 = j;
                long jB = t.b(0.15f, j3);
                o0 o0Var = b0.b;
                r rVarO = w50.c.o(n.f(rVarC4, jB, o0Var), z2, null, onShuffleClicked, 7);
                w0 w0VarD = o.d(b2.b.E, z2);
                u00.a aVar7 = aVar3;
                int iHashCode4 = Long.hashCode(g0Var3.T);
                m1 m1VarM4 = g0Var3.m();
                r rVarC5 = b2.a.c(rVarO, g0Var3);
                g0Var3.g0();
                if (g0Var3.S) {
                    aVar4 = aVar7;
                    g0Var3.l(aVar4);
                } else {
                    aVar4 = aVar7;
                    g0Var3.q0();
                }
                q.I(w0VarD, g0Var3, fVar);
                q.I(m1VarM4, g0Var3, fVar2);
                a1.b.v(iHashCode4, g0Var3, fVar3, g0Var3, eVar);
                q.I(rVarC5, g0Var3, fVar4);
                float f2 = 20;
                z3.j(y3.R(2131231384, g0Var3, 0), (String) null, z1.m(rVar3, f2), j3, g0Var3, 440, 0);
                g0Var3.r(true);
                r rVarD3 = h0.c.D(w50.c.o(n.f(f2.h.c(rVar3, p0.f.a(32)), t.b(((Number) p2VarB.getValue()).floatValue(), j3), o0Var), zBooleanValue, null, onPlayClicked, 6), f2, 12);
                v1 v1VarA3 = t1.a(h0.i.g(8), hVar, g0Var3, 54);
                int iHashCode5 = Long.hashCode(g0Var3.T);
                m1 m1VarM5 = g0Var3.m();
                r rVarC6 = b2.a.c(rVarD3, g0Var3);
                g0Var3.g0();
                if (g0Var3.S) {
                    g0Var3.l(aVar4);
                } else {
                    g0Var3.q0();
                }
                q.I(v1VarA3, g0Var3, fVar);
                q.I(m1VarM5, g0Var3, fVar2);
                a1.b.v(iHashCode5, g0Var3, fVar3, g0Var3, eVar);
                q.I(rVarC6, g0Var3, fVar4);
                r rVarM = z1.m(rVar3, 14);
                m2.b bVarR = y3.R(2131231358, g0Var3, 0);
                long j4 = dl.a.L;
                z3.j(bVarR, (String) null, rVarM, t.b(((Number) p2VarB.getValue()).floatValue(), j4), g0Var3, 440, 0);
                g0 g0Var5 = g0Var3;
                z6.b(z3.U(g0Var3, 2131887115), (r) null, t.b(((Number) p2VarB.getValue()).floatValue(), j4), kh.o.z(16), q3.u.K, (q3.i) null, 0L, (l) null, (x3.k) null, kh.o.z(16), 2, false, 1, 0, (k) null, (r0) null, g0Var5, 1597440, 25008, 239530);
                g0Var = g0Var5;
                g0Var.r(true);
                g0Var.r(true);
                g0Var.r(true);
                g0Var.r(true);
            }
            r1VarT.d = cVar;
        }
        g0Var = g0Var2;
        g0Var.V();
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            cVar = new c(aVar, i, onPlayClicked, onShuffleClicked, rVar, z, i2, 1);
            r1VarT.d = cVar;
        }
    }

    public static final void g(u0 uiState, String playlistDisplayName, k onAction, l1.j jVar, int i) {
        int i2;
        boolean z;
        String strT;
        m.e(uiState, "uiState");
        Collection collection = uiState.e;
        String str = uiState.s;
        m.e(playlistDisplayName, "playlistDisplayName");
        m.e(onAction, "onAction");
        g0 g0Var = (g0) jVar;
        g0Var.e0(2089411512);
        if ((i & 6) == 0) {
            i2 = (g0Var.g(uiState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= g0Var.g(playlistDisplayName) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= g0Var.i(onAction) ? 256 : 128;
        }
        if (g0Var.S(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = uiState.r;
            b2.o oVar = b2.o.A;
            Object obj = l1.i.a;
            if (z2) {
                g0Var.c0(-1302423460);
                r rVarQ = z1.q(oVar, 350);
                String strU = z3.U(g0Var, 2131886425);
                if (str == null) {
                    strT = oi.k.o(g0Var, -1302250108, 2131886426, g0Var, false);
                } else {
                    g0Var.c0(-1302140399);
                    strT = z3.T(2131886424, new Object[]{str}, g0Var);
                    g0Var.r(false);
                }
                String str2 = strT;
                z = (i2 & 896) == 256;
                Object objN = g0Var.N();
                if (z || objN == obj) {
                    objN = new e0(10, onAction);
                    g0Var.n0(objN);
                }
                wr.k.H(strU, str2, (u00.a) objN, rVarQ, 0L, null, null, v1.d.d(565463252, new e(0, onAction), g0Var), g0Var, 12585984, 112);
                g0Var.r(false);
            } else if (uiState.t) {
                g0Var.c0(-1300924889);
                r rVarQ2 = z1.q(oVar, 350);
                String strU2 = z3.U(g0Var, 2131886423);
                String strT2 = z3.T(2131886422, new Object[]{Integer.valueOf(((h00.b) collection).a()), playlistDisplayName}, g0Var);
                z = (i2 & 896) == 256;
                Object objN2 = g0Var.N();
                if (z || objN2 == obj) {
                    objN2 = new e0(12, onAction);
                    g0Var.n0(objN2);
                }
                wr.k.H(strU2, strT2, (u00.a) objN2, rVarQ2, 0L, null, null, v1.d.d(-804477251, new e(1, onAction), g0Var), g0Var, 12585984, 112);
                g0Var.r(false);
            } else if (uiState.q) {
                g0Var.c0(-1299549667);
                r rVarQ3 = z1.q(oVar, 350);
                String strU3 = z3.U(g0Var, 2131886421);
                String strT3 = z3.T(2131886420, new Object[]{Integer.valueOf(((h00.b) collection).a()), playlistDisplayName}, g0Var);
                z = (i2 & 896) == 256;
                Object objN3 = g0Var.N();
                if (z || objN3 == obj) {
                    objN3 = new e0(13, onAction);
                    g0Var.n0(objN3);
                }
                wr.k.H(strU3, strT3, (u00.a) objN3, rVarQ3, 0L, null, null, v1.d.d(-1787470628, new e(2, onAction), g0Var), g0Var, 12585984, 112);
                g0Var.r(false);
            } else {
                g0Var.c0(-1297101814);
                g0Var.r(false);
            }
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new f(i, 0, uiState, playlistDisplayName, onAction);
        }
    }

    public static final void h(dw.a playlist, r rVar, l1.j jVar, int i) {
        m.e(playlist, "playlist");
        String str = playlist.f;
        g0 g0Var = (g0) jVar;
        g0Var.e0(-1092249360);
        int i2 = (g0Var.i(playlist) ? 4 : 2) | i | (g0Var.g(rVar) ? 32 : 16);
        if (!g0Var.S(i2 & 1, (i2 & 19) != 18)) {
            g0Var.V();
        } else if (playlist.c()) {
            g0Var.c0(-528303221);
            a(rVar, g0Var, (i2 >> 3) & 14);
            g0Var.r(false);
        } else if (r30.k.L0(str)) {
            g0Var.c0(-527500879);
            o.a(n.f(rVar, dl.a.q, b0.b), g0Var, 0);
            g0Var.r(false);
        } else {
            g0Var.c0(-528170417);
            wb.h hVar = new wb.h((Context) g0Var.k(c3.o0.b));
            hVar.c = str;
            hVar.q = new xb.e(xb.g.c);
            hVar.s = null;
            hVar.t = null;
            hVar.u = null;
            hVar.b();
            mb.j jVarI = mb.l.i(hVar.a(), (p) null, g0Var, 0, 62);
            n.c(jVarI, (String) null, rd.a.g0(0, 0, dl.a.s, rVar, true ^ (jVarI.j() instanceof mb.g)), (b2.d) null, z2.o.a, 0.0f, g0Var, 24624, 104);
            g0Var.r(false);
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new d(playlist, rVar, i, 1);
        }
    }

    public static final void i(r rVar, l1.j jVar, int i) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(1246991517);
        if (g0Var.S(i & 1, (i & 3) != 2)) {
            boolean z = g0Var.k(dl.e.a) == gm.a.A;
            r rVarD = z1.d(rVar, 1.0f);
            v vVarA = u.a(h0.i.g(12), b2.b.M, g0Var, 6);
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
            q.I(vVarA, g0Var, b3.h.f);
            q.I(m1VarM, g0Var, b3.h.e);
            q.I(Integer.valueOf(iHashCode), g0Var, b3.h.g);
            q.E(g0Var, b3.h.h);
            q.I(rVarC, g0Var, b3.h.d);
            if (z) {
                g0Var.c0(1272685483);
                ox.g.b(g0Var, 0);
            } else {
                g0Var.c0(1272686444);
                d(g0Var, 0);
            }
            g0Var.r(false);
            ox.g.e(z ? 16 : 24, g0Var, 0);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new b(rVar, i, 1);
        }
    }

    public static final void j(qr.r selectedFilter, k onFilterSelected, float f, r rVar, l1.j jVar, int i) {
        m.e(selectedFilter, "selectedFilter");
        m.e(onFilterSelected, "onFilterSelected");
        g0 g0Var = (g0) jVar;
        g0Var.e0(1840678);
        int i2 = i | (g0Var.e(selectedFilter.ordinal()) ? 4 : 2) | (g0Var.i(onFilterSelected) ? 32 : 16) | (g0Var.d(f) ? 256 : 128);
        if (g0Var.S(i2 & 1, (i2 & 1171) != 1170)) {
            r rVarD = z1.d(rVar, 1.0f);
            h0.f fVarG = h0.i.g(12);
            p1 p1VarE = h0.c.e(f, 0.0f, 2);
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object objN = g0Var.N();
            if (z || objN == l1.i.a) {
                objN = new al.l(selectedFilter, onFilterSelected, 2);
                g0Var.n0(objN);
            }
            k00.f.e(rVarD, null, p1VarE, fVarG, null, null, false, null, (k) objN, g0Var, 24576, 490);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new g(selectedFilter, onFilterSelected, f, rVar, i, 0);
        }
    }

    public static final void k(dw.a aVar, int i, u00.a onPlayClicked, u00.a onShuffleClicked, r rVar, boolean z, l1.j jVar, int i2) {
        g0 g0Var;
        r1 r1VarT;
        c cVar;
        b2.d dVar;
        dw.a aVar2;
        String strO;
        long j;
        b2.c cVar2;
        u00.n nVar;
        b3.e eVar;
        int i3;
        u00.n nVar2;
        dw.a aVar3;
        u00.n nVar3;
        b2.d dVar2;
        u00.a aVar4;
        b2.d dVar3 = b2.b.E;
        m.e(onPlayClicked, "onPlayClicked");
        m.e(onShuffleClicked, "onShuffleClicked");
        g0 g0Var2 = (g0) jVar;
        g0Var2.e0(330729635);
        int i4 = i2 | (g0Var2.i(aVar) ? 4 : 2) | (g0Var2.e(i) ? 32 : 16) | (g0Var2.i(onPlayClicked) ? 256 : 128) | (g0Var2.i(onShuffleClicked) ? 2048 : 1024) | (g0Var2.h(z) ? 131072 : 65536);
        if (g0Var2.S(i4 & 1, (74899 & i4) != 74898)) {
            if (aVar == null) {
                r1VarT = g0Var2.t();
                if (r1VarT == null) {
                    return;
                } else {
                    cVar = new c(aVar, i, onPlayClicked, onShuffleClicked, rVar, z, i2, 2);
                }
            } else {
                String str = aVar.e;
                boolean z2 = aVar.g;
                Configuration configuration = (Configuration) g0Var2.k(c3.o0.a);
                kk.c cVarD = kk.e.d(g0Var2);
                boolean zE = g0Var2.e(configuration.screenHeightDp);
                Object objN = g0Var2.N();
                Object obj = l1.i.a;
                if (zE || objN == obj) {
                    objN = q.r(new i(configuration, 0));
                    g0Var2.n0(objN);
                }
                p2 p2Var = (p2) objN;
                boolean z3 = (i4 & 112) == 32;
                Object objN2 = g0Var2.N();
                if (z3 || objN2 == obj) {
                    objN2 = Boolean.valueOf(i > 0);
                    g0Var2.n0(objN2);
                }
                boolean zBooleanValue = ((Boolean) objN2).booleanValue();
                p2 p2VarB = x.d.b(zBooleanValue ? 1.0f : 0.6f, (y) null, (String) null, g0Var2, 0, 30);
                r rVarD = z1.d(rVar, 1.0f);
                long j2 = dl.a.L;
                o0 o0Var = b0.b;
                r rVarF = n.f(rVarD, j2, o0Var);
                v vVarA = u.a(h0.i.c, b2.b.M, g0Var2, 0);
                int iHashCode = Long.hashCode(g0Var2.T);
                m1 m1VarM = g0Var2.m();
                r rVarC = b2.a.c(rVarF, g0Var2);
                b3.i.c.getClass();
                u00.a aVar5 = b3.h.b;
                g0Var2.g0();
                if (g0Var2.S) {
                    g0Var2.l(aVar5);
                } else {
                    g0Var2.q0();
                }
                u00.n nVar4 = b3.h.f;
                q.I(vVarA, g0Var2, nVar4);
                u00.n nVar5 = b3.h.e;
                q.I(m1VarM, g0Var2, nVar5);
                Integer numValueOf = Integer.valueOf(iHashCode);
                b3.f fVar = b3.h.g;
                q.I(numValueOf, g0Var2, fVar);
                b3.e eVar2 = b3.h.h;
                q.E(g0Var2, eVar2);
                u00.n nVar6 = b3.h.d;
                q.I(rVarC, g0Var2, nVar6);
                b2.o oVar = b2.o.A;
                r rVarD2 = z1.d(oVar, 1.0f);
                b2.i iVar = b2.b.H;
                w0 w0VarD = o.d(iVar, false);
                int iHashCode2 = Long.hashCode(g0Var2.T);
                m1 m1VarM2 = g0Var2.m();
                r rVarC2 = b2.a.c(rVarD2, g0Var2);
                g0Var2.g0();
                if (g0Var2.S) {
                    g0Var2.l(aVar5);
                } else {
                    g0Var2.q0();
                }
                q.I(w0VarD, g0Var2, nVar4);
                q.I(m1VarM2, g0Var2, nVar5);
                a1.b.v(iHashCode2, g0Var2, fVar, g0Var2, eVar2);
                q.I(rVarC2, g0Var2, nVar6);
                r rVarE = z1.e(z1.d(oVar, 1.0f), ((y3.f) p2Var.getValue()).A);
                w0 w0VarD2 = o.d(b2.b.A, false);
                int iHashCode3 = Long.hashCode(g0Var2.T);
                m1 m1VarM3 = g0Var2.m();
                r rVarC3 = b2.a.c(rVarE, g0Var2);
                g0Var2.g0();
                if (g0Var2.S) {
                    g0Var2.l(aVar5);
                } else {
                    g0Var2.q0();
                }
                q.I(w0VarD2, g0Var2, nVar4);
                q.I(m1VarM3, g0Var2, nVar5);
                a1.b.v(iHashCode3, g0Var2, fVar, g0Var2, eVar2);
                q.I(rVarC3, g0Var2, nVar6);
                a0 a0Var = z1.c;
                h(aVar, kk.e.a(a0Var, cVarD), g0Var2, 8);
                s sVar = s.a;
                boolean z4 = zBooleanValue;
                bi.b.e(cVarD, j2, sVar.a(oVar, iVar).V(a0Var), 1.0f, 32.0f, g0Var2, 27648);
                if (aVar.c()) {
                    g0Var2.c0(737795787);
                    dVar = dVar3;
                    b(sVar.a(oVar, dVar), g0Var2, 0);
                    g0Var2.r(false);
                } else {
                    dVar = dVar3;
                    g0Var2.c0(737939937);
                    g0Var2.r(false);
                }
                g0Var2.r(true);
                float f = 32;
                float f2 = 16;
                r rVarG = h0.c.G(h0.c.A(oVar, 0.0f, f, 1), f2, 0.0f, f2, f2, 2);
                b2.c cVar3 = b2.b.N;
                float f3 = 8;
                v vVarA2 = u.a(h0.i.g(f3), cVar3, g0Var2, 54);
                int iHashCode4 = Long.hashCode(g0Var2.T);
                m1 m1VarM4 = g0Var2.m();
                r rVarC4 = b2.a.c(rVarG, g0Var2);
                g0Var2.g0();
                if (g0Var2.S) {
                    g0Var2.l(aVar5);
                } else {
                    g0Var2.q0();
                }
                q.I(vVarA2, g0Var2, nVar4);
                q.I(m1VarM4, g0Var2, nVar5);
                a1.b.v(iHashCode4, g0Var2, fVar, g0Var2, eVar2);
                q.I(rVarC4, g0Var2, nVar6);
                if (z2) {
                    strO = oi.k.o(g0Var2, 349079950, 2131887117, g0Var2, false);
                    aVar2 = aVar;
                } else {
                    g0Var2.c0(349182963);
                    g0Var2.r(false);
                    aVar2 = aVar;
                    strO = aVar2.c;
                }
                long j3 = dl.a.i;
                z6.b(strO, (r) null, j3, kh.o.z(28), q3.u.D, (q3.i) null, 0L, (l) null, new x3.k(3), kh.o.z(28), 0, false, 0, 0, (k) null, (r0) null, g0Var2, 1597440, 48, 258986);
                if (z2) {
                    g0Var2.c0(349545167);
                    i3 = 16;
                    eVar = eVar2;
                    cVar2 = cVar3;
                    j = j2;
                    nVar = nVar6;
                    aVar3 = aVar;
                    l(aVar3, dl.a.k, z1.d(oVar, 1.0f), 0.0f, 0L, 0L, 3, g0Var2, 392, 56);
                    g0Var = g0Var2;
                    g0Var.r(false);
                    onShuffleClicked = onShuffleClicked;
                    nVar2 = nVar5;
                    aVar4 = aVar5;
                    nVar3 = nVar4;
                    dVar2 = dVar;
                    z4 = z4;
                } else {
                    b2.d dVar4 = dVar;
                    j = j2;
                    cVar2 = cVar3;
                    nVar = nVar6;
                    eVar = eVar2;
                    g0Var = g0Var2;
                    i3 = 16;
                    nVar2 = nVar5;
                    aVar3 = aVar2;
                    g0Var.c0(349896676);
                    String str2 = aVar3.d;
                    if (r30.k.L0(str2)) {
                        str2 = null;
                    }
                    if (str2 == null) {
                        g0Var.c0(349896675);
                        g0Var.r(false);
                        aVar4 = aVar5;
                        nVar3 = nVar4;
                        dVar2 = dVar4;
                    } else {
                        g0Var.c0(349896676);
                        nVar3 = nVar4;
                        dVar2 = dVar4;
                        String str3 = str2;
                        aVar4 = aVar5;
                        z6.b(str3, (r) null, dl.a.k, kh.o.z(16), q3.u.B, (q3.i) null, 0L, (l) null, new x3.k(3), kh.o.z(16), 0, false, 0, 0, (k) null, (r0) null, g0Var, 1597440, 48, 258986);
                        g0Var.r(false);
                    }
                    g0Var.r(false);
                }
                r rVarG2 = h0.c.G(n.f(z1.d(oVar, 1.0f), aVar3.c() ? j : t.f, o0Var), 0.0f, f3, 0.0f, 0.0f, 13);
                h0.f fVarH = h0.i.h(f2, cVar2);
                b2.h hVar = b2.b.K;
                v1 v1VarA = t1.a(fVarH, hVar, g0Var, 54);
                b2.d dVar5 = dVar2;
                int iHashCode5 = Long.hashCode(g0Var.T);
                m1 m1VarM5 = g0Var.m();
                r rVarC5 = b2.a.c(rVarG2, g0Var);
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(aVar4);
                } else {
                    g0Var.q0();
                }
                q.I(v1VarA, g0Var, nVar3);
                q.I(m1VarM5, g0Var, nVar2);
                b3.e eVar3 = eVar;
                a1.b.v(iHashCode5, g0Var, fVar, g0Var, eVar3);
                u00.n nVar7 = nVar;
                q.I(rVarC5, g0Var, nVar7);
                r rVarO = w50.c.o(n.f(f2.h.c(z1.m(oVar, 44), p0.f.a), t.b(0.18f, j3), o0Var), false, null, onShuffleClicked, 7);
                w0 w0VarD3 = o.d(dVar5, false);
                int iHashCode6 = Long.hashCode(g0Var.T);
                m1 m1VarM6 = g0Var.m();
                r rVarC6 = b2.a.c(rVarO, g0Var);
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(aVar4);
                } else {
                    g0Var.q0();
                }
                q.I(w0VarD3, g0Var, nVar3);
                q.I(m1VarM6, g0Var, nVar2);
                a1.b.v(iHashCode6, g0Var, fVar, g0Var, eVar3);
                q.I(rVarC6, g0Var, nVar7);
                float f4 = 20;
                u00.n nVar8 = nVar3;
                u00.a aVar6 = aVar4;
                u00.n nVar9 = nVar2;
                z3.j(y3.R(2131231384, g0Var, 0), (String) null, z1.m(oVar, f4), j3, g0Var, 440, 0);
                g0Var.r(true);
                r rVarD3 = h0.c.D(w50.c.o(n.f(f2.h.c(oVar, p0.f.a(f)), t.b(((Number) p2VarB.getValue()).floatValue(), j3), o0Var), z4, null, onPlayClicked, 6), f4, 12);
                v1 v1VarA2 = t1.a(h0.i.g(f3), hVar, g0Var, 54);
                int iHashCode7 = Long.hashCode(g0Var.T);
                m1 m1VarM7 = g0Var.m();
                r rVarC7 = b2.a.c(rVarD3, g0Var);
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(aVar6);
                } else {
                    g0Var.q0();
                }
                q.I(v1VarA2, g0Var, nVar8);
                q.I(m1VarM7, g0Var, nVar9);
                a1.b.v(iHashCode7, g0Var, fVar, g0Var, eVar3);
                q.I(rVarC7, g0Var, nVar7);
                long j4 = j;
                z3.j(y3.R(2131231358, g0Var, 0), (String) null, z1.m(oVar, 14), t.b(((Number) p2VarB.getValue()).floatValue(), j4), g0Var, 440, 0);
                z6.b(z3.U(g0Var, 2131887115), (r) null, t.b(((Number) p2VarB.getValue()).floatValue(), j4), kh.o.z(i3), q3.u.K, (q3.i) null, 0L, (l) null, (x3.k) null, kh.o.z(i3), 2, false, 1, 0, (k) null, (r0) null, g0Var, 1597440, 25008, 239530);
                g0Var.r(true);
                g0Var.r(true);
                g0Var.r(true);
                g0Var.r(true);
                h0.c.h(z1.e(oVar, f), g0Var);
                if (r30.k.L0(str) || z) {
                    g0Var.c0(1242762325);
                    g0Var.r(false);
                } else {
                    g0Var.c0(1242122950);
                    r rVarD4 = z1.d(oVar, 1.0f);
                    if (!aVar.c()) {
                        j4 = t.f;
                    }
                    z6.b(str, h0.c.G(n.f(rVarD4, j4, o0Var), f2, f3, f2, 0.0f, 8), t.b(0.5f, j3), kh.o.z(13), q3.u.B, (q3.i) null, 0L, (l) null, (x3.k) null, kh.o.z(18), 2, false, 3, 0, (k) null, (r0) null, g0Var, 1597440, 25008, 239528);
                    g0Var.r(false);
                }
                g0Var.r(true);
            }
            r1VarT.d = cVar;
        }
        g0Var = g0Var2;
        g0Var.V();
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            cVar = new c(aVar, i, onPlayClicked, onShuffleClicked, rVar, z, i2, 3);
            r1VarT.d = cVar;
        }
    }

    public static final void l(final dw.a playlist, final long j, final r rVar, float f, long j2, long j3, int i, l1.j jVar, final int i2, final int i3) {
        int i4;
        int i5;
        boolean z;
        final long j4;
        final int i6;
        l1.j jVar2;
        final long j5;
        final float f2;
        r1 r1VarT;
        int i7;
        float f3;
        long j6;
        long j7;
        String strA;
        String strB;
        Context context;
        boolean zG;
        Object objN;
        mb.j jVarI;
        b3.g gVar;
        int i8;
        m.e(playlist, "playlist");
        l1.j jVar3 = (g0) jVar;
        jVar3.e0(-249484445);
        int i9 = i2 | (jVar3.i(playlist) ? 4 : 2) | (jVar3.f(j) ? 32 : 16) | 224256;
        if ((i3 & 64) == 0) {
            i4 = i;
            int i11 = jVar3.e(i4) ? 1048576 : 524288;
            i5 = i9 | i11;
            if ((599187 & i5) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (jVar3.S(i5 & 1, z)) {
                jVar3.X();
                if ((i2 & 1) != 0 || jVar3.A()) {
                    float f4 = 24;
                    long jZ = kh.o.z(16);
                    long jZ2 = kh.o.z(16);
                    if ((i3 & 64) != 0) {
                        i5 &= -3670017;
                        i4 = 5;
                    }
                    i7 = i5;
                    f3 = f4;
                    j6 = jZ2;
                    j7 = jZ;
                } else {
                    jVar3.V();
                    if ((i3 & 64) != 0) {
                        i5 &= -3670017;
                    }
                    j7 = j2;
                    j6 = j3;
                    i7 = i5;
                    f3 = f;
                }
                jVar3.s();
                strA = playlist.a();
                if (strA == null) {
                    strA = playlist.c;
                }
                String str = strA;
                strB = playlist.b();
                context = (Context) jVar3.k(c3.o0.b);
                zG = jVar3.g(strB) | jVar3.g(context);
                objN = jVar3.N();
                if (zG || objN == l1.i.a) {
                    wb.h hVar = new wb.h(context);
                    hVar.c = strB;
                    hVar.b();
                    objN = hVar.a();
                    jVar3.n0(objN);
                }
                jVarI = mb.l.i((wb.i) objN, (p) null, jVar3, 0, 62);
                h0.b bVar = h0.i.a;
                v1 v1VarA = t1.a(h0.i.h(8, b2.b.N), b2.b.K, jVar3, 54);
                int iHashCode = Long.hashCode(((g0) jVar3).T);
                m1 m1VarM = jVar3.m();
                r rVarC = b2.a.c(rVar, jVar3);
                b3.i.c.getClass();
                gVar = b3.h.b;
                jVar3.g0();
                if (((g0) jVar3).S) {
                    jVar3.l(gVar);
                } else {
                    jVar3.q0();
                }
                q.I(v1VarA, jVar3, b3.h.f);
                q.I(m1VarM, jVar3, b3.h.e);
                q.I(Integer.valueOf(iHashCode), jVar3, b3.h.g);
                q.E(jVar3, b3.h.h);
                q.I(rVarC, jVar3, b3.h.d);
                if (strB != null) {
                    jVar3.c0(-1167181944);
                    i8 = i4;
                    n.c(jVarI, (String) null, rd.a.g0(f3 / 2, 0, dl.a.s, f2.h.c(z1.m(b2.o.A, f3), p0.f.a), !(jVarI.j() instanceof mb.g)), (b2.d) null, z2.o.a, 0.0f, jVar3, 24624, 104);
                    jVar3.r(false);
                } else {
                    i8 = i4;
                    jVar3.c0(-1166692485);
                    jVar3.r(false);
                }
                jVar2 = jVar3;
                j4 = j7;
                long j8 = j6;
                f = f3;
                z6.b(str, (r) null, j, j4, q3.u.B, (q3.i) null, 0L, (l) null, new x3.k(i8), j8, 2, false, 1, 0, (k) null, (r0) null, jVar2, ((i7 << 3) & 896) | 1597440, ((i7 >> 18) & 14) | 25008, 238506);
                jVar2.r(true);
                j5 = j8;
                i6 = i8;
            } else {
                jVar3.V();
                j4 = j2;
                i6 = i4;
                jVar2 = jVar3;
                j5 = j3;
            }
            f2 = f;
            r1VarT = jVar2.t();
            if (r1VarT != null) {
                r1VarT.d = new u00.n(j, rVar, f2, j4, j5, i6, i2, i3) {
                    public final long B;
                    public final r C;
                    public final float D;
                    public final long E;
                    public final long F;
                    public final int G;
                    public final int H;

                    {
                        this.H = i3;
                    }

                    @Override
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iK = q.K(393);
                        a.l(this.A, this.B, this.C, this.D, this.E, this.F, this.G, (l1.j) obj, iK, this.H);
                        return g00.b0.a;
                    }
                };
            }
        }
        i4 = i;
        i5 = i9 | i11;
        if ((599187 & i5) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (jVar3.S(i5 & 1, z)) {
            jVar3.X();
            if ((i2 & 1) != 0) {
                float f5 = 24;
                long jZ3 = kh.o.z(16);
                long jZ4 = kh.o.z(16);
                if ((i3 & 64) != 0) {
                    i5 &= -3670017;
                    i4 = 5;
                }
                i7 = i5;
                f3 = f5;
                j6 = jZ4;
                j7 = jZ3;
            } else {
                float f6 = 24;
                long jZ5 = kh.o.z(16);
                long jZ6 = kh.o.z(16);
                if ((i3 & 64) != 0) {
                    i5 &= -3670017;
                    i4 = 5;
                }
                i7 = i5;
                f3 = f6;
                j6 = jZ6;
                j7 = jZ5;
            }
            jVar3.s();
            strA = playlist.a();
            if (strA == null) {
                strA = playlist.c;
            }
            String str2 = strA;
            strB = playlist.b();
            context = (Context) jVar3.k(c3.o0.b);
            zG = jVar3.g(strB) | jVar3.g(context);
            objN = jVar3.N();
            if (zG) {
                wb.h hVar2 = new wb.h(context);
                hVar2.c = strB;
                hVar2.b();
                objN = hVar2.a();
                jVar3.n0(objN);
            } else {
                wb.h hVar3 = new wb.h(context);
                hVar3.c = strB;
                hVar3.b();
                objN = hVar3.a();
                jVar3.n0(objN);
            }
            jVarI = mb.l.i((wb.i) objN, (p) null, jVar3, 0, 62);
            h0.b bVar2 = h0.i.a;
            v1 v1VarA2 = t1.a(h0.i.h(8, b2.b.N), b2.b.K, jVar3, 54);
            int iHashCode2 = Long.hashCode(((g0) jVar3).T);
            m1 m1VarM2 = jVar3.m();
            r rVarC2 = b2.a.c(rVar, jVar3);
            b3.i.c.getClass();
            gVar = b3.h.b;
            jVar3.g0();
            if (((g0) jVar3).S) {
                jVar3.l(gVar);
            } else {
                jVar3.q0();
            }
            q.I(v1VarA2, jVar3, b3.h.f);
            q.I(m1VarM2, jVar3, b3.h.e);
            q.I(Integer.valueOf(iHashCode2), jVar3, b3.h.g);
            q.E(jVar3, b3.h.h);
            q.I(rVarC2, jVar3, b3.h.d);
            if (strB != null) {
                jVar3.c0(-1167181944);
                i8 = i4;
                n.c(jVarI, (String) null, rd.a.g0(f3 / 2, 0, dl.a.s, f2.h.c(z1.m(b2.o.A, f3), p0.f.a), !(jVarI.j() instanceof mb.g)), (b2.d) null, z2.o.a, 0.0f, jVar3, 24624, 104);
                jVar3.r(false);
            } else {
                i8 = i4;
                jVar3.c0(-1166692485);
                jVar3.r(false);
            }
            jVar2 = jVar3;
            j4 = j7;
            long j9 = j6;
            f = f3;
            z6.b(str2, (r) null, j, j4, q3.u.B, (q3.i) null, 0L, (l) null, new x3.k(i8), j9, 2, false, 1, 0, (k) null, (r0) null, jVar2, ((i7 << 3) & 896) | 1597440, ((i7 >> 18) & 14) | 25008, 238506);
            jVar2.r(true);
            j5 = j9;
            i6 = i8;
        } else {
            jVar3.V();
            j4 = j2;
            i6 = i4;
            jVar2 = jVar3;
            j5 = j3;
        }
        f2 = f;
        r1VarT = jVar2.t();
        if (r1VarT != null) {
            r1VarT.d = new u00.n(j, rVar, f2, j4, j5, i6, i2, i3) {
                public final long B;
                public final r C;
                public final float D;
                public final long E;
                public final long F;
                public final int G;
                public final int H;

                {
                    this.H = i3;
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iK = q.K(393);
                    a.l(this.A, this.B, this.C, this.D, this.E, this.F, this.G, (l1.j) obj, iK, this.H);
                    return g00.b0.a;
                }
            };
        }
    }
}
