package h0;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lh0/a0;", "Lb3/e1;", "Lh0/b0;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a0 extends b3.e1 {
    public final z B;
    public final float C;
    public final String D;

    public a0(z zVar, float f3, String str) {
        this.B = zVar;
        this.C = f3;
        this.D = str;
    }

    @Override
    public final b2.q d() {
        b0 b0Var = new b0();
        b0Var.O = this.B;
        b0Var.P = this.C;
        return b0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.B == a0Var.B && this.C == a0Var.C;
    }

    @Override
    public final void h(c3.d2 d2Var) {
        d2Var.f2644a = this.D;
        d2Var.f2646c.c(Float.valueOf(this.C), "fraction");
    }

    public final int hashCode() {
        return Float.hashCode(this.C) + (this.B.hashCode() * 31);
    }

    @Override
    public final void i(b2.q qVar) {
        b0 b0Var = (b0) qVar;
        b0Var.O = this.B;
        b0Var.P = this.C;
    }
}
