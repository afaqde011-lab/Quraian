package qr;

import com.google.android.gms.internal.measurement.x5;

public final class k implements l {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final u30.b f;

    public k(String key, String str, String str2, String str3, boolean z, u30.b reciters) {
        kotlin.jvm.internal.m.e(key, "key");
        kotlin.jvm.internal.m.e(reciters, "reciters");
        this.a = key;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = reciters;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return kotlin.jvm.internal.m.a(this.a, kVar.a) && this.b.equals(kVar.b) && this.c.equals(kVar.c) && this.d.equals(kVar.d) && this.e == kVar.e && kotlin.jvm.internal.m.a(this.f, kVar.f);
    }

    @Override
    public final String getKey() {
        return this.a;
    }

    public final int hashCode() {
        return this.f.hashCode() + w.c.e(x5.e(x5.e(x5.e(this.a.hashCode() * 31, this.b, 31), this.c, 31), this.d, 31), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbS = a1.b.s("Reciters(key=", this.a, ", slug=", this.b, ", title=");
        a1.b.z(sbS, this.c, ", seeAllTitle=", this.d, ", isFavourites=");
        sbS.append(this.e);
        sbS.append(", reciters=");
        sbS.append(this.f);
        sbS.append(")");
        return sbS.toString();
    }
}
