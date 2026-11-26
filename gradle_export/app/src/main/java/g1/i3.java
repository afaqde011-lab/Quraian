package g1;

public final class i3 {

    public final int f5841a;

    public final boolean equals(Object obj) {
        if (obj instanceof i3) {
            return this.f5841a == ((i3) obj).f5841a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f5841a);
    }

    public final String toString() {
        int i10 = this.f5841a;
        if (i10 == 0) {
            return "Picker";
        }
        return i10 == 1 ? "Input" : "Unknown";
    }
}
