package h0;

import c3.y2;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lh0/g2;", "Lb3/e1;", "Lh0/h2;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class g2 extends b3.e1 {
    public final float B;
    public final float C;

    public g2(float f3, float f10) {
        this.B = f3;
        this.C = f10;
    }

    @Override
    public final b2.q d() {
        h2 h2Var = new h2();
        h2Var.O = this.B;
        h2Var.P = this.C;
        return h2Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g2)) {
            return false;
        }
        g2 g2Var = (g2) obj;
        return y3.f.b(this.B, g2Var.B) && y3.f.b(this.C, g2Var.C);
    }

    @Override
    public final void h(c3.d2 d2Var) {
        d2Var.f2644a = "defaultMinSize";
        y2 y2Var = d2Var.f2646c;
        y2Var.c(new y3.f(this.B), "minWidth");
        y2Var.c(new y3.f(this.C), "minHeight");
    }

    public final int hashCode() {
        return Float.hashCode(this.C) + (Float.hashCode(this.B) * 31);
    }

    @Override
    public final void i(b2.q qVar) {
        h2 h2Var = (h2) qVar;
        h2Var.O = this.B;
        h2Var.P = this.C;
    }
}
