package kk;

import b2.q;
import b3.e1;
import c3.d2;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkk/d;", "Lb3/e1;", "Lkk/f;", "backdrop"}, k = 1, mv = {2, 3, 0}, xi = 48)
final class d extends e1 {
    public final c B;

    public d(c cVar) {
        m.e(cVar, "backdrop");
        this.B = cVar;
    }

    @Override
    public final q d() {
        c cVar = this.B;
        m.e(cVar, "backdrop");
        f fVar = new f();
        fVar.O = cVar;
        return fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            return m.a(this.B, ((d) obj).B);
        }
        return false;
    }

    @Override
    public final void h(d2 d2Var) {
        d2Var.f2644a = "layerBackdrop";
        d2Var.f2646c.c(this.B, "backdrop");
    }

    public final int hashCode() {
        return this.B.hashCode();
    }

    @Override
    public final void i(q qVar) {
        f fVar = (f) qVar;
        m.e(fVar, "node");
        c cVar = this.B;
        m.e(cVar, "<set-?>");
        fVar.O = cVar;
        b3.m.m(fVar);
    }
}
