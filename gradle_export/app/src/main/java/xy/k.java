package xy;

public final class k implements m {
    public final String a;

    public k(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && kotlin.jvm.internal.m.a(this.a, ((k) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return a1.b.p("CopyUserId(userId=", this.a, ")");
    }
}
