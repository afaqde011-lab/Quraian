package dv;

public final class a {
    public final long a;
    public final long b;
    public final float c;
    public final float d;

    public a(long j, long j2, float f, float f2) {
        this.a = j;
        this.b = j2;
        this.c = f;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && this.b == aVar.b && Float.compare(this.c, aVar.c) == 0 && Float.compare(this.d, aVar.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + w.c.c(this.c, w.c.f(Long.hashCode(this.a) * 31, this.b, 31), 31);
    }

    public final String toString() {
        StringBuilder sbN = w.c.n("PlayerOverlayState(position=", this.a, ", overallDuration=");
        sbN.append(this.b);
        sbN.append(", surahVolume=");
        sbN.append(this.c);
        sbN.append(", backgroundSoundVolume=");
        sbN.append(this.d);
        sbN.append(")");
        return sbN.toString();
    }
}
