package z2;

import java.util.Map;

public final class g implements h, e {
    public final e A;
    public final y3.m B;

    public g(e eVar, y3.m mVar) {
        this.A = eVar;
        this.B = mVar;
    }

    @Override
    public final float A0(float f3) {
        return this.A.A0(f3);
    }

    @Override
    public final float H(long j9) {
        return this.A.H(j9);
    }

    @Override
    public final x0 J(int i10, int i11, Map map, u00.k kVar, u00.k kVar2) {
        int i12 = i10 < 0 ? 0 : i10;
        int i13 = i11 < 0 ? 0 : i11;
        if ((i12 & (-16777216)) != 0 || ((-16777216) & i13) != 0) {
            y2.a.c("Size(" + i12 + " x " + i13 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new f(i12, i13, map, kVar, 0);
    }

    @Override
    public final int R0(float f3) {
        return this.A.R0(f3);
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
        return this.B;
    }

    @Override
    public final float h0(int i10) {
        return this.A.h0(i10);
    }

    @Override
    public final float k0(float f3) {
        return this.A.k0(f3);
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
        return this.A.w0();
    }
}
