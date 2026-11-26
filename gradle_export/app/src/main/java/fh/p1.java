package fh;

import java.util.Map;

public final class p1 extends q {
    public final Map.Entry A;
    public final r1 B;

    public p1(Map.Entry entry, r1 r1Var) {
        this.A = entry;
        this.B = r1Var;
    }

    @Override
    public final Object getKey() {
        return this.A.getKey();
    }

    @Override
    public final Object getValue() {
        Map.Entry entry = this.A;
        return this.B.c(entry.getKey(), entry.getValue());
    }
}
