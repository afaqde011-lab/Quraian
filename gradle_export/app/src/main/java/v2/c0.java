package v2;

import b3.e1;
import c3.d2;
import c3.y2;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lv2/c0;", "Lb3/e1;", "Lv2/d0;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c0 extends e1 {
    public final b3.n B;

    public c0(b3.n nVar) {
        this.B = nVar;
    }

    @Override
    public final b2.q d() {
        return new d0(q0.q.f12679d, this.B);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        a aVar = q0.q.f12679d;
        return aVar.equals(aVar) && kotlin.jvm.internal.m.a(this.B, c0Var.B);
    }

    @Override
    public final void h(d2 d2Var) {
        d2Var.f2644a = "stylusHoverIcon";
        y2 y2Var = d2Var.f2646c;
        y2Var.c(q0.q.f12679d, "icon");
        y2Var.c(Boolean.FALSE, "overrideDescendants");
        y2Var.c(this.B, "touchBoundsExpansion");
    }

    public final int hashCode() {
        int iE = w.c.e(1022 * 31, 31, false);
        b3.n nVar = this.B;
        return iE + (nVar != null ? nVar.hashCode() : 0);
    }

    @Override
    public final void i(b2.q qVar) {
        d0 d0Var = (d0) qVar;
        a aVar = q0.q.f12679d;
        if (!kotlin.jvm.internal.m.a(d0Var.P, aVar)) {
            d0Var.P = aVar;
            if (d0Var.Q) {
                d0Var.D1();
            }
        }
        d0Var.O = this.B;
    }

    public final String toString() {
        return "StylusHoverIconModifierElement(icon=" + q0.q.f12679d + ", overrideDescendants=false, touchBoundsExpansion=" + this.B + ')';
    }
}
