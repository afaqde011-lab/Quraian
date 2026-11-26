package j40;

import f40.q;
import java.util.concurrent.atomic.AtomicReferenceArray;

public final class k extends q {
    public final AtomicReferenceArray E;

    public k(long j, k kVar, int i) {
        super(j, kVar, i);
        this.E = new AtomicReferenceArray(j.f);
    }

    @Override
    public final int g() {
        return j.f;
    }

    @Override
    public final void h(int i, k00.i iVar) {
        this.E.set(i, j.e);
        i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.C + ", hashCode=" + hashCode() + ']';
    }
}
