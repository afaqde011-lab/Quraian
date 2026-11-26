package m7;

import e7.i0;
import java.math.RoundingMode;
import java.util.List;

public abstract class n extends s {

    public final long f10619d;

    public final long f10620e;

    public final List f10621f;

    public final long f10622g;

    public final long f10623h;

    public final long f10624i;

    public n(j jVar, long j9, long j10, long j11, long j12, List list, long j13, long j14, long j15) {
        super(jVar, j9, j10);
        this.f10619d = j11;
        this.f10620e = j12;
        this.f10621f = list;
        this.f10624i = j13;
        this.f10622g = j14;
        this.f10623h = j15;
    }

    public final long b(long j9, long j10) {
        long jD = d(j9);
        return jD != -1 ? jD : (int) (f((j10 - this.f10623h) + this.f10624i, j9) - c(j9, j10));
    }

    public final long c(long j9, long j10) {
        long jD = d(j9);
        long j11 = this.f10619d;
        if (jD == -1) {
            long j12 = this.f10622g;
            if (j12 != -9223372036854775807L) {
                return Math.max(j11, f((j10 - this.f10623h) - j12, j9));
            }
        }
        return j11;
    }

    public abstract long d(long j9);

    public final long e(long j9, long j10) {
        long j11 = this.f10633b;
        long j12 = this.f10619d;
        List list = this.f10621f;
        if (list != null) {
            return (((q) list.get((int) (j9 - j12))).f10629b * 1000000) / j11;
        }
        long jD = d(j10);
        return (jD == -1 || j9 != (j12 + jD) - 1) ? (this.f10620e * 1000000) / j11 : j10 - g(j9);
    }

    public final long f(long j9, long j10) {
        long jD = d(j10);
        long j11 = this.f10619d;
        if (jD != 0) {
            if (this.f10621f != null) {
                long j12 = (jD + j11) - 1;
                long j13 = j11;
                while (j13 <= j12) {
                    long j14 = ((j12 - j13) / 2) + j13;
                    long jG = g(j14);
                    if (jG < j9) {
                        j13 = j14 + 1;
                    } else {
                        if (jG <= j9) {
                            return j14;
                        }
                        j12 = j14 - 1;
                    }
                }
                return j13 == j11 ? j13 : j12;
            }
            long j15 = (j9 / ((this.f10620e * 1000000) / this.f10633b)) + j11;
            if (j15 >= j11) {
                return jD == -1 ? j15 : Math.min(j15, (j11 + jD) - 1);
            }
        }
        return j11;
    }

    public final long g(long j9) {
        long j10 = this.f10619d;
        List list = this.f10621f;
        long j11 = list != null ? ((q) list.get((int) (j9 - j10))).f10628a - this.f10634c : (j9 - j10) * this.f10620e;
        String str = i0.f5136a;
        return i0.Q(j11, 1000000L, this.f10633b, RoundingMode.DOWN);
    }

    public abstract j h(k kVar, long j9);

    public boolean i() {
        return this.f10621f != null;
    }
}
