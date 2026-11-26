package y3;

public final class h {

    public final long f16589a;

    public static final float a(long j9) {
        return Float.intBitsToFloat((int) (j9 & 4294967295L));
    }

    public static final float b(long j9) {
        return Float.intBitsToFloat((int) (j9 >> 32));
    }

    public static String c(long j9) {
        if (j9 == 9205357640488583168L) {
            return "DpSize.Unspecified";
        }
        return ((Object) f.c(b(j9))) + " x " + ((Object) f.c(a(j9)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f16589a == ((h) obj).f16589a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f16589a);
    }

    public final String toString() {
        return c(this.f16589a);
    }
}
