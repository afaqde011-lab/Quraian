package l0;

import c3.d2;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ll0/c1;", "Lb3/e1;", "Ll0/f1;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class c1 extends b3.e1 {
    public final u00.a B;
    public final b1 C;
    public final d0.q1 D;
    public final boolean E;

    public c1(u00.a aVar, b1 b1Var, d0.q1 q1Var, boolean z10) {
        this.B = aVar;
        this.C = b1Var;
        this.D = q1Var;
        this.E = z10;
    }

    @Override
    public final b2.q d() {
        return new f1(this.B, this.C, this.D, this.E);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return this.B == c1Var.B && kotlin.jvm.internal.m.a(this.C, c1Var.C) && this.D == c1Var.D && this.E == c1Var.E;
    }

    @Override
    public final void h(d2 d2Var) {
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + w.c.e((this.D.hashCode() + ((this.C.hashCode() + (this.B.hashCode() * 31)) * 31)) * 31, 31, this.E);
    }

    @Override
    public final void i(b2.q qVar) {
        f1 f1Var = (f1) qVar;
        f1Var.O = this.B;
        f1Var.P = this.C;
        d0.q1 q1Var = f1Var.Q;
        d0.q1 q1Var2 = this.D;
        if (q1Var != q1Var2) {
            f1Var.Q = q1Var2;
            b3.m.o(f1Var);
        }
        boolean z10 = f1Var.R;
        boolean z11 = this.E;
        if (z10 == z11) {
            return;
        }
        f1Var.R = z11;
        f1Var.B1();
        b3.m.o(f1Var);
    }
}
