package nn;

import kotlin.jvm.internal.m;

public final class b {
    public final String a;
    public final boolean b;

    public b(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return m.a(this.a, bVar.a) && this.b == bVar.b;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "PlaybackSnapshot(itemId=" + this.a + ", isPlaying=" + this.b + ")";
    }
}
