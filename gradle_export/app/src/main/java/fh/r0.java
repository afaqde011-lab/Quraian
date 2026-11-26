package fh;

public final class r0 extends a {
    public final t0 C;

    public r0(t0 t0Var, int i10) {
        super(t0Var.size(), i10);
        this.C = t0Var;
    }

    @Override
    public final Object a(int i10) {
        return this.C.get(i10);
    }
}
