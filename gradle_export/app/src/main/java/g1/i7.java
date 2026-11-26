package g1;

public final class i7 implements u00.a {
    public final int A;
    public final b8 B;

    public i7(b8 b8Var, int i10) {
        this.A = i10;
        this.B = b8Var;
    }

    public final Object invoke() {
        switch (this.A) {
            case 0:
                return l1.q.z(new r3.w(y.a(z7.u(this.B), null, 14), 0L, 6));
            case 1:
                return l1.q.z(new r3.w(y.a(this.B.c(), null, 14), 0L, 6));
            case 2:
                b8 b8Var = this.B;
                if (z7.w(b8Var)) {
                    b8Var.a(b8Var.g() - 12);
                }
                return g00.b0.a;
            default:
                b8 b8Var2 = this.B;
                if (!z7.w(b8Var2)) {
                    b8Var2.a(b8Var2.g() + 12);
                }
                return g00.b0.a;
        }
    }
}
