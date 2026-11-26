package rs;

import kotlin.jvm.internal.m;

public final class b {
    public final String a;
    public final long b;
    public final int c;
    public final int d;
    public final int e;
    public final long f;

    public b(String key, long j, int i, int i2, int i3, long j2) {
        m.e(key, "key");
        this.a = key;
        this.b = j;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return m.a(this.a, bVar.a) && this.b == bVar.b && this.c == bVar.c && this.d == bVar.d && this.e == bVar.e && this.f == bVar.f;
    }

    public final int hashCode() {
        return Long.hashCode(this.f) + w.c.d(this.e, w.c.d(this.d, w.c.d(this.c, w.c.f(this.a.hashCode() * 31, this.b, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DaySurahStat(key=");
        sb.append(this.a);
        sb.append(", dayStart=");
        sb.append(this.b);
        w.c.v(sb, ", surahNumber=", this.c, ", reciterId=", this.d);
        sb.append(", seconds=");
        sb.append(this.e);
        sb.append(", updatedAt=");
        return a1.b.k(this.f, ")", sb);
    }
}
