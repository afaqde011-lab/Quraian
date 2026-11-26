package ri;

public final class x0 extends z1 {

    public final long f13564a;

    public final String f13565b;

    public final String f13566c;

    public final long f13567d;

    public final int f13568e;

    public x0(long j9, String str, String str2, long j10, int i10) {
        this.f13564a = j9;
        this.f13565b = str;
        this.f13566c = str2;
        this.f13567d = j10;
        this.f13568e = i10;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof z1) {
            x0 x0Var = (x0) ((z1) obj);
            String str2 = x0Var.f13566c;
            if (this.f13564a == x0Var.f13564a && this.f13565b.equals(x0Var.f13565b) && ((str = this.f13566c) != null ? str.equals(str2) : str2 == null) && this.f13567d == x0Var.f13567d && this.f13568e == x0Var.f13568e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j9 = this.f13564a;
        int iHashCode = (((((int) (j9 ^ (j9 >>> 32))) ^ 1000003) * 1000003) ^ this.f13565b.hashCode()) * 1000003;
        String str = this.f13566c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j10 = this.f13567d;
        return this.f13568e ^ ((iHashCode2 ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Frame{pc=");
        sb2.append(this.f13564a);
        sb2.append(", symbol=");
        sb2.append(this.f13565b);
        sb2.append(", file=");
        sb2.append(this.f13566c);
        sb2.append(", offset=");
        sb2.append(this.f13567d);
        sb2.append(", importance=");
        return g4.c.g(this.f13568e, "}", sb2);
    }
}
