package uv;

import java.util.ArrayList;
import w.c;

public final class a {
    public final ArrayList a;
    public final int b;
    public final long c;
    public final boolean d;
    public final int e;
    public final boolean f;

    public a(ArrayList arrayList, int i, long j, boolean z, int i2, boolean z2) {
        this.a = arrayList;
        this.b = i;
        this.c = j;
        this.d = z;
        this.e = i2;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a.equals(aVar.a) && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e && this.f == aVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + c.d(this.e, c.e(c.f(c.d(this.b, this.a.hashCode() * 31, 31), this.c, 31), 31, this.d), 31);
    }

    public final String toString() {
        return "PlaybackSnapshot(mediaItems=" + this.a + ", mediaItemIndex=" + this.b + ", positionMs=" + this.c + ", playWhenReady=" + this.d + ", repeatMode=" + this.e + ", shuffleModeEnabled=" + this.f + ")";
    }
}
