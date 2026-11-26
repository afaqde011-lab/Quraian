package ha;

import a10.h0;
import java.util.Locale;
import kotlin.jvm.internal.m;
import r30.k;
import r30.l;

public final class f {

    public final String f6942a;

    public final String f6943b;

    public final boolean f6944c;

    public final int f6945d;

    public final String f6946e;

    public final int f6947f;

    public final int f6948g;

    public f(int i10, int i11, String str, String str2, String str3, boolean z10) {
        m.e(str, "name");
        m.e(str2, "type");
        this.f6942a = str;
        this.f6943b = str2;
        this.f6944c = z10;
        this.f6945d = i10;
        this.f6946e = str3;
        this.f6947f = i11;
        String upperCase = str2.toUpperCase(Locale.ROOT);
        m.d(upperCase, "toUpperCase(...)");
        this.f6948g = k.A0(upperCase, "INT", false) ? 3 : (k.A0(upperCase, "CHAR", false) || k.A0(upperCase, "CLOB", false) || k.A0(upperCase, "TEXT", false)) ? 2 : k.A0(upperCase, "BLOB", false) ? 5 : (k.A0(upperCase, "REAL", false) || k.A0(upperCase, "FLOA", false) || k.A0(upperCase, "DOUB", false)) ? 4 : 1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f) {
                boolean z10 = this.f6945d > 0;
                f fVar = (f) obj;
                int i10 = fVar.f6947f;
                if (z10 == (fVar.f6945d > 0) && m.a(this.f6942a, fVar.f6942a) && this.f6944c == fVar.f6944c) {
                    String str = fVar.f6946e;
                    int i11 = this.f6947f;
                    String str2 = this.f6946e;
                    if ((i11 != 1 || i10 != 2 || str2 == null || h0.u(str2, str)) && ((i11 != 2 || i10 != 1 || str == null || h0.u(str, str2)) && ((i11 == 0 || i11 != i10 || (str2 == null ? str == null : h0.u(str2, str))) && this.f6948g == fVar.f6948g))) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.f6942a.hashCode() * 31) + this.f6948g) * 31) + (this.f6944c ? 1231 : 1237)) * 31) + this.f6945d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("\n            |Column {\n            |   name = '");
        sb2.append(this.f6942a);
        sb2.append("',\n            |   type = '");
        sb2.append(this.f6943b);
        sb2.append("',\n            |   affinity = '");
        sb2.append(this.f6948g);
        sb2.append("',\n            |   notNull = '");
        sb2.append(this.f6944c);
        sb2.append("',\n            |   primaryKeyPosition = '");
        sb2.append(this.f6945d);
        sb2.append("',\n            |   defaultValue = '");
        String str = this.f6946e;
        if (str == null) {
            str = "undefined";
        }
        sb2.append(str);
        sb2.append("'\n            |}\n        ");
        return l.i0(l.k0(sb2.toString()), "    ");
    }
}
