package f2;

import b3.e1;
import c3.d2;
import c3.y2;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lf2/m;", "Lb3/e1;", "Lf2/n;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class m extends e1 {
    public final m2.b B;
    public final b2.d C;
    public final z2.p D;
    public final float E;
    public final i2.m F;

    public m(m2.b bVar, b2.d dVar, z2.p pVar, float f3, i2.m mVar) {
        this.B = bVar;
        this.C = dVar;
        this.D = pVar;
        this.E = f3;
        this.F = mVar;
    }

    @Override
    public final b2.q d() {
        n nVar = new n();
        nVar.O = this.B;
        nVar.P = true;
        nVar.Q = this.C;
        nVar.R = this.D;
        nVar.S = this.E;
        nVar.T = this.F;
        return nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return kotlin.jvm.internal.m.a(this.B, mVar.B) && kotlin.jvm.internal.m.a(this.C, mVar.C) && kotlin.jvm.internal.m.a(this.D, mVar.D) && Float.compare(this.E, mVar.E) == 0 && kotlin.jvm.internal.m.a(this.F, mVar.F);
    }

    @Override
    public final void h(d2 d2Var) {
        d2Var.f2644a = "paint";
        y2 y2Var = d2Var.f2646c;
        y2Var.c(this.B, "painter");
        y2Var.c(Boolean.TRUE, "sizeToIntrinsics");
        y2Var.c(this.C, "alignment");
        y2Var.c(this.D, "contentScale");
        y2Var.c(Float.valueOf(this.E), "alpha");
        y2Var.c(this.F, "colorFilter");
    }

    public final int hashCode() {
        int iC = w.c.c(this.E, (this.D.hashCode() + ((this.C.hashCode() + w.c.e(this.B.hashCode() * 31, 31, true)) * 31)) * 31, 31);
        i2.m mVar = this.F;
        return iC + (mVar == null ? 0 : mVar.hashCode());
    }

    @Override
    public final void i(b2.q qVar) {
        n nVar = (n) qVar;
        boolean z10 = nVar.P;
        m2.b bVar = this.B;
        boolean z11 = (z10 && h2.e.a(nVar.O.h(), bVar.h())) ? false : true;
        nVar.O = bVar;
        nVar.P = true;
        nVar.Q = this.C;
        nVar.R = this.D;
        nVar.S = this.E;
        nVar.T = this.F;
        if (z11) {
            b3.m.n(nVar);
        }
        b3.m.m(nVar);
    }

    public final String toString() {
        return "PainterElement(painter=" + this.B + ", sizeToIntrinsics=true, alignment=" + this.C + ", contentScale=" + this.D + ", alpha=" + this.E + ", colorFilter=" + this.F + ')';
    }
}
