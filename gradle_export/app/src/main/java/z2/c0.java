package z2;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lz2/c0;", "Lb3/e1;", "Lz2/e0;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class c0 extends b3.e1 {
    public final Object B;

    public c0(Object obj) {
        this.B = obj;
    }

    @Override
    public final b2.q d() {
        e0 e0Var = new e0();
        e0Var.O = this.B;
        return e0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c0) && kotlin.jvm.internal.m.a(this.B, ((c0) obj).B);
    }

    @Override
    public final void h(c3.d2 d2Var) {
        d2Var.f2644a = "layoutId";
        d2Var.f2645b = this.B;
    }

    public final int hashCode() {
        return this.B.hashCode();
    }

    @Override
    public final void i(b2.q qVar) {
        ((e0) qVar).O = this.B;
    }

    public final String toString() {
        return "LayoutIdElement(layoutId=" + this.B + ')';
    }
}
