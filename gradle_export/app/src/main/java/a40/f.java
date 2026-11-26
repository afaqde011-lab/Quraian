package a40;

import java.util.concurrent.locks.LockSupport;

public final class f extends a {
    public final Thread D;
    public final w0 E;

    public f(k00.i iVar, Thread thread, w0 w0Var) {
        super(iVar, true);
        this.D = thread;
        this.E = w0Var;
    }

    @Override
    public final void n(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.D;
        if (kotlin.jvm.internal.m.a(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
