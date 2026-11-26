package a40;

public abstract class x1 {
    public static final ThreadLocal a = new ThreadLocal();

    public static w0 a() {
        ThreadLocal threadLocal = a;
        w0 w0Var = (w0) threadLocal.get();
        if (w0Var != null) {
            return w0Var;
        }
        g gVar = new g(Thread.currentThread());
        threadLocal.set(gVar);
        return gVar;
    }
}
