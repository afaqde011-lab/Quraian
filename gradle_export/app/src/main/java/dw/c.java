package dw;

import com.google.android.gms.internal.measurement.x5;
import kotlin.jvm.internal.m;

public final class c {
    public final int a;
    public final String b;
    public final String c;
    public final boolean d;

    public c(int i, String str, String str2, boolean z) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.a == cVar.a && m.a(this.b, cVar.b) && m.a(this.c, cVar.c) && this.d == cVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + x5.e(x5.e(Integer.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        StringBuilder sbM = g4.c.m("PlaylistReciter(id=", this.a, ", name=", this.b, ", photoUrl=");
        sbM.append(this.c);
        sbM.append(", isNew=");
        sbM.append(this.d);
        sbM.append(")");
        return sbM.toString();
    }
}
