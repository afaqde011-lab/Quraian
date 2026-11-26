package z;

import c3.d2;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lz/m;", "Lb3/e1;", "Lz/o;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class m extends b3.e1 {
    public final long B;
    public final i2.q C;
    public final float D;
    public final i2.t0 E;
    public final c3.t F;

    public m(long j9, i2.q qVar, i2.t0 t0Var, int i10) {
        c3.t tVar = c3.t.F;
        j9 = (i10 & 1) != 0 ? i2.t.f7167g : j9;
        qVar = (i10 & 2) != 0 ? null : qVar;
        this.B = j9;
        this.C = qVar;
        this.D = 1.0f;
        this.E = t0Var;
        this.F = tVar;
    }

    @Override
    public final b2.q d() {
        o oVar = new o();
        oVar.O = this.B;
        oVar.P = this.C;
        oVar.Q = this.D;
        oVar.R = this.E;
        oVar.S = 9205357640488583168L;
        return oVar;
    }

    public final boolean equals(Object obj) {
        m mVar = obj instanceof m ? (m) obj : null;
        return mVar != null && i2.t.c(this.B, mVar.B) && kotlin.jvm.internal.m.a(this.C, mVar.C) && this.D == mVar.D && kotlin.jvm.internal.m.a(this.E, mVar.E);
    }

    @Override
    public final void h(d2 d2Var) {
        this.F.getClass();
    }

    public final int hashCode() {
        int i10 = i2.t.f7168h;
        int iHashCode = Long.hashCode(this.B) * 31;
        i2.q qVar = this.C;
        return this.E.hashCode() + w.c.c(this.D, (iHashCode + (qVar != null ? qVar.hashCode() : 0)) * 31, 31);
    }

    @Override
    public final void i(b2.q qVar) {
        o oVar = (o) qVar;
        oVar.O = this.B;
        oVar.P = this.C;
        oVar.Q = this.D;
        i2.t0 t0Var = oVar.R;
        i2.t0 t0Var2 = this.E;
        if (!kotlin.jvm.internal.m.a(t0Var, t0Var2)) {
            oVar.R = t0Var2;
            b3.m.o(oVar);
        }
        b3.m.m(oVar);
    }
}
