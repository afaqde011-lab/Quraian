package h0;

public final class w0 extends y0 {
    public x0 P;
    public boolean Q;

    @Override
    public final long B1(z2.v0 v0Var, long j9) {
        int iF0 = this.P == x0.A ? v0Var.f0(y3.a.h(j9)) : v0Var.d(y3.a.h(j9));
        if (iF0 < 0) {
            iF0 = 0;
        }
        if (iF0 < 0) {
            y3.i.a("height must be >= 0");
        }
        return y3.b.h(0, Integer.MAX_VALUE, iF0, iF0);
    }

    @Override
    public final boolean C1() {
        return this.Q;
    }

    @Override
    public final int d0(b3.u0 u0Var, z2.v0 v0Var, int i10) {
        return this.P == x0.A ? v0Var.f0(i10) : v0Var.d(i10);
    }

    @Override
    public final int z(b3.u0 u0Var, z2.v0 v0Var, int i10) {
        return this.P == x0.A ? v0Var.f0(i10) : v0Var.d(i10);
    }
}
