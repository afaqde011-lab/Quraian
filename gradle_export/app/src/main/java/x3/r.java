package x3;

public final class r {

    public final int f16429a;

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            return this.f16429a == ((r) obj).f16429a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f16429a);
    }

    public final String toString() {
        int i10 = this.f16429a;
        if (i10 == 1) {
            return "Linearity.Linear";
        }
        if (i10 == 2) {
            return "Linearity.FontHinting";
        }
        return i10 == 3 ? "Linearity.None" : "Invalid";
    }
}
