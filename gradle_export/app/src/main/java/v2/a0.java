package v2;

public final class a0 {

    public final int f15351a;

    public static String a(int i10) {
        if (i10 == 1) {
            return "Touch";
        }
        if (i10 == 2) {
            return "Mouse";
        }
        if (i10 != 3) {
            return i10 != 4 ? "Unknown" : "Eraser";
        }
        return "Stylus";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a0) {
            return this.f15351a == ((a0) obj).f15351a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15351a);
    }

    public final String toString() {
        return a(this.f15351a);
    }
}
