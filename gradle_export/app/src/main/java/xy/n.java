package xy;

import android.os.Build;
import com.google.android.gms.internal.measurement.x5;

public final class n {
    public final String a;
    public final String b;
    public final String c;
    public final lm.a d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final String i;
    public final String j;
    public final String k;

    public n(String str, String str2, String str3, lm.a apiEnvironment, String str4, boolean z, boolean z2, boolean z3, String str5, String str6, String str7) {
        kotlin.jvm.internal.m.e(apiEnvironment, "apiEnvironment");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = apiEnvironment;
        this.e = str4;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = str5;
        this.j = str6;
        this.k = str7;
    }

    public static n a(n nVar, String str, String str2, boolean z, boolean z2, String str3, String str4, int i) {
        String str5 = Build.VERSION.RELEASE;
        lm.a aVar = lm.a.A;
        String str6 = (i & 1) != 0 ? nVar.a : "2.4.1";
        if ((i & 2) != 0) {
            str5 = nVar.b;
        }
        String androidVersion = str5;
        String str7 = (i & 4) != 0 ? nVar.c : str;
        if ((i & 8) != 0) {
            aVar = nVar.d;
        }
        lm.a apiEnvironment = aVar;
        String environmentBaseUrl = (i & 16) != 0 ? nVar.e : str2;
        boolean z3 = (i & 32) != 0 ? nVar.f : z;
        boolean z4 = (i & 64) != 0 ? nVar.g : false;
        boolean z5 = (i & 128) != 0 ? nVar.h : z2;
        String str8 = (i & 256) != 0 ? nVar.i : str3;
        String str9 = (i & 512) != 0 ? nVar.j : null;
        String str10 = (i & 1024) != 0 ? nVar.k : str4;
        nVar.getClass();
        kotlin.jvm.internal.m.e(androidVersion, "androidVersion");
        kotlin.jvm.internal.m.e(apiEnvironment, "apiEnvironment");
        kotlin.jvm.internal.m.e(environmentBaseUrl, "environmentBaseUrl");
        return new n(str6, androidVersion, str7, apiEnvironment, environmentBaseUrl, z3, z4, z5, str8, str9, str10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return kotlin.jvm.internal.m.a(this.a, nVar.a) && kotlin.jvm.internal.m.a(this.b, nVar.b) && kotlin.jvm.internal.m.a(this.c, nVar.c) && this.d == nVar.d && kotlin.jvm.internal.m.a(this.e, nVar.e) && this.f == nVar.f && this.g == nVar.g && this.h == nVar.h && kotlin.jvm.internal.m.a(this.i, nVar.i) && kotlin.jvm.internal.m.a(this.j, nVar.j) && kotlin.jvm.internal.m.a(this.k, nVar.k);
    }

    public final int hashCode() {
        int iE = x5.e(w.c.e(w.c.e(w.c.e(x5.e((this.d.hashCode() + x5.e(x5.e(this.a.hashCode() * 31, this.b, 31), this.c, 31)) * 31, this.e, 31), 31, this.f), 31, this.g), 31, this.h), this.i, 31);
        String str = this.j;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.k;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbS = a1.b.s("DebugControlsUiState(appVersion=", this.a, ", androidVersion=", this.b, ", deviceName=");
        sbS.append(this.c);
        sbS.append(", apiEnvironment=");
        sbS.append(this.d);
        sbS.append(", environmentBaseUrl=");
        sbS.append(this.e);
        sbS.append(", isClearAllDataDialogVisible=");
        sbS.append(this.f);
        sbS.append(", isDebugPremiumEnabled=");
        oi.k.y(sbS, this.g, ", hasRealPremium=", this.h, ", userId=");
        a1.b.z(sbS, this.i, ", debugCountryOverride=", this.j, ", storeCountry=");
        return x5.n(sbS, this.k, ")");
    }
}
