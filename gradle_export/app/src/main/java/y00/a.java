package y00;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.internal.m;

public final class a extends x00.a {
    @Override
    public final int c() {
        return ThreadLocalRandom.current().nextInt(80, 200);
    }

    @Override
    public final long e(long j, long j2) {
        return ThreadLocalRandom.current().nextLong(j, j2);
    }

    @Override
    public final Random f() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        m.d(threadLocalRandomCurrent, "current(...)");
        return threadLocalRandomCurrent;
    }
}
