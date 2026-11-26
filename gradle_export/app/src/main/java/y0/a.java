package y0;

import b2.q;
import b3.e1;
import c3.d2;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ly0/a;", "Lb3/e1;", "Ly0/c;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class a extends e1 {
    public final u00.a B;

    public a(u00.a aVar) {
        this.B = aVar;
    }

    @Override
    public final q d() {
        return new c(this.B);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return this.B == ((a) obj).B;
        }
        return false;
    }

    @Override
    public final void h(d2 d2Var) {
        d2Var.f2644a = "stylusHandwriting";
        d2Var.f2646c.c(this.B, "onHandwritingSlopExceeded");
    }

    public final int hashCode() {
        return this.B.hashCode();
    }

    @Override
    public final void i(q qVar) {
        ((c) qVar).Q = this.B;
    }
}
