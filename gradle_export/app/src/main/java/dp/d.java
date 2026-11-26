package dp;

import com.google.android.gms.internal.measurement.x5;
import kotlin.jvm.internal.m;
import oi.k;

public final class d implements e {
    public final ep.e a;
    public final String b;
    public final String c;
    public final String d;

    public d(ep.e method, String idToken, String code, String name) {
        m.e(method, "method");
        m.e(idToken, "idToken");
        m.e(code, "code");
        m.e(name, "name");
        this.a = method;
        this.b = idToken;
        this.c = code;
        this.d = name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.a == dVar.a && m.a(this.b, dVar.b) && m.a(this.c, dVar.c) && m.a(this.d, dVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + x5.e(x5.e(this.a.hashCode() * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OAuthRegistration(method=");
        sb.append(this.a);
        sb.append(", idToken=");
        sb.append(this.b);
        sb.append(", code=");
        return k.m(sb, this.c, ", name=", this.d, ")");
    }
}
