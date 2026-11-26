package fh;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

public abstract class l extends AbstractCollection {
    public final Object A;
    public Collection B;
    public final l C;
    public final Collection D;
    public final p E;

    public l(p pVar, Object obj, Collection collection, l lVar) {
        this.E = pVar;
        this.A = obj;
        this.B = collection;
        this.C = lVar;
        this.D = lVar == null ? null : lVar.B;
    }

    public final void a() {
        l lVar = this.C;
        if (lVar != null) {
            lVar.a();
        } else {
            this.E.E.put(this.A, this.B);
        }
    }

    @Override
    public final boolean add(Object obj) {
        b();
        boolean zIsEmpty = this.B.isEmpty();
        boolean zAdd = this.B.add(obj);
        if (zAdd) {
            this.E.F++;
            if (zIsEmpty) {
                a();
            }
        }
        return zAdd;
    }

    @Override
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = this.B.addAll(collection);
        if (zAddAll) {
            this.E.F += this.B.size() - size;
            if (size == 0) {
                a();
            }
        }
        return zAddAll;
    }

    public final void b() {
        Collection collection;
        l lVar = this.C;
        if (lVar != null) {
            lVar.b();
            if (lVar.B != this.D) {
                throw new ConcurrentModificationException();
            }
        } else {
            if (!this.B.isEmpty() || (collection = (Collection) this.E.E.get(this.A)) == null) {
                return;
            }
            this.B = collection;
        }
    }

    public final void c() {
        l lVar = this.C;
        if (lVar != null) {
            lVar.c();
        } else if (this.B.isEmpty()) {
            this.E.E.remove(this.A);
        }
    }

    @Override
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.B.clear();
        this.E.F -= size;
        c();
    }

    @Override
    public final boolean contains(Object obj) {
        b();
        return this.B.contains(obj);
    }

    @Override
    public final boolean containsAll(Collection collection) {
        b();
        return this.B.containsAll(collection);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        b();
        return this.B.equals(obj);
    }

    @Override
    public final int hashCode() {
        b();
        return this.B.hashCode();
    }

    @Override
    public final Iterator iterator() {
        b();
        return new d(this);
    }

    @Override
    public final boolean remove(Object obj) {
        b();
        boolean zRemove = this.B.remove(obj);
        if (zRemove) {
            this.E.F--;
            c();
        }
        return zRemove;
    }

    @Override
    public boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zRemoveAll = this.B.removeAll(collection);
        if (zRemoveAll) {
            this.E.F += this.B.size() - size;
            c();
        }
        return zRemoveAll;
    }

    @Override
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean zRetainAll = this.B.retainAll(collection);
        if (zRetainAll) {
            this.E.F += this.B.size() - size;
            c();
        }
        return zRetainAll;
    }

    @Override
    public final int size() {
        b();
        return this.B.size();
    }

    @Override
    public final String toString() {
        b();
        return this.B.toString();
    }
}
