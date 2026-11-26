package z2;

import b3.i2;

public final class r0 extends k1 {
    public final int B;
    public final Object C;

    public r0(Object obj, int i10) {
        this.B = i10;
        this.C = obj;
    }

    @Override
    public final float c() {
        switch (this.B) {
            case 0:
                return ((b3.u0) this.C).c();
            default:
                return ((c3.z) this.C).getDensity().c();
        }
    }

    @Override
    public float d(t tVar) {
        float fIntBitsToFloat;
        int iJ0;
        switch (this.B) {
            case 0:
                u00.n nVar = tVar.f17156a;
                if (nVar != null) {
                    return ((Number) nVar.invoke(this, Float.valueOf(Float.NaN))).floatValue();
                }
                b3.u0 u0Var = (b3.u0) this.C;
                if (u0Var.K) {
                    return Float.NaN;
                }
                b3.u0 u0Var2 = u0Var;
                while (true) {
                    i2 i2Var = u0Var2.M;
                    float f3 = (i2Var == null || (iJ0 = h00.n.J0(tVar, (t[]) i2Var.f2045b)) < 0) ? Float.NaN : ((float[]) i2Var.f2046c)[iJ0];
                    if (!Float.isNaN(f3)) {
                        u0Var2.y0(u0Var.W0(), tVar);
                        a0 a0VarO0 = u0Var2.O0();
                        a0 a0VarO1 = u0Var.O0();
                        switch (tVar.f17157b) {
                            case 0:
                                fIntBitsToFloat = Float.intBitsToFloat((int) (a0VarO1.V(a0VarO0, (((long) Float.floatToRawIntBits(f3)) & 4294967295L) | (((long) Float.floatToRawIntBits(((int) (a0VarO0.p() >> 32)) / 2.0f)) << 32)) & 4294967295L));
                                break;
                            default:
                                fIntBitsToFloat = Float.intBitsToFloat((int) (a0VarO1.V(a0VarO0, (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(((int) (a0VarO0.p() & 4294967295L)) / 2.0f)) & 4294967295L)) >> 32));
                                break;
                        }
                        return fIntBitsToFloat;
                    }
                    b3.u0 u0VarC1 = u0Var2.c1();
                    if (u0VarC1 == null) {
                        u0Var2.y0(u0Var.W0(), tVar);
                        return Float.NaN;
                    }
                    u0Var2 = u0VarC1;
                }
                break;
            default:
                return super.d(tVar);
        }
    }

    @Override
    public final a0 e() {
        switch (this.B) {
            case 0:
                b3.u0 u0Var = (b3.u0) this.C;
                a0 a0VarO0 = u0Var.K ? null : u0Var.O0();
                if (a0VarO0 == null) {
                    u0Var.W0().f2060h0.b();
                }
                return a0VarO0;
            default:
                return (b3.p1) ((c3.z) this.C).getRoot().f2059g0.E;
        }
    }

    @Override
    public final y3.m f() {
        switch (this.B) {
            case 0:
                return ((b3.u0) this.C).getLayoutDirection();
            default:
                return ((c3.z) this.C).getLayoutDirection();
        }
    }

    @Override
    public final int g() {
        switch (this.B) {
            case 0:
                return ((b3.u0) this.C).j0();
            default:
                return ((c3.z) this.C).getRoot().f2060h0.f2122p.A;
        }
    }

    @Override
    public final float t0() {
        switch (this.B) {
            case 0:
                return ((b3.u0) this.C).t0();
            default:
                return ((c3.z) this.C).getDensity().t0();
        }
    }
}
