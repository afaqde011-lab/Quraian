package o2;

public final class v extends b0 {

    public final float f11645c;

    public final float f11646d;

    public v(float f3, float f10) {
        super(3);
        this.f11645c = f3;
        this.f11646d = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Float.compare(this.f11645c, vVar.f11645c) == 0 && Float.compare(this.f11646d, vVar.f11646d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f11646d) + (Float.hashCode(this.f11645c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeMoveTo(dx=");
        sb2.append(this.f11645c);
        sb2.append(", dy=");
        return w.c.k(sb2, this.f11646d, ')');
    }
}
