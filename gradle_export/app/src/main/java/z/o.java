package z;

import b3.j2;
import b3.v1;
import kotlin.NoWhenBranchMatchedException;

public final class o extends b2.q implements b3.o, v1, j2 {
    public long O;
    public i2.q P;
    public float Q;
    public i2.t0 R;
    public long S;
    public y3.m T;
    public i2.l0 U;
    public i2.t0 V;
    public i2.l0 W;

    @Override
    public final void J0() {
        this.S = 9205357640488583168L;
        this.T = null;
        this.U = null;
        this.V = null;
        b3.m.m(this);
    }

    @Override
    public final void i(b3.o0 o0Var) throws NoWhenBranchMatchedException {
        i2.l0 l0Var;
        if (this.R == i2.b0.f7111b) {
            if (!i2.t.c(this.O, i2.t.f7167g)) {
                k2.d.R(o0Var, this.O, 0L, 0L, 0.0f, null, 0, 126);
            }
            i2.q qVar = this.P;
            if (qVar != null) {
                k2.d.m0(o0Var, qVar, 0L, 0L, this.Q, null, 0, 118);
            }
        } else {
            k2.b bVar = o0Var.A;
            if (h2.e.a(bVar.b(), this.S) && o0Var.getLayoutDirection() == this.T && kotlin.jvm.internal.m.a(this.V, this.R)) {
                l0Var = this.U;
                kotlin.jvm.internal.m.b(l0Var);
            } else {
                b3.m.t(this, new l6.c(this, o0Var, 29));
                l0Var = this.W;
                this.W = null;
            }
            this.U = l0Var;
            this.S = bVar.b();
            this.T = o0Var.getLayoutDirection();
            this.V = this.R;
            kotlin.jvm.internal.m.b(l0Var);
            if (!i2.t.c(this.O, i2.t.f7167g)) {
                i2.b0.n(o0Var, l0Var, this.O);
            }
            i2.q qVar2 = this.P;
            if (qVar2 != null) {
                i2.b0.m(o0Var, l0Var, qVar2, this.Q);
            }
        }
        o0Var.a();
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final void m1(j3.a0 a0Var) {
        j3.y.m(a0Var, this.R);
    }
}
