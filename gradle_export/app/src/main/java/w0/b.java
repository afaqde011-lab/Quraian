package w0;

import b2.q;
import b3.e1;
import c3.d2;
import kotlin.Metadata;
import u00.n;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lw0/b;", "Lb3/e1;", "Lw0/c;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class b extends e1 {
    public final n B;

    public b(n nVar) {
        this.B = nVar;
    }

    @Override
    public final q d() {
        c cVar = new c();
        cVar.Q = this.B;
        q0.a aVar = new q0.a(cVar, 16);
        a aVar2 = new a();
        aVar2.O = aVar;
        cVar.B1(aVar2);
        return cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return this.B == ((b) obj).B;
        }
        return false;
    }

    @Override
    public final void h(d2 d2Var) {
        d2Var.f2644a = "addTextContextMenuDataComponentsWithResources";
        d2Var.f2646c.c(this.B, "builder");
    }

    public final int hashCode() {
        return this.B.hashCode();
    }

    @Override
    public final void i(q qVar) {
        ((c) qVar).Q = this.B;
    }
}
