package z;

import a1.x1;
import c3.d2;
import c3.y2;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lz/e0;", "Lb3/e1;", "Lz/g0;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class e0 extends b3.e1 {
    public final f0.i B;

    public e0(f0.i iVar) {
        this.B = iVar;
    }

    @Override
    public final b2.q d() {
        return new g0(this.B, (x1) null, 6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e0) {
            return kotlin.jvm.internal.m.a(this.B, ((e0) obj).B);
        }
        return false;
    }

    @Override
    public final void h(d2 d2Var) {
        d2Var.f2644a = "focusable";
        y2 y2Var = d2Var.f2646c;
        y2Var.c(Boolean.TRUE, "enabled");
        y2Var.c(this.B, "interactionSource");
    }

    public final int hashCode() {
        f0.i iVar = this.B;
        if (iVar != null) {
            return iVar.hashCode();
        }
        return 0;
    }

    @Override
    public final void i(b2.q qVar) {
        ((g0) qVar).F1(this.B);
    }
}
