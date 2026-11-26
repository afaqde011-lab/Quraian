package ju;

public final class d {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public d(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.a == dVar.a && this.b == dVar.b && this.c == dVar.c && this.d == dVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + w.c.d(this.c, w.c.d(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbP = oi.k.p(this.a, this.b, "OnBoardingReviewUi(avatarRes=", ", authorRes=", ", countryRes=");
        sbP.append(this.c);
        sbP.append(", reviewRes=");
        sbP.append(this.d);
        sbP.append(")");
        return sbP.toString();
    }
}
