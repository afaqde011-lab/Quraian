package m00;

import a40.k;
import a40.v;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.m;

public abstract class c extends a {
    private final k00.i _context;
    private transient k00.c<Object> intercepted;

    public c(k00.c cVar) {
        this(cVar, cVar != null ? cVar.getContext() : null);
    }

    public c(k00.c cVar, k00.i iVar) {
        super(cVar);
        this._context = iVar;
    }

    @Override
    public k00.i getContext() {
        k00.i iVar = this._context;
        m.b(iVar);
        return iVar;
    }

    public final k00.c<Object> intercepted() {
        k00.c<Object> cVar = this.intercepted;
        if (cVar != null) {
            return cVar;
        }
        k00.e eVar = (k00.e) getContext().get(k00.d.A);
        k00.c<Object> eVar2 = eVar != null ? new f40.e((v) eVar, this) : this;
        this.intercepted = eVar2;
        return eVar2;
    }

    @Override
    public void releaseIntercepted() {
        k00.c<Object> cVar = this.intercepted;
        if (cVar != null && cVar != this) {
            k00.g gVar = getContext().get(k00.d.A);
            m.b(gVar);
            f40.e eVar = (f40.e) cVar;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f40.e.H;
            while (atomicReferenceFieldUpdater.get(eVar) == f40.a.c) {
            }
            Object obj = atomicReferenceFieldUpdater.get(eVar);
            k kVar = obj instanceof k ? (k) obj : null;
            if (kVar != null) {
                kVar.n();
            }
        }
        this.intercepted = b.A;
    }
}
