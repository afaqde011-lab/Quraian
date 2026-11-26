package u;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
import ri.t1;

public final class u0 implements Collection, v00.a {
    public final int A = 1;
    public final Object B;

    public u0() {
        int i10 = p0.f14884a;
        this.B = new f0(6);
    }

    public u0(i0 i0Var) {
        kotlin.jvm.internal.m.e(i0Var, "parent");
        this.B = i0Var;
    }

    @Override
    public final boolean add(Object obj) {
        switch (this.A) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                return ((f0) this.B).a(obj);
        }
    }

    @Override
    public final boolean addAll(Collection collection) {
        switch (this.A) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override
    public final void clear() {
        switch (this.A) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                ((f0) this.B).b();
                return;
        }
    }

    @Override
    public final boolean contains(Object obj) {
        switch (this.A) {
            case 0:
                return ((i0) this.B).d(obj);
            default:
                return ((f0) this.B).c(obj);
        }
    }

    @Override
    public final boolean containsAll(Collection collection) {
        switch (this.A) {
            case 0:
                kotlin.jvm.internal.m.e(collection, "elements");
                Collection collection2 = collection;
                if (collection2.isEmpty()) {
                    return true;
                }
                Iterator it = collection2.iterator();
                while (it.hasNext()) {
                    if (!((i0) this.B).d(it.next())) {
                        return false;
                    }
                }
                return true;
            default:
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!((f0) this.B).c(it2.next())) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override
    public final boolean isEmpty() {
        switch (this.A) {
            case 0:
                return ((i0) this.B).i();
            default:
                return ((f0) this.B).f14852g == 0;
        }
    }

    @Override
    public final Iterator iterator() {
        switch (this.A) {
            case 0:
                return t1.F(new m1.g(this, null, 3));
            default:
                f0 f0Var = (f0) this.B;
                f0Var.getClass();
                return new q30.h(new h0(f0Var));
        }
    }

    @Override
    public final boolean remove(Object obj) {
        switch (this.A) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                return ((f0) this.B).g(obj);
        }
    }

    @Override
    public final boolean removeAll(Collection collection) {
        switch (this.A) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                return ((f0) this.B).g(collection);
        }
    }

    @Override
    public final boolean removeIf(Predicate predicate) {
        switch (this.A) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override
    public final boolean retainAll(Collection collection) {
        switch (this.A) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                return ((f0) this.B).i(collection);
        }
    }

    @Override
    public final int size() {
        switch (this.A) {
            case 0:
                return ((i0) this.B).f14860e;
            default:
                return ((f0) this.B).f14852g;
        }
    }

    @Override
    public final Object[] toArray() {
        switch (this.A) {
            case 0:
                break;
        }
        return kotlin.jvm.internal.l.b(this);
    }

    @Override
    public final Object[] toArray(Object[] objArr) {
        switch (this.A) {
            case 0:
                kotlin.jvm.internal.m.e(objArr, "array");
                break;
        }
        return kotlin.jvm.internal.l.c(this, objArr);
    }
}
