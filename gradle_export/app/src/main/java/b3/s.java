package b3;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

public final class s implements List, v00.a {
    public final u.d0 A = new u.d0(16);
    public final u.y B = new u.y(16);
    public int C = -1;

    public final long a() {
        long jA = m.a(Float.POSITIVE_INFINITY, false, false);
        int i10 = this.C + 1;
        int iM = va.a.M(this);
        if (i10 > iM) {
            return jA;
        }
        while (true) {
            u.y yVar = this.B;
            if (i10 < 0) {
                yVar.getClass();
                break;
            }
            if (i10 >= yVar.f14912b) {
                break;
            }
            long j9 = yVar.f14911a[i10];
            if (m.g(j9, jA) < 0) {
                jA = j9;
            }
            if ((m.l(jA) < 0.0f && m.q(jA)) || i10 == iM) {
                return jA;
            }
            i10++;
        }
        v.a.d("Index must be between 0 and size");
        throw null;
    }

    @Override
    public final void add(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void c(int i10, int i11) {
        if (i10 >= i11) {
            return;
        }
        this.A.l(i10, i11);
        u.y yVar = this.B;
        if (i10 >= 0) {
            int i12 = yVar.f14912b;
            if (i10 <= i12 && i11 >= 0 && i11 <= i12) {
                if (i11 < i10) {
                    v.a.c("The end index must be < start index");
                    throw null;
                }
                if (i11 != i10) {
                    if (i11 < i12) {
                        long[] jArr = yVar.f14911a;
                        h00.n.t0(jArr, jArr, i10, i11, i12);
                    }
                    yVar.f14912b -= i11 - i10;
                    return;
                }
                return;
            }
        } else {
            yVar.getClass();
        }
        v.a.d("Index must be between 0 and size");
        throw null;
    }

    @Override
    public final void clear() {
        this.C = -1;
        this.A.d();
        this.B.f14912b = 0;
    }

    @Override
    public final boolean contains(Object obj) {
        return (obj instanceof b2.q) && indexOf((b2.q) obj) != -1;
    }

    @Override
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((b2.q) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final Object get(int i10) {
        Object objF = this.A.f(i10);
        kotlin.jvm.internal.m.c(objF, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (b2.q) objF;
    }

    @Override
    public final int indexOf(Object obj) {
        if (!(obj instanceof b2.q)) {
            return -1;
        }
        b2.q qVar = (b2.q) obj;
        int iM = va.a.M(this);
        if (iM >= 0) {
            int i10 = 0;
            while (!kotlin.jvm.internal.m.a(this.A.f(i10), qVar)) {
                if (i10 != iM) {
                    i10++;
                }
            }
            return i10;
        }
        return -1;
    }

    @Override
    public final boolean isEmpty() {
        return this.A.h();
    }

    @Override
    public final Iterator iterator() {
        return new q(this, 0, 7);
    }

    @Override
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof b2.q)) {
            return -1;
        }
        b2.q qVar = (b2.q) obj;
        for (int iM = va.a.M(this); -1 < iM; iM--) {
            if (kotlin.jvm.internal.m.a(this.A.f(iM), qVar)) {
                return iM;
            }
        }
        return -1;
    }

    @Override
    public final ListIterator listIterator() {
        return new q(this, 0, 7);
    }

    @Override
    public final ListIterator listIterator(int i10) {
        return new q(this, i10, 6);
    }

    @Override
    public final Object remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final Object set(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final int size() {
        return this.A.f14838b;
    }

    @Override
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final List subList(int i10, int i11) {
        return new r(this, i10, i11);
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
