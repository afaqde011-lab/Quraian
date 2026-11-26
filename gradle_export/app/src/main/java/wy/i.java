package wy;

public final class i implements j {
    public final String a;

    public i(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && kotlin.jvm.internal.m.a(this.a, ((i) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return a1.b.p("PasswordChanged(message=", this.a, ")");
    }
}
