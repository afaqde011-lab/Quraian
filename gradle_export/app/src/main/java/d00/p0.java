package d00;

public final class p0 implements u00.k {
    public final int A;
    public final c1 B;
    public final n0 C;

    public p0(c1 c1Var, n0 n0Var, int i) {
        this.A = i;
        this.B = c1Var;
        this.C = n0Var;
    }

    @Override
    public final Object invoke(Object obj) {
        g00.k kVar = (g00.k) obj;
        switch (this.A) {
            case 0:
                kotlin.jvm.internal.m.e(kVar, "<destruct>");
                return Boolean.valueOf(((c1) kVar.A) == this.B && ((n0) kVar.B) == this.C);
            default:
                kotlin.jvm.internal.m.e(kVar, "<destruct>");
                return Boolean.valueOf(((c1) kVar.A) == this.B && ((n0) kVar.B) == this.C);
        }
    }
}
