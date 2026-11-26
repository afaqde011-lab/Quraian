package o2;

public final class s extends b0 {

    public final float f11636c;

    public final float f11637d;

    public final float f11638e;

    public final float f11639f;

    public final float f11640g;

    public final float f11641h;

    public s(float f3, float f10, float f11, float f12, float f13, float f14) {
        super(2);
        this.f11636c = f3;
        this.f11637d = f10;
        this.f11638e = f11;
        this.f11639f = f12;
        this.f11640g = f13;
        this.f11641h = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Float.compare(this.f11636c, sVar.f11636c) == 0 && Float.compare(this.f11637d, sVar.f11637d) == 0 && Float.compare(this.f11638e, sVar.f11638e) == 0 && Float.compare(this.f11639f, sVar.f11639f) == 0 && Float.compare(this.f11640g, sVar.f11640g) == 0 && Float.compare(this.f11641h, sVar.f11641h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f11641h) + w.c.c(this.f11640g, w.c.c(this.f11639f, w.c.c(this.f11638e, w.c.c(this.f11637d, Float.hashCode(this.f11636c) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeCurveTo(dx1=");
        sb2.append(this.f11636c);
        sb2.append(", dy1=");
        sb2.append(this.f11637d);
        sb2.append(", dx2=");
        sb2.append(this.f11638e);
        sb2.append(", dy2=");
        sb2.append(this.f11639f);
        sb2.append(", dx3=");
        sb2.append(this.f11640g);
        sb2.append(", dy3=");
        return w.c.k(sb2, this.f11641h, ')');
    }
}
