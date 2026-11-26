package z2;

public final class u1 extends kotlin.jvm.internal.n implements u00.n {
    public final int A;
    public final v1 B;

    public u1(v1 v1Var, int i10) {
        super(2);
        this.A = i10;
        this.B = v1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                this.B.a().B = (l1.n) obj2;
                break;
            case 1:
                q0 q0VarA = this.B.a();
                ((b3.l0) obj).e0(new n0(q0VarA, (u00.n) obj2, q0VarA.P));
                break;
            default:
                b3.l0 l0Var = (b3.l0) obj;
                v1 v1Var = this.B;
                x1 x1Var = v1Var.f17164a;
                q0 q0Var = l0Var.f2061i0;
                if (q0Var == null) {
                    q0Var = new q0(l0Var, x1Var);
                    l0Var.f2061i0 = q0Var;
                }
                v1Var.f17165b = q0Var;
                v1Var.a().h();
                q0 q0VarA2 = v1Var.a();
                if (q0VarA2.C != x1Var) {
                    q0VarA2.C = x1Var;
                    q0VarA2.j(false);
                    b3.l0.X(q0VarA2.A, false, 7);
                }
                break;
        }
        return g00.b0.a;
    }
}
