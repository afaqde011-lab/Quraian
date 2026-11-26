package ep;

import com.google.android.gms.internal.measurement.x5;
import h00.x;
import java.util.ArrayList;
import java.util.List;

public final class h {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final List g;
    public final String h;
    public final String i;
    public final String j;
    public final Boolean k;

    public h(String str, String str2, String str3, String str4, String str5, String str6, ArrayList arrayList, Boolean bool, int i) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? x.A : arrayList, "", "", "", (i & 1024) != 0 ? null : bool);
    }

    public h(String id, String email, String emailVerifiedAt, String username, String sex, String birthDate, List providers, String str, String str2, String str3, Boolean bool) {
        kotlin.jvm.internal.m.e(id, "id");
        kotlin.jvm.internal.m.e(email, "email");
        kotlin.jvm.internal.m.e(emailVerifiedAt, "emailVerifiedAt");
        kotlin.jvm.internal.m.e(username, "username");
        kotlin.jvm.internal.m.e(sex, "sex");
        kotlin.jvm.internal.m.e(birthDate, "birthDate");
        kotlin.jvm.internal.m.e(providers, "providers");
        this.a = id;
        this.b = email;
        this.c = emailVerifiedAt;
        this.d = username;
        this.e = sex;
        this.f = birthDate;
        this.g = providers;
        this.h = str;
        this.i = str2;
        this.j = str3;
        this.k = bool;
    }

    public static h a(h hVar, String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, int i) {
        String id = hVar.a;
        String email = hVar.b;
        String emailVerifiedAt = hVar.c;
        if ((i & 8) != 0) {
            str = hVar.d;
        }
        String username = str;
        if ((i & 16) != 0) {
            str2 = hVar.e;
        }
        String sex = str2;
        String birthDate = (i & 32) != 0 ? hVar.f : str3;
        List providers = hVar.g;
        String purchaseDeviceName = (i & 128) != 0 ? hVar.h : str4;
        String purchaseDeviceCity = (i & 256) != 0 ? hVar.i : str5;
        String purchaseDeviceCountry = (i & 512) != 0 ? hVar.j : str6;
        Boolean bool2 = (i & 1024) != 0 ? hVar.k : bool;
        hVar.getClass();
        kotlin.jvm.internal.m.e(id, "id");
        kotlin.jvm.internal.m.e(email, "email");
        kotlin.jvm.internal.m.e(emailVerifiedAt, "emailVerifiedAt");
        kotlin.jvm.internal.m.e(username, "username");
        kotlin.jvm.internal.m.e(sex, "sex");
        kotlin.jvm.internal.m.e(birthDate, "birthDate");
        kotlin.jvm.internal.m.e(providers, "providers");
        kotlin.jvm.internal.m.e(purchaseDeviceName, "purchaseDeviceName");
        kotlin.jvm.internal.m.e(purchaseDeviceCity, "purchaseDeviceCity");
        kotlin.jvm.internal.m.e(purchaseDeviceCountry, "purchaseDeviceCountry");
        return new h(id, email, emailVerifiedAt, username, sex, birthDate, providers, purchaseDeviceName, purchaseDeviceCity, purchaseDeviceCountry, bool2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return kotlin.jvm.internal.m.a(this.a, hVar.a) && kotlin.jvm.internal.m.a(this.b, hVar.b) && kotlin.jvm.internal.m.a(this.c, hVar.c) && kotlin.jvm.internal.m.a(this.d, hVar.d) && kotlin.jvm.internal.m.a(this.e, hVar.e) && kotlin.jvm.internal.m.a(this.f, hVar.f) && kotlin.jvm.internal.m.a(this.g, hVar.g) && kotlin.jvm.internal.m.a(this.h, hVar.h) && kotlin.jvm.internal.m.a(this.i, hVar.i) && kotlin.jvm.internal.m.a(this.j, hVar.j) && kotlin.jvm.internal.m.a(this.k, hVar.k);
    }

    public final int hashCode() {
        int iE = x5.e(x5.e(x5.e(g4.c.a(x5.e(x5.e(x5.e(x5.e(x5.e(this.a.hashCode() * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31), this.f, 31), 31, this.g), this.h, 31), this.i, 31), this.j, 31);
        Boolean bool = this.k;
        return iE + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sbS = a1.b.s("AuthUser(id=", this.a, ", email=", this.b, ", emailVerifiedAt=");
        a1.b.z(sbS, this.c, ", username=", this.d, ", sex=");
        a1.b.z(sbS, this.e, ", birthDate=", this.f, ", providers=");
        sbS.append(this.g);
        sbS.append(", purchaseDeviceName=");
        sbS.append(this.h);
        sbS.append(", purchaseDeviceCity=");
        a1.b.z(sbS, this.i, ", purchaseDeviceCountry=", this.j, ", hasData=");
        sbS.append(this.k);
        sbS.append(")");
        return sbS.toString();
    }
}
