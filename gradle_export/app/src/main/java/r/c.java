package r;

import java.util.Map;

public final class c implements Map.Entry {
    public final Object A;
    public final Object B;
    public c C;
    public c D;

    public c(Object obj, Object obj2) {
        this.A = obj;
        this.B = obj2;
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.A.equals(cVar.A) && this.B.equals(cVar.B);
    }

    @Override
    public final Object getKey() {
        return this.A;
    }

    @Override
    public final Object getValue() {
        return this.B;
    }

    @Override
    public final int hashCode() {
        return this.B.hashCode() ^ this.A.hashCode();
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.A + "=" + this.B;
    }
}
