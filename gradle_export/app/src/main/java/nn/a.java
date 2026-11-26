package nn;

import kotlin.jvm.internal.m;

public final class a {
    public final String a;
    public final boolean b;
    public final long c;

    public a(long j, String sourceKey, boolean z) {
        m.e(sourceKey, "sourceKey");
        this.a = sourceKey;
        this.b = z;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return m.a(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + w.c.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExpectedPlayback(sourceKey=");
        sb.append(this.a);
        sb.append(", isPlaying=");
        sb.append(this.b);
        sb.append(", at=");
        return a1.b.k(this.c, ")", sb);
    }
}
