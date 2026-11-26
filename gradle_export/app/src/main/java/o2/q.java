package o2;

public final class q extends b0 {

    public final float f11627c;

    public final float f11628d;

    public q(float f3, float f10) {
        super(1);
        this.f11627c = f3;
        this.f11628d = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Float.compare(this.f11627c, qVar.f11627c) == 0 && Float.compare(this.f11628d, qVar.f11628d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f11628d) + (Float.hashCode(this.f11627c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ReflectiveQuadTo(x=");
        sb2.append(this.f11627c);
        sb2.append(", y=");
        return w.c.k(sb2, this.f11628d, ')');
    }
}
