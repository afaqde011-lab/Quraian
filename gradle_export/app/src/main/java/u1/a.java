package u1;

import oi.k;

public final class a {

    public int f14919a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f14919a == ((a) obj).f14919a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f14919a);
    }

    public final String toString() {
        return k.l(new StringBuilder("DeltaCounter(count="), this.f14919a, ')');
    }
}
