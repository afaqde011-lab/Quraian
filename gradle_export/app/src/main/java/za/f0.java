package za;

public final class f0 {

    public final long f17365a;

    public final long f17366b;

    public f0(long j9, long j10) {
        this.f17365a = j9;
        this.f17366b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f0.class.equals(obj.getClass())) {
            f0 f0Var = (f0) obj;
            if (f0Var.f17365a == this.f17365a && f0Var.f17366b == this.f17366b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f17366b) + (Long.hashCode(this.f17365a) * 31);
    }

    public final String toString() {
        return "PeriodicityInfo{repeatIntervalMillis=" + this.f17365a + ", flexIntervalMillis=" + this.f17366b + '}';
    }
}
