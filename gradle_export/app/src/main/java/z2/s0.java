package z2;

public final class s0 implements a0 {
    public final b3.v0 A;

    public s0(b3.v0 v0Var) {
        this.A = v0Var;
    }

    @Override
    public final boolean A() {
        return this.A.O.z1().N;
    }

    @Override
    public final h2.c F(a0 a0Var, boolean z10) {
        return this.A.O.F(a0Var, z10);
    }

    @Override
    public final long G(long j9) {
        return this.A.O.G(h2.b.f(0L, a()));
    }

    @Override
    public final long T(long j9) {
        return h2.b.f(this.A.O.T(j9), a());
    }

    @Override
    public final long V(a0 a0Var, long j9) {
        return o(a0Var, j9, true);
    }

    @Override
    public final a0 W() {
        b3.v0 v0VarX1;
        if (!A()) {
            y2.a.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        b3.p1 p1Var = ((b3.p1) this.A.O.O.f2059g0.E).S;
        if (p1Var == null || (v0VarX1 = p1Var.x1()) == null) {
            return null;
        }
        return v0VarX1.R;
    }

    public final long a() {
        b3.v0 v0Var = this.A;
        b3.v0 v0VarK = d0.k(v0Var);
        return h2.b.e(o(v0VarK.R, 0L, true), v0Var.O.o(v0VarK.O, 0L, true));
    }

    @Override
    public final long c0(long j9) {
        return h2.b.f(this.A.O.c0(j9), a());
    }

    @Override
    public final long d0(long j9) {
        return this.A.O.d0(h2.b.f(j9, a()));
    }

    @Override
    public final long e(long j9) {
        return this.A.O.e(h2.b.f(j9, a()));
    }

    @Override
    public final void f(a0 a0Var, float[] fArr) {
        this.A.O.f(a0Var, fArr);
    }

    @Override
    public final a0 h() {
        b3.v0 v0VarX1;
        if (!A()) {
            y2.a.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        b3.p1 p1Var = this.A.O.S;
        if (p1Var == null || (v0VarX1 = p1Var.x1()) == null) {
            return null;
        }
        return v0VarX1.R;
    }

    @Override
    public final void k(float[] fArr) {
        this.A.O.k(fArr);
    }

    @Override
    public final long o(a0 a0Var, long j9, boolean z10) {
        boolean z11 = a0Var instanceof s0;
        b3.v0 v0Var = this.A;
        if (!z11) {
            b3.v0 v0VarK = d0.k(v0Var);
            a0 a0Var2 = v0VarK.O;
            long jO = o(v0VarK.R, j9, z10);
            long j10 = v0VarK.P;
            long jE = h2.b.e(jO, (4294967295L & ((long) Float.floatToRawIntBits((int) (j10 & 4294967295L)))) | (Float.floatToRawIntBits((int) (j10 >> 32)) << 32));
            a0 a0VarH = a0Var2.h();
            if (a0VarH != null) {
                a0Var2 = a0VarH;
            }
            return h2.b.f(jE, ((b3.p1) a0Var2).o(a0Var, 0L, z10));
        }
        b3.v0 v0Var2 = ((s0) a0Var).A;
        b3.p1 p1Var = v0Var2.O;
        p1Var.I1();
        b3.v0 v0VarX1 = v0Var.O.v1(p1Var).x1();
        if (v0VarX1 != null) {
            boolean z12 = !z10;
            long jC = y3.j.c(y3.j.d(v0Var2.s1(v0VarX1, z12), f50.k.C(j9)), v0Var.s1(v0VarX1, z12));
            return (((long) Float.floatToRawIntBits((int) (jC >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (jC & 4294967295L))) & 4294967295L);
        }
        b3.v0 v0VarK2 = d0.k(v0Var2);
        boolean z13 = !z10;
        long jD = y3.j.d(y3.j.d(v0Var2.s1(v0VarK2, z13), v0VarK2.P), f50.k.C(j9));
        b3.v0 v0VarK3 = d0.k(v0Var);
        long jC2 = y3.j.c(jD, y3.j.d(v0Var.s1(v0VarK3, z13), v0VarK3.P));
        long jFloatToRawIntBits = Float.floatToRawIntBits((int) (jC2 >> 32));
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits((int) (jC2 & 4294967295L))) & 4294967295L;
        b3.p1 p1Var2 = v0VarK3.O.S;
        kotlin.jvm.internal.m.b(p1Var2);
        b3.p1 p1Var3 = v0VarK2.O.S;
        kotlin.jvm.internal.m.b(p1Var3);
        return p1Var2.o(p1Var3, jFloatToRawIntBits2 | (jFloatToRawIntBits << 32), z10);
    }

    @Override
    public final long p() {
        b3.v0 v0Var = this.A;
        return (((long) v0Var.A) << 32) | (((long) v0Var.B) & 4294967295L);
    }
}
