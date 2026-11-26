package l1;

public final class r2 implements s2 {

    public final Object f9925a;

    public r2(Object obj) {
        this.f9925a = obj;
    }

    @Override
    public final Object a(m1 m1Var) {
        return this.f9925a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r2) && kotlin.jvm.internal.m.a(this.f9925a, ((r2) obj).f9925a);
    }

    public final int hashCode() {
        Object obj = this.f9925a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "StaticValueHolder(value=" + this.f9925a + ')';
    }
}
