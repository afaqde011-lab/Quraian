package o2;

public final class k extends b0 {

    public final float f11608c;

    public final float f11609d;

    public final float f11610e;

    public final float f11611f;

    public final float f11612g;

    public final float f11613h;

    public k(float f3, float f10, float f11, float f12, float f13, float f14) {
        super(2);
        this.f11608c = f3;
        this.f11609d = f10;
        this.f11610e = f11;
        this.f11611f = f12;
        this.f11612g = f13;
        this.f11613h = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Float.compare(this.f11608c, kVar.f11608c) == 0 && Float.compare(this.f11609d, kVar.f11609d) == 0 && Float.compare(this.f11610e, kVar.f11610e) == 0 && Float.compare(this.f11611f, kVar.f11611f) == 0 && Float.compare(this.f11612g, kVar.f11612g) == 0 && Float.compare(this.f11613h, kVar.f11613h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f11613h) + w.c.c(this.f11612g, w.c.c(this.f11611f, w.c.c(this.f11610e, w.c.c(this.f11609d, Float.hashCode(this.f11608c) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CurveTo(x1=");
        sb2.append(this.f11608c);
        sb2.append(", y1=");
        sb2.append(this.f11609d);
        sb2.append(", x2=");
        sb2.append(this.f11610e);
        sb2.append(", y2=");
        sb2.append(this.f11611f);
        sb2.append(", x3=");
        sb2.append(this.f11612g);
        sb2.append(", y3=");
        return w.c.k(sb2, this.f11613h, ')');
    }
}
