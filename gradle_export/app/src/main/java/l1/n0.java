package l1;

public final class n0 {

    public final Integer f9901a;

    public final Object f9902b;

    public n0(Integer num, Object obj) {
        this.f9901a = num;
        this.f9902b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return this.f9901a.equals(n0Var.f9901a) && kotlin.jvm.internal.m.a(this.f9902b, n0Var.f9902b);
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2 = this.f9901a.hashCode() * 31;
        Object obj = this.f9902b;
        if (obj instanceof Enum) {
            iHashCode = ((Enum) obj).ordinal();
        } else {
            iHashCode = obj != null ? obj.hashCode() : 0;
        }
        return iHashCode + iHashCode2;
    }

    public final String toString() {
        return "JoinedKey(left=" + this.f9901a + ", right=" + this.f9902b + ')';
    }
}
