package x3;

public final class m {

    public final int f16421a;

    public static String a(int i10) {
        if (i10 == 1) {
            return "Ltr";
        }
        if (i10 == 2) {
            return "Rtl";
        }
        if (i10 == 3) {
            return "Content";
        }
        if (i10 == 4) {
            return "ContentOrLtr";
        }
        if (i10 == 5) {
            return "ContentOrRtl";
        }
        return i10 == 0 ? "Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            return this.f16421a == ((m) obj).f16421a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f16421a);
    }

    public final String toString() {
        return a(this.f16421a);
    }
}
