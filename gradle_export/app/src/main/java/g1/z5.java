package g1;

public final class z5 implements z.v0 {

    public final boolean f6042a;

    public final float f6043b;

    public final long f6044c;

    public z5(float f3, long j9, boolean z10) {
        this.f6042a = z10;
        this.f6043b = f3;
        this.f6044c = j9;
    }

    @Override
    public final b3.k a(f0.i iVar) {
        return new h3(iVar, this.f6042a, this.f6043b, new g3(this, 1));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z5)) {
            return false;
        }
        z5 z5Var = (z5) obj;
        if (this.f6042a == z5Var.f6042a && y3.f.b(this.f6043b, z5Var.f6043b)) {
            return i2.t.c(this.f6044c, z5Var.f6044c);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int iC = w.c.c(this.f6043b, Boolean.hashCode(this.f6042a) * 31, 961);
        int i10 = i2.t.f7168h;
        return Long.hashCode(this.f6044c) + iC;
    }
}
