package l0;

import c3.d2;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ll0/b0;", "Lb3/e1;", "Ll0/c0;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class b0 extends b3.e1 {
    public final f0 B;

    public b0(f0 f0Var) {
        this.B = f0Var;
    }

    @Override
    public final b2.q d() {
        c0 c0Var = new c0();
        c0Var.O = this.B;
        return c0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b0) && kotlin.jvm.internal.m.a(this.B, ((b0) obj).B);
    }

    @Override
    public final void h(d2 d2Var) {
        d2Var.f2644a = "DisplayingDisappearingItemsElement";
    }

    public final int hashCode() {
        return this.B.hashCode();
    }

    @Override
    public final void i(b2.q qVar) {
        c0 c0Var = (c0) qVar;
        f0 f0Var = c0Var.O;
        f0 f0Var2 = this.B;
        if (kotlin.jvm.internal.m.a(f0Var, f0Var2) || !c0Var.A.N) {
            return;
        }
        f0 f0Var3 = c0Var.O;
        f0Var3.e();
        f0Var3.f9730b = null;
        f0Var3.f9731c = -1;
        f0Var2.f9738j = c0Var;
        c0Var.O = f0Var2;
    }

    public final String toString() {
        return "DisplayingDisappearingItemsElement(animator=" + this.B + ')';
    }
}
