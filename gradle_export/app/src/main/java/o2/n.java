package o2;

public final class n extends b0 {

    public final float f11617c;

    public final float f11618d;

    public n(float f3, float f10) {
        super(3);
        this.f11617c = f3;
        this.f11618d = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Float.compare(this.f11617c, nVar.f11617c) == 0 && Float.compare(this.f11618d, nVar.f11618d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f11618d) + (Float.hashCode(this.f11617c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MoveTo(x=");
        sb2.append(this.f11617c);
        sb2.append(", y=");
        return w.c.k(sb2, this.f11618d, ')');
    }
}
