package oi;

import com.google.android.gms.internal.measurement.x5;

public final class c {

    public final String f11990a;

    public final String f11991b;

    public final String f11992c;

    public c(String str, String str2, String str3) {
        if (str == null) {
            throw new NullPointerException("Null crashlyticsInstallId");
        }
        this.f11990a = str;
        this.f11991b = str2;
        this.f11992c = str3;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            String str3 = cVar.f11992c;
            String str4 = cVar.f11991b;
            if (this.f11990a.equals(cVar.f11990a) && ((str = this.f11991b) != null ? str.equals(str4) : str4 == null) && ((str2 = this.f11992c) != null ? str2.equals(str3) : str3 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f11990a.hashCode() ^ 1000003) * 1000003;
        String str = this.f11991b;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f11992c;
        return iHashCode2 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallIds{crashlyticsInstallId=");
        sb2.append(this.f11990a);
        sb2.append(", firebaseInstallationId=");
        sb2.append(this.f11991b);
        sb2.append(", firebaseAuthenticationToken=");
        return x5.n(sb2, this.f11992c, "}");
    }
}
