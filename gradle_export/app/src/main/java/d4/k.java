package d4;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kh.v;

public final class k implements v {
    public final WeakReference A;
    public final j B = new j(this);

    public k(h hVar) {
        this.A = new WeakReference(hVar);
    }

    @Override
    public final void a(Runnable runnable, Executor executor) {
        this.B.a(runnable, executor);
    }

    @Override
    public final boolean cancel(boolean z10) {
        h hVar = (h) this.A.get();
        boolean zCancel = this.B.cancel(z10);
        if (zCancel && hVar != null) {
            hVar.f4609a = null;
            hVar.f4610b = null;
            hVar.f4611c.k(null);
        }
        return zCancel;
    }

    @Override
    public final Object get() {
        return this.B.get();
    }

    @Override
    public final Object get(long j9, TimeUnit timeUnit) {
        return this.B.get(j9, timeUnit);
    }

    @Override
    public final boolean isCancelled() {
        return this.B.A instanceof a;
    }

    @Override
    public final boolean isDone() {
        return this.B.isDone();
    }

    public final String toString() {
        return this.B.toString();
    }
}
