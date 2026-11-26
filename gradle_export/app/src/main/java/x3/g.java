package x3;

public final class g {

    public final int f16410a;

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f16410a == ((g) obj).f16410a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f16410a);
    }

    public final String toString() {
        int i10 = this.f16410a;
        if (i10 == 0) {
            return "LineHeightStyle.Mode.Fixed";
        }
        if (i10 == 1) {
            return "LineHeightStyle.Mode.Minimum";
        }
        return i10 == 2 ? "LineHeightStyle.Mode.Tight" : "Invalid";
    }
}
