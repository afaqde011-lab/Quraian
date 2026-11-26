package q40;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

public final class x extends l implements Map<String, l>, v00.a {
    public static final w Companion = new w();
    public final Map A;

    public x(Map content) {
        kotlin.jvm.internal.m.e(content, "content");
        this.A = content;
    }

    @Override
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final l compute(String str, BiFunction<? super String, ? super l, ? extends l> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final l computeIfAbsent(String str, Function<? super String, ? extends l> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final l computeIfPresent(String str, BiFunction<? super String, ? super l, ? extends l> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return this.A.containsKey((String) obj);
    }

    @Override
    public final boolean containsValue(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        return this.A.containsValue((l) obj);
    }

    @Override
    public final Set<Map.Entry<String, l>> entrySet() {
        return this.A.entrySet();
    }

    @Override
    public final boolean equals(Object obj) {
        return kotlin.jvm.internal.m.a(this.A, obj);
    }

    @Override
    public final l get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return (l) this.A.get((String) obj);
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
    public final Set<String> keySet() {
        return this.A.keySet();
    }

    @Override
    public final l merge(String str, l lVar, BiFunction<? super l, ? super l, ? extends l> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final l put(String str, l lVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final void putAll(Map<? extends String, ? extends l> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final l putIfAbsent(String str, l lVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final l remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final l replace(String str, l lVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean replace(String str, l lVar, l lVar2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final void replaceAll(BiFunction<? super String, ? super l, ? extends l> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final int size() {
        return this.A.size();
    }

    public final String toString() {
        return h00.q.R0(this.A.entrySet(), ",", "{", "}", new pp.d(19), 24);
    }

    @Override
    public final Collection<l> values() {
        return this.A.values();
    }
}
