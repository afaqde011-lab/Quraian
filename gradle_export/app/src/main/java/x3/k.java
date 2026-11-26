package x3;

public final class k {

    public final int f16416a;

    public static String a(int i10) {
        if (i10 == 1) {
            return "Left";
        }
        if (i10 == 2) {
            return "Right";
        }
        if (i10 == 3) {
            return "Center";
        }
        if (i10 == 4) {
            return "Justify";
        }
        if (i10 == 5) {
            return "Start";
        }
        if (i10 == 6) {
            return "End";
        }
        return i10 == 0 ? "Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f16416a == ((k) obj).f16416a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f16416a);
    }

    public final String toString() {
        return a(this.f16416a);
    }
}
