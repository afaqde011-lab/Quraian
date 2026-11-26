package h0;

public final class a1 extends y0 {
    public x0 P;
    public boolean Q;

    @Override
    public final long B1(z2.v0 v0Var, long j9) {
        int iS = this.P == x0.A ? v0Var.s(y3.a.g(j9)) : v0Var.D(y3.a.g(j9));
        if (iS < 0) {
            iS = 0;
        }
        if (iS < 0) {
            y3.i.a("width must be >= 0");
        }
        return y3.b.h(iS, iS, 0, Integer.MAX_VALUE);
    }

    @Override
    public final boolean C1() {
        return this.Q;
    }

    @Override
    public final int G(b3.u0 u0Var, z2.v0 v0Var, int i10) {
        return this.P == x0.A ? v0Var.s(i10) : v0Var.D(i10);
    }

    @Override
    public final int T(b3.u0 u0Var, z2.v0 v0Var, int i10) {
        return this.P == x0.A ? v0Var.s(i10) : v0Var.D(i10);
    }
}
