package mx;

import android.content.Context;
import b2.d;
import b2.i;
import b2.r;
import b3.f;
import b3.g;
import b3.h;
import c3.o0;
import com.google.android.gms.internal.measurement.y3;
import dl.e;
import g1.o3;
import g1.z6;
import h0.a0;
import h0.m2;
import h0.o;
import h0.s;
import h0.t0;
import h0.t1;
import h0.u;
import h0.v;
import h0.v1;
import h0.z1;
import i2.b0;
import i2.t;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.jvm.internal.m;
import l1.g0;
import l1.j;
import l1.m1;
import l1.q;
import l1.r1;
import m3.r0;
import qd.s0;
import x3.k;
import x3.l;
import z.n;
import z2.p;
import z2.w0;

public abstract class a {
    public static final v1.c a = new v1.c(new lu.a(9), -2127917393, false);

    public static final void a(bx.c cVar, u00.a aVar, j jVar, int i) {
        r rVar;
        u00.a aVar2 = aVar;
        g0 g0Var = (g0) jVar;
        g0Var.e0(357910785);
        int i2 = i | (g0Var.i(cVar) ? 4 : 2) | (g0Var.i(aVar2) ? 32 : 16);
        if (g0Var.S(i2 & 1, (i2 & 19) != 18)) {
            boolean z = g0Var.k(e.a) == gm.a.A;
            kk.c cVarD = kk.e.d(g0Var);
            rm.a aVarD0 = w50.c.d0(g0Var);
            WeakHashMap weakHashMap = m2.w;
            t0 t0VarL = h0.c.l(h0.b.e(g0Var).g, g0Var);
            float f = z ? 76 : 120;
            float f2 = z ? 16 : 32;
            a0 a0Var = z1.c;
            i iVar = b2.b.A;
            w0 w0VarD = o.d(iVar, false);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            r rVarC = b2.a.c(a0Var, g0Var);
            b3.i.c.getClass();
            g gVar = h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            f fVar = h.f;
            q.I(w0VarD, g0Var, fVar);
            f fVar2 = h.e;
            q.I(m1VarM, g0Var, fVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            f fVar3 = h.g;
            q.I(numValueOf, g0Var, fVar3);
            b3.e eVar = h.h;
            q.E(g0Var, eVar);
            f fVar4 = h.d;
            q.I(rVarC, g0Var, fVar4);
            String str = cVar.e;
            u30.b bVar = cVar.l;
            String str2 = cVar.i;
            g(str, g0Var, 0);
            r rVarE = h0.c.E(h0.c.G(n.p(kk.e.a(a0Var, cVarD), n.l(g0Var), false, 14), 0.0f, t0VarL.c() + 56, 0.0f, t0VarL.a() + 40, 5), f2, 0.0f, 2);
            v vVarA = u.a(h0.i.g(12), b2.b.N, g0Var, 54);
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
            b(cVar.e, f, g0Var, 0);
            String str3 = cVar.b;
            long j = dl.a.i;
            z6.b(str3, (r) null, j, kh.o.z(z ? 20 : 26), q3.u.L, (q3.i) null, 0L, (l) null, new k(3), z ? kh.o.z(24) : kh.o.z(30), 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 1572864, 0, 258986);
            g0 g0Var2 = g0Var;
            if (str2.length() > 0) {
                g0Var2.c0(-1500815606);
                c(cVar.h, str2, g0Var2, 0);
                g0Var2.r(false);
            } else {
                g0Var2.c0(-1500643587);
                g0Var2.r(false);
            }
            if (bVar.isEmpty()) {
                g0Var2.c0(-1500308291);
                g0Var2.r(false);
            } else {
                g0Var2.c0(-1500583137);
                boolean zI = g0Var2.i(aVarD0);
                Object objN = g0Var2.N();
                if (zI || objN == l1.i.a) {
                    objN = new c(aVarD0, 0);
                    g0Var2.n0(objN);
                }
                f(bVar, (u00.k) objN, g0Var2, 0);
                g0Var2.r(false);
            }
            int length = cVar.g.length();
            r rVar2 = b2.o.A;
            if (length > 0) {
                g0Var2.c0(-1500235751);
                rVar = rVar2;
                z6.b(cVar.g, h0.c.G(z1.d(rVar2, 1.0f), 0.0f, 24, 0.0f, 0.0f, 13), j, kh.o.z(15), q3.u.J, (q3.i) null, 0L, (l) null, (k) null, kh.o.z(22), 0, false, 0, 0, (u00.k) null, (r0) null, g0Var2, 1597488, 48, 260008);
                g0Var2 = g0Var2;
                g0Var2.r(false);
            } else {
                rVar = rVar2;
                g0Var2.c0(-1499879747);
                g0Var2.r(false);
            }
            g0Var2.r(true);
            float fC = 16;
            r rVarE2 = h0.c.E(rVar, fC, 0.0f, 2);
            if (z) {
                fC = t0VarL.c();
            }
            aVar2 = aVar;
            g0 g0Var3 = g0Var2;
            w50.c.f(aVar2, cVarD, s.a.a(h0.c.G(rVarE2, 0.0f, fC, 0.0f, 0.0f, 13), iVar), false, false, 0.0f, new y3.f(44), 0L, t.b(0.5f, dl.a.P), 10.0f, p0.f.a, 0, a, g0Var3, ((i2 >> 3) & 14) | 806879232, 432, 184);
            g0Var = g0Var3;
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new l0.g0(cVar, aVar2, i, 9);
        }
    }

    public static final void b(String str, float f, j jVar, int i) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(759949382);
        int i2 = (g0Var.g(str) ? 4 : 2) | i | (g0Var.d(f) ? 32 : 16);
        if (g0Var.S(i2 & 1, (i2 & 19) != 18)) {
            wb.h hVar = new wb.h((Context) g0Var.k(o0.b));
            hVar.c = str.length() > 0 ? str : null;
            mb.j jVarI = mb.l.i(w.c.q(hVar, 1200), (p) null, g0Var, 0, 62);
            r rVarM = z1.m(b2.o.A, f);
            p0.e eVar = p0.f.a;
            r rVarC = f2.h.c(rVarM, eVar);
            long j = dl.a.s;
            r rVarG0 = rd.a.g0(f, 0, j, n.g(n.f(rVarC, j, b0.b), 1, t.b(0.08f, dl.a.i), eVar), !(jVarI.j() instanceof mb.g) && str.length() > 0);
            w0 w0VarD = o.d(b2.b.E, false);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            r rVarC2 = b2.a.c(rVarG0, g0Var);
            b3.i.c.getClass();
            g gVar = h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            q.I(w0VarD, g0Var, h.f);
            q.I(m1VarM, g0Var, h.e);
            q.I(Integer.valueOf(iHashCode), g0Var, h.g);
            q.E(g0Var, h.h);
            q.I(rVarC2, g0Var, h.d);
            n.c(jVarI, (String) null, z1.c, (d) null, z2.o.a, 0.0f, g0Var, 25008, 104);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new kn.d(str, f, i, 1);
        }
    }

