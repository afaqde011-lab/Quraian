package cs;

public final class m {
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;
    public final boolean e;

    public m(int i, int i2, int i3, boolean z, boolean z2) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.a == mVar.a && this.b == mVar.b && this.c == mVar.c && this.d == mVar.d && this.e == mVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + w.c.e(w.c.d(this.c, w.c.d(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbP = oi.k.p(this.a, this.b, "StreakDetailUiState(currentStreak=", ", recordStreak=", ", targetStreak=");
        sbP.append(this.c);
        sbP.append(", isNewRecord=");
        sbP.append(this.d);
        sbP.append(", isLoading=");
        return g4.c.l(sbP, this.e, ")");
    }
}
