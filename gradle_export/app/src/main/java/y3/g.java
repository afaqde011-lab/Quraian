package y3;

public final class g {

    public final long f16588a;

    public static final float a(long j9) {
        return Float.intBitsToFloat((int) (j9 >> 32));
    }

    public static final float b(long j9) {
        return Float.intBitsToFloat((int) (j9 & 4294967295L));
    }

    public static String c(long j9) {
        if (j9 == 9205357640488583168L) {
            return "DpOffset.Unspecified";
        }
        return "(" + ((Object) f.c(a(j9))) + ", " + ((Object) f.c(b(j9))) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f16588a == ((g) obj).f16588a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f16588a);
    }

    public final String toString() {
        return c(this.f16588a);
    }
}
