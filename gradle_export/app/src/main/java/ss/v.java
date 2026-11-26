package ss;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public final class v {
    public final int a;
    public final int b;
    public final int c;
    public final x d;
    public final long e;
    public final List f;
    public final List g;
    public final List h;
    public final List i;
    public final List j;
    public final o k;
    public final Instant l;

    public v(int i, int i2, int i3, x xVar, long j, List list, List list2, List list3, List list4, List list5, o oVar, Instant instant) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = xVar;
        this.e = j;
        this.f = list;
        this.g = list2;
        this.h = list3;
        this.i = list4;
        this.j = list5;
        this.k = oVar;
        this.l = instant;
    }

    public static v a(v vVar, int i, int i2, int i3, x xVar, long j, ArrayList arrayList, List list, List list2, List list3, List list4, int i4) {
        int i5 = (i4 & 1) != 0 ? vVar.a : i;
        int i6 = (i4 & 2) != 0 ? vVar.b : i2;
        int i7 = (i4 & 4) != 0 ? vVar.c : i3;
        long j2 = (i4 & 16) != 0 ? vVar.e : j;
        List hours = (i4 & 64) != 0 ? vVar.g : list;
        List list5 = (i4 & 128) != 0 ? vVar.h : list2;
        List list6 = (i4 & 256) != 0 ? vVar.i : list3;
        List list7 = (i4 & 512) != 0 ? vVar.j : list4;
        o oVar = vVar.k;
        Instant instant = vVar.l;
        vVar.getClass();
        kotlin.jvm.internal.m.e(hours, "hours");
        return new v(i5, i6, i7, xVar, j2, arrayList, hours, list5, list6, list7, oVar, instant);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.a == vVar.a && this.b == vVar.b && this.c == vVar.c && kotlin.jvm.internal.m.a(this.d, vVar.d) && this.e == vVar.e && kotlin.jvm.internal.m.a(this.f, vVar.f) && kotlin.jvm.internal.m.a(this.g, vVar.g) && kotlin.jvm.internal.m.a(this.h, vVar.h) && kotlin.jvm.internal.m.a(this.i, vVar.i) && kotlin.jvm.internal.m.a(this.j, vVar.j) && this.k == vVar.k && kotlin.jvm.internal.m.a(this.l, vVar.l);
    }

    public final int hashCode() {
        int iA = g4.c.a(g4.c.a(g4.c.a(g4.c.a(g4.c.a(w.c.f((this.d.hashCode() + w.c.d(this.c, w.c.d(this.b, Integer.hashCode(this.a) * 31, 31), 31)) * 31, this.e, 31), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
        o oVar = this.k;
        int iHashCode = (iA + (oVar == null ? 0 : oVar.hashCode())) * 31;
        Instant instant = this.l;
        return iHashCode + (instant != null ? instant.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbP = oi.k.p(this.a, this.b, "ListeningSummary(dailyGoalMinutes=", ", currentStreak=", ", longestStreak=");
        sbP.append(this.c);
        sbP.append(", today=");
        sbP.append(this.d);
        sbP.append(", totalListenedMs=");
        sbP.append(this.e);
        sbP.append(", days=");
        sbP.append(this.f);
        sbP.append(", hours=");
        sbP.append(this.g);
        sbP.append(", reciters=");
        sbP.append(this.h);
        sbP.append(", surahs=");
        sbP.append(this.i);
        sbP.append(", background=");
        sbP.append(this.j);
        sbP.append(", deviceImport=");
        sbP.append(this.k);
        sbP.append(", clearedAt=");
        sbP.append(this.l);
        sbP.append(")");
        return sbP.toString();
    }
}
