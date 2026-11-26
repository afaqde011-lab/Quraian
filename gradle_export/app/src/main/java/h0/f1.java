package h0;

import com.google.android.gms.internal.measurement.x5;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lh0/f1;", "Lb3/e1;", "Lh0/h1;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class f1 extends b3.e1 {
    public final float B;
    public final float C;
    public final boolean D;
    public final u00.k E;

    public f1(float f3, float f10, boolean z10, u00.k kVar) {
        this.B = f3;
        this.C = f10;
        this.D = z10;
        this.E = kVar;
    }

    @Override
    public final b2.q d() {
        h1 h1Var = new h1();
        h1Var.O = this.B;
        h1Var.P = this.C;
        h1Var.Q = this.D;
        return h1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        f1 f1Var = obj instanceof f1 ? (f1) obj : null;
        return f1Var != null && y3.f.b(this.B, f1Var.B) && y3.f.b(this.C, f1Var.C) && this.D == f1Var.D;
    }

    @Override
    public final void h(c3.d2 d2Var) {
        this.E.invoke(d2Var);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.D) + w.c.c(this.C, Float.hashCode(this.B) * 31, 31);
    }

    @Override
    public final void i(b2.q qVar) {
        h1 h1Var = (h1) qVar;
        float f3 = h1Var.O;
        float f10 = this.B;
        boolean zB = y3.f.b(f3, f10);
        float f11 = this.C;
        boolean z10 = this.D;
        if (!zB || !y3.f.b(h1Var.P, f11) || h1Var.Q != z10) {
            b3.m.y(h1Var).W(false);
        }
        h1Var.O = f10;
        h1Var.P = f11;
        h1Var.Q = z10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OffsetModifierElement(x=");
        w.c.r(this.B, sb2, ", y=");
        w.c.r(this.C, sb2, ", rtlAware=");
        return x5.o(sb2, this.D, ')');
    }
}
