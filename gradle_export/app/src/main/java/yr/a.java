package yr;

import a30.x;
import a40.z;
import ab.d0;
import android.content.Context;
import b2.o;
import b2.r;
import b3.g;
import b3.h;
import b3.i;
import c00.l;
import c3.o0;
import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.internal.measurement.z3;
import d0.o2;
import eu.k;
import g1.m6;
import g1.o3;
import g1.s;
import g1.t4;
import g1.u;
import g1.u4;
import g1.x5;
import g1.z6;
import h0.a0;
import h0.n1;
import h0.p1;
import h0.t1;
import h0.v;
import h0.v1;
import h0.w;
import h0.z1;
import i2.b0;
import i2.t;
import i2.t0;
import java.util.Set;
import k0.y;
import kotlin.NoWhenBranchMatchedException;
import l1.f1;
import l1.g0;
import l1.j;
import l1.m1;
import l1.q;
import l1.r1;
import l1.y0;
import l1.z0;
import m3.r0;
import pz.m;
import ta.c0;
import w.x0;
import x.b1;
import z.h1;
import z.n;
import z2.p;
import z2.w0;

public abstract class a {
    public static final v1.c a = new v1.c(new m(22), -1117091387, false);
    public static final v1.c b = new v1.c(new m(23), 1483869424, false);
    public static final v1.c c = new v1.c(new m(24), -510300917, false);

    public static final void a(String str, u00.a aVar, j jVar, int i) {
        int i2;
        int i3;
        g0 g0Var = (g0) jVar;
        g0Var.e0(175437285);
        if ((i & 6) == 0) {
            i2 = (g0Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= g0Var.i(aVar) ? 32 : 16;
        }
        int i4 = i2;
        if (g0Var.S(i4 & 1, (i4 & 19) != 18)) {
            o oVar = o.A;
            r rVarD = z1.d(oVar, 1.0f);
            t tVar = new t(t.f);
            long j = t.b;
            float f = 16;
            r rVarF = h0.c.F(n.e(rVarD, sg.f.P(va.a.S(new t[]{tVar, new t(j)}), 0.0f, 0.0f, 14), (t0) null, 6), f, 19, f, 14);
            w0 w0VarD = h0.o.d(b2.b.A, false);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            r rVarC = b2.a.c(rVarF, g0Var);
            i.c.getClass();
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
            r rVarD2 = z1.d(oVar, 1.0f);
            p0.e eVarA = p0.f.a(32);
            p1 p1Var = s.a;
            x5.a(aVar, rVarD2, false, eVarA, s.a(dl.a.i, j, 0L, 0L, g0Var, 12), (u) null, (n1) null, (f0.i) null, v1.d.d(2003305307, new fv.a(str, 10), g0Var), g0Var, ((i4 >> 3) & 14) | 805306416, 484);
            i3 = 1;
            g0Var.r(true);
        } else {
            i3 = 1;
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new k(str, aVar, i, i3);
        }
    }

    public static final void b(u30.b bVar, boolean z, u00.a aVar, r rVar, j jVar, int i) {
        j jVar2;
        j jVar3 = (g0) jVar;
        jVar3.e0(1767434869);
        int i2 = i | (jVar3.i(bVar) ? 4 : 2) | (jVar3.h(z) ? 32 : 16) | (jVar3.g(rVar) ? 2048 : 1024);
        if (jVar3.S(i2 & 1, (i2 & 1171) != 1170)) {
            gm.a aVar2 = (gm.a) jVar3.k(dl.e.a);
            k0.b bVar2 = new k0.b(3);
            r rVarD = z1.d(rVar, 1.0f);
            float f = 16;
            float f2 = 32;
            p1 p1Var = new p1(f, f2, f, f2);
            h0.f fVarG = h0.i.g(21);
            h0.f fVarG2 = h0.i.g(12);
            boolean zE = ((i2 & 14) == 4 || jVar3.i(bVar)) | ((i2 & 112) == 32) | jVar3.e(aVar2.ordinal());
            Object objN = jVar3.N();
            if (zE || objN == l1.i.a) {
                d0 d0Var = new d0(bVar, z, aVar, aVar2, 3);
                jVar3.n0(d0Var);
                objN = d0Var;
            }
            jVar2 = jVar3;
            kh.n.i(bVar2, rVarD, (y) null, p1Var, fVarG2, fVarG, (d0.t0) null, false, (h1) null, (u00.k) objN, jVar2, 1772544, 0, 916);
        } else {
            jVar2 = jVar3;
            jVar2.V();
        }
        r1 r1VarT = jVar2.t();
        if (r1VarT != null) {
            r1VarT.d = new l(bVar, z, aVar, rVar, i, 9);
        }
    }

    public static final void c(bx.c cVar, j jVar, int i) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(-2130438808);
        int i2 = (g0Var.i(cVar) ? 4 : 2) | i;
        if (g0Var.S(i2 & 1, (i2 & 3) != 2)) {
            String str = cVar.i;
            String str2 = cVar.h;
            String string = r30.k.j1(str).toString();
            if (string.length() == 0) {
                r1 r1VarT = g0Var.t();
                if (r1VarT != null) {
                    r1VarT.d = new d(cVar, i, 3);
                    return;
                }
                return;
            }
            Context context = (Context) g0Var.k(o0.b);
            boolean zG = g0Var.g(str2);
            Object objN = g0Var.N();
            if (zG || objN == l1.i.a) {
                objN = new xm.a(context).a(str2);
                g0Var.n0(objN);
            }
            String str3 = (String) objN;
            v1 v1VarA = t1.a(h0.i.g(8), b2.b.K, g0Var, 54);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            o oVar = o.A;
            r rVarC = b2.a.c(oVar, g0Var);
            i.c.getClass();
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
            if (str3 == null) {
                g0Var.c0(-709191899);
                g0Var.r(false);
            } else {
                g0Var.c0(-709191898);
                wb.h hVar = new wb.h(context);
                hVar.c = "file:///android_asset/".concat(str3);
                hVar.b();
                mb.l.b(hVar.a(), f2.h.c(z1.m(oVar, 20), p0.f.a), g0Var);
                g0Var.r(false);
            }
            z6.b(string, (r) null, dl.a.k, kh.o.z(16), (q3.u) null, (q3.i) null, 0L, (x3.l) null, (x3.k) null, 0L, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 24576, 0, 262122);
            g0Var = g0Var;
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT2 = g0Var.t();
        if (r1VarT2 != null) {
            r1VarT2.d = new d(cVar, i, 4);
        }
    }

    public static final void d(u00.a aVar, j jVar, int i) {
        j jVar2 = (g0) jVar;
        jVar2.e0(-138223669);
        int i2 = i | (jVar2.i(aVar) ? 4 : 2);
        if (jVar2.S(i2 & 1, (i2 & 3) != 2)) {
            float f = 16;
            r rVarC = h0.c.C(z1.c, f);
            v vVarA = h0.u.a(h0.i.e, b2.b.N, jVar2, 54);
            int iHashCode = Long.hashCode(((g0) jVar2).T);
            m1 m1VarM = jVar2.m();
            r rVarC2 = b2.a.c(rVarC, jVar2);
            i.c.getClass();
            g gVar = h.b;
            jVar2.g0();
            if (((g0) jVar2).S) {
                jVar2.l(gVar);
            } else {
                jVar2.q0();
            }
            q.I(vVarA, jVar2, h.f);
            q.I(m1VarM, jVar2, h.e);
            q.I(Integer.valueOf(iHashCode), jVar2, h.g);
            q.E(jVar2, h.h);
            q.I(rVarC2, jVar2, h.d);
            z6.b(z3.U(jVar2, 2131886916), (r) null, dl.a.k, kh.o.z(20), q3.u.L, (q3.i) null, 0L, (x3.l) null, new x3.k(3), 0L, 0, false, 0, 0, (u00.k) null, (r0) null, jVar2, 1597440, 0, 261034);
            jVar2 = jVar2;
            h0.c.h(z1.e(o.A, f), jVar2);
            a(z3.U(jVar2, 2131886417), aVar, jVar2, (i2 << 3) & 112);
            jVar2.r(true);
        } else {
            jVar2.V();
        }
        r1 r1VarT = jVar2.t();
        if (r1VarT != null) {
            r1VarT.d = new eu.d(aVar, i, 26);
        }
    }

    public static final void e(int i, r rVar, j jVar, u00.a aVar, boolean z) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(1031402705);
        int i2 = i | (g0Var.h(z) ? 4 : 2) | (g0Var.i(aVar) ? 32 : 16);
        if (g0Var.S(i2 & 1, (i2 & 147) != 146)) {
            r rVarD = h0.c.D(w50.c.o(n.f(f2.h.c(rVar, p0.f.a(32)), t.b(0.15f, t.c), b0.b), false, null, aVar, 7), 20, 12);
            v1 v1VarA = t1.a(h0.i.g(6), b2.b.K, g0Var, 54);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            r rVarC = b2.a.c(rVarD, g0Var);
            i.c.getClass();
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
            o2.f fVarH0 = g4.h0(z ? 2131231389 : 2131231388, g0Var, 6);
            long j = dl.a.k;
            o3.b(fVarH0, (String) null, z1.m(o.A, 16), j, g0Var, 432, 0);
            z6.b(z3.U(g0Var, z ? 2131886112 : 2131886111), (r) null, j, kh.o.z(16), q3.u.K, (q3.i) null, 0L, (x3.l) null, (x3.k) null, 0L, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 1597440, 0, 262058);
            g0Var = g0Var;
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new ct.q(z, aVar, rVar, i);
        }
    }

