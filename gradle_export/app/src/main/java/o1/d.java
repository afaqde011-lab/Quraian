package o1;

import java.util.Iterator;

public final class d implements Iterator, v00.a {
    public final h A;
    public final int B;
    public int C;
    public final int D;

    public d(h hVar, int i10, int i11) {
        this.A = hVar;
        this.B = i11;
        this.C = i10;
        this.D = hVar.H;
        if (hVar.G) {
            j.f();
        }
    }

    @Override
    public final boolean hasNext() {
        return this.C < this.B;
    }

    @Override
    public final Object next() {
        h hVar = this.A;
        int i10 = hVar.H;
        int i11 = this.D;
        if (i10 != i11) {
            j.f();
        }
        int i12 = this.C;
        this.C = hVar.A[(i12 * 5) + 3] + i12;
        return new i(hVar, i12, i11);
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
