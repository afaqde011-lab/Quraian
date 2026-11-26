package s10;

public final class d0 extends m0 {
    public final String a;

    public d0(String className) {
        kotlin.jvm.internal.m.e(className, "className");
        this.a = className;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d0) && kotlin.jvm.internal.m.a(this.a, ((d0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return g4.c.k(new StringBuilder("KClassValue("), this.a, ')');
    }
}
