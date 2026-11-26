package q0;

import c3.y2;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lq0/a1;", "Lb3/e1;", "Lq0/c1;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class a1 extends b3.e1 {
    public final m3.r0 B;
    public final int C;
    public final int D;

    public a1(m3.r0 r0Var, int i10, int i11) {
        this.B = r0Var;
        this.C = i10;
        this.D = i11;
    }

    @Override
    public final b2.q d() {
        c1 c1Var = new c1();
        c1Var.O = this.B;
        c1Var.P = this.C;
        c1Var.Q = this.D;
        c1Var.S = -1;
        c1Var.T = -1;
        return c1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        return kotlin.jvm.internal.m.a(this.B, a1Var.B) && this.C == a1Var.C && this.D == a1Var.D;
    }

    @Override
    public final void h(c3.d2 d2Var) {
        d2Var.f2644a = "heightInLines";
        y2 y2Var = d2Var.f2646c;
        y2Var.c(Integer.valueOf(this.C), "minLines");
        y2Var.c(Integer.valueOf(this.D), "maxLines");
        y2Var.c(this.B, "textStyle");
    }

    public final int hashCode() {
        return (((this.B.hashCode() * 31) + this.C) * 31) + this.D;
    }

    @Override
    public final void i(b2.q qVar) {
        c1 c1Var = (c1) qVar;
        m3.r0 r0Var = c1Var.O;
        m3.r0 r0Var2 = this.B;
        boolean zA = kotlin.jvm.internal.m.a(r0Var, r0Var2);
        int i10 = this.C;
        int i11 = this.D;
        if (zA && c1Var.P == i10 && c1Var.Q == i11) {
            return;
        }
        c1Var.O = r0Var2;
        c1Var.P = i10;
        c1Var.Q = i11;
        c1Var.U = m3.h0.j(r0Var2, b3.m.y(c1Var).f2053a0);
        c1Var.R = true;
        b3.m.n(c1Var);
    }
}
