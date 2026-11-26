package u;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public final class b implements Set {
    public final e A;

    public b(e eVar) {
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
        return this.A.containsKey(obj);
    }

    @Override
    public final boolean containsAll(Collection collection) {
        return this.A.k(collection);
    }

    @Override
    public final boolean equals(Object obj) {
        e eVar = this.A;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        try {
            return eVar.C == set.size() && eVar.k(set);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override
    public final int hashCode() {
        e eVar = this.A;
        int iHashCode = 0;
        for (int i10 = eVar.C - 1; i10 >= 0; i10--) {
            Object objG = eVar.g(i10);
            iHashCode += objG == null ? 0 : objG.hashCode();
        }
        return iHashCode;
    }

    @Override
    public final boolean isEmpty() {
        return this.A.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return new a(this.A, 0);
    }

    @Override
    public final boolean remove(Object obj) {
        e eVar = this.A;
        int iE = eVar.e(obj);
        if (iE < 0) {
            return false;
        }
        eVar.h(iE);
        return true;
    }

    @Override
    public final boolean removeAll(Collection collection) {
        return this.A.l(collection);
    }

    @Override
    public final boolean retainAll(Collection collection) {
        return this.A.m(collection);
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
            objArr[i11] = eVar.g(i11);
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
            objArr[i11] = eVar.g(i11);
        }
        if (objArr.length > i10) {
            objArr[i10] = null;
        }
        return objArr;
    }
}
