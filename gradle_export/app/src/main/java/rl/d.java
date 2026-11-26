package rl;

import ab.a0;
import b2.r;
import b3.f;
import b3.g;
import b3.h;
import c3.g3;
import c3.o1;
import c4.c0;
import com.google.android.gms.internal.measurement.y3;
import d0.l3;
import d0.o2;
import g1.o3;
import g1.z6;
import h0.c1;
import h0.i;
import h0.t1;
import h0.u;
import h0.v;
import h0.v1;
import h0.z1;
import i2.b0;
import i2.t;
import kh.o;
import kotlin.jvm.internal.m;
import l1.e1;
import l1.g0;
import l1.j;
import l1.m1;
import l1.p2;
import l1.q;
import l1.r1;
import l1.z0;
import m3.r0;
import u00.k;
import x.k0;
import x.k1;
import x.n1;
import x.q1;
import x3.l;
import z.n;
import z2.d0;
import z2.w0;

public abstract class d {
    public static final float c;
    public static final float d;
    public static final float e;
    public static final float f;
    public static final float h;
    public static final float i;
    public static final float m;
    public static final float a = 358;
    public static final float b = 20;
    public static final float g = 14;
    public static final float j = 4;
    public static final float k = 18;
    public static final float l = 9;
    public static final long n = o.z(16);
    public static final long o = o.z(13);
    public static final long p = o.y(0.5d);

    static {
        float f2 = 16;
        c = f2;
        float f3 = 12;
        d = f3;
        float f4 = 44;
        e = f4;
        float f5 = 24;
        f = f5;
        float f6 = 2;
        float f7 = (f3 * f6) + (f2 * f6) + f4 + f5;
        float f8 = 1;
        h = f7 + f8;
        i = f2;
        m = f8;
    }

