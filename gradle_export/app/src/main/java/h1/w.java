package h1;

public final class w {

    public final int f6534a;

    public final int f6535b;

    public final int f6536c;

    public final int f6537d;

    public final long f6538e;

    public w(int i10, int i11, int i12, int i13, long j9) {
        this.f6534a = i10;
        this.f6535b = i11;
        this.f6536c = i12;
        this.f6537d = i13;
        this.f6538e = j9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f6534a == wVar.f6534a && this.f6535b == wVar.f6535b && this.f6536c == wVar.f6536c && this.f6537d == wVar.f6537d && this.f6538e == wVar.f6538e;
    }

    public final int hashCode() {
        return Long.hashCode(this.f6538e) + w.c.d(this.f6537d, w.c.d(this.f6536c, w.c.d(this.f6535b, Integer.hashCode(this.f6534a) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "CalendarMonth(year=" + this.f6534a + ", month=" + this.f6535b + ", numberOfDays=" + this.f6536c + ", daysFromStartOfWeekToFirstOfMonth=" + this.f6537d + ", startUtcTimeMillis=" + this.f6538e + ')';
    }
}
