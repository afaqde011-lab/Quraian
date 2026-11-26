package ri;

public final class p0 extends j2 {

    public final long f13488a;

    public final String f13489b;

    public final d2 f13490c;

    public final e2 f13491d;

    public final f2 f13492e;

    public final i2 f13493f;

    public p0(long j9, String str, d2 d2Var, e2 e2Var, f2 f2Var, i2 i2Var) {
        this.f13488a = j9;
        this.f13489b = str;
        this.f13490c = d2Var;
        this.f13491d = e2Var;
        this.f13492e = f2Var;
        this.f13493f = i2Var;
    }

    public final o0 a() {
        o0 o0Var = new o0();
        o0Var.f13477a = this.f13488a;
        o0Var.f13478b = this.f13489b;
        o0Var.f13479c = this.f13490c;
        o0Var.f13480d = this.f13491d;
        o0Var.f13481e = this.f13492e;
        o0Var.f13482f = this.f13493f;
        o0Var.f13483g = (byte) 1;
        return o0Var;
    }

    public final boolean equals(Object obj) {
        f2 f2Var;
        i2 i2Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof j2) {
            p0 p0Var = (p0) ((j2) obj);
            i2 i2Var2 = p0Var.f13493f;
            f2 f2Var2 = p0Var.f13492e;
            if (this.f13488a == p0Var.f13488a && this.f13489b.equals(p0Var.f13489b) && this.f13490c.equals(p0Var.f13490c) && this.f13491d.equals(p0Var.f13491d) && ((f2Var = this.f13492e) != null ? f2Var.equals(f2Var2) : f2Var2 == null) && ((i2Var = this.f13493f) != null ? i2Var.equals(i2Var2) : i2Var2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j9 = this.f13488a;
        int iHashCode = (((((((((int) ((j9 >>> 32) ^ j9)) ^ 1000003) * 1000003) ^ this.f13489b.hashCode()) * 1000003) ^ this.f13490c.hashCode()) * 1000003) ^ this.f13491d.hashCode()) * 1000003;
        f2 f2Var = this.f13492e;
        int iHashCode2 = (iHashCode ^ (f2Var == null ? 0 : f2Var.hashCode())) * 1000003;
        i2 i2Var = this.f13493f;
        return iHashCode2 ^ (i2Var != null ? i2Var.hashCode() : 0);
    }

    public final String toString() {
        return "Event{timestamp=" + this.f13488a + ", type=" + this.f13489b + ", app=" + this.f13490c + ", device=" + this.f13491d + ", log=" + this.f13492e + ", rollouts=" + this.f13493f + "}";
    }
}
