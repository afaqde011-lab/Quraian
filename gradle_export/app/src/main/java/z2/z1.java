package z2;

public final class z1 extends kotlin.jvm.internal.n implements u00.n {
    public final int A;
    public final t[] B;

    public z1(t[] tVarArr, int i10) {
        super(2);
        this.A = i10;
        this.B = tVarArr;
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                return Float.valueOf(d0.e((k1) obj, true, this.B, ((Number) obj2).floatValue()));
            default:
                return Float.valueOf(d0.e((k1) obj, false, this.B, ((Number) obj2).floatValue()));
        }
    }
}
