package l60;

import java.io.IOException;

public final class w extends x40.d0 {
    public final x40.d0 B;
    public final k50.c0 C;
    public IOException D;

    public w(x40.d0 d0Var) {
        this.B = d0Var;
        this.C = bi.b.r(new v(this, d0Var.v()));
    }

    @Override
    public final void close() {
        this.B.close();
    }

    @Override
    public final long l() {
        return this.B.l();
    }

    @Override
    public final x40.s r() {
        return this.B.r();
    }

    @Override
    public final k50.k v() {
        return this.C;
    }
}
