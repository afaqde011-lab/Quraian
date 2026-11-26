package bt;

public final class n2 {
    public final ys.c a;
    public final int b;
    public final boolean c;
    public final boolean d;

    public n2(ys.c period, int i, boolean z, boolean z2) {
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
        if (!(obj instanceof n2)) {
            return false;
        }
        n2 n2Var = (n2) obj;
        return this.a == n2Var.a && this.b == n2Var.b && this.c == n2Var.c && this.d == n2Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + w.c.e(w.c.d(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        return "TotalMinutesState(period=" + this.a + ", minutes=" + this.b + ", wasRequestRunning=" + this.c + ", isFinishedWithoutData=" + this.d + ")";
    }
}
