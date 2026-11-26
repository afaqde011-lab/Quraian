package bx;

import com.google.android.gms.internal.measurement.x5;
import kotlin.jvm.internal.m;

public final class e {
    public final String a;
    public final String b;
    public final String c;

    public e(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return m.a(this.a, eVar.a) && m.a(this.b, eVar.b) && m.a(this.c, eVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + x5.e(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return x5.n(a1.b.s("SocialLink(platform=", this.a, ", url=", this.b, ", label="), this.c, ")");
    }
}
