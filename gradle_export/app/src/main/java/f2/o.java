package f2;

import b3.e1;
import b3.p1;
import c3.d2;
import c3.y2;
import i2.t;
import i2.t0;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lf2/o;", "Lb3/e1;", "Li2/o;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class o extends e1 {
    public final float B;
    public final t0 C;
    public final boolean D;
    public final long E;
    public final long F;

    public o(float f3, t0 t0Var, boolean z10, long j9, long j10) {
        this.B = f3;
        this.C = t0Var;
        this.D = z10;
        this.E = j9;
        this.F = j10;
    }

    @Override
    public final b2.q d() {
        return new i2.o(new b3.a(this, 15));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return y3.f.b(this.B, oVar.B) && kotlin.jvm.internal.m.a(this.C, oVar.C) && this.D == oVar.D && t.c(this.E, oVar.E) && t.c(this.F, oVar.F);
    }

    @Override
    public final void h(d2 d2Var) {
        d2Var.f2644a = "shadow";
        y2 y2Var = d2Var.f2646c;
        y2Var.c(new y3.f(this.B), "elevation");
        y2Var.c(this.C, "shape");
        y2Var.c(Boolean.valueOf(this.D), "clip");
        y2Var.c(new t(this.E), "ambientColor");
        y2Var.c(new t(this.F), "spotColor");
    }

    public final int hashCode() {
        int iE = w.c.e((this.C.hashCode() + (Float.hashCode(this.B) * 31)) * 31, 31, this.D);
        int i10 = t.f7168h;
        return Long.hashCode(this.F) + w.c.f(iE, this.E, 31);
    }

    @Override
    public final void i(b2.q qVar) throws NoWhenBranchMatchedException, KotlinNothingValueException {
        p1 p1Var;
        i2.o oVar = (i2.o) qVar;
        b3.a aVar = new b3.a(this, 15);
        oVar.O = aVar;
        if (oVar.A.N && (p1Var = b3.m.v(oVar, 2).R) != null) {
            p1Var.Y1(true, aVar);
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ShadowGraphicsLayerElement(elevation=");
        w.c.r(this.B, sb2, ", shape=");
        sb2.append(this.C);
        sb2.append(", clip=");
        sb2.append(this.D);
        sb2.append(", ambientColor=");
        w.c.s(this.E, ", spotColor=", sb2);
        sb2.append((Object) t.i(this.F));
        sb2.append(')');
        return sb2.toString();
    }
}
