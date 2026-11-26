package w;

public final class h extends kotlin.jvm.internal.n implements u00.n {
    public final int A = 1;
    public final Object B;

    public h(v1.c cVar, int i10) {
        super(2);
        this.B = cVar;
    }

    public h(y0 y0Var) {
        super(2);
        this.B = y0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                l0 l0Var = (l0) obj;
                l0 l0Var2 = (l0) obj2;
                l0 l0Var3 = l0.C;
                return Boolean.valueOf(l0Var == l0Var3 && l0Var2 == l0Var3 && !((y0) this.B).f15824a.f15769e);
            default:
                ((Number) obj2).intValue();
                x1.b((v1.c) this.B, (l1.j) obj, l1.q.K(7));
                return g00.b0.a;
        }
    }
}
