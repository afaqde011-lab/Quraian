package f20;

import e30.a0;
import e30.h0;
import e30.w;
import e30.x0;
import e30.z0;
import kotlin.NoWhenBranchMatchedException;

public final class g extends e30.m implements e30.j {
    public final a0 B;

    public g(a0 delegate) {
        kotlin.jvm.internal.m.e(delegate, "delegate");
        this.B = delegate;
    }

    @Override
    public final z0 B0(h0 newAttributes) {
        kotlin.jvm.internal.m.e(newAttributes, "newAttributes");
        return new g(this.B.B0(newAttributes));
    }

    @Override
    public final z0 C(w replacement) {
        kotlin.jvm.internal.m.e(replacement, "replacement");
        z0 z0VarY0 = replacement.y0();
        if (!x0.f(z0VarY0) && !x0.e(z0VarY0)) {
            return z0VarY0;
        }
        if (z0VarY0 instanceof a0) {
            a0 a0Var = (a0) z0VarY0;
            a0 a0VarZ0 = a0Var.z0(false);
            return !x0.f(a0Var) ? a0VarZ0 : new g(a0VarZ0);
        }
        if (!(z0VarY0 instanceof e30.q)) {
            throw new NoWhenBranchMatchedException();
        }
        e30.q qVar = (e30.q) z0VarY0;
        a0 a0Var2 = qVar.B;
        a0 a0VarZ1 = a0Var2.z0(false);
        if (x0.f(a0Var2)) {
            a0VarZ1 = new g(a0VarZ1);
        }
        a0 a0Var3 = qVar.C;
        a0 a0VarZ2 = a0Var3.z0(false);
        if (x0.f(a0Var3)) {
            a0VarZ2 = new g(a0VarZ2);
        }
        return e30.c.I(e30.c.f(a0VarZ1, a0VarZ2), e30.c.g(z0VarY0));
    }

    @Override
    public final a0 z0(boolean z) {
        return z ? this.B.z0(true) : this;
    }

    @Override
    public final a0 B0(h0 newAttributes) {
        kotlin.jvm.internal.m.e(newAttributes, "newAttributes");
        return new g(this.B.B0(newAttributes));
    }

    @Override
    public final a0 E0() {
        return this.B;
    }

    @Override
    public final e30.m G0(a0 a0Var) {
        return new g(a0Var);
    }

    @Override
    public final boolean P() {
        return true;
    }

    @Override
    public final boolean t0() {
        return false;
    }
}
