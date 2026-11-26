package as;

public final class s implements u {
    public final qr.r a;

    public s(qr.r filter) {
        kotlin.jvm.internal.m.e(filter, "filter");
        this.a = filter;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && this.a == ((s) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnSurahFilterChanged(filter=" + this.a + ")";
    }
}
