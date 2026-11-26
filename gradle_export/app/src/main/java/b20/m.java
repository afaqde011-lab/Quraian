package b20;

public final class m implements u00.k {
    public final int A;
    public final n B;

    public m(n nVar, int i) {
        this.A = i;
        this.B = nVar;
    }

    @Override
    public final Object invoke(Object obj) {
        n20.e it = (n20.e) obj;
        switch (this.A) {
            case 0:
                kotlin.jvm.internal.m.e(it, "it");
                return this.B.N(it);
            default:
                kotlin.jvm.internal.m.e(it, "it");
                return this.B.O(it);
        }
    }
}
