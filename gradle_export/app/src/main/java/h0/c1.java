package h0;

import c3.y2;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lh0/c1;", "Lb3/e1;", "Lh0/d1;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c1 extends b3.e1 {
    public final float B;
    public final boolean C;

    public c1(float f3, boolean z10) {
        this.B = f3;
        this.C = z10;
    }

    @Override
    public final b2.q d() {
        d1 d1Var = new d1();
        d1Var.O = this.B;
        d1Var.P = this.C;
        return d1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        c1 c1Var = obj instanceof c1 ? (c1) obj : null;
        return c1Var != null && this.B == c1Var.B && this.C == c1Var.C;
    }

    @Override
    public final void h(c3.d2 d2Var) {
        d2Var.f2644a = "weight";
        float f3 = this.B;
        d2Var.f2645b = Float.valueOf(f3);
        y2 y2Var = d2Var.f2646c;
        y2Var.c(Float.valueOf(f3), "weight");
        y2Var.c(Boolean.valueOf(this.C), "fill");
    }

    public final int hashCode() {
        return Boolean.hashCode(this.C) + (Float.hashCode(this.B) * 31);
    }

    @Override
    public final void i(b2.q qVar) {
        d1 d1Var = (d1) qVar;
        d1Var.O = this.B;
        d1Var.P = this.C;
    }
}
