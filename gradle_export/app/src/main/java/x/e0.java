package x;

import l1.p2;

public final class e0 implements p2 {
    public Float A;
    public Float B;
    public final l1.i1 C;
    public h1 D;
    public boolean E;
    public boolean F;
    public long G;
    public final g0 H;

    public e0(g0 g0Var, Float f3, Float f10, d0 d0Var) {
        this.H = g0Var;
        this.A = f3;
        this.B = f10;
        this.C = l1.q.z(f3);
        this.D = new h1(d0Var, this.A, this.B);
    }

    @Override
    public final Object getValue() {
        return this.C.getValue();
    }
}
