package gv;

public final class z implements u00.k {
    public final int A;
    public final l1.e1 B;

    public z(l1.e1 e1Var, int i) {
        this.A = i;
        this.B = e1Var;
    }

    @Override
    public final Object invoke(Object obj) {
        int i = this.A;
        float fFloatValue = ((Float) obj).floatValue();
        switch (i) {
            case 0:
                this.B.i(fFloatValue);
                break;
            default:
                this.B.i(w00.a.F(fFloatValue));
                break;
        }
        return g00.b0.a;
    }
}
