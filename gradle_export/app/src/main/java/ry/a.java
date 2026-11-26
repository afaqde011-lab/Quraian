package ry;

import com.google.android.gms.internal.measurement.x5;
import kotlin.jvm.internal.m;
import oi.k;

public final class a {
    public final String a;
    public final String b;
    public final e c;
    public final String d;
    public final String e;
    public final boolean f;
    public final String g;
    public final String h;

    public a(String str, String name, e eVar, String str2, String str3, boolean z, String str4, String str5) {
        m.e(name, "name");
        this.a = str;
        this.b = name;
        this.c = eVar;
        this.d = str2;
        this.e = str3;
        this.f = z;
        this.g = str4;
        this.h = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return m.a(this.a, aVar.a) && m.a(this.b, aVar.b) && this.c == aVar.c && m.a(this.d, aVar.d) && m.a(this.e, aVar.e) && this.f == aVar.f && m.a(this.g, aVar.g) && m.a(this.h, aVar.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + x5.e(w.c.e(x5.e(x5.e((this.c.hashCode() + x5.e(this.a.hashCode() * 31, this.b, 31)) * 31, this.d, 31), this.e, 31), 31, this.f), this.g, 31);
    }

    public final String toString() {
        StringBuilder sbS = a1.b.s("AuthDeviceDvo(id=", this.a, ", name=", this.b, ", kind=");
        sbS.append(this.c);
        sbS.append(", lastSeenText=");
        sbS.append(this.d);
        sbS.append(", lastSeenDate=");
        sbS.append(this.e);
        sbS.append(", isCurrent=");
        sbS.append(this.f);
        sbS.append(", location=");
        return k.m(sbS, this.g, ", application=", this.h, ")");
    }
}
