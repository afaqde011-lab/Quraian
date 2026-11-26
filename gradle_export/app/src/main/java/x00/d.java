package x00;

public abstract class d {
    public static final c A = new c();
    public static final a B;

    static {
        Integer num = q00.a.a;
        B = (num == null || num.intValue() >= 34) ? new y00.a() : new b();
    }

    public abstract int a(int i);

    public abstract int b();

    public int c() {
        int iB;
        int i;
        do {
            iB = b() >>> 1;
            i = iB % 120;
        } while ((iB - i) + 119 < 0);
        return 80 + i;
    }

    public abstract long d();

    public long e(long j, long j2) {
        long jD;
        long j3;
        long jA;
        int iB;
        if (j2 <= j) {
            throw new IllegalArgumentException(("Random range is empty: [" + Long.valueOf(j) + ", " + Long.valueOf(j2) + ").").toString());
        }
        long j4 = j2 - j;
        if (j4 > 0) {
            if (((-j4) & j4) == j4) {
                int i = (int) j4;
                int i2 = (int) (j4 >>> 32);
                if (i != 0) {
                    iB = a(31 - Integer.numberOfLeadingZeros(i));
                } else if (i2 == 1) {
                    iB = b();
                } else {
                    jA = (((long) a(31 - Integer.numberOfLeadingZeros(i2))) << 32) + (((long) b()) & 4294967295L);
                }
                jA = ((long) iB) & 4294967295L;
            } else {
                do {
                    jD = d() >>> 1;
                    j3 = jD % j4;
                } while ((j4 - 1) + (jD - j3) < 0);
                jA = j3;
            }
            return j + jA;
        }
        while (true) {
            long jD2 = d();
            if (j <= jD2 && jD2 < j2) {
                return jD2;
            }
        }
    }
}
