package mb;

public final class b extends kotlin.jvm.internal.n implements u00.k {
    public static final b B;
    public static final b C;
    public static final b D;
    public final int A;

    static {
        int i10 = 1;
        B = new b(i10, 0);
        C = new b(i10, 1);
        D = new b(i10, 2);
    }

    public b(int i10, int i11) {
        super(i10);
        this.A = i11;
    }

    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                return g00.b0.a;
            case 1:
                return (h) obj;
            default:
                return g00.b0.a;
        }
    }
}
