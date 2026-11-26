package z2;

import java.util.List;

public final class n0 extends b3.g0 {

    public final q0 f17141b;

    public final u00.n f17142c;

    public n0(q0 q0Var, u00.n nVar, String str) {
        super(str);
        this.f17141b = q0Var;
        this.f17142c = nVar;
    }

    @Override
    public final x0 j(y0 y0Var, List list, long j9) {
        q0 q0Var = this.f17141b;
        l0 l0Var = q0Var.H;
        l0Var.A = y0Var.getLayoutDirection();
        l0Var.B = y0Var.c();
        l0Var.C = y0Var.t0();
        boolean zW0 = y0Var.w0();
        u00.n nVar = this.f17142c;
        if (zW0 || q0Var.A.I == null) {
            q0Var.D = 0;
            x0 x0Var = (x0) nVar.invoke(l0Var, new y3.a(j9));
            return new m0(x0Var, q0Var, q0Var.D, x0Var, 1);
        }
        q0Var.E = 0;
        x0 x0Var2 = (x0) nVar.invoke(q0Var.I, new y3.a(j9));
        return new m0(x0Var2, q0Var, q0Var.E, x0Var2, 0);
    }
}
