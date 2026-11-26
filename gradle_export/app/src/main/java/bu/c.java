package bu;

import oi.k;

public final class c {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public c(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.a == cVar.a && this.b == cVar.b && this.c == cVar.c && this.d == cVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + w.c.d(this.c, w.c.d(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbP = k.p(this.a, this.b, "PaywallReviewUi(avatarRes=", ", authorRes=", ", countryRes=");
        sbP.append(this.c);
        sbP.append(", reviewRes=");
        sbP.append(this.d);
        sbP.append(")");
        return sbP.toString();
    }
}
