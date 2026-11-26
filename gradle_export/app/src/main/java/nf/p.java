package nf;

import java.io.Serializable;
import java.util.Map;

public abstract class p implements Map, Serializable {
    public static final Map.Entry[] B = new Map.Entry[0];
    public transient q A;

    @Override
    public final q entrySet() {
        q sVar = this.A;
        if (sVar == null) {
            t tVar = (t) this;
            sVar = tVar.isEmpty() ? a0.J : new s(tVar);
            this.A = sVar;
        }
        return sVar;
    }

    @Override
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override
    public final boolean containsValue(Object obj) {
        return ((t) this).D.contains(obj);
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return ((t) this).entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override
    public abstract Object get(Object obj);

    @Override
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override
    public final int hashCode() {
        return b.b(entrySet());
    }

    @Override
    public final boolean isEmpty() {
        return ((t) this).size() == 0;
    }

    @Override
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        t tVar = (t) this;
        int size = tVar.size();
        if (size < 0) {
            throw new IllegalArgumentException(g4.c.f(size, "size cannot be negative but was: "));
        }
        StringBuilder sb2 = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824L));
        sb2.append('{');
        boolean z10 = true;
        for (Map.Entry entry : tVar.entrySet()) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
            z10 = false;
        }
        sb2.append('}');
        return sb2.toString();
    }
}
