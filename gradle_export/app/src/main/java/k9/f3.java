package k9;

public final class f3 implements n3 {
    public final int A;
    public final n3 B;

    public f3(n3 n3Var, int i10) {
        this.A = i10;
        this.B = n3Var;
    }

    @Override
    public final Object d(s1 s1Var, a2 a2Var, int i10) {
        switch (this.A) {
            case 0:
                return p3.h2(s1Var, a2Var, i10, this.B, new androidx.media3.common.k1(a2Var, i10, 5));
            default:
                return p3.h2(s1Var, a2Var, i10, this.B, new androidx.media3.cast.a(s1Var, a2Var, i10));
        }
    }
}
