package androidx.datastore.preferences.protobuf;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public final class w0 extends AbstractMap {
    public static final int F = 0;
    public List A;
    public Map B;
    public boolean C;
    public volatile z0 D;
    public Map E;

    public static w0 g() {
        w0 w0Var = new w0();
        w0Var.A = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        w0Var.B = map;
        w0Var.E = map;
        return w0Var;
    }

    public final int a(Comparable comparable) {
        int i10;
        int i11;
        int i12;
        int iCompareTo;
        int size = this.A.size();
        int i13 = size - 1;
        if (i13 < 0) {
            i10 = 0;
            while (i10 <= i13) {
                i12 = (i10 + i13) / 2;
                iCompareTo = comparable.compareTo(((x0) this.A.get(i12)).A);
                if (iCompareTo < 0) {
                    i13 = i12 - 1;
                } else {
                    if (iCompareTo > 0) {
                        return i12;
                    }
                    i10 = i12 + 1;
                }
            }
            i11 = i10 + 1;
        } else {
            int iCompareTo2 = comparable.compareTo(((x0) this.A.get(i13)).A);
            if (iCompareTo2 > 0) {
                i11 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i13;
                }
                i10 = 0;
                while (i10 <= i13) {
                    i12 = (i10 + i13) / 2;
                    iCompareTo = comparable.compareTo(((x0) this.A.get(i12)).A);
                    if (iCompareTo < 0) {
                        i13 = i12 - 1;
                    } else {
                        if (iCompareTo > 0) {
                            return i12;
                        }
                        i10 = i12 + 1;
                    }
                }
                i11 = i10 + 1;
            }
        }
        return -i11;
    }

    public final void c() {
        if (this.C) {
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public final void clear() {
        c();
        if (!this.A.isEmpty()) {
            this.A.clear();
        }
        if (this.B.isEmpty()) {
            return;
        }
        this.B.clear();
    }

    @Override
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.B.containsKey(comparable);
    }

    public final Map.Entry d(int i10) {
        return (Map.Entry) this.A.get(i10);
    }

    public final Set e() {
        return this.B.isEmpty() ? Collections.EMPTY_SET : this.B.entrySet();
    }

    @Override
    public final Set entrySet() {
        if (this.D == null) {
            this.D = new z0(this, 0);
        }
        return this.D;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return super.equals(obj);
        }
        w0 w0Var = (w0) obj;
        int size = size();
        if (size == w0Var.size()) {
            int size2 = this.A.size();
            if (size2 != w0Var.A.size()) {
                return ((AbstractSet) entrySet()).equals(w0Var.entrySet());
            }
            for (int i10 = 0; i10 < size2; i10++) {
                if (d(i10).equals(w0Var.d(i10))) {
                }
            }
            if (size2 != size) {
                return this.B.equals(w0Var.B);
            }
            return true;
        }
        return false;
    }

    public final SortedMap f() {
        c();
        if (this.B.isEmpty() && !(this.B instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.B = treeMap;
            this.E = treeMap.descendingMap();
        }
        return (SortedMap) this.B;
    }

    @Override
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? ((x0) this.A.get(iA)).B : this.B.get(comparable);
    }

    @Override
    public final Object put(Comparable comparable, Object obj) {
        c();
        int iA = a(comparable);
        if (iA >= 0) {
            return ((x0) this.A.get(iA)).setValue(obj);
        }
        c();
        if (this.A.isEmpty() && !(this.A instanceof ArrayList)) {
            this.A = new ArrayList(16);
        }
        int i10 = -(iA + 1);
        if (i10 >= 16) {
            return f().put(comparable, obj);
        }
        if (this.A.size() == 16) {
            x0 x0Var = (x0) this.A.remove(15);
            f().put(x0Var.A, x0Var.B);
        }
        this.A.add(i10, new x0(this, comparable, obj));
        return null;
    }

    @Override
    public final int hashCode() {
        int size = this.A.size();
        int iHashCode = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iHashCode += ((x0) this.A.get(i10)).hashCode();
        }
        return this.B.size() > 0 ? this.B.hashCode() + iHashCode : iHashCode;
    }

    public final Object i(int i10) {
        c();
        Object obj = ((x0) this.A.remove(i10)).B;
        if (!this.B.isEmpty()) {
            Iterator it = f().entrySet().iterator();
            List list = this.A;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new x0(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override
    public final Object remove(Object obj) {
        c();
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        if (iA >= 0) {
            return i(iA);
        }
        if (this.B.isEmpty()) {
            return null;
        }
        return this.B.remove(comparable);
    }

    @Override
    public final int size() {
        return this.B.size() + this.A.size();
    }
}
