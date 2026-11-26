package nf;

import java.io.Serializable;

public final class c0 extends y implements Serializable {
    public final y A;

    public c0(y yVar) {
        this.A = yVar;
    }

    @Override
    public final y a() {
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
        if (obj instanceof c0) {
            return this.A.equals(((c0) obj).A);
        }
        return false;
    }

    public final int hashCode() {
        return -this.A.hashCode();
    }

    public final String toString() {
        return this.A.toString().concat(".reverse()");
    }
}
