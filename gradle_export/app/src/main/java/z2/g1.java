package z2;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lz2/g1;", "Lb3/e1;", "Lz2/h1;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class g1 extends b3.e1 {
    public final u00.k B;

    public g1(u00.k kVar) {
        this.B = kVar;
    }

    @Override
    public final b2.q d() {
        h1 h1Var = new h1();
        h1Var.O = this.B;
        long j9 = Integer.MIN_VALUE;
        h1Var.P = (j9 & 4294967295L) | (j9 << 32);
        return h1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g1) {
            return this.B == ((g1) obj).B;
        }
        return false;
    }

    @Override
    public final void h(c3.d2 d2Var) {
        d2Var.f2644a = "onSizeChanged";
        d2Var.f2646c.c(this.B, "onSizeChanged");
    }

    public final int hashCode() {
        return this.B.hashCode();
    }

    @Override
    public final void i(b2.q qVar) {
        h1 h1Var = (h1) qVar;
        h1Var.O = this.B;
        long j9 = Integer.MIN_VALUE;
        h1Var.P = (j9 & 4294967295L) | (j9 << 32);
    }
}
