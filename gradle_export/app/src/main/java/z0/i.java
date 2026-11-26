package z0;

import oi.k;

public final class i {

    public final int f17000a;

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f17000a == ((i) obj).f17000a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f17000a);
    }

    public final String toString() {
        return k.h("TextHighlightType(value=", this.f17000a, ')');
    }
}
