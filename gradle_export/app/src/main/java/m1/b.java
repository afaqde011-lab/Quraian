package m1;

import h00.n;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;
import oi.k;
import u.d0;
import u.o0;

public final class b implements List, v00.c {
    public final int A;
    public final Object B;

    public b(Object obj, int i10) {
        this.A = i10;
        this.B = obj;
    }

    @Override
    public final void add(int i10, Object obj) {
        int i11;
        switch (this.A) {
            case 0:
                ((e) this.B).a(i10, obj);
                return;
            default:
                d0 d0Var = (d0) this.B;
                if (i10 < 0 || i10 > (i11 = d0Var.f14838b)) {
                    StringBuilder sbQ = k.q("Index ", i10, " must be in 0..");
                    sbQ.append(d0Var.f14838b);
                    v.a.d(sbQ.toString());
                    throw null;
                }
                int i12 = i11 + 1;
                Object[] objArr = d0Var.f14837a;
                if (objArr.length < i12) {
                    d0Var.m(i12, objArr);
                }
                Object[] objArr2 = d0Var.f14837a;
                int i13 = d0Var.f14838b;
                if (i10 != i13) {
                    n.q0(i10 + 1, i10, i13, objArr2, objArr2);
                }
                objArr2[i10] = obj;
                d0Var.f14838b++;
                return;
        }
    }

    @Override
    public final boolean add(Object obj) {
        switch (this.A) {
            case 0:
                ((e) this.B).b(obj);
                break;
            default:
                ((d0) this.B).a(obj);
                break;
        }
        return true;
    }

    @Override
    public final boolean addAll(int i10, Collection collection) {
        switch (this.A) {
            case 0:
                return ((e) this.B).e(i10, collection);
            default:
                m.e(collection, "elements");
                d0 d0Var = (d0) this.B;
                if (i10 < 0 || i10 > d0Var.f14838b) {
                    StringBuilder sbQ = k.q("Index ", i10, " must be in 0..");
                    sbQ.append(d0Var.f14838b);
                    v.a.d(sbQ.toString());
                    throw null;
                }
                int i11 = 0;
                if (collection.isEmpty()) {
                    return false;
                }
                int size = collection.size() + d0Var.f14838b;
                Object[] objArr = d0Var.f14837a;
                if (objArr.length < size) {
                    d0Var.m(size, objArr);
                }
                Object[] objArr2 = d0Var.f14837a;
                if (i10 != d0Var.f14838b) {
                    n.q0(collection.size() + i10, i10, d0Var.f14838b, objArr2, objArr2);
                }
                for (Object obj : collection) {
                    int i12 = i11 + 1;
                    if (i11 < 0) {
                        va.a.k0();
                        throw null;
                    }
                    objArr2[i11 + i10] = obj;
                    i11 = i12;
                }
                d0Var.f14838b = collection.size() + d0Var.f14838b;
                return true;
        }
    }

