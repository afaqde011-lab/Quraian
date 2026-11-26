package a40;

public final class b2 extends v {
    public static final int C = 0;

    static {
        new b2();
    }

    @Override
    public final void n0(k00.i iVar, Runnable runnable) {
        f2 f2Var = (f2) iVar.get(f2.C);
        if (f2Var == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        f2Var.B = true;
    }

    @Override
    public final v q0(int i) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
