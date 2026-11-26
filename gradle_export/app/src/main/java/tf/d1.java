package tf;

import android.os.Process;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import java.util.concurrent.BlockingQueue;

public final class d1 extends Thread {
    public final Object A;
    public final BlockingQueue B;
    public boolean C = false;
    public final e1 D;

    public d1(e1 e1Var, String str, BlockingQueue blockingQueue) {
        this.D = e1Var;
        com.google.android.gms.common.internal.d0.h(blockingQueue);
        this.A = new Object();
        this.B = blockingQueue;
        setName(str);
    }

    public final void a() {
        e1 e1Var = this.D;
        synchronized (e1Var.J) {
            try {
                if (!this.C) {
                    e1Var.K.release();
                    e1Var.J.notifyAll();
                    if (this == e1Var.D) {
                        e1Var.D = null;
                    } else if (this == e1Var.E) {
                        e1Var.E = null;
                    } else {
                        q0 q0Var = ((h1) e1Var.B).F;
                        h1.g(q0Var);
                        q0Var.G.b("Current scheduler thread is neither worker nor network");
                    }
                    this.C = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void run() {
        boolean z10 = false;
        while (!z10) {
            try {
                this.D.K.acquire();
                z10 = true;
            } catch (InterruptedException e3) {
                q0 q0Var = ((h1) this.D.B).F;
                h1.g(q0Var);
                q0Var.J.c(e3, String.valueOf(getName()).concat(" was interrupted"));
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                BlockingQueue blockingQueue = this.B;
                c1 c1Var = (c1) blockingQueue.poll();
                if (c1Var != null) {
                    Process.setThreadPriority(true != c1Var.B ? 10 : threadPriority);
                    c1Var.run();
                } else {
                    Object obj = this.A;
                    synchronized (obj) {
                        if (blockingQueue.peek() == null) {
                            this.D.getClass();
                            try {
                                obj.wait(NotificationOptions.SKIP_STEP_THIRTY_SECONDS_IN_MS);
                            } catch (InterruptedException e10) {
                                q0 q0Var2 = ((h1) this.D.B).F;
                                h1.g(q0Var2);
                                q0Var2.J.c(e10, String.valueOf(getName()).concat(" was interrupted"));
                            }
                        }
                    }
                    synchronized (this.D.J) {
                        if (this.B.peek() == null) {
                            a();
                            a();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            a();
            throw th2;
        }
    }
}
