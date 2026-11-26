package fh;

import java.util.Map;
import java.util.Objects;

public final class x0 extends s2 {
    public final s2 A;
    public Object B;
    public s2 C;

    public x0(u0 u0Var) {
        i2 i2Var = u0Var.E;
        e1 e1VarC = i2Var.A;
        if (e1VarC == null) {
            e1VarC = i2Var.c();
            i2Var.A = e1VarC;
        }
        this.A = e1VarC.iterator();
        this.B = null;
        this.C = i1.D;
    }

    @Override
    public final boolean hasNext() {
        return this.C.hasNext() || this.A.hasNext();
    }

    @Override
    public final Object next() {
        if (!this.C.hasNext()) {
            Map.Entry entry = (Map.Entry) this.A.next();
            this.B = entry.getKey();
            this.C = ((o0) entry.getValue()).iterator();
        }
        Object obj = this.B;
        Objects.requireNonNull(obj);
        return new p0(obj, this.C.next());
    }
}
