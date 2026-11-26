package c3;

public final class b2 extends kotlin.jvm.internal.n implements u00.a {
    public static final b2 B;
    public static final b2 C;
    public final int A;

    static {
        int i10 = 0;
        B = new b2(i10, 0);
        C = new b2(i10, 1);
    }

    public b2(int i10, int i11) {
        super(i10);
        this.A = i11;
    }

    public final Object invoke() {
        switch (this.A) {
            case 0:
                return Boolean.FALSE;
            default:
                return null;
        }
    }
}
