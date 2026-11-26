package lu;

public final class o implements p {
    public final String a;

    public o(String searchValue) {
        kotlin.jvm.internal.m.e(searchValue, "searchValue");
        this.a = searchValue;
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
        return a1.b.p("OnSearchChanged(searchValue=", this.a, ")");
    }
}
