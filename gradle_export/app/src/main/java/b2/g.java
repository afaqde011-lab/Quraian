package b2;

public final class g implements c {

    public final float f1980a;

    public g(float f3) {
        this.f1980a = f3;
    }

    @Override
    public final int a(int i10, int i11, y3.m mVar) {
        float f3 = (i11 - i10) / 2.0f;
        y3.m mVar2 = y3.m.A;
        float f10 = this.f1980a;
        if (mVar != mVar2) {
            f10 *= -1;
        }
        return Math.round((1 + f10) * f3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Float.compare(this.f1980a, ((g) obj).f1980a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f1980a);
    }

    public final String toString() {
        return w.c.k(new StringBuilder("Horizontal(bias="), this.f1980a, ')');
    }
}
