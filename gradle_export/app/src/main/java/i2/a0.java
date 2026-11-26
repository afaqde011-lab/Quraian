package i2;

import b3.e1;
import b3.p1;
import c3.d2;
import c3.y2;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Li2/a0;", "Lb3/e1;", "Li2/u0;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class a0 extends e1 {
    public final float B;
    public final float C;
    public final float D;
    public final float E;
    public final float F;
    public final long G;
    public final t0 H;
    public final boolean I;
    public final long J;
    public final long K;
    public final m L;

    public a0(float f3, float f10, float f11, float f12, float f13, long j9, t0 t0Var, boolean z10, long j10, long j11, m mVar) {
        this.B = f3;
        this.C = f10;
        this.D = f11;
        this.E = f12;
        this.F = f13;
        this.G = j9;
        this.H = t0Var;
        this.I = z10;
        this.J = j10;
        this.K = j11;
        this.L = mVar;
    }

    @Override
    public final b2.q d() {
        u0 u0Var = new u0();
        u0Var.O = this.B;
        u0Var.P = this.C;
        u0Var.Q = this.D;
        u0Var.R = this.E;
        u0Var.S = this.F;
        u0Var.T = 8.0f;
        u0Var.U = this.G;
        u0Var.V = this.H;
        u0Var.W = this.I;
        u0Var.X = this.J;
        u0Var.Y = this.K;
        u0Var.Z = 3;
        u0Var.f7170a0 = this.L;
        u0Var.f7171b0 = new b3.a(u0Var, 17);
        return u0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return Float.compare(this.B, a0Var.B) == 0 && Float.compare(this.C, a0Var.C) == 0 && Float.compare(this.D, a0Var.D) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(this.E, a0Var.E) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(this.F, a0Var.F) == 0 && Float.compare(8.0f, 8.0f) == 0 && w0.a(this.G, a0Var.G) && kotlin.jvm.internal.m.a(this.H, a0Var.H) && this.I == a0Var.I && t.c(this.J, a0Var.J) && t.c(this.K, a0Var.K) && kotlin.jvm.internal.m.a(this.L, a0Var.L);
    }

    @Override
    public final void h(d2 d2Var) {
        d2Var.f2644a = "graphicsLayer";
        y2 y2Var = d2Var.f2646c;
        y2Var.c(Float.valueOf(this.B), "scaleX");
        y2Var.c(Float.valueOf(this.C), "scaleY");
        y2Var.c(Float.valueOf(this.D), "alpha");
        Float fValueOf = Float.valueOf(0.0f);
        y2Var.c(fValueOf, "translationX");
        y2Var.c(fValueOf, "translationY");
        y2Var.c(Float.valueOf(this.E), "shadowElevation");
        y2Var.c(fValueOf, "rotationX");
        y2Var.c(fValueOf, "rotationY");
        y2Var.c(Float.valueOf(this.F), "rotationZ");
        y2Var.c(Float.valueOf(8.0f), "cameraDistance");
        y2Var.c(new w0(this.G), "transformOrigin");
        y2Var.c(this.H, "shape");
        y2Var.c(Boolean.valueOf(this.I), "clip");
        y2Var.c(null, "renderEffect");
        y2Var.c(new t(this.J), "ambientShadowColor");
        y2Var.c(new t(this.K), "spotShadowColor");
        y2Var.c(new w(), "compositingStrategy");
        y2Var.c(new l(), "blendMode");
        y2Var.c(this.L, "colorFilter");
    }

    public final int hashCode() {
        int iC = w.c.c(8.0f, w.c.c(this.F, w.c.c(0.0f, w.c.c(0.0f, w.c.c(this.E, w.c.c(0.0f, w.c.c(0.0f, w.c.c(this.D, w.c.c(this.C, Float.hashCode(this.B) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        int i10 = w0.f7176c;
        int iE = w.c.e((this.H.hashCode() + w.c.f(iC, this.G, 31)) * 31, 961, this.I);
        int i11 = t.f7168h;
        int iD = w.c.d(3, w.c.d(0, w.c.f(w.c.f(iE, this.J, 31), this.K, 31), 31), 31);
        m mVar = this.L;
        return iD + (mVar != null ? mVar.hashCode() : 0);
    }

    @Override
    public final void i(b2.q qVar) throws NoWhenBranchMatchedException, KotlinNothingValueException {
        p1 p1Var;
        u0 u0Var = (u0) qVar;
        u0Var.O = this.B;
        u0Var.P = this.C;
        u0Var.Q = this.D;
        u0Var.R = this.E;
        u0Var.S = this.F;
        u0Var.T = 8.0f;
        u0Var.U = this.G;
        u0Var.V = this.H;
        u0Var.W = this.I;
        u0Var.X = this.J;
        u0Var.Y = this.K;
        u0Var.Z = 3;
        u0Var.f7170a0 = this.L;
        b3.a aVar = u0Var.f7171b0;
        if (u0Var.A.N && (p1Var = b3.m.v(u0Var, 2).R) != null) {
            p1Var.Y1(true, aVar);
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GraphicsLayerElement(scaleX=");
        sb2.append(this.B);
        sb2.append(", scaleY=");
        sb2.append(this.C);
        sb2.append(", alpha=");
        sb2.append(this.D);
        sb2.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sb2.append(this.E);
        sb2.append(", rotationX=0.0, rotationY=0.0, rotationZ=");
        sb2.append(this.F);
        sb2.append(", cameraDistance=8.0, transformOrigin=");
        sb2.append((Object) w0.d(this.G));
        sb2.append(", shape=");
        sb2.append(this.H);
        sb2.append(", clip=");
        sb2.append(this.I);
        sb2.append(", renderEffect=null, ambientShadowColor=");
        w.c.s(this.J, ", spotShadowColor=", sb2);
        sb2.append((Object) t.i(this.K));
        sb2.append(", compositingStrategy=CompositingStrategy(value=0), blendMode=");
        sb2.append((Object) l.a(3));
        sb2.append(", colorFilter=");
        sb2.append(this.L);
        sb2.append(')');
        return sb2.toString();
    }
}
