package ji;

import com.google.android.gms.common.internal.d0;
import com.google.android.gms.internal.play_billing.r0;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

public final class k implements Executor {
    public static final Logger F = Logger.getLogger(k.class.getName());
    public final Executor A;
    public final ArrayDeque B = new ArrayDeque();
    public int C = 1;
    public long D = 0;
    public final r0 E = new r0(this);

    public k(Executor executor) {
        d0.h(executor);
        this.A = executor;
    }

    @Override
    public final void execute(Runnable runnable) {
        d0.h(runnable);
        synchronized (this.B) {
            int i10 = this.C;
            if (i10 != 4 && i10 != 3) {
                long j9 = this.D;
                j jVar = new j(runnable, 0);
                this.B.add(jVar);
                this.C = 2;
                try {
                    this.A.execute(this.E);
                    if (this.C != 2) {
                        return;
                    }
                    synchronized (this.B) {
                        try {
                            if (this.D == j9 && this.C == 2) {
                                this.C = 3;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e3) {
                    synchronized (this.B) {
                        try {
                            int i11 = this.C;
                            boolean z10 = true;
                            if ((i11 != 1 && i11 != 2) || !this.B.removeLastOccurrence(jVar)) {
                                z10 = false;
                            }
                            if (!(e3 instanceof RejectedExecutionException) || z10) {
                                throw e3;
                            }
                            return;
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            }
            this.B.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.A + "}";
    }
}
