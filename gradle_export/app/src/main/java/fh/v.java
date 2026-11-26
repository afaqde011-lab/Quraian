package fh;

import java.io.Serializable;
import java.util.Arrays;

public final class v extends b2 implements Serializable {
    public final eh.k A;
    public final b2 B;

    public v(eh.k kVar, b2 b2Var) {
        this.A = kVar;
        this.B = b2Var;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        eh.k kVar = this.A;
        return this.B.compare(kVar.apply(obj), kVar.apply(obj2));
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            if (this.A.equals(vVar.A) && this.B.equals(vVar.B)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A, this.B});
    }

    public final String toString() {
        return this.B + ".onResultOf(" + this.A + ")";
    }
}
