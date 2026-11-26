package hv;

import a1.c0;
import a1.f2;
import c3.o1;
import d0.n2;
import l1.g0;
import l1.p2;
import l1.z0;

public abstract class v {
    public static final float a = 12;

    public static final u a(n2 scrollableState, f0.i interactionSource, u00.k onUserScrollChanged, u00.k kVar, l1.j jVar, int i) {
        p2 p2Var;
        Object gVar;
        kotlin.jvm.internal.m.e(scrollableState, "scrollableState");
        kotlin.jvm.internal.m.e(interactionSource, "interactionSource");
        kotlin.jvm.internal.m.e(onUserScrollChanged, "onUserScrollChanged");
        z0 z0VarG = l1.q.G(onUserScrollChanged, jVar);
        z0 z0VarG2 = l1.q.G(kVar, jVar);
        g0 g0Var = (g0) jVar;
        float fA0 = ((y3.c) g0Var.k(o1.h)).A0(a);
        Object objN = g0Var.N();
        Object obj = l1.i.a;
        if (objN == obj) {
            objN = l1.q.z(Boolean.FALSE);
            g0Var.n0(objN);
        }
        p2 p2Var2 = (z0) objN;
        Object objN2 = g0Var.N();
        if (objN2 == obj) {
            objN2 = l1.q.z(Boolean.FALSE);
            g0Var.n0(objN2);
        }
        z0 z0Var = (z0) objN2;
        Object objN3 = g0Var.N();
        if (objN3 == obj) {
            objN3 = new w();
            g0Var.n0(objN3);
        }
        w wVar = (w) objN3;
        boolean zI = ((((i & 112) ^ 48) > 32 && g0Var.g(interactionSource)) || (i & 48) == 32) | g0Var.i(wVar);
        Object objN4 = g0Var.N();
        if (zI || objN4 == obj) {
            p2Var = p2Var2;
            gVar = new a1.g(interactionSource, wVar, p2Var, z0Var, (k00.c) null, 27);
            g0Var.n0(gVar);
        } else {
            p2Var = p2Var2;
            gVar = objN4;
        }
        l1.q.i(interactionSource, jVar, (u00.n) gVar);
        Boolean bool = (Boolean) p2Var.getValue();
        bool.getClass();
        Boolean boolValueOf = Boolean.valueOf(scrollableState.a());
        boolean zI2 = g0Var.i(scrollableState);
        Object objN5 = g0Var.N();
        if (zI2 || objN5 == obj) {
            f2 f2Var = new f2(scrollableState, p2Var, z0Var, (k00.c) null, 12);
            g0Var.n0(f2Var);
            objN5 = f2Var;
        }
        l1.q.h(bool, boolValueOf, (u00.n) objN5, jVar);
        Boolean bool2 = (Boolean) z0Var.getValue();
        bool2.getClass();
        boolean zG = g0Var.g(z0VarG);
        Object objN6 = g0Var.N();
        if (zG || objN6 == obj) {
            objN6 = new c0(z0VarG, z0Var, (k00.c) null, 22);
            g0Var.n0(objN6);
        }
        l1.q.i(bool2, jVar, (u00.n) objN6);
        boolean zD = g0Var.d(fA0);
        Object objN7 = g0Var.N();
        if (zD || objN7 == obj) {
            objN7 = new u(wVar, fA0, z0VarG2);
            g0Var.n0(objN7);
        }
        return (u) objN7;
    }
}
