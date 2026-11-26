package h0;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lh0/l;", "Lb3/e1;", "Lh0/m;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class l extends b3.e1 {
    public final b2.d B;
    public final boolean C;

    public l(b2.d dVar, boolean z10) {
        this.B = dVar;
        this.C = z10;
    }

    @Override
    public final b2.q d() {
        m mVar = new m();
        mVar.O = this.B;
        mVar.P = this.C;
        return mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        l lVar = obj instanceof l ? (l) obj : null;
        return lVar != null && kotlin.jvm.internal.m.a(this.B, lVar.B) && this.C == lVar.C;
    }

    @Override
    public final void h(c3.d2 d2Var) {
    }

    public final int hashCode() {
        return Boolean.hashCode(this.C) + (this.B.hashCode() * 31);
    }

    @Override
    public final void i(b2.q qVar) {
        m mVar = (m) qVar;
        mVar.O = this.B;
        mVar.P = this.C;
    }
}
