package fv;

import android.content.Context;
import b2.r;
import b3.g;
import c00.m;
import c3.o0;
import com.google.android.gms.internal.measurement.y3;
import d6.t1;
import g1.o3;
import g1.z6;
import h0.c1;
import h0.o;
import h0.s;
import h0.v1;
import h0.z1;
import i2.b0;
import i2.t;
import l1.g0;
import l1.i;
import l1.j;
import l1.m1;
import l1.q;
import l1.r1;
import m3.r0;
import mb.l;
import p0.f;
import q3.u;
import u00.k;
import wb.h;
import z.n;
import z2.p;
import z2.w0;

public abstract class c {
    public static final float a = 44;

    public static final void a(String str, r rVar, j jVar, int i) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(-1914041098);
        int i2 = (g0Var.g(str) ? 4 : 2) | i | (g0Var.g(rVar) ? 32 : 16);
        if (g0Var.S(i2 & 1, (i2 & 19) != 18)) {
            Context context = (Context) g0Var.k(o0.b);
            boolean zG = ((i2 & 14) == 4) | g0Var.g(context);
            Object objN = g0Var.N();
            if (zG || objN == i.a) {
                h hVar = new h(context);
                hVar.c = str.length() > 0 ? str : null;
                hVar.c(132);
                hVar.b();
                objN = hVar.a();
                g0Var.n0(objN);
            }
            wb.i iVar = (wb.i) objN;
            r rVarC = f2.h.c(rVar, f.a);
            long j = dl.a.i;
            r rVarF = n.f(rVarC, t.b(0.15f, j), b0.b);
            w0 w0VarD = o.d(b2.b.E, false);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            r rVarC2 = b2.a.c(rVarF, g0Var);
            b3.i.c.getClass();
            g gVar = b3.h.b;
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
            q.I(rVarC2, g0Var, b3.h.d);
            o3.a(y3.R(2131231356, g0Var, 0), (String) null, z1.m(b2.o.A, 16), t.b(0.7f, j), g0Var, 440, 0);
            n.c(l.i(iVar, (p) null, g0Var, 0, 62), (String) null, s.a.b(), (b2.d) null, z2.o.a, 0.0f, g0Var, 24624, 104);
            g0Var = g0Var;
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new m(str, rVar, i, 1);
        }
    }

    public static final void b(final bx.c cVar, final boolean z, final boolean z2, final boolean z3, final u00.a onClick, r rVar, j jVar, final int i) {
        final r rVar2;
        kotlin.jvm.internal.m.e(onClick, "onClick");
        g0 g0Var = (g0) jVar;
        g0Var.e0(-17480993);
        int i2 = i | (g0Var.i(cVar) ? 4 : 2) | (g0Var.h(z) ? 32 : 16) | (g0Var.h(z2) ? 256 : 128) | (g0Var.h(z3) ? 2048 : 1024) | (g0Var.i(onClick) ? 16384 : 8192) | 196608;
        if (g0Var.S(i2 & 1, (74899 & i2) != 74898)) {
            r rVar3 = b2.o.A;
            r rVarC = h0.c.C(w50.c.n(z1.d(rVar3, 1.0f), z2 && z3, onClick), 16);
            boolean z4 = (i2 & 112) == 32;
            Object objN = g0Var.N();
            if (z4 || objN == i.a) {
                objN = new t1(1, z);
                g0Var.n0(objN);
            }
            r rVarC2 = j3.q.c(rVarC, false, (k) objN);
            v1 v1VarA = h0.t1.a(h0.i.g(12), b2.b.K, g0Var, 54);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            r rVarC3 = b2.a.c(rVarC2, g0Var);
            b3.i.c.getClass();
            g gVar = b3.h.b;
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
            q.I(rVarC3, g0Var, b3.h.d);
            a(cVar.e, f2.h.a(z1.m(rVar3, a), z2 ? 1.0f : 0.4f), g0Var, 0);
            String str = cVar.b;
            long jB = z2 ? dl.a.i : t.b(0.5f, dl.a.i);
            long jZ = kh.o.z(17);
            long jZ2 = kh.o.z(22);
            u uVar = u.L;
            if (1.0f <= 0.0d) {
                i0.a.a("invalid weight; must be greater than zero");
            }
            z6.b(str, new c1(1.0f, true), jB, jZ, uVar, (q3.i) null, 0L, (x3.l) null, (x3.k) null, jZ2, 2, false, 1, 0, (k) null, (r0) null, g0Var, 1597440, 25008, 239528);
            g0Var = g0Var;
            if (z) {
                g0Var.c0(-154156275);
                o3.a(y3.R(2131231094, g0Var, 0), (String) null, z1.m(rVar3, 20), dl.a.i, g0Var, 440, 0);
                g0Var.r(false);
            } else {
                g0Var.c0(-153944545);
                g0Var.r(false);
            }
            g0Var.r(true);
            rVar2 = rVar3;
        } else {
            g0Var.V();
            rVar2 = rVar;
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new u00.n(z, z2, z3, onClick, rVar2, i) {
                public final boolean B;
                public final boolean C;
                public final boolean D;
                public final u00.a E;
                public final r F;

                @Override
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iK = q.K(9);
                    c.b(this.A, this.B, this.C, this.D, this.E, this.F, (j) obj, iK);
                    return g00.b0.a;
                }
            };
        }
    }
}
