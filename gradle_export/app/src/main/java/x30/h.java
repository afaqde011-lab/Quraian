package x30;

import java.util.Iterator;

public final class h implements Iterator, v00.a {
    public final int A;
    public final t1.d B;

    public h(c cVar, int i) {
        this.A = i;
        switch (i) {
            case 1:
                this.B = new t1.d(cVar.A, cVar.C, 1);
                break;
            case 2:
                this.B = new t1.d(cVar.A, cVar.C, 1);
                break;
            default:
                this.B = new t1.d(cVar.A, cVar.C, 1);
                break;
        }
    }

    @Override
    public final boolean hasNext() {
        switch (this.A) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.B.hasNext();
    }

    @Override
    public final Object next() {
        switch (this.A) {
            case 0:
                t1.d dVar = this.B;
                return new s1.a(dVar.B, dVar.a().a, 2);
            case 1:
                t1.d dVar2 = this.B;
                Object obj = dVar2.B;
                dVar2.a();
                return obj;
            default:
                return this.B.a().a;
        }
    }

    @Override
    public final void remove() {
        switch (this.A) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
