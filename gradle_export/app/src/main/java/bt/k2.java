package bt;

import java.util.ArrayList;

public final class k2 {
    public final ys.c a;
    public final boolean b;
    public final ArrayList c;

    public k2(ys.c period, boolean z, ArrayList arrayList) {
        kotlin.jvm.internal.m.e(period, "period");
        this.a = period;
        this.b = z;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k2)) {
            return false;
        }
        k2 k2Var = (k2) obj;
        return this.a == k2Var.a && this.b == k2Var.b && this.c.equals(k2Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + w.c.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "PeriodHourStats(period=" + this.a + ", hasSummary=" + this.b + ", stats=" + this.c + ")";
    }
}
