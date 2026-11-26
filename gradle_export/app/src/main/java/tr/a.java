package tr;

import android.content.res.Configuration;
import android.icu.text.DateFormat;
import android.icu.util.Calendar;
import b2.b;
import b2.d;
import b2.r;
import b3.f;
import b3.g;
import b3.h;
import c3.o0;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.internal.measurement.z3;
import g00.b0;
import g1.o3;
import g1.z6;
import h0.c1;
import h0.i;
import h0.s;
import h0.t1;
import h0.u;
import h0.v;
import h0.v1;
import h0.z1;
import i2.n0;
import i2.t;
import java.util.Locale;
import kh.o;
import kotlin.jvm.internal.m;
import l1.f1;
import l1.g0;
import l1.j;
import l1.m1;
import l1.q;
import l1.r1;
import l1.y0;
import m3.r0;
import ro.e;
import u00.n;
import v1.c;
import x3.k;
import x3.l;
import z2.w0;

public abstract class a {
    public static final c a = new c(new ny.a(16), -1538727444, false);

    public static final void a(r rVar, j jVar, int i) {
        boolean z;
        Object obj;
        g0 g0Var = (g0) jVar;
        g0Var.e0(972052248);
        if (g0Var.S(i & 1, (i & 3) != 2)) {
            v vVarA = u.a(i.g(12), b.N, g0Var, 54);
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
            q.I(vVarA, g0Var, h.f);
            q.I(m1VarM, g0Var, h.e);
            q.I(Integer.valueOf(iHashCode), g0Var, h.g);
            q.E(g0Var, h.h);
            q.I(rVarC, g0Var, h.d);
            d(g0Var, 0);
            String strU = z3.U(g0Var, 2131886326);
            long j = dl.a.i;
            z6.b(strU, (r) null, j, o.z(20), q3.u.L, (q3.i) null, 0L, (l) null, (k) null, 0L, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 1597440, 0, 262058);
            Locale locale = ((Configuration) g0Var.k(o0.a)).getLocales().get(0);
            boolean zG = g0Var.g(locale);
            Object objN = g0Var.N();
            if (zG || objN == l1.i.a) {
                Calendar calendar = Calendar.getInstance(locale);
                calendar.clear();
                calendar.set(2026, 10, 12);
                z = true;
                obj = DateFormat.getDateInstance(1, locale).format(calendar.getTime());
                g0Var.n0(obj);
            } else {
                obj = objN;
                z = true;
            }
            String str = (String) obj;
            m.b(str);
            z6.b(z3.T(2131886328, new Object[]{"2.4.1", str}, g0Var), (r) null, j, o.z(15), (q3.u) null, (q3.i) null, 0L, (l) null, new k(3), 0L, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 24576, 0, 261098);
            g0Var = g0Var;
            g0Var.r(z);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new e(rVar, i, 4);
        }
    }

