package ri;

import com.google.android.gms.internal.measurement.x5;

public final class s0 extends w1 {

    public final long f13524a;

    public final long f13525b;

    public final String f13526c;

    public final String f13527d;

    public s0(long j9, long j10, String str, String str2) {
        this.f13524a = j9;
        this.f13525b = j10;
        this.f13526c = str;
        this.f13527d = str2;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof w1) {
            s0 s0Var = (s0) ((w1) obj);
            String str2 = s0Var.f13527d;
            if (this.f13524a == s0Var.f13524a && this.f13525b == s0Var.f13525b && this.f13526c.equals(s0Var.f13526c) && ((str = this.f13527d) != null ? str.equals(str2) : str2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j9 = this.f13524a;
        long j10 = this.f13525b;
        int iHashCode = (((((((int) (j9 ^ (j9 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003) ^ this.f13526c.hashCode()) * 1000003;
        String str = this.f13527d;
        return (str == null ? 0 : str.hashCode()) ^ iHashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BinaryImage{baseAddress=");
        sb2.append(this.f13524a);
        sb2.append(", size=");
        sb2.append(this.f13525b);
        sb2.append(", name=");
        sb2.append(this.f13526c);
        sb2.append(", uuid=");
        return x5.n(sb2, this.f13527d, "}");
    }
}
