package h0;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lh0/j;", "Lb3/e1;", "Lh0/k;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class j extends b3.e1 {
    public final float B;

    public j(float f3) {
        this.B = f3;
        if (f3 > 0.0f) {
            return;
        }
        i0.a.a("aspectRatio " + f3 + " must be > 0");
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
        j jVar = obj instanceof j ? (j) obj : null;
        if (jVar == null || this.B != jVar.B) {
            return false;
        }
        ((j) obj).getClass();
        return true;
    }

    @Override
    public final void h(c3.d2 d2Var) {
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (Float.hashCode(this.B) * 31);
    }

    @Override
    public final void i(b2.q qVar) {
        ((k) qVar).O = this.B;
    }
}