    public static final void f(u30.b bVar, Context context, j jVar, int i) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(-1024412929);
        int i2 = (g0Var.g(bVar) ? 4 : 2) | i | (g0Var.i(context) ? 32 : 16);
        if (g0Var.S(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 14) == 4;
            Object objN = g0Var.N();
            if (z || objN == l1.i.a) {
                objN = ((h00.b) bVar).a() == 1 ? new xm.a(context).a((String) h00.q.L0(bVar)) : null;
                g0Var.n0(objN);
            }
            String str = (String) objN;
            o oVar = o.A;
            if (str != null) {
                g0Var.c0(1752397294);
                wb.h hVar = new wb.h(context);
                hVar.c = "file:///android_asset/".concat(str);
                hVar.b();
                mb.l.b(hVar.a(), f2.h.c(z1.m(oVar, 20), p0.f.a), g0Var);
                g0Var.r(false);
            } else {
                g0Var.c0(1752783957);
                o3.b(g4.h0(2131231138, g0Var, 6), (String) null, z1.m(oVar, 20), dl.a.i, g0Var, 432, 0);
                g0Var.r(false);
            }
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new c(bVar, context, i, 0);
        }
    }

    public static final void g(final String countdownText, final String hintText, final u30.b countryCodes, final u00.a onDismiss, j jVar, int i) {
        j jVar2;
        kotlin.jvm.internal.m.e(countdownText, "countdownText");
        kotlin.jvm.internal.m.e(hintText, "hintText");
        kotlin.jvm.internal.m.e(countryCodes, "countryCodes");
        kotlin.jvm.internal.m.e(onDismiss, "onDismiss");
        j jVar3 = (g0) jVar;
        jVar3.e0(-1362648179);
        int i2 = i | (jVar3.g(countdownText) ? 4 : 2) | (jVar3.g(hintText) ? 32 : 16) | (jVar3.g(countryCodes) ? 256 : 128) | (jVar3.i(onDismiss) ? 2048 : 1024);
        if (jVar3.S(i2 & 1, (i2 & 1171) != 1170)) {
            final m6 m6VarF = t4.f(true, (u00.k) null, jVar3, 6, 2);
            Object objN = jVar3.N();
            Object obj = l1.i.a;
            if (objN == obj) {
                objN = q.z(Boolean.TRUE);
                jVar3.n0(objN);
            }
            final z0 z0Var = (z0) objN;
            final Context context = (Context) jVar3.k(o0.b);
            Object objN2 = jVar3.N();
            if (objN2 == obj) {
                objN2 = q.o(jVar3);
                jVar3.n0(objN2);
            }
            final z zVar = (z) objN2;
            jVar2 = jVar3;
            t4.a(onDismiss, (r) null, m6VarF, 0.0f, false, (t0) null, dl.a.q, 0L, 0.0f, 0L, (u00.n) null, (u00.n) null, (u4) null, v1.d.d(1948905579, new u00.o() {
                @Override
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    g0 g0Var;
                    boolean z;
                    w ModalBottomSheet = (w) obj2;
                    g0 g0Var2 = (j) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    kotlin.jvm.internal.m.e(ModalBottomSheet, "$this$ModalBottomSheet");
                    boolean z2 = (iIntValue & 17) != 16;
                    g0 g0Var3 = g0Var2;
                    x xVar = g0Var3.a;
                    if (g0Var3.S(iIntValue & 1, z2)) {
                        g4.d(6, dl.a.q, g0Var2, true);
                        o oVar = o.A;
                        float f = 16;
                        r rVarG = h0.c.G(z1.d(oVar, 1.0f), f, 0.0f, f, f, 2);
                        b2.g gVar = b2.b.N;
                        float f2 = 24;
                        v vVarA = h0.u.a(h0.i.g(f2), gVar, g0Var2, 54);
                        int iHashCode = Long.hashCode(g0Var3.T);
                        m1 m1VarM = g0Var3.m();
                        r rVarC = b2.a.c(rVarG, g0Var2);
                        i.c.getClass();
                        g gVar2 = h.b;
                        g0Var3.g0();
                        if (g0Var3.S) {
                            g0Var3.l(gVar2);
                        } else {
                            g0Var3.q0();
                        }
                        b3.f fVar = h.f;
                        q.I(vVarA, g0Var2, fVar);
                        b3.f fVar2 = h.e;
                        q.I(m1VarM, g0Var2, fVar2);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        b3.f fVar3 = h.g;
                        q.I(numValueOf, g0Var2, fVar3);
                        b3.e eVar = h.h;
                        q.E(g0Var2, eVar);
                        b3.f fVar4 = h.d;
                        q.I(rVarC, g0Var2, fVar4);
                        v vVarA2 = h0.u.a(h0.i.g(f), gVar, g0Var2, 54);
                        int iHashCode2 = Long.hashCode(g0Var3.T);
                        m1 m1VarM2 = g0Var3.m();
                        r rVarC2 = b2.a.c(oVar, g0Var2);
                        g0Var3.g0();
                        if (g0Var3.S) {
                            g0Var3.l(gVar2);
                        } else {
                            g0Var3.q0();
                        }
                        q.I(vVarA2, g0Var2, fVar);
                        q.I(m1VarM2, g0Var2, fVar2);
                        com.google.android.gms.internal.measurement.x5.u(iHashCode2, g0Var2, fVar3, g0Var2, eVar);
                        q.I(rVarC2, g0Var2, fVar4);
                        kl.a.a(null, false, g0Var2, 48, 1);
                        n.c(y3.R(2131231081, g0Var2, 0), (String) null, z1.m(oVar, 76), (b2.d) null, (p) null, 0.0f, g0Var2, 440, 120);
                        g0Var3.r(true);
                        v vVarA3 = h0.u.a(h0.i.g(f), gVar, g0Var2, 54);
                        int iHashCode3 = Long.hashCode(g0Var3.T);
                        m1 m1VarM3 = g0Var3.m();
                        r rVarC3 = b2.a.c(oVar, g0Var2);
                        g0Var3.g0();
                        if (g0Var3.S) {
                            g0Var3.l(gVar2);
                        } else {
                            g0Var3.q0();
                        }
                        q.I(vVarA3, g0Var2, fVar);
                        q.I(m1VarM3, g0Var2, fVar2);
                        com.google.android.gms.internal.measurement.x5.u(iHashCode3, g0Var2, fVar3, g0Var2, eVar);
                        q.I(rVarC3, g0Var2, fVar4);
                        float f3 = 8;
                        v vVarA4 = h0.u.a(h0.i.g(f3), gVar, g0Var2, 54);
                        int iHashCode4 = Long.hashCode(g0Var3.T);
                        m1 m1VarM4 = g0Var3.m();
                        r rVarC4 = b2.a.c(oVar, g0Var2);
                        g0Var3.g0();
                        if (g0Var3.S) {
                            g0Var3.l(gVar2);
                        } else {
                            g0Var3.q0();
                        }
                        q.I(vVarA4, g0Var2, fVar);
                        q.I(m1VarM4, g0Var2, fVar2);
                        com.google.android.gms.internal.measurement.x5.u(iHashCode4, g0Var2, fVar3, g0Var2, eVar);
                        q.I(rVarC4, g0Var2, fVar4);
                        String strU = z3.U(g0Var2, 2131886910);
                        long j = dl.a.k;
                        z6.b(strU, (r) null, j, kh.o.z(22), q3.u.M, (q3.i) null, 0L, (x3.l) null, new x3.k(3), 0L, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var2, 1597440, 0, 261034);
                        z6.b(countdownText, (r) null, j, kh.o.z(16), (q3.u) null, (q3.i) null, 0L, (x3.l) null, new x3.k(3), 0L, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var2, 24576, 0, 261098);
                        g0Var3.r(true);
                        r rVarC5 = f2.h.c(z1.d(oVar, 1.0f), p0.f.a(f2));
                        long j2 = dl.a.i;
                        r rVarD = h0.c.D(n.f(rVarC5, t.b(0.08f, j2), b0.b), f, f3);
                        v vVarA5 = h0.u.a(h0.i.g(f3), b2.b.M, g0Var2, 6);
                        int iHashCode5 = Long.hashCode(g0Var3.T);
                        m1 m1VarM5 = g0Var3.m();
                        r rVarC6 = b2.a.c(rVarD, g0Var2);
                        g0Var3.g0();
                        if (g0Var3.S) {
                            g0Var3.l(gVar2);
                        } else {
                            g0Var3.q0();
                        }
                        q.I(vVarA5, g0Var2, fVar);
                        q.I(m1VarM5, g0Var2, fVar2);
                        com.google.android.gms.internal.measurement.x5.u(iHashCode5, g0Var2, fVar3, g0Var2, eVar);
                        q.I(rVarC6, g0Var2, fVar4);
                        z6.b(z3.U(g0Var2, 2131887335), z1.d(oVar, 1.0f), dl.a.p, kh.o.z(13), (q3.u) null, (q3.i) null, 0L, (x3.l) null, (x3.k) null, 0L, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var2, 24624, 0, 262120);
                        r rVarD2 = z1.d(oVar, 1.0f);
                        z0 z0Var2 = z0Var;
                        boolean zBooleanValue = ((Boolean) z0Var2.getValue()).booleanValue();
                        Object objN3 = g0Var3.N();
                        Object obj5 = l1.i.a;
                        if (objN3 == obj5) {
                            z = true;
                            objN3 = new x0.d(z0Var2, 1);
                            g0Var = g0Var3;
                            g0Var.n0(objN3);
                        } else {
                            g0Var = g0Var3;
                            z = true;
                        }
                        c0.f(3504, rVarD2, g0Var2, (u00.a) objN3, v1.d.d(1982786352, new qo.s(countryCodes, context, hintText, 3), g0Var2), zBooleanValue);
                        g0Var.r(z);
                        g0Var.r(z);
                        r rVarG2 = h0.c.G(z1.d(oVar, 1.0f), 0.0f, f, 0.0f, 0.0f, 13);
                        p0.e eVarA = p0.f.a(32);
                        p1 p1Var = s.a;
                        g1.r rVarA = s.a(t.b(0.15f, dl.a.o), j2, 0L, 0L, g0Var2, 12);
                        z zVar2 = zVar;
                        boolean zI = g0Var.i(zVar2);
                        m6 m6Var = m6VarF;
                        boolean zG = zI | g0Var.g(m6Var);
                        u00.a aVar = onDismiss;
                        boolean zG2 = zG | g0Var.g(aVar);
                        Object objN4 = g0Var.N();
                        if (zG2 || objN4 == obj5) {
                            objN4 = new cz.c(zVar2, m6Var, aVar, 19);
                            g0Var.n0(objN4);
                        }
                        x5.a((u00.a) objN4, rVarG2, false, eVarA, rVarA, (u) null, (n1) null, (f0.i) null, a.a, g0Var2, 805306416, 484);
                        g0Var.r(z);
                    } else {
                        g0Var3.V();
                    }
                    return g00.b0.a;
                }
            }, jVar3), jVar2, (i2 >> 9) & 14, 3078, 7098);
        } else {
            jVar2 = jVar3;
            jVar2.V();
        }
        r1 r1VarT = jVar2.t();
        if (r1VarT != null) {
            r1VarT.d = new dz.k(countdownText, hintText, countryCodes, onDismiss, i, 21);
        }
    }

    public static final void h(final u30.b reciters, final u30.b favoriteReciterIds, final u00.k onToggleFavorite, u00.a onComplete, u00.a onDismiss, j jVar, int i) {
        boolean z;
        r rVarF;
        r rVarM;
        final gm.a aVar;
        r rVar;
        Object obj;
        u00.n nVar;
        float f;
        z0 z0Var;
        float f2;
        r rVarM2;
        kotlin.jvm.internal.m.e(reciters, "reciters");
        kotlin.jvm.internal.m.e(favoriteReciterIds, "favoriteReciterIds");
        kotlin.jvm.internal.m.e(onToggleFavorite, "onToggleFavorite");
        kotlin.jvm.internal.m.e(onComplete, "onComplete");
        kotlin.jvm.internal.m.e(onDismiss, "onDismiss");
        g0 g0Var = (g0) jVar;
        g0Var.e0(-524288646);
        int i2 = i | (g0Var.i(reciters) ? 4 : 2) | (g0Var.g(favoriteReciterIds) ? 32 : 16) | (g0Var.i(onToggleFavorite) ? 256 : 128) | (g0Var.i(onComplete) ? 2048 : 1024) | (g0Var.i(onDismiss) ? 16384 : 8192);
        if (g0Var.S(i2 & 1, (i2 & 9363) != 9362)) {
            gm.a aVar2 = (gm.a) g0Var.k(dl.e.a);
            Object objN = g0Var.N();
            Object obj2 = l1.i.a;
            if (objN == obj2) {
                objN = oi.k.s(0, g0Var);
            }
            f1 f1Var = (y0) objN;
            Object objN2 = g0Var.N();
            if (objN2 == obj2) {
                objN2 = q.z(h00.z.A);
                g0Var.n0(objN2);
            }
            final z0 z0Var2 = (z0) objN2;
            Object objN3 = g0Var.N();
            if (objN3 == obj2) {
                objN3 = q.z(Boolean.TRUE);
                g0Var.n0(objN3);
            }
            z0 z0Var3 = (z0) objN3;
            Object objN4 = g0Var.N();
            if (objN4 == obj2) {
                objN4 = q.z(Boolean.FALSE);
                g0Var.n0(objN4);
            }
            z0 z0Var4 = (z0) objN4;
            kk.c cVarD = kk.e.d(g0Var);
            Object objN5 = g0Var.N();
            if (objN5 == obj2) {
                objN5 = com.google.android.gms.internal.measurement.x5.s(0, g0Var);
            }
            z0 z0Var5 = (z0) objN5;
            f1 f1Var2 = f1Var;
            bx.c cVar = (bx.c) h00.q.O0(f1Var2.h(), reciters);
            boolean z2 = f1Var2.h() >= va.a.M(reciters);
            boolean zContains = ((Set) z0Var2.getValue()).contains(Integer.valueOf(f1Var2.h()));
            if (((Boolean) z0Var4.getValue()).booleanValue()) {
                cVar = (bx.c) h00.q.N0(reciters);
            }
            if (((Boolean) z0Var4.getValue()).booleanValue()) {
                z = !((Boolean) z0Var3.getValue()).booleanValue();
            } else {
                z = zContains;
            }
            int iOrdinal = aVar2.ordinal();
            r rVar2 = o.A;
            if (iOrdinal == 0) {
                rVarF = z1.c;
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                rVarF = z1.f(z1.r(f2.h.c(h0.c.M(rVar2, h0.c.d), p0.f.a(16)), 600, 650), 700, 750);
            }
            r rVarF2 = n.f(rVarF, dl.a.L, b0.b);
            w0 w0VarD = h0.o.d(b2.b.A, false);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            r rVarC = b2.a.c(rVarF2, g0Var);
            i.c.getClass();
            g gVar = h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            u00.n nVar2 = h.f;
            q.I(w0VarD, g0Var, nVar2);
            b3.f fVar = h.e;
            q.I(m1VarM, g0Var, fVar);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar2 = h.g;
            q.I(numValueOf, g0Var, fVar2);
            b3.e eVar = h.h;
            q.E(g0Var, eVar);
            b3.f fVar3 = h.d;
            q.I(rVarC, g0Var, fVar3);
            Integer numValueOf2 = cVar != null ? Integer.valueOf(cVar.a) : null;
            b1 b1VarV = x.c.v(0.0f, 400.0f, (Object) null, 5);
            a0 a0Var = z1.c;
            z0 z0Var6 = z0Var3;
            w.c0.f(numValueOf2, a0Var, b1VarV, "newReciterBackground", v1.d.d(329179398, new a1.w(reciters, 21), g0Var), g0Var, 28080, 0);
            r rVarV = kk.e.a(rVar2, cVarD).V(a0Var);
            float f3 = 8;
            r rVarG = h0.c.G(rVarV, 0.0f, ((y3.f) z0Var5.getValue()).A + f3, 0.0f, 0.0f, 13);
            int iOrdinal2 = aVar2.ordinal();
            if (iOrdinal2 == 0) {
                rVarM = h0.c.M(rVar2, h0.c.g);
            } else {
                if (iOrdinal2 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                rVarM = rVar2;
            }
            r rVarV2 = rVarG.V(rVarM);
            v vVarA = h0.u.a(h0.i.c, b2.b.M, g0Var, 0);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            r rVarC2 = b2.a.c(rVarV2, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            q.I(vVarA, g0Var, nVar2);
            q.I(m1VarM2, g0Var, fVar);
            a1.b.v(iHashCode2, g0Var, fVar2, g0Var, eVar);
            q.I(rVarC2, g0Var, fVar3);
            float f4 = 16;
            z6.b(z3.U(g0Var, 2131886913), h0.c.G(h0.c.E(z1.d(rVar2, 1.0f), f4, 0.0f, 2), 0.0f, 0.0f, 0.0f, 24, 7), dl.a.k, kh.o.z(34), q3.u.M, (q3.i) null, 0L, (x3.l) null, new x3.k(3), 0L, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 1597488, 0, 261032);
            g0 g0Var2 = g0Var;
            if (((h00.b) reciters).isEmpty()) {
                g0Var2.c0(-1792049544);
                boolean z3 = ((i2 & 57344) == 16384) | ((i2 & 7168) == 2048);
                Object objN6 = g0Var2.N();
                if (z3 || objN6 == obj2) {
                    objN6 = new po.e(onComplete, onDismiss, 3);
                    g0Var2.n0(objN6);
                }
                d((u00.a) objN6, g0Var2, 0);
                g0Var2.r(false);
                rVar = rVar2;
                nVar = nVar2;
                obj = obj2;
                aVar = aVar2;
                f = 1.0f;
            } else if (((Boolean) z0Var4.getValue()).booleanValue()) {
                g0Var2.c0(-1791873154);
                boolean zBooleanValue = ((Boolean) z0Var6.getValue()).booleanValue();
                Object objN7 = g0Var2.N();
                if (objN7 == obj2) {
                    z0Var = z0Var6;
                    objN7 = new x0.d(z0Var, 2);
                    g0Var2.n0(objN7);
                } else {
                    z0Var = z0Var6;
                }
                z0Var6 = z0Var;
                b(reciters, zBooleanValue, (u00.a) objN7, w.a(rVar2, 1.0f), g0Var2, 392 | (i2 & 14));
                g0Var2.r(false);
                nVar = nVar2;
                obj = obj2;
                rVar = rVar2;
                f = 1.0f;
                aVar = aVar2;
                g0Var2 = g0Var2;
                i2 = i2;
            } else {
                g0Var2.c0(-1791543624);
                int iH = f1Var2.h();
                r rVarA = w.a(rVar2, 1.0f);
                Integer numValueOf3 = Integer.valueOf(iH);
                Object objN8 = g0Var2.N();
                if (objN8 == obj2) {
                    objN8 = new xn.a(20);
                    g0Var2.n0(objN8);
                }
                u00.k kVar = (u00.k) objN8;
                Object objN9 = g0Var2.N();
                if (objN9 == obj2) {
                    objN9 = new e6.c(4);
                    g0Var2.n0(objN9);
                }
                aVar = aVar2;
                rVar = rVar2;
                obj = obj2;
                nVar = nVar2;
                f = 1.0f;
                i2 = i2;
                w.m.a(numValueOf3, rVarA, kVar, (b2.d) null, "newReciterPage", (u00.k) objN9, v1.d.d(-1507750940, new u00.p() {
                    @Override
                    public final Object invoke(Object obj3, Object obj4, Object obj5, Object obj6) {
                        w.p AnimatedContent = (w.p) obj3;
                        Integer num = (Integer) obj4;
                        int iIntValue = num.intValue();
                        g0 g0Var3 = (j) obj5;
                        int iIntValue2 = ((Integer) obj6).intValue();
                        kotlin.jvm.internal.m.e(AnimatedContent, "$this$AnimatedContent");
                        bx.c cVar2 = (bx.c) reciters.get(iIntValue);
                        z0 z0Var7 = z0Var2;
                        boolean z4 = true;
                        boolean z5 = !((Set) z0Var7.getValue()).contains(num);
                        boolean zContains2 = favoriteReciterIds.contains(Integer.valueOf(cVar2.a));
                        if ((((iIntValue2 & 112) ^ 48) <= 32 || !g0Var3.e(iIntValue)) && (iIntValue2 & 48) != 32) {
                            z4 = false;
                        }
                        g0 g0Var4 = g0Var3;
                        Object objN10 = g0Var4.N();
                        l1.c cVar3 = l1.i.a;
                        if (z4 || objN10 == cVar3) {
                            objN10 = new e1.w(iIntValue, z0Var7, 5);
                            g0Var4.n0(objN10);
                        }
                        u00.a aVar3 = (u00.a) objN10;
                        u00.k kVar2 = onToggleFavorite;
                        boolean zG = g0Var4.g(kVar2) | g0Var4.i(cVar2);
                        Object objN11 = g0Var4.N();
                        if (zG || objN11 == cVar3) {
                            objN11 = new l6.c(kVar2, cVar2, 28);
                            g0Var4.n0(objN11);
                        }
                        a.k(cVar2, z5, zContains2, aVar, aVar3, (u00.a) objN11, g0Var3, 8);
                        return g00.b0.a;
                    }
                }, g0Var2), g0Var2, 1794432, 8);
                g0Var2 = g0Var2;
                g0Var2.r(false);
            }
            r rVarG2 = h0.c.G(rVar, 0.0f, 0.0f, 0.0f, f4, 7);
            r rVar3 = rVar;
            r rVarE = z1.e(z1.d(rVarG2, f), 50);
            w0 w0VarD2 = h0.o.d(b2.b.E, false);
            int iHashCode3 = Long.hashCode(g0Var2.T);
            m1 m1VarM3 = g0Var2.m();
            r rVarC3 = b2.a.c(rVarE, g0Var2);
            g0Var2.g0();
            if (g0Var2.S) {
                g0Var2.l(gVar);
            } else {
                g0Var2.q0();
            }
            q.I(w0VarD2, g0Var2, nVar);
            q.I(m1VarM3, g0Var2, (u00.n) r47);
            a1.b.v(iHashCode3, g0Var2, fVar2, g0Var2, eVar);
            q.I(rVarC3, g0Var2, fVar3);
            int i3 = i2;
            boolean z4 = z2;
            u00.n nVar3 = nVar;
            gm.a aVar3 = aVar;
            g0 g0Var3 = g0Var2;
            w.c0.b(w.a, z, a0Var, (x0) null, (w.y0) null, (String) null, v1.d.d(-1571048364, new ez.n(z4, z0Var4, aVar, onComplete, onDismiss, f1Var, 4), g0Var2), g0Var3, 1573254, 28);
            g0Var3.r(true);
            g0Var3.r(true);
            int iOrdinal3 = aVar3.ordinal();
            if (iOrdinal3 == 0) {
                f2 = f3;
            } else {
                if (iOrdinal3 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                f2 = f4;
            }
            r rVarD = z1.d(h0.c.C(rVar3, f2), 1.0f);
            int iOrdinal4 = aVar3.ordinal();
            if (iOrdinal4 == 0) {
                rVarM2 = h0.c.M(rVar3, h0.c.e);
            } else {
                if (iOrdinal4 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                rVarM2 = rVar3;
            }
            Object objN10 = g0Var3.N();
            Object obj3 = obj;
            if (objN10 == obj3) {
                objN10 = new o2(z0Var5, 29);
                g0Var3.n0(objN10);
            }
            r rVarV3 = rVarD.V(z2.d0.o(rVarM2, (u00.k) objN10));
            v1 v1VarA = t1.a(h0.i.g, b2.b.K, g0Var3, 54);
            int iHashCode4 = Long.hashCode(g0Var3.T);
            m1 m1VarM4 = g0Var3.m();
            r rVarC4 = b2.a.c(rVarV3, g0Var3);
            g0Var3.g0();
            if (g0Var3.S) {
                g0Var3.l((u00.a) r46);
            } else {
                g0Var3.q0();
            }
            q.I(v1VarA, g0Var3, nVar3);
            q.I(m1VarM4, g0Var3, fVar);
            a1.b.v(iHashCode4, g0Var3, fVar2, g0Var3, eVar);
            q.I(rVarC4, g0Var3, fVar3);
            p0.e eVar2 = p0.f.a;
            float f5 = 0;
            float f6 = 44;
            long j = dl.a.P;
            long jB = t.b(0.5f, j);
            boolean z5 = ((i3 & 57344) == 16384) | ((i3 & 7168) == 2048);
            Object objN11 = g0Var3.N();
            if (z5 || objN11 == obj3) {
                objN11 = new po.e(onComplete, onDismiss, 2);
                g0Var3.n0(objN11);
            }
            w50.c.f((u00.a) objN11, cVarD, null, false, false, 0.0f, new y3.f(f6), 0L, jB, 10.0f, eVar2, f5, b, g0Var3, 806879232, 432, 188);
            g0Var = g0Var3;
            if (((Boolean) z0Var4.getValue()).booleanValue() || z4) {
                g0Var.c0(1675197463);
                h0.c.h(z1.m(rVar3, 48), g0Var);
                g0Var.r(false);
            } else {
                g0Var.c0(1674589212);
                float f7 = 48;
                long jB2 = t.b(0.5f, j);
                Object objN12 = g0Var.N();
                if (objN12 == obj3) {
                    objN12 = new gv.z0(z0Var6, z0Var4, 1);
                    g0Var.n0(objN12);
                }
                w50.c.f((u00.a) objN12, cVarD, null, false, false, f6, null, 0L, jB2, f7, null, 0.0f, c, g0Var, 805502982, 384, 3292);
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
            r1VarT.d = new cz.g(reciters, favoriteReciterIds, onToggleFavorite, onComplete, onDismiss, i, 10);
        }
    }

    public static final void i(final bx.c cVar, final float f, final long j, j jVar, final int i) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(373983182);
        int i2 = i | (g0Var.i(cVar) ? 4 : 2);
        if (g0Var.S(i2 & 1, (i2 & 147) != 146)) {
            wb.h hVar = new wb.h((Context) g0Var.k(o0.b));
            String str = cVar.e;
            if (str.length() <= 0) {
                str = null;
            }
            hVar.c = str;
            mb.j jVarI = mb.l.i(w.c.q(hVar, 600), (p) null, g0Var, 0, 62);
            boolean z = jVarI.j() instanceof mb.g;
            o oVar = o.A;
            if (z) {
                g0Var.c0(188261616);
                n.c(jVarI, (String) null, f2.h.c(z1.m(oVar, f), p0.f.a), (b2.d) null, z2.o.a, 0.0f, g0Var, 24624, 104);
                g0Var.r(false);
            } else {
                g0Var.c0(188508097);
                r rVarF = n.f(f2.h.c(z1.m(oVar, f), p0.f.a), t.b(0.12f, t.c), b0.b);
                w0 w0VarD = h0.o.d(b2.b.E, false);
                int iHashCode = Long.hashCode(g0Var.T);
                m1 m1VarM = g0Var.m();
                r rVarC = b2.a.c(rVarF, g0Var);
                i.c.getClass();
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
                String str2 = cVar.c;
                if (str2 == null) {
                    str2 = cVar.b;
                }
                z6.b(r30.k.h1(1, str2), (r) null, t.b(0.6f, dl.a.k), j, q3.u.L, (q3.i) null, 0L, (x3.l) null, (x3.k) null, 0L, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 1597440, 0, 262058);
                g0Var = g0Var;
                g0Var.r(true);
                g0Var.r(false);
            }
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new u00.n(f, j, i) {
                public final float B;
                public final long C;

                @Override
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iK = q.K(441);
                    a.i(this.A, this.B, this.C, (j) obj, iK);
                    return g00.b0.a;
                }
            };
        }
    }

    public static final void j(bx.c cVar, r rVar, j jVar, int i) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(-1686708297);
        int i2 = (g0Var.i(cVar) ? 4 : 2) | i;
        if (g0Var.S(i2 & 1, (i2 & 19) != 18)) {
            wb.h hVar = new wb.h((Context) g0Var.k(o0.b));
            String str = cVar.e;
            if (str.length() <= 0) {
                str = null;
            }
            hVar.c = str;
            hVar.c(600);
            mb.j jVarI = mb.l.i(hVar.a(), (p) null, g0Var, 0, 62);
            w0 w0VarD = h0.o.d(b2.b.A, false);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            r rVarC = b2.a.c(rVar, g0Var);
            i.c.getClass();
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
            if (jVarI.j() instanceof mb.g) {
                g0Var.c0(-658962629);
                n.c(jVarI, (String) null, f2.h.b(z1.c, 180, (i2.o0) null), (b2.d) null, z2.o.a, 0.7f, g0Var, 221232, 72);
                g0Var.r(false);
            } else {
                g0Var.c0(-658531791);
                g0Var.r(false);
            }
            a0 a0Var = z1.c;
            long j = t.f;
            t tVar = new t(j);
            t tVar2 = new t(j);
            t tVar3 = new t(j);
            long j2 = dl.a.L;
            h0.o.a(n.e(a0Var, sg.f.P(va.a.S(new t[]{tVar, tVar2, tVar3, new t(j2)}), 0.0f, 0.0f, 14), (t0) null, 6), g0Var, 0);
            h0.o.a(n.e(a0Var, sg.f.P(va.a.S(new t[]{new t(t.b(0.0f, j2)), new t(t.b(0.35f, j2)), new t(t.b(0.7f, j2))}), 0.0f, 0.0f, 14), (t0) null, 6), g0Var, 0);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new c(cVar, rVar, i, 1);
        }
    }

    public static final void k(bx.c cVar, boolean z, boolean z2, gm.a aVar, u00.a aVar2, u00.a aVar3, j jVar, int i) {
        j jVar2 = (g0) jVar;
        jVar2.e0(1582989855);
        int i2 = i | (jVar2.i(cVar) ? 4 : 2) | (jVar2.h(z) ? 32 : 16) | (jVar2.h(z2) ? 256 : 128) | (jVar2.e(aVar.ordinal()) ? 2048 : 1024) | (jVar2.i(aVar2) ? 16384 : 8192) | (jVar2.i(aVar3) ? 131072 : 65536);
        if (jVar2.S(i2 & 1, (74899 & i2) != 74898)) {
            o oVar = o.A;
            r rVarE = h0.c.E(z1.d(oVar, 1.0f), 16, 0.0f, 2);
            b2.g gVar = b2.b.N;
            v vVarA = h0.u.a(h0.i.c, gVar, jVar2, 48);
            int iHashCode = Long.hashCode(((g0) jVar2).T);
            m1 m1VarM = jVar2.m();
            r rVarC = b2.a.c(rVarE, jVar2);
            i.c.getClass();
            g gVar2 = h.b;
            jVar2.g0();
            if (((g0) jVar2).S) {
                jVar2.l(gVar2);
            } else {
                jVar2.q0();
            }
            b3.f fVar = h.f;
            q.I(vVarA, jVar2, fVar);
            b3.f fVar2 = h.e;
            q.I(m1VarM, jVar2, fVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar3 = h.g;
            q.I(numValueOf, jVar2, fVar3);
            b3.e eVar = h.h;
            q.E(jVar2, eVar);
            b3.f fVar4 = h.d;
            q.I(rVarC, jVar2, fVar4);
            r rVarG = h0.c.G(oVar, 0.0f, 56, 0.0f, 0.0f, 13);
            v vVarA2 = h0.u.a(h0.i.g(12), gVar, jVar2, 54);
            int iHashCode2 = Long.hashCode(((g0) jVar2).T);
            m1 m1VarM2 = jVar2.m();
            r rVarC2 = b2.a.c(rVarG, jVar2);
            jVar2.g0();
            if (((g0) jVar2).S) {
                jVar2.l(gVar2);
            } else {
                jVar2.q0();
            }
            q.I(vVarA2, jVar2, fVar);
            q.I(m1VarM2, jVar2, fVar2);
            a1.b.v(iHashCode2, jVar2, fVar3, jVar2, eVar);
            q.I(rVarC2, jVar2, fVar4);
            c0.g(((i2 >> 3) & 14) | 3072 | ((i2 >> 9) & 112), (r) null, jVar2, aVar2, v1.d.d(177383668, new a1.w(cVar, 20), jVar2), z);
            jVar2.r(true);
            r rVarV = z1.e(oVar, 100).V(aVar == gm.a.A ? z1.d(oVar, 1.0f) : z1.q(oVar, 350));
            w0 w0VarD = h0.o.d(b2.b.E, false);
            int iHashCode3 = Long.hashCode(((g0) jVar2).T);
            m1 m1VarM3 = jVar2.m();
            r rVarC3 = b2.a.c(rVarV, jVar2);
            jVar2.g0();
            if (((g0) jVar2).S) {
                jVar2.l(gVar2);
            } else {
                jVar2.q0();
            }
            q.I(w0VarD, jVar2, fVar);
            q.I(m1VarM3, jVar2, fVar2);
            a1.b.v(iHashCode3, jVar2, fVar3, jVar2, eVar);
            q.I(rVarC3, jVar2, fVar4);
            a0 a0Var = z1.c;
            w wVar = w.a;
            jVar2 = jVar2;
            w.c0.b(wVar, z, a0Var, (x0) null, (w.y0) null, (String) null, v1.d.d(-1551076749, new h1.x0(5, aVar2), jVar2), jVar2, 1573254 | (i2 & 112), 28);
            w.c0.b(wVar, !z, a0Var, (x0) null, (w.y0) null, (String) null, v1.d.d(-419641622, new e1.f(z2, aVar3, 4), jVar2), jVar2, 1573254, 28);
            jVar2.r(true);
            jVar2.r(true);
        } else {
            jVar2.V();
        }
        r1 r1VarT = jVar2.t();
        if (r1VarT != null) {
            r1VarT.d = new iz.f(cVar, z, z2, aVar, aVar2, aVar3, i);
        }
    }
}
