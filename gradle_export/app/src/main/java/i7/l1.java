package i7;

public final class l1 {

    public static final l1 f7415c;

    public static final l1 f7416d;

    public static final l1 f7417e;

    public final long f7418a;

    public final long f7419b;

    static {
        l1 l1Var = new l1(0L, 0L);
        f7415c = l1Var;
        new l1(Long.MAX_VALUE, Long.MAX_VALUE);
        f7416d = new l1(Long.MAX_VALUE, 0L);
        new l1(0L, Long.MAX_VALUE);
        f7417e = l1Var;
    }

    public l1(long j9, long j10) {
        ta.c0.s(j9 >= 0);
        ta.c0.s(j10 >= 0);
        this.f7418a = j9;
        this.f7419b = j10;
    }

    public final long a(long j9, long j10, long j11) {
        long j12 = this.f7418a;
        long j13 = this.f7419b;
        if (j12 == 0 && j13 == 0) {
            return j9;
        }
        String str = e7.i0.f5136a;
        long j14 = j9 - j12;
        long j15 = (((j12 ^ j9) > 0L ? 1 : ((j12 ^ j9) == 0L ? 0 : -1)) >= 0) | (((j9 ^ j14) > 0L ? 1 : ((j9 ^ j14) == 0L ? 0 : -1)) >= 0) ? j14 : ((j14 >>> 63) ^ 1) + Long.MAX_VALUE;
        if ((j15 == Long.MIN_VALUE && j14 != Long.MIN_VALUE) || (j15 == Long.MAX_VALUE && j14 != Long.MAX_VALUE)) {
            j15 = Long.MIN_VALUE;
        }
        long jA = e7.i0.a(j9, j13);
        boolean z10 = j15 <= j10 && j10 <= jA;
        boolean z11 = j15 <= j11 && j11 <= jA;
        if (z10 && z11) {
            if (Math.abs(j10 - j9) <= Math.abs(j11 - j9)) {
                return j10;
            }
            return j11;
        }
        if (!z10) {
            if (z11) {
                return j11;
            }
            return j15;
        }
        return j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l1.class == obj.getClass()) {
            l1 l1Var = (l1) obj;
            if (this.f7418a == l1Var.f7418a && this.f7419b == l1Var.f7419b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f7418a) * 31) + ((int) this.f7419b);
    }
}
