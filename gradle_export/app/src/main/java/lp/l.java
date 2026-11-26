package lp;

import b2.o;
import b2.r;
import c3.o1;
import c3.t2;
import com.google.android.gms.internal.measurement.z3;
import g1.z6;
import h0.z1;
import jp.x;
import jz.t;
import kotlin.jvm.internal.m;
import l1.g0;
import l1.m1;
import l1.p2;
import l1.q;
import l1.r1;
import m3.r0;
import q3.u;
import u00.n;
import z2.w0;

public abstract class l {
    public static final float a = 16;

    public static final void a(x xVar, u00.k onAction, l1.j jVar, int i) {
        int i2;
        u00.k kVar;
        l1.j jVar2;
        boolean z;
        String str;
        String strO;
        boolean z2;
        boolean zI;
        Object objN;
        Object obj;
        u30.f fVar;
        int i3;
        boolean z3;
        Object objN2;
        boolean z4;
        Object objN3;
        x uiState = xVar;
        m.e(uiState, "uiState");
        String str2 = uiState.t;
        boolean z5 = uiState.a;
        String str3 = uiState.s;
        String str4 = uiState.r;
        m.e(onAction, "onAction");
        l1.j jVar3 = (g0) jVar;
        jVar3.e0(-1561931984);
        if ((i & 6) == 0) {
            i2 = (jVar3.g(uiState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= jVar3.i(onAction) ? 32 : 16;
        }
        int i4 = i2;
        if (jVar3.S(i4 & 1, (i4 & 19) != 18)) {
            g2.l lVar = (g2.l) jVar3.k(o1.i);
            t2 t2Var = (t2) jVar3.k(o1.q);
            xk.d dVarR = c7.i.R(jVar3);
            q2.a aVar = (q2.a) jVar3.k(o1.l);
            boolean zG = jVar3.g(str4);
            Object objN4 = jVar3.N();
            Object obj2 = l1.i.a;
            if (zG || objN4 == obj2) {
                objN4 = uiState.c();
                jVar3.n0(objN4);
            }
            u30.f fVar2 = (u30.f) objN4;
            boolean zG2 = jVar3.g(str4) | jVar3.g(str3) | jVar3.h(z5) | jVar3.h(z3.E(str4));
            Object objN5 = jVar3.N();
            if (zG2 || objN5 == obj2) {
                objN5 = q.r(new e(fVar2, uiState, 1));
                jVar3.n0(objN5);
            }
            p2 p2Var = (p2) objN5;
            boolean z6 = (str3.length() <= 0 || str3.length() == 0 || m.a(str4, str3)) ? false : true;
            boolean zE = z3.E(str4);
            if (zE) {
                z = false;
                strO = oi.k.o(jVar3, -2073015586, 2131886206, jVar3, false);
            } else {
                z = false;
                if (z6) {
                    strO = oi.k.o(jVar3, -2073013153, 2131886209, jVar3, false);
                } else {
                    jVar3.c0(-2073010874);
                    jVar3.r(false);
                    str = str2;
                }
                boolean zBooleanValue = ((Boolean) jVar3.k(tp.h.a)).booleanValue();
                if ((i4 & 14) == 4) {
                    z2 = true;
                } else {
                    z2 = z;
                }
                zI = z2 | jVar3.i(aVar) | jVar3.i(dVarR);
                objN = jVar3.N();
                if (!zI || objN == obj2) {
                    obj = obj2;
                    fVar = fVar2;
                    j jVar4 = new j(uiState, aVar, dVarR, null, 4);
                    jVar3.n0(jVar4);
                    objN = jVar4;
                } else {
                    fVar = fVar2;
                    obj = obj2;
                }
                q.i(str2, jVar3, (n) objN);
                String strU = z3.U(jVar3, 2131886158);
                boolean zBooleanValue2 = ((Boolean) p2Var.getValue()).booleanValue();
                i3 = i4 & 112;
                if (i3 == 32) {
                    z3 = true;
                } else {
                    z3 = z;
                }
                objN2 = jVar3.N();
                if (z3 || objN2 == obj) {
                    objN2 = new t(15, onAction);
                    jVar3.n0(objN2);
                }
                ip.a aVar2 = new ip.a(strU, zBooleanValue2, z5, (u00.a) objN2);
                r rVarV = c7.i.V(o.A, dVarR, jVar3);
                boolean zG3 = jVar3.g((Object) r18);
                if (i3 == 32) {
                    z = true;
                }
                z4 = zG3 | z;
                objN3 = jVar3.N();
                if (z4 || objN3 == obj) {
                    objN3 = new ez.m(t2Var, onAction, 9);
                    jVar3.n0(objN3);
                }
                u00.a aVar3 = (u00.a) objN3;
                kVar = onAction;
                uiState = xVar;
                v1.c cVarD = v1.d.d(-528187748, new a(zBooleanValue, xVar, kVar, zE, lVar, fVar, str, z6, p2Var, 1), jVar3);
                jVar2 = jVar3;
                up.f.a(aVar3, null, rVarV, aVar2, false, cVarD, jVar2, 196608, 18);
            }
            str = strO;
            boolean zBooleanValue3 = ((Boolean) jVar3.k(tp.h.a)).booleanValue();
            if ((i4 & 14) == 4) {
                z2 = true;
            } else {
                z2 = z;
            }
            zI = z2 | jVar3.i(aVar) | jVar3.i(dVarR);
            objN = jVar3.N();
            if (zI) {
                obj = obj2;
                fVar = fVar2;
                j jVar5 = new j(uiState, aVar, dVarR, null, 4);
                jVar3.n0(jVar5);
                objN = jVar5;
            } else {
                obj = obj2;
                fVar = fVar2;
                j jVar6 = new j(uiState, aVar, dVarR, null, 4);
                jVar3.n0(jVar6);
                objN = jVar6;
            }
            q.i(str2, jVar3, (n) objN);
            String strU2 = z3.U(jVar3, 2131886158);
            boolean zBooleanValue4 = ((Boolean) p2Var.getValue()).booleanValue();
            i3 = i4 & 112;
            if (i3 == 32) {
                z3 = true;
            } else {
                z3 = z;
            }
            objN2 = jVar3.N();
            if (z3) {
                objN2 = new t(15, onAction);
                jVar3.n0(objN2);
            } else {
                objN2 = new t(15, onAction);
                jVar3.n0(objN2);
            }
            ip.a aVar4 = new ip.a(strU2, zBooleanValue4, z5, (u00.a) objN2);
            r rVarV2 = c7.i.V(o.A, dVarR, jVar3);
            boolean zG4 = jVar3.g((Object) r18);
            if (i3 == 32) {
                z = true;
            }
            z4 = zG4 | z;
            objN3 = jVar3.N();
            if (z4) {
                objN3 = new ez.m(t2Var, onAction, 9);
                jVar3.n0(objN3);
            } else {
                objN3 = new ez.m(t2Var, onAction, 9);
                jVar3.n0(objN3);
            }
            u00.a aVar5 = (u00.a) objN3;
            kVar = onAction;
            uiState = xVar;
            v1.c cVarD2 = v1.d.d(-528187748, new a(zBooleanValue3, xVar, kVar, zE, lVar, fVar, str, z6, p2Var, 1), jVar3);
            jVar2 = jVar3;
            up.f.a(aVar5, null, rVarV2, aVar4, false, cVarD2, jVar2, 196608, 18);
        } else {
            kVar = onAction;
            jVar2 = jVar3;
            jVar2.V();
        }
        r1 r1VarT = jVar2.t();
        if (r1VarT != null) {
            r1VarT.d = new b(uiState, kVar, i, 2);
        }
    }

    public static final void b(String str, l1.j jVar, int i) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(-548074852);
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
                g0Var.c0(-868080662);
                z6.b(str, (r) null, dl.a.U, kh.o.z(12), u.B, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(16), 2, false, 1, 0, (u00.k) null, (r0) null, g0Var, (i2 & 14) | 1597440, 25008, 239530);
                g0Var = g0Var;
                g0Var.r(false);
            } else {
                g0Var.c0(-867803584);
                g0Var.r(false);
            }
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new eu.n(str, i, 5);
        }
    }
}
