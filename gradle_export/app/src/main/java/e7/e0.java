package e7;

import java.math.RoundingMode;

public final class e0 {

    public long f5124a;

    public long f5125b;

    public long f5126c;

    public final ThreadLocal f5127d = new ThreadLocal();

    public e0(long j9) {
        e(j9);
    }

    public final synchronized long a(long j9) {
        long j10;
        if (j9 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            synchronized (this) {
                if (!(this.f5125b != -9223372036854775807L)) {
                    long jLongValue = this.f5124a;
                    if (jLongValue == 9223372036854775806L) {
                        Long l = (Long) this.f5127d.get();
                        l.getClass();
                        jLongValue = l.longValue();
                    }
                    this.f5125b = jLongValue - j9;
                    notifyAll();
                }
                this.f5126c = j9;
                j10 = j9 + this.f5125b;
            }
            return j10;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized long b(long j9) {
        if (j9 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j10 = this.f5126c;
            if (j10 != -9223372036854775807L) {
                String str = i0.f5136a;
                long jQ = i0.Q(j10, 90000L, 1000000L, RoundingMode.DOWN);
                long j11 = (4294967296L + jQ) / 8589934592L;
                long j12 = ((j11 - 1) * 8589934592L) + j9;
                long j13 = (j11 * 8589934592L) + j9;
                j9 = Math.abs(j12 - jQ) < Math.abs(j13 - jQ) ? j12 : j13;
            }
            long j14 = j9;
            String str2 = i0.f5136a;
            return a(i0.Q(j14, 1000000L, 90000L, RoundingMode.DOWN));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized long c(long j9) {
        if (j9 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j10 = this.f5126c;
            if (j10 != -9223372036854775807L) {
                String str = i0.f5136a;
                long jQ = i0.Q(j10, 90000L, 1000000L, RoundingMode.DOWN);
                long j11 = jQ / 8589934592L;
                long j12 = (j11 * 8589934592L) + j9;
                j9 = j12 >= jQ ? j12 : ((j11 + 1) * 8589934592L) + j9;
            }
            long j13 = j9;
            String str2 = i0.f5136a;
            return a(i0.Q(j13, 1000000L, 90000L, RoundingMode.DOWN));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized long d() {
        long j9;
        j9 = this.f5124a;
        if (j9 == Long.MAX_VALUE || j9 == 9223372036854775806L) {
            j9 = -9223372036854775807L;
        }
        return j9;
    }

    public final synchronized void e(long j9) {
        this.f5124a = j9;
        this.f5125b = j9 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f5126c = -9223372036854775807L;
    }
}
