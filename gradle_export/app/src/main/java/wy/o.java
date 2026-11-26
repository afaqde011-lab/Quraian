package wy;

import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.internal.measurement.x5;
import h00.d0;
import java.util.regex.Pattern;

public final class o {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final String f;
    public final int g;

    public o(String str, String str2, int i, String str3, boolean z, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = str5;
        this.g = i;
    }

    public static o a(o oVar, String str, String str2, String str3, String str4, boolean z, String str5, int i, int i2) {
        if ((i2 & 1) != 0) {
            str = oVar.a;
        }
        String currentPasswordValue = str;
        if ((i2 & 2) != 0) {
            str2 = oVar.b;
        }
        String str6 = str2;
        if ((i2 & 4) != 0) {
            str3 = oVar.c;
        }
        String passwordValue = str3;
        if ((i2 & 8) != 0) {
            str4 = oVar.d;
        }
        String confirmPasswordValue = str4;
        if ((i2 & 16) != 0) {
            z = oVar.e;
        }
        boolean z2 = z;
        if ((i2 & 32) != 0) {
            str5 = oVar.f;
        }
        String str7 = str5;
        if ((i2 & 64) != 0) {
            i = oVar.g;
        }
        oVar.getClass();
        kotlin.jvm.internal.m.e(currentPasswordValue, "currentPasswordValue");
        kotlin.jvm.internal.m.e(passwordValue, "passwordValue");
        kotlin.jvm.internal.m.e(confirmPasswordValue, "confirmPasswordValue");
        return new o(currentPasswordValue, str6, i, passwordValue, z2, confirmPasswordValue, str7);
    }

    public final boolean b() {
        String str = this.a;
        if (str.length() <= 0) {
            return false;
        }
        String str2 = this.c;
        return str2.length() > 0 && kotlin.jvm.internal.m.a(str2, str);
    }

    public final u30.f c() {
        ip.b bVar = ip.b.A;
        Pattern patternCompile = Pattern.compile(".*\\d.*");
        kotlin.jvm.internal.m.d(patternCompile, "compile(...)");
        String str = this.c;
        g00.k kVar = new g00.k(bVar, Boolean.valueOf(patternCompile.matcher(str).matches()));
        ip.b bVar2 = ip.b.B;
        Pattern patternCompile2 = Pattern.compile(".*[A-Z].*");
        kotlin.jvm.internal.m.d(patternCompile2, "compile(...)");
        g00.k kVar2 = new g00.k(bVar2, Boolean.valueOf(patternCompile2.matcher(str).matches()));
        ip.b bVar3 = ip.b.C;
        Pattern patternCompile3 = Pattern.compile("^.{8,}$");
        kotlin.jvm.internal.m.d(patternCompile3, "compile(...)");
        g00.k kVar3 = new g00.k(bVar3, Boolean.valueOf(patternCompile3.matcher(str).matches()));
        ip.b bVar4 = ip.b.D;
        Pattern patternCompile4 = Pattern.compile(".*[^A-Za-z0-9 ].*");
        kotlin.jvm.internal.m.d(patternCompile4, "compile(...)");
        return g4.g0(d0.R(kVar, kVar2, kVar3, new g00.k(bVar4, Boolean.valueOf(patternCompile4.matcher(str).matches()))));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return kotlin.jvm.internal.m.a(this.a, oVar.a) && kotlin.jvm.internal.m.a(this.b, oVar.b) && kotlin.jvm.internal.m.a(this.c, oVar.c) && kotlin.jvm.internal.m.a(this.d, oVar.d) && this.e == oVar.e && kotlin.jvm.internal.m.a(this.f, oVar.f) && this.g == oVar.g;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iE = w.c.e(x5.e(x5.e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, this.c, 31), this.d, 31), 31, this.e);
        String str2 = this.f;
        return Integer.hashCode(this.g) + ((iE + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbS = a1.b.s("ChangePasswordUiState(currentPasswordValue=", this.a, ", currentPasswordError=", this.b, ", passwordValue=");
        a1.b.z(sbS, this.c, ", confirmPasswordValue=", this.d, ", isLoading=");
        sbS.append(this.e);
        sbS.append(", submitError=");
        sbS.append(this.f);
        sbS.append(", errorShakeKey=");
        return g4.c.g(this.g, ")", sbS);
    }
}
