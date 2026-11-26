package h00;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class b0 implements Iterator, v00.a {
    public final int A = 0;
    public final Iterator B;
    public int C;

    public b0(Iterator iterator) {
        kotlin.jvm.internal.m.e(iterator, "iterator");
        this.B = iterator;
    }

    public b0(q30.b bVar) {
        this.B = bVar.b.iterator();
        this.C = bVar.c;
    }

    public b0(q30.b bVar, byte b) {
        this.C = bVar.c;
        this.B = bVar.b.iterator();
    }

    @Override
    public final boolean hasNext() {
        Iterator it;
        switch (this.A) {
            case 0:
                return this.B.hasNext();
            case 1:
                break;
            default:
                return this.C > 0 && this.B.hasNext();
        }
        while (true) {
            int i = this.C;
            it = this.B;
            if (i > 0 && it.hasNext()) {
                it.next();
                this.C--;
            }
        }
        return it.hasNext();
    }

    @Override
    public final Object next() {
        Iterator it;
        switch (this.A) {
            case 0:
                int i = this.C;
                this.C = i + 1;
                if (i >= 0) {
                    return new a0(i, this.B.next());
                }
                va.a.k0();
                throw null;
            case 1:
                break;
            default:
                int i2 = this.C;
                if (i2 == 0) {
                    throw new NoSuchElementException();
                }
                this.C = i2 - 1;
                return this.B.next();
        }
        while (true) {
            int i3 = this.C;
            it = this.B;
            if (i3 > 0 && it.hasNext()) {
                it.next();
                this.C--;
            }
        }
        return it.next();
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
