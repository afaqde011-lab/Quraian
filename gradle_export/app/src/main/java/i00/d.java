package i00;

import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.m;

public final class d implements Map.Entry, v00.d {
    public final f A;
    public final int B;
    public final int C;

    public d(f map, int i) {
        m.e(map, "map");
        this.A = map;
        this.B = i;
        this.C = map.H;
    }

    public final void a() {
        if (this.A.H != this.C) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return m.a(entry.getKey(), getKey()) && m.a(entry.getValue(), getValue());
    }

    @Override
    public final Object getKey() {
        a();
        return this.A.A[this.B];
    }

    @Override
    public final Object getValue() {
        a();
        Object[] objArr = this.A.B;
        m.b(objArr);
        return objArr[this.B];
    }

    @Override
    public final int hashCode() {
        Object key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override
    public final Object setValue(Object obj) {
        a();
        f fVar = this.A;
        fVar.e();
        Object[] objArr = fVar.B;
        if (objArr == null) {
            int length = fVar.A.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            fVar.B = objArr;
        }
        int i = this.B;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
