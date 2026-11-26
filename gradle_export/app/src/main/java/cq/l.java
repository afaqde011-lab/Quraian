package cq;

import a1.o1;
import kotlin.jvm.internal.a0;
import l1.g0;
import l1.q2;

public abstract class l {
    public static final q2 a = new q2(new a2.f(14));

    public static final u00.a a(l1.j jVar) {
        e60.a aVarA = q50.c.a(jVar);
        g0 g0Var = (g0) jVar;
        boolean zG = g0Var.g((Object) null) | g0Var.g(aVarA);
        Object objN = g0Var.N();
        l1.c cVar = l1.i.a;
        if (zG || objN == cVar) {
            objN = oi.k.f(a0.a, a.class, aVarA, (b60.a) null, g0Var);
        }
        a aVar = (a) objN;
        p9.g gVar = (p9.g) g0Var.k(a);
        boolean zG2 = g0Var.g(aVar) | g0Var.g(gVar);
        Object objN2 = g0Var.N();
        if (zG2 || objN2 == cVar) {
            objN2 = new o1(gVar, aVar, 6);
            g0Var.n0(objN2);
        }
        return (u00.a) objN2;
    }
}
