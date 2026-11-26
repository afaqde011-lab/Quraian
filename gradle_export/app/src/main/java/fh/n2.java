package fh;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;

public class n2 extends AbstractCollection implements Set {
    public final Set A;
    public final eh.n B;

    public n2(Set set, eh.n nVar) {
        this.A = set;
        this.B = nVar;
    }

    @Override
    public final boolean add(Object obj) {
        ta.c0.s(this.B.apply(obj));
        return this.A.add(obj);
    }

    @Override
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ta.c0.s(this.B.apply(it.next()));
        }
        return this.A.addAll(collection);
    }

    @Override
    public final void clear() {
        Set set = this.A;
        boolean z10 = set instanceof RandomAccess;
        eh.n nVar = this.B;
        if (!z10 || !(set instanceof List)) {
            Iterator it = set.iterator();
            nVar.getClass();
            while (it.hasNext()) {
                if (nVar.apply(it.next())) {
                    it.remove();
                }
            }
            return;
        }
        List list = (List) set;
        nVar.getClass();
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            Object obj = list.get(i11);
            if (!nVar.apply(obj)) {
                if (i11 > i10) {
                    try {
                        list.set(i10, obj);
                    } catch (IllegalArgumentException unused) {
                        w.v(list, nVar, i10, i11);
                        return;
                    } catch (UnsupportedOperationException unused2) {
                        w.v(list, nVar, i10, i11);
                        return;
                    }
                }
                i10++;
            }
        }
        list.subList(i10, list.size()).clear();
    }

    @Override
    public final boolean contains(Object obj) {
        boolean zContains;
        Set set = this.A;
        set.getClass();
        try {
            zContains = set.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            zContains = false;
        }
        if (zContains) {
            return this.B.apply(obj);
        }
        return false;
    }

    @Override
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean equals(Object obj) {
        return w.k(this, obj);
    }

    @Override
    public final int hashCode() {
        return w.o(this);
    }

    @Override
    public final boolean isEmpty() {
        Iterator it = this.A.iterator();
        eh.n nVar = this.B;
        ta.c0.w(nVar, "predicate");
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            }
            if (nVar.apply(it.next())) {
                break;
            }
            i10++;
        }
        return true ^ (i10 != -1);
    }

    @Override
    public final Iterator iterator() {
        Iterator it = this.A.iterator();
        it.getClass();
        eh.n nVar = this.B;
        nVar.getClass();
        return new g1(it, nVar);
    }

    @Override
    public final boolean remove(Object obj) {
        return contains(obj) && this.A.remove(obj);
    }

    @Override
    public final boolean removeAll(Collection collection) {
        Iterator it = this.A.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.B.apply(next) && collection.contains(next)) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    @Override
    public final boolean retainAll(Collection collection) {
        Iterator it = this.A.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.B.apply(next) && !collection.contains(next)) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    @Override
    public final int size() {
        Iterator it = this.A.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (this.B.apply(it.next())) {
                i10++;
            }
        }
        return i10;
    }

    @Override
    public final Object[] toArray() {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        while (true) {
            g1 g1Var = (g1) it;
            if (!g1Var.hasNext()) {
                return arrayList.toArray();
            }
            arrayList.add(g1Var.next());
        }
    }

    @Override
    public final Object[] toArray(Object[] objArr) {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        while (true) {
            g1 g1Var = (g1) it;
            if (!g1Var.hasNext()) {
                return arrayList.toArray(objArr);
            }
            arrayList.add(g1Var.next());
        }
    }
}
