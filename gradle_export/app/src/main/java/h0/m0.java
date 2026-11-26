package h0;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lh0/m0;", "Lb3/e1;", "Lh0/n0;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m0 extends b3.e1 {
    public final b2.g B;

    public m0(b2.g gVar) {
        this.B = gVar;
    }

    @Override
    public final b2.q d() {
        n0 n0Var = new n0();
        n0Var.O = this.B;
        return n0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        m0 m0Var = obj instanceof m0 ? (m0) obj : null;
        if (m0Var == null) {
            return false;
        }
        return this.B.equals(m0Var.B);
    }

    @Override
    public final void h(c3.d2 d2Var) {
        d2Var.f2644a = "align";
        d2Var.f2645b = this.B;
    }

    public final int hashCode() {
        return Float.hashCode(this.B.f1980a);
    }

    @Override
    public final void i(b2.q qVar) {
        ((n0) qVar).O = this.B;
    }
}
