package z00;

import java.util.Iterator;

public final class g implements b, Iterable, v00.a {
    public final long A;
    public final long B;
    public final long C;

    public g(long j, long j2) {
        this.A = j;
        if (j < j2) {
            long j3 = j2 % 1;
            long j4 = j % 1;
            long j5 = ((j3 < 0 ? j3 + 1 : j3) - (j4 < 0 ? j4 + 1 : j4)) % 1;
            j2 -= j5 < 0 ? j5 + 1 : j5;
        }
        this.B = j2;
        this.C = 1L;
    }

    @Override
    public final Comparable a() {
        return Long.valueOf(this.A);
    }

    @Override
    public final Comparable c() {
        return Long.valueOf(this.B);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        if (isEmpty() && ((g) obj).isEmpty()) {
            return true;
        }
        g gVar = (g) obj;
        return this.A == gVar.A && this.B == gVar.B;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j = this.A;
        long j2 = ((long) 31) * (j ^ (j >>> 32));
        long j3 = this.B;
        return (int) (j2 + (j3 ^ (j3 >>> 32)));
    }

    @Override
    public final boolean isEmpty() {
        return this.A > this.B;
    }

    @Override
    public final Iterator iterator() {
        return new f(this.A, this.B, this.C);
    }

    public final String toString() {
        return this.A + ".." + this.B;
    }
}
