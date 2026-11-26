package i2;

public final class w0 {

    public static final long f7175b = b0.h(0.5f, 0.5f);

    public static final int f7176c = 0;

    public final long f7177a;

    public static final boolean a(long j9, long j10) {
        return j9 == j10;
    }

    public static final float b(long j9) {
        return Float.intBitsToFloat((int) (j9 >> 32));
    }

    public static final float c(long j9) {
        return Float.intBitsToFloat((int) (j9 & 4294967295L));
    }

    public static String d(long j9) {
        return "TransformOrigin(packedValue=" + j9 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w0) {
            return this.f7177a == ((w0) obj).f7177a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f7177a);
    }

    public final String toString() {
        return d(this.f7177a);
    }
}
