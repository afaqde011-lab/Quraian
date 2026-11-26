package b2;

public final class f implements d {

    public final float f1979a;

    public f(float f3) {
        this.f1979a = f3;
    }

    @Override
    public final long a(long j9, long j10, y3.m mVar) {
        long j11 = (((long) (((int) (j10 >> 32)) - ((int) (j9 >> 32)))) << 32) | (((long) (((int) (j10 & 4294967295L)) - ((int) (j9 & 4294967295L)))) & 4294967295L);
        float f3 = 1;
        int iRound = Math.round((this.f1979a + f3) * (((int) (j11 >> 32)) / 2.0f));
        return (((long) Math.round((f3 - 1.0f) * (((int) (j11 & 4294967295L)) / 2.0f))) & 4294967295L) | (((long) iRound) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Float.compare(this.f1979a, ((f) obj).f1979a) == 0 && Float.compare(-1.0f, -1.0f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(-1.0f) + (Float.hashCode(this.f1979a) * 31);
    }

    public final String toString() {
        return "BiasAbsoluteAlignment(horizontalBias=" + this.f1979a + ", verticalBias=-1.0)";
    }
}
