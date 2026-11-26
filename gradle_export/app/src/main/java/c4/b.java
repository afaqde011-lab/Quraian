package c4;

public final class b extends kotlin.jvm.internal.n implements u00.k {
    public static final b B;
    public static final b C;
    public static final b D;
    public static final b E;
    public static final b F;
    public static final b G;
    public final int A;

    static {
        int i10 = 1;
        B = new b(i10, 0);
        C = new b(i10, 1);
        D = new b(i10, 2);
        E = new b(i10, 3);
        F = new b(i10, 4);
        G = new b(i10, 5);
    }

    public b(int i10, int i11) {
        super(i10);
        this.A = i11;
    }

    public final Object invoke(Object obj) {
        int i10 = this.A;
        g00.b0 b0Var = g00.b0.a;
        switch (i10) {
            case 0:
                a10.w[] wVarArr = j3.y.f8004a;
                ((j3.a0) obj).a(j3.w.f8000y, b0Var);
                break;
            case 1:
                ((Number) obj).longValue();
                break;
            case 2:
                break;
            case 3:
                a10.w[] wVarArr2 = j3.y.f8004a;
                ((j3.a0) obj).a(j3.w.f7999x, b0Var);
                break;
            case 4:
                break;
            default:
                z zVar = (z) obj;
                if (zVar.isAttachedToWindow()) {
                    zVar.q();
                }
                break;
        }
        return b0Var;
    }
}
