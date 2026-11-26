package h1;

public final class g1 implements o0 {

    public final b2.e f6511a;

    public g1(b2.e eVar) {
        this.f6511a = eVar;
    }

    @Override
    public final int a(y3.k kVar, long j9, int i10, y3.m mVar) {
        int i11 = (int) (j9 >> 32);
        if (i10 >= i11) {
            return Math.round((1 + (mVar != y3.m.A ? 0.0f * (-1) : 0.0f)) * ((i11 - i10) / 2.0f));
        }
        return ab.a0.y(this.f6511a.a(i10, i11, mVar), 0, i11 - i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g1) && this.f6511a.equals(((g1) obj).f6511a);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + (Float.hashCode(this.f6511a.f1978a) * 31);
    }

    public final String toString() {
        return "Horizontal(alignment=" + this.f6511a + ", margin=0)";
    }
}
