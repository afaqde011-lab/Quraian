package gz;

public final class a implements m0 {
    public final ep.a a;

    public a(ep.a aVar) {
        this.a = aVar;
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
