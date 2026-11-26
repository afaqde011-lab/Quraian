package wd;

public final class o extends a0 {

    public final r f16044a;

    public o(r rVar) {
        z zVar = z.A;
        this.f16044a = rVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        if (!this.f16044a.equals(((o) ((a0) obj)).f16044a)) {
            return false;
        }
        Object obj2 = z.A;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        return ((this.f16044a.hashCode() ^ 1000003) * 1000003) ^ z.A.hashCode();
    }

    public final String toString() {
        return "ComplianceData{privacyContext=" + this.f16044a + ", productIdOrigin=" + z.A + "}";
    }
}
