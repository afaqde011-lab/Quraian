package n0;

import b2.q;
import b3.e1;
import c3.d2;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ln0/a;", "Lb3/e1;", "Ln0/e;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class a extends e1 {
    public final c B;

    public a(c cVar) {
        this.B = cVar;
    }

    @Override
    public final q d() {
        return new e(this.B);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return m.a(this.B, ((a) obj).B);
        }
        return false;
    }

    @Override
    public final void h(d2 d2Var) {
        d2Var.f2644a = "bringIntoViewRequester";
        d2Var.f2646c.c(this.B, "bringIntoViewRequester");
    }

    public final int hashCode() {
        return this.B.hashCode();
    }

    @Override
    public final void i(q qVar) {
        e eVar = (e) qVar;
        c cVar = eVar.O;
        if (cVar != null) {
            cVar.f10997a.j(eVar);
        }
        c cVar2 = this.B;
        if (cVar2 != null) {
            cVar2.f10997a.b(eVar);
        }
        eVar.O = cVar2;
    }
}
