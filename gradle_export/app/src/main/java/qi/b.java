package qi;

public final class b extends n {

    public final String f13013b;

    public final String f13014c;

    public final String f13015d;

    public final String f13016e;

    public final long f13017f;

    public b(String str, String str2, String str3, String str4, long j9) {
        if (str == null) {
            throw new NullPointerException("Null rolloutId");
        }
        this.f13013b = str;
        if (str2 == null) {
            throw new NullPointerException("Null parameterKey");
        }
        this.f13014c = str2;
        if (str3 == null) {
            throw new NullPointerException("Null parameterValue");
        }
        this.f13015d = str3;
        if (str4 == null) {
            throw new NullPointerException("Null variantId");
        }
        this.f13016e = str4;
        this.f13017f = j9;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            b bVar = (b) ((n) obj);
            if (this.f13013b.equals(bVar.f13013b) && this.f13014c.equals(bVar.f13014c) && this.f13015d.equals(bVar.f13015d) && this.f13016e.equals(bVar.f13016e) && this.f13017f == bVar.f13017f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f13013b.hashCode() ^ 1000003) * 1000003) ^ this.f13014c.hashCode()) * 1000003) ^ this.f13015d.hashCode()) * 1000003) ^ this.f13016e.hashCode()) * 1000003;
        long j9 = this.f13017f;
        return ((int) ((j9 >>> 32) ^ j9)) ^ iHashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutId=");
        sb2.append(this.f13013b);
        sb2.append(", parameterKey=");
        sb2.append(this.f13014c);
        sb2.append(", parameterValue=");
        sb2.append(this.f13015d);
        sb2.append(", variantId=");
        sb2.append(this.f13016e);
        sb2.append(", templateVersion=");
        return a1.b.k(this.f13017f, "}", sb2);
    }
}
