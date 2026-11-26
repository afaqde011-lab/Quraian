package yy;

import b2.o;
import b2.r;
import b3.g;
import com.google.android.gms.internal.measurement.x5;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.internal.measurement.z3;
import f2.h;
import g1.o3;
import g1.z6;
import h0.c1;
import h0.t1;
import h0.v;
import h0.v1;
import h0.z1;
import i2.b0;
import i2.o0;
import i2.t;
import kotlin.NoWhenBranchMatchedException;
import l1.g0;
import l1.j;
import l1.m1;
import l1.q;
import l1.r1;
import m3.r0;
import p0.f;
import pz.m;
import q3.i;
import q3.u;
import ro.e;
import wr.k;
import x3.l;
import z.n;
import z2.w0;

public abstract class a {
    public static final v1.c a = new v1.c(new m(25), -50310359, false);
    public static final v1.c b = new v1.c(new m(26), -139580640, false);

    public static final void a(boolean z, u00.a onDismiss, u00.a onCancelClicked, u00.a onConfirmClicked, j jVar, int i) {
        int i2;
        u00.a aVar;
        u00.a aVar2;
        r1 r1VarT;
        fz.b bVar;
        kotlin.jvm.internal.m.e(onDismiss, "onDismiss");
        kotlin.jvm.internal.m.e(onCancelClicked, "onCancelClicked");
        kotlin.jvm.internal.m.e(onConfirmClicked, "onConfirmClicked");
        g0 g0Var = (g0) jVar;
        g0Var.e0(2056257054);
        if ((i & 6) == 0) {
            i2 = (g0Var.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= g0Var.i(onDismiss) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= g0Var.i(onCancelClicked) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= g0Var.i(onConfirmClicked) ? 2048 : 1024;
        }
        if (g0Var.S(i2 & 1, (i2 & 1171) != 1170)) {
            if (z) {
                aVar = onCancelClicked;
                aVar2 = onConfirmClicked;
                k.H(null, null, onDismiss, n.g(z1.q(o.A, 350), 1, t.b(0.8f, dl.a.J), f.a(32)), 0L, null, null, v1.d.d(1333946719, new eu.f(aVar, aVar2, 6), g0Var), g0Var, ((i2 << 3) & 896) | 12582966, 112);
            } else {
                r1VarT = g0Var.t();
                if (r1VarT == null) {
                    return;
                } else {
                    bVar = new fz.b(z, onDismiss, onCancelClicked, onConfirmClicked, i, 1);
                }
            }
            r1VarT.d = bVar;
        }
        aVar = onCancelClicked;
        aVar2 = onConfirmClicked;
        g0Var.V();
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            bVar = new fz.b(z, onDismiss, aVar, aVar2, i, 2);
            r1VarT.d = bVar;
        }
    }

    public static final void b(r rVar, j jVar, int i) {
        j jVar2;
        r rVar2;
        j jVar3 = (g0) jVar;
        jVar3.e0(743556467);
        int i2 = i | 6;
        if (jVar3.S(i2 & 1, (i2 & 3) != 2)) {
            String strU = z3.U(jVar3, 2131886397);
            long jZ = kh.o.z(32);
            long jZ2 = kh.o.z(32);
            u uVar = u.D;
            long j = dl.a.n;
            jVar2 = jVar3;
            rVar2 = o.A;
            z6.b(strU, rVar2, j, jZ, uVar, (i) null, 0L, (l) null, (x3.k) null, jZ2, 2, false, 0, 0, (u00.k) null, (r0) null, jVar2, 1597488, 432, 255912);
        } else {
            jVar2 = jVar3;
            jVar2.V();
            rVar2 = rVar;
        }
        r1 r1VarT = jVar2.t();
        if (r1VarT != null) {
            r1VarT.d = new e(rVar2, i, 11);
        }
    }

