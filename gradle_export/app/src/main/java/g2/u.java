package g2;

import b3.e1;
import c3.d2;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lg2/u;", "Lb3/e1;", "Lg2/w;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class u extends e1 {
    public final t B;

    public u(t tVar) {
        this.B = tVar;
    }

    @Override
    public final b2.q d() {
        w wVar = new w();
        wVar.O = this.B;
        return wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && kotlin.jvm.internal.m.a(this.B, ((u) obj).B);
    }

    @Override
    public final void h(d2 d2Var) {
        d2Var.f2644a = "focusRequester";
        d2Var.f2646c.c(this.B, "focusRequester");
    }

    public final int hashCode() {
        return this.B.hashCode();
    }

    @Override
    public final void i(b2.q qVar) {
        w wVar = (w) qVar;
        wVar.O.f6094a.j(wVar);
        t tVar = this.B;
        wVar.O = tVar;
        tVar.f6094a.b(wVar);
    }

    public final String toString() {
        return "FocusRequesterElement(focusRequester=" + this.B + ')';
    }
}
