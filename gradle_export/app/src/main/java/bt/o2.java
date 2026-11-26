package bt;

public final class o2 {
    public final ys.c a;
    public final int b;
    public final boolean c;
    public final boolean d;

    public o2(ys.c period, int i, boolean z, boolean z2) {
        kotlin.jvm.internal.m.e(period, "period");
        this.a = period;
        this.b = i;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o2)) {
            return false;
        }
        o2 o2Var = (o2) obj;
        return this.a == o2Var.a && this.b == o2Var.b && this.c == o2Var.c && this.d == o2Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + w.c.e(w.c.d(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        return "TotalMinutesUpdate(period=" + this.a + ", minutes=" + this.b + ", isReady=" + this.c + ", isRequestRunning=" + this.d + ")";
    }
}
