package l1;

public final class o1 implements z0, a40.z {
    public final z0 A;
    public final k00.i B;

    public o1(z0 z0Var, k00.i iVar) {
        this.A = z0Var;
        this.B = iVar;
    }

    public final k00.i A() {
        return this.B;
    }

    @Override
    public final Object getValue() {
        return this.A.getValue();
    }

    @Override
    public final void setValue(Object obj) {
        this.A.setValue(obj);
    }
}
