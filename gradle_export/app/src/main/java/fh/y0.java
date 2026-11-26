package fh;

import java.util.Map;

public final class y0 extends o0 {
    public final u0 B;

    public y0(u0 u0Var) {
        this.B = u0Var;
    }

    @Override
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return this.B.c(entry.getKey(), entry.getValue());
    }

    @Override
    public final s2 iterator() {
        u0 u0Var = this.B;
        u0Var.getClass();
        return new x0(u0Var);
    }

    @Override
    public final int size() {
        return this.B.F;
    }
}
