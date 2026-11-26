package h1;

import c3.d2;
import d0.q1;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002¨\u0006\u0004"}, d2 = {"Lh1/c0;", "T", "Lb3/e1;", "Lh1/d0;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class c0<T> extends b3.e1 {
    public final fc.n B;
    public final u00.n C;

    public c0(fc.n nVar, u00.n nVar2) {
        q1 q1Var = q1.A;
        this.B = nVar;
        this.C = nVar2;
    }

    @Override
    public final b2.q d() {
        q1 q1Var = q1.A;
        d0 d0Var = new d0();
        d0Var.O = this.B;
        d0Var.P = this.C;
        d0Var.Q = q1Var;
        return d0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        if (!kotlin.jvm.internal.m.a(this.B, c0Var.B) || this.C != c0Var.C) {
            return false;
        }
        q1 q1Var = q1.A;
        return true;
    }

    @Override
    public final void h(d2 d2Var) {
    }

    public final int hashCode() {
        return q1.A.hashCode() + ((this.C.hashCode() + (this.B.hashCode() * 31)) * 31);
    }

    @Override
    public final void i(b2.q qVar) {
        d0 d0Var = (d0) qVar;
        d0Var.O = this.B;
        d0Var.P = this.C;
        d0Var.Q = q1.A;
    }
}
