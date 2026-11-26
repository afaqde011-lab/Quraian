package ev;

public final class g implements j {
    public final String a;

    public g(String query) {
        kotlin.jvm.internal.m.e(query, "query");
        this.a = query;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && kotlin.jvm.internal.m.a(this.a, ((g) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return a1.b.p("OnQueryChanged(query=", this.a, ")");
    }
}
