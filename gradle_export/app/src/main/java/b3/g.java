package b3;

public final class g extends kotlin.jvm.internal.n implements u00.a {
    public static final g B;
    public static final g C;
    public final int A;

    static {
        int i10 = 0;
        B = new g(i10, 0);
        C = new g(i10, 1);
    }

    public g(int i10, int i11) {
        super(i10);
        this.A = i11;
    }

    public final Object invoke() {
        switch (this.A) {
            case 0:
                return new l0(2);
            default:
                return new l0(3);
        }
    }
}
