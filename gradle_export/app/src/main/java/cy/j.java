package cy;

import java.util.ArrayList;

public final class j extends n {
    public final dw.a b;
    public final ArrayList c;
    public final ArrayList d;
    public final String e;

    public j(dw.a aVar, ArrayList arrayList, ArrayList arrayList2) {
        this.b = aVar;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = g4.c.f(aVar.a, "playlist-");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.b.equals(jVar.b) && this.c.equals(jVar.c) && this.d.equals(jVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PlaylistItem(playlist=" + this.b + ", normalizedTitleFields=" + this.c + ", entries=" + this.d + ")";
    }
}
