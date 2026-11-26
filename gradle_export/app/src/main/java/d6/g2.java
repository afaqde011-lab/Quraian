package d6;

public final class g2 {

    public final p1 f4629a;

    public final p1 f4630b;

    public g2(p1 p1Var, p1 p1Var2) {
        this.f4629a = p1Var;
        this.f4630b = p1Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g2)) {
            return false;
        }
        g2 g2Var = (g2) obj;
        return this.f4629a == g2Var.f4629a && this.f4630b == g2Var.f4630b;
    }

    public final int hashCode() {
        return this.f4630b.hashCode() + (this.f4629a.hashCode() * 31);
    }

    public final String toString() {
        return "SizeSelector(width=" + this.f4629a + ", height=" + this.f4630b + ')';
    }
}
