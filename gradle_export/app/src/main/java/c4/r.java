package c4;

import l1.g0;

public final class r extends kotlin.jvm.internal.n implements u00.n {
    public static final r B;
    public static final r C;
    public final int A;

    static {
        int i10 = 2;
        B = new r(i10, 0);
        C = new r(i10, 1);
    }

    public r(int i10, int i11) {
        super(i10);
        this.A = i11;
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                l1.j jVar = (l1.j) obj;
                int iIntValue = ((Number) obj2).intValue();
                g0 g0Var = (g0) jVar;
                if (!g0Var.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    g0Var.V();
                }
                break;
            default:
                l1.j jVar2 = (l1.j) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                g0 g0Var2 = (g0) jVar2;
                if (!g0Var2.S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    g0Var2.V();
                }
                break;
        }
        return g00.b0.a;
    }
}
