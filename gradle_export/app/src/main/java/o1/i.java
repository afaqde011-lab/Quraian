package o1;

import java.util.Iterator;

public final class i implements a2.d, Iterable, v00.a {
    public final h A;
    public final int B;
    public final int C;

    public i(h hVar, int i10, int i11) {
        this.A = hVar;
        this.B = i10;
        this.C = i11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return iVar.B == this.B && iVar.C == this.C && kotlin.jvm.internal.m.a(iVar.A, this.A);
    }

    public final int hashCode() {
        return (this.A.hashCode() * 31) + this.B;
    }

    @Override
    public final Iterator iterator() {
        h hVar = this.A;
        if (hVar.H != this.C) {
            j.f();
        }
        int i10 = this.B;
        hVar.m(i10);
        return new d(hVar, i10 + 1, hVar.A[(i10 * 5) + 3] + i10);
    }
}
