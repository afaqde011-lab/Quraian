package tf;

public final class b1 implements Thread.UncaughtExceptionHandler {

    public final String f14606a;

    public final e1 f14607b;

    public b1(e1 e1Var, String str) {
        this.f14607b = e1Var;
        this.f14606a = str;
    }

    @Override
    public final synchronized void uncaughtException(Thread thread, Throwable th2) {
        q0 q0Var = ((h1) this.f14607b.B).F;
        h1.g(q0Var);
        q0Var.G.c(th2, this.f14606a);
    }
}
