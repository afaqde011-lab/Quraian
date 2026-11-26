package s10;

public final class e1 {
    public static final e1 c = new e1(null, null);
    public final g1 a;
    public final b1 b;

    public e1(g1 g1Var, b1 b1Var) {
        this.a = g1Var;
        this.b = b1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj;
        return this.a == e1Var.a && kotlin.jvm.internal.m.a(this.b, e1Var.b);
    }

    public final int hashCode() {
        g1 g1Var = this.a;
        int iHashCode = (g1Var == null ? 0 : g1Var.hashCode()) * 31;
        b1 b1Var = this.b;
        return iHashCode + (b1Var != null ? b1Var.hashCode() : 0);
    }

    public final String toString() {
        return "KmTypeProjection(variance=" + this.a + ", type=" + this.b + ')';
    }
}
