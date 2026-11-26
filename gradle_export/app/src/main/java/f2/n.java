package f2;

import b3.o0;
import b3.u0;
import b3.y;
import z2.d0;
import z2.l1;
import z2.v0;
import z2.x0;
import z2.y0;

public final class n extends b2.q implements y, b3.o {
    public m2.b O;
    public boolean P;
    public b2.d Q;
    public z2.p R;
    public float S;
    public i2.m T;

    public static boolean C1(long j9) {
        return !h2.e.a(j9, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j9 & 4294967295L))) & Integer.MAX_VALUE) < 2139095040;
    }

    public static boolean D1(long j9) {
        return !h2.e.a(j9, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j9 >> 32))) & Integer.MAX_VALUE) < 2139095040;
    }

    public final boolean B1() {
        return this.P && this.O.h() != 9205357640488583168L;
    }

    public final long E1(long j9) {
        boolean z10 = false;
        boolean z11 = y3.a.d(j9) && y3.a.c(j9);
        if (y3.a.f(j9) && y3.a.e(j9)) {
            z10 = true;
        }
        if ((!B1() && z11) || z10) {
            return y3.a.a(j9, y3.a.h(j9), 0, y3.a.g(j9), 0, 10);
        }
        long jH = this.O.h();
        int iRound = D1(jH) ? Math.round(Float.intBitsToFloat((int) (jH >> 32))) : y3.a.j(j9);
        int iRound2 = C1(jH) ? Math.round(Float.intBitsToFloat((int) (jH & 4294967295L))) : y3.a.i(j9);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(y3.b.f(iRound2, j9))) & 4294967295L) | (((long) Float.floatToRawIntBits(y3.b.g(iRound, j9))) << 32);
        if (B1()) {
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(!D1(this.O.h()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) : Float.intBitsToFloat((int) (this.O.h() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(!C1(this.O.h()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) : Float.intBitsToFloat((int) (this.O.h() & 4294967295L)))) & 4294967295L);
            jFloatToRawIntBits = (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) == 0.0f || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) == 0.0f) ? 0L : d0.p(jFloatToRawIntBits2, this.R.a(jFloatToRawIntBits2, jFloatToRawIntBits));
        }
        return y3.a.a(j9, y3.b.g(Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32))), j9), 0, y3.b.f(Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L))), j9), 0, 10);
    }

    @Override
    public final int G(u0 u0Var, v0 v0Var, int i10) {
        if (!B1()) {
            return v0Var.s(i10);
        }
        long jE1 = E1(y3.b.b(0, 0, 0, i10, 7));
        return Math.max(y3.a.j(jE1), v0Var.s(i10));
    }

    @Override
    public final int T(u0 u0Var, v0 v0Var, int i10) {
        if (!B1()) {
            return v0Var.D(i10);
        }
        long jE1 = E1(y3.b.b(0, 0, 0, i10, 7));
        return Math.max(y3.a.j(jE1), v0Var.D(i10));
    }

    @Override
    public final int d0(u0 u0Var, v0 v0Var, int i10) {
        if (!B1()) {
            return v0Var.d(i10);
        }
        long jE1 = E1(y3.b.b(0, i10, 0, 0, 13));
        return Math.max(y3.a.i(jE1), v0Var.d(i10));
    }

    @Override
    public final x0 e(y0 y0Var, v0 v0Var, long j9) {
        l1 l1VarO = v0Var.O(E1(j9));
        return y0Var.o0(l1VarO.A, l1VarO.B, h00.y.A, new c3.m(l1VarO, 2));
    }

    @Override
    public final void i(o0 o0Var) {
        long jH = this.O.h();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(D1(jH) ? Float.intBitsToFloat((int) (jH >> 32)) : Float.intBitsToFloat((int) (o0Var.A.b() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(C1(jH) ? Float.intBitsToFloat((int) (jH & 4294967295L)) : Float.intBitsToFloat((int) (o0Var.A.b() & 4294967295L)))) & 4294967295L);
        k2.b bVar = o0Var.A;
        long jP = (Float.intBitsToFloat((int) (bVar.b() >> 32)) == 0.0f || Float.intBitsToFloat((int) (bVar.b() & 4294967295L)) == 0.0f) ? 0L : d0.p(jFloatToRawIntBits, this.R.a(jFloatToRawIntBits, bVar.b()));
        long jA = this.Q.a((((long) Math.round(Float.intBitsToFloat((int) (jP >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (jP & 4294967295L)))) & 4294967295L), (((long) Math.round(Float.intBitsToFloat((int) (bVar.b() >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (bVar.b() & 4294967295L)))) & 4294967295L), o0Var.getLayoutDirection());
        float f3 = (int) (jA >> 32);
        float f10 = (int) (jA & 4294967295L);
        ((hf.c) bVar.B.B).I(f3, f10);
        try {
            this.O.g(o0Var, jP, this.S, this.T);
            ((hf.c) bVar.B.B).I(-f3, -f10);
            o0Var.a();
        } catch (Throwable th2) {
            ((hf.c) bVar.B.B).I(-f3, -f10);
            throw th2;
        }
    }

    @Override
    public final boolean q1() {
        return false;
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.O + ", sizeToIntrinsics=" + this.P + ", alignment=" + this.Q + ", alpha=" + this.S + ", colorFilter=" + this.T + ')';
    }

    @Override
    public final int z(u0 u0Var, v0 v0Var, int i10) {
        if (!B1()) {
            return v0Var.f0(i10);
        }
        long jE1 = E1(y3.b.b(0, i10, 0, 0, 13));
        return Math.max(y3.a.i(jE1), v0Var.f0(i10));
    }
}
