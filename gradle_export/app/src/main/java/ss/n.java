package ss;

import java.util.List;

public final class n {
    public final String a;
    public final int b;
    public final List c;
    public final List d;
    public final List e;
    public final List f;

    public n(String importId, int i, List hours, List list, List surahs, List background) {
        kotlin.jvm.internal.m.e(importId, "importId");
        kotlin.jvm.internal.m.e(hours, "hours");
        kotlin.jvm.internal.m.e(surahs, "surahs");
        kotlin.jvm.internal.m.e(background, "background");
        this.a = importId;
        this.b = i;
        this.c = hours;
        this.d = list;
        this.e = surahs;
        this.f = background;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return kotlin.jvm.internal.m.a(this.a, nVar.a) && this.b == nVar.b && kotlin.jvm.internal.m.a(this.c, nVar.c) && kotlin.jvm.internal.m.a(this.d, nVar.d) && kotlin.jvm.internal.m.a(this.e, nVar.e) && kotlin.jvm.internal.m.a(this.f, nVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + g4.c.a(g4.c.a(g4.c.a(w.c.d(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        return "ListeningImportSnapshot(importId=" + this.a + ", dailyGoalMinutes=" + this.b + ", hours=" + this.c + ", days=" + this.d + ", surahs=" + this.e + ", background=" + this.f + ")";
    }
}
