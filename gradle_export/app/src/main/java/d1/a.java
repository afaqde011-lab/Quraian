package d1;

public abstract class a {

    public static final long f4533a = a(Float.NaN, Float.NaN);

    public static final int f4534b = 0;

    public static long a(float f3, float f10) {
        return (((long) Float.floatToRawIntBits(f10)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
    }

    public static String b(long j9) {
        return "InlineDensity(density=" + Float.intBitsToFloat((int) (j9 >> 32)) + ", fontScale=" + Float.intBitsToFloat((int) (j9 & 4294967295L)) + ')';
    }
}
