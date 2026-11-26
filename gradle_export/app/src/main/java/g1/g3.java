package g1;

public final class g3 implements i2.u {
    public final int A;
    public final Object B;

    public g3(Object obj, int i10) {
        this.A = i10;
        this.B = obj;
    }

    @Override
    public final long a() {
        switch (this.A) {
            case 0:
                h3 h3Var = (h3) this.B;
                long jA = h3Var.T.a();
                if (jA != 16) {
                    return jA;
                }
                w5 w5Var = (w5) b3.m.h(h3Var, y5.f6029a);
                if (w5Var != null) {
                    long j9 = w5Var.f6023a;
                    if (j9 != 16) {
                        return j9;
                    }
                }
                return ((i2.t) b3.m.h(h3Var, y0.f6028a)).f7169a;
            default:
                return ((z5) this.B).f6044c;
        }
    }
}
