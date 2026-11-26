package ri;

public final class e1 extends h2 {

    public final g2 f13328a;

    public final String f13329b;

    public final String f13330c;

    public final long f13331d;

    public e1(f1 f1Var, String str, String str2, long j9) {
        this.f13328a = f1Var;
        this.f13329b = str;
        this.f13330c = str2;
        this.f13331d = j9;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h2) {
            e1 e1Var = (e1) ((h2) obj);
            if (this.f13328a.equals(e1Var.f13328a) && this.f13329b.equals(e1Var.f13329b) && this.f13330c.equals(e1Var.f13330c) && this.f13331d == e1Var.f13331d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((this.f13328a.hashCode() ^ 1000003) * 1000003) ^ this.f13329b.hashCode()) * 1000003) ^ this.f13330c.hashCode()) * 1000003;
        long j9 = this.f13331d;
        return ((int) ((j9 >>> 32) ^ j9)) ^ iHashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb2.append(this.f13328a);
        sb2.append(", parameterKey=");
        sb2.append(this.f13329b);
        sb2.append(", parameterValue=");
        sb2.append(this.f13330c);
        sb2.append(", templateVersion=");
        return a1.b.k(this.f13331d, "}", sb2);
    }
}
