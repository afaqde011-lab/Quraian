package o2;

public final class p extends b0 {

    public final float f11623c;

    public final float f11624d;

    public final float f11625e;

    public final float f11626f;

    public p(float f3, float f10, float f11, float f12) {
        super(2);
        this.f11623c = f3;
        this.f11624d = f10;
        this.f11625e = f11;
        this.f11626f = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Float.compare(this.f11623c, pVar.f11623c) == 0 && Float.compare(this.f11624d, pVar.f11624d) == 0 && Float.compare(this.f11625e, pVar.f11625e) == 0 && Float.compare(this.f11626f, pVar.f11626f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f11626f) + w.c.c(this.f11625e, w.c.c(this.f11624d, Float.hashCode(this.f11623c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ReflectiveCurveTo(x1=");
        sb2.append(this.f11623c);
        sb2.append(", y1=");
        sb2.append(this.f11624d);
        sb2.append(", x2=");
        sb2.append(this.f11625e);
        sb2.append(", y2=");
        return w.c.k(sb2, this.f11626f, ')');
    }
}
