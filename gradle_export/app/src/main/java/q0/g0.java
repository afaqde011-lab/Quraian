package q0;

public final class g0 implements u00.k {
    public final int A;
    public final g2 B;
    public final u00.k C;

    public g0(g2 g2Var, u00.k kVar, int i10) {
        this.A = i10;
        this.B = g2Var;
        this.C = kVar;
    }

    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                m3.n0 n0Var = (m3.n0) obj;
                g2 g2Var = this.B;
                if (g2Var != null) {
                    g2Var.f12616a.setValue(n0Var);
                }
                u00.k kVar = this.C;
                if (kVar != null) {
                    kVar.invoke(n0Var);
                }
                return g00.b0.a;
            default:
                g2 g2Var2 = this.B;
                z1.p pVar = g2Var2.f12618c;
                u00.k kVar2 = this.C;
                pVar.add(kVar2);
                return new bt.z0(g2Var2, kVar2, 10);
        }
    }
}
