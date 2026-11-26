package fh;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public final class c extends p2 {
    public final int A;
    public final AbstractMap B;

    public c(AbstractMap abstractMap, int i10) {
        this.A = i10;
        this.B = abstractMap;
    }

    public final boolean a(Object obj) {
        Object obj2;
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Map mapB = b();
        mapB.getClass();
        try {
            obj2 = mapB.get(key);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        if (w50.c.A(obj2, entry.getValue())) {
            return obj2 != null || b().containsKey(key);
        }
        return false;
    }

    public final Map b() {
        switch (this.A) {
            case 0:
                return (e) this.B;
            default:
                return (s1) this.B;
        }
    }

    public final boolean c(Object obj) {
        if (contains(obj) && (obj instanceof Map.Entry)) {
            return b().keySet().remove(((Map.Entry) obj).getKey());
        }
        return false;
    }

    @Override
    public final void clear() {
        b().clear();
    }

    @Override
    public boolean contains(Object obj) {
        switch (this.A) {
            case 0:
                Set setEntrySet = ((e) this.B).C.entrySet();
                setEntrySet.getClass();
                try {
                    return setEntrySet.contains(obj);
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            default:
                return a(obj);
        }
    }

    @Override
    public final boolean isEmpty() {
        return b().isEmpty();
    }

    @Override
    public final Iterator iterator() {
        switch (this.A) {
            case 0:
                return new d((e) this.B);
            default:
                s1 s1Var = (s1) this.B;
                Iterator it = s1Var.A.entrySet().iterator();
                r1 r1Var = s1Var.B;
                r1Var.getClass();
                return new h1(it, new me.i(r1Var, 26));
        }
    }

    @Override
    public boolean remove(Object obj) {
        Object objRemove;
        switch (this.A) {
            case 0:
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                p pVar = ((e) this.B).D;
                Object key = entry.getKey();
                Map map = pVar.E;
                map.getClass();
                try {
                    objRemove = map.remove(key);
                    break;
                } catch (ClassCastException | NullPointerException unused) {
                    objRemove = null;
                }
                Collection collection = (Collection) objRemove;
                if (collection != null) {
                    int size = collection.size();
                    collection.clear();
                    pVar.F -= size;
                }
                return true;
            default:
                return c(obj);
        }
    }

    @Override
    public final boolean removeAll(Collection collection) {
        try {
            collection.getClass();
            return w.u(this, collection);
        } catch (UnsupportedOperationException unused) {
            Iterator it = collection.iterator();
            boolean zRemove = false;
            while (it.hasNext()) {
                zRemove |= remove(it.next());
            }
            return zRemove;
        }
    }

    @Override
    public final boolean retainAll(Collection collection) {
        try {
            collection.getClass();
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            HashSet hashSet = new HashSet(w.d(collection.size()));
            for (Object obj : collection) {
                if (contains(obj) && (obj instanceof Map.Entry)) {
                    hashSet.add(((Map.Entry) obj).getKey());
                }
            }
            return b().keySet().retainAll(hashSet);
        }
    }

    @Override
    public final int size() {
        return b().size();
    }
}
