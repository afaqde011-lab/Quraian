package s10;

public final class z extends e0 {
    public final double a;

    public z(double d) {
        this.a = d;
    }

    @Override
    public final Object a() {
        return Double.valueOf(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && Double.compare(this.a, ((z) obj).a) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.a);
    }
}
