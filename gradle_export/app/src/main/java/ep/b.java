package ep;

import com.google.android.gms.internal.measurement.x5;

public final class b {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final String g;
    public final String h;

    public b(String str, String str2, String str3, String str4, String str5, boolean z, String str6, String str7) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = z;
        this.g = str6;
        this.h = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return kotlin.jvm.internal.m.a(this.a, bVar.a) && kotlin.jvm.internal.m.a(this.b, bVar.b) && kotlin.jvm.internal.m.a(this.c, bVar.c) && kotlin.jvm.internal.m.a(this.d, bVar.d) && kotlin.jvm.internal.m.a(this.e, bVar.e) && this.f == bVar.f && kotlin.jvm.internal.m.a(this.g, bVar.g) && kotlin.jvm.internal.m.a(this.h, bVar.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + x5.e(w.c.e(x5.e(x5.e(x5.e(x5.e(this.a.hashCode() * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31), 31, this.f), this.g, 31);
    }

    public final String toString() {
        StringBuilder sbS = a1.b.s("AuthDevice(id=", this.a, ", type=", this.b, ", name=");
        a1.b.z(sbS, this.c, ", createdAt=", this.d, ", lastSeenAt=");
        sbS.append(this.e);
        sbS.append(", isCurrent=");
        sbS.append(this.f);
        sbS.append(", location=");
        return oi.k.m(sbS, this.g, ", application=", this.h, ")");
    }
}
