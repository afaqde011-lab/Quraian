package w0;

import kotlin.KotlinNothingValueException;
import z2.a0;

public final class f implements x0.e {
    public final long A;
    public final g B;

    public f(g gVar, long j9) {
        this.B = gVar;
        this.A = j9;
    }

    @Override
    public final long O0(a0 a0Var) throws KotlinNothingValueException {
        a0 a0Var2 = (a0) this.B.R.getValue();
        if (a0Var2 != null) {
            return a0Var.V(a0Var2, this.A);
        }
        g0.a.d("Tried to open context menu before the anchor was placed.");
        throw new KotlinNothingValueException();
    }

    @Override
    public final h2.c W0(a0 a0Var) {
        return bi.b.g(O0(a0Var), 0L);
    }

    @Override
    public final t0.c i0() {
        return h.b(this.B);
    }
}
