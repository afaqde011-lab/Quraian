package xf;

import com.google.android.gms.common.internal.d0;
import com.google.android.gms.internal.measurement.f4;
import com.google.android.gms.tasks.DuplicateTaskCompletionException;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

public final class n extends Task {

    public final Object f16568a = new Object();

    public final f4 f16569b = new f4(10);

    public boolean f16570c;

    public volatile boolean f16571d;

    public Object f16572e;

    public Exception f16573f;

    @Override
    public final void a(Executor executor, b bVar) {
        this.f16569b.m(new l(executor, bVar));
        v();
    }

    @Override
    public final Task b(c cVar) {
        this.f16569b.m(new l(h.f16566a, cVar));
        v();
        return this;
    }

    @Override
    public final void c(Executor executor, c cVar) {
        this.f16569b.m(new l(executor, cVar));
        v();
    }

    @Override
    public final n d(Executor executor, d dVar) {
        this.f16569b.m(new l(executor, dVar));
        v();
        return this;
    }

    @Override
    public final n e(d dVar) {
        d(h.f16566a, dVar);
        return this;
    }

    @Override
    public final n f(Executor executor, e eVar) {
        this.f16569b.m(new l(executor, eVar));
        v();
        return this;
    }

    @Override
    public final n g(e eVar) {
        f(h.f16566a, eVar);
        return this;
    }

    @Override
    public final Task h(Executor executor, a aVar) {
        n nVar = new n();
        this.f16569b.m(new j(executor, aVar, nVar, 0));
        v();
        return nVar;
    }

    @Override
    public final Task i(Executor executor, a aVar) {
        n nVar = new n();
        this.f16569b.m(new j(executor, aVar, nVar, 1));
        v();
        return nVar;
    }

    @Override
    public final Exception j() {
        Exception exc;
        synchronized (this.f16568a) {
            exc = this.f16573f;
        }
        return exc;
    }

    @Override
    public final Object k() {
        Object obj;
        synchronized (this.f16568a) {
            try {
                d0.j("Task is not yet complete", this.f16570c);
                if (this.f16571d) {
                    throw new CancellationException("Task is already canceled.");
                }
                Exception exc = this.f16573f;
                if (exc != null) {
                    throw new RuntimeExecutionException(exc);
                }
                obj = this.f16572e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }

    @Override
    public final Object l() {
        Object obj;
        synchronized (this.f16568a) {
            try {
                d0.j("Task is not yet complete", this.f16570c);
                if (this.f16571d) {
                    throw new CancellationException("Task is already canceled.");
                }
                if (IOException.class.isInstance(this.f16573f)) {
                    throw ((Throwable) IOException.class.cast(this.f16573f));
                }
                Exception exc = this.f16573f;
                if (exc != null) {
                    throw new RuntimeExecutionException(exc);
                }
                obj = this.f16572e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }

    @Override
    public final boolean m() {
        return this.f16571d;
    }

    @Override
    public final boolean n() {
        boolean z10;
        synchronized (this.f16568a) {
            z10 = this.f16570c;
        }
        return z10;
    }

    @Override
    public final boolean o() {
        boolean z10;
        synchronized (this.f16568a) {
            try {
                z10 = false;
                if (this.f16570c && !this.f16571d && this.f16573f == null) {
                    z10 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @Override
    public final Task p(Executor executor, f fVar) {
        n nVar = new n();
        this.f16569b.m(new l(executor, fVar, nVar));
        v();
        return nVar;
    }

    public final void q(Object obj) {
        synchronized (this.f16568a) {
            u();
            this.f16570c = true;
            this.f16572e = obj;
        }
        this.f16569b.o(this);
    }

    public final boolean r(Object obj) {
        synchronized (this.f16568a) {
            try {
                if (this.f16570c) {
                    return false;
                }
                this.f16570c = true;
                this.f16572e = obj;
                this.f16569b.o(this);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void s(Exception exc) {
        d0.i(exc, "Exception must not be null");
        synchronized (this.f16568a) {
            u();
            this.f16570c = true;
            this.f16573f = exc;
        }
        this.f16569b.o(this);
    }

    public final void t() {
        synchronized (this.f16568a) {
            try {
                if (this.f16570c) {
                    return;
                }
                this.f16570c = true;
                this.f16571d = true;
                this.f16569b.o(this);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void u() {
        String strConcat;
        if (this.f16570c) {
            int i10 = DuplicateTaskCompletionException.A;
            if (!n()) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception excJ = j();
            if (excJ != null) {
                strConcat = "failure";
            } else if (o()) {
                strConcat = "result ".concat(String.valueOf(k()));
            } else {
                strConcat = this.f16571d ? "cancellation" : "unknown issue";
            }
        }
    }

    public final void v() {
        synchronized (this.f16568a) {
            try {
                if (this.f16570c) {
                    this.f16569b.o(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
