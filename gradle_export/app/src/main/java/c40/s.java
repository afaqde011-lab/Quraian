package c40;

import a40.c0;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.JobCancellationException;

public final class s extends a40.a implements t, l {
    public final h D;

    public s(k00.i iVar, h hVar) {
        super(iVar, true);
        this.D = hVar;
    }

    @Override
    public final h7.b b() {
        return this.D.b();
    }

    @Override
    public final Object c() {
        return this.D.c();
    }

    @Override
    public final Object d(e40.k kVar) {
        h hVar = this.D;
        hVar.getClass();
        Object objD = h.D(hVar, kVar);
        l00.a aVar = l00.a.A;
        return objD;
    }

    @Override
    public final boolean f(Throwable th) {
        return this.D.l(th, false);
    }

    @Override
    public final void h0(Throwable th, boolean z) {
        if (this.D.l(th, false) || z) {
            return;
        }
        c0.t(th, this.C);
    }

    @Override
    public final void i(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(w(), null, this);
        }
        t(cancellationException);
    }

    @Override
    public final void i0(Object obj) {
        this.D.f(null);
    }

    @Override
    public final c iterator() {
        h hVar = this.D;
        hVar.getClass();
        return new c(hVar);
    }

    @Override
    public final Object j(Object obj) {
        return this.D.j(obj);
    }

    @Override
    public final Object k(k00.c cVar) {
        return this.D.k(cVar);
    }

    public final void k0(a20.d dVar) throws InvocationTargetException {
        eh.l lVar;
        h hVar = this.D;
        hVar.getClass();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h.J;
        if (atomicReferenceFieldUpdater.compareAndSet(hVar, null, dVar)) {
            return;
        }
        do {
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            lVar = j.q;
            if (obj != lVar) {
                if (obj == j.r) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked");
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
        } while (!atomicReferenceFieldUpdater.compareAndSet(hVar, lVar, j.r));
        dVar.invoke(hVar.r());
    }

    @Override
    public final Object m(Object obj, k00.c cVar) {
        return this.D.m(obj, cVar);
    }

    @Override
    public final void t(CancellationException cancellationException) {
        this.D.l(cancellationException, true);
        q(cancellationException);
    }
}