    @Override
    public final boolean addAll(Collection collection) {
        switch (this.A) {
            case 0:
                e eVar = (e) this.B;
                return eVar.e(eVar.C, collection);
            default:
                m.e(collection, "elements");
                d0 d0Var = (d0) this.B;
                int i10 = d0Var.f14838b;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    d0Var.a(it.next());
                }
                return i10 != d0Var.f14838b;
        }
    }

    @Override
    public final void clear() {
        switch (this.A) {
            case 0:
                ((e) this.B).g();
                break;
            default:
                ((d0) this.B).d();
                break;
        }
    }

    @Override
    public final boolean contains(Object obj) {
        switch (this.A) {
            case 0:
                return ((e) this.B).h(obj);
            default:
                return ((d0) this.B).g(obj) >= 0;
        }
    }

    @Override
    public final boolean containsAll(Collection collection) {
        switch (this.A) {
            case 0:
                e eVar = (e) this.B;
                eVar.getClass();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!eVar.h(it.next())) {
                        return false;
                    }
                }
                return true;
            default:
                m.e(collection, "elements");
                d0 d0Var = (d0) this.B;
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (d0Var.g(it2.next()) < 0) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override
    public final Object get(int i10) {
        switch (this.A) {
            case 0:
                f.a(i10, this);
                return ((e) this.B).A[i10];
            default:
                o0.a(i10, this);
                return ((d0) this.B).f(i10);
        }
    }

    @Override
    public final int indexOf(Object obj) {
        switch (this.A) {
            case 0:
                return ((e) this.B).i(obj);
            default:
                return ((d0) this.B).g(obj);
        }
    }

    @Override
    public final boolean isEmpty() {
        switch (this.A) {
            case 0:
                return ((e) this.B).C == 0;
            default:
                return ((d0) this.B).h();
        }
    }

    @Override
    public final Iterator iterator() {
        switch (this.A) {
            case 0:
                return new d(0, 0, this);
            default:
                return new d(0, 1, this);
        }
    }

    @Override
    public final int lastIndexOf(Object obj) {
        int i10;
        switch (this.A) {
            case 0:
                e eVar = (e) this.B;
                Object[] objArr = eVar.A;
                for (int i11 = eVar.C - 1; i11 >= 0; i11--) {
                    if (m.a(obj, objArr[i11])) {
                        return i11;
                    }
                }
                return -1;
            default:
                d0 d0Var = (d0) this.B;
                if (obj == null) {
                    Object[] objArr2 = d0Var.f14837a;
                    i10 = d0Var.f14838b - 1;
                    while (-1 < i10) {
                        if (objArr2[i10] != null) {
                            i10--;
                        }
                    }
                    return -1;
                }
                Object[] objArr3 = d0Var.f14837a;
                i10 = d0Var.f14838b - 1;
                while (-1 < i10) {
                    if (!obj.equals(objArr3[i10])) {
                        i10--;
                    }
                }
                return -1;
                return i10;
        }
    }

    @Override
    public final ListIterator listIterator() {
        switch (this.A) {
            case 0:
                return new d(0, 0, this);
            default:
                return new d(0, 1, this);
        }
    }

    @Override
    public final ListIterator listIterator(int i10) {
        switch (this.A) {
            case 0:
                return new d(i10, 0, this);
            default:
                return new d(i10, 1, this);
        }
    }

    @Override
    public final Object remove(int i10) {
        switch (this.A) {
            case 0:
                f.a(i10, this);
                return ((e) this.B).k(i10);
            default:
                o0.a(i10, this);
                return ((d0) this.B).k(i10);
        }
    }

    @Override
    public final boolean remove(Object obj) {
        switch (this.A) {
            case 0:
                return ((e) this.B).j(obj);
            default:
                return ((d0) this.B).j(obj);
        }
    }

    @Override
    public final boolean removeAll(Collection collection) {
        switch (this.A) {
            case 0:
                e eVar = (e) this.B;
                eVar.getClass();
                if (!collection.isEmpty()) {
                    int i10 = eVar.C;
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        eVar.j(it.next());
                    }
                    if (i10 != eVar.C) {
                        return true;
                    }
                }
                return false;
            default:
                m.e(collection, "elements");
                d0 d0Var = (d0) this.B;
                d0Var.getClass();
                int i11 = d0Var.f14838b;
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    d0Var.j(it2.next());
                }
                return i11 != d0Var.f14838b;
        }
    }

    @Override
    public final boolean retainAll(Collection collection) {
        switch (this.A) {
            case 0:
                e eVar = (e) this.B;
                int i10 = eVar.C;
                for (int i11 = i10 - 1; -1 < i11; i11--) {
                    if (!collection.contains(eVar.A[i11])) {
                        eVar.k(i11);
                    }
                }
                return i10 != eVar.C;
            default:
                m.e(collection, "elements");
                d0 d0Var = (d0) this.B;
                d0Var.getClass();
                int i12 = d0Var.f14838b;
                Object[] objArr = d0Var.f14837a;
                for (int i13 = i12 - 1; -1 < i13; i13--) {
                    if (!collection.contains(objArr[i13])) {
                        d0Var.k(i13);
                    }
                }
                return i12 != d0Var.f14838b;
        }
    }

    @Override
    public final Object set(int i10, Object obj) {
        switch (this.A) {
            case 0:
                f.a(i10, this);
                Object[] objArr = ((e) this.B).A;
                Object obj2 = objArr[i10];
                objArr[i10] = obj;
                return obj2;
            default:
                o0.a(i10, this);
                return ((d0) this.B).n(i10, obj);
        }
    }

    @Override
    public final int size() {
        switch (this.A) {
            case 0:
                return ((e) this.B).C;
            default:
                return ((d0) this.B).f14838b;
        }
    }

    @Override
    public final List subList(int i10, int i11) {
        switch (this.A) {
            case 0:
                f.b(i10, i11, this);
                return new c(this, i10, i11, 0);
            default:
                o0.b(i10, i11, this);
                return new c(this, i10, i11, 1);
        }
    }

    @Override
    public final Object[] toArray() {
        switch (this.A) {
            case 0:
                break;
        }
        return l.b(this);
    }

    @Override
    public final Object[] toArray(Object[] objArr) {
        switch (this.A) {
            case 0:
                break;
            default:
                m.e(objArr, "array");
                break;
        }
        return l.c(this, objArr);
    }
}
