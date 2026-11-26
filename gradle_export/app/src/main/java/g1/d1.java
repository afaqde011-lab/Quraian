package g1;

public final class d1 implements u00.n {
    public final int A;
    public final String B;

    public d1(String str, int i10) {
        this.A = i10;
        this.B = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                l1.j jVar = (l1.j) obj;
                int iIntValue = ((Number) obj2).intValue();
                l1.g0 g0Var = (l1.g0) jVar;
                if (g0Var.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Object objN = g0Var.N();
                    if (objN == l1.i.f9868a) {
                        objN = new e6.c(18);
                        g0Var.n0(objN);
                    }
                    z6.b(this.B, j3.q.b(b2.o.A, (u00.k) objN), 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, jVar, 0, 0, 262140);
                } else {
                    g0Var.V();
                }
                break;
            case 1:
                l1.j jVar2 = (l1.j) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                l1.g0 g0Var2 = (l1.g0) jVar2;
                if (g0Var2.S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    z6.b(this.B, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, jVar2, 0, 0, 262142);
                } else {
                    g0Var2.V();
                }
                break;
            default:
                l1.j jVar3 = (l1.j) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                l1.g0 g0Var3 = (l1.g0) jVar3;
                if (g0Var3.S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    z6.b(this.B, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, jVar3, 0, 0, 262142);
                } else {
                    g0Var3.V();
                }
                break;
        }
        return g00.b0.a;
    }
}
