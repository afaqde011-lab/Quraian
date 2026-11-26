package bx;

import com.google.android.gms.internal.measurement.x5;
import kotlin.jvm.internal.m;
import oi.k;

public final class d {
    public final int a;
    public final u30.b b;
    public final String c;
    public final String d;

    public d(int i, u30.b reciters, String str, String str2) {
        m.e(reciters, "reciters");
        this.a = i;
        this.b = reciters;
        this.c = str;
        this.d = str2;
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
        return this.d.hashCode() + x5.e(g4.c.c(this.b, Integer.hashCode(this.a) * 31, 31), this.c, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReciterCollection(id=");
        sb.append(this.a);
        sb.append(", reciters=");
        sb.append(this.b);
        sb.append(", slug=");
        return k.m(sb, this.c, ", title=", this.d, ")");
    }
}
