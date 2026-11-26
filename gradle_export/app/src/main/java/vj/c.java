package vj;

public final class c extends e {

    public final String f15726b;

    public final String f15727c;

    public final String f15728d;

    public final String f15729e;

    public final long f15730f;

    public c(String str, String str2, String str3, String str4, long j9) {
        this.f15726b = str;
        this.f15727c = str2;
        this.f15728d = str3;
        this.f15729e = str4;
        this.f15730f = j9;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            c cVar = (c) ((e) obj);
            if (this.f15726b.equals(cVar.f15726b) && this.f15727c.equals(cVar.f15727c) && this.f15728d.equals(cVar.f15728d) && this.f15729e.equals(cVar.f15729e) && this.f15730f == cVar.f15730f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f15726b.hashCode() ^ 1000003) * 1000003) ^ this.f15727c.hashCode()) * 1000003) ^ this.f15728d.hashCode()) * 1000003) ^ this.f15729e.hashCode()) * 1000003;
        long j9 = this.f15730f;
        return ((int) ((j9 >>> 32) ^ j9)) ^ iHashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutId=");
        sb2.append(this.f15726b);
        sb2.append(", variantId=");
        sb2.append(this.f15727c);
        sb2.append(", parameterKey=");
        sb2.append(this.f15728d);
        sb2.append(", parameterValue=");
        sb2.append(this.f15729e);
        sb2.append(", templateVersion=");
        return a1.b.k(this.f15730f, "}", sb2);
    }
}
