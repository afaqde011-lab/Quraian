package j1;

import g00.b0;
import i2.c0;
import i2.t0;

public final class d implements u00.k {
    public final r A;
    public final boolean B;
    public final float C;
    public final float D;
    public final t0 E;

    public d(r rVar, boolean z10, float f3, float f10, t0 t0Var) {
        this.A = rVar;
        this.B = z10;
        this.C = f3;
        this.D = f10;
        this.E = t0Var;
    }

    public final Object invoke(Object obj) {
        c0 c0Var = (c0) obj;
        r rVar = this.A;
        boolean z10 = ((Number) rVar.f7852a.d()).floatValue() > 0.0f || this.B;
        c0Var.w((((Number) rVar.f7852a.d()).floatValue() * c0Var.R0(this.C)) - Float.intBitsToFloat((int) (c0Var.b() & 4294967295L)));
        c0Var.n(z10 ? c0Var.c() * this.D : 0.0f);
        c0Var.z0(this.E);
        c0Var.L0(true);
        return b0.a;
    }
}
