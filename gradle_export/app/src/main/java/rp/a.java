package rp;

public final class a implements c {
    public final ep.a a;

    public a(ep.a data) {
        kotlin.jvm.internal.m.e(data, "data");
        this.a = data;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && kotlin.jvm.internal.m.a(this.a, ((a) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnAppleCredentialReceived(data=" + this.a + ")";
    }
}
