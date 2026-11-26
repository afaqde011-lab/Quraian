package su;

public final class d {
    public final int a;
    public final long b;
    public final int c;

    public d(int i, long j, int i2) {
        this.a = i;
        this.b = j;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.a == dVar.a && this.b == dVar.b && this.c == dVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + w.c.f(Integer.hashCode(this.a) * 31, this.b, 31);
    }

    public final String toString() {
        return "MemorizationRecording(surahNumber=" + this.a + ", surahId=" + this.b + ", reciterId=" + this.c + ")";
    }
}
