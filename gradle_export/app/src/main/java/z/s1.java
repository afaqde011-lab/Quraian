package z;

import c3.d2;
import c3.y2;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lz/s1;", "Lb3/e1;", "Lz/n1;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class s1 extends b3.e1 {
    public final p1 B;
    public final boolean C;

    public s1(p1 p1Var, boolean z10) {
        this.B = p1Var;
        this.C = z10;
    }

    @Override
    public final b2.q d() {
        n1 n1Var = new n1();
        n1Var.O = this.B;
        n1Var.P = this.C;
        return n1Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s1)) {
            return false;
        }
        s1 s1Var = (s1) obj;
        return kotlin.jvm.internal.m.a(this.B, s1Var.B) && this.C == s1Var.C;
    }

    @Override
    public final void h(d2 d2Var) {
        d2Var.f2644a = "scroll";
        y2 y2Var = d2Var.f2646c;
        y2Var.c(this.B, "state");
        y2Var.c(Boolean.FALSE, "reverseScrolling");
        y2Var.c(Boolean.valueOf(this.C), "isVertical");
    }

    public final int hashCode() {
        return Boolean.hashCode(this.C) + w.c.e(this.B.hashCode() * 31, 31, false);
    }

    @Override
    public final void i(b2.q qVar) {
        n1 n1Var = (n1) qVar;
        n1Var.O = this.B;
        n1Var.P = this.C;
    }
}
