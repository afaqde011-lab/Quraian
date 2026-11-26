package z2;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lz2/e1;", "Lb3/e1;", "Lz2/f1;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class e1 extends b3.e1 {
    public final u00.k B;

    public e1(u00.k kVar) {
        this.B = kVar;
    }

    @Override
    public final b2.q d() {
        f1 f1Var = new f1();
        f1Var.O = this.B;
        return f1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e1) {
            return this.B == ((e1) obj).B;
        }
        return false;
    }

    @Override
    public final void h(c3.d2 d2Var) {
        d2Var.f2644a = "onGloballyPositioned";
        d2Var.f2646c.c(this.B, "onGloballyPositioned");
    }

    public final int hashCode() {
        return this.B.hashCode();
    }

    @Override
    public final void i(b2.q qVar) {
        ((f1) qVar).O = this.B;
    }
}
