package fh;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

public class d implements Iterator {
    public final int A = 0;
    public final Iterator B;
    public Object C;
    public final Object D;

    public d(e eVar) {
        this.D = eVar;
        this.B = eVar.C.entrySet().iterator();
    }

    public d(f fVar, Iterator it) {
        this.B = it;
        this.D = fVar;
    }

    public d(l lVar) {
        this.D = lVar;
        Collection collection = lVar.B;
        this.C = collection;
        this.B = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    public d(n nVar, ListIterator listIterator) {
        this.D = nVar;
        this.C = nVar.B;
        this.B = listIterator;
    }

    public void a() {
        l lVar = (l) this.D;
        lVar.b();
        if (lVar.B != ((Collection) this.C)) {
            throw new ConcurrentModificationException();
        }
    }

    @Override
    public final boolean hasNext() {
        switch (this.A) {
            case 0:
                break;
            case 1:
                break;
            default:
                a();
                break;
        }
        return this.B.hasNext();
    }

    @Override
    public final Object next() {
        switch (this.A) {
            case 0:
                Map.Entry entry = (Map.Entry) this.B.next();
                this.C = (Collection) entry.getValue();
                return ((e) this.D).a(entry);
            case 1:
                Map.Entry entry2 = (Map.Entry) this.B.next();
                this.C = entry2;
                return entry2.getKey();
            default:
                a();
                return this.B.next();
        }
    }

    @Override
    public final void remove() {
        switch (this.A) {
            case 0:
                ta.c0.z("no calls to next() since the last call to remove()", ((Collection) this.C) != null);
                this.B.remove();
                ((e) this.D).D.F -= ((Collection) this.C).size();
                ((Collection) this.C).clear();
                this.C = null;
                break;
            case 1:
                ta.c0.z("no calls to next() since the last call to remove()", ((Map.Entry) this.C) != null);
                Collection collection = (Collection) ((Map.Entry) this.C).getValue();
                this.B.remove();
                ((f) this.D).B.F -= collection.size();
                collection.clear();
                this.C = null;
                break;
            default:
                this.B.remove();
                l lVar = (l) this.D;
                lVar.E.F--;
                lVar.c();
                break;
        }
    }
}
