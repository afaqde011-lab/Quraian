package v2;

import b3.e1;
import c3.d2;
import c3.y2;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lv2/m;", "Lb3/e1;", "Lv2/n;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m extends e1 {
    public final a B;

    public m(a aVar) {
        this.B = aVar;
    }

    @Override
    public final b2.q d() {
        return new n(this.B, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && this.B.equals(((m) obj).B);
    }

    @Override
    public final void h(d2 d2Var) {
        d2Var.f2644a = "pointerHoverIcon";
        y2 y2Var = d2Var.f2646c;
        y2Var.c(this.B, "icon");
        y2Var.c(Boolean.FALSE, "overrideDescendants");
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.B.f15350b * 31);
    }

    @Override
    public final void i(b2.q qVar) {
        n nVar = (n) qVar;
        a aVar = nVar.P;
        a aVar2 = this.B;
        if (kotlin.jvm.internal.m.a(aVar, aVar2)) {
            return;
        }
        nVar.P = aVar2;
        if (nVar.Q) {
            nVar.D1();
        }
    }

    public final String toString() {
        return "PointerHoverIconModifierElement(icon=" + this.B + ", overrideDescendants=false)";
    }
}
