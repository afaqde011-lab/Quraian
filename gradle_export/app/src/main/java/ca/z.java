package ca;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

public final class z implements Executor {
    public final int A;
    public final ArrayDeque B;
    public final Executor C;
    public Runnable D;
    public final Object E;

    public z(fi.d dVar) {
        this.A = 2;
        this.E = new Object();
        this.B = new ArrayDeque();
        this.C = dVar;
    }

    public z(Executor executor, int i10) {
        this.A = i10;
        switch (i10) {
            case 1:
                this.C = executor;
                this.B = new ArrayDeque();
                this.E = new Object();
                break;
            default:
                kotlin.jvm.internal.m.e(executor, "executor");
                this.C = executor;
                this.B = new ArrayDeque();
                this.E = new Object();
                break;
        }
    }

    public final void a() {
        switch (this.A) {
            case 0:
                synchronized (this.E) {
                    Object objPoll = this.B.poll();
                    Runnable runnable = (Runnable) objPoll;
                    this.D = runnable;
                    if (objPoll != null) {
                        this.C.execute(runnable);
                    }
                    break;
                }
                return;
            case 1:
                Runnable runnable2 = (Runnable) this.B.poll();
                this.D = runnable2;
                if (runnable2 != null) {
                    this.C.execute(runnable2);
                    return;
                }
                return;
            default:
                synchronized (this.E) {
                    try {
                        Runnable runnable3 = (Runnable) this.B.poll();
                        this.D = runnable3;
                        if (runnable3 != null) {
                            ((fi.d) this.C).execute(runnable3);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return;
        }
    }

    @Override
    public final void execute(Runnable runnable) {
        switch (this.A) {
            case 0:
                kotlin.jvm.internal.m.e(runnable, "command");
                synchronized (this.E) {
                    this.B.offer(new ab.f(runnable, this, 5));
                    if (this.D == null) {
                        a();
                    }
                    break;
                }
                return;
            case 1:
                synchronized (this.E) {
                    try {
                        this.B.add(new kh.r(this, runnable, 8));
                        if (this.D == null) {
                            a();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return;
            default:
                synchronized (this.E) {
                    try {
                        this.B.add(new ji.a(this, runnable, 2));
                        if (this.D == null) {
                            a();
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                    break;
                }
                return;
        }
    }
}
