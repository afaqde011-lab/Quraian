package i2;

public final class e0 {

    public final int f7125a;

    public final boolean equals(Object obj) {
        if (obj instanceof e0) {
            return this.f7125a == ((e0) obj).f7125a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f7125a);
    }

    public final String toString() {
        int i10 = this.f7125a;
        if (i10 == 0) {
            return "Argb8888";
        }
        if (i10 == 1) {
            return "Alpha8";
        }
        if (i10 == 2) {
            return "Rgb565";
        }
        if (i10 == 3) {
            return "F16";
        }
        return i10 == 4 ? "Gpu" : "Unknown";
    }
}
