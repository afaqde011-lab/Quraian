package qo;

public final class t {
    public final lo.k a;
    public final boolean b;
    public final Integer c;
    public final Integer d;

    public t(lo.k kVar, boolean z, Integer num, Integer num2) {
        this.a = kVar;
        this.b = z;
        this.c = num;
        this.d = num2;
    }

    public static t a(t tVar, lo.k kVar, boolean z, Integer num, int i) {
        if ((i & 1) != 0) {
            kVar = tVar.a;
        }
        if ((i & 2) != 0) {
            z = tVar.b;
        }
        Integer num2 = (i & 4) != 0 ? tVar.c : null;
        if ((i & 8) != 0) {
            num = tVar.d;
        }
        tVar.getClass();
        return new t(kVar, z, num2, num);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return kotlin.jvm.internal.m.a(this.a, tVar.a) && this.b == tVar.b && kotlin.jvm.internal.m.a(this.c, tVar.c) && kotlin.jvm.internal.m.a(this.d, tVar.d);
    }

    public final int hashCode() {
        lo.k kVar = this.a;
        int iE = w.c.e((kVar == null ? 0 : kVar.hashCode()) * 31, 31, this.b);
        Integer num = this.c;
        int iHashCode = (iE + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "AudioStoryUiState(story=" + this.a + ", isAboutVisible=" + this.b + ", sharedEpisodeId=" + this.c + ", highlightedEpisodeId=" + this.d + ")";
    }
}
