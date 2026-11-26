package a40;

import java.util.concurrent.CancellationException;

public final class q1 extends k00.a implements e1 {
    public static final q1 B = new q1(w.B);

    @Override
    public final Object F(m00.c cVar) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override
    public final o0 O(boolean z, boolean z2, g1 g1Var) {
        return r1.A;
    }

    @Override
    public final boolean a() {
        return true;
    }

    @Override
    public final o0 f0(u00.k kVar) {
        return r1.A;
    }

    @Override
    public final void i(CancellationException cancellationException) {
    }

    @Override
    public final boolean isCancelled() {
        return false;
    }

    @Override
    public final n r(m1 m1Var) {
        return r1.A;
    }

    @Override
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override
    public final CancellationException x() {
        throw new IllegalStateException("This job is always active");
    }
}
