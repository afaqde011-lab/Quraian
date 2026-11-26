package ho;

import com.google.android.gms.internal.measurement.x5;
import java.util.List;

public final class g {
    public final int a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;
    public final String g;
    public final String h;
    public final boolean i;
    public final Long j;
    public final long k;
    public final boolean l;
    public final int m;
    public final List n;

    public g(int i, int i2, String str, String str2, String str3, long j, String str4, String str5, boolean z, Long l, long j2, boolean z2, int i3, List list) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = j;
        this.g = str4;
        this.h = str5;
        this.i = z;
        this.j = l;
        this.k = j2;
        this.l = z2;
        this.m = i3;
        this.n = list;
    }

    public static g a(g gVar, int i, String str, String str2, long j, String str3, long j2, boolean z, int i2, int i3) {
        int i4 = gVar.a;
        int i5 = (i3 & 2) != 0 ? gVar.b : i;
        String language = (i3 & 4) != 0 ? gVar.c : str;
        String str4 = gVar.d;
        String str5 = (i3 & 16) != 0 ? gVar.e : str2;
        long j3 = (i3 & 32) != 0 ? gVar.f : j;
        String str6 = gVar.g;
        String str7 = (i3 & 128) != 0 ? gVar.h : str3;
        boolean z2 = gVar.i;
        String str8 = str5;
        long j4 = j3;
        String str9 = str7;
        Long l = gVar.j;
        long j5 = (i3 & 1024) != 0 ? gVar.k : j2;
        boolean z3 = (i3 & 2048) != 0 ? gVar.l : z;
        int i6 = (i3 & 4096) != 0 ? gVar.m : i2;
        List list = gVar.n;
        kotlin.jvm.internal.m.e(language, "language");
        return new g(i4, i5, language, str4, str8, j4, str6, str9, z2, l, j5, z3, i6, list);
    }

    public final long b() {
        Long l = this.j;
        if (l != null) {
            return l.longValue();
        }
        return this.i ? Long.MAX_VALUE : 0L;
    }

    public final boolean c() {
        return !this.l && this.k > 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.a == gVar.a && this.b == gVar.b && kotlin.jvm.internal.m.a(this.c, gVar.c) && kotlin.jvm.internal.m.a(this.d, gVar.d) && kotlin.jvm.internal.m.a(this.e, gVar.e) && this.f == gVar.f && kotlin.jvm.internal.m.a(this.g, gVar.g) && kotlin.jvm.internal.m.a(this.h, gVar.h) && this.i == gVar.i && kotlin.jvm.internal.m.a(this.j, gVar.j) && this.k == gVar.k && this.l == gVar.l && this.m == gVar.m && kotlin.jvm.internal.m.a(this.n, gVar.n);
    }

    public final int hashCode() {
        int iF = w.c.f(x5.e(x5.e(x5.e(w.c.d(this.b, Integer.hashCode(this.a) * 31, 31), this.c, 31), this.d, 31), this.e, 31), this.f, 31);
        String str = this.g;
        int iHashCode = (iF + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.h;
        int iE = w.c.e((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.i);
        Long l = this.j;
        return this.n.hashCode() + w.c.d(this.m, w.c.e(w.c.f((iE + (l != null ? l.hashCode() : 0)) * 31, this.k, 31), 31, this.l), 31);
    }

    public final String toString() {
        StringBuilder sbP = oi.k.p(this.a, this.b, "AudioStoryEpisode(id=", ", order=", ", language=");
        a1.b.z(sbP, this.c, ", title=", this.d, ", audioUrl=");
        sbP.append(this.e);
        sbP.append(", durationMs=");
        sbP.append(this.f);
        a1.b.z(sbP, ", coverUrl=", this.g, ", transcriptUrl=", this.h);
        sbP.append(", isFree=");
        sbP.append(this.i);
        sbP.append(", freeDurationMs=");
        sbP.append(this.j);
        sbP.append(", positionMs=");
        sbP.append(this.k);
        sbP.append(", isCompleted=");
        sbP.append(this.l);
        sbP.append(", version=");
        sbP.append(this.m);
        sbP.append(", availableLanguages=");
        sbP.append(this.n);
        sbP.append(")");
        return sbP.toString();
    }
}
