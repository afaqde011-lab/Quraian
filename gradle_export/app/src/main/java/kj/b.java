package kj;

import com.google.android.gms.internal.measurement.x5;
import e4.f;
import oi.k;

public final class b {

    public static final int f9691h = 0;

    public final String f9692a;

    public final int f9693b;

    public final String f9694c;

    public final String f9695d;

    public final long f9696e;

    public final long f9697f;

    public final String f9698g;

    static {
        byte b7 = (byte) (((byte) (0 | 2)) | 1);
        if (b7 == 3) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        if ((b7 & 1) == 0) {
            sb2.append(" expiresInSecs");
        }
        if ((b7 & 2) == 0) {
            sb2.append(" tokenCreationEpochInSecs");
        }
        throw new IllegalStateException(k.j("Missing required properties:", sb2));
    }

    public b(String str, int i10, String str2, String str3, long j9, long j10, String str4) {
        this.f9692a = str;
        this.f9693b = i10;
        this.f9694c = str2;
        this.f9695d = str3;
        this.f9696e = j9;
        this.f9697f = j10;
        this.f9698g = str4;
    }

    public final a a() {
        a aVar = new a();
        aVar.f9683a = this.f9692a;
        aVar.f9684b = this.f9693b;
        aVar.f9685c = this.f9694c;
        aVar.f9686d = this.f9695d;
        aVar.f9687e = this.f9696e;
        aVar.f9688f = this.f9697f;
        aVar.f9689g = this.f9698g;
        aVar.f9690h = (byte) 3;
        return aVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        String str = bVar.f9698g;
        String str2 = bVar.f9695d;
        String str3 = bVar.f9694c;
        String str4 = bVar.f9692a;
        String str5 = this.f9692a;
        if (str5 == null) {
            if (str4 != null) {
                return false;
            }
        } else if (!str5.equals(str4)) {
            return false;
        }
        if (!f.a(this.f9693b, bVar.f9693b)) {
            return false;
        }
        String str6 = this.f9694c;
        if (str6 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str6.equals(str3)) {
            return false;
        }
        String str7 = this.f9695d;
        if (str7 == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str7.equals(str2)) {
            return false;
        }
        if (this.f9696e != bVar.f9696e || this.f9697f != bVar.f9697f) {
            return false;
        }
        String str8 = this.f9698g;
        if (str8 == null) {
            return str == null;
        }
        return str8.equals(str);
    }

    public final int hashCode() {
        String str = this.f9692a;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ f.b(this.f9693b)) * 1000003;
        String str2 = this.f9694c;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f9695d;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j9 = this.f9696e;
        int i10 = (iHashCode3 ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003;
        long j10 = this.f9697f;
        int i11 = (i10 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        String str4 = this.f9698g;
        return i11 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb2.append(this.f9692a);
        sb2.append(", registrationStatus=");
        int i10 = this.f9693b;
        if (i10 == 1) {
            str = "ATTEMPT_MIGRATION";
        } else if (i10 == 2) {
            str = "NOT_GENERATED";
        } else if (i10 == 3) {
            str = "UNREGISTERED";
        } else if (i10 != 4) {
            str = i10 != 5 ? "null" : "REGISTER_ERROR";
        } else {
            str = "REGISTERED";
        }
        sb2.append(str);
        sb2.append(", authToken=");
        sb2.append(this.f9694c);
        sb2.append(", refreshToken=");
        sb2.append(this.f9695d);
        sb2.append(", expiresInSecs=");
        sb2.append(this.f9696e);
        sb2.append(", tokenCreationEpochInSecs=");
        sb2.append(this.f9697f);
        sb2.append(", fisError=");
        return x5.n(sb2, this.f9698g, "}");
    }
}
