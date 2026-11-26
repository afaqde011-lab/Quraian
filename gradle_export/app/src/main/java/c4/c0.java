package c4;

public final class c0 {

    public final int f2826a;

    public final boolean f2827b;

    public final boolean f2828c;

    public final boolean f2829d;

    public final boolean f2830e;

    public final int f2831f;

    public c0(int i10, boolean z10) {
        this((i10 & 1) != 0 ? false : z10, true, d0.A, true);
    }

    public c0(boolean z10) {
        this(z10, true, d0.A, true);
    }

    public c0(boolean z10, boolean z11, d0 d0Var, boolean z12) {
        l1.t tVar = n.f2838a;
        int i10 = !z10 ? 262152 : 262144;
        i10 = d0Var == d0.B ? i10 | 8192 : i10;
        i10 = z12 ? i10 : i10 | 512;
        boolean z13 = d0Var == d0.A;
        this.f2826a = i10;
        this.f2827b = z13;
        this.f2828c = true;
        this.f2829d = z11;
        this.f2830e = true;
        this.f2831f = 1002;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return this.f2826a == c0Var.f2826a && this.f2827b == c0Var.f2827b && this.f2828c == c0Var.f2828c && this.f2829d == c0Var.f2829d && this.f2830e == c0Var.f2830e && this.f2831f == c0Var.f2831f;
    }

    public final int hashCode() {
        return (w.c.e(w.c.e(w.c.e(w.c.e(w.c.e(this.f2826a * 31, 31, this.f2827b), 31, this.f2828c), 31, this.f2829d), 31, this.f2830e), 31, false) + this.f2831f) * 31;
    }
}