    public static final void c(String str, String str2, j jVar, int i) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(292282252);
        int i2 = i | (g0Var.g(str) ? 4 : 2) | (g0Var.g(str2) ? 32 : 16);
        if (g0Var.S(i2 & 1, (i2 & 19) != 18)) {
            Context context = (Context) g0Var.k(o0.b);
            String strA = new xm.a(context).a(str);
            v1 v1VarA = t1.a(h0.i.g(8), b2.b.K, g0Var, 54);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.o oVar = b2.o.A;
            r rVarC = b2.a.c(oVar, g0Var);
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
            q.I(rVarC, g0Var, h.d);
            if (strA == null || strA.length() == 0) {
                g0Var.c0(-906555790);
                g0Var.r(false);
            } else {
                g0Var.c0(-906972213);
                r rVarC2 = f2.h.c(z1.m(oVar, 16), p0.f.a);
                wb.h hVar = new wb.h(context);
                hVar.c = "file:///android_asset/".concat(strA);
                hVar.b();
                mb.l.d(hVar.a(), rVarC2, (v1.c) null, z2.o.b, g0Var, 48, 129016);
                g0Var.r(false);
            }
            z6.b(str2, (r) null, dl.a.i, kh.o.z(15), q3.u.J, (q3.i) null, 0L, (l) null, (k) null, kh.o.z(20), 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, ((i2 >> 3) & 14) | 1597440, 48, 260010);
            g0Var = g0Var;
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new cz.d(i, 1, str, str2);
        }
    }

    public static final void d(final bx.c cVar, final boolean z, final u00.a onDismiss, j jVar, final int i) {
        r1 r1VarT;
        u00.n nVar;
        m.e(onDismiss, "onDismiss");
        g0 g0Var = (g0) jVar;
        g0Var.e0(-1648960260);
        int i2 = (g0Var.i(cVar) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= g0Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= g0Var.i(onDismiss) ? 256 : 128;
        }
        if (g0Var.S(i2 & 1, (i2 & 147) != 146)) {
            if (!z || cVar == null) {
                r1VarT = g0Var.t();
                if (r1VarT == null) {
                    return;
                }
                final int i3 = 0;
                nVar = new u00.n() {
                    @Override
                    public final Object invoke(Object obj, Object obj2) {
                        int i4 = i3;
                        j jVar2 = (j) obj;
                        ((Integer) obj2).getClass();
                        switch (i4) {
                            case 0:
                                a.d(cVar, z, onDismiss, jVar2, q.K(i | 1));
                                break;
                            default:
                                a.d(cVar, z, onDismiss, jVar2, q.K(i | 1));
                                break;
                        }
                        return g00.b0.a;
                    }
                };
            } else {
                boolean z2 = g0Var.k(e.a) == gm.a.A;
                s0.G(onDismiss, new c4.v(false, false, false, !z2, 231), v1.d.d(-1384843003, new dn.i(3, cVar, onDismiss, z2), g0Var), g0Var, ((i2 >> 6) & 14) | 384, 0);
            }
            r1VarT.d = nVar;
        }
        g0Var.V();
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            final int i4 = 1;
            nVar = new u00.n() {
                @Override
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = i4;
                    j jVar2 = (j) obj;
                    ((Integer) obj2).getClass();
                    switch (i5) {
                        case 0:
                            a.d(cVar, z, onDismiss, jVar2, q.K(i | 1));
                            break;
                        default:
                            a.d(cVar, z, onDismiss, jVar2, q.K(i | 1));
                            break;
                    }
                    return g00.b0.a;
                }
            };
            r1VarT.d = nVar;
        }
    }

    public static final void e(bx.e eVar, u00.a aVar, j jVar, int i) {
        String str;
        g0 g0Var = (g0) jVar;
        g0Var.e0(1666113194);
        int i2 = (g0Var.g(eVar) ? 4 : 2) | i | (g0Var.i(aVar) ? 32 : 16);
        if (g0Var.S(i2 & 1, (i2 & 19) != 18)) {
            String lowerCase = eVar.a.toLowerCase(Locale.ROOT);
            m.d(lowerCase, "toLowerCase(...)");
            int i3 = 2131231422;
            switch (lowerCase.hashCode()) {
                case -1337936983:
                    if (lowerCase.equals("threads")) {
                        i3 = 2131231397;
                    }
                    break;
                case -916346253:
                    if (lowerCase.equals("twitter")) {
                        i3 = 2131231405;
                    }
                    break;
                case -873713414:
                    if (lowerCase.equals("tiktok")) {
                        i3 = 2131231398;
                    }
                    break;
                case -485371922:
                    str = "homepage";
                    lowerCase.equals(str);
                    break;
                case 120:
                    if (lowerCase.equals("x")) {
                        i3 = 2131231405;
                    }
                    break;
                case 3260:
                    if (lowerCase.equals("fb")) {
                        i3 = 2131231130;
                    }
                    break;
                case 3358:
                    if (lowerCase.equals("ig")) {
                        i3 = 2131231182;
                    }
                    break;
                case 116079:
                    str = "url";
                    lowerCase.equals(str);
                    break;
                case 117588:
                    str = "web";
                    lowerCase.equals(str);
                    break;
                case 3343799:
                    if (lowerCase.equals("mail")) {
                        i3 = 2131231125;
                    }
                    break;
                case 3530567:
                    str = "site";
                    lowerCase.equals(str);
                    break;
                case 28903346:
                    if (lowerCase.equals("instagram")) {
                        i3 = 2131231182;
                    }
                    break;
                case 96619420:
                    if (lowerCase.equals("email")) {
                        i3 = 2131231125;
                    }
                    break;
                case 497130182:
                    if (lowerCase.equals("facebook")) {
                        i3 = 2131231130;
                    }
                    break;
                case 1224335515:
                    str = "website";
                    lowerCase.equals(str);
                    break;
            }
            p0.e eVarA = p0.f.a(32);
            b2.o oVar = b2.o.A;
            r rVarC = f2.h.c(oVar, eVarA);
            long j = dl.a.i;
            r rVarD = h0.c.D(w50.c.o(n.f(rVarC, t.b(0.15f, j), b0.b), false, null, aVar, 7), 12, 6);
            v1 v1VarA = t1.a(h0.i.g(4), b2.b.K, g0Var, 54);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            r rVarC2 = b2.a.c(rVarD, g0Var);
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
            o3.a(y3.R(i3, g0Var, 0), (String) null, z1.m(oVar, 16), j, g0Var, 440, 0);
            z6.b(eVar.c, (r) null, j, kh.o.z(12), q3.u.K, (q3.i) null, 0L, (l) null, (k) null, kh.o.z(16), 0, false, 1, 0, (u00.k) null, (r0) null, g0Var, 1597440, 24624, 243626);
            g0Var = g0Var;
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new l0.g0(eVar, aVar, i, 8);
        }
    }

    public static final void f(u30.b bVar, u00.k kVar, j jVar, int i) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(1511892395);
        int i2 = (g0Var.g(bVar) ? 4 : 2) | i | (g0Var.i(kVar) ? 32 : 16);
        if (g0Var.S(i2 & 1, (i2 & 19) != 18)) {
            r rVarD = z1.d(b2.o.A, 1.0f);
            h0.b bVar2 = h0.i.a;
            float f = 8;
            h0.c.b(rVarD, h0.i.h(f, b2.b.N), h0.i.g(f), (b2.h) null, 0, 0, v1.d.d(597373798, new c0.f(bVar, kVar, 14), g0Var), g0Var, 1573302);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new l0.g0(bVar, kVar, i, 10);
        }
    }

    public static final void g(String str, j jVar, int i) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(-1557196767);
        int i2 = (g0Var.g(str) ? 4 : 2) | i;
        if (g0Var.S(i2 & 1, (i2 & 3) != 2)) {
            a0 a0Var = z1.c;
            w0 w0VarD = o.d(b2.b.A, false);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            r rVarC = b2.a.c(a0Var, g0Var);
            b3.i.c.getClass();
            g gVar = h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            q.I(w0VarD, g0Var, h.f);
            q.I(m1VarM, g0Var, h.e);
            q.I(Integer.valueOf(iHashCode), g0Var, h.g);
            q.E(g0Var, h.h);
            q.I(rVarC, g0Var, h.d);
            wb.h hVar = new wb.h((Context) g0Var.k(o0.b));
            hVar.c = str.length() > 0 ? str : null;
            mb.j jVarI = mb.l.i(w.c.q(hVar, 1200), (p) null, g0Var, 0, 62);
            if (str.length() > 0) {
                g0Var.c0(153173645);
                n.c(jVarI, (String) null, f2.h.b(a0Var, 150, b0.b), (d) null, z2.o.a, 0.7f, g0Var, 221616, 72);
                g0Var.r(false);
            } else {
                g0Var.c0(153473787);
                g0Var.r(false);
            }
            long j = dl.a.L;
            o.a(n.e(a0Var, sg.f.P(va.a.S(new t[]{new t(t.b(0.0f, j)), new t(t.b(0.35f, j)), new t(t.b(0.7f, j))}), 0.0f, 0.0f, 14), (i2.t0) null, 6), g0Var, 0);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new eu.n(str, i, 7);
        }
    }
}
