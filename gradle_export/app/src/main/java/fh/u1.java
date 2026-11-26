package fh;

import java.io.Serializable;
import java.util.ArrayList;

public final class u1 implements eh.x, Serializable {
    public final int A;

    public u1() {
        w.g(2, "expectedValuesPerKey");
        this.A = 2;
    }

    @Override
    public final Object get() {
        return new ArrayList(this.A);
    }
}
