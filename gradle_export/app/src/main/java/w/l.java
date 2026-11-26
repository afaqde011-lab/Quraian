package w;

public final class l extends kotlin.jvm.internal.n implements u00.n {
    public static final l B;
    public static final l C;
    public final int A;

    static {
        int i10 = 2;
        B = new l(i10, 0);
        C = new l(i10, 1);
    }

    public l(int i10, int i11) {
        super(i10);
        this.A = i11;
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                long j9 = ((y3.l) obj).f16596a;
                long j10 = ((y3.l) obj2).f16596a;
                long j11 = 1;
                return x.c.v(0.0f, 400.0f, new y3.l((j11 & 4294967295L) | (j11 << 32)), 1);
            default:
                l0 l0Var = (l0) obj2;
                return Boolean.valueOf(((l0) obj) == l0Var && l0Var == l0.C);
        }
    }
}
