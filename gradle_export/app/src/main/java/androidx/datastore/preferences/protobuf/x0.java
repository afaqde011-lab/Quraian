package androidx.datastore.preferences.protobuf;

import java.util.Map;

public final class x0 implements Map.Entry, Comparable {
    public final Comparable A;
    public Object B;
    public final w0 C;

    public x0(w0 w0Var, Comparable comparable, Object obj) {
        this.C = w0Var;
        this.A = comparable;
        this.B = obj;
    }

    @Override
    public final int compareTo(Object obj) {
        return this.A.compareTo(((x0) obj).A);
    }

    @Override
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.A;
                if (comparable == null) {
                    zEquals = key == null;
                } else {
                    zEquals = comparable.equals(key);
                }
                if (zEquals) {
                    Object obj2 = this.B;
                    Object value = entry.getValue();
                    if (obj2 == null) {
                        zEquals2 = value == null;
                    } else {
                        zEquals2 = obj2.equals(value);
                    }
                    if (zEquals2) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override
    public final Object getKey() {
        return this.A;
    }

    @Override
    public final Object getValue() {
        return this.B;
    }

    @Override
    public final int hashCode() {
        Comparable comparable = this.A;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.B;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override
    public final Object setValue(Object obj) {
        this.C.c();
        Object obj2 = this.B;
        this.B = obj;
        return obj2;
    }

    public final String toString() {
        return this.A + "=" + this.B;
    }
}
