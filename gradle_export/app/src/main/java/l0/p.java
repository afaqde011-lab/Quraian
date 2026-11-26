package l0;

import c3.d2;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ll0/p;", "Lb3/e1;", "Ll0/t;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class p extends b3.e1 {
    public final u B;
    public final hf.c C;
    public final d0.q1 D;

    public p(u uVar, hf.c cVar, d0.q1 q1Var) {
        this.B = uVar;
        this.C = cVar;
        this.D = q1Var;
    }

    @Override
    public final b2.q d() {
        t tVar = new t();
        tVar.O = this.B;
        tVar.P = this.C;
        tVar.Q = this.D;
        return tVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return kotlin.jvm.internal.m.a(this.B, pVar.B) && kotlin.jvm.internal.m.a(this.C, pVar.C) && this.D == pVar.D;
    }

    @Override
    public final void h(d2 d2Var) {
    }

    public final int hashCode() {
        return this.D.hashCode() + w.c.e((this.C.hashCode() + (this.B.hashCode() * 31)) * 31, 31, false);
    }

    @Override
    public final void i(b2.q qVar) {
        t tVar = (t) qVar;
        tVar.O = this.B;
        tVar.P = this.C;
        tVar.Q = this.D;
    }
}
