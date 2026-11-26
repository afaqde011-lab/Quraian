package vl;

public final class o implements r {
    public final String a;

    public o(String slug) {
        kotlin.jvm.internal.m.e(slug, "slug");
        this.a = slug;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && kotlin.jvm.internal.m.a(this.a, ((o) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return a1.b.p("ReciterCollection(slug=", this.a, ")");
    }
}
