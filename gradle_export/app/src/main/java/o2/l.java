package o2;

public final class l extends b0 {

    public final float f11614c;

    public l(float f3) {
        super(3);
        this.f11614c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && Float.compare(this.f11614c, ((l) obj).f11614c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f11614c);
    }

    public final String toString() {
        return w.c.k(new StringBuilder("HorizontalTo(x="), this.f11614c, ')');
    }
}
