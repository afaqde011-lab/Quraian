package ss;

public final class c {
    public final String a;
    public final long b;
    public final int c;

    public c(String day, long j, int i) {
        kotlin.jvm.internal.m.e(day, "day");
        this.a = day;
        this.b = j;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return kotlin.jvm.internal.m.a(this.a, cVar.a) && this.b == cVar.b && this.c == cVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + w.c.f(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return "ListeningDayStat(day=" + this.a + ", listenedMs=" + this.b + ", dailyGoalMinutes=" + this.c + ")";
    }
}
