package d00;

import b3.e1;
import c3.d2;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ld00/o0;", "Lb3/e1;", "Ld00/n0;", "haze_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
final class o0 extends e1 {
    public final x0 B;
    public final u00.k C;

    public o0(x0 x0Var, u00.k kVar) {
        this.B = x0Var;
        this.C = kVar;
    }

    public final b2.q d() {
        return new n0(this.B, this.C);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return kotlin.jvm.internal.m.a(this.B, o0Var.B) && kotlin.jvm.internal.m.a(this.C, o0Var.C);
    }

    public final void h(d2 d2Var) {
        d2Var.a = "HazeEffect";
    }

    public final int hashCode() {
        x0 x0Var = this.B;
        int iHashCode = (x0Var == null ? 0 : x0Var.hashCode()) * 31;
        u00.k kVar = this.C;
        return iHashCode + (kVar != null ? kVar.hashCode() : 0);
    }

    public final void i(b2.q qVar) {
        n0 node = (n0) qVar;
        kotlin.jvm.internal.m.e(node, "node");
        node.O = this.B;
        node.P = this.C;
        if (((b2.q) node).N) {
            node.J0();
        }
    }

    public final String toString() {
        return "HazeEffectNodeElement(state=" + this.B + ", block=" + this.C + ")";
    }
}
