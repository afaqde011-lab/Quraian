package w0;

import b2.q;
import b3.e1;
import c3.d2;
import kotlin.Metadata;
import u00.n;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lw0/e;", "Lb3/e1;", "Lw0/g;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class e extends e1 {
    public final n B;

    public e(n nVar) {
        this.B = nVar;
    }

    @Override
    public final q d() {
        return new g(this.B);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            return this.B == ((e) obj).B;
        }
        return false;
    }

    @Override
    public final void h(d2 d2Var) {
        d2Var.f2644a = "TextContextMenuGestures";
        d2Var.f2646c.c(this.B, "onPreShowContextMenu");
    }

    public final int hashCode() {
        n nVar = this.B;
        if (nVar != null) {
            return nVar.hashCode();
        }
        return 0;
    }

    @Override
    public final void i(q qVar) {
        ((g) qVar).Q = this.B;
    }
}
