package fh;

import java.io.Serializable;

public final class d0 extends b2 implements Serializable {
    public final b3.c0 A;

    public d0(b3.c0 c0Var) {
        this.A = c0Var;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        return this.A.compare(obj, obj2);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d0) {
            return this.A.equals(((d0) obj).A);
        }
        return false;
    }

    public final int hashCode() {
        return this.A.hashCode();
    }

    public final String toString() {
        return this.A.toString();
    }
}
