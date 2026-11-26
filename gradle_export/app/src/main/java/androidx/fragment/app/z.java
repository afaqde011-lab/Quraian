package androidx.fragment.app;

import java.util.concurrent.atomic.AtomicReference;

public final class z extends h.c {

    public final AtomicReference f862a;

    public z(AtomicReference atomicReference) {
        this.f862a = atomicReference;
    }

    @Override
    public final void a(Object obj, hf.c cVar) {
        h.c cVar2 = (h.c) this.f862a.get();
        if (cVar2 == null) {
            throw new IllegalStateException("Operation cannot be started before fragment is in created state");
        }
        cVar2.a(obj, cVar);
    }
}
