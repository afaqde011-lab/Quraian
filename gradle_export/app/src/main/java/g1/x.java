package g1;

public final class x implements u00.n {
    public final int A;
    public final long B;
    public final Object C;
    public final g00.e D;

    public x(long j9, Object obj, g00.e eVar, int i10) {
        this.A = i10;
        this.B = j9;
        this.C = obj;
        this.D = eVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                l1.j jVar = (l1.j) obj;
                int iIntValue = ((Number) obj2).intValue();
                l1.g0 g0Var = (l1.g0) jVar;
                if (g0Var.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    h1.f.c(this.B, ((l8) g0Var.k(m8.f5890a)).m, v1.d.d(417635459, new w((h0.n1) this.C, this.D, 0), jVar), jVar, 384);
                } else {
                    g0Var.V();
                }
                break;
            default:
                l1.j jVar2 = (l1.j) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                l1.g0 g0Var2 = (l1.g0) jVar2;
                if (g0Var2.S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    h1.e1.b(this.B, (m3.r0) this.C, this.D, jVar2, 0);
                } else {
                    g0Var2.V();
                }
                break;
        }
        return g00.b0.a;
    }
}
