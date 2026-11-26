package xf;

import com.google.android.gms.internal.play_billing.r0;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;
import kh.r;

public final class l implements m, e, d, b {
    public final int A;
    public final Executor B;
    public final Object C;
    public final Object D;

    public l(Executor executor, b bVar) {
        this.A = 0;
        this.C = new Object();
        this.B = executor;
        this.D = bVar;
    }

    public l(Executor executor, c cVar) {
        this.A = 1;
        this.C = new Object();
        this.B = executor;
        this.D = cVar;
    }

    public l(Executor executor, d dVar) {
        this.A = 2;
        this.C = new Object();
        this.B = executor;
        this.D = dVar;
    }

    public l(Executor executor, e eVar) {
        this.A = 3;
        this.C = new Object();
        this.B = executor;
        this.D = eVar;
    }

    public l(Executor executor, f fVar, n nVar) {
        this.A = 4;
        this.B = executor;
        this.C = fVar;
        this.D = nVar;
    }

    @Override
    public final void a(Task task) {
        switch (this.A) {
            case 0:
                if (task.m()) {
                    synchronized (this.C) {
                        try {
                            if (((b) this.D) != null) {
                                this.B.execute(new k(this, 0));
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return;
                }
                return;
            case 1:
                synchronized (this.C) {
                    break;
                }
                this.B.execute(new r0(25, this, task, false));
                return;
            case 2:
                if (task.o() || task.m()) {
                    return;
                }
                synchronized (this.C) {
                    try {
                        if (((d) this.D) != null) {
                            this.B.execute(new r(26, this, task, false));
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return;
            case 3:
                if (task.o()) {
                    synchronized (this.C) {
                        try {
                            if (((e) this.D) != null) {
                                this.B.execute(new r0(26, this, task, false));
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                    return;
                }
                return;
            default:
                this.B.execute(new r(27, this, task, false));
                return;
        }
    }

    @Override
    public void f() {
        ((n) this.D).t();
    }

    @Override
    public void onFailure(Exception exc) {
        ((n) this.D).s(exc);
    }

    @Override
    public void onSuccess(Object obj) {
        ((n) this.D).q(obj);
    }
}
