package o2;

public final class w extends b0 {

    public final float f11647c;

    public final float f11648d;

    public final float f11649e;

    public final float f11650f;

    public w(float f3, float f10, float f11, float f12) {
        super(1);
        this.f11647c = f3;
        this.f11648d = f10;
        this.f11649e = f11;
        this.f11650f = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Float.compare(this.f11647c, wVar.f11647c) == 0 && Float.compare(this.f11648d, wVar.f11648d) == 0 && Float.compare(this.f11649e, wVar.f11649e) == 0 && Float.compare(this.f11650f, wVar.f11650f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f11650f) + w.c.c(this.f11649e, w.c.c(this.f11648d, Float.hashCode(this.f11647c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeQuadTo(dx1=");
        sb2.append(this.f11647c);
        sb2.append(", dy1=");
        sb2.append(this.f11648d);
        sb2.append(", dx2=");
        sb2.append(this.f11649e);
        sb2.append(", dy2=");
        return w.c.k(sb2, this.f11650f, ')');
    }
}
