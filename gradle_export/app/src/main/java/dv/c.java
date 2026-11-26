package dv;

import java.util.List;
import kotlin.jvm.internal.m;

public final class c {
    public final int a;
    public final List b;
    public final zz.a c;
    public final u30.b d;
    public final u30.b e;

    public c(int i, List favorites, zz.a aVar, u30.b availableBackgroundSounds, u30.b playerItemQueue) {
        m.e(favorites, "favorites");
        m.e(availableBackgroundSounds, "availableBackgroundSounds");
        m.e(playerItemQueue, "playerItemQueue");
        this.a = i;
        this.b = favorites;
        this.c = aVar;
        this.d = availableBackgroundSounds;
        this.e = playerItemQueue;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.a == cVar.a && m.a(this.b, cVar.b) && m.a(this.c, cVar.c) && m.a(this.d, cVar.d) && m.a(this.e, cVar.e);
    }

    public final int hashCode() {
        int iA = g4.c.a(Integer.hashCode(this.a) * 31, 31, this.b);
        zz.a aVar = this.c;
        return this.e.hashCode() + g4.c.c(this.d, (iA + (aVar == null ? 0 : aVar.hashCode())) * 31, 31);
    }

    public final String toString() {
        return "PlayerPlaylistState(repeatMode=" + this.a + ", favorites=" + this.b + ", backgroundSound=" + this.c + ", availableBackgroundSounds=" + this.d + ", playerItemQueue=" + this.e + ")";
    }
}
