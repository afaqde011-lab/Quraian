package y3;

public final class o {

    public static final p[] f16598b = {new p(0), new p(4294967296L), new p(8589934592L)};

    public static final long f16599c = kh.o.F(Float.NaN, 0);

    public final long f16600a;

    public o(long j9) {
        this.f16600a = j9;
    }

    public static final boolean a(long j9, long j10) {
        return j9 == j10;
    }

    public static final long b(long j9) {
        return f16598b[(int) ((j9 & 1095216660480L) >>> 32)].f16601a;
    }

    public static final float c(long j9) {
        return Float.intBitsToFloat((int) (j9 & 4294967295L));
    }

    public static String d(long j9) {
        long jB = b(j9);
        if (p.a(jB, 0L)) {
            return "Unspecified";
        }
        if (p.a(jB, 4294967296L)) {
            return c(j9) + ".sp";
        }
        if (!p.a(jB, 8589934592L)) {
            return "Invalid";
        }
        return c(j9) + ".em";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return this.f16600a == ((o) obj).f16600a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f16600a);
    }

    public final String toString() {
        return d(this.f16600a);
    }
}
