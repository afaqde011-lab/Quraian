package u;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public final class l0 implements v00.f, Set, v00.a {
    public final j0 A;
    public final j0 B;

    public l0(j0 j0Var) {
        this.A = j0Var;
        this.B = j0Var;
    }

    @Override
    public final boolean add(Object obj) {
        return this.B.a(obj);
    }

    @Override
    public final boolean addAll(Collection collection) {
        kotlin.jvm.internal.m.e(collection, "elements");
        j0 j0Var = this.B;
        int i10 = j0Var.f14867d;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            j0Var.j(it.next());
        }
        return i10 != j0Var.f14867d;
    }

    @Override
    public final void clear() {
        this.B.b();
    }

    @Override
    public final boolean contains(Object obj) {
        return this.A.c(obj);
    }

    @Override
    public final boolean containsAll(Collection collection) {
        kotlin.jvm.internal.m.e(collection, "elements");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.A.c(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l0.class != obj.getClass()) {
            return false;
        }
        return kotlin.jvm.internal.m.a(this.A, ((l0) obj).A);
    }

    @Override
    public final int hashCode() {
        return this.A.hashCode();
    }

    @Override
    public final boolean isEmpty() {
        return this.A.g();
    }

    @Override
    public final Iterator iterator() {
        return new q30.h(this);
    }

    @Override
    public final boolean remove(Object obj) {
        return this.B.l(obj);
    }

    @Override
    public final boolean removeAll(Collection collection) {
        kotlin.jvm.internal.m.e(collection, "elements");
        j0 j0Var = this.B;
        j0Var.getClass();
        int i10 = j0Var.f14867d;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            j0Var.i(it.next());
        }
        return i10 != j0Var.f14867d;
    }

    @Override
    public final boolean retainAll(Collection collection) {
        kotlin.jvm.internal.m.e(collection, "elements");
        j0 j0Var = this.B;
        j0Var.getClass();
        Object[] objArr = j0Var.f14865b;
        int i10 = j0Var.f14867d;
        long[] jArr = j0Var.f14864a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j9 = jArr[i11];
                if ((((~j9) << 7) & j9 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i11 != length) {
                        break;
                        break;
                    }
                    i11++;
                } else {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j9) < 128) {
                            int i14 = (i11 << 3) + i13;
                            if (!h00.q.F0(collection, objArr[i14])) {
                                j0Var.m(i14);
                            }
                        }
                        j9 >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    }
                    if (i11 != length) {
                        break;
                    }
                    i11++;
                }
            }
        }
        return i10 != j0Var.f14867d;
    }

    @Override
    public final int size() {
        return this.A.f14867d;
    }

    @Override
    public final Object[] toArray() {
        return kotlin.jvm.internal.l.b(this);
    }

    @Override
    public final Object[] toArray(Object[] objArr) {
        kotlin.jvm.internal.m.e(objArr, "array");
        return kotlin.jvm.internal.l.c(this, objArr);
    }

    public final String toString() {
        return this.A.toString();
    }
}
