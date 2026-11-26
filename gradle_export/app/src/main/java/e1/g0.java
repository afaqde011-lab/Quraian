package e1;

public abstract class g0 {

    public static final float f4962a;

    public static final float f4963b;

    public static final j3.z f4964c = new j3.z("SelectionHandleInfo");

    static {
        float f3 = 25;
        f4962a = f3;
        f4963b = f3;
    }

    public static final long a(long j9) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j9 >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j9 & 4294967295L)) - 1.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }
}
