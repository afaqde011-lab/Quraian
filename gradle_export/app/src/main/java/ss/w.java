package ss;

public final class w {
    public final String a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    public w(int i, int i2, int i3, long j, String day) {
        kotlin.jvm.internal.m.e(day, "day");
        this.a = day;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return kotlin.jvm.internal.m.a(this.a, wVar.a) && this.b == wVar.b && this.c == wVar.c && this.d == wVar.d && this.e == wVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + w.c.f(w.c.d(this.c, w.c.d(this.b, this.a.hashCode() * 31, 31), 31), this.d, 31);
    }

    public final String toString() {
        return "ListeningSurahStat(day=" + this.a + ", reciterId=" + this.b + ", surahNumber=" + this.c + ", listenedMs=" + this.d + ", playCount=" + this.e + ")";
    }
}
