package z;

import c3.d2;
import c3.y2;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lz/l0;", "Lb3/e1;", "Lz/p0;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class l0 extends b3.e1 {
    public final f0.i B;

    public l0(f0.i iVar) {
        this.B = iVar;
    }

    @Override
    public final b2.q d() {
        p0 p0Var = new p0();
        p0Var.O = this.B;
        return p0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l0) && kotlin.jvm.internal.m.a(((l0) obj).B, this.B);
    }

    @Override
    public final void h(d2 d2Var) {
        d2Var.f2644a = "hoverable";
        y2 y2Var = d2Var.f2646c;
        y2Var.c(this.B, "interactionSource");
        y2Var.c(Boolean.TRUE, "enabled");
    }

    public final int hashCode() {
        return this.B.hashCode() * 31;
    }

    @Override
    public final void i(b2.q qVar) {
        p0 p0Var = (p0) qVar;
        f0.i iVar = p0Var.O;
        f0.i iVar2 = this.B;
        if (kotlin.jvm.internal.m.a(iVar, iVar2)) {
            return;
        }
        p0Var.D1();
        p0Var.O = iVar2;
    }
}
