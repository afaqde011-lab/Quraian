package h0;

import a1.q2;

public final class h2 extends b2.q implements b3.y {
    public float O;
    public float P;

    @Override
    public final int G(b3.u0 u0Var, z2.v0 v0Var, int i10) {
        int iS = v0Var.s(i10);
        int iR0 = !Float.isNaN(this.O) ? u0Var.R0(this.O) : 0;
        return iS < iR0 ? iR0 : iS;
    }

    @Override
    public final int T(b3.u0 u0Var, z2.v0 v0Var, int i10) {
        int iD = v0Var.D(i10);
        int iR0 = !Float.isNaN(this.O) ? u0Var.R0(this.O) : 0;
        return iD < iR0 ? iR0 : iD;
    }

    @Override
    public final int d0(b3.u0 u0Var, z2.v0 v0Var, int i10) {
        int iD = v0Var.d(i10);
        int iR0 = !Float.isNaN(this.P) ? u0Var.R0(this.P) : 0;
        return iD < iR0 ? iR0 : iD;
    }

    @Override
    public final z2.x0 e(z2.y0 y0Var, z2.v0 v0Var, long j9) {
        int iJ;
        int i10;
        if (Float.isNaN(this.O) || y3.a.j(j9) != 0) {
            iJ = y3.a.j(j9);
        } else {
            int iR0 = y0Var.R0(this.O);
            iJ = y3.a.h(j9);
            if (iR0 < 0) {
                iR0 = 0;
            }
            if (iR0 <= iJ) {
                iJ = iR0;
            }
        }
        int iH = y3.a.h(j9);
        if (Float.isNaN(this.P) || y3.a.i(j9) != 0) {
            i10 = y3.a.i(j9);
        } else {
            int iR1 = y0Var.R0(this.P);
            i10 = y3.a.g(j9);
            int i11 = iR1 >= 0 ? iR1 : 0;
            if (i11 <= i10) {
                i10 = i11;
            }
        }
        z2.l1 l1VarO = v0Var.O(y3.b.a(iJ, iH, i10, y3.a.g(j9)));
        return y0Var.o0(l1VarO.A, l1VarO.B, h00.y.A, new q2(l1VarO, 9));
    }

    @Override
    public final int z(b3.u0 u0Var, z2.v0 v0Var, int i10) {
        int iF0 = v0Var.f0(i10);
        int iR0 = !Float.isNaN(this.P) ? u0Var.R0(this.P) : 0;
        return iF0 < iR0 ? iR0 : iF0;
    }
}
