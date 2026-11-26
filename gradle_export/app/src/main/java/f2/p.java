package f2;

import b3.e1;
import c3.d2;
import c3.y2;
import i2.t0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lf2/p;", "Lb3/e1;", "Lf2/q;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class p extends e1 {
    public final t0 B;
    public final n2.d C;

    public p(t0 t0Var, n2.d dVar) {
        this.B = t0Var;
        this.C = dVar;
    }

    @Override
    public final b2.q d() {
        q qVar = new q();
        qVar.O = this.B;
        qVar.P = this.C;
        return qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return kotlin.jvm.internal.m.a(this.B, pVar.B) && kotlin.jvm.internal.m.a(this.C, pVar.C);
    }

    @Override
    public final void h(d2 d2Var) {
        d2Var.f2644a = "dropShadow";
        y2 y2Var = d2Var.f2646c;
        y2Var.c(this.B, "shape");
        y2Var.c(this.C, "dropShadow");
    }

    public final int hashCode() {
        return this.C.hashCode() + (this.B.hashCode() * 31);
    }

    @Override
    public final void i(b2.q qVar) {
        q qVar2 = (q) qVar;
        t0 t0Var = qVar2.O;
        t0 t0Var2 = this.B;
        boolean zA = kotlin.jvm.internal.m.a(t0Var, t0Var2);
        n2.d dVar = this.C;
        if (!zA || !kotlin.jvm.internal.m.a(qVar2.P, dVar)) {
            qVar2.Q = null;
        }
        qVar2.O = t0Var2;
        qVar2.P = dVar;
    }

    public final String toString() {
        return "SimpleDropShadowElement(shape=" + this.B + ", shadow=" + this.C + ')';
    }
}
