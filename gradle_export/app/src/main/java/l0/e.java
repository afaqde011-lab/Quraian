package l0;

public final class e implements u00.n {
    public final int A;
    public final m0.j B;
    public final k9.x0 C;

    public e(m0.j jVar, k9.x0 x0Var, int i10) {
        this.A = i10;
        this.B = jVar;
        this.C = x0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.A;
        int iIntValue = ((Integer) obj).intValue();
        int iIntValue2 = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                this.B.c(this.C, iIntValue, iIntValue2);
                break;
            default:
                this.B.c(this.C, iIntValue, iIntValue2);
                break;
        }
        return g00.b0.a;
    }
}
