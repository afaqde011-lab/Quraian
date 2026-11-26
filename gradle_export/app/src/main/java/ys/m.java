package ys;

public final class m {
    public final u30.b a;
    public final int b;
    public final int c;
    public final String d;

    public m(int i, int i2, String str, u30.b grid) {
        kotlin.jvm.internal.m.e(grid, "grid");
        this.a = grid;
        this.b = i;
        this.c = i2;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return kotlin.jvm.internal.m.a(this.a, mVar.a) && this.b == mVar.b && this.c == mVar.c && kotlin.jvm.internal.m.a(this.d, mVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + w.c.d(this.c, w.c.d(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "InsightsYearOverviewDvo(grid=" + this.a + ", activeDays=" + this.b + ", elapsedDays=" + this.c + ", consistencyPercentage=" + this.d + ")";
    }
}