    public static final void c(String str, u00.a onCopyClicked, r rVar, j jVar, int i) {
        g0 g0Var;
        r rVar2;
        float f;
        int i2;
        float f2;
        kotlin.jvm.internal.m.e(onCopyClicked, "onCopyClicked");
        g0 g0Var2 = (g0) jVar;
        g0Var2.e0(1902119098);
        int i3 = i | (g0Var2.g(str) ? 4 : 2) | (g0Var2.i(onCopyClicked) ? 32 : 16) | 384;
        if (g0Var2.S(i3 & 1, (i3 & 147) != 146)) {
            gm.a aVar = (gm.a) g0Var2.k(dl.e.a);
            int iOrdinal = aVar.ordinal();
            if (iOrdinal == 0) {
                f = 20;
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                f = 24;
            }
            int iOrdinal2 = aVar.ordinal();
            if (iOrdinal2 == 0) {
                i2 = 44;
            } else {
                if (iOrdinal2 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = 50;
            }
            float f3 = i2;
            int iOrdinal3 = aVar.ordinal();
            if (iOrdinal3 == 0) {
                f2 = 20;
            } else {
                if (iOrdinal3 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                f2 = 24;
            }
            r rVar3 = o.A;
            r rVarC = h.c(z1.d(rVar3, 1.0f), f.a(f));
            long j = dl.a.i;
            long jB = t.b(0.08f, j);
            o0 o0Var = b0.b;
            r rVarC2 = h0.c.C(n.f(rVarC, jB, o0Var), 16);
            v1 v1VarA = t1.a(h0.i.g(12), b2.b.K, g0Var2, 54);
            int iHashCode = Long.hashCode(g0Var2.T);
            m1 m1VarM = g0Var2.m();
            r rVarC3 = b2.a.c(rVarC2, g0Var2);
            b3.i.c.getClass();
            g gVar = b3.h.b;
            g0Var2.g0();
            if (g0Var2.S) {
                g0Var2.l(gVar);
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
            q.I(rVarC3, g0Var2, fVar4);
            r rVarF = n.f(h.c(z1.m(rVar3, f3), f.a), t.b(0.12f, j), o0Var);
            w0 w0VarD = h0.o.d(b2.b.E, false);
            int iHashCode2 = Long.hashCode(g0Var2.T);
            m1 m1VarM2 = g0Var2.m();
            r rVarC4 = b2.a.c(rVarF, g0Var2);
            g0Var2.g0();
            if (g0Var2.S) {
                g0Var2.l(gVar);
            } else {
                g0Var2.q0();
            }
            q.I(w0VarD, g0Var2, fVar);
            q.I(m1VarM2, g0Var2, fVar2);
            a1.b.v(iHashCode2, g0Var2, fVar3, g0Var2, eVar);
            q.I(rVarC4, g0Var2, fVar4);
            o3.a(y3.R(2131231356, g0Var2, 0), (String) null, z1.m(rVar3, f2), j, g0Var2, 56, 0);
            g0Var2.r(true);
            if (1.0f <= 0.0d) {
                i0.a.a("invalid weight; must be greater than zero");
            }
            c1 c1Var = new c1(1.0f, true);
            v vVarA = h0.u.a(h0.i.g(4), b2.b.M, g0Var2, 6);
            int iHashCode3 = Long.hashCode(g0Var2.T);
            m1 m1VarM3 = g0Var2.m();
            r rVarC5 = b2.a.c(c1Var, g0Var2);
            g0Var2.g0();
            if (g0Var2.S) {
                g0Var2.l(gVar);
            } else {
                g0Var2.q0();
            }
            q.I(vVarA, g0Var2, fVar);
            q.I(m1VarM3, g0Var2, fVar2);
            a1.b.v(iHashCode3, g0Var2, fVar3, g0Var2, eVar);
            q.I(rVarC5, g0Var2, fVar4);
            String strU = z3.U(g0Var2, 2131886400);
            u uVar = u.E;
            long jZ = kh.o.z(16);
            long jZ2 = kh.o.z(20);
            long j2 = dl.a.k;
            k00.f.a(strU, null, j2, jZ, new y3.o(jZ2), uVar, null, 1, 0.0f, null, g0Var2, 12807168, 834);
            z6.b(str.length() <= 18 ? str : x5.m(r30.k.h1(8, str), "...", r30.k.i1(10, str)), (r) null, t.b(0.5f, j2), kh.o.z(13), u.B, (i) null, 0L, (l) null, (x3.k) null, kh.o.z(18), 2, false, 1, 0, (u00.k) null, (r0) null, g0Var2, 1597440, 25008, 239530);
            g0Var2.r(true);
            z6.b(z3.U(g0Var2, 2131886399), h0.c.D(w50.c.n(n.f(h.c(rVar3, f.a(32)), t.b(0.12f, j), o0Var), true, onCopyClicked), 14, 8), j2, kh.o.z(14), u.D, (i) null, 0L, (l) null, (x3.k) null, 0L, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var2, 1597440, 0, 262056);
            g0Var = g0Var2;
            g0Var.r(true);
            rVar2 = rVar3;
        } else {
            g0Var = g0Var2;
            g0Var.V();
            rVar2 = rVar;
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new hy.c(str, onCopyClicked, rVar2, i, 1);
        }
    }
}
