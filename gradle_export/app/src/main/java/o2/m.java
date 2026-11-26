package o2;

public final class m extends b0 {

    public final float f11615c;

    public final float f11616d;

    public m(float f3, float f10) {
        super(3);
        this.f11615c = f3;
        this.f11616d = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Float.compare(this.f11615c, mVar.f11615c) == 0 && Float.compare(this.f11616d, mVar.f11616d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f11616d) + (Float.hashCode(this.f11615c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LineTo(x=");
        sb2.append(this.f11615c);
        sb2.append(", y=");
        return w.c.k(sb2, this.f11616d, ')');
    }
}
