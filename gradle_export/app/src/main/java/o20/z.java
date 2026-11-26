package o20;

import androidx.datastore.preferences.protobuf.z0;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public final class z extends AbstractMap {
    public static final int F = 0;
    public final int A;
    public List B = Collections.EMPTY_LIST;
    public Map C = Collections.EMPTY_MAP;
    public boolean D;
    public volatile z0 E;

    public z(int i) {
        this.A = i;
    }

    public final int a(Comparable comparable) {
        int i;
        int i2;
        int i3;
        int iCompareTo;
        int size = this.B.size();
        int i4 = size - 1;
        if (i4 < 0) {
            i = 0;
            while (i <= i4) {
                i3 = (i + i4) / 2;
                iCompareTo = comparable.compareTo(((d0) this.B.get(i3)).A);
                if (iCompareTo < 0) {
                    i4 = i3 - 1;
                } else {
                    if (iCompareTo > 0) {
                        return i3;
                    }
                    i = i3 + 1;
                }
            }
            i2 = i + 1;
        } else {
            int iCompareTo2 = comparable.compareTo(((d0) this.B.get(i4)).A);
            if (iCompareTo2 > 0) {
                i2 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i4;
                }
                i = 0;
                while (i <= i4) {
                    i3 = (i + i4) / 2;
                    iCompareTo = comparable.compareTo(((d0) this.B.get(i3)).A);
                    if (iCompareTo < 0) {
                        i4 = i3 - 1;
                    } else {
                        if (iCompareTo > 0) {
                            return i3;
                        }
                        i = i3 + 1;
                    }
                }
                i2 = i + 1;
            }
        }
        return -i2;
    }

    public final void c() {
        if (this.D) {
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public final void clear() {
        c();
        if (!this.B.isEmpty()) {
            this.B.clear();
        }
        if (this.C.isEmpty()) {
            return;
        }
        this.C.clear();
    }

    @Override
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.C.containsKey(comparable);
    }

    public final Iterable d() {
        return this.C.isEmpty() ? c0.b : this.C.entrySet();
    }

    public final SortedMap e() {
        c();
        if (this.C.isEmpty() && !(this.C instanceof TreeMap)) {
            this.C = new TreeMap();
        }
        return (SortedMap) this.C;
    }

    @Override
    public final Set entrySet() {
        if (this.E == null) {
            this.E = new z0(this, 3);
        }
        return this.E;
    }

    @Override
    public final Object put(Comparable comparable, Object obj) {
        c();
        int iA = a(comparable);
        if (iA >= 0) {
            return ((d0) this.B.get(iA)).setValue(obj);
        }
        c();
        boolean zIsEmpty = this.B.isEmpty();
        int i = this.A;
        if (zIsEmpty && !(this.B instanceof ArrayList)) {
            this.B = new ArrayList(i);
        }
        int i2 = -(iA + 1);
        if (i2 >= i) {
            return e().put(comparable, obj);
        }
        if (this.B.size() == i) {
            d0 d0Var = (d0) this.B.remove(i - 1);
            e().put(d0Var.A, d0Var.B);
        }
        this.B.add(i2, new d0(this, comparable, obj));
        return null;
    }

    public final Object g(int i) {
        c();
        Object obj = ((d0) this.B.remove(i)).B;
        if (!this.C.isEmpty()) {
            Iterator it = e().entrySet().iterator();
            List list = this.B;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new d0(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? ((d0) this.B.get(iA)).B : this.C.get(comparable);
    }

    @Override
    public final Object remove(Object obj) {
        c();
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        if (iA >= 0) {
            return g(iA);
        }
        if (this.C.isEmpty()) {
            return null;
        }
        return this.C.remove(comparable);
    }

    @Override
    public final int size() {
        return this.C.size() + this.B.size();
    }
}
