package y3;

public final class f implements Comparable {
    public final float A;

    public static int a(float f3, float f10) {
        if (Float.isNaN(f3) || Float.isNaN(f10)) {
            return 0;
        }
        return Float.compare(f3, f10);
    }

    public static final boolean b(float f3, float f10) {
        return Float.compare(f3, f10) == 0;
    }

    public static String c(float f3) {
        if (Float.isNaN(f3)) {
            return "Dp.Unspecified";
        }
        return f3 + ".dp";
    }

    @Override
    public final int compareTo(Object obj) {
        return a(this.A, ((f) obj).A);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return Float.compare(this.A, ((f) obj).A) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.A);
    }

    public final String toString() {
        return c(this.A);
    }
}
