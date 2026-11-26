package z;

import c3.d2;
import c3.y2;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lz/t;", "Lb3/e1;", "Lz/s;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class t extends b3.e1 {
    public final float B;
    public final i2.v0 C;
    public final i2.t0 D;

    public t(float f3, i2.v0 v0Var, i2.t0 t0Var) {
        this.B = f3;
        this.C = v0Var;
        this.D = t0Var;
    }

    @Override
    public final b2.q d() {
        return new s(this.B, this.C, this.D);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return y3.f.b(this.B, tVar.B) && this.C.equals(tVar.C) && kotlin.jvm.internal.m.a(this.D, tVar.D);
    }

    @Override
    public final void h(d2 d2Var) {
        d2Var.f2644a = "border";
        y2 y2Var = d2Var.f2646c;
        y2Var.c(new y3.f(this.B), "width");
        long j9 = this.C.f7174a;
        y2Var.c(new i2.t(j9), "color");
        d2Var.f2645b = new i2.t(j9);
        y2Var.c(this.D, "shape");
    }

    public final int hashCode() {
        return this.D.hashCode() + ((this.C.hashCode() + (Float.hashCode(this.B) * 31)) * 31);
    }

    @Override
    public final void i(b2.q qVar) {
        s sVar = (s) qVar;
        float f3 = sVar.R;
        f2.c cVar = sVar.U;
        float f10 = this.B;
        if (!y3.f.b(f3, f10)) {
            sVar.R = f10;
            cVar.B1();
        }
        i2.v0 v0Var = sVar.S;
        i2.v0 v0Var2 = this.C;
        if (!kotlin.jvm.internal.m.a(v0Var, v0Var2)) {
            sVar.S = v0Var2;
            cVar.B1();
        }
        i2.t0 t0Var = sVar.T;
        i2.t0 t0Var2 = this.D;
        if (kotlin.jvm.internal.m.a(t0Var, t0Var2)) {
            return;
        }
        sVar.T = t0Var2;
        cVar.B1();
        b3.m.o(sVar);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BorderModifierNodeElement(width=");
        w.c.r(this.B, sb2, ", brush=");
        sb2.append(this.C);
        sb2.append(", shape=");
        sb2.append(this.D);
        sb2.append(')');
        return sb2.toString();
    }
}
