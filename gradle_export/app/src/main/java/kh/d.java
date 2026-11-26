package kh;

import com.google.android.gms.internal.measurement.g4;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class d extends g4 {

    public final AtomicReferenceFieldUpdater f9669i;

    public final AtomicReferenceFieldUpdater f9670j;

    public final AtomicReferenceFieldUpdater f9671k;
    public final AtomicReferenceFieldUpdater l;
    public final AtomicReferenceFieldUpdater m;

    public d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f9669i = atomicReferenceFieldUpdater;
        this.f9670j = atomicReferenceFieldUpdater2;
        this.f9671k = atomicReferenceFieldUpdater3;
        this.l = atomicReferenceFieldUpdater4;
        this.m = atomicReferenceFieldUpdater5;
    }

    @Override
    public final c H(l lVar) {
        return (c) this.l.getAndSet(lVar, c.f9665d);
    }

    @Override
    public final k I(l lVar) {
        return (k) this.f9671k.getAndSet(lVar, k.f9676c);
    }

    @Override
    public final void Y(k kVar, k kVar2) {
        this.f9670j.lazySet(kVar, kVar2);
    }

    @Override
    public final void Z(k kVar, Thread thread) {
        this.f9669i.lazySet(kVar, thread);
    }

    @Override
    public final boolean s(l lVar, c cVar, c cVar2) {
        return this.l.compareAndSet(lVar, cVar, cVar2);
    }

    @Override
    public final boolean t(l lVar, Object obj, Object obj2) {
        return this.m.compareAndSet(lVar, obj, obj2);
    }

    @Override
    public final boolean u(l lVar, k kVar, k kVar2) {
        return this.f9671k.compareAndSet(lVar, kVar, kVar2);
    }
}
