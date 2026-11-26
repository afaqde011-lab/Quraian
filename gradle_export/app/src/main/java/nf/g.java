package nf;

public final class g extends f {
    public final cf.t A;

    public g(cf.t tVar) {
        this.A = tVar;
    }

    @Override
    public final Object a() {
        return this.A;
    }

    @Override
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.A.equals(((g) obj).A);
        }
        return false;
    }

    public final int hashCode() {
        return this.A.hashCode() + 1502476572;
    }

    public final String toString() {
        return a1.b.p("Optional.of(", this.A.toString(), ")");
    }
}