    public static final void a(m2.b bVar, String str, String str2, String str3, u00.a aVar, boolean z, k kVar, r rVar, j jVar, int i2) {
        k kVar2;
        g0 g0Var = (g0) jVar;
        g0Var.e0(1188547137);
        int i3 = i2 | (g0Var.i(bVar) ? 4 : 2) | (g0Var.g(str) ? 32 : 16) | (g0Var.g(str2) ? 256 : 128) | (g0Var.g(str3) ? 2048 : 1024) | (g0Var.i(aVar) ? 16384 : 8192) | (g0Var.h(z) ? 131072 : 65536) | (g0Var.g(rVar) ? 8388608 : 4194304);
        if (g0Var.S(i3 & 1, (4793491 & i3) != 4793490)) {
            h0.b bVar2 = i.a;
            v1 v1VarA = t1.a(i.g(d), b2.b.J, g0Var, 54);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            r rVarC = b2.a.c(rVar, g0Var);
            b3.i.c.getClass();
            g gVar = h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            f fVar = h.f;
            q.I(v1VarA, g0Var, fVar);
            f fVar2 = h.e;
            q.I(m1VarM, g0Var, fVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            f fVar3 = h.g;
            q.I(numValueOf, g0Var, fVar3);
            b3.e eVar = h.h;
            q.E(g0Var, eVar);
            f fVar4 = h.d;
            q.I(rVarC, g0Var, fVar4);
            float f2 = e;
            b2.o oVar = b2.o.A;
            r rVarM = z1.m(oVar, f2);
            long j2 = dl.a.i;
            r rVarF = n.f(rVarM, t.b(0.1f, j2), p0.f.a);
            b2.i iVar = b2.b.E;
            w0 w0VarD = h0.o.d(iVar, false);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            r rVarC2 = b2.a.c(rVarF, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            q.I(w0VarD, g0Var, fVar);
            q.I(m1VarM2, g0Var, fVar2);
            a1.b.v(iHashCode2, g0Var, fVar3, g0Var, eVar);
            q.I(rVarC2, g0Var, fVar4);
            o3.a(bVar, (String) null, z1.m(oVar, 20), j2, g0Var, 440 | (i3 & 14), 0);
            g0Var.r(true);
            if (1.0f <= 0.0d) {
                i0.a.a("invalid weight; must be greater than zero");
            }
            c1 c1Var = new c1(1.0f, true);
            v vVarA = u.a(i.g(2), b2.b.M, g0Var, 6);
            int iHashCode3 = Long.hashCode(g0Var.T);
            m1 m1VarM3 = g0Var.m();
            r rVarC3 = b2.a.c(c1Var, g0Var);
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
            kVar2 = kVar;
            e(str, z, kVar2, g0Var, ((i3 >> 3) & 14) | ((i3 >> 12) & 112) | 384);
            z6.b(str2, (r) null, t.b(0.5f, j2), o.z(13), (q3.u) null, (q3.i) null, 0L, (l) null, (x3.k) null, o.z(17), 2, false, 3, 0, (k) null, (r0) null, g0Var, ((i3 >> 6) & 14) | 24576, 25008, 239594);
            g0Var = g0Var;
            g0Var.r(true);
            r rVarO = w50.c.o(z1.m(oVar, f), false, null, aVar, 7);
            boolean z2 = (i3 & 7168) == 2048;
            Object objN = g0Var.N();
            if (z2 || objN == l1.i.a) {
                objN = new hb.u(str3, 24);
                g0Var.n0(objN);
            }
            r rVarC4 = j3.q.c(rVarO, false, (k) objN);
            w0 w0VarD2 = h0.o.d(iVar, false);
            int iHashCode4 = Long.hashCode(g0Var.T);
            m1 m1VarM4 = g0Var.m();
            r rVarC5 = b2.a.c(rVarC4, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            q.I(w0VarD2, g0Var, fVar);
            q.I(m1VarM4, g0Var, fVar2);
            a1.b.v(iHashCode4, g0Var, fVar3, g0Var, eVar);
            q.I(rVarC5, g0Var, fVar4);
            o3.a(y3.R(2131231399, g0Var, 0), (String) null, z1.m(oVar, g), t.b(0.5f, j2), g0Var, 440, 0);
            g0Var.r(true);
            g0Var.r(true);
        } else {
            kVar2 = kVar;
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new g1.v1(bVar, str, str2, str3, aVar, z, kVar2, rVar, i2);
        }
    }

    public static final void b(final boolean z, final m2.b icon, final String title, final String message, final String closeContentDescription, final u00.a onClose, final u00.a onDismissRequest, final r rVar, e eVar, float f2, v1.c cVar, j jVar, final int i2) {
        v1.c cVar2;
        g0 g0Var;
        final e eVar2;
        final float f3;
        char c2;
        float f4;
        m.e(icon, "icon");
        m.e(title, "title");
        m.e(message, "message");
        m.e(closeContentDescription, "closeContentDescription");
        m.e(onClose, "onClose");
        m.e(onDismissRequest, "onDismissRequest");
        g0 g0Var2 = (g0) jVar;
        g0Var2.e0(1893976376);
        int i3 = i2 | (g0Var2.h(z) ? 4 : 2) | (g0Var2.i(icon) ? 32 : 16) | (g0Var2.g(title) ? 256 : 128) | (g0Var2.g(message) ? 2048 : 1024) | (g0Var2.g(closeContentDescription) ? 16384 : 8192) | (g0Var2.i(onClose) ? 131072 : 65536) | (g0Var2.i(onDismissRequest) ? 1048576 : 524288) | 905969664;
        if (g0Var2.S(i3 & 1, (306783379 & i3) != 306783378)) {
            e eVar3 = e.A;
            z0 z0VarG = q.G(onDismissRequest, g0Var2);
            Object objN = g0Var2.N();
            Object obj = l1.i.a;
            if (objN == obj) {
                objN = new k0(Boolean.FALSE);
                g0Var2.n0(objN);
            }
            final k0 k0Var = (k0) objN;
            k0Var.W0(Boolean.valueOf(z));
            Object objN2 = g0Var2.N();
            if (objN2 == obj) {
                objN2 = q.z(h2.c.e);
                g0Var2.n0(objN2);
            }
            final z0 z0Var = (z0) objN2;
            Object objN3 = g0Var2.N();
            if (objN3 == obj) {
                c2 = ' ';
                objN3 = new o2(z0Var, 23);
                g0Var2.n0(objN3);
            } else {
                c2 = ' ';
            }
            r rVarN = d0.n(rVar, (k) objN3);
            w0 w0VarD = h0.o.d(b2.b.A, false);
            int iHashCode = Long.hashCode(g0Var2.T);
            m1 m1VarM = g0Var2.m();
            r rVarC = b2.a.c(rVarN, g0Var2);
            b3.i.c.getClass();
            g gVar = h.b;
            g0Var2.g0();
            if (g0Var2.S) {
                g0Var2.l(gVar);
            } else {
                g0Var2.q0();
            }
            q.I(w0VarD, g0Var2, h.f);
            q.I(m1VarM, g0Var2, h.e);
            q.I(Integer.valueOf(iHashCode), g0Var2, h.g);
            q.E(g0Var2, h.h);
            q.I(rVarC, g0Var2, h.d);
            cVar2 = cVar;
            cVar2.invoke(g0Var2, 6);
            boolean zBooleanValue = ((Boolean) k0Var.C.getValue()).booleanValue();
            final float f5 = a;
            if (zBooleanValue || ((Boolean) k0Var.D.getValue()).booleanValue()) {
                g0Var2.c0(2056738245);
                final y3.c cVar3 = (y3.c) g0Var2.k(o1.h);
                g0Var2.c0(-2011860350);
                final float fH0 = cVar3.h0((int) (((g3) g0Var2.k(o1.u)).a() >> c2));
                g0Var2.r(false);
                boolean zG = g0Var2.g(cVar3);
                Object objN4 = g0Var2.N();
                if (zG || objN4 == obj) {
                    objN4 = new a(cVar3.R0(j));
                    g0Var2.n0(objN4);
                }
                a aVar = (a) objN4;
                boolean zG2 = g0Var2.g(z0VarG);
                Object objN5 = g0Var2.N();
                if (zG2 || objN5 == obj) {
                    objN5 = new ct.k(z0VarG, 18);
                    g0Var2.n0(objN5);
                }
                f4 = f5;
                g0Var = g0Var2;
                c4.n.a(aVar, (u00.a) objN5, new c0(26, false), v1.d.d(7901879, new u00.n() {
                    @Override
                    public final Object invoke(Object obj2, Object obj3) {
                        Object objJ0;
                        Object objJ1;
                        float f6;
                        z0 z0Var2;
                        g0 g0Var3 = (j) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        g0 g0Var4 = g0Var3;
                        if (g0Var4.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                            n1 n1VarT = x.c.t(k0Var, "tip", g0Var3, 48, 0);
                            x.r1 r1Var = x.c.k;
                            boolean zG3 = n1VarT.g();
                            f5.c cVar4 = n1VarT.a;
                            l1.c cVar5 = l1.i.a;
                            if (zG3) {
                                g0Var4.c0(1666827533);
                                g0Var4.r(false);
                                objJ0 = cVar4.J0();
                            } else {
                                g0Var4.c0(1666573488);
                                boolean zG4 = g0Var4.g(n1VarT);
                                objJ0 = g0Var4.N();
                                if (zG4 || objJ0 == cVar5) {
                                    z1.f fVarF = z1.q.f();
                                    k kVarE = fVarF != null ? fVarF.e() : null;
                                    z1.f fVarK = z1.q.k(fVarF);
                                    try {
                                        Object objJ2 = cVar4.J0();
                                        z1.q.n(fVarF, fVarK, kVarE);
                                        g0Var4.n0(objJ2);
                                        objJ0 = objJ2;
                                    } catch (Throwable th) {
                                        z1.q.n(fVarF, fVarK, kVarE);
                                        throw th;
                                    }
                                }
                                g0Var4.r(false);
                            }
                            boolean zBooleanValue2 = ((Boolean) objJ0).booleanValue();
                            g0Var4.c0(936761831);
                            float f7 = zBooleanValue2 ? 1.0f : 0.0f;
                            g0Var4.r(false);
                            Float fValueOf = Float.valueOf(f7);
                            boolean zG5 = g0Var4.g(n1VarT);
                            Object objN6 = g0Var4.N();
                            if (zG5 || objN6 == cVar5) {
                                objN6 = q.r(new al.f(n1VarT, 8));
                                g0Var4.n0(objN6);
                            }
                            boolean zBooleanValue3 = ((Boolean) ((p2) objN6).getValue()).booleanValue();
                            g0Var4.c0(936761831);
                            float f8 = zBooleanValue3 ? 1.0f : 0.0f;
                            g0Var4.r(false);
                            Float fValueOf2 = Float.valueOf(f8);
                            boolean zG6 = g0Var4.g(n1VarT);
                            Object objN7 = g0Var4.N();
                            if (zG6 || objN7 == cVar5) {
                                objN7 = q.r(new al.f(n1VarT, 9));
                                g0Var4.n0(objN7);
                            }
                            k1 animateFloat = (k1) ((p2) objN7).getValue();
                            m.e(animateFloat, "$this$animateFloat");
                            g0Var4.c0(-674561214);
                            q1 q1VarW = x.c.w(200, 0, (x.v) null, 6);
                            g0Var4.r(false);
                            x.m1 m1VarO = x.c.o(n1VarT, fValueOf, fValueOf2, q1VarW, r1Var, g0Var3, 196608);
                            if (n1VarT.g()) {
                                g0Var4.c0(1666827533);
                                g0Var4.r(false);
                                objJ1 = cVar4.J0();
                            } else {
                                g0Var4.c0(1666573488);
                                boolean zG7 = g0Var4.g(n1VarT);
                                objJ1 = g0Var4.N();
                                if (zG7 || objJ1 == cVar5) {
                                    z1.f fVarF2 = z1.q.f();
                                    k kVarE2 = fVarF2 != null ? fVarF2.e() : null;
                                    z1.f fVarK2 = z1.q.k(fVarF2);
                                    try {
                                        Object objJ3 = cVar4.J0();
                                        z1.q.n(fVarF2, fVarK2, kVarE2);
                                        g0Var4.n0(objJ3);
                                        objJ1 = objJ3;
                                    } catch (Throwable th2) {
                                        z1.q.n(fVarF2, fVarK2, kVarE2);
                                        throw th2;
                                    }
                                }
                                g0Var4.r(false);
                            }
                            boolean zBooleanValue4 = ((Boolean) objJ1).booleanValue();
                            g0Var4.c0(1697229267);
                            float f9 = zBooleanValue4 ? 1.0f : 0.92f;
                            g0Var4.r(false);
                            Float fValueOf3 = Float.valueOf(f9);
                            boolean zG8 = g0Var4.g(n1VarT);
                            Object objN8 = g0Var4.N();
                            if (zG8 || objN8 == cVar5) {
                                objN8 = q.r(new al.f(n1VarT, 10));
                                g0Var4.n0(objN8);
                            }
                            boolean zBooleanValue5 = ((Boolean) ((p2) objN8).getValue()).booleanValue();
                            g0Var4.c0(1697229267);
                            float f11 = zBooleanValue5 ? 1.0f : 0.92f;
                            g0Var4.r(false);
                            Float fValueOf4 = Float.valueOf(f11);
                            boolean zG9 = g0Var4.g(n1VarT);
                            Object objN9 = g0Var4.N();
                            if (zG9 || objN9 == cVar5) {
                                objN9 = q.r(new al.f(n1VarT, 11));
                                g0Var4.n0(objN9);
                            }
                            k1 animateFloat2 = (k1) ((p2) objN9).getValue();
                            m.e(animateFloat2, "$this$animateFloat");
                            g0Var4.c0(85906222);
                            q1 q1VarW2 = x.c.w(200, 0, (x.v) null, 6);
                            g0Var4.r(false);
                            x.m1 m1VarO2 = x.c.o(n1VarT, fValueOf3, fValueOf4, q1VarW2, r1Var, g0Var3, 196608);
                            Object objN10 = g0Var4.N();
                            if (objN10 == cVar5) {
                                objN10 = q.z(h2.c.e);
                                g0Var4.n0(objN10);
                            }
                            z0 z0Var3 = (z0) objN10;
                            Object objN11 = g0Var4.N();
                            if (objN11 == cVar5) {
                                objN11 = q.z((Object) null);
                                g0Var4.n0(objN11);
                            }
                            z0 z0Var4 = (z0) objN11;
                            float fA0 = cVar3.A0((d.k / 2) + d.b);
                            r rVarE = h0.c.E(z1.s(b2.o.A, 0.0f, fH0, 1), d.i, 0.0f, 2);
                            y3.f fVar = (y3.f) z0Var4.getValue();
                            float f12 = f5;
                            if (fVar != null) {
                                f12 = p30.f.i0(new y3.f(f12), new y3.f(fVar.A + d.h)).A;
                            }
                            r rVarD = z1.d(z1.s(rVarE, 0.0f, f12, 1), 1.0f);
                            Object objN12 = g0Var4.N();
                            if (objN12 == cVar5) {
                                objN12 = new o2(z0Var3, 24);
                                g0Var4.n0(objN12);
                            }
                            r rVarN2 = d0.n(rVarD, (k) objN12);
                            boolean zG10 = g0Var4.g(m1VarO) | g0Var4.g(m1VarO2) | g0Var4.d(fA0);
                            Object objN13 = g0Var4.N();
                            z0 z0Var5 = z0Var;
                            if (zG10 || objN13 == cVar5) {
                                objN13 = new pl.a(m1VarO, m1VarO2, fA0, z0Var3, z0Var5);
                                f6 = fA0;
                                z0Var2 = z0Var5;
                                g0Var4.n0(objN13);
                            } else {
                                f6 = fA0;
                                z0Var2 = z0Var5;
                            }
                            r rVarP = b0.p(rVarN2, (k) objN13);
                            boolean zD = g0Var4.d(f6);
                            Object objN14 = g0Var4.N();
                            if (zD || objN14 == cVar5) {
                                objN14 = new l3(f6, z0Var3, z0Var2, 4);
                                g0Var4.n0(objN14);
                            }
                            r rVarC2 = h0.c.C(h0.c.E(f2.h.e(rVarP, (k) objN14), 0.0f, d.l, 1), d.c);
                            boolean z2 = ((y3.f) z0Var4.getValue()) == null;
                            Object objN15 = g0Var4.N();
                            if (objN15 == cVar5) {
                                objN15 = new o2(z0Var4, 25);
                                g0Var4.n0(objN15);
                            }
                            d.a(icon, title, message, closeContentDescription, onClose, z2, (k) objN15, rVarC2, g0Var3, 1572872);
                        } else {
                            g0Var4.V();
                        }
                        return g00.b0.a;
                    }
                }, g0Var2), g0Var, 3456, 0);
                g0Var.r(false);
            } else {
                g0Var2.c0(2061104068);
                g0Var2.r(false);
                f4 = f5;
                g0Var = g0Var2;
            }
            g0Var.r(true);
            f3 = f4;
            eVar2 = eVar3;
        } else {
            cVar2 = cVar;
            g0Var = g0Var2;
            g0Var.V();
            eVar2 = eVar;
            f3 = f2;
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            final v1.c cVar4 = cVar2;
            r1VarT.d = new u00.n(z, icon, title, message, closeContentDescription, onClose, onDismissRequest, rVar, eVar2, f3, cVar4, i2) {
                public final boolean A;
                public final m2.b B;
                public final String C;
                public final String D;
                public final String E;
                public final u00.a F;
                public final u00.a G;
                public final r H;
                public final e I;
                public final float J;
                public final v1.c K;

                @Override
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iK = q.K(12582977);
                    d.b(this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, (j) obj2, iK);
                    return g00.b0.a;
                }
            };
        }
    }

    public static final float c(float f2, z0 z0Var, z0 z0Var2) {
        h2.c cVar = (h2.c) z0Var.getValue();
        float f3 = (cVar.c - cVar.a) - f2;
        if (f3 < f2) {
            f3 = f2;
        }
        return a0.x(Float.intBitsToFloat((int) (((h2.c) z0Var2.getValue()).c() >> 32)) - ((h2.c) z0Var.getValue()).a, f2, f3);
    }

    public static final boolean d(z0 z0Var, z0 z0Var2) {
        return Float.intBitsToFloat((int) (((h2.c) z0Var.getValue()).c() & 4294967295L)) < Float.intBitsToFloat((int) (((h2.c) z0Var2.getValue()).c() & 4294967295L));
    }

    public static final void e(String str, boolean z, k kVar, j jVar, int i2) {
        String str2;
        int i3;
        boolean z2;
        j jVar2;
        j jVar3 = (g0) jVar;
        jVar3.e0(-72832188);
        if ((i2 & 6) == 0) {
            str2 = str;
            i3 = (jVar3.g(str2) ? 4 : 2) | i2;
        } else {
            str2 = str;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            z2 = z;
            i3 |= jVar3.h(z2) ? 32 : 16;
        } else {
            z2 = z;
        }
        if ((i2 & 384) == 0) {
            i3 |= jVar3.i(kVar) ? 256 : 128;
        }
        if (jVar3.S(i3 & 1, (i3 & 147) != 146)) {
            int i4 = i3 & 14;
            boolean z3 = i4 == 4;
            Object objN = jVar3.N();
            l1.c cVar = l1.i.a;
            if (z3 || objN == cVar) {
                e1 e1Var = new e1(y3.o.c(n));
                jVar3.n0(e1Var);
                objN = e1Var;
            }
            e1 e1Var2 = (e1) objN;
            z0 z0VarG = q.G(Boolean.valueOf(z2), jVar3);
            z0 z0VarG2 = q.G(kVar, jVar3);
            y3.c cVar2 = (y3.c) jVar3.k(o1.h);
            long j2 = dl.a.i;
            long jF = o.F(e1Var2.h(), 4294967296L);
            q3.u uVar = q3.u.L;
            boolean zG = jVar3.g(z0VarG) | jVar3.g(z0VarG2) | jVar3.g(cVar2) | jVar3.g(e1Var2);
            Object objN2 = jVar3.N();
            if (zG || objN2 == cVar) {
                az.k kVar2 = new az.k(cVar2, z0VarG, z0VarG2, e1Var2, 13);
                jVar3.n0(kVar2);
                objN2 = kVar2;
            }
            jVar2 = jVar3;
            z6.b(str2, (r) null, j2, jF, uVar, (q3.i) null, 0L, (l) null, (x3.k) null, 0L, 2, false, 1, 0, (k) objN2, (r0) null, jVar2, i4 | 1572864, 24960, 176042);
        } else {
            jVar2 = jVar3;
            jVar2.V();
        }
        r1 r1VarT = jVar2.t();
        if (r1VarT != null) {
            r1VarT.d = new ct.h(str, z, kVar, i2, 6);
        }
    }
}
