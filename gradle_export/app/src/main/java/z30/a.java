package z30;

import oi.k;

public final class a {
    public int a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.a == ((a) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return k.l(new StringBuilder("DeltaCounter(count="), this.a, ')');
    }
}
