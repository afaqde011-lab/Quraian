package b2;

import b3.e1;
import c3.d2;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lb2/u;", "Lb3/e1;", "Lb2/w;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class u extends e1 {
    public final float B;

    public u(float f3) {
        this.B = f3;
    }

    @Override
    public final q d() {
        w wVar = new w();
        wVar.O = this.B;
        return wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && Float.compare(this.B, ((u) obj).B) == 0;
    }

    @Override
    public final void h(d2 d2Var) {
        d2Var.f2644a = "zIndex";
        d2Var.f2646c.c(Float.valueOf(this.B), "zIndex");
    }

    public final int hashCode() {
        return Float.hashCode(this.B);
    }

    @Override
    public final void i(q qVar) {
        ((w) qVar).O = this.B;
    }

    public final String toString() {
        return w.c.k(new StringBuilder("ZIndexElement(zIndex="), this.B, ')');
    }
}
