package ri;

import com.google.android.gms.internal.measurement.x5;

public final class k0 extends u1 {

    public final String f13414a;

    public final String f13415b;

    public final String f13416c;

    public final String f13417d;

    public final String f13418e;

    public final String f13419f;

    public k0(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f13414a = str;
        this.f13415b = str2;
        this.f13416c = str3;
        this.f13417d = str4;
        this.f13418e = str5;
        this.f13419f = str6;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        if (obj == this) {
            return true;
        }
        if (obj instanceof u1) {
            k0 k0Var = (k0) ((u1) obj);
            String str5 = k0Var.f13419f;
            String str6 = k0Var.f13418e;
            String str7 = k0Var.f13417d;
            String str8 = k0Var.f13416c;
            if (this.f13414a.equals(k0Var.f13414a) && this.f13415b.equals(k0Var.f13415b) && ((str = this.f13416c) != null ? str.equals(str8) : str8 == null) && ((str2 = this.f13417d) != null ? str2.equals(str7) : str7 == null) && ((str3 = this.f13418e) != null ? str3.equals(str6) : str6 == null) && ((str4 = this.f13419f) != null ? str4.equals(str5) : str5 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f13414a.hashCode() ^ 1000003) * 1000003) ^ this.f13415b.hashCode()) * 1000003;
        String str = this.f13416c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * (-721379959);
        String str2 = this.f13417d;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f13418e;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f13419f;
        return iHashCode4 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Application{identifier=");
        sb2.append(this.f13414a);
        sb2.append(", version=");
        sb2.append(this.f13415b);
        sb2.append(", displayVersion=");
        sb2.append(this.f13416c);
        sb2.append(", organization=null, installationUuid=");
        sb2.append(this.f13417d);
        sb2.append(", developmentPlatform=");
        sb2.append(this.f13418e);
        sb2.append(", developmentPlatformVersion=");
        return x5.n(sb2, this.f13419f, "}");
    }
}
