package mb;

import b3.e1;
import c3.d2;
import c3.y2;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lmb/r;", "Lb3/e1;", "Lmb/s;", "coil-compose-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class r extends e1 {
    public final m2.b B;
    public final b2.d C;
    public final z2.p D;
    public final float E;

    public r(m2.b bVar, b2.d dVar, z2.p pVar, float f3) {
        this.B = bVar;
        this.C = dVar;
        this.D = pVar;
        this.E = f3;
    }

    @Override
    public final b2.q d() {
        s sVar = new s();
        sVar.O = this.B;
        sVar.P = this.C;
        sVar.Q = this.D;
        sVar.R = this.E;
        return sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return kotlin.jvm.internal.m.a(this.B, rVar.B) && kotlin.jvm.internal.m.a(this.C, rVar.C) && kotlin.jvm.internal.m.a(this.D, rVar.D) && Float.compare(this.E, rVar.E) == 0;
    }

    @Override
    public final void h(d2 d2Var) {
        d2Var.f2644a = "content";
        y2 y2Var = d2Var.f2646c;
        y2Var.c(this.B, "painter");
        y2Var.c(this.C, "alignment");
        y2Var.c(this.D, "contentScale");
        y2Var.c(Float.valueOf(this.E), "alpha");
        y2Var.c(null, "colorFilter");
    }

    public final int hashCode() {
        return w.c.c(this.E, (this.D.hashCode() + ((this.C.hashCode() + (this.B.hashCode() * 31)) * 31)) * 31, 31);
    }

    @Override
    public final void i(b2.q qVar) {
        s sVar = (s) qVar;
        long jH = sVar.O.h();
        m2.b bVar = this.B;
        boolean zA = h2.e.a(jH, bVar.h());
        sVar.O = bVar;
        sVar.P = this.C;
        sVar.Q = this.D;
        sVar.R = this.E;
        if (!zA) {
            b3.m.n(sVar);
        }
        b3.m.m(sVar);
    }

    public final String toString() {
        return "ContentPainterElement(painter=" + this.B + ", alignment=" + this.C + ", contentScale=" + this.D + ", alpha=" + this.E + ", colorFilter=null)";
    }
}
