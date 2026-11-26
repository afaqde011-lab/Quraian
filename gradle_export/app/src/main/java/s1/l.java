package s1;

import java.util.Iterator;

public abstract class l implements Iterator, v00.a {
    public final int A;
    public Object[] B;
    public int C;
    public int D;

    public l(int i10) {
        this.A = i10;
        switch (i10) {
            case 1:
                this.B = w30.k.e.d;
                break;
            default:
                this.B = k.f13620e.f13624d;
                break;
        }
    }

    public void a(Object[] objArr, int i10, int i11) {
        this.B = objArr;
        this.C = i10;
        this.D = i11;
    }

    @Override
    public final boolean hasNext() {
        switch (this.A) {
            case 0:
                return this.D < this.C;
            default:
                return this.D < this.C;
        }
    }

    @Override
    public final void remove() {
        switch (this.A) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
