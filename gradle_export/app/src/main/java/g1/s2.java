package g1;

public final class s2 implements u00.o {
    public final int A;
    public final String B;

    public s2(String str, int i10) {
        this.A = i10;
        this.B = str;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.A) {
            case 0:
                j8 j8Var = (j8) obj;
                l1.j jVar = (l1.j) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= (iIntValue & 8) == 0 ? ((l1.g0) jVar).g(j8Var) : ((l1.g0) jVar).i(j8Var) ? 4 : 2;
                }
                l1.g0 g0Var = (l1.g0) jVar;
                if (g0Var.S(iIntValue & 1, (iIntValue & 19) != 18)) {
                    h8.a(j8Var, null, 0.0f, null, 0L, 0L, 0.0f, 0.0f, v1.d.d(1905952188, new d1(this.B, 1), jVar), jVar, (iIntValue & 14) | 805306368);
                } else {
                    g0Var.V();
                }
                break;
            default:
                j8 j8Var2 = (j8) obj;
                l1.j jVar2 = (l1.j) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= (iIntValue2 & 8) == 0 ? ((l1.g0) jVar2).g(j8Var2) : ((l1.g0) jVar2).i(j8Var2) ? 4 : 2;
                }
                l1.g0 g0Var2 = (l1.g0) jVar2;
                if (g0Var2.S(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    h8.a(j8Var2, null, 0.0f, null, 0L, 0L, 0.0f, 0.0f, v1.d.d(-999924215, new d1(this.B, 2), jVar2), jVar2, (iIntValue2 & 14) | 805306368);
                } else {
                    g0Var2.V();
                }
                break;
        }
        return g00.b0.a;
    }
}
