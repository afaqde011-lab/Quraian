package b2;

public final class i implements d {

    public final float f1982a;

    public final float f1983b;

    public i(float f3, float f10) {
        this.f1982a = f3;
        this.f1983b = f10;
    }

    @Override
    public final long a(long j9, long j10, y3.m mVar) {
        float f3 = (((int) (j10 >> 32)) - ((int) (j9 >> 32))) / 2.0f;
        float f10 = (((int) (j10 & 4294967295L)) - ((int) (j9 & 4294967295L))) / 2.0f;
        y3.m mVar2 = y3.m.A;
        float f11 = this.f1982a;
        if (mVar != mVar2) {
            f11 *= -1;
        }
        float f12 = 1;
        float f13 = (f11 + f12) * f3;
        float f14 = (f12 + this.f1983b) * f10;
        int iRound = Math.round(f13);
        return (((long) Math.round(f14)) & 4294967295L) | (((long) iRound) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Float.compare(this.f1982a, iVar.f1982a) == 0 && Float.compare(this.f1983b, iVar.f1983b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f1983b) + (Float.hashCode(this.f1982a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BiasAlignment(horizontalBias=");
        sb2.append(this.f1982a);
        sb2.append(", verticalBias=");
        return w.c.k(sb2, this.f1983b, ')');
    }
}
