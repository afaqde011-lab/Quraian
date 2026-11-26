package o2;

public final class i extends b0 {

    public final float f11600c;

    public final float f11601d;

    public final float f11602e;

    public final boolean f11603f;

    public final boolean f11604g;

    public final float f11605h;

    public final float f11606i;

    public i(float f3, float f10, float f11, boolean z10, boolean z11, float f12, float f13) {
        super(3);
        this.f11600c = f3;
        this.f11601d = f10;
        this.f11602e = f11;
        this.f11603f = z10;
        this.f11604g = z11;
        this.f11605h = f12;
        this.f11606i = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Float.compare(this.f11600c, iVar.f11600c) == 0 && Float.compare(this.f11601d, iVar.f11601d) == 0 && Float.compare(this.f11602e, iVar.f11602e) == 0 && this.f11603f == iVar.f11603f && this.f11604g == iVar.f11604g && Float.compare(this.f11605h, iVar.f11605h) == 0 && Float.compare(this.f11606i, iVar.f11606i) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f11606i) + w.c.c(this.f11605h, w.c.e(w.c.e(w.c.c(this.f11602e, w.c.c(this.f11601d, Float.hashCode(this.f11600c) * 31, 31), 31), 31, this.f11603f), 31, this.f11604g), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ArcTo(horizontalEllipseRadius=");
        sb2.append(this.f11600c);
        sb2.append(", verticalEllipseRadius=");
        sb2.append(this.f11601d);
        sb2.append(", theta=");
        sb2.append(this.f11602e);
        sb2.append(", isMoreThanHalf=");
        sb2.append(this.f11603f);
        sb2.append(", isPositiveArc=");
        sb2.append(this.f11604g);
        sb2.append(", arcStartX=");
        sb2.append(this.f11605h);
        sb2.append(", arcStartY=");
        return w.c.k(sb2, this.f11606i, ')');
    }
}
