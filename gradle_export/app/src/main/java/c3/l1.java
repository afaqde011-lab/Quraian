package c3;

public final class l1 extends kotlin.jvm.internal.n implements u00.n {
    public final int A = 1;
    public final n1 B;
    public final z C;
    public final u00.n D;

    public l1(n1 n1Var, z zVar, u00.n nVar, int i10) {
        super(2);
        this.B = n1Var;
        this.C = zVar;
        this.D = nVar;
    }

    public l1(z zVar, n1 n1Var, u00.n nVar) {
        super(2);
        this.C = zVar;
        this.B = n1Var;
        this.D = nVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                l1.j jVar = (l1.j) obj;
                int iIntValue = ((Number) obj2).intValue();
                l1.g0 g0Var = (l1.g0) jVar;
                if (g0Var.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    g0Var.c0(866651995);
                    o1.a(this.C, this.B.f2710k, this.D, jVar, 0);
                    g0Var.r(false);
                } else {
                    g0Var.V();
                }
                break;
            default:
                ((Number) obj2).intValue();
                this.B.a(this.C, this.D, (l1.j) obj, l1.q.K(1));
                break;
        }
        return g00.b0.a;
    }
}
