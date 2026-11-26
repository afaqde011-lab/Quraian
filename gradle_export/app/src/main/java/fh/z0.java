package fh;

import java.util.Iterator;
import java.util.Objects;

public final class z0 extends s2 {
    public int A;
    public Object B;
    public final Iterator C;

    public z0(s2 s2Var) {
        this.C = s2Var;
    }

    @Override
    public final boolean hasNext() {
        return this.A > 0 || this.C.hasNext();
    }

    @Override
    public final Object next() {
        if (this.A <= 0) {
            z1 z1Var = (z1) this.C.next();
            this.B = z1Var.f5681a;
            this.A = z1Var.a();
        }
        this.A--;
        Object obj = this.B;
        Objects.requireNonNull(obj);
        return obj;
    }
}
