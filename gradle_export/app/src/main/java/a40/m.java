package a40;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.DispatchException;

public final class m extends h1 {
    public final int E;
    public final k F;

    public m(k kVar, int i) {
        this.E = i;
        this.F = kVar;
    }

    @Override
    public final boolean j() {
        switch (this.E) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override
    public final void k(Throwable th) throws DispatchException {
        switch (this.E) {
            case 0:
                m1 m1VarI = i();
                k kVar = this.F;
                Throwable thP = kVar.p(m1VarI);
                if (kVar.y()) {
                    f40.e eVar = (f40.e) kVar.D;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f40.e.H;
                    while (true) {
                        Object obj = atomicReferenceFieldUpdater.get(eVar);
                        eh.l lVar = f40.a.c;
                        if (kotlin.jvm.internal.m.a(obj, lVar)) {
                            if (atomicReferenceFieldUpdater.compareAndSet(eVar, lVar, thP)) {
                                break;
                            }
                        } else if (obj instanceof Throwable) {
                            break;
                        } else if (atomicReferenceFieldUpdater.compareAndSet(eVar, obj, null)) {
                        }
                    }
                }
                kVar.h(thP);
                if (!kVar.y()) {
                    kVar.n();
                }
                break;
            default:
                this.F.resumeWith(g00.b0.a);
                break;
        }
    }
}
