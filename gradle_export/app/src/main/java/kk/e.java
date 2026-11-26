package kk;

import b2.r;
import hx.t;
import i2.d0;
import kotlin.jvm.internal.m;
import l1.g0;
import l1.i;
import l1.j;
import u00.n;

public abstract class e {

    public static final t f9711a = new t(23);

    public static final r a(r rVar, c cVar) {
        m.e(rVar, "<this>");
        m.e(cVar, "backdrop");
        return rVar.V(new d(cVar));
    }

    public static final a b(jk.a aVar, n nVar, j jVar) {
        m.e(aVar, "backdrop");
        m.e(nVar, "onDraw");
        boolean zG = ((g0) jVar).g(aVar) | ((g0) jVar).g(nVar);
        g0 g0Var = (g0) jVar;
        Object objN = g0Var.N();
        if (zG || objN == i.f9868a) {
            objN = new a(aVar, nVar);
            g0Var.n0(objN);
        }
        return (a) objN;
    }

    public static final b c(jk.a aVar, jk.a aVar2, j jVar, int i10) {
        m.e(aVar, "backdrop1");
        m.e(aVar2, "backdrop2");
        boolean z10 = ((((i10 & 14) ^ 6) > 4 && ((g0) jVar).g(aVar)) || (i10 & 6) == 4) | ((((i10 & 112) ^ 48) > 32 && ((g0) jVar).g(aVar2)) || (i10 & 48) == 32);
        g0 g0Var = (g0) jVar;
        Object objN = g0Var.N();
        if (z10 || objN == i.f9868a) {
            objN = new b(aVar, aVar2);
            g0Var.n0(objN);
        }
        return (b) objN;
    }

    public static final c d(j jVar) {
        l2.b bVarA = d0.a(jVar);
        boolean zG = ((g0) jVar).g(bVarA) | ((g0) jVar).g(f9711a);
        g0 g0Var = (g0) jVar;
        Object objN = g0Var.N();
        if (zG || objN == i.f9868a) {
            objN = new c(bVarA);
            g0Var.n0(objN);
        }
        return (c) objN;
    }
}
