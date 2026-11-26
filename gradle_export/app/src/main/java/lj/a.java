package lj;

import e4.f;

public final class a {

    public final String f10298a;

    public final String f10299b;

    public final String f10300c;

    public final b f10301d;

    public final int f10302e;

    public a(String str, String str2, String str3, b bVar, int i10) {
        this.f10298a = str;
        this.f10299b = str2;
        this.f10300c = str3;
        this.f10301d = bVar;
        this.f10302e = i10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        int i10 = aVar.f10302e;
        b bVar = aVar.f10301d;
        String str = aVar.f10300c;
        String str2 = aVar.f10299b;
        String str3 = aVar.f10298a;
        String str4 = this.f10298a;
        if (str4 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str4.equals(str3)) {
            return false;
        }
        String str5 = this.f10299b;
        if (str5 == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str5.equals(str2)) {
            return false;
        }
        String str6 = this.f10300c;
        if (str6 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str6.equals(str)) {
            return false;
        }
        b bVar2 = this.f10301d;
        if (bVar2 == null) {
            if (bVar != null) {
                return false;
            }
        } else if (!bVar2.equals(bVar)) {
            return false;
        }
        int i11 = this.f10302e;
        if (i11 == 0) {
            return i10 == 0;
        }
        return f.a(i11, i10);
    }

    public final int hashCode() {
        String str = this.f10298a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f10299b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f10300c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        b bVar = this.f10301d;
        int iHashCode4 = (iHashCode3 ^ (bVar == null ? 0 : bVar.hashCode())) * 1000003;
        int i10 = this.f10302e;
        return iHashCode4 ^ (i10 != 0 ? f.b(i10) : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("InstallationResponse{uri=");
        sb2.append(this.f10298a);
        sb2.append(", fid=");
        sb2.append(this.f10299b);
        sb2.append(", refreshToken=");
        sb2.append(this.f10300c);
        sb2.append(", authToken=");
        sb2.append(this.f10301d);
        sb2.append(", responseCode=");
        int i10 = this.f10302e;
        if (i10 != 1) {
            str = i10 != 2 ? "null" : "BAD_CONFIG";
        } else {
            str = "OK";
        }
        sb2.append(str);
        sb2.append("}");
        return sb2.toString();
    }
}
