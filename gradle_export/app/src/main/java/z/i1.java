package z;

public abstract class i1 {

    public static final l1.t f16927a = new l1.t(new y0(1));

    public static final b2.r a(b2.r rVar, h1 h1Var) {
        return rVar.V(new j1(h1Var));
    }

    public static final h1 b(l1.j jVar) {
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.c0(282942128);
        k kVar = (k) g0Var.k(f16927a);
        if (kVar == null) {
            g0Var.r(false);
            return null;
        }
        boolean zG = g0Var.g(kVar);
        Object objN = g0Var.N();
        if (zG || objN == l1.i.f9868a) {
            objN = new j(kVar.f16937a, kVar.f16938b, kVar.f16939c);
            g0Var.n0(objN);
        }
        h1 h1Var = (h1) objN;
        g0Var.r(false);
        return h1Var;
    }
}
