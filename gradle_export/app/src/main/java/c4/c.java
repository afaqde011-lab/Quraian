package c4;

import java.util.UUID;

public final class c extends kotlin.jvm.internal.n implements u00.a {
    public static final c B;
    public static final c C;
    public static final c D;
    public static final c E;
    public final int A;

    static {
        int i10 = 0;
        B = new c(i10, 0);
        C = new c(i10, 1);
        D = new c(i10, 2);
        E = new c(i10, 3);
    }

    public c(int i10, int i11) {
        super(i10);
        this.A = i11;
    }

    public final Object invoke() {
        switch (this.A) {
            case 0:
                return UUID.randomUUID();
            case 1:
                return Boolean.FALSE;
            case 2:
                return "DEFAULT_TEST_TAG";
            default:
                return UUID.randomUUID();
        }
    }
}
