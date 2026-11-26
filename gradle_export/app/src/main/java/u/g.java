package u;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import ri.t1;

public final class g implements Set, v00.a {
    public final int A;
    public final i0 B;

    public g(i0 i0Var, int i10) {
        this.A = i10;
        switch (i10) {
            case 1:
                kotlin.jvm.internal.m.e(i0Var, "parent");
                this.B = i0Var;
                break;
            default:
                kotlin.jvm.internal.m.e(i0Var, "parent");
                this.B = i0Var;
                break;
        }
    }

    @Override
    public final boolean add(Object obj) {
        switch (this.A) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
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
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override
    public final boolean contains(Object obj) {
        switch (this.A) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return kotlin.jvm.internal.m.a(this.B.g(entry.getKey()), entry.getValue());
            default:
                return this.B.c(obj);
        }
    }

    @Override
    public final boolean containsAll(Collection collection) {
        switch (this.A) {
            case 0:
                kotlin.jvm.internal.m.e(collection, "elements");
                Collection<Map.Entry> collection2 = collection;
                if (collection2.isEmpty()) {
                    return true;
                }
                for (Map.Entry entry : collection2) {
                    if (!kotlin.jvm.internal.m.a(this.B.g(entry.getKey()), entry.getValue())) {
                        return false;
                    }
                }
                return true;
            default:
                kotlin.jvm.internal.m.e(collection, "elements");
                Collection collection3 = collection;
                if (collection3.isEmpty()) {
                    return true;
                }
                Iterator it = collection3.iterator();
                while (it.hasNext()) {
                    if (!this.B.c(it.next())) {
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
                break;
        }
        return this.B.i();
    }

    @Override
    public final Iterator iterator() {
        switch (this.A) {
            case 0:
                return t1.F(new m1.g(this, null, 1));
            default:
                return t1.F(new m1.g(this, null, 2));
        }
    }

    @Override
    public final boolean remove(Object obj) {
        switch (this.A) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override
    public final boolean removeAll(Collection collection) {
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
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override
    public final int size() {
        switch (this.A) {
            case 0:
                break;
        }
        return this.B.f14860e;
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
            default:
                kotlin.jvm.internal.m.e(objArr, "array");
                break;
        }
        return kotlin.jvm.internal.l.c(this, objArr);
    }
}
