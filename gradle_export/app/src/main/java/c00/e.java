package c00;

public final class e implements f {
    public final String a;

    public e(String query) {
        kotlin.jvm.internal.m.e(query, "query");
        this.a = query;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && kotlin.jvm.internal.m.a(this.a, ((e) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return a1.b.p("OnSearchQueryChanged(query=", this.a, ")");
    }
}
