package u;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

public final class d implements Collection {
    public final e A;

    public d(e eVar) {
        this.A = eVar;
    }

    @Override
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void clear() {
        this.A.clear();
    }

    @Override
    public final boolean contains(Object obj) {
        return this.A.a(obj) >= 0;
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
    public final boolean isEmpty() {
        return this.A.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return new a(this.A, 1);
    }

    @Override
    public final boolean remove(Object obj) {
        e eVar = this.A;
        int iA = eVar.a(obj);
        if (iA < 0) {
            return false;
        }
        eVar.h(iA);
        return true;
    }

    @Override
    public final boolean removeAll(Collection collection) {
        e eVar = this.A;
        int i10 = eVar.C;
        int i11 = 0;
        boolean z10 = false;
        while (i11 < i10) {
            if (collection.contains(eVar.j(i11))) {
                eVar.h(i11);
                i11--;
                i10--;
                z10 = true;
            }
            i11++;
        }
        return z10;
    }

    @Override
    public final boolean retainAll(Collection collection) {
        e eVar = this.A;
        int i10 = eVar.C;
        int i11 = 0;
        boolean z10 = false;
        while (i11 < i10) {
            if (!collection.contains(eVar.j(i11))) {
                eVar.h(i11);
                i11--;
                i10--;
                z10 = true;
            }
            i11++;
        }
        return z10;
    }

    @Override
    public final int size() {
        return this.A.C;
    }

    @Override
    public final Object[] toArray() {
        e eVar = this.A;
        int i10 = eVar.C;
        Object[] objArr = new Object[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = eVar.j(i11);
        }
        return objArr;
    }

    @Override
    public final Object[] toArray(Object[] objArr) {
        e eVar = this.A;
        int i10 = eVar.C;
        if (objArr.length < i10) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i10);
        }
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = eVar.j(i11);
        }
        if (objArr.length > i10) {
            objArr[i10] = null;
        }
        return objArr;
    }
}
