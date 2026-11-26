package fh;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public class n extends l implements List {
    public final p F;

    public n(p pVar, Object obj, List list, l lVar) {
        super(pVar, obj, list, lVar);
        this.F = pVar;
    }

    @Override
    public final void add(int i10, Object obj) {
        b();
        boolean zIsEmpty = this.B.isEmpty();
        ((List) this.B).add(i10, obj);
        this.F.F++;
        if (zIsEmpty) {
            a();
        }
    }

    @Override
    public final boolean addAll(int i10, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = ((List) this.B).addAll(i10, collection);
        if (zAddAll) {
            this.F.F += this.B.size() - size;
            if (size == 0) {
                a();
            }
        }
        return zAddAll;
    }

    @Override
    public final Object get(int i10) {
        b();
        return ((List) this.B).get(i10);
    }

    @Override
    public final int indexOf(Object obj) {
        b();
        return ((List) this.B).indexOf(obj);
    }

    @Override
    public final int lastIndexOf(Object obj) {
        b();
        return ((List) this.B).lastIndexOf(obj);
    }

    @Override
    public final ListIterator listIterator() {
        b();
        return new m(this);
    }

    @Override
    public final ListIterator listIterator(int i10) {
        b();
        return new m(this, i10);
    }

    @Override
    public final Object remove(int i10) {
        b();
        Object objRemove = ((List) this.B).remove(i10);
        this.F.F--;
        c();
        return objRemove;
    }

    @Override
    public final Object set(int i10, Object obj) {
        b();
        return ((List) this.B).set(i10, obj);
    }

    @Override
    public final List subList(int i10, int i11) {
        b();
        List listSubList = ((List) this.B).subList(i10, i11);
        l lVar = this.C;
        if (lVar == null) {
            lVar = this;
        }
        boolean z10 = listSubList instanceof RandomAccess;
        p pVar = this.F;
        Object obj = this.A;
        return z10 ? new i(pVar, obj, listSubList, lVar) : new n(pVar, obj, listSubList, lVar);
    }
}
