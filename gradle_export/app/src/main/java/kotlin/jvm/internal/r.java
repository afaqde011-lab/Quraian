package kotlin.jvm.internal;

public final class r implements d {
    public final Class A;

    public r(Class jClass) {
        m.e(jClass, "jClass");
        this.A = jClass;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            return m.a(this.A, ((r) obj).A);
        }
        return false;
    }

    public final int hashCode() {
        return this.A.hashCode();
    }

    public final String toString() {
        return this.A.toString() + " (Kotlin reflection is not available)";
    }

    @Override
    public final Class v() {
        return this.A;
    }
}
