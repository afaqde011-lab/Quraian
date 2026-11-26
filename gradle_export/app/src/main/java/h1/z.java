package h1;

import c3.d2;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lh1/z;", "Lb3/e1;", "Lh1/y;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class z extends b3.e1 {
    public final e6.c B;

    public z(e6.c cVar) {
        this.B = cVar;
    }

    @Override
    public final b2.q d() {
        y yVar = new y();
        yVar.O = this.B;
        return yVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z) {
            return this.B == ((z) obj).B;
        }
        return false;
    }

    @Override
    public final void h(d2 d2Var) {
        d2Var.f2644a = "childSemantics";
        d2Var.f2646c.c(this.B, "properties");
    }

    public final int hashCode() {
        return this.B.hashCode();
    }

    @Override
    public final void i(b2.q qVar) {
        y yVar = (y) qVar;
        yVar.O = this.B;
        b3.m.o(yVar);
    }
}
