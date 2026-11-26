package lp;

import b2.o;
import b2.r;
import c3.o1;
import c3.t2;
import com.google.android.gms.internal.measurement.z3;
import eu.n;
import g1.z6;
import h0.z1;
import jp.x;
import kotlin.jvm.internal.m;
import l1.g0;
import l1.m1;
import l1.p2;
import l1.q;
import l1.r1;
import m3.r0;
import q3.u;
import z2.w0;

public abstract class f {
    public static final float a = 16;

    public static final void a(x xVar, u00.k onAction, l1.j jVar, int i) {
        int i2;
        l1.j jVar2;
        String strO;
        x uiState = xVar;
        m.e(uiState, "uiState");
        boolean z = uiState.a;
        String str = uiState.s;
        String str2 = uiState.r;
        m.e(onAction, "onAction");
        l1.j jVar3 = (g0) jVar;
        jVar3.e0(85512118);
        if ((i & 6) == 0) {
            i2 = (jVar3.g(uiState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= jVar3.i(onAction) ? 32 : 16;
        }
        if (jVar3.S(i2 & 1, (i2 & 19) != 18)) {
            g2.l lVar = (g2.l) jVar3.k(o1.i);
            t2 t2Var = (t2) jVar3.k(o1.q);
            boolean zG = jVar3.g(str2);
            Object objN = jVar3.N();
            Object obj = l1.i.a;
            if (zG || objN == obj) {
                objN = uiState.c();
                jVar3.n0(objN);
            }
            u30.f fVar = (u30.f) objN;
            boolean zG2 = jVar3.g(str2) | jVar3.g(str) | jVar3.h(z) | jVar3.h(z3.E(str2));
            Object objN2 = jVar3.N();
            if (zG2 || objN2 == obj) {
                objN2 = q.r(new e(fVar, uiState, 0));
                jVar3.n0(objN2);
            }
            p2 p2Var = (p2) objN2;
            boolean z2 = (str.length() <= 0 || str.length() == 0 || m.a(str2, str)) ? false : true;
            boolean zE = z3.E(str2);
            if (zE) {
                strO = oi.k.o(jVar3, 572798756, 2131886206, jVar3, false);
            } else if (z2) {
                strO = oi.k.o(jVar3, 572801189, 2131886209, jVar3, false);
            } else {
                jVar3.c0(577029831);
                jVar3.r(false);
                strO = null;
            }
            boolean zBooleanValue = ((Boolean) jVar3.k(tp.h.a)).booleanValue();
            int i3 = i2 & 112;
            boolean zG3 = jVar3.g(t2Var) | (i3 == 32);
            boolean z3 = z2;
            Object objN3 = jVar3.N();
            if (zG3 || objN3 == obj) {
                objN3 = new ez.m(t2Var, onAction, 1);
                jVar3.n0(objN3);
            }
            u00.a aVar = (u00.a) objN3;
            String strU = z3.U(jVar3, 2131886239);
            boolean zBooleanValue2 = ((Boolean) p2Var.getValue()).booleanValue();
            boolean zG4 = jVar3.g(t2Var) | (i3 == 32);
            Object objN4 = jVar3.N();
            if (zG4 || objN4 == obj) {
                objN4 = new ez.m(t2Var, onAction, 2);
                jVar3.n0(objN4);
            }
            uiState = xVar;
            jVar2 = jVar3;
            up.f.a(aVar, null, null, new ip.a(strU, zBooleanValue2, z, (u00.a) objN4), false, v1.d.d(-1936179678, new a(zBooleanValue, uiState, onAction, zE, lVar, fVar, strO, z3, p2Var, 0), jVar3), jVar2, 196608, 22);
        } else {
            jVar2 = jVar3;
            jVar2.V();
        }
        r1 r1VarT = jVar2.t();
        if (r1VarT != null) {
            r1VarT.d = new b(uiState, onAction, i, 0);
        }
    }

    public static final void b(String str, l1.j jVar, int i) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(850656450);
        int i2 = i | (g0Var.g(str) ? 4 : 2);
        if (g0Var.S(i2 & 1, (i2 & 3) != 2)) {
            r rVarE = z1.e(z1.d(o.A, 1.0f), a);
            w0 w0VarD = h0.o.d(b2.b.A, false);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            r rVarC = b2.a.c(rVarE, g0Var);
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
            if (str != null) {
                g0Var.c0(1122397776);
                z6.b(str, (r) null, dl.a.U, kh.o.z(12), u.B, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(16), 2, false, 1, 0, (u00.k) null, (r0) null, g0Var, (i2 & 14) | 1597440, 25008, 239530);
                g0Var = g0Var;
                g0Var.r(false);
            } else {
                g0Var.c0(1122674854);
                g0Var.r(false);
            }
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new n(str, i, 4);
        }
    }
}
