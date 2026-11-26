package qr;

public final class h implements l {
    public final String a;

    public h(String key) {
        kotlin.jvm.internal.m.e(key, "key");
        this.a = key;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && kotlin.jvm.internal.m.a(this.a, ((h) obj).a);
    }

    @Override
    public final String getKey() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return a1.b.p("Header(key=", this.a, ")");
    }
}
