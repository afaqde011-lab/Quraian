package ep;

import com.google.android.gms.internal.measurement.x5;

public final class o implements p {
    public final e a;
    public final String b;
    public final String c;
    public final String d;

    public o(e method, String idToken, String code, String name) {
        kotlin.jvm.internal.m.e(method, "method");
        kotlin.jvm.internal.m.e(idToken, "idToken");
        kotlin.jvm.internal.m.e(code, "code");
        kotlin.jvm.internal.m.e(name, "name");
        this.a = method;
        this.b = idToken;
        this.c = code;
        this.d = name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.a == oVar.a && kotlin.jvm.internal.m.a(this.b, oVar.b) && kotlin.jvm.internal.m.a(this.c, oVar.c) && kotlin.jvm.internal.m.a(this.d, oVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + x5.e(x5.e(this.a.hashCode() * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NeedsRegistration(method=");
        sb.append(this.a);
        sb.append(", idToken=");
        sb.append(this.b);
        sb.append(", code=");
        return oi.k.m(sb, this.c, ", name=", this.d, ")");
    }
}
