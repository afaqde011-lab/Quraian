package o20;

import java.util.Map;

public final class d0 implements Comparable, Map.Entry {
    public final Comparable A;
    public Object B;
    public final z C;

    public d0(z zVar, Comparable comparable, Object obj) {
        this.C = zVar;
        this.A = comparable;
        this.B = obj;
    }

    @Override
    public final int compareTo(Object obj) {
        return this.A.compareTo(((d0) obj).A);
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
        String strValueOf = String.valueOf(this.A);
        String strValueOf2 = String.valueOf(this.B);
        return w.c.l(new StringBuilder(strValueOf2.length() + strValueOf.length() + 1), strValueOf, "=", strValueOf2);
    }
}
