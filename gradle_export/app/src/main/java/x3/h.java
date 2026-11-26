package x3;

public final class h {

    public final int f16411a;

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f16411a == ((h) obj).f16411a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f16411a);
    }

    public final String toString() {
        int i10 = this.f16411a;
        if (i10 == 1) {
            return "LineHeightStyle.Trim.FirstLineTop";
        }
        if (i10 == 16) {
            return "LineHeightStyle.Trim.LastLineBottom";
        }
        if (i10 == 17) {
            return "LineHeightStyle.Trim.Both";
        }
        return i10 == 0 ? "LineHeightStyle.Trim.None" : "Invalid";
    }
}
