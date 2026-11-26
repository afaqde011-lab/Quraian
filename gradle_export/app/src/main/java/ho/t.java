package ho;

public final class t {
    public final String a;
    public final long b;
    public final long c;

    public t(long j, long j2, String str) {
        this.a = str;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return kotlin.jvm.internal.m.a(this.a, tVar.a) && this.b == tVar.b && this.c == tVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + w.c.f(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return "AudioStoryTranscriptWord(text=" + this.a + ", startMs=" + this.b + ", endMs=" + this.c + ")";
    }
}
