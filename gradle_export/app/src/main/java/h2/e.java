package h2;

import a10.h0;

public final class e {

    public final long f6558a;

    public static final boolean a(long j9, long j10) {
        return j9 == j10;
    }

    public static final float b(long j9) {
        return Float.intBitsToFloat((int) (j9 & 4294967295L));
    }

    public static final float c(long j9) {
        return Math.max(Float.intBitsToFloat((int) ((j9 >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j9 & 2147483647L)));
    }

    public static final float d(long j9) {
        return Math.min(Float.intBitsToFloat((int) ((j9 >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j9 & 2147483647L)));
    }

    public static final float e(long j9) {
        return Float.intBitsToFloat((int) (j9 >> 32));
    }

    public static final boolean f(long j9) {
        return (j9 == 9205357640488583168L) | (Float.intBitsToFloat((int) (j9 >> 32)) <= 0.0f) | (Float.intBitsToFloat((int) (j9 & 4294967295L)) <= 0.0f);
    }

    public static final long g(float f3, long j9) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j9 >> 32)) * f3;
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j9 & 4294967295L)) * f3)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static String h(long j9) {
        if (j9 == 9205357640488583168L) {
            return "Size.Unspecified";
        }
        return "Size(" + h0.U(Float.intBitsToFloat((int) (j9 >> 32))) + ", " + h0.U(Float.intBitsToFloat((int) (j9 & 4294967295L))) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f6558a == ((e) obj).f6558a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f6558a);
    }

    public final String toString() {
        return h(this.f6558a);
    }
}
