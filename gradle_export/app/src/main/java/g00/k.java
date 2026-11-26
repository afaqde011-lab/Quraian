package g00;

import java.io.Serializable;

public final class k implements Serializable {
    public final Object A;
    public final Object B;

    public k(Object obj, Object obj2) {
        this.A = obj;
        this.B = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return kotlin.jvm.internal.m.a(this.A, kVar.A) && kotlin.jvm.internal.m.a(this.B, kVar.B);
    }

    public final int hashCode() {
        Object obj = this.A;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.B;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.A + ", " + this.B + ')';
    }
}
