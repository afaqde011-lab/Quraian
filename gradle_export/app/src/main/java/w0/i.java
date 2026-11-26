package w0;

import a1.q1;
import b2.q;
import b3.e1;
import c3.d2;
import e1.o0;
import e1.q0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lw0/i;", "Lb3/e1;", "Lw0/j;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class i extends e1 {
    public final l B;
    public final q1 C;
    public final q0 D;
    public final o0 E;

    public i(l lVar, q1 q1Var, q0 q0Var, o0 o0Var) {
        this.B = lVar;
        this.C = q1Var;
        this.D = q0Var;
        this.E = o0Var;
    }

    @Override
    public final q d() {
        return new j(this.B, this.C, this.D, this.E);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.B == iVar.B && this.C == iVar.C && this.D == iVar.D && this.E == iVar.E;
    }

    @Override
    public final void h(d2 d2Var) {
    }

    public final int hashCode() {
        return this.E.hashCode() + ((this.D.hashCode() + ((this.C.hashCode() + (this.B.hashCode() * 31)) * 31)) * 31);
    }

    @Override
    public final void i(q qVar) {
        j jVar = (j) qVar;
        jVar.Q.f15828a = null;
        l lVar = this.B;
        jVar.Q = lVar;
        lVar.f15828a = jVar;
        lVar.f15829b = jVar.N ? k.C : k.B;
        jVar.R = this.C;
        jVar.S = this.D;
        jVar.T = this.E;
    }
}
