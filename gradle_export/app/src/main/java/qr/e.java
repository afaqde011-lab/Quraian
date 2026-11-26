package qr;

public final class e {
    public final u30.b a;
    public final int b;
    public final int c;
    public final int d;
    public final mr.g e;
    public final int f;
    public final boolean g;
    public final boolean h;

    public e(u30.b weeklyStreaks, int i, int i2, int i3, mr.g timerState, int i4, boolean z, boolean z2) {
        kotlin.jvm.internal.m.e(weeklyStreaks, "weeklyStreaks");
        kotlin.jvm.internal.m.e(timerState, "timerState");
        this.a = weeklyStreaks;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = timerState;
        this.f = i4;
        this.g = z;
        this.h = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return kotlin.jvm.internal.m.a(this.a, eVar.a) && this.b == eVar.b && this.c == eVar.c && this.d == eVar.d && kotlin.jvm.internal.m.a(this.e, eVar.e) && this.f == eVar.f && this.g == eVar.g && this.h == eVar.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + w.c.e(w.c.d(this.f, (this.e.hashCode() + w.c.d(this.d, w.c.d(this.c, w.c.d(this.b, this.a.hashCode() * 31, 31), 31), 31)) * 31, 31), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HomeInsightsDataDvo(weeklyStreaks=");
        sb.append(this.a);
        sb.append(", weekListeningMinutes=");
        sb.append(this.b);
        sb.append(", streakValue=");
        w.c.u(sb, this.c, ", recordStreakValue=", this.d, ", timerState=");
        sb.append(this.e);
        sb.append(", dailyGoalDays=");
        sb.append(this.f);
        sb.append(", isPremium=");
        sb.append(this.g);
        sb.append(", isListeningSyncing=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }
}
