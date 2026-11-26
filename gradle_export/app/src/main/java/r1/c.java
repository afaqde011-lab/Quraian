package r1;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public abstract class c extends h00.f implements List, Collection, v00.a {
    public abstract c c(int i10, Object obj);

    @Override
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public abstract c e(Object obj);

    public c h(Collection collection) {
        f fVarI = i();
        fVarI.addAll(collection);
        return fVarI.e();
    }

    public abstract f i();

    @Override
    public final Iterator iterator() {
        return listIterator(0);
    }

    public abstract c k(b bVar);

    public abstract c l(int i10);

    @Override
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public abstract c m(int i10, Object obj);

    @Override
    public final List subList(int i10, int i11) {
        return new q1.a(this, i10, i11);
    }
}
