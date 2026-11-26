package ys;

import com.google.android.gms.internal.measurement.x5;

public final class f {
    public final c a;
    public final int b;
    public final String c;
    public final String d;
    public final int e;
    public final int f;

    public f(c selectedPeriod, int i, String str, String str2, int i2, int i3) {
        kotlin.jvm.internal.m.e(selectedPeriod, "selectedPeriod");
        this.a = selectedPeriod;
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = i2;
        this.f = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.a == fVar.a && this.b == fVar.b && kotlin.jvm.internal.m.a(this.c, fVar.c) && kotlin.jvm.internal.m.a(this.d, fVar.d) && this.e == fVar.e && this.f == fVar.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + w.c.d(this.e, x5.e(x5.e(w.c.d(this.b, this.a.hashCode() * 31, 31), this.c, 31), this.d, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InsightsTopReciterDvo(selectedPeriod=");
        sb.append(this.a);
        sb.append(", reciterId=");
        sb.append(this.b);
        sb.append(", reciterName=");
        a1.b.z(sb, this.c, ", reciterPhotoUrl=", this.d, ", minutes=");
        sb.append(this.e);
        sb.append(", surahCount=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
