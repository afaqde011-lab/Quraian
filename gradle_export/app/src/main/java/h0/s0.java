package h0;

import g1.b4;

public class s0 extends p0 implements b3.y {
    public l2 Q;

    public s0(l2 l2Var) {
        this.Q = l2Var;
    }

    @Override
    public final d2 B1(l2 l2Var) {
        return new d2(l2Var, this.Q);
    }

    @Override
    public final void C1() {
        super.C1();
        b3.m.n(this);
    }

    @Override
    public final z2.x0 e(z2.y0 y0Var, z2.v0 v0Var, long j9) {
        int iD = this.P.d(y0Var, y0Var.getLayoutDirection()) - this.O.d(y0Var, y0Var.getLayoutDirection());
        int iC = this.P.c(y0Var) - this.O.c(y0Var);
        int iA = (this.P.a(y0Var, y0Var.getLayoutDirection()) - this.O.a(y0Var, y0Var.getLayoutDirection())) + iD;
        int iB = (this.P.b(y0Var) - this.O.b(y0Var)) + iC;
        z2.l1 l1VarO = v0Var.O(y3.b.i(-iA, j9, -iB));
        return y0Var.o0(y3.b.g(l1VarO.A + iA, j9), y3.b.f(l1VarO.B + iB, j9), h00.y.A, new b4(l1VarO, iD, iC, 1));
    }
}
