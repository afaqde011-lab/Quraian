package lo;

public final class v {
    public final long a;
    public final u30.b b;

    public v(long j, u30.b words) {
        kotlin.jvm.internal.m.e(words, "words");
        this.a = j;
        this.b = words;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.a == vVar.a && kotlin.jvm.internal.m.a(this.b, vVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "AudioStoryReadAlongParagraphDvo(startMs=" + this.a + ", words=" + this.b + ")";
    }
}
