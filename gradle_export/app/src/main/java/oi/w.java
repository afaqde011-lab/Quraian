package oi;

public final class w {

    public final String f12058a;

    public final String f12059b;

    public w(String str, String str2) {
        this.f12058a = str;
        this.f12059b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return kotlin.jvm.internal.m.a(this.f12058a, wVar.f12058a) && kotlin.jvm.internal.m.a(this.f12059b, wVar.f12059b);
    }

    public final int hashCode() {
        String str = this.f12058a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f12059b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FirebaseInstallationId(fid=");
        sb2.append(this.f12058a);
        sb2.append(", authToken=");
        return g4.c.k(sb2, this.f12059b, ')');
    }
}
