package mu;

import a1.s1;
import as.h0;
import c3.o1;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.internal.measurement.z3;
import g1.z6;
import gv.f0;
import h0.z1;
import h1.v0;
import i2.b0;
import l1.g0;
import l1.m1;
import l1.r1;
import m3.r0;
import z2.w0;

public abstract class m {
    public static final float a = 72;

    public static final void a(ju.f fVar, u00.a aVar, boolean z, b2.r rVar, boolean z2, l1.j jVar, int i, int i2) {
        boolean z3;
        int i3;
        boolean z4;
        g0 g0Var = (g0) jVar;
        g0Var.e0(-637567292);
        int i4 = i | (g0Var.g(fVar) ? 4 : 2) | (g0Var.i(aVar) ? 32 : 16) | (g0Var.h(z) ? 256 : 128);
        int i5 = i2 & 16;
        if (i5 != 0) {
            i3 = i4 | 24576;
            z3 = z2;
        } else {
            z3 = z2;
            i3 = i4 | (g0Var.h(z3) ? 16384 : 8192);
        }
        if (g0Var.S(i3 & 1, (i3 & 9363) != 9362)) {
            boolean z5 = i5 != 0 ? true : z3;
            Boolean boolValueOf = Boolean.valueOf(z);
            Boolean boolValueOf2 = Boolean.valueOf(z5);
            boolean z6 = ((i3 & 112) == 32) | ((i3 & 896) == 256) | ((57344 & i3) == 16384);
            Object objN = g0Var.N();
            if (z6 || objN == l1.i.a) {
                objN = new dq.t(z, z5, aVar, (k00.c) null);
                g0Var.n0(objN);
            }
            l1.q.h(boolValueOf, boolValueOf2, (u00.n) objN, g0Var);
            b2.r rVarV = rVar.V(z1.c);
            w0 w0VarD = h0.o.d(b2.b.E, false);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(rVarV, g0Var);
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
            m2.b bVarR = y3.R(2131230843, g0Var, 0);
            String strU = z3.U(g0Var, 2131886927);
            b2.o oVar = b2.o.A;
            z.n.c(bVarR, strU, z1.m(oVar, 100), (b2.d) null, (z2.p) null, 0.0f, g0Var, 392, 120);
            z6.b(z3.U(g0Var, fVar.b), h0.s.a.a(z1.d(oVar, 1.0f), b2.b.H), i2.t.b(0.5f, dl.a.i), kh.o.z(12), q3.u.M, (q3.i) null, 0L, (x3.l) null, new x3.k(3), kh.o.z(12), 2, false, 1, 0, (u00.k) null, (r0) null, g0Var, 1597440, 25008, 238504);
            g0Var = g0Var;
            g0Var.r(true);
            z4 = z5;
        } else {
            g0Var.V();
            z4 = z3;
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new k(fVar, aVar, z, rVar, z4, i, i2);
        }
    }

