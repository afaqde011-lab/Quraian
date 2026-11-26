package l1;

public final class c1 {

    public final String f9830a;

    public c1(String str) {
        this.f9830a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c1) && kotlin.jvm.internal.m.a(this.f9830a, ((c1) obj).f9830a);
    }

    public final int hashCode() {
        return this.f9830a.hashCode();
    }

    public final String toString() {
        return g4.c.k(new StringBuilder("OpaqueKey(key="), this.f9830a, ')');
    }
}
