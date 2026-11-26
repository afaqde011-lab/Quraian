package b3;

public final class n {

    public final float f2084a;

    public final float f2085b;

    public final float f2086c;

    public final float f2087d;

    public n(float f3, float f10, float f11, float f12) {
        this.f2084a = f3;
        this.f2085b = f10;
        this.f2086c = f11;
        this.f2087d = f12;
        if (f3 < 0.0f) {
            y2.a.a("Left must be non-negative");
        }
        if (f10 < 0.0f) {
            y2.a.a("Top must be non-negative");
        }
        if (f11 < 0.0f) {
            y2.a.a("Right must be non-negative");
        }
        if (f12 >= 0.0f) {
            return;
        }
        y2.a.a("Bottom must be non-negative");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return y3.f.b(this.f2084a, nVar.f2084a) && y3.f.b(this.f2085b, nVar.f2085b) && y3.f.b(this.f2086c, nVar.f2086c) && y3.f.b(this.f2087d, nVar.f2087d);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + w.c.c(this.f2087d, w.c.c(this.f2086c, w.c.c(this.f2085b, Float.hashCode(this.f2084a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DpTouchBoundsExpansion(start=");
        w.c.r(this.f2084a, sb2, ", top=");
        w.c.r(this.f2085b, sb2, ", end=");
        w.c.r(this.f2086c, sb2, ", bottom=");
        sb2.append((Object) y3.f.c(this.f2087d));
        sb2.append(", isLayoutDirectionAware=true)");
        return sb2.toString();
    }
}
