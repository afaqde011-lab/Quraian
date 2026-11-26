package gz;

public final class y0 implements u00.k {
    public final int A;
    public final m1 B;

    public y0(m1 m1Var, int i) {
        this.A = i;
        this.B = m1Var;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                zz.b it = (zz.b) obj;
                kotlin.jvm.internal.m.e(it, "it");
                this.B.l(new l0(it));
                break;
            default:
                String it2 = (String) obj;
                kotlin.jvm.internal.m.e(it2, "it");
                this.B.l(new i0(it2));
                break;
        }
        return g00.b0.a;
    }
}
