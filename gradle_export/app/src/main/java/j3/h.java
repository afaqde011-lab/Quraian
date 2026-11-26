package j3;

public final class h {

    public final int f7933a;

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f7933a == ((h) obj).f7933a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f7933a);
    }

    public final String toString() {
        int i10 = this.f7933a;
        if (i10 == 0) {
            return "Polite";
        }
        return i10 == 1 ? "Assertive" : "Unknown";
    }
}
