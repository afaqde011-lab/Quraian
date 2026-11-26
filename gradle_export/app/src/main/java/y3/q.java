package y3;

public final class q {

    public final long f16602a;

    public static long a(float f3, float f10, int i10, long j9) {
        if ((i10 & 1) != 0) {
            f3 = Float.intBitsToFloat((int) (j9 >> 32));
        }
        if ((i10 & 2) != 0) {
            f10 = Float.intBitsToFloat((int) (j9 & 4294967295L));
        }
        return (((long) Float.floatToRawIntBits(f10)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
    }

    public static final float b(long j9) {
        return Float.intBitsToFloat((int) (j9 >> 32));
    }

    public static final float c(long j9) {
        return Float.intBitsToFloat((int) (j9 & 4294967295L));
    }

    public static final long d(long j9, long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j9 >> 32)) - Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j9 & 4294967295L)) - Float.intBitsToFloat((int) (j10 & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    public static final long e(long j9, long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) + Float.intBitsToFloat((int) (j9 >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 & 4294967295L)) + Float.intBitsToFloat((int) (j9 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static final long f(float f3, long j9) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j9 >> 32)) * f3;
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j9 & 4294967295L)) * f3)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static String g(long j9) {
        return "(" + b(j9) + ", " + c(j9) + ") px/sec";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q) {
            return this.f16602a == ((q) obj).f16602a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f16602a);
    }

    public final String toString() {
        return g(this.f16602a);
    }
}
