package jp;

public final class s implements t {
    public final ep.f a;

    public s(ep.f sex) {
        kotlin.jvm.internal.m.e(sex, "sex");
        this.a = sex;
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
        return "OnSexSelected(sex=" + this.a + ")";
    }
}
