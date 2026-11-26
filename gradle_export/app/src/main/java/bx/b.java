package bx;

import com.google.android.gms.internal.measurement.x5;
import kotlin.jvm.internal.m;

public final class b {
    public final int a;
    public final String b;
    public final String c;
    public final int d;
    public final u30.b e;

    public b(int i, String str, String str2, int i2, u30.b surahList) {
        m.e(surahList, "surahList");
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = i2;
        this.e = surahList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && m.a(this.b, bVar.b) && m.a(this.c, bVar.c) && this.d == bVar.d && m.a(this.e, bVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + w.c.d(this.d, x5.e(x5.e(Integer.hashCode(this.a) * 31, this.b, 31), this.c, 31), 31);
    }

    public final String toString() {
        StringBuilder sbM = g4.c.m("Moshaf(id=", this.a, ", name=", this.b, ", server=");
        sbM.append(this.c);
        sbM.append(", moshafType=");
        sbM.append(this.d);
        sbM.append(", surahList=");
        sbM.append(this.e);
        sbM.append(")");
        return sbM.toString();
    }
}
