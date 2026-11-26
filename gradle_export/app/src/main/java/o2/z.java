package o2;

public final class z extends b0 {

    public final float f11657c;

    public z(float f3) {
        super(3);
        this.f11657c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && Float.compare(this.f11657c, ((z) obj).f11657c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f11657c);
    }

    public final String toString() {
        return w.c.k(new StringBuilder("RelativeVerticalTo(dy="), this.f11657c, ')');
    }
}
