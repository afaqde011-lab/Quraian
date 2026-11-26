package j40;

import a1.w;
import a40.e2;
import eh.l;
import f40.q;
import g00.b0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.DispatchException;
import u00.o;

public final class b implements a40.j, e2 {
    public final a40.k A;
    public final c B;

    public b(c cVar, a40.k kVar) {
        this.B = cVar;
        this.A = kVar;
    }

    @Override
    public final void b(q qVar, int i) {
        this.A.b(qVar, i);
    }

    @Override
    public final void e(Object obj, o oVar) throws DispatchException {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.H;
        c cVar = this.B;
        atomicReferenceFieldUpdater.set(cVar, null);
        h00.a aVar = new h00.a(cVar, this, 8);
        a40.k kVar = this.A;
        kVar.C(b0.a, kVar.C, new w(aVar, 2));
    }

    @Override
    public final l g(Object obj, o oVar) {
        c cVar = this.B;
        o wVar = new w(cVar, this);
        l lVarF = this.A.F((b0) obj, wVar);
        if (lVarF != null) {
            c.H.set(cVar, null);
        }
        return lVarF;
    }

    @Override
    public final k00.i getContext() {
        return this.A.E;
    }

    @Override
    public final boolean h(Throwable th) {
        return this.A.h(th);
    }

    @Override
    public final void resumeWith(Object obj) {
        this.A.resumeWith(obj);
    }

    @Override
    public final void s(Object obj) throws DispatchException {
        this.A.s(obj);
    }
}
