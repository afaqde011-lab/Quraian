package dw;

import java.util.List;
import kotlin.jvm.internal.m;

public final class b {
    public final long a;
    public final String b;
    public final List c;
    public final String d;
    public final int e;
    public final c f;

    public b(long j, String str, List list, String str2, int i, c cVar) {
        this.a = j;
        this.b = str;
        this.c = list;
        this.d = str2;
        this.e = i;
        this.f = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && m.a(this.b, bVar.b) && m.a(this.c, bVar.c) && m.a(this.d, bVar.d) && this.e == bVar.e && m.a(this.f, bVar.f);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        int iA = g4.c.a((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        String str2 = this.d;
        return this.f.hashCode() + w.c.d(this.e, (iA + (str2 != null ? str2.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        return "PlaylistEntry(id=" + this.a + ", title=" + this.b + ", titleOtherLanguages=" + this.c + ", audioUrl=" + this.d + ", surahNumber=" + this.e + ", reciter=" + this.f + ")";
    }
}
