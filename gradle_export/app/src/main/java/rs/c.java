package rs;

import kotlin.jvm.internal.m;

public final class c {
    public final String a;
    public final long b;
    public final int c;
    public final int d;
    public final long e;

    public c(String key, long j, int i, int i2, long j2) {
        m.e(key, "key");
        this.a = key;
        this.b = j;
        this.c = i;
        this.d = i2;
        this.e = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return m.a(this.a, cVar.a) && this.b == cVar.b && this.c == cVar.c && this.d == cVar.d && this.e == cVar.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + w.c.d(this.d, w.c.d(this.c, w.c.f(this.a.hashCode() * 31, this.b, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HourStat(key=");
        sb.append(this.a);
        sb.append(", dayStart=");
        sb.append(this.b);
        w.c.v(sb, ", hour=", this.c, ", quranSeconds=", this.d);
        sb.append(", updatedAt=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}
