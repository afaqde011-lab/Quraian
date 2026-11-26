package q3;

public final class r implements q {

    public final float f12748a;

    public r(float f3) {
        this.f12748a = f3;
    }

    @Override
    public final float a() {
        return this.f12748a;
    }

    @Override
    public final String b() {
        return "ital";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && this.f12748a == ((r) obj).f12748a;
    }

    public final int hashCode() {
        return Float.hashCode(this.f12748a) + 100522026;
    }

    public final String toString() {
        return w.c.k(new StringBuilder("FontVariation.Setting(axisName='ital', value="), this.f12748a, ')');
    }
}
