package h40;

import f40.s;
import java.util.concurrent.TimeUnit;

public abstract class k {
    public static final String a;
    public static final long b;
    public static final int c;
    public static final int d;
    public static final long e;
    public static final g f;

    static {
        String property;
        int i = s.a;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        a = property;
        b = f40.a.k("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i2 = s.a;
        if (i2 < 2) {
            i2 = 2;
        }
        c = f40.a.l(i2, "kotlinx.coroutines.scheduler.core.pool.size", 8);
        d = f40.a.l(2097150, "kotlinx.coroutines.scheduler.max.pool.size", 4);
        e = TimeUnit.SECONDS.toNanos(f40.a.k("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f = g.a;
    }
}
