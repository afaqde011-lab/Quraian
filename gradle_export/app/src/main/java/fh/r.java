package fh;

import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class r extends AbstractCollection {
    public final int A;
    public final Object B;

    public r(Object obj, int i10) {
        this.A = i10;
        this.B = obj;
    }

    public r(AbstractMap abstractMap) {
        this.A = 3;
        this.B = abstractMap;
    }

    @Override
    public final void clear() {
        switch (this.A) {
            case 0:
                ((t) this.B).clear();
                break;
            case 1:
                ((p) this.B).clear();
                break;
            case 2:
                ((a0) this.B).clear();
                break;
            default:
                ((AbstractMap) this.B).clear();
                break;
        }
    }

    @Override
    public boolean contains(Object obj) {
        switch (this.A) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return ((t) this.B).c(entry.getKey(), entry.getValue());
            case 1:
                return ((p) this.B).d(obj);
            case 2:
            default:
                return super.contains(obj);
            case 3:
                return ((AbstractMap) this.B).containsValue(obj);
        }
    }

    @Override
    public boolean isEmpty() {
        switch (this.A) {
            case 3:
                return ((AbstractMap) this.B).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override
    public final Iterator iterator() {
        switch (this.A) {
            case 0:
                return ((t) this.B).h();
            case 1:
                return new b((p) this.B, 0);
            case 2:
                a0 a0Var = (a0) this.B;
                Map mapD = a0Var.d();
                return mapD != null ? mapD.values().iterator() : new x(a0Var, 2);
            default:
                return new q1(((AbstractMap) this.B).entrySet().iterator());
        }
    }

    @Override
    public boolean remove(Object obj) {
        switch (this.A) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return ((t) this.B).remove(entry.getKey(), entry.getValue());
            case 3:
                AbstractMap abstractMap = (AbstractMap) this.B;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused) {
                    for (Map.Entry entry2 : abstractMap.entrySet()) {
                        if (w50.c.A(obj, entry2.getValue())) {
                            abstractMap.remove(entry2.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            default:
                return super.remove(obj);
        }
    }

    @Override
    public boolean removeAll(Collection collection) {
        switch (this.A) {
            case 3:
                AbstractMap abstractMap = (AbstractMap) this.B;
                try {
                    collection.getClass();
                    return super.removeAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : abstractMap.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return abstractMap.keySet().removeAll(hashSet);
                }
            default:
                return super.removeAll(collection);
        }
    }

    @Override
    public boolean retainAll(Collection collection) {
        switch (this.A) {
            case 3:
                AbstractMap abstractMap = (AbstractMap) this.B;
                try {
                    collection.getClass();
                    return super.retainAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : abstractMap.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return abstractMap.keySet().retainAll(hashSet);
                }
            default:
                return super.retainAll(collection);
        }
    }

    @Override
    public final int size() {
        switch (this.A) {
            case 0:
                return ((t) this.B).size();
            case 1:
                return ((p) this.B).F;
            case 2:
                return ((a0) this.B).size();
            default:
                return ((AbstractMap) this.B).size();
        }
    }
}
