package j2;

public final class t {

    public final float f7924a;

    public final float f7925b;

    public t(float f3, float f10) {
        this.f7924a = f3;
        this.f7925b = f10;
    }

    public final float[] a() {
        float f3 = this.f7924a;
        float f10 = this.f7925b;
        return new float[]{f3 / f10, 1.0f, ((1.0f - f3) - f10) / f10};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Float.compare(this.f7924a, tVar.f7924a) == 0 && Float.compare(this.f7925b, tVar.f7925b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f7925b) + (Float.hashCode(this.f7924a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WhitePoint(x=");
        sb2.append(this.f7924a);
        sb2.append(", y=");
        return w.c.k(sb2, this.f7925b, ')');
    }
}
