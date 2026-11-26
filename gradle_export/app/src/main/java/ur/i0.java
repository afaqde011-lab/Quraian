package ur;

public final class i0 implements p0 {
    public final String a;

    public i0(String sectionKey) {
        kotlin.jvm.internal.m.e(sectionKey, "sectionKey");
        this.a = sectionKey;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i0) && kotlin.jvm.internal.m.a(this.a, ((i0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return a1.b.p("OnSeeAllRecitersClicked(sectionKey=", this.a, ")");
    }
}
