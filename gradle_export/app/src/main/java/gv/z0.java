package gv;

public final class z0 implements u00.a {
    public final int A;
    public final l1.z0 B;
    public final l1.z0 C;

    public z0(l1.z0 z0Var, l1.z0 z0Var2, int i) {
        this.A = i;
        this.B = z0Var;
        this.C = z0Var2;
    }

    @Override
    public final Object invoke() {
        switch (this.A) {
            case 0:
                Boolean bool = Boolean.FALSE;
                this.B.setValue(bool);
                ((u00.k) this.C.getValue()).invoke(bool);
                break;
            default:
                Boolean bool2 = Boolean.TRUE;
                this.B.setValue(bool2);
                this.C.setValue(bool2);
                break;
        }
        return g00.b0.a;
    }
}
