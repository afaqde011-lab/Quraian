package lz;

import a40.z;
import b2.r;
import b3.g;
import b3.h;
import c3.g1;
import c3.o1;
import com.google.android.gms.internal.measurement.z3;
import dl.e;
import eu.d;
import h0.a0;
import h0.b;
import h0.f;
import h0.m2;
import h0.o;
import h0.p1;
import h0.s;
import h0.t0;
import h0.z1;
import h1.v0;
import i2.b0;
import i2.t;
import j0.v;
import j0.x;
import java.util.WeakHashMap;
import kotlin.jvm.internal.m;
import l1.g0;
import l1.i;
import l1.j;
import l1.m1;
import l1.p2;
import l1.q;
import l1.r1;
import qd.s0;
import u00.k;
import v1.c;
import z.n;
import z2.w0;

public abstract class a {
    public static final c a = new c(new lu.a(1), -1761913387, false);
    public static final c b = new c(new lu.a(2), 2008818174, false);
    public static final c c = new c(new lu.a(3), -991730275, false);
    public static final c d = new c(new lu.a(4), 1597107419, false);
    public static final c e = new c(new lu.a(5), -1403441030, false);
    public static final c f = new c(new lu.a(6), -1705998978, false);

    public static final void a(u00.a aVar, j jVar, int i) {
        g0 g0Var;
        g0 g0Var2 = (g0) jVar;
        g0Var2.e0(1671339600);
        int i2 = i | (g0Var2.i(aVar) ? 4 : 2);
        if (g0Var2.S(i2 & 1, (i2 & 3) != 2)) {
            boolean z = g0Var2.k(e.a) == gm.a.A;
            kk.c cVarD = kk.e.d(g0Var2);
            g1 g1Var = (g1) g0Var2.k(o1.f);
            WeakHashMap weakHashMap = m2.w;
            t0 t0VarL = h0.c.l(b.e(g0Var2).g, g0Var2);
            v vVarA = x.a(0, g0Var2, 3);
            p2 p2VarB = sm.a.b(vVarA, g0Var2);
            Object objN = g0Var2.N();
            Object obj = i.a;
            if (objN == obj) {
                objN = q.o(g0Var2);
                g0Var2.n0(objN);
            }
            z zVar = (z) objN;
            a0 a0Var = z1.c;
            r rVarF = n.f(a0Var, dl.a.L, b0.b);
            b2.i iVar = b2.b.A;
            w0 w0VarD = o.d(iVar, false);
            int iHashCode = Long.hashCode(g0Var2.T);
            m1 m1VarM = g0Var2.m();
            r rVarC = b2.a.c(rVarF, g0Var2);
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
            r rVarA = kk.e.a(a0Var, cVarD);
            float f2 = 24;
            p1 p1VarG = h0.c.g(0.0f, 0, 0.0f, t0VarL.a() + f2, 5);
            f fVarG = h0.i.g(f2);
            boolean zI = g0Var2.i(zVar) | g0Var2.i(g1Var);
            Object objN2 = g0Var2.N();
            if (zI || objN2 == obj) {
                objN2 = new v0(zVar, g1Var, 26);
                g0Var2.n0(objN2);
            }
            k00.f.d(rVarA, vVarA, p1VarG, fVarG, null, null, false, null, (k) objN2, g0Var2, 24576, 488);
            b2.i iVar2 = b2.b.B;
            s sVar = s.a;
            b2.o oVar = b2.o.A;
            sm.a.a(z3.U(g0Var2, 2131886800), ((Number) p2VarB.getValue()).floatValue(), sVar.a(oVar, iVar2), 0.0f, g0Var2, 0);
            float fC = 16;
            r rVarE = h0.c.E(oVar, fC, 0.0f, 2);
            if (z) {
                fC = t0VarL.c();
            }
            w50.c.f(aVar, cVarD, sVar.a(h0.c.G(rVarE, 0.0f, fC, 0.0f, 0.0f, 13), iVar), false, false, 0.0f, null, 0L, t.b(0.5f, dl.a.P), 10.0f, p0.f.a, 0.0f, f, g0Var2, (i2 & 14) | 805306368, 384, 2296);
            g0Var = g0Var2;
            g0Var.r(true);
        } else {
            g0Var = g0Var2;
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new d(aVar, i, 14);
        }
    }

    public static final void b(boolean z, u00.a onDismiss, j jVar, int i) {
        int i2;
        u00.a aVar;
        m.e(onDismiss, "onDismiss");
        g0 g0Var = (g0) jVar;
        g0Var.e0(-164136817);
        if ((i & 6) == 0) {
            i2 = (g0Var.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= g0Var.i(onDismiss) ? 32 : 16;
        }
        if (!g0Var.S(i2 & 1, (i2 & 19) != 18)) {
            aVar = onDismiss;
            g0Var.V();
        } else {
            if (!z) {
                r1 r1VarT = g0Var.t();
                if (r1VarT != null) {
                    r1VarT.d = new fz.c(z, onDismiss, i, 1);
                    return;
                }
                return;
            }
            boolean z2 = g0Var.k(e.a) == gm.a.A;
            aVar = onDismiss;
            s0.G(aVar, new c4.v(false, false, false, !z2, 231), v1.d.d(1913817126, new c00.n(onDismiss, z2), g0Var), g0Var, ((i2 >> 3) & 14) | 384, 0);
        }
        r1 r1VarT2 = g0Var.t();
        if (r1VarT2 != null) {
            r1VarT2.d = new fz.c(z, aVar, i, 2);
        }
    }
}
