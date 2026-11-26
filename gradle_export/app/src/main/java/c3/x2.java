package c3;

public final class x2 {

    public final String f2773a;

    public final Object f2774b;

    public x2(String str, Object obj) {
        this.f2773a = str;
        this.f2774b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x2)) {
            return false;
        }
        x2 x2Var = (x2) obj;
        return kotlin.jvm.internal.m.a(this.f2773a, x2Var.f2773a) && kotlin.jvm.internal.m.a(this.f2774b, x2Var.f2774b);
    }

    public final int hashCode() {
        int iHashCode = this.f2773a.hashCode() * 31;
        Object obj = this.f2774b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "ValueElement(name=" + this.f2773a + ", value=" + this.f2774b + ')';
    }
}
