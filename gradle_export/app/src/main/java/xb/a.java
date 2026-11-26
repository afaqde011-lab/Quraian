package xb;

import ab.a0;

public final class a extends a0 {

    public final int f16510a;

    public a(int i10) {
        this.f16510a = i10;
        if (i10 <= 0) {
            throw new IllegalArgumentException("px must be > 0.");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return this.f16510a == ((a) obj).f16510a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f16510a;
    }

    public final String toString() {
        return String.valueOf(this.f16510a);
    }
}
