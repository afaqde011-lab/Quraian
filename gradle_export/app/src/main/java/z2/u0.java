package z2;

public final class u0 implements t0 {
    @Override
    public final a0 a(a0 a0Var) {
        s0 s0Var;
        s0 s0Var2 = a0Var instanceof s0 ? (s0) a0Var : null;
        if (s0Var2 != null) {
            return s0Var2;
        }
        b3.p1 p1Var = (b3.p1) a0Var;
        b3.v0 v0VarX1 = p1Var.x1();
        return (v0VarX1 == null || (s0Var = v0VarX1.R) == null) ? p1Var : s0Var;
    }
}
