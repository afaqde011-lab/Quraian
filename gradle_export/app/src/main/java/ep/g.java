package ep;

import com.google.android.gms.internal.measurement.x5;

public final class g {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final h e;

    public g(String str, String str2, String str3, int i, h hVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = hVar;
    }

    public static g a(g gVar, h user) {
        String str = gVar.a;
        String str2 = gVar.b;
        String str3 = gVar.c;
        int i = gVar.d;
        gVar.getClass();
        kotlin.jvm.internal.m.e(user, "user");
        return new g(str, str2, str3, i, user);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return kotlin.jvm.internal.m.a(this.a, gVar.a) && kotlin.jvm.internal.m.a(this.b, gVar.b) && kotlin.jvm.internal.m.a(this.c, gVar.c) && this.d == gVar.d && kotlin.jvm.internal.m.a(this.e, gVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + w.c.d(this.d, x5.e(x5.e(this.a.hashCode() * 31, this.b, 31), this.c, 31), 31);
    }

    public final String toString() {
        StringBuilder sbS = a1.b.s("AuthTokens(accessToken=", this.a, ", refreshToken=", this.b, ", tokenType=");
        sbS.append(this.c);
        sbS.append(", expiresIn=");
        sbS.append(this.d);
        sbS.append(", user=");
        sbS.append(this.e);
        sbS.append(")");
        return sbS.toString();
    }
}
