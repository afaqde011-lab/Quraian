package r2;

public final class a {

    public final int f13043a;

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f13043a == ((a) obj).f13043a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f13043a);
    }

    public final String toString() {
        int i10 = this.f13043a;
        if (i10 == 1) {
            return "Touch";
        }
        return i10 == 2 ? "Keyboard" : "Error";
    }
}
