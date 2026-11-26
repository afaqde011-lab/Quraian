package ss;

public final class i {
    public final String a;
    public final int b;
    public final long c;

    public i(String day, long j, int i) {
        kotlin.jvm.internal.m.e(day, "day");
        this.a = day;
        this.b = i;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return kotlin.jvm.internal.m.a(this.a, iVar.a) && this.b == iVar.b && this.c == iVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + w.c.d(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ListeningHourStat(day=");
        sb.append(this.a);
        sb.append(", hour=");
        sb.append(this.b);
        sb.append(", listenedMs=");
        return a1.b.k(this.c, ")", sb);
    }
}
