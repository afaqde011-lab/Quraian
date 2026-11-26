package fh;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

public final class b implements Iterator {
    public final Iterator A;
    public Object B = null;
    public Collection C = null;
    public Iterator D = j1.A;
    public final p E;
    public final int F;

    public b(p pVar, int i10) {
        this.F = i10;
        this.E = pVar;
        this.A = pVar.E.entrySet().iterator();
    }

    @Override
    public final boolean hasNext() {
        return this.A.hasNext() || this.D.hasNext();
    }

    @Override
    public final Object next() {
        if (!this.D.hasNext()) {
            Map.Entry entry = (Map.Entry) this.A.next();
            this.B = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.C = collection;
            this.D = collection.iterator();
        }
        Object obj = this.B;
        Object next = this.D.next();
        switch (this.F) {
            case 0:
                return next;
            default:
                return new p0(obj, next);
        }
    }

    @Override
    public final void remove() {
        this.D.remove();
        Collection collection = this.C;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.A.remove();
        }
        this.E.F--;
    }
}
