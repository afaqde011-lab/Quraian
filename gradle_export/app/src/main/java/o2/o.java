package o2;

public final class o extends b0 {

    public final float f11619c;

    public final float f11620d;

    public final float f11621e;

    public final float f11622f;

    public o(float f3, float f10, float f11, float f12) {
        super(1);
        this.f11619c = f3;
        this.f11620d = f10;
        this.f11621e = f11;
        this.f11622f = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Float.compare(this.f11619c, oVar.f11619c) == 0 && Float.compare(this.f11620d, oVar.f11620d) == 0 && Float.compare(this.f11621e, oVar.f11621e) == 0 && Float.compare(this.f11622f, oVar.f11622f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f11622f) + w.c.c(this.f11621e, w.c.c(this.f11620d, Float.hashCode(this.f11619c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("QuadTo(x1=");
        sb2.append(this.f11619c);
        sb2.append(", y1=");
        sb2.append(this.f11620d);
        sb2.append(", x2=");
        sb2.append(this.f11621e);
        sb2.append(", y2=");
        return w.c.k(sb2, this.f11622f, ')');
    }
}
