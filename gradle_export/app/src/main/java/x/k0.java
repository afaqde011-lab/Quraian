package x;

public final class k0 extends f5.c {
    public final l1.i1 C;
    public final l1.i1 D;

    public k0(Object obj) {
        super(11);
        this.C = l1.q.z(obj);
        this.D = l1.q.z(obj);
    }

    @Override
    public final Object J0() {
        return this.C.getValue();
    }

    @Override
    public final Object L0() {
        return this.D.getValue();
    }

    @Override
    public final void R0(Object obj) {
        this.C.setValue(obj);
    }

    @Override
    public final void S0(n1 n1Var) {
    }

    @Override
    public final void T0() {
    }

    public final void W0(Boolean bool) {
        this.D.setValue(bool);
    }
}
