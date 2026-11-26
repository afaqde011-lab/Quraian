package r3;

public final class k {

    public final int f13079a;

    public static String a(int i10) {
        if (i10 == -1) {
            return "Unspecified";
        }
        if (i10 == 0) {
            return "None";
        }
        if (i10 == 1) {
            return "Characters";
        }
        if (i10 == 2) {
            return "Words";
        }
        return i10 == 3 ? "Sentences" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f13079a == ((k) obj).f13079a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f13079a);
    }

    public final String toString() {
        return a(this.f13079a);
    }
}
