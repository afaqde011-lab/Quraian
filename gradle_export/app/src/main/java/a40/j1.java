package a40;

public final class j1 extends h1 {
    public final m1 E;
    public final k1 F;
    public final o G;
    public final Object H;

    public j1(m1 m1Var, k1 k1Var, o oVar, Object obj) {
        this.E = m1Var;
        this.F = k1Var;
        this.G = oVar;
        this.H = obj;
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final void k(Throwable th) {
        o oVar = this.G;
        o oVarV = m1.V(oVar);
        m1 m1Var = this.E;
        k1 k1Var = this.F;
        Object obj = this.H;
        if (oVarV == null || !m1Var.g0(k1Var, oVarV, obj)) {
            k1Var.A.d(new f40.g(2), 2);
            o oVarV2 = m1.V(oVar);
            if (oVarV2 == null || !m1Var.g0(k1Var, oVarV2, obj)) {
                m1Var.n(m1Var.C(k1Var, obj));
            }
        }
    }
}
