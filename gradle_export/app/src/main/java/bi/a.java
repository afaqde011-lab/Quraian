package bi;

public final class a {

    public final long f2519a;

    public final long f2520b;

    public final long f2521c;

    public a(long j9, long j10, long j11) {
        this.f2519a = j9;
        this.f2520b = j10;
        this.f2521c = j11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f2519a == aVar.f2519a && this.f2520b == aVar.f2520b && this.f2521c == aVar.f2521c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j9 = this.f2519a;
        long j10 = this.f2520b;
        int i10 = (((((int) (j9 ^ (j9 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f2521c;
        return ((int) ((j11 >>> 32) ^ j11)) ^ i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StartupTime{epochMillis=");
        sb2.append(this.f2519a);
        sb2.append(", elapsedRealtime=");
        sb2.append(this.f2520b);
        sb2.append(", uptimeMillis=");
        return a1.b.k(this.f2521c, "}", sb2);
    }
}
