package vl;

public final class l implements r {
    public final String a;

    public l(String slug) {
        kotlin.jvm.internal.m.e(slug, "slug");
        this.a = slug;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && kotlin.jvm.internal.m.a(this.a, ((l) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return a1.b.p("Collection(slug=", this.a, ")");
    }
}
