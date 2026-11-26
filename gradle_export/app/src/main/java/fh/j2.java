package fh;

public final class j2 extends c1 {
    public static final j2 H;
    public final transient a2 E;
    public final transient int F;
    public transient b1 G;

    static {
        a2 a2Var = new a2();
        a2Var.d(3);
        H = new j2(a2Var);
    }

    public j2(a2 a2Var) {
        this.E = a2Var;
        long j9 = 0;
        int i10 = 0;
        while (true) {
            int i11 = a2Var.f5666c;
            if (i10 >= i11) {
                this.F = bi.b.P(j9);
                return;
            } else {
                ta.c0.u(i10, i11);
                j9 += (long) a2Var.f5665b[i10];
                i10++;
            }
        }
    }

    @Override
    public final boolean i() {
        throw null;
    }

    @Override
    public final e1 l() {
        b1 b1Var = this.G;
        if (b1Var != null) {
            return b1Var;
        }
        b1 b1Var2 = new b1(this, 1);
        this.G = b1Var2;
        return b1Var2;
    }

    @Override
    public final int size() {
        return this.F;
    }
}
