package po;

import ab.a0;
import android.view.View;
import b2.r;
import c3.o0;
import com.google.android.gms.internal.measurement.z3;
import d0.o2;
import d40.n1;
import g1.z6;
import h0.t1;
import h0.v;
import h0.v1;
import h0.z1;
import l1.g0;
import l1.m1;
import l1.q;
import l1.r1;
import l1.z0;
import lo.t;
import m3.r0;
import m3.z;
import q3.u;

public abstract class h {
    public static final r0 a = new r0(0, 0, (u) null, (q3.i) null, 0, 0, 0, 1, 0, (z) null, 16711679);

    public static final void a(n1 n1Var, Long l, u00.k onSeek, r rVar, l1.j jVar, int i) {
        r rVar2;
        z0 z0Var;
        b3.e eVar;
        z0 z0Var2;
        int i2;
        float f;
        long j;
        kotlin.jvm.internal.m.e(onSeek, "onSeek");
        g0 g0Var = (g0) jVar;
        g0Var.e0(-1839409147);
        int i3 = i | (g0Var.i(n1Var) ? 4 : 2) | (g0Var.g(l) ? 32 : 16) | (g0Var.i(onSeek) ? 256 : 128) | 3072;
        if (g0Var.S(i3 & 1, (i3 & 1171) != 1170)) {
            View view = (View) g0Var.k(o0.f);
            t tVar = (t) k00.f.q(n1Var, g0Var, i3 & 14).getValue();
            long j2 = tVar.a;
            long j3 = tVar.b;
            Object objN = g0Var.N();
            Object obj = l1.i.a;
            if (objN == obj) {
                objN = q.z((Object) null);
                g0Var.n0(objN);
            }
            z0 z0Var3 = (z0) objN;
            Object objN2 = g0Var.N();
            if (objN2 == obj) {
                objN2 = q.z(Boolean.FALSE);
                g0Var.n0(objN2);
            }
            z0 z0Var4 = (z0) objN2;
            float fX = 0.0f;
            float fX2 = (l == null || j3 <= 0) ? 1.0f : a0.x(l.longValue() / j3, 0.0f, 1.0f);
            Float f2 = (Float) z0Var3.getValue();
            if (f2 != null) {
                fX = f2.floatValue();
            } else if (j3 > 0) {
                fX = a0.x(j2 / j3, 0.0f, 1.0f);
            }
            float f3 = fX;
            long j4 = (long) (j3 * f3);
            String strU = z3.U(g0Var, 2131886142);
            boolean zG = g0Var.g(strU);
            Object objN3 = g0Var.N();
            if (zG || objN3 == obj) {
                objN3 = new hb.u(strU, 22);
                g0Var.n0(objN3);
            }
            r rVar3 = b2.o.A;
            r rVarC = j3.q.c(rVar3, false, (u00.k) objN3);
            v vVarA = h0.u.a(h0.i.g(4), b2.b.M, g0Var, 6);
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
            b3.f fVar = b3.h.f;
            q.I(vVarA, g0Var, fVar);
            b3.f fVar2 = b3.h.e;
            q.I(m1VarM, g0Var, fVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar3 = b3.h.g;
            q.I(numValueOf, g0Var, fVar3);
            b3.e eVar2 = b3.h.h;
            q.E(g0Var, eVar2);
            b3.f fVar4 = b3.h.d;
            q.I(rVarC2, g0Var, fVar4);
            r rVarD = z1.d(rVar3, 1.0f);
            long j5 = dl.a.n;
            long jB = i2.t.b(0.2f, i2.t.c);
            float f4 = 6;
            boolean zD = g0Var.d(fX2) | g0Var.i(view);
            Object objN4 = g0Var.N();
            if (zD || objN4 == obj) {
                z0Var = z0Var4;
                eVar = eVar2;
                z0Var2 = z0Var3;
                objN4 = new fy.t(fX2, view, z0Var, z0Var2);
                g0Var.n0(objN4);
            } else {
                z0Var = z0Var4;
                eVar = eVar2;
                z0Var2 = z0Var3;
            }
            u00.k kVar = (u00.k) objN4;
            boolean zF = g0Var.f(j3) | ((i3 & 896) == 256);
            Object objN5 = g0Var.N();
            if (zF || objN5 == obj) {
                i2 = 6;
                f = 1.0f;
                objN5 = new e00.q(onSeek, j3, z0Var2, z0Var);
                j = j3;
                g0Var.n0(objN5);
            } else {
                j = j3;
                i2 = 6;
                f = 1.0f;
            }
            u00.k kVar2 = (u00.k) objN5;
            Object objN6 = g0Var.N();
            if (objN6 == obj) {
                objN6 = new o2(z0Var2, 18);
                g0Var.n0(objN6);
            }
            b3.e eVar3 = eVar;
            gv.p.D(f3, kVar, kVar2, (u00.k) objN6, rVarD, null, j5, jB, f4, 0.0f, g0Var, 113273856, 544);
            r rVarD2 = z1.d(rVar3, f);
            v1 v1VarA = t1.a(h0.i.g, b2.b.J, g0Var, i2);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            r rVarC3 = b2.a.c(rVarD2, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            q.I(v1VarA, g0Var, fVar);
            q.I(m1VarM2, g0Var, fVar2);
            a1.b.v(iHashCode2, g0Var, fVar3, g0Var, eVar3);
            q.I(rVarC3, g0Var, fVar4);
            String strS = c7.i.s(j4);
            long jZ = kh.o.z(11);
            long j6 = dl.a.p;
            r0 r0Var = a;
            z6.b(strS, (r) null, j6, jZ, (u) null, (q3.i) null, 0L, (x3.l) null, (x3.k) null, 0L, 0, false, 0, 0, (u00.k) null, r0Var, g0Var, 24576, 12582912, 131050);
            long j7 = j - j4;
            z6.b("-".concat(c7.i.s(j7 >= 0 ? j7 : 0L)), (r) null, j6, kh.o.z(11), (u) null, (q3.i) null, 0L, (x3.l) null, (x3.k) null, 0L, 0, false, 0, 0, (u00.k) null, r0Var, g0Var, 24576, 12582912, 131050);
            g0Var = g0Var;
            g0Var.r(true);
            g0Var.r(true);
            rVar2 = rVar3;
        } else {
            g0Var.V();
            rVar2 = rVar;
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new dz.k(n1Var, l, onSeek, rVar2, i, 13);
        }
    }
}
