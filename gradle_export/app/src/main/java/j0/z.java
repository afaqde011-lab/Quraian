package j0;

import a1.q2;
import l1.p2;
import z2.l1;
import z2.v0;
import z2.x0;
import z2.y0;

public final class z extends b2.q implements b3.y {
    public float O;
    public p2 P;
    public p2 Q;

    @Override
    public final x0 e(y0 y0Var, v0 v0Var, long j9) {
        p2 p2Var = this.P;
        int iRound = (p2Var == null || ((Number) p2Var.getValue()).intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : Math.round(((Number) p2Var.getValue()).floatValue() * this.O);
        p2 p2Var2 = this.Q;
        int iRound2 = (p2Var2 == null || ((Number) p2Var2.getValue()).intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : Math.round(((Number) p2Var2.getValue()).floatValue() * this.O);
        int iJ = iRound != Integer.MAX_VALUE ? iRound : y3.a.j(j9);
        int i10 = iRound2 != Integer.MAX_VALUE ? iRound2 : y3.a.i(j9);
        if (iRound == Integer.MAX_VALUE) {
            iRound = y3.a.h(j9);
        }
        if (iRound2 == Integer.MAX_VALUE) {
            iRound2 = y3.a.g(j9);
        }
        l1 l1VarO = v0Var.O(y3.b.a(iJ, iRound, i10, iRound2));
        return y0Var.o0(l1VarO.A, l1VarO.B, h00.y.A, new q2(l1VarO, 11));
    }
}
