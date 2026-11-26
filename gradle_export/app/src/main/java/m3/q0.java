package m3;

public final class q0 {

    public static final long f10518b = h0.b(0, 0);

    public static final int f10519c = 0;

    public final long f10520a;

    public q0(long j9) {
        this.f10520a = j9;
    }

    public static final boolean a(long j9, long j10) {
        return (g(j9) <= g(j10)) & (f(j10) <= f(j9));
    }

    public static boolean b(Object obj, long j9) {
        return (obj instanceof q0) && j9 == ((q0) obj).f10520a;
    }

    public static final boolean c(long j9, long j10) {
        return j9 == j10;
    }

    public static final boolean d(long j9) {
        return ((int) (j9 >> 32)) == ((int) (j9 & 4294967295L));
    }

    public static final int e(long j9) {
        return f(j9) - g(j9);
    }

    public static final int f(long j9) {
        return Math.max((int) (j9 >> 32), (int) (j9 & 4294967295L));
    }

    public static final int g(long j9) {
        return Math.min((int) (j9 >> 32), (int) (j9 & 4294967295L));
    }

    public static final boolean h(long j9) {
        return ((int) (j9 >> 32)) > ((int) (j9 & 4294967295L));
    }

    public static String i(long j9) {
        StringBuilder sb2 = new StringBuilder("TextRange(");
        sb2.append((int) (j9 >> 32));
        sb2.append(", ");
        return oi.k.l(sb2, (int) (j9 & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        return b(obj, this.f10520a);
    }

    public final int hashCode() {
        return Long.hashCode(this.f10520a);
    }

    public final String toString() {
        return i(this.f10520a);
    }
}
