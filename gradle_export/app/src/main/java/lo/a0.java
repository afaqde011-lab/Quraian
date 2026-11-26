package lo;

public final class a0 {
    public final String a;
    public final long b;

    public a0(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return kotlin.jvm.internal.m.a(this.a, a0Var.a) && this.b == a0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AudioStoryReadAlongWordDvo(text=" + this.a + ", startMs=" + this.b + ")";
    }
}
