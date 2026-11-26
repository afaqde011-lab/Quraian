package e1;

import x.r1;

public abstract class h0 {

    public static final x.l f4965a = new x.l(Float.NaN, Float.NaN);

    public static final r1 f4966b = new r1(new bw.b(28), new bw.b(29));

    public static final long f4967c;

    public static final x.b1 f4968d;

    static {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.01f)) << 32) | (((long) Float.floatToRawIntBits(0.01f)) & 4294967295L);
        f4967c = jFloatToRawIntBits;
        f4968d = new x.b1(new h2.b(jFloatToRawIntBits));
    }
}
