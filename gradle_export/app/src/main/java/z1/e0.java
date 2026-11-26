package z1;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import l1.n1;

public final class e0 implements List, v00.c {
    public final p A;
    public final int B;
    public int C;
    public int D;

    public e0(p pVar, int i10, int i11) {
        this.A = pVar;
        this.B = i10;
        this.C = q.j(pVar);
        this.D = i11 - i10;
    }

    public final void a() {
        if (q.j(this.A) != this.C) {
            throw new ConcurrentModificationException();
        }
    }

    @Override
    public final void add(int i10, Object obj) {
        a();
        int i11 = this.B + i10;
        p pVar = this.A;
        pVar.add(i11, obj);
        this.D++;
        this.C = q.j(pVar);
    }

    @Override
    public final boolean add(Object obj) {
        a();
        int i10 = this.B + this.D;
        p pVar = this.A;
        pVar.add(i10, obj);
        this.D++;
        this.C = q.j(pVar);
        return true;
    }

    @Override
    public final boolean addAll(int i10, Collection collection) {
        a();
        int i11 = i10 + this.B;
        p pVar = this.A;
        boolean zAddAll = pVar.addAll(i11, collection);
        if (zAddAll) {
            this.D = collection.size() + this.D;
            this.C = q.j(pVar);
        }
        return zAddAll;
    }

    @Override
    public final boolean addAll(Collection collection) {
        return addAll(this.D, collection);
    }

    @Override
    public final void clear() {
        if (this.D > 0) {
            a();
            int i10 = this.D;
            int i11 = this.B;
            p pVar = this.A;
            pVar.h(i11, i10 + i11);
            this.D = 0;
            this.C = q.j(pVar);
        }
    }

    @Override
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
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

    @Override
    public final Object get(int i10) {
        a();
        q.a(i10, this.D);
        return this.A.get(this.B + i10);
    }

    @Override
    public final int indexOf(Object obj) {
        a();
        int i10 = this.D;
        int i11 = this.B;
        z00.d it = ab.a0.I0(i11, i10 + i11).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            if (kotlin.jvm.internal.m.a(obj, this.A.get(iNextInt))) {
                return iNextInt - i11;
            }
        }
        return -1;
    }

    @Override
    public final boolean isEmpty() {
        return this.D == 0;
    }

    @Override
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override
    public final int lastIndexOf(Object obj) {
        a();
        int i10 = this.D;
        int i11 = this.B;
        for (int i12 = (i10 + i11) - 1; i12 >= i11; i12--) {
            if (kotlin.jvm.internal.m.a(obj, this.A.get(i12))) {
                return i12 - i11;
            }
        }
        return -1;
    }

    @Override
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override
    public final ListIterator listIterator(int i10) {
        a();
        kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
        xVar.A = i10 - 1;
        return new h00.e0(xVar, this);
    }

    @Override
    public final Object remove(int i10) {
        a();
        int i11 = this.B + i10;
        p pVar = this.A;
        Object objRemove = pVar.remove(i11);
        this.D--;
        this.C = q.j(pVar);
        return objRemove;
    }

    @Override
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z10 = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z10) {
                    z10 = true;
                }
            }
            return z10;
        }
    }

    @Override
    public final boolean retainAll(Collection collection) {
        int i10;
        r1.c cVar;
        f fVarJ;
        boolean zB;
        a();
        p pVar = this.A;
        int i11 = this.B;
        int i12 = this.D + i11;
        int size = pVar.size();
        do {
            synchronized (q.f17048a) {
                w wVar = pVar.A;
                kotlin.jvm.internal.m.c(wVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                w wVar2 = (w) l.h(wVar);
                i10 = wVar2.f17075d;
                cVar = wVar2.f17074c;
            }
            kotlin.jvm.internal.m.b(cVar);
            ?? I = cVar.i();
            I.subList(i11, i12).retainAll(collection);
            r1.c cVarE = I.e();
            if (kotlin.jvm.internal.m.a(cVarE, cVar)) {
                break;
            }
            w wVar3 = pVar.A;
            kotlin.jvm.internal.m.c(wVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (l.f17038c) {
                fVarJ = l.j();
                zB = q.b((w) l.w(wVar3, pVar, fVarJ), i10, cVarE, true);
            }
            l.n(fVarJ, pVar);
        } while (!zB);
        int size2 = size - pVar.size();
        if (size2 > 0) {
            this.C = q.j(this.A);
            this.D -= size2;
        }
        return size2 > 0;
    }

    @Override
    public final Object set(int i10, Object obj) {
        q.a(i10, this.D);
        a();
        int i11 = i10 + this.B;
        p pVar = this.A;
        Object obj2 = pVar.set(i11, obj);
        this.C = q.j(pVar);
        return obj2;
    }

    @Override
    public final int size() {
        return this.D;
    }

    @Override
    public final List subList(int i10, int i11) {
        if (!(i10 >= 0 && i10 <= i11 && i11 <= this.D)) {
            n1.a("fromIndex or toIndex are out of bounds");
        }
        a();
        int i12 = this.B;
        return new e0(this.A, i10 + i12, i11 + i12);
    }

    @Override
    public final Object[] toArray() {
        return kotlin.jvm.internal.l.b(this);
    }

    @Override
    public final Object[] toArray(Object[] objArr) {
        return kotlin.jvm.internal.l.c(this, objArr);
    }
}
