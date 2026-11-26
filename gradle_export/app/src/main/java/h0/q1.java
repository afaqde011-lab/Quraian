package h0;

import g1.b4;

public final class q1 extends b2.q implements b3.y {
    public n1 O;

    @Override
    public final z2.x0 e(z2.y0 y0Var, z2.v0 v0Var, long j9) {
        float fB = this.O.b(y0Var.getLayoutDirection());
        float fC = this.O.c();
        float fD = this.O.d(y0Var.getLayoutDirection());
        float fA = this.O.a();
        float f3 = 0;
        if (!((y3.f.a(fA, f3) >= 0) & (y3.f.a(fB, f3) >= 0) & (y3.f.a(fC, f3) >= 0) & (y3.f.a(fD, f3) >= 0))) {
            i0.a.a("Padding must be non-negative");
        }
        int iR0 = y0Var.R0(fB);
        int iR1 = y0Var.R0(fD) + iR0;
        int iR2 = y0Var.R0(fC);
        int iR3 = y0Var.R0(fA) + iR2;
        z2.l1 l1VarO = v0Var.O(y3.b.i(-iR1, j9, -iR3));
        return y0Var.o0(y3.b.g(l1VarO.A + iR1, j9), y3.b.f(l1VarO.B + iR3, j9), h00.y.A, new b4(l1VarO, iR0, iR2, 2));
    }
}
