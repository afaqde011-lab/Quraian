package s30;

import kotlin.jvm.internal.m;

public abstract class g implements Comparable {
    public static long a(long j) {
        long jA = f.a();
        d unit = d.NANOSECONDS;
        m.e(unit, "unit");
        return (1 | (j - 1)) == Long.MAX_VALUE ? b.k(f50.c.L(j)) : f50.c.U(jA, j, unit);
    }
}
