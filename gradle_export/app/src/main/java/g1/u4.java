package g1;

public final class u4 {

    public final c4.d0 f6000a = c4.d0.A;

    public final boolean f6001b = true;

    public final boolean f6002c = true;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u4)) {
            return false;
        }
        u4 u4Var = (u4) obj;
        return this.f6000a == u4Var.f6000a && this.f6002c == u4Var.f6002c && this.f6001b == u4Var.f6001b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f6002c) + w.c.e(this.f6000a.hashCode() * 31, 29791, this.f6001b);
    }
}
