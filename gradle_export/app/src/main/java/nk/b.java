package nk;

import b2.q;
import b3.e1;
import c3.d2;
import c3.y2;
import jk.l;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lnk/b;", "Lb3/e1;", "Lnk/e;", "backdrop"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends e1 {
    public final l B;
    public final u00.a C;

    public b(l lVar, u00.a aVar) {
        this.B = lVar;
        this.C = aVar;
    }

    @Override
    public final q d() {
        return new e(this.B, this.C);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return m.a(this.B, bVar.B) && m.a(this.C, bVar.C);
    }

    @Override
    public final void h(d2 d2Var) {
        d2Var.f2644a = "innerShadow";
        y2 y2Var = d2Var.f2646c;
        y2Var.c(this.B, "shapeProvider");
        y2Var.c(this.C, "shadow");
    }

    public final int hashCode() {
        return this.C.hashCode() + (this.B.hashCode() * 31);
    }

    @Override
    public final void i(q qVar) {
        e eVar = (e) qVar;
        m.e(eVar, "node");
        eVar.O = this.B;
        eVar.P = this.C;
        b3.m.m(eVar);
    }
}
