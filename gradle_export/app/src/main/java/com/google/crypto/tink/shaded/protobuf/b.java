package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

public abstract class b extends AbstractList implements a0 {
    public boolean A = true;

    public final void a() {
        if (!this.A) {
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public boolean add(Object obj) {
        a();
        return super.add(obj);
    }

    @Override
    public boolean addAll(int i10, Collection collection) {
        a();
        return super.addAll(i10, collection);
    }

    @Override
    public boolean addAll(Collection collection) {
        a();
        return super.addAll(collection);
    }

    @Override
    public void clear() {
        a();
        super.clear();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i10 = 0; i10 < size; i10++) {
            if (!get(i10).equals(list.get(i10))) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i10 = 0; i10 < size; i10++) {
            iHashCode = (iHashCode * 31) + get(i10).hashCode();
        }
        return iHashCode;
    }

    @Override
    public abstract Object remove(int i10);

    @Override
    public final boolean remove(Object obj) {
        a();
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override
    public final boolean removeAll(Collection collection) {
        a();
        return super.removeAll(collection);
    }

    @Override
    public final boolean retainAll(Collection collection) {
        a();
        return super.retainAll(collection);
    }
}
