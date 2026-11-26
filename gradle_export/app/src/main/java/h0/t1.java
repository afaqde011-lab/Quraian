package h0;

public abstract class t1 {

    public static final v1 f6464a = new v1(i.f6406a, b2.b.J);

    public static final v1 a(e eVar, b2.h hVar, l1.j jVar, int i10) {
        if (kotlin.jvm.internal.m.a(eVar, i.f6406a) && kotlin.jvm.internal.m.a(hVar, b2.b.J)) {
            l1.g0 g0Var = (l1.g0) jVar;
            g0Var.c0(-1073830487);
            g0Var.r(false);
            return f6464a;
        }
        l1.g0 g0Var2 = (l1.g0) jVar;
        g0Var2.c0(-1073779616);
        boolean z10 = true;
        boolean z11 = (((i10 & 14) ^ 6) > 4 && g0Var2.g(eVar)) || (i10 & 6) == 4;
        if ((((i10 & 112) ^ 48) <= 32 || !g0Var2.g(hVar)) && (i10 & 48) != 32) {
            z10 = false;
        }
        boolean z12 = z11 | z10;
        Object objN = g0Var2.N();
        if (z12 || objN == l1.i.f9868a) {
            objN = new v1(eVar, hVar);
            g0Var2.n0(objN);
        }
        v1 v1Var = (v1) objN;
        g0Var2.r(false);
        return v1Var;
    }
}
