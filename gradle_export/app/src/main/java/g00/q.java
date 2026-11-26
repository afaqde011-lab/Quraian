package g00;

import java.io.Serializable;

public final class q implements Serializable {
    public final Object A;
    public final Object B;
    public final Object C;

    public q(Object obj, Object obj2, Object obj3) {
        this.A = obj;
        this.B = obj2;
        this.C = obj3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return kotlin.jvm.internal.m.a(this.A, qVar.A) && kotlin.jvm.internal.m.a(this.B, qVar.B) && kotlin.jvm.internal.m.a(this.C, qVar.C);
    }

    public final int hashCode() {
        Object obj = this.A;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.B;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.C;
        return iHashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.A + ", " + this.B + ", " + this.C + ')';
    }
}
