package j0;

import b3.e1;
import c3.d2;
import kotlin.Metadata;
import l1.f1;
import l1.p2;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lj0/y;", "Lb3/e1;", "Lj0/z;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class y extends e1 {
    public final p2 B;
    public final p2 C;
    public final String D;

    public y(f1 f1Var, f1 f1Var2, String str, int i10) {
        f1Var = (i10 & 2) != 0 ? null : f1Var;
        f1Var2 = (i10 & 4) != 0 ? null : f1Var2;
        this.B = f1Var;
        this.C = f1Var2;
        this.D = str;
    }

    @Override
    public final b2.q d() {
        z zVar = new z();
        zVar.O = 1.0f;
        zVar.P = this.B;
        zVar.Q = this.C;
        return zVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return kotlin.jvm.internal.m.a(this.B, yVar.B) && kotlin.jvm.internal.m.a(this.C, yVar.C);
    }

    @Override
    public final void h(d2 d2Var) {
        d2Var.f2644a = this.D;
        d2Var.f2645b = Float.valueOf(1.0f);
    }

    public final int hashCode() {
        p2 p2Var = this.B;
        int iHashCode = (p2Var != null ? p2Var.hashCode() : 0) * 31;
        p2 p2Var2 = this.C;
        return Float.hashCode(1.0f) + ((iHashCode + (p2Var2 != null ? p2Var2.hashCode() : 0)) * 31);
    }

    @Override
    public final void i(b2.q qVar) {
        z zVar = (z) qVar;
        zVar.O = 1.0f;
        zVar.P = this.B;
        zVar.Q = this.C;
    }
}
