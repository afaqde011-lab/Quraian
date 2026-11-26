package h0;

import a1.q2;

public final class a2 extends b2.q implements b3.y {
    public float O;
    public float P;
    public float Q;
    public float R;
    public boolean S;

    public final long B1(z2.y0 y0Var) {
        int iR0;
        int iR1;
        int iR2;
        int i10 = 0;
        if (Float.isNaN(this.Q)) {
            iR0 = Integer.MAX_VALUE;
        } else {
            iR0 = y0Var.R0(this.Q);
            if (iR0 < 0) {
                iR0 = 0;
            }
        }
        if (Float.isNaN(this.R)) {
            iR1 = Integer.MAX_VALUE;
        } else {
            iR1 = y0Var.R0(this.R);
            if (iR1 < 0) {
                iR1 = 0;
            }
        }
        if (Float.isNaN(this.O)) {
            iR2 = 0;
        } else {
            iR2 = y0Var.R0(this.O);
            if (iR2 < 0) {
                iR2 = 0;
            }
            if (iR2 > iR0) {
                iR2 = iR0;
            }
            if (iR2 == Integer.MAX_VALUE) {
                iR2 = 0;
            }
        }
        if (!Float.isNaN(this.P)) {
            int iR3 = y0Var.R0(this.P);
            if (iR3 < 0) {
                iR3 = 0;
            }
            if (iR3 > iR1) {
                iR3 = iR1;
            }
            if (iR3 != Integer.MAX_VALUE) {
                i10 = iR3;
            }
        }
        return y3.b.a(iR2, iR0, i10, iR1);
    }

    @Override
    public final int G(b3.u0 u0Var, z2.v0 v0Var, int i10) {
        long jB1 = B1(u0Var);
        if (y3.a.f(jB1)) {
            return y3.a.h(jB1);
        }
        if (!this.S) {
            i10 = y3.b.f(i10, jB1);
        }
        return y3.b.g(v0Var.s(i10), jB1);
    }

    @Override
    public final int T(b3.u0 u0Var, z2.v0 v0Var, int i10) {
        long jB1 = B1(u0Var);
        if (y3.a.f(jB1)) {
            return y3.a.h(jB1);
        }
        if (!this.S) {
            i10 = y3.b.f(i10, jB1);
        }
        return y3.b.g(v0Var.D(i10), jB1);
    }

    @Override
    public final int d0(b3.u0 u0Var, z2.v0 v0Var, int i10) {
        long jB1 = B1(u0Var);
        if (y3.a.e(jB1)) {
            return y3.a.g(jB1);
        }
        if (!this.S) {
            i10 = y3.b.g(i10, jB1);
        }
        return y3.b.f(v0Var.d(i10), jB1);
    }

    @Override
    public final z2.x0 e(z2.y0 y0Var, z2.v0 v0Var, long j9) {
        int iJ;
        int iH;
        int i10;
        int iG;
        long jA;
        long jB1 = B1(y0Var);
        if (this.S) {
            jA = y3.b.e(j9, jB1);
        } else {
            if (Float.isNaN(this.O)) {
                iJ = y3.a.j(j9);
                int iH2 = y3.a.h(jB1);
                if (iJ > iH2) {
                    iJ = iH2;
                }
            } else {
                iJ = y3.a.j(jB1);
            }
            if (Float.isNaN(this.Q)) {
                iH = y3.a.h(j9);
                int iJ2 = y3.a.j(jB1);
                if (iH < iJ2) {
                    iH = iJ2;
                }
            } else {
                iH = y3.a.h(jB1);
            }
            if (Float.isNaN(this.P)) {
                i10 = y3.a.i(j9);
                int iG2 = y3.a.g(jB1);
                if (i10 > iG2) {
                    i10 = iG2;
                }
            } else {
                i10 = y3.a.i(jB1);
            }
            if (Float.isNaN(this.R)) {
                iG = y3.a.g(j9);
                int i11 = y3.a.i(jB1);
                if (iG < i11) {
                    iG = i11;
                }
            } else {
                iG = y3.a.g(jB1);
            }
            jA = y3.b.a(iJ, iH, i10, iG);
        }
        z2.l1 l1VarO = v0Var.O(jA);
        return y0Var.o0(l1VarO.A, l1VarO.B, h00.y.A, new q2(l1VarO, 8));
    }

    @Override
    public final int z(b3.u0 u0Var, z2.v0 v0Var, int i10) {
        long jB1 = B1(u0Var);
        if (y3.a.e(jB1)) {
            return y3.a.g(jB1);
        }
        if (!this.S) {
            i10 = y3.b.g(i10, jB1);
        }
        return y3.b.f(v0Var.f0(i10), jB1);
    }
}
