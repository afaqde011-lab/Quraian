package b4;

import b3.k0;
import b3.v1;
import g2.a0;
import l0.r0;

public final class w extends b3.l implements v1, b3.j {
    public final a0 Q;
    public r0 R;

    public w() {
        a0 a0Var = new a0(0, new av.b(2, this, w.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0, 1), 9);
        B1(a0Var);
        this.Q = a0Var;
    }

    @Override
    public final void J0() {
        kotlin.jvm.internal.z zVar = new kotlin.jvm.internal.z();
        b3.m.t(this, new k0(zVar, (b2.q) this, 2));
        r0 r0Var = (r0) zVar.A;
        if (this.Q.G1().a()) {
            r0 r0Var2 = this.R;
            if (r0Var2 != null) {
                r0Var2.b();
            }
            if (r0Var != null) {
                r0Var.a();
            } else {
                r0Var = null;
            }
            this.R = r0Var;
        }
    }
}
