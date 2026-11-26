package nf;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

public final class b0 extends u {
    public static final b0 G;
    public final transient o F;

    static {
        k kVar = o.B;
        G = new b0(z.E, x.B);
    }

    public b0(o oVar, Comparator comparator) {
        super(comparator);
        this.F = oVar;
    }

    @Override
    public final int a(Object[] objArr) {
        return this.F.a(objArr);
    }

    @Override
    public final int b() {
        return this.F.b();
    }

    @Override
    public final int c() {
        return this.F.c();
    }

    @Override
    public final Object ceiling(Object obj) {
        int iR = r(obj, true);
        o oVar = this.F;
        if (iR == oVar.size()) {
            return null;
        }
        return oVar.get(iR);
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.F, obj, this.D) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    @Override
    public final boolean containsAll(Collection collection) {
        if (collection instanceof w) {
            collection = ((w) collection).zza();
        }
        Comparator comparator = this.D;
        if (!b.i(comparator, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        k kVarListIterator = this.F.listIterator(0);
        Iterator it = collection.iterator();
        if (kVarListIterator.hasNext()) {
            Object next = it.next();
            Object next2 = kVarListIterator.next();
            while (true) {
                try {
                    int iCompare = comparator.compare(next2, next);
                    if (iCompare >= 0) {
                        if (iCompare != 0) {
                            break;
                        }
                        if (!it.hasNext()) {
                            return true;
                        }
                        next = it.next();
                    } else {
                        if (!kVarListIterator.hasNext()) {
                            break;
                        }
                        next2 = kVarListIterator.next();
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
        }
        return false;
    }

    @Override
    public final Iterator descendingIterator() {
        return this.F.i().listIterator(0);
    }

    @Override
    public final f0 e() {
        return this.F.listIterator(0);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            o oVar = this.F;
            if (oVar.size() == set.size()) {
                if (isEmpty()) {
                    return true;
                }
                Comparator comparator = this.D;
                if (!b.i(comparator, set)) {
                    return containsAll(set);
                }
                Iterator it = set.iterator();
                try {
                    k kVarListIterator = oVar.listIterator(0);
                    while (kVarListIterator.hasNext()) {
                        Object next = kVarListIterator.next();
                        Object next2 = it.next();
                        if (next2 == null || comparator.compare(next, next2) != 0) {
                        }
                    }
                    return true;
                } catch (ClassCastException | NoSuchElementException unused) {
                }
            }
        }
        return false;
    }

    @Override
    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.F.get(0);
    }

    @Override
    public final Object floor(Object obj) {
        int iQ = q(obj, true) - 1;
        if (iQ == -1) {
            return null;
        }
        return this.F.get(iQ);
    }

    @Override
    public final Object[] h() {
        return this.F.h();
    }

    @Override
    public final Object higher(Object obj) {
        int iR = r(obj, false);
        o oVar = this.F;
        if (iR == oVar.size()) {
            return null;
        }
        return oVar.get(iR);
    }

    @Override
    public final Iterator iterator() {
        return this.F.listIterator(0);
    }

    @Override
    public final o l() {
        return this.F;
    }

    @Override
    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        o oVar = this.F;
        return oVar.get(oVar.size() - 1);
    }

    @Override
    public final Object lower(Object obj) {
        int iQ = q(obj, false) - 1;
        if (iQ == -1) {
            return null;
        }
        return this.F.get(iQ);
    }

    public final int q(Object obj, boolean z10) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.F, obj, this.D);
        if (iBinarySearch >= 0) {
            return z10 ? iBinarySearch + 1 : iBinarySearch;
        }
        return ~iBinarySearch;
    }

    public final int r(Object obj, boolean z10) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.F, obj, this.D);
        if (iBinarySearch >= 0) {
            return z10 ? iBinarySearch : iBinarySearch + 1;
        }
        return ~iBinarySearch;
    }

    public final b0 s(int i10, int i11) {
        o oVar = this.F;
        if (i10 == 0) {
            if (i11 == oVar.size()) {
                return this;
            }
            i10 = 0;
        }
        Comparator comparator = this.D;
        return i10 < i11 ? new b0(oVar.subList(i10, i11), comparator) : u.p(comparator);
    }

    @Override
    public final int size() {
        return this.F.size();
    }
}
