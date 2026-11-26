package o2;

public final class t extends b0 {

    public final float f11642c;

    public t(float f3) {
        super(3);
        this.f11642c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && Float.compare(this.f11642c, ((t) obj).f11642c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f11642c);
    }

    public final String toString() {
        return w.c.k(new StringBuilder("RelativeHorizontalTo(dx="), this.f11642c, ')');
    }
}
