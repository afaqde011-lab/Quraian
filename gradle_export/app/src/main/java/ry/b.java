package ry;

public final class b {
    public final String a;
    public final int b;
    public final int c;
    public final int d;

    public b(int i, int i2, int i3, String str) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a.equals(bVar.a) && this.b == bVar.b && this.c == bVar.c && this.d == bVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + w.c.d(this.c, w.c.d(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "CancellationBenefitDvo(id=" + this.a + ", valueRes=" + this.b + ", titleRes=" + this.c + ", subtitleRes=" + this.d + ")";
    }
}
