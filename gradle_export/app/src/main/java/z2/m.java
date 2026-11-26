package z2;

public final class m extends kotlin.jvm.internal.n implements u00.n {
    public static final m B;
    public static final m C;
    public final int A;

    static {
        int i10 = 2;
        B = new m(i10, 0);
        C = new m(i10, 1);
    }

    public m(int i10, int i11) {
        super(i10);
        this.A = i11;
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                l1.j jVar = (l1.j) obj;
                int iIntValue = ((Number) obj2).intValue();
                l1.g0 g0Var = (l1.g0) jVar;
                if (!g0Var.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    g0Var.V();
                }
                break;
            default:
                ((u0) obj2).getClass();
                break;
        }
        return g00.b0.a;
    }
}
