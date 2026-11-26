package ri;

public final class b0 extends n2 {

    public final String f13267b;

    public final String f13268c;

    public final int f13269d;

    public final String f13270e;

    public final String f13271f;

    public final String f13272g;

    public final String f13273h;

    public final String f13274i;

    public final String f13275j;

    public final m2 f13276k;
    public final s1 l;
    public final p1 m;

    public b0(String str, String str2, int i10, String str3, String str4, String str5, String str6, String str7, String str8, m2 m2Var, s1 s1Var, p1 p1Var) {
        this.f13267b = str;
        this.f13268c = str2;
        this.f13269d = i10;
        this.f13270e = str3;
        this.f13271f = str4;
        this.f13272g = str5;
        this.f13273h = str6;
        this.f13274i = str7;
        this.f13275j = str8;
        this.f13276k = m2Var;
        this.l = s1Var;
        this.m = p1Var;
    }

    public final a0 a() {
        a0 a0Var = new a0();
        a0Var.f13239a = this.f13267b;
        a0Var.f13240b = this.f13268c;
        a0Var.f13241c = this.f13269d;
        a0Var.f13242d = this.f13270e;
        a0Var.f13243e = this.f13271f;
        a0Var.f13244f = this.f13272g;
        a0Var.f13245g = this.f13273h;
        a0Var.f13246h = this.f13274i;
        a0Var.f13247i = this.f13275j;
        a0Var.f13248j = this.f13276k;
        a0Var.f13249k = this.l;
        a0Var.l = this.m;
        a0Var.m = (byte) 1;
        return a0Var;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        m2 m2Var;
        s1 s1Var;
        p1 p1Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof n2) {
            b0 b0Var = (b0) ((n2) obj);
            p1 p1Var2 = b0Var.m;
            s1 s1Var2 = b0Var.l;
            m2 m2Var2 = b0Var.f13276k;
            String str4 = b0Var.f13273h;
            String str5 = b0Var.f13272g;
            String str6 = b0Var.f13271f;
            if (this.f13267b.equals(b0Var.f13267b) && this.f13268c.equals(b0Var.f13268c) && this.f13269d == b0Var.f13269d && this.f13270e.equals(b0Var.f13270e) && ((str = this.f13271f) != null ? str.equals(str6) : str6 == null) && ((str2 = this.f13272g) != null ? str2.equals(str5) : str5 == null) && ((str3 = this.f13273h) != null ? str3.equals(str4) : str4 == null) && this.f13274i.equals(b0Var.f13274i) && this.f13275j.equals(b0Var.f13275j) && ((m2Var = this.f13276k) != null ? m2Var.equals(m2Var2) : m2Var2 == null) && ((s1Var = this.l) != null ? s1Var.equals(s1Var2) : s1Var2 == null) && ((p1Var = this.m) != null ? p1Var.equals(p1Var2) : p1Var2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f13267b.hashCode() ^ 1000003) * 1000003) ^ this.f13268c.hashCode()) * 1000003) ^ this.f13269d) * 1000003) ^ this.f13270e.hashCode()) * 1000003;
        String str = this.f13271f;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f13272g;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f13273h;
        int iHashCode4 = (((((iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ this.f13274i.hashCode()) * 1000003) ^ this.f13275j.hashCode()) * 1000003;
        m2 m2Var = this.f13276k;
        int iHashCode5 = (iHashCode4 ^ (m2Var == null ? 0 : m2Var.hashCode())) * 1000003;
        s1 s1Var = this.l;
        int iHashCode6 = (iHashCode5 ^ (s1Var == null ? 0 : s1Var.hashCode())) * 1000003;
        p1 p1Var = this.m;
        return iHashCode6 ^ (p1Var != null ? p1Var.hashCode() : 0);
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f13267b + ", gmpAppId=" + this.f13268c + ", platform=" + this.f13269d + ", installationUuid=" + this.f13270e + ", firebaseInstallationId=" + this.f13271f + ", firebaseAuthenticationToken=" + this.f13272g + ", appQualitySessionId=" + this.f13273h + ", buildVersion=" + this.f13274i + ", displayVersion=" + this.f13275j + ", session=" + this.f13276k + ", ndkPayload=" + this.l + ", appExitInfo=" + this.m + "}";
    }
}
