package h0;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lh0/y1;", "Lb3/e1;", "Lh0/a2;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class y1 extends b3.e1 {
    public final float B;
    public final float C;
    public final float D;
    public final float E;
    public final boolean F;
    public final c3.t G;

    public y1(float f3, float f10, float f11, float f12, boolean z10) {
        c3.t tVar = c3.t.F;
        this.B = f3;
        this.C = f10;
        this.D = f11;
        this.E = f12;
        this.F = z10;
        this.G = tVar;
    }

    public y1(float f3, float f10, float f11, float f12, boolean z10, int i10) {
        this((i10 & 1) != 0 ? Float.NaN : f3, (i10 & 2) != 0 ? Float.NaN : f10, (i10 & 4) != 0 ? Float.NaN : f11, (i10 & 8) != 0 ? Float.NaN : f12, z10);
    }

    @Override
    public final b2.q d() {
        a2 a2Var = new a2();
        a2Var.O = this.B;
        a2Var.P = this.C;
        a2Var.Q = this.D;
        a2Var.R = this.E;
        a2Var.S = this.F;
        return a2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1)) {
            return false;
        }
        y1 y1Var = (y1) obj;
        return y3.f.b(this.B, y1Var.B) && y3.f.b(this.C, y1Var.C) && y3.f.b(this.D, y1Var.D) && y3.f.b(this.E, y1Var.E) && this.F == y1Var.F;
    }

    @Override
    public final void h(c3.d2 d2Var) {
        this.G.getClass();
    }

    public final int hashCode() {
        return Boolean.hashCode(this.F) + w.c.c(this.E, w.c.c(this.D, w.c.c(this.C, Float.hashCode(this.B) * 31, 31), 31), 31);
    }

    @Override
    public final void i(b2.q qVar) {
        a2 a2Var = (a2) qVar;
        a2Var.O = this.B;
        a2Var.P = this.C;
        a2Var.Q = this.D;
        a2Var.R = this.E;
        a2Var.S = this.F;
    }
}
