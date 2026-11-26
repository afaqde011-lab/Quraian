package eh;

public final class u extends m {
    public final Object A;

    public u(Object obj) {
        this.A = obj;
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
        if (obj instanceof u) {
            return this.A.equals(((u) obj).A);
        }
        return false;
    }

    public final int hashCode() {
        return this.A.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.A + ")";
    }
}
