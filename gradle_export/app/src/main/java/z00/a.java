package z00;

public final class a implements b {
    public final float A;
    public final float B;

    public a(float f, float f2) {
        this.A = f;
        this.B = f2;
    }

    public static boolean b(Comparable comparable, Comparable comparable2) {
        return ((Number) comparable).floatValue() <= ((Number) comparable2).floatValue();
    }

    @Override
    public final Comparable a() {
        return Float.valueOf(this.A);
    }

    @Override
    public final Comparable c() {
        return Float.valueOf(this.B);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (isEmpty() && ((a) obj).isEmpty()) {
            return true;
        }
        a aVar = (a) obj;
        return this.A == aVar.A && this.B == aVar.B;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return Float.hashCode(this.B) + (Float.hashCode(this.A) * 31);
    }

    @Override
    public final boolean isEmpty() {
        return this.A > this.B;
    }

    public final String toString() {
        return this.A + ".." + this.B;
    }
}
