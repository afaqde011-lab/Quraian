package q30;

import g00.b0;
import java.util.Iterator;
import java.util.NoSuchElementException;
import ri.t1;

public final class k implements Iterator, k00.c, v00.a {
    public int A;
    public Object B;
    public Iterator C;
    public k00.c D;

    public final RuntimeException a() {
        int i = this.A;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.A);
    }

    public final void c(Object obj, k00.c frame) {
        this.B = obj;
        this.A = 3;
        this.D = frame;
        l00.a aVar = l00.a.A;
        kotlin.jvm.internal.m.e(frame, "frame");
    }

    @Override
    public final k00.i getContext() {
        return k00.j.A;
    }

    @Override
    public final boolean hasNext() {
        while (true) {
            int i = this.A;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw a();
                }
                Iterator it = this.C;
                kotlin.jvm.internal.m.b(it);
                if (it.hasNext()) {
                    this.A = 2;
                    return true;
                }
                this.C = null;
            }
            this.A = 5;
            k00.c cVar = this.D;
            kotlin.jvm.internal.m.b(cVar);
            this.D = null;
            cVar.resumeWith(b0.a);
        }
    }

    @Override
    public final Object next() {
        int i = this.A;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i == 2) {
            this.A = 1;
            Iterator it = this.C;
            kotlin.jvm.internal.m.b(it);
            return it.next();
        }
        if (i != 3) {
            throw a();
        }
        this.A = 0;
        Object obj = this.B;
        this.B = null;
        return obj;
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final void resumeWith(Object obj) {
        t1.O(obj);
        this.A = 4;
    }
}
