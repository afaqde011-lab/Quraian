package g1;

public final class v0 implements u00.o {
    public static final v0 B = new v0(0);
    public static final v0 C = new v0(1);
    public final int A;

    public v0(int i10) {
        this.A = i10;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.A) {
            case 0:
                l1.j jVar = (l1.j) obj2;
                int iIntValue = ((Number) obj3).intValue();
                l1.g0 g0Var = (l1.g0) jVar;
                if (g0Var.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                    z6.b(h1.f.l(jVar, 2131886709), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, jVar, 0, 0, 262142);
                } else {
                    g0Var.V();
                }
                break;
            default:
                l1.j jVar2 = (l1.j) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                l1.g0 g0Var2 = (l1.g0) jVar2;
                if (g0Var2.S(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    z6.b(h1.f.l(jVar2, 2131886697), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, jVar2, 0, 0, 262142);
                } else {
                    g0Var2.V();
                }
                break;
        }
        return g00.b0.a;
    }
}
