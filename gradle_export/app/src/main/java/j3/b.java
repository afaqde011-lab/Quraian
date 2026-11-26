package j3;

import b3.e1;
import c3.d2;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lj3/b;", "Lb3/e1;", "Lj3/e;", "Lj3/p;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b extends e1 implements p {
    public final boolean B;
    public final u00.k C;

    public b(boolean z10, u00.k kVar) {
        this.B = z10;
        this.C = kVar;
    }

    @Override
    public final b2.q d() {
        return new e(this.B, false, this.C);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.B == bVar.B && this.C == bVar.C;
    }

    @Override
    public final void h(d2 d2Var) {
        d2Var.f2644a = "semantics";
        d2Var.f2646c.c(Boolean.valueOf(this.B), "mergeDescendants");
        q.a(d2Var, k1());
    }

    public final int hashCode() {
        return this.C.hashCode() + (Boolean.hashCode(this.B) * 31);
    }

    @Override
    public final void i(b2.q qVar) {
        e eVar = (e) qVar;
        eVar.O = this.B;
        eVar.Q = this.C;
    }

    @Override
    public final o k1() {
        o oVar = new o();
        oVar.C = this.B;
        this.C.invoke(oVar);
        return oVar;
    }
}
