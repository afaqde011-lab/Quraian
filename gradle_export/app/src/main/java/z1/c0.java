package z1;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

public final class c0 implements Iterator, v00.a {
    public final v A;
    public final Iterator B;
    public Object C;
    public Object D;
    public int E;

    public c0(v vVar, Iterator it) {
        this.A = vVar;
        this.B = it;
        this.E = q.g(vVar);
        this.C = this.D;
        this.D = it.hasNext() ? it.next() : null;
    }

    @Override
    public final boolean hasNext() {
        return this.D != null;
    }

    @Override
    public final Object next() {
        if (q.g(this.A) != this.E) {
            throw new ConcurrentModificationException();
        }
        this.C = this.D;
        Iterator it = this.B;
        this.D = it.hasNext() ? it.next() : null;
        Object obj = this.C;
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException();
    }

    @Override
    public final void remove() {
        v vVar = this.A;
        if (q.g(vVar) != this.E) {
            throw new ConcurrentModificationException();
        }
        Object obj = this.C;
        if (obj == null) {
            throw new IllegalStateException();
        }
        vVar.remove(obj);
        this.C = null;
        this.E = q.g(vVar);
    }
}
