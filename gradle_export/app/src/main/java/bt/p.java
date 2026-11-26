package bt;

public final class p implements w {
    public final ep.m a;

    public p(ep.m mVar) {
        this.a = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && kotlin.jvm.internal.m.a(this.a, ((p) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnGoogleCredentialReceived(data=" + this.a + ")";
    }
}
