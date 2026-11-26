package x3;

public final class a {

    public final float f16399a;

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return Float.compare(this.f16399a, ((a) obj).f16399a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f16399a);
    }

    public final String toString() {
        return "BaselineShift(multiplier=" + this.f16399a + ')';
    }
}
