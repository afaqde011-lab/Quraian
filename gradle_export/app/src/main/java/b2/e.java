package b2;

public final class e implements c {

    public final float f1978a;

    public e(float f3) {
        this.f1978a = f3;
    }

    @Override
    public final int a(int i10, int i11, y3.m mVar) {
        return Math.round((1 + this.f1978a) * ((i11 - i10) / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Float.compare(this.f1978a, ((e) obj).f1978a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f1978a);
    }

    public final String toString() {
        return w.c.k(new StringBuilder("Horizontal(bias="), this.f1978a, ')');
    }
}
