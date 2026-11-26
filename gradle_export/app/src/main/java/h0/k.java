package h0;

import a1.q2;

public final class k extends b2.q implements b3.y {
    public float O;

    public final long B1(boolean z10, long j9) {
        int iRound;
        int iG = y3.a.g(j9);
        if (iG == Integer.MAX_VALUE || (iRound = Math.round(iG * this.O)) <= 0) {
            return 0L;
        }
        if (!z10 || c.v(iRound, j9, iG)) {
            return (((long) iRound) << 32) | (((long) iG) & 4294967295L);
        }
        return 0L;
    }

    public final long C1(boolean z10, long j9) {
        int iRound;
        int iH = y3.a.h(j9);
        if (iH == Integer.MAX_VALUE || (iRound = Math.round(iH / this.O)) <= 0) {
            return 0L;
        }
        if (!z10 || c.v(iH, j9, iRound)) {
            return (((long) iH) << 32) | (((long) iRound) & 4294967295L);
        }
        return 0L;
    }

    public final long D1(boolean z10, long j9) {
        int i10 = y3.a.i(j9);
        int iRound = Math.round(i10 * this.O);
        if (iRound <= 0) {
            return 0L;
        }
        if (!z10 || c.v(iRound, j9, i10)) {
            return (((long) iRound) << 32) | (((long) i10) & 4294967295L);
        }
        return 0L;
    }

    public final long E1(boolean z10, long j9) {
        int iJ = y3.a.j(j9);
        int iRound = Math.round(iJ / this.O);
        if (iRound <= 0) {
            return 0L;
        }
        if (!z10 || c.v(iJ, j9, iRound)) {
            return (((long) iJ) << 32) | (((long) iRound) & 4294967295L);
        }
        return 0L;
    }

    @Override
    public final int G(b3.u0 u0Var, z2.v0 v0Var, int i10) {
        return i10 != Integer.MAX_VALUE ? Math.round(i10 * this.O) : v0Var.s(i10);
    }

    @Override
    public final int T(b3.u0 u0Var, z2.v0 v0Var, int i10) {
        return i10 != Integer.MAX_VALUE ? Math.round(i10 * this.O) : v0Var.D(i10);
    }

    @Override
    public final int d0(b3.u0 u0Var, z2.v0 v0Var, int i10) {
        return i10 != Integer.MAX_VALUE ? Math.round(i10 / this.O) : v0Var.d(i10);
    }

    @Override
    public final z2.x0 e(z2.y0 y0Var, z2.v0 v0Var, long j9) {
        long jC1 = C1(true, j9);
        if (y3.l.b(jC1, 0L)) {
            jC1 = B1(true, j9);
            if (y3.l.b(jC1, 0L)) {
                jC1 = E1(true, j9);
                if (y3.l.b(jC1, 0L)) {
                    jC1 = D1(true, j9);
                    if (y3.l.b(jC1, 0L)) {
                        jC1 = C1(false, j9);
                        if (y3.l.b(jC1, 0L)) {
                            jC1 = B1(false, j9);
                            if (y3.l.b(jC1, 0L)) {
                                jC1 = E1(false, j9);
                                if (y3.l.b(jC1, 0L)) {
                                    jC1 = D1(false, j9);
                                    if (y3.l.b(jC1, 0L)) {
                                        jC1 = 0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!y3.l.b(jC1, 0L)) {
            int i10 = (int) (jC1 >> 32);
            int i11 = (int) (4294967295L & jC1);
            if (!((i10 >= 0) & (i11 >= 0))) {
                y3.i.a("width and height must be >= 0");
            }
            j9 = y3.b.h(i10, i10, i11, i11);
        }
        z2.l1 l1VarO = v0Var.O(j9);
        return y0Var.o0(l1VarO.A, l1VarO.B, h00.y.A, new q2(l1VarO, 5));
    }

    @Override
    public final int z(b3.u0 u0Var, z2.v0 v0Var, int i10) {
        return i10 != Integer.MAX_VALUE ? Math.round(i10 / this.O) : v0Var.f0(i10);
    }
}