    public static final void b(ju.f fVar, l1.j jVar, int i) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(-2071432803);
        int i2 = (g0Var.g(fVar) ? 4 : 2) | i;
        if (g0Var.S(i2 & 1, (i2 & 19) != 18)) {
            b2.o oVar = b2.o.A;
            b2.r rVarE = h0.c.E(z1.d(oVar, 1.0f), 24, 0.0f, 2);
            h0.v vVarA = h0.u.a(h0.i.e, b2.b.N, g0Var, 54);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(rVarE, g0Var);
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
            d.u(fVar, null, 0L, 0L, 0, 0.0f, g0Var, i2 & 14, 62);
            z6.b(z3.U(g0Var, 2131886934), h0.c.G(oVar, 0.0f, 16, 0.0f, 0.0f, 13), dl.a.u, 0L, (q3.u) null, (q3.i) null, 0L, (x3.l) null, (x3.k) null, 0L, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 48, 0, 262136);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new m3.a(fVar, i, 1);
        }
    }

    public static final void c(boolean z, b2.r rVar, v1.c cVar, l1.j jVar, int i) {
        int i2;
        x.b bVar;
        g0 g0Var = (g0) jVar;
        g0Var.e0(-1744895105);
        if ((i & 6) == 0) {
            i2 = (g0Var.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= g0Var.g(rVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= g0Var.i(cVar) ? 256 : 128;
        }
        int i3 = i2;
        if (g0Var.S(i3 & 1, (i3 & 147) != 146)) {
            y3.c cVar2 = (y3.c) g0Var.k(o1.h);
            boolean zG = g0Var.g(cVar2);
            Object objN = g0Var.N();
            Object obj = l1.i.a;
            if (zG || objN == obj) {
                objN = Float.valueOf(cVar2.A0(a));
                g0Var.n0(objN);
            }
            float fFloatValue = ((Number) objN).floatValue();
            Object objN2 = g0Var.N();
            if (objN2 == obj) {
                objN2 = x.c.a(1.0f, 0.01f);
                g0Var.n0(objN2);
            }
            x.b bVar2 = (x.b) objN2;
            Object objN3 = g0Var.N();
            if (objN3 == obj) {
                objN3 = x.c.a(0.0f, 0.01f);
                g0Var.n0(objN3);
            }
            x.b bVar3 = (x.b) objN3;
            Boolean boolValueOf = Boolean.valueOf(z);
            Float fValueOf = Float.valueOf(fFloatValue);
            boolean zI = ((i3 & 14) == 4) | g0Var.i(bVar2) | g0Var.i(bVar3) | g0Var.d(fFloatValue);
            Object objN4 = g0Var.N();
            if (zI || objN4 == obj) {
                bVar = bVar2;
                s1 s1Var = new s1(z, bVar, bVar3, fFloatValue, (k00.c) null);
                g0Var.n0(s1Var);
                objN4 = s1Var;
            } else {
                bVar = bVar2;
            }
            l1.q.h(boolValueOf, fValueOf, (u00.n) objN4, g0Var);
            if (!z) {
                r1 r1VarT = g0Var.t();
                if (r1VarT != null) {
                    r1VarT.d = new f0(z, rVar, cVar, i, 2, (byte) 0);
                    return;
                }
                return;
            }
            boolean zI2 = g0Var.i(bVar) | g0Var.i(bVar3);
            Object objN5 = g0Var.N();
            if (zI2 || objN5 == obj) {
                objN5 = new v0(bVar, bVar3, 29);
                g0Var.n0(objN5);
            }
            b2.r rVarP = b0.p(rVar, (u00.k) objN5);
            w0 w0VarD = h0.o.d(b2.b.A, false);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(rVarP, g0Var);
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
            cVar.invoke(g0Var, Integer.valueOf((i3 >> 6) & 14));
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT2 = g0Var.t();
        if (r1VarT2 != null) {
            r1VarT2.d = new f0(z, rVar, cVar, i, 1, (byte) 0);
        }
    }

    public static final void d(ju.f page, lu.a0 uiState, jk.a aVar, boolean z, u00.k onAction, b2.r rVar, l1.j jVar, int i) {
        b2.r rVar2;
        kotlin.jvm.internal.m.e(page, "page");
        kotlin.jvm.internal.m.e(uiState, "uiState");
        u30.f fVar = uiState.b;
        kotlin.jvm.internal.m.e(onAction, "onAction");
        g0 g0Var = (g0) jVar;
        g0Var.e0(1078784325);
        int i2 = i | (g0Var.g(page) ? 4 : 2) | (g0Var.g(uiState) ? 32 : 16) | (g0Var.i(aVar) ? 256 : 128) | (g0Var.h(z) ? 2048 : 1024) | (g0Var.i(onAction) ? 16384 : 8192);
        if (g0Var.S(i2 & 1, (74899 & i2) != 74898)) {
            lu.z zVar = (lu.z) fVar.get(page.a);
            if (zVar == null) {
                zVar = new lu.z(null, null, null, null, null, 4095);
            }
            lu.z zVar2 = (lu.z) fVar.get("reciters");
            rVar2 = rVar;
            c(z, rVar2, v1.d.d(2048620655, new j(zVar, page, onAction, z, uiState.e.contains("reciters"), zVar2 == null ? new lu.z(null, null, null, null, null, 4095) : zVar2, aVar), g0Var), g0Var, ((i2 >> 9) & 14) | 432);
        } else {
            rVar2 = rVar;
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new h0(page, uiState, aVar, z, onAction, rVar2, i, 4);
        }
    }
}
