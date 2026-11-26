package x;

public final class l1 implements k1 {

    public final Object f16311a;

    public final Object f16312b;

    public l1(Object obj, Object obj2) {
        this.f16311a = obj;
        this.f16312b = obj2;
    }

    @Override
    public final Object a() {
        return this.f16311a;
    }

    @Override
    public final Object c() {
        return this.f16312b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj;
        return kotlin.jvm.internal.m.a(this.f16311a, k1Var.a()) && kotlin.jvm.internal.m.a(this.f16312b, k1Var.c());
    }

    public final int hashCode() {
        Object obj = this.f16311a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f16312b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }
}
