package db;

import oi.k;

public final class b extends c {

    public final int f4845a;

    public b(int i10) {
        this.f4845a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.f4845a == ((b) obj).f4845a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4845a);
    }

    public final String toString() {
        return k.l(new StringBuilder("ConstraintsNotMet(reason="), this.f4845a, ')');
    }
}
