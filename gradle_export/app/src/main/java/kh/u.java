package kh;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

public final class u extends AbstractOwnableSynchronizer implements Runnable {
    public final c0 A;

    public u(c0 c0Var) {
        this.A = c0Var;
    }

    public static void a(u uVar, Thread thread) {
        uVar.setExclusiveOwnerThread(thread);
    }

    @Override
    public final void run() {
    }

    public final String toString() {
        return this.A.toString();
    }
}
