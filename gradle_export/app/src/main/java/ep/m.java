package ep;

import com.google.android.gms.internal.measurement.x5;

public final class m {
    public final String a;
    public final String b;
    public final String c;

    public m(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return kotlin.jvm.internal.m.a(this.a, mVar.a) && kotlin.jvm.internal.m.a(this.b, mVar.b) && kotlin.jvm.internal.m.a(this.c, mVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + x5.e(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return x5.n(a1.b.s("GoogleAuthData(idToken=", this.a, ", email=", this.b, ", name="), this.c, ")");
    }
}
