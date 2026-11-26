package g2;

public final class f {

    public final int f6063a;

    public static String a(int i10) {
        if (i10 == 1) {
            return "Next";
        }
        if (i10 == 2) {
            return "Previous";
        }
        if (i10 == 3) {
            return "Left";
        }
        if (i10 == 4) {
            return "Right";
        }
        if (i10 == 5) {
            return "Up";
        }
        if (i10 == 6) {
            return "Down";
        }
        if (i10 == 7) {
            return "Enter";
        }
        return i10 == 8 ? "Exit" : "Invalid FocusDirection";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f6063a == ((f) obj).f6063a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6063a);
    }

    public final String toString() {
        return a(this.f6063a);
    }
}
