package i2;

import b3.e1;
import b3.p1;
import c3.d2;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Li2/n;", "Lb3/e1;", "Li2/o;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class n extends e1 {
    public final u00.k B;

    public n(u00.k kVar) {
        this.B = kVar;
    }

    @Override
    public final b2.q d() {
        return new o(this.B);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            return this.B == ((n) obj).B;
        }
        return false;
    }

    @Override
    public final void h(d2 d2Var) {
        d2Var.f2644a = "graphicsLayer";
        d2Var.f2646c.c(this.B, "block");
    }

    public final int hashCode() {
        return this.B.hashCode();
    }

    @Override
    public final void i(b2.q qVar) throws NoWhenBranchMatchedException, KotlinNothingValueException {
        p1 p1Var;
        o oVar = (o) qVar;
        u00.k kVar = this.B;
        oVar.O = kVar;
        if (oVar.A.N && (p1Var = b3.m.v(oVar, 2).R) != null) {
            p1Var.Y1(true, kVar);
        }
    }
}
