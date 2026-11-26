package lo;

public final class l {
    public final int a;
    public final int b;
    public final long c;
    public final q d;
    public final i e;
    public final boolean f;

    public l(int i, int i2, long j, q qVar, i iVar, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = qVar;
        this.e = iVar;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.a == lVar.a && this.b == lVar.b && this.c == lVar.c && kotlin.jvm.internal.m.a(this.d, lVar.d) && kotlin.jvm.internal.m.a(this.e, lVar.e) && this.f == lVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + ((this.d.hashCode() + w.c.f(w.c.d(this.b, Integer.hashCode(this.a) * 31, 31), this.c, 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbP = oi.k.p(this.a, this.b, "AudioStoryEpisodeDvo(id=", ", order=", ", shownDurationMs=");
        sbP.append(this.c);
        sbP.append(", status=");
        sbP.append(this.d);
        sbP.append(", download=");
        sbP.append(this.e);
        sbP.append(", isAvailable=");
        sbP.append(this.f);
        sbP.append(")");
        return sbP.toString();
    }
}
