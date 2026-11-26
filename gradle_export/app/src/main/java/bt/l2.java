package bt;

import java.util.List;

public final class l2 {
    public final int a;
    public final boolean b;
    public final List c;

    public l2(int i, List stats, boolean z) {
        kotlin.jvm.internal.m.e(stats, "stats");
        this.a = i;
        this.b = z;
        this.c = stats;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l2)) {
            return false;
        }
        l2 l2Var = (l2) obj;
        return this.a == l2Var.a && this.b == l2Var.b && kotlin.jvm.internal.m.a(this.c, l2Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + w.c.e(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "PeriodStats(historyDays=" + this.a + ", hasSummary=" + this.b + ", stats=" + this.c + ")";
    }
}
