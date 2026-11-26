package fh;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

public abstract class w0 implements Map, Serializable {
    public transient e1 A;
    public transient e1 B;
    public transient o0 C;

    public static w0 a(Map map) {
        if ((map instanceof w0) && !(map instanceof SortedMap)) {
            return (w0) map;
        }
        Set setEntrySet = map.entrySet();
        c50.h hVar = new c50.h(setEntrySet instanceof Collection ? setEntrySet.size() : 4, 7);
        hVar.A(setEntrySet);
        return hVar.c(true);
    }

    public abstract f2 c();

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
        return values().contains(obj);
    }

    public abstract g2 d();

    public abstract o0 e();

    @Override
    public final Set entrySet() {
        e1 e1Var = this.A;
        if (e1Var != null) {
            return e1Var;
        }
        f2 f2VarC = c();
        this.A = f2VarC;
        return f2VarC;
    }

    @Override
    public final boolean equals(Object obj) {
        return w.j(this, obj);
    }

    @Override
    public final e1 keySet() {
        e1 e1Var = this.B;
        if (e1Var != null) {
            return e1Var;
        }
        g2 g2VarD = d();
        this.B = g2VarD;
        return g2VarD;
    }

    @Override
    public o0 values() {
        o0 o0Var = this.C;
        if (o0Var != null) {
            return o0Var;
        }
        o0 o0VarE = e();
        this.C = o0VarE;
        return o0VarE;
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
        e1 e1VarC = this.A;
        if (e1VarC == null) {
            e1VarC = c();
            this.A = e1VarC;
        }
        return w.o(e1VarC);
    }

    @Override
    public final boolean isEmpty() {
        return size() == 0;
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
        int size = size();
        w.g(size, "size");
        StringBuilder sb2 = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824L));
        sb2.append('{');
        boolean z10 = true;
        for (Map.Entry entry : entrySet()) {
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
