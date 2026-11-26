package h0;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lh0/k1;", "Lb3/e1;", "Lh0/m1;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class k1 extends b3.e1 {
    public final float B;
    public final float C;
    public final float D;
    public final float E;
    public final u00.k F;

    public k1(float f3, float f10, float f11, float f12, u00.k kVar) {
        this.B = f3;
        this.C = f10;
        this.D = f11;
        this.E = f12;
        this.F = kVar;
        boolean z10 = true;
        boolean z11 = (f3 >= 0.0f || Float.isNaN(f3)) & (f10 >= 0.0f || Float.isNaN(f10)) & (f11 >= 0.0f || Float.isNaN(f11));
        if (f12 < 0.0f && !Float.isNaN(f12)) {
            z10 = false;
        }
        if (!z11 || !z10) {
            i0.a.a("Padding must be non-negative");
        }
    }

    @Override
    public final b2.q d() {
        m1 m1Var = new m1();
        m1Var.O = this.B;
        m1Var.P = this.C;
        m1Var.Q = this.D;
        m1Var.R = this.E;
        m1Var.S = true;
        return m1Var;
    }

    public final boolean equals(Object obj) {
        k1 k1Var = obj instanceof k1 ? (k1) obj : null;
        return k1Var != null && y3.f.b(this.B, k1Var.B) && y3.f.b(this.C, k1Var.C) && y3.f.b(this.D, k1Var.D) && y3.f.b(this.E, k1Var.E);
    }

    @Override
    public final void h(c3.d2 d2Var) {
        this.F.invoke(d2Var);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + w.c.c(this.E, w.c.c(this.D, w.c.c(this.C, Float.hashCode(this.B) * 31, 31), 31), 31);
    }

    @Override
    public final void i(b2.q qVar) {
        m1 m1Var = (m1) qVar;
        m1Var.O = this.B;
        m1Var.P = this.C;
        m1Var.Q = this.D;
        m1Var.R = this.E;
        m1Var.S = true;
    }
}
