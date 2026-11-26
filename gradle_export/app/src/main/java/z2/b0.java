package z2;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lz2/b0;", "Lb3/e1;", "Lz2/h0;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class b0 extends b3.e1 {
    public final u00.o B;

    public b0(u00.o oVar) {
        this.B = oVar;
    }

    @Override
    public final b2.q d() {
        h0 h0Var = new h0();
        h0Var.O = this.B;
        return h0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b0) {
            return this.B == ((b0) obj).B;
        }
        return false;
    }

    @Override
    public final void h(c3.d2 d2Var) {
        d2Var.f2644a = "layout";
        d2Var.f2646c.c(this.B, "measure");
    }

    public final int hashCode() {
        return this.B.hashCode();
    }

    @Override
    public final void i(b2.q qVar) {
        ((h0) qVar).O = this.B;
    }
}
