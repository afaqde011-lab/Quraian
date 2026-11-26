package y3;

public final class n implements z3.a {

    public final float f16597a;

    public n(float f3) {
        this.f16597a = f3;
    }

    @Override
    public final float a(float f3) {
        return f3 / this.f16597a;
    }

    @Override
    public final float b(float f3) {
        return f3 * this.f16597a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && Float.compare(this.f16597a, ((n) obj).f16597a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f16597a);
    }

    public final String toString() {
        return w.c.k(new StringBuilder("LinearFontScaleConverter(fontScale="), this.f16597a, ')');
    }
}
