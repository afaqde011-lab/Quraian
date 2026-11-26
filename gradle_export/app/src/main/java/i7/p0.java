package i7;

import java.util.Objects;

public final class p0 {

    public final s7.a0 f7438a;

    public final long f7439b;

    public final long f7440c;

    public final long f7441d;

    public final long f7442e;

    public final boolean f7443f;

    public final boolean f7444g;

    public final boolean f7445h;

    public final boolean f7446i;

    public final boolean f7447j;

    public p0(s7.a0 a0Var, long j9, long j10, long j11, long j12, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        boolean z15 = true;
        ta.c0.s(!z14 || z12);
        ta.c0.s(!z13 || z12);
        if (z11 && (z12 || z13 || z14)) {
            z15 = false;
        }
        ta.c0.s(z15);
        this.f7438a = a0Var;
        this.f7439b = j9;
        this.f7440c = j10;
        this.f7441d = j11;
        this.f7442e = j12;
        this.f7443f = z10;
        this.f7444g = z11;
        this.f7445h = z12;
        this.f7446i = z13;
        this.f7447j = z14;
    }

    public final p0 a(long j9) {
        if (j9 == this.f7440c) {
            return this;
        }
        return new p0(this.f7438a, this.f7439b, j9, this.f7441d, this.f7442e, this.f7443f, this.f7444g, this.f7445h, this.f7446i, this.f7447j);
    }

    public final p0 b(long j9) {
        if (j9 == this.f7439b) {
            return this;
        }
        return new p0(this.f7438a, j9, this.f7440c, this.f7441d, this.f7442e, this.f7443f, this.f7444g, this.f7445h, this.f7446i, this.f7447j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p0.class == obj.getClass()) {
            p0 p0Var = (p0) obj;
            if (this.f7439b == p0Var.f7439b && this.f7440c == p0Var.f7440c && this.f7441d == p0Var.f7441d && this.f7442e == p0Var.f7442e && this.f7443f == p0Var.f7443f && this.f7444g == p0Var.f7444g && this.f7445h == p0Var.f7445h && this.f7446i == p0Var.f7446i && this.f7447j == p0Var.f7447j && Objects.equals(this.f7438a, p0Var.f7438a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.f7438a.hashCode() + 527) * 31) + ((int) this.f7439b)) * 31) + ((int) this.f7440c)) * 31) + ((int) this.f7441d)) * 31) + ((int) this.f7442e)) * 31) + (this.f7443f ? 1 : 0)) * 31) + (this.f7444g ? 1 : 0)) * 31) + (this.f7445h ? 1 : 0)) * 31) + (this.f7446i ? 1 : 0)) * 31) + (this.f7447j ? 1 : 0);
    }
}
