package vl;

public final class q implements r {
    public final String a;

    public q(String slug) {
        kotlin.jvm.internal.m.e(slug, "slug");
        this.a = slug;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && kotlin.jvm.internal.m.a(this.a, ((q) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return a1.b.p("Story(slug=", this.a, ")");
    }
}
