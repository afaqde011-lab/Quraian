package h0;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lh0/b2;", "Lb3/e1;", "Lh0/c2;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class b2 extends b3.e1 {
    public final u00.k B;

    public b2(u00.k kVar) {
        this.B = kVar;
    }

    @Override
    public final b2.q d() {
        c2 c2Var = new c2(c.f6384c);
        c2Var.R = this.B;
        return c2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b2) {
            return this.B == ((b2) obj).B;
        }
        return false;
    }

    @Override
    public final void h(c3.d2 d2Var) {
    }

    public final int hashCode() {
        return this.B.hashCode();
    }

    @Override
    public final void i(b2.q qVar) {
        c2 c2Var = (c2) qVar;
        u00.k kVar = c2Var.R;
        u00.k kVar2 = this.B;
        if (kVar != kVar2) {
            c2Var.R = kVar2;
            m2 m2Var = c2Var.S;
            if (m2Var != null) {
                l2 l2Var = (l2) kVar2.invoke(m2Var);
                if (kotlin.jvm.internal.m.a(l2Var, c2Var.Q)) {
                    return;
                }
                c2Var.Q = l2Var;
                c2Var.C1();
            }
        }
    }
}
