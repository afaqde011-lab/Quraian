package fh;

public final class f1 extends t0 {
    public final b1 C;

    public f1(b1 b1Var) {
        this.C = b1Var;
    }

    @Override
    public final Object get(int i10) {
        b1 b1Var = this.C;
        switch (b1Var.D) {
            case 0:
                a2 a2Var = ((j2) b1Var.E).E;
                ta.c0.u(i10, a2Var.f5666c);
                return new z1(a2Var, i10);
            default:
                a2 a2Var2 = ((j2) b1Var.E).E;
                ta.c0.u(i10, a2Var2.f5666c);
                return a2Var2.f5664a[i10];
        }
    }

    @Override
    public final boolean i() {
        return this.C.i();
    }

    @Override
    public final int size() {
        return this.C.size();
    }
}
