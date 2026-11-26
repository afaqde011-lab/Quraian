package s30;

public abstract class f {
    public static final long a = System.nanoTime();

    public static long a() {
        return System.nanoTime() - a;
    }
}
