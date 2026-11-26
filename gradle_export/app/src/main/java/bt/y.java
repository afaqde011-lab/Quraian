package bt;

public final class y {
    public final mr.g a;
    public final int b;
    public final u30.b c;
    public final boolean d;

    public y(mr.g timerState, int i, u30.b weeklyStreaks, boolean z) {
        kotlin.jvm.internal.m.e(timerState, "timerState");
        kotlin.jvm.internal.m.e(weeklyStreaks, "weeklyStreaks");
        this.a = timerState;
        this.b = i;
        this.c = weeklyStreaks;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return kotlin.jvm.internal.m.a(this.a, yVar.a) && this.b == yVar.b && kotlin.jvm.internal.m.a(this.c, yVar.c) && this.d == yVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + g4.c.c(this.c, w.c.d(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "InsightsDailyGoalUiState(timerState=" + this.a + ", dailyGoalMinute=" + this.b + ", weeklyStreaks=" + this.c + ", hasActiveSurah=" + this.d + ")";
    }
}
