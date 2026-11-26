package ys;

import com.google.android.gms.internal.measurement.x5;

public final class d {
    public final int a;
    public final String b;
    public final String c;

    public d(String name, int i, String str) {
        kotlin.jvm.internal.m.e(name, "name");
        this.a = i;
        this.b = name;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.a == dVar.a && kotlin.jvm.internal.m.a(this.b, dVar.b) && kotlin.jvm.internal.m.a(this.c, dVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + x5.e(Integer.hashCode(this.a) * 31, this.b, 31);
    }

    public final String toString() {
        return x5.n(g4.c.m("InsightsSurahDvo(surahNumber=", this.a, ", name=", this.b, ", arabicName="), this.c, ")");
    }
}
