package ur;

public final class w implements p0 {
    public final ep.m a;

    public w(ep.m mVar) {
        this.a = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && kotlin.jvm.internal.m.a(this.a, ((w) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnGoogleCredentialReceived(data=" + this.a + ")";
    }
}
