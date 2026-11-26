package h1;

public final class z0 implements u00.n {
    public final int A;
    public final long B;
    public final u00.n C;

    public z0(long j9, u00.n nVar, int i10) {
        this.A = i10;
        this.B = j9;
        this.C = nVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                l1.j jVar = (l1.j) obj;
                int iIntValue = ((Number) obj2).intValue();
                l1.g0 g0Var = (l1.g0) jVar;
                if (g0Var.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e1.c(this.B, this.C, jVar, 0);
                } else {
                    g0Var.V();
                }
                break;
            default:
                l1.j jVar2 = (l1.j) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                l1.g0 g0Var2 = (l1.g0) jVar2;
                if (g0Var2.S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e1.c(this.B, this.C, jVar2, 0);
                } else {
                    g0Var2.V();
                }
                break;
        }
        return g00.b0.a;
    }
}
