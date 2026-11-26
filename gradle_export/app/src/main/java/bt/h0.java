package bt;

public final class h0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public h0(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return this.a == h0Var.a && this.b == h0Var.b && this.c == h0Var.c && this.d == h0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + w.c.e(w.c.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "InsightsLoadingUiState(isPeriodLoading=" + this.a + ", isYearLoading=" + this.b + ", isImporting=" + this.c + ", isPeriodRequestRunning=" + this.d + ")";
    }
}
