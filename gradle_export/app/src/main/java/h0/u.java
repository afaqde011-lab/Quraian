package h0;

public abstract class u {

    public static final v f6465a = new v(i.f6408c, b2.b.M);

    public static final v a(h hVar, b2.c cVar, l1.j jVar, int i10) {
        if (kotlin.jvm.internal.m.a(hVar, i.f6408c) && cVar.equals(b2.b.M)) {
            l1.g0 g0Var = (l1.g0) jVar;
            g0Var.c0(-1446604504);
            g0Var.r(false);
            return f6465a;
        }
        l1.g0 g0Var2 = (l1.g0) jVar;
        g0Var2.c0(-1446550657);
        boolean z10 = true;
        boolean z11 = (((i10 & 14) ^ 6) > 4 && g0Var2.g(hVar)) || (i10 & 6) == 4;
        if ((((i10 & 112) ^ 48) <= 32 || !g0Var2.g(cVar)) && (i10 & 48) != 32) {
            z10 = false;
        }
        boolean z12 = z11 | z10;
        Object objN = g0Var2.N();
        if (z12 || objN == l1.i.f9868a) {
            objN = new v(hVar, cVar);
            g0Var2.n0(objN);
        }
        v vVar = (v) objN;
        g0Var2.r(false);
        return vVar;
    }
}
