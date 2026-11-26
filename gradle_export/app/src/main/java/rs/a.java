package rs;

import kotlin.jvm.internal.m;

public final class a {
    public final String a;
    public final long b;
    public final int c;
    public final int d;
    public final long e;

    public a(String key, long j, int i, int i2, long j2) {
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
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return m.a(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + w.c.d(this.d, w.c.d(this.c, w.c.f(this.a.hashCode() * 31, this.b, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DayReciterStat(key=");
        sb.append(this.a);
        sb.append(", dayStart=");
        sb.append(this.b);
        w.c.v(sb, ", reciterId=", this.c, ", seconds=", this.d);
        sb.append(", updatedAt=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}
