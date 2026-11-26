package o2;

public final class a0 extends b0 {

    public final float f11517c;

    public a0(float f3) {
        super(3);
        this.f11517c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0) && Float.compare(this.f11517c, ((a0) obj).f11517c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f11517c);
    }

    public final String toString() {
        return w.c.k(new StringBuilder("VerticalTo(y="), this.f11517c, ')');
    }
}
