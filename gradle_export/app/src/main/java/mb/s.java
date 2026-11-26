package mb;

import b3.o0;
import b3.u0;
import z2.d0;
import z2.l1;
import z2.p1;
import z2.v0;
import z2.x0;
import z2.y0;

public final class s extends b2.q implements b3.o, b3.y {
    public m2.b O;
    public b2.d P;
    public z2.p Q;
    public float R;

    public final long B1(long j9) {
        if (h2.e.f(j9)) {
            return 0L;
        }
        long jH = this.O.h();
        if (jH != 9205357640488583168L) {
            float fE = h2.e.e(jH);
            if (Float.isInfinite(fE) || Float.isNaN(fE)) {
                fE = h2.e.e(j9);
            }
            float fB = h2.e.b(jH);
            if (Float.isInfinite(fB) || Float.isNaN(fB)) {
                fB = h2.e.b(j9);
            }
            long jI = ca.v.i(fE, fB);
            long jA = this.Q.a(jI, j9);
            int i10 = p1.f17155a;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jA >> 32));
            if (!Float.isInfinite(fIntBitsToFloat) && !Float.isNaN(fIntBitsToFloat)) {
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & jA));
                if (!Float.isInfinite(fIntBitsToFloat2) && !Float.isNaN(fIntBitsToFloat2)) {
                    return d0.p(jI, jA);
                }
            }
        }
        return j9;
    }

    public final long C1(long j9) {
        float fJ;
        int i10;
        float fX;
        boolean zF = y3.a.f(j9);
        boolean zE = y3.a.e(j9);
        if (!zF || !zE) {
            boolean z10 = y3.a.d(j9) && y3.a.c(j9);
            long jH = this.O.h();
            if (jH != 9205357640488583168L) {
                if (!z10 || (!zF && !zE)) {
                    float fE = h2.e.e(jH);
                    float fB = h2.e.b(jH);
                    if (Float.isInfinite(fE) || Float.isNaN(fE)) {
                        fJ = y3.a.j(j9);
                    } else {
                        xb.e eVar = c0.f10804b;
                        fJ = ab.a0.x(fE, y3.a.j(j9), y3.a.h(j9));
                    }
                    if (Float.isInfinite(fB) || Float.isNaN(fB)) {
                        i10 = y3.a.i(j9);
                    } else {
                        xb.e eVar2 = c0.f10804b;
                        fX = ab.a0.x(fB, y3.a.i(j9), y3.a.g(j9));
                    }
                    long jB1 = B1(ca.v.i(fJ, fX));
                    return y3.a.a(j9, y3.b.g(w00.a.F(h2.e.e(jB1)), j9), 0, y3.b.f(w00.a.F(h2.e.b(jB1)), j9), 0, 10);
                }
                fJ = y3.a.h(j9);
                i10 = y3.a.g(j9);
                fX = i10;
                long jB2 = B1(ca.v.i(fJ, fX));
                return y3.a.a(j9, y3.b.g(w00.a.F(h2.e.e(jB2)), j9), 0, y3.b.f(w00.a.F(h2.e.b(jB2)), j9), 0, 10);
            }
            if (z10) {
                return y3.a.a(j9, y3.a.h(j9), 0, y3.a.g(j9), 0, 10);
            }
        }
        return j9;
    }

    @Override
    public final int G(u0 u0Var, v0 v0Var, int i10) {
        if (this.O.h() == 9205357640488583168L) {
            return v0Var.s(i10);
        }
        int iS = v0Var.s(y3.a.g(C1(y3.b.b(0, 0, 0, i10, 7))));
        return Math.max(w00.a.F(h2.e.e(B1(ca.v.i(iS, i10)))), iS);
    }

    @Override
    public final int T(u0 u0Var, v0 v0Var, int i10) {
        if (this.O.h() == 9205357640488583168L) {
            return v0Var.D(i10);
        }
        int iD = v0Var.D(y3.a.g(C1(y3.b.b(0, 0, 0, i10, 7))));
        return Math.max(w00.a.F(h2.e.e(B1(ca.v.i(iD, i10)))), iD);
    }

    @Override
    public final int d0(u0 u0Var, v0 v0Var, int i10) {
        if (this.O.h() == 9205357640488583168L) {
            return v0Var.d(i10);
        }
        int iD = v0Var.d(y3.a.h(C1(y3.b.b(0, i10, 0, 0, 13))));
        return Math.max(w00.a.F(h2.e.b(B1(ca.v.i(i10, iD)))), iD);
    }

    @Override
    public final x0 e(y0 y0Var, v0 v0Var, long j9) {
        l1 l1VarO = v0Var.O(C1(j9));
        return y0Var.o0(l1VarO.A, l1VarO.B, h00.y.A, new c3.m(l1VarO, 4));
    }

    @Override
    public final void i(o0 o0Var) {
        k2.b bVar = o0Var.A;
        long jB1 = B1(bVar.b());
        b2.d dVar = this.P;
        xb.e eVar = c0.f10804b;
        long jF = (((long) w00.a.F(h2.e.e(jB1))) << 32) | (((long) w00.a.F(h2.e.b(jB1))) & 4294967295L);
        long jB = bVar.b();
        long jA = dVar.a(jF, (((long) w00.a.F(h2.e.e(jB))) << 32) | (((long) w00.a.F(h2.e.b(jB))) & 4294967295L), o0Var.getLayoutDirection());
        float f3 = (int) (jA >> 32);
        float f10 = (int) (jA & 4294967295L);
        ((hf.c) bVar.B.B).I(f3, f10);
        this.O.g(o0Var, jB1, this.R, null);
        ((hf.c) bVar.B.B).I(-f3, -f10);
        o0Var.a();
    }

    @Override
    public final boolean q1() {
        return false;
    }

    @Override
    public final int z(u0 u0Var, v0 v0Var, int i10) {
        if (this.O.h() == 9205357640488583168L) {
            return v0Var.f0(i10);
        }
        int iF0 = v0Var.f0(y3.a.h(C1(y3.b.b(0, i10, 0, 0, 13))));
        return Math.max(w00.a.F(h2.e.b(B1(ca.v.i(i10, iF0)))), iF0);
    }
}