    public static final void b(int i, int i2, j jVar, int i3) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(-1356030797);
        int i4 = (g0Var.e(i) ? 4 : 2) | i3 | (g0Var.e(i2) ? 32 : 16);
        if (g0Var.S(i4 & 1, (i4 & 19) != 18)) {
            b2.o oVar = b2.o.A;
            r rVarC = h0.c.C(z1.d(oVar, 1.0f), 16);
            v1 v1VarA = t1.a(i.g(12), b.K, g0Var, 54);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            r rVarC2 = b2.a.c(rVarC, g0Var);
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
            m2.b bVarR = y3.R(i, g0Var, i4 & 14);
            long j = dl.a.i;
            o3.a(bVarR, (String) null, z1.m(oVar, 22), j, g0Var, 440, 0);
            String strU = z3.U(g0Var, i2);
            long jB = t.b(0.92f, j);
            long jZ = o.z(15);
            long jZ2 = o.z(20);
            if (1.0f <= 0.0d) {
                i0.a.a("invalid weight; must be greater than zero");
            }
            z6.b(strU, new c1(1.0f, true), jB, jZ, (q3.u) null, (q3.i) null, 0L, (l) null, (k) null, jZ2, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 24576, 48, 260072);
            g0Var = g0Var;
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new eu.l(i, i2, i3, 1);
        }
    }

    public static final void c(u00.a onContactUs, r rVar, j jVar, int i) {
        g0 g0Var;
        m.e(onContactUs, "onContactUs");
        g0 g0Var2 = (g0) jVar;
        g0Var2.e0(-276926832);
        int i2 = (g0Var2.i(onContactUs) ? 4 : 2) | i;
        if (g0Var2.S(i2 & 1, (i2 & 19) != 18)) {
            r rVarD = z1.d(rVar, 1.0f);
            v1 v1VarA = t1.a(i.e, b.J, g0Var2, 6);
            int iHashCode = Long.hashCode(g0Var2.T);
            m1 m1VarM = g0Var2.m();
            r rVarC = b2.a.c(rVarD, g0Var2);
            b3.i.c.getClass();
            g gVar = h.b;
            g0Var2.g0();
            if (g0Var2.S) {
                g0Var2.l(gVar);
            } else {
                g0Var2.q0();
            }
            q.I(v1VarA, g0Var2, h.f);
            q.I(m1VarM, g0Var2, h.e);
            q.I(Integer.valueOf(iHashCode), g0Var2, h.g);
            q.E(g0Var2, h.h);
            q.I(rVarC, g0Var2, h.d);
            z6.b(z3.U(g0Var2, 2131886320), (r) null, t.b(0.55f, dl.a.i), o.z(14), (q3.u) null, (q3.i) null, 0L, (l) null, (k) null, 0L, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var2, 24576, 0, 262122);
            z6.b(z3.U(g0Var2, 2131886319), w50.c.n(h0.c.G(b2.o.A, 4, 0.0f, 0.0f, 0.0f, 14), true, onContactUs), dl.a.G, o.z(14), (q3.u) null, (q3.i) null, 0L, (l) null, (k) null, 0L, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var2, 24576, 0, 262120);
            g0Var = g0Var2;
            g0Var.r(true);
        } else {
            g0Var = g0Var2;
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new ev.m(onContactUs, rVar, i, 10);
        }
    }

    public static final void d(j jVar, int i) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(-669281639);
        if (g0Var.S(i & 1, i != 0)) {
            Object objN = g0Var.N();
            l1.c cVar = l1.i.a;
            Object obj = objN;
            if (objN == cVar) {
                int[] iArr = {2131231175, 2131231205, 2131231383, 2131231390, 2131231083};
                g0Var.n0(iArr);
                obj = iArr;
            }
            int[] iArr2 = (int[]) obj;
            Object objN2 = g0Var.N();
            if (objN2 == cVar) {
                objN2 = oi.k.s(0, g0Var);
            }
            f1 f1Var = (y0) objN2;
            boolean zI = g0Var.i(iArr2);
            Object objN3 = g0Var.N();
            if (zI || objN3 == cVar) {
                objN3 = new rm.c(iArr2, f1Var, null, 11);
                g0Var.n0(objN3);
            }
            q.i(b0.a, g0Var, (n) objN3);
            b2.o oVar = b2.o.A;
            r rVarM = z1.m(oVar, 120);
            b2.i iVar = b.E;
            w0 w0VarD = h0.o.d(iVar, false);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            r rVarC = b2.a.c(rVarM, g0Var);
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
            r rVarB = s.a.b();
            Float fValueOf = Float.valueOf(0.0f);
            long j = dl.a.G;
            n0 n0VarO = sg.f.O(new g00.k[]{new g00.k(fValueOf, new t(t.b(0.5f, j))), new g00.k(Float.valueOf(0.4f), new t(t.b(0.24f, j))), new g00.k(Float.valueOf(1.0f), new t(t.f))});
            p0.e eVar2 = p0.f.a;
            h0.o.a(z.n.e(rVarB, n0VarO, eVar2, 4), g0Var, 0);
            r rVarF = z.n.f(z1.m(oVar, 76), j, eVar2);
            w0 w0VarD2 = h0.o.d(iVar, false);
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
            Integer numValueOf2 = Integer.valueOf(iArr2[f1Var.h()]);
            Object objN4 = g0Var.N();
            if (objN4 == cVar) {
                objN4 = new r9.e(15);
                g0Var.n0(objN4);
            }
            w.m.a(numValueOf2, (r) null, (u00.k) objN4, (d) null, "changeLogHeaderIcon", (u00.k) null, a, g0Var, 1597824, 42);
            g0Var.r(true);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new sw.a(i, 9);
        }
    }

    public static final void e(r rVar, j jVar, int i) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(1468531050);
        if (g0Var.S(i & 1, (i & 3) != 2)) {
            r rVarF = z.n.f(f2.h.c(rVar, p0.f.a(24)), t.b(0.08f, dl.a.i), i2.b0.b);
            v vVarA = u.a(i.c, b.M, g0Var, 0);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            r rVarC = b2.a.c(rVarF, g0Var);
            b3.i.c.getClass();
            g gVar = h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            q.I(vVarA, g0Var, h.f);
            q.I(m1VarM, g0Var, h.e);
            q.I(Integer.valueOf(iHashCode), g0Var, h.g);
            q.E(g0Var, h.h);
            q.I(rVarC, g0Var, h.d);
            b(2131231175, 2131886323, g0Var, 0);
            b(2131231205, 2131886322, g0Var, 0);
            b(2131231383, 2131886324, g0Var, 0);
            b(2131231390, 2131886325, g0Var, 0);
            b(2131231083, 2131886321, g0Var, 0);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new e(rVar, i, 5);
        }
    }
}
