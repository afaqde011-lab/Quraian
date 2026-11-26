package fh;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

public final class o2 extends n2 implements SortedSet {
    @Override
    public final Comparator comparator() {
        return ((SortedSet) this.A).comparator();
    }

    @Override
    public final Object first() {
        Iterator it = this.A.iterator();
        it.getClass();
        eh.n nVar = this.B;
        nVar.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (nVar.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @Override
    public final SortedSet headSet(Object obj) {
        return new o2(((SortedSet) this.A).headSet(obj), this.B);
    }

    @Override
    public final Object last() {
        SortedSet sortedSetHeadSet = (SortedSet) this.A;
        while (true) {
            Object objLast = sortedSetHeadSet.last();
            if (this.B.apply(objLast)) {
                return objLast;
            }
            sortedSetHeadSet = sortedSetHeadSet.headSet(objLast);
        }
    }

    @Override
    public final SortedSet subSet(Object obj, Object obj2) {
        return new o2(((SortedSet) this.A).subSet(obj, obj2), this.B);
    }

    @Override
    public final SortedSet tailSet(Object obj) {
        return new o2(((SortedSet) this.A).tailSet(obj), this.B);
    }
}
