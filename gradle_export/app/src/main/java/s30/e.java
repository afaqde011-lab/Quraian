package s30;

public final class e {
    public static final e e = new e(true, 4611686018427387903L);
    public final long a;
    public final boolean b;
    public final long c;
    public final long d;

    static {
        new e(false, Long.MAX_VALUE);
    }

    public e(boolean z, long j) {
        this.a = j;
        this.b = z;
        long j2 = 10;
        this.c = j / j2;
        this.d = j % j2;
    }
}
