package f2;

import i2.b0;
import i2.c0;
import i2.t0;

public final class a extends kotlin.jvm.internal.n implements u00.k {
    public final float A;
    public final float B;
    public final int C;
    public final t0 D;
    public final boolean E;

    public a(float f3, float f10, int i10, t0 t0Var, boolean z10) {
        super(1);
        this.A = f3;
        this.B = f10;
        this.C = i10;
        this.D = t0Var;
        this.E = z10;
    }

    public final Object invoke(Object obj) {
        c0 c0Var = (c0) obj;
        float fC = c0Var.c() * this.A;
        float fC2 = c0Var.c() * this.B;
        c0Var.I((fC <= 0.0f || fC2 <= 0.0f) ? null : new i2.p(fC, fC2, this.C));
        t0 t0Var = this.D;
        if (t0Var == null) {
            t0Var = b0.f7111b;
        }
        c0Var.z0(t0Var);
        c0Var.L0(this.E);
        return g00.b0.a;
    }
}
