package k3;

public abstract class a {

    public static final long f8928a = (((long) 1023) << 50) ^ (-1);

    public static final long f8929b = (-1) ^ (((long) 33554431) << 25);

    public static final long f8930c;

    static {
        long j9 = 33554431;
        f8930c = j9 | (((long) Math.min(0, 1023)) << 50) | (j9 << 25);
    }
}
