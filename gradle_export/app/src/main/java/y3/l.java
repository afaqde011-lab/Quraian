package y3;

public final class l {

    public final long f16596a;

    public static boolean a(Object obj, long j9) {
        return (obj instanceof l) && j9 == ((l) obj).f16596a;
    }

    public static final boolean b(long j9, long j10) {
        return j9 == j10;
    }

    public static String c(long j9) {
        return ((int) (j9 >> 32)) + " x " + ((int) (j9 & 4294967295L));
    }

    public final boolean equals(Object obj) {
        return a(obj, this.f16596a);
    }

    public final int hashCode() {
        return Long.hashCode(this.f16596a);
    }

    public final String toString() {
        return c(this.f16596a);
    }
}
