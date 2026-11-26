package rc;

public final class j extends m {

    public final long f13195a;

    public j(long j9) {
        this.f13195a = j9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && this.f13195a == ((j) obj).f13195a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f13195a);
    }

    public final String toString() {
        return "EnterForeground(timestamp=" + this.f13195a + ')';
    }
}
