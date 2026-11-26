package nf;

import java.io.Serializable;
import java.util.Comparator;

public final class i extends y implements Serializable {
    public final Comparator A;

    public i(Comparator comparator) {
        comparator.getClass();
        this.A = comparator;
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
        if (obj instanceof i) {
            return this.A.equals(((i) obj).A);
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
