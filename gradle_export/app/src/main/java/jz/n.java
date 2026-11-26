package jz;

public final class n implements r {
    public final String a;

    public n(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && this.a.equals(((n) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + 1454345774;
    }

    public final String toString() {
        return a1.b.p("SendEmail(subject=Quranify Support (Android), message=", this.a, ")");
    }
}
