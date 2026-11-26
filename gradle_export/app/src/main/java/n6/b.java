package n6;

import oi.k;

public final class b {

    public final int f11112a;

    public b(int i10) {
        this.f11112a = i10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f11112a == ((b) obj).f11112a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f11112a);
    }

    public final String toString() {
        return k.h("FontWeight(value=", this.f11112a, ')');
    }
}
