package a1;

public final class g1 {

    public final x2 f45a;

    public final x2 f46b;

    public g1(x2 x2Var, x2 x2Var2) {
        this.f45a = x2Var;
        this.f46b = x2Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        return this.f45a == g1Var.f45a && this.f46b == g1Var.f46b;
    }

    public final int hashCode() {
        return this.f46b.hashCode() + (this.f45a.hashCode() * 31);
    }

    public final String toString() {
        return "SelectionWedgeAffinity(startAffinity=" + this.f45a + ", endAffinity=" + this.f46b + ')';
    }
}
