package y3;

public final class j {

    public final long f16590a;

    public static long a(int i10, int i11, int i12, long j9) {
        if ((i12 & 1) != 0) {
            i10 = (int) (j9 >> 32);
        }
        if ((i12 & 2) != 0) {
            i11 = (int) (j9 & 4294967295L);
        }
        return (((long) i11) & 4294967295L) | (((long) i10) << 32);
    }

    public static final boolean b(long j9, long j10) {
        return j9 == j10;
    }

    public static final long c(long j9, long j10) {
        return (((long) (((int) (j9 >> 32)) - ((int) (j10 >> 32)))) << 32) | (((long) (((int) (j9 & 4294967295L)) - ((int) (j10 & 4294967295L)))) & 4294967295L);
    }

    public static final long d(long j9, long j10) {
        return (((long) (((int) (j9 >> 32)) + ((int) (j10 >> 32)))) << 32) | (((long) (((int) (j9 & 4294967295L)) + ((int) (j10 & 4294967295L)))) & 4294967295L);
    }

    public static String e(long j9) {
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append((int) (j9 >> 32));
        sb2.append(", ");
        return oi.k.l(sb2, (int) (j9 & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f16590a == ((j) obj).f16590a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f16590a);
    }

    public final String toString() {
        return e(this.f16590a);
    }
}
