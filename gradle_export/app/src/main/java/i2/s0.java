package i2;

public final class s0 {

    public static final s0 f7158d = new s0(b0.d(4278190080L), 0, 0.0f);

    public final long f7159a;

    public final long f7160b;

    public final float f7161c;

    public s0(long j9, long j10, float f3) {
        this.f7159a = j9;
        this.f7160b = j10;
        this.f7161c = f3;
    }

    public static s0 a(s0 s0Var, long j9, float f3, int i10) {
        long j10 = s0Var.f7160b;
        if ((i10 & 4) != 0) {
            f3 = s0Var.f7161c;
        }
        s0Var.getClass();
        return new s0(j9, j10, f3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return t.c(this.f7159a, s0Var.f7159a) && h2.b.b(this.f7160b, s0Var.f7160b) && this.f7161c == s0Var.f7161c;
    }

    public final int hashCode() {
        int i10 = t.f7168h;
        return Float.hashCode(this.f7161c) + w.c.f(Long.hashCode(this.f7159a) * 31, this.f7160b, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Shadow(color=");
        w.c.s(this.f7159a, ", offset=", sb2);
        sb2.append((Object) h2.b.h(this.f7160b));
        sb2.append(", blurRadius=");
        return w.c.k(sb2, this.f7161c, ')');
    }
}
