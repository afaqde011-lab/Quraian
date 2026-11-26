package z2;

import java.util.Map;
import kotlin.KotlinNothingValueException;

public final class i implements h, y0, t0 {
    public final b3.b0 A;
    public w.f1 B;
    public boolean C;

    public i(b3.b0 b0Var, w.f1 f1Var) {
        this.A = b0Var;
        this.B = f1Var;
    }

    @Override
    public final float A0(float f3) {
        return this.A.c() * f3;
    }

    @Override
    public final float H(long j9) {
        return this.A.H(j9);
    }

    @Override
    public final x0 J(int i10, int i11, Map map, u00.k kVar, u00.k kVar2) {
        if ((i10 & (-16777216)) != 0 || ((-16777216) & i11) != 0) {
            y2.a.c("Size(" + i10 + " x " + i11 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new b3.t0(i10, i11, map, kVar, kVar2, this, 1);
    }

    @Override
    public final int R0(float f3) {
        return this.A.R0(f3);
    }

    @Override
    public final a0 a(a0 a0Var) throws KotlinNothingValueException {
        s0 s0Var;
        if (a0Var instanceof s0) {
            return a0Var;
        }
        if (a0Var instanceof b3.p1) {
            b3.v0 v0VarX1 = ((b3.p1) a0Var).x1();
            return (v0VarX1 == null || (s0Var = v0VarX1.R) == null) ? a0Var : s0Var;
        }
        y2.a.b("Unsupported LayoutCoordinates");
        throw new KotlinNothingValueException();
    }

    @Override
    public final long b0(float f3) {
        return this.A.b0(f3);
    }

    @Override
    public final long b1(long j9) {
        return this.A.b1(j9);
    }

    @Override
    public final float c() {
        return this.A.c();
    }

    @Override
    public final float f1(long j9) {
        return this.A.f1(j9);
    }

    @Override
    public final y3.m getLayoutDirection() {
        return this.A.O.f2053a0;
    }

    @Override
    public final float h0(int i10) {
        return this.A.h0(i10);
    }

    @Override
    public final float k0(float f3) {
        return f3 / this.A.c();
    }

    @Override
    public final x0 o0(int i10, int i11, Map map, u00.k kVar) {
        return this.A.J(i10, i11, map, null, kVar);
    }

    @Override
    public final long r(float f3) {
        return this.A.r(f3);
    }

    @Override
    public final long t(long j9) {
        return this.A.t(j9);
    }

    @Override
    public final float t0() {
        return this.A.t0();
    }

    @Override
    public final boolean w0() {
        return false;
    }
}
