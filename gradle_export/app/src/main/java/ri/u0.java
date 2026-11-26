package ri;

public final class u0 extends y1 {

    public final String f13542a;

    public final String f13543b;

    public final long f13544c;

    public u0(String str, long j9, String str2) {
        this.f13542a = str;
        this.f13543b = str2;
        this.f13544c = j9;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y1) {
            u0 u0Var = (u0) ((y1) obj);
            if (this.f13542a.equals(u0Var.f13542a) && this.f13543b.equals(u0Var.f13543b) && this.f13544c == u0Var.f13544c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f13542a.hashCode() ^ 1000003) * 1000003) ^ this.f13543b.hashCode()) * 1000003;
        long j9 = this.f13544c;
        return ((int) ((j9 >>> 32) ^ j9)) ^ iHashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Signal{name=");
        sb2.append(this.f13542a);
        sb2.append(", code=");
        sb2.append(this.f13543b);
        sb2.append(", address=");
        return a1.b.k(this.f13544c, "}", sb2);
    }
}
