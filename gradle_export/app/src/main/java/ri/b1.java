package ri;

public final class b1 extends e2 {

    public final Double f13277a;

    public final int f13278b;

    public final boolean f13279c;

    public final int f13280d;

    public final long f13281e;

    public final long f13282f;

    public b1(Double d3, int i10, boolean z10, int i11, long j9, long j10) {
        this.f13277a = d3;
        this.f13278b = i10;
        this.f13279c = z10;
        this.f13280d = i11;
        this.f13281e = j9;
        this.f13282f = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e2) {
            e2 e2Var = (e2) obj;
            Double d3 = this.f13277a;
            if (d3 != null ? d3.equals(((b1) e2Var).f13277a) : ((b1) e2Var).f13277a == null) {
                b1 b1Var = (b1) e2Var;
                if (this.f13278b == b1Var.f13278b && this.f13279c == b1Var.f13279c && this.f13280d == b1Var.f13280d && this.f13281e == b1Var.f13281e && this.f13282f == b1Var.f13282f) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Double d3 = this.f13277a;
        int iHashCode = ((((((((d3 == null ? 0 : d3.hashCode()) ^ 1000003) * 1000003) ^ this.f13278b) * 1000003) ^ (this.f13279c ? 1231 : 1237)) * 1000003) ^ this.f13280d) * 1000003;
        long j9 = this.f13281e;
        long j10 = this.f13282f;
        return ((int) (j10 ^ (j10 >>> 32))) ^ ((iHashCode ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{batteryLevel=");
        sb2.append(this.f13277a);
        sb2.append(", batteryVelocity=");
        sb2.append(this.f13278b);
        sb2.append(", proximityOn=");
        sb2.append(this.f13279c);
        sb2.append(", orientation=");
        sb2.append(this.f13280d);
        sb2.append(", ramUsed=");
        sb2.append(this.f13281e);
        sb2.append(", diskUsed=");
        return a1.b.k(this.f13282f, "}", sb2);
    }
}
