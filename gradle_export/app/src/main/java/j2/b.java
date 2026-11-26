package j2;

public abstract class b {

    public static final long f7855a;

    public static final long f7856b;

    public static final long f7857c;

    public static final long f7858d;

    public static final int f7859e = 0;

    static {
        long j9 = 3;
        long j10 = j9 << 32;
        f7855a = (((long) 0) & 4294967295L) | j10;
        f7856b = (((long) 1) & 4294967295L) | j10;
        f7857c = j10 | (((long) 2) & 4294967295L);
        f7858d = (j9 & 4294967295L) | (((long) 4) << 32);
    }

    public static final boolean a(long j9, long j10) {
        return j9 == j10;
    }

    public static String b(long j9) {
        if (a(j9, f7855a)) {
            return "Rgb";
        }
        if (a(j9, f7856b)) {
            return "Xyz";
        }
        if (a(j9, f7857c)) {
            return "Lab";
        }
        return a(j9, f7858d) ? "Cmyk" : "Unknown";
    }
}
