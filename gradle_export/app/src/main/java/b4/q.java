package b4;

import b3.e1;
import c3.d2;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lb4/q;", "Lb3/e1;", "Lb4/r;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class q extends e1 {
    public final e B;

    public q(e eVar) {
        this.B = eVar;
    }

    @Override
    public final b2.q d() {
        return new r(this.B);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            return this.B == ((q) obj).B;
        }
        return false;
    }

    @Override
    public final void h(d2 d2Var) {
        d2Var.f2644a = "requestRectangleBringIntoViewBridge";
    }

    public final int hashCode() {
        return this.B.hashCode();
    }

    @Override
    public final void i(b2.q qVar) {
        r rVar = (r) qVar;
        e eVar = this.B;
        rVar.O = eVar;
        if (rVar.N) {
            eVar.invoke(rVar.P);
        }
    }
}
