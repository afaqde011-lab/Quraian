package q3;

public final class e {

    public final a0 f12734a;

    public e(a0 a0Var) {
        this.f12734a = a0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && kotlin.jvm.internal.m.a(this.f12734a, ((e) obj).f12734a);
    }

    public final int hashCode() {
        return this.f12734a.hashCode() * 31;
    }

    public final String toString() {
        return "Key(font=" + this.f12734a + ", loaderKey=null)";
    }
}
