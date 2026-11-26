package s1;

import java.util.Map;

public class a implements Map.Entry, v00.a {
    public final int A;
    public final Object B;
    public final Object C;

    public a(Object obj, Object obj2, int i10) {
        this.A = i10;
        this.B = obj;
        this.C = obj2;
    }

    @Override
    public boolean equals(Object obj) {
        switch (this.A) {
            case 0:
                Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
                return entry != null && kotlin.jvm.internal.m.a(entry.getKey(), this.B) && kotlin.jvm.internal.m.a(entry.getValue(), getValue());
            case 1:
            default:
                return super.equals(obj);
            case 2:
                Map.Entry entry2 = obj instanceof Map.Entry ? (Map.Entry) obj : null;
                return entry2 != null && kotlin.jvm.internal.m.a(entry2.getKey(), this.B) && kotlin.jvm.internal.m.a(entry2.getValue(), getValue());
        }
    }

    @Override
    public final Object getKey() {
        switch (this.A) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.B;
    }

    @Override
    public Object getValue() {
        switch (this.A) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.C;
    }

    @Override
    public int hashCode() {
        switch (this.A) {
            case 0:
                Object obj = this.B;
                int iHashCode = obj != null ? obj.hashCode() : 0;
                Object value = getValue();
                return iHashCode ^ (value != null ? value.hashCode() : 0);
            case 1:
            default:
                return super.hashCode();
            case 2:
                Object obj2 = this.B;
                int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
                Object value2 = getValue();
                return iHashCode2 ^ (value2 != null ? value2.hashCode() : 0);
        }
    }

    @Override
    public Object setValue(Object obj) {
        switch (this.A) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public String toString() {
        switch (this.A) {
            case 0:
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.B);
                sb2.append('=');
                sb2.append(getValue());
                return sb2.toString();
            case 1:
            default:
                return super.toString();
            case 2:
                StringBuilder sb3 = new StringBuilder();
                sb3.append(this.B);
                sb3.append('=');
                sb3.append(getValue());
                return sb3.toString();
        }
    }
}
