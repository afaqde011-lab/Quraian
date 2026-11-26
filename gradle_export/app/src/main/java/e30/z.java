package e30;

public final class z extends n {
    public final int C;

    public z(a0 a0Var, int i) {
        super(a0Var);
        this.C = i;
    }

    @Override
    public final m G0(a0 a0Var) {
        switch (this.C) {
            case 0:
                return new z(a0Var, 0);
            default:
                return new z(a0Var, 1);
        }
    }

    @Override
    public final boolean t0() {
        switch (this.C) {
            case 0:
                return false;
            default:
                return true;
        }
    }
}
