package eh;

import java.io.Serializable;
import java.util.Arrays;

public final class b0 implements x, Serializable {
    public final Object A;

    public b0(Object obj) {
        this.A = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b0) {
            return w50.c.A(this.A, ((b0) obj).A);
        }
        return false;
    }

    @Override
    public final Object get() {
        return this.A;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A});
    }

    public final String toString() {
        return "Suppliers.ofInstance(" + this.A + ")";
    }
}
