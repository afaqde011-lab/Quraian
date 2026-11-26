package rs;

import java.time.DayOfWeek;
import kotlin.jvm.internal.m;

public final class f {
    public final String a;
    public final long b;
    public final long c;
    public final int d;
    public final long e;
    public final DayOfWeek f;

    public f(String key, long j, long j2, int i, long j3, DayOfWeek dayOfWeek) {
        m.e(key, "key");
        this.a = key;
        this.b = j;
        this.c = j2;
        this.d = i;
        this.e = j3;
        this.f = dayOfWeek;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return m.a(this.a, fVar.a) && this.b == fVar.b && this.c == fVar.c && this.d == fVar.d && this.e == fVar.e && this.f == fVar.f;
    }

    public final int hashCode() {
        return this.f.hashCode() + w.c.f(w.c.d(this.d, w.c.f(w.c.f(this.a.hashCode() * 31, this.b, 31), this.c, 31), 31), this.e, 31);
    }

    public final String toString() {
        return "StreakInfo(key=" + this.a + ", dayStart=" + this.b + ", listenedSeconds=" + this.c + ", dailyGoalMinutes=" + this.d + ", updateDate=" + this.e + ", dayOfWeek=" + this.f + ")";
    }
}
