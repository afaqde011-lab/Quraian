package o2;

public final class x extends b0 {

    public final float f11651c;

    public final float f11652d;

    public final float f11653e;

    public final float f11654f;

    public x(float f3, float f10, float f11, float f12) {
        super(2);
        this.f11651c = f3;
        this.f11652d = f10;
        this.f11653e = f11;
        this.f11654f = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Float.compare(this.f11651c, xVar.f11651c) == 0 && Float.compare(this.f11652d, xVar.f11652d) == 0 && Float.compare(this.f11653e, xVar.f11653e) == 0 && Float.compare(this.f11654f, xVar.f11654f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f11654f) + w.c.c(this.f11653e, w.c.c(this.f11652d, Float.hashCode(this.f11651c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeReflectiveCurveTo(dx1=");
        sb2.append(this.f11651c);
        sb2.append(", dy1=");
        sb2.append(this.f11652d);
        sb2.append(", dx2=");
        sb2.append(this.f11653e);
        sb2.append(", dy2=");
        return w.c.k(sb2, this.f11654f, ')');
    }
}
