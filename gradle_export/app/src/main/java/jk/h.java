package jk;

import i2.c0;
import i2.h0;
import i2.m;
import i2.p0;
import i2.t0;

public final class h implements c0 {
    public long A;
    public float B;
    public float C;
    public float D;
    public float E;
    public float F;
    public float[] G;

    @Override
    public final void B0() {
    }

    @Override
    public final void C(int i10) {
    }

    @Override
    public final void D0(long j9) {
    }

    @Override
    public final void I(p0 p0Var) {
    }

    @Override
    public final void I0(float f3) {
        this.D = f3;
    }

    @Override
    public final void K(m mVar) {
    }

    @Override
    public final void L0(boolean z10) {
    }

    @Override
    public final void N(float f3) {
        this.E = f3;
    }

    @Override
    public final void Q(int i10) {
    }

    @Override
    public final void S0(long j9) {
    }

    @Override
    public final void T0(float f3) {
    }

    @Override
    public final void U0(long j9) {
    }

    public final void a(hf.c cVar, y3.c cVar2, u00.k kVar) {
        kotlin.jvm.internal.m.e(cVar2, "density");
        kotlin.jvm.internal.m.e(kVar, "layerBlock");
        a1.i iVar = (a1.i) cVar.B;
        this.A = iVar.q();
        this.B = cVar2.c();
        this.C = cVar2.t0();
        kVar.invoke(this);
        float f3 = this.F;
        float f10 = this.D;
        float f11 = this.E;
        if (f3 == 0.0f) {
            if (f10 == 0.0f || f11 == 0.0f) {
                return;
            }
            cVar.H(1.0f / f10, 1.0f / f11, 0L);
            return;
        }
        float[] fArrA = this.G;
        if (fArrA == null) {
            fArrA = h0.a();
            this.G = fArrA;
        }
        if (fArrA.length < 16) {
            return;
        }
        double d3 = ((double) f3) * 0.017453292519943295d;
        float fSin = (float) Math.sin(d3);
        float fCos = (float) Math.cos(d3);
        float f12 = fCos * f10;
        float f13 = fSin * f11;
        float f14 = (-fSin) * f10;
        float f15 = fCos * f11;
        float f16 = (f12 * f15) - (f13 * f14);
        if (f16 == 0.0f) {
            return;
        }
        float f17 = 1.0f / f16;
        fArrA[0] = f15 * f17;
        fArrA[1] = (-f13) * f17;
        fArrA[4] = (-f14) * f17;
        fArrA[5] = f12 * f17;
        iVar.n().m(fArrA);
    }

    @Override
    public final long b() {
        return this.A;
    }

    @Override
    public final float c() {
        return this.B;
    }

    @Override
    public final void g1(float f3) {
    }

    @Override
    public final float j1() {
        return this.E;
    }

    @Override
    public final float l() {
        return this.D;
    }

    @Override
    public final void n(float f3) {
    }

    @Override
    public final void p0() {
    }

    @Override
    public final void s0(float f3) {
    }

    @Override
    public final float t0() {
        return this.C;
    }

    @Override
    public final void v(float f3) {
        this.F = f3;
    }

    @Override
    public final void w(float f3) {
    }

    @Override
    public final void z0(t0 t0Var) {
        kotlin.jvm.internal.m.e(t0Var, "<set-?>");
    }
}
