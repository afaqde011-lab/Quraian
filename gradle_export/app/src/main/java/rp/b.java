package rp;

public final class b implements c {
    public final ep.m a;

    public b(ep.m data) {
        kotlin.jvm.internal.m.e(data, "data");
        this.a = data;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && kotlin.jvm.internal.m.a(this.a, ((b) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnGoogleCredentialReceived(data=" + this.a + ")";
    }
}
