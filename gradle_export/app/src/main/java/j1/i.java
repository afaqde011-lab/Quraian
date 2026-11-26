package j1;

import a40.a0;
import a40.c0;
import b3.e1;
import c3.d2;
import c3.y2;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lj1/i;", "Lb3/e1;", "Lj1/q;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i extends e1 {
    public final boolean B;
    public final u00.a C;
    public final r D;
    public final float E;

    public i(boolean z10, u00.a aVar, r rVar, float f3) {
        this.B = z10;
        this.C = aVar;
        this.D = rVar;
        this.E = f3;
    }

    @Override
    public final b2.q d() {
        return new q(this.B, this.C, this.D, this.E);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.B == iVar.B && this.C == iVar.C && kotlin.jvm.internal.m.a(this.D, iVar.D) && y3.f.b(this.E, iVar.E);
    }

    @Override
    public final void h(d2 d2Var) {
        d2Var.f2644a = "PullToRefreshModifierNode";
        y2 y2Var = d2Var.f2646c;
        y2Var.c(Boolean.valueOf(this.B), "isRefreshing");
        y2Var.c(this.C, "onRefresh");
        y2Var.c(Boolean.TRUE, "enabled");
        y2Var.c(this.D, "state");
        y2Var.c(new y3.f(this.E), "threshold");
    }

    public final int hashCode() {
        return Float.hashCode(this.E) + ((this.D.hashCode() + ((this.C.hashCode() + w.c.e(Boolean.hashCode(this.B) * 31, 31, true)) * 31)) * 31);
    }

    @Override
    public final void i(b2.q qVar) {
        q qVar2 = (q) qVar;
        qVar2.R = this.C;
        qVar2.S = true;
        qVar2.T = this.D;
        qVar2.U = this.E;
        boolean z10 = qVar2.Q;
        boolean z11 = this.B;
        if (z10 != z11) {
            qVar2.Q = z11;
            c0.y(qVar2.p1(), (k00.i) null, (a0) null, new n(qVar2, null, 2), 3);
        }
    }
}
