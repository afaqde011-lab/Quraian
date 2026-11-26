package zq;

import kotlin.jvm.internal.m;
import w.c;

public final class a {
    public final long a;
    public final int b;
    public final boolean c;
    public final Integer d;

    public a(long j, int i) {
        this(j, i, true, null);
    }

    public a(long j, int i, boolean z, Integer num) {
        this.a = j;
        this.b = i;
        this.c = z;
        this.d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && m.a(this.d, aVar.d);
    }

    public final int hashCode() {
        int iE = c.e(c.d(this.b, Long.hashCode(this.a) * 31, 31), 31, this.c);
        Integer num = this.d;
        return iE + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "FavoriteSurah(id=" + this.a + ", reciterId=" + this.b + ", isSurahFromCatalog=" + this.c + ", collectionId=" + this.d + ")";
    }
}
