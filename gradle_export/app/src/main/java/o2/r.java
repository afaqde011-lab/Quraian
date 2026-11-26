package o2;

public final class r extends b0 {

    public final float f11629c;

    public final float f11630d;

    public final float f11631e;

    public final boolean f11632f;

    public final boolean f11633g;

    public final float f11634h;

    public final float f11635i;

    public r(float f3, float f10, float f11, boolean z10, boolean z11, float f12, float f13) {
        super(3);
        this.f11629c = f3;
        this.f11630d = f10;
        this.f11631e = f11;
        this.f11632f = z10;
        this.f11633g = z11;
        this.f11634h = f12;
        this.f11635i = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Float.compare(this.f11629c, rVar.f11629c) == 0 && Float.compare(this.f11630d, rVar.f11630d) == 0 && Float.compare(this.f11631e, rVar.f11631e) == 0 && this.f11632f == rVar.f11632f && this.f11633g == rVar.f11633g && Float.compare(this.f11634h, rVar.f11634h) == 0 && Float.compare(this.f11635i, rVar.f11635i) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f11635i) + w.c.c(this.f11634h, w.c.e(w.c.e(w.c.c(this.f11631e, w.c.c(this.f11630d, Float.hashCode(this.f11629c) * 31, 31), 31), 31, this.f11632f), 31, this.f11633g), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeArcTo(horizontalEllipseRadius=");
        sb2.append(this.f11629c);
        sb2.append(", verticalEllipseRadius=");
        sb2.append(this.f11630d);
        sb2.append(", theta=");
        sb2.append(this.f11631e);
        sb2.append(", isMoreThanHalf=");
        sb2.append(this.f11632f);
        sb2.append(", isPositiveArc=");
        sb2.append(this.f11633g);
        sb2.append(", arcStartDx=");
        sb2.append(this.f11634h);
        sb2.append(", arcStartDy=");
        return w.c.k(sb2, this.f11635i, ')');
    }
}
