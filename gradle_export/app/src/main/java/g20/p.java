package g20;

public final class p {
    public final String a;

    public p(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && kotlin.jvm.internal.m.a(this.a, ((p) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return g4.c.k(new StringBuilder("MemberSignature(signature="), this.a, ')');
    }
}
