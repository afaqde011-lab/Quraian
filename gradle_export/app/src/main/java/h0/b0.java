package h0;

import a1.q2;

public final class b0 extends b2.q implements b3.y {
    public z O;
    public float P;

    @Override
    public final z2.x0 e(z2.y0 y0Var, z2.v0 v0Var, long j9) {
        int iJ;
        int iH;
        int iG;
        int i10;
        if (!y3.a.d(j9) || this.O == z.A) {
            iJ = y3.a.j(j9);
            iH = y3.a.h(j9);
        } else {
            int iRound = Math.round(y3.a.h(j9) * this.P);
            int iJ2 = y3.a.j(j9);
            iJ = y3.a.h(j9);
            if (iRound < iJ2) {
                iRound = iJ2;
            }
            if (iRound <= iJ) {
                iJ = iRound;
            }
            iH = iJ;
        }
        if (!y3.a.c(j9) || this.O == z.B) {
            int i11 = y3.a.i(j9);
            int iG2 = y3.a.g(j9);
            iG = i11;
            i10 = iG2;
        } else {
            int iRound2 = Math.round(y3.a.g(j9) * this.P);
            int i12 = y3.a.i(j9);
            iG = y3.a.g(j9);
            if (iRound2 < i12) {
                iRound2 = i12;
            }
            if (iRound2 <= iG) {
                iG = iRound2;
            }
            i10 = iG;
        }
        z2.l1 l1VarO = v0Var.O(y3.b.a(iJ, iH, iG, i10));
        return y0Var.o0(l1VarO.A, l1VarO.B, h00.y.A, new q2(l1VarO, 6));
    }
}
