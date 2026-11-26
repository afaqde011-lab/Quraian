package g1;

public abstract class y5 {

    public static final l1.t f6029a = new l1.t((u00.a) new e00.g(23));

    public static final z5 f6030b;

    public static final z5 f6031c;

    static {
        long j9 = i2.t.f7167g;
        f6030b = new z5(Float.NaN, j9, true);
        f6031c = new z5(Float.NaN, j9, false);
    }

    public static z5 a(float f3, int i10, boolean z10) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            f3 = Float.NaN;
        }
        long j9 = i2.t.f7167g;
        if (y3.f.b(f3, Float.NaN) && i2.t.c(j9, j9)) {
            return z10 ? f6030b : f6031c;
        }
        return new z5(f3, j9, z10);
    }
}
