package d4;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class d extends a.a {

    public final AtomicReferenceFieldUpdater f4601a;

    public final AtomicReferenceFieldUpdater f4602b;

    public final AtomicReferenceFieldUpdater f4603c;

    public final AtomicReferenceFieldUpdater f4604d;

    public final AtomicReferenceFieldUpdater f4605e;

    public d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f4601a = atomicReferenceFieldUpdater;
        this.f4602b = atomicReferenceFieldUpdater2;
        this.f4603c = atomicReferenceFieldUpdater3;
        this.f4604d = atomicReferenceFieldUpdater4;
        this.f4605e = atomicReferenceFieldUpdater5;
    }

    @Override
    public final void V(f fVar, f fVar2) {
        this.f4602b.lazySet(fVar, fVar2);
    }

    @Override
    public final void W(f fVar, Thread thread) {
        this.f4601a.lazySet(fVar, thread);
    }

    @Override
    public final boolean j(g gVar, c cVar, c cVar2) {
        return this.f4604d.compareAndSet(gVar, cVar, cVar2);
    }

    @Override
    public final boolean k(g gVar, Object obj, Object obj2) {
        return this.f4605e.compareAndSet(gVar, obj, obj2);
    }

    @Override
    public final boolean l(g gVar, f fVar, f fVar2) {
        return this.f4603c.compareAndSet(gVar, fVar, fVar2);
    }
}
