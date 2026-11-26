package q3;

public final class o {

    public final int f12746a;

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return this.f12746a == ((o) obj).f12746a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f12746a);
    }

    public final String toString() {
        int i10 = this.f12746a;
        if (i10 == 0) {
            return "Normal";
        }
        return i10 == 1 ? "Italic" : "Invalid";
    }
}
