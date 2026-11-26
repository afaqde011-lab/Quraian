package ln;

import kotlin.jvm.internal.m;

public final class c {
    public final long a;
    public final int b;
    public final u30.b c;

    public c(long j, int i, u30.b week) {
        m.e(week, "week");
        this.a = j;
        this.b = i;
        this.c = week;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.a == cVar.a && this.b == cVar.b && m.a(this.c, cVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + w.c.d(this.b, Long.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "InsightsWidgetState(listenedSeconds=" + this.a + ", dailyGoalMinutes=" + this.b + ", week=" + this.c + ")";
    }
}
