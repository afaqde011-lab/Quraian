package x3;

public final class d {

    public final int f16403a;

    public static String a(int i10) {
        if (i10 == 1) {
            return "Hyphens.None";
        }
        if (i10 == 2) {
            return "Hyphens.Auto";
        }
        return i10 == 0 ? "Hyphens.Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f16403a == ((d) obj).f16403a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f16403a);
    }

    public final String toString() {
        return a(this.f16403a);
    }
}
