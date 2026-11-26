package u;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

public final class t implements Map, v00.a {
    public final i0 A;
    public g B;
    public g C;
    public u0 D;

    public t(i0 i0Var) {
        kotlin.jvm.internal.m.e(i0Var, "parent");
        this.A = i0Var;
    }

    @Override
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean containsKey(Object obj) {
        return this.A.c(obj);
    }

    @Override
    public final boolean containsValue(Object obj) {
        return this.A.d(obj);
    }

    @Override
    public final Set entrySet() {
        g gVar = this.B;
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g(this.A, 0);
        this.B = gVar2;
        return gVar2;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t.class != obj.getClass()) {
            return false;
        }
        return kotlin.jvm.internal.m.a(this.A, ((t) obj).A);
    }

    @Override
    public final Object get(Object obj) {
        return this.A.g(obj);
    }

    @Override
    public final int hashCode() {
        return this.A.hashCode();
    }

    @Override
    public final boolean isEmpty() {
        return this.A.i();
    }

    @Override
    public final Set keySet() {
        g gVar = this.C;
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g(this.A, 1);
        this.C = gVar2;
        return gVar2;
    }

    @Override
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final int size() {
        return this.A.f14860e;
    }

    public final String toString() {
        return this.A.toString();
    }

    @Override
    public final Collection values() {
        u0 u0Var = this.D;
        if (u0Var != null) {
            return u0Var;
        }
        u0 u0Var2 = new u0(this.A);
        this.D = u0Var2;
        return u0Var2;
    }
}
