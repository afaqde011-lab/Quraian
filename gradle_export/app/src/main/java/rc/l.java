package rc;

public final class l extends m {

    public final long f13197a;

    public l(long j9) {
        this.f13197a = j9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && this.f13197a == ((l) obj).f13197a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f13197a);
    }

    public final String toString() {
        return "ExitForeground(timestamp=" + this.f13197a + ')';
    }
}
