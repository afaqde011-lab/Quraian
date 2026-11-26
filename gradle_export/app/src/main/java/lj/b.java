package lj;

import e4.f;

public final class b {

    public final String f10303a;

    public final long f10304b;

    public final int f10305c;

    public b(String str, long j9, int i10) {
        this.f10303a = str;
        this.f10304b = j9;
        this.f10305c = i10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        int i10 = bVar.f10305c;
        String str = bVar.f10303a;
        String str2 = this.f10303a;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (this.f10304b != bVar.f10304b) {
            return false;
        }
        int i11 = this.f10305c;
        if (i11 == 0) {
            return i10 == 0;
        }
        return f.a(i11, i10);
    }

    public final int hashCode() {
        String str = this.f10303a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j9 = this.f10304b;
        int i10 = (((iHashCode ^ 1000003) * 1000003) ^ ((int) ((j9 >>> 32) ^ j9))) * 1000003;
        int i11 = this.f10305c;
        return i10 ^ (i11 != 0 ? f.b(i11) : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("TokenResult{token=");
        sb2.append(this.f10303a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f10304b);
        sb2.append(", responseCode=");
        int i10 = this.f10305c;
        if (i10 == 1) {
            str = "OK";
        } else if (i10 != 2) {
            str = i10 != 3 ? "null" : "AUTH_ERROR";
        } else {
            str = "BAD_CONFIG";
        }
        sb2.append(str);
        sb2.append("}");
        return sb2.toString();
    }
}
