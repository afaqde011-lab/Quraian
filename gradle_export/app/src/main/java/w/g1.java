package w;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lw/g1;", "Lb3/e1;", "Lw/f1;", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g1 extends b3.e1 {
    public final k1 B;

    public g1(k1 k1Var) {
        this.B = k1Var;
    }

    @Override
    public final b2.q d() {
        return new f1(this.B);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g1) && kotlin.jvm.internal.m.a(this.B, ((g1) obj).B);
    }

    @Override
    public final void h(c3.d2 d2Var) {
        d2Var.f2644a = "sharedBounds";
        d2Var.f2646c.c(this.B, "sharedElementState");
    }

    public final int hashCode() {
        return this.B.hashCode();
    }

    @Override
    public final void i(b2.q qVar) {
        f1 f1Var = (f1) qVar;
        k1 k1Var = f1Var.Q;
        k1 k1Var2 = this.B;
        if (k1Var2.equals(k1Var)) {
            return;
        }
        f1Var.Q.A.setValue(Boolean.FALSE);
        f1Var.Q = k1Var2;
        k1Var2.A.setValue(Boolean.valueOf(f1Var.N));
        if (f1Var.N) {
            f1Var.E1();
        }
    }

    public final String toString() {
        return "SharedBoundsNodeElement(sharedElementState=" + this.B + ')';
    }
}
