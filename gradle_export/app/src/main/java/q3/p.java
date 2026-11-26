package q3;

public final class p {

    public final int f12747a;

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            return this.f12747a == ((p) obj).f12747a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f12747a);
    }

    public final String toString() {
        int i10 = this.f12747a;
        if (i10 == 0) {
            return "None";
        }
        if (i10 == 1) {
            return "Weight";
        }
        if (i10 == 2) {
            return "Style";
        }
        return i10 == 65535 ? "All" : "Invalid";
    }
}
