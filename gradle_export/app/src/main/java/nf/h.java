package nf;

import java.io.Serializable;
import java.util.Arrays;

public final class h implements Serializable {
    public final Object A;

    public h(Object obj) {
        this.A = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return b.h(this.A, ((h) obj).A);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A});
    }

    public final String toString() {
        return a1.b.p("Suppliers.ofInstance(", this.A.toString(), ")");
    }
}
