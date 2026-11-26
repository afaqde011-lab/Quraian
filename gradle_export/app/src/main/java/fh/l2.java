package fh;

import java.io.Serializable;

public final class l2 extends b2 implements Serializable {
    public final b2 A;

    public l2(b2 b2Var) {
        this.A = b2Var;
    }

    @Override
    public final b2 a() {
        return this.A;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        return this.A.compare(obj2, obj);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l2) {
            return this.A.equals(((l2) obj).A);
        }
        return false;
    }

    public final int hashCode() {
        return -this.A.hashCode();
    }

    public final String toString() {
        return this.A + ".reverse()";
    }
}
