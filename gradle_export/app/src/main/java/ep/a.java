package ep;

import com.google.android.gms.internal.measurement.x5;

public final class a {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public a(String str, String str2, String email) {
        kotlin.jvm.internal.m.e(email, "email");
        this.a = str;
        this.b = str2;
        this.c = email;
        this.d = "";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return kotlin.jvm.internal.m.a(this.a, aVar.a) && kotlin.jvm.internal.m.a(this.b, aVar.b) && kotlin.jvm.internal.m.a(this.c, aVar.c) && kotlin.jvm.internal.m.a(this.d, aVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + x5.e(x5.e(this.a.hashCode() * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        return oi.k.m(a1.b.s("AppleAuthData(idToken=", this.a, ", code=", this.b, ", email="), this.c, ", name=", this.d, ")");
    }
}
