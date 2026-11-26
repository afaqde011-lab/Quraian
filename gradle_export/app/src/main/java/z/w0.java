package z;

import android.view.View;
import c3.d2;
import c3.y2;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lz/w0;", "Lb3/e1;", "Lz/z0;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class w0 extends b3.e1 {
    public final ca.q B;
    public final as.f0 C;
    public final l1 D;

    public w0(ca.q qVar, as.f0 f0Var, l1 l1Var) {
        this.B = qVar;
        this.C = f0Var;
        this.D = l1Var;
    }

    @Override
    public final b2.q d() {
        return new z0(this.B, this.C, this.D);
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    @Override
    public final void h(d2 d2Var) {
        d2Var.f2644a = "magnifier";
        y2 y2Var = d2Var.f2646c;
        y2Var.c(this.B, "sourceCenter");
        y2Var.c(null, "magnifierCenter");
        y2Var.c(Float.valueOf(Float.NaN), "zoom");
        y2Var.c(new y3.h(9205357640488583168L), "size");
        y2Var.c(new y3.f(Float.NaN), "cornerRadius");
        y2Var.c(new y3.f(Float.NaN), "elevation");
        y2Var.c(Boolean.TRUE, "clippingEnabled");
    }

    public final int hashCode() {
        return this.D.hashCode() + ((this.C.hashCode() + w.c.e(w.c.c(Float.NaN, w.c.c(Float.NaN, w.c.f(w.c.e(w.c.c(Float.NaN, this.B.hashCode() * 961, 31), 31, true), 9205357640488583168L, 31), 31), 31), 31, true)) * 31);
    }

    @Override
    public final void i(b2.q qVar) {
        z0 z0Var = (z0) qVar;
        float f3 = z0Var.Q;
        long j9 = z0Var.S;
        float f10 = z0Var.T;
        boolean z10 = z0Var.R;
        float f11 = z0Var.U;
        boolean z11 = z0Var.V;
        l1 l1Var = z0Var.W;
        View view = z0Var.X;
        y3.c cVar = z0Var.Y;
        z0Var.O = this.B;
        z0Var.Q = Float.NaN;
        z0Var.R = true;
        z0Var.S = 9205357640488583168L;
        z0Var.T = Float.NaN;
        z0Var.U = Float.NaN;
        z0Var.V = true;
        z0Var.P = this.C;
        l1 l1Var2 = this.D;
        z0Var.W = l1Var2;
        View viewA = b3.m.A(z0Var);
        y3.c cVar2 = b3.m.y(z0Var).Z;
        if (z0Var.Z != null) {
            j3.z zVar = a1.f16893a;
            if ((!Float.isNaN(Float.NaN) || !Float.isNaN(f3)) && Float.NaN != f3) {
                l1Var2.getClass();
            }
            if (9205357640488583168L != j9 || !y3.f.b(Float.NaN, f10) || !y3.f.b(Float.NaN, f11) || true != z10 || true != z11 || !l1Var2.equals(l1Var) || !viewA.equals(view) || !kotlin.jvm.internal.m.a(cVar2, cVar)) {
                z0Var.C1();
            }
        }
        z0Var.D1();
    }
}
