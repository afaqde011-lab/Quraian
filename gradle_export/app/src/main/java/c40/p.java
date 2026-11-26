package c40;

import a40.e2;
import java.util.concurrent.atomic.AtomicReferenceArray;

public final class p extends f40.q {
    public final h E;
    public final AtomicReferenceArray F;

    public p(long j, p pVar, h hVar, int i) {
        super(j, pVar, i);
        this.E = hVar;
        this.F = new AtomicReferenceArray(j.b * 2);
    }

    @Override
    public final int g() {
        return j.b;
    }

    @Override
    public final void h(int i, k00.i iVar) {
        h hVar;
        int i2 = j.b;
        boolean z = i >= i2;
        if (z) {
            i -= i2;
        }
        this.F.get(i * 2);
        while (true) {
            Object objL = l(i);
            boolean z2 = objL instanceof e2;
            hVar = this.E;
            if (z2 || (objL instanceof x)) {
                if (k(i, objL, z ? j.j : j.k)) {
                    n(i, null);
                    m(i, !z);
                    if (z) {
                        kotlin.jvm.internal.m.b(hVar);
                        return;
                    }
                    return;
                }
            } else {
                if (objL == j.j || objL == j.k) {
                    break;
                }
                if (objL != j.g && objL != j.f) {
                    if (objL == j.i || objL == j.d || objL == j.l) {
                        return;
                    }
                    throw new IllegalStateException(("unexpected state: " + objL).toString());
                }
            }
        }
        n(i, null);
        if (z) {
            kotlin.jvm.internal.m.b(hVar);
        }
    }

    public final boolean k(int i, Object obj, Object obj2) {
        return this.F.compareAndSet((i * 2) + 1, obj, obj2);
    }

    public final Object l(int i) {
        return this.F.get((i * 2) + 1);
    }

    public final void m(int i, boolean z) {
        if (z) {
            h hVar = this.E;
            kotlin.jvm.internal.m.b(hVar);
            hVar.K((this.C * ((long) j.b)) + ((long) i));
        }
        i();
    }

    public final void n(int i, Object obj) {
        this.F.set(i * 2, obj);
    }

    public final void o(int i, Object obj) {
        this.F.set((i * 2) + 1, obj);
    }
}
