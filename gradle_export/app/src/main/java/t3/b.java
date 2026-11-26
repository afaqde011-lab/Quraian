package t3;

import h00.x;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;
import oi.k;

public final class b implements Collection, v00.a {
    public static final b C = new b(x.A);
    public final List A;
    public final int B;

    public b(List list) {
        this.A = list;
        this.B = list.size();
    }

    @Override
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean contains(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        return this.A.contains((a) obj);
    }

    @Override
    public final boolean containsAll(Collection collection) {
        return this.A.containsAll(collection);
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return m.a(this.A, ((b) obj).A);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.A.hashCode();
    }

    @Override
    public final boolean isEmpty() {
        return this.A.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return this.A.iterator();
    }

    @Override
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final int size() {
        return this.B;
    }

    @Override
    public final Object[] toArray() {
        return l.b(this);
    }

    @Override
    public final Object[] toArray(Object[] objArr) {
        return l.c(this, objArr);
    }

    public final String toString() {
        return k.n(new StringBuilder("LocaleList(localeList="), this.A, ')');
    }
}
