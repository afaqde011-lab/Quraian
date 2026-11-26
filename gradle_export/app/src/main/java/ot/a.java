package ot;

public final class a {
    public final int a;
    public final long b;
    public final long c;

    public a(int i, long j, long j2) {
        this.a = i;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + w.c.f(Integer.hashCode(this.a) * 31, this.b, 31);
    }

    public final String toString() {
        return "AyahTiming(ayah=" + this.a + ", startTime=" + this.b + ", endTime=" + this.c + ")";
    }
}
