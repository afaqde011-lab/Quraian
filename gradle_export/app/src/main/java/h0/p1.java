package h0;

public final class p1 implements n1 {

    public final float f6450a;

    public final float f6451b;

    public final float f6452c;

    public final float f6453d;

    public p1(float f3, float f10, float f11, float f12) {
        this.f6450a = f3;
        this.f6451b = f10;
        this.f6452c = f11;
        this.f6453d = f12;
        if (!((f3 >= 0.0f) & (f10 >= 0.0f) & (f11 >= 0.0f)) || !(f12 >= 0.0f)) {
            i0.a.a("Padding must be non-negative");
        }
    }

    @Override
    public final float a() {
        return this.f6453d;
    }

    @Override
    public final float b(y3.m mVar) {
        return mVar == y3.m.A ? this.f6450a : this.f6452c;
    }

    @Override
    public final float c() {
        return this.f6451b;
    }

    @Override
    public final float d(y3.m mVar) {
        return mVar == y3.m.A ? this.f6452c : this.f6450a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p1)) {
            return false;
        }
        p1 p1Var = (p1) obj;
        return y3.f.b(this.f6450a, p1Var.f6450a) && y3.f.b(this.f6451b, p1Var.f6451b) && y3.f.b(this.f6452c, p1Var.f6452c) && y3.f.b(this.f6453d, p1Var.f6453d);
    }

    public final int hashCode() {
        return Float.hashCode(this.f6453d) + w.c.c(this.f6452c, w.c.c(this.f6451b, Float.hashCode(this.f6450a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PaddingValues(start=");
        w.c.r(this.f6450a, sb2, ", top=");
        w.c.r(this.f6451b, sb2, ", end=");
        w.c.r(this.f6452c, sb2, ", bottom=");
        sb2.append((Object) y3.f.c(this.f6453d));
        sb2.append(')');
        return sb2.toString();
    }
}
