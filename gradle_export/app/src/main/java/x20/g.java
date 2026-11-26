package x20;

import java.util.ArrayList;

public final class g extends q20.k {
    public final ArrayList c;
    public final h d;

    public g(ArrayList arrayList, h hVar) {
        this.c = arrayList;
        this.d = hVar;
    }

    @Override
    public final void b(j10.c fakeOverride) {
        kotlin.jvm.internal.m.e(fakeOverride, "fakeOverride");
        q20.j.r(fakeOverride, null);
        this.c.add(fakeOverride);
    }

    @Override
    public final void d(j10.c cVar, j10.c fromCurrent) {
        kotlin.jvm.internal.m.e(fromCurrent, "fromCurrent");
        throw new IllegalStateException(("Conflict in scope of " + this.d.b + ": " + cVar + " vs " + fromCurrent).toString());
    }
}
