package f2;

import b3.e1;
import c3.d2;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lf2/j;", "Lb3/e1;", "Lf2/k;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class j extends e1 {
    public final u00.k B;

    public j(u00.k kVar) {
        this.B = kVar;
    }

    @Override
    public final b2.q d() {
        k kVar = new k();
        kVar.O = this.B;
        return kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            return this.B == ((j) obj).B;
        }
        return false;
    }

    @Override
    public final void h(d2 d2Var) {
        d2Var.f2644a = "drawWithContent";
        d2Var.f2646c.c(this.B, "onDraw");
    }

    public final int hashCode() {
        return this.B.hashCode();
    }

    @Override
    public final void i(b2.q qVar) {
        ((k) qVar).O = this.B;
    }
}
