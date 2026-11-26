package k9;

import com.google.android.gms.internal.measurement.b5;

public final class v1 implements s, androidx.media3.common.d1 {
    public final h1 A;
    public final g1 B;
    public final w1 C;

    public v1(w1 w1Var, h1 h1Var, g1 g1Var) {
        this.C = w1Var;
        this.A = h1Var;
        this.B = g1Var;
    }

    @Override
    public final kh.t d(z3 z3Var) {
        int i10;
        if (z3Var.f9579b.equals("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY")) {
            u1 u1Var = (u1) this.C.G.get(this.B);
            if (u1Var != null) {
                u1Var.f9528b = true;
            }
            i10 = 0;
        } else {
            i10 = -6;
        }
        return b5.x(new d4(i10));
    }

    @Override
    public final void i() {
        this.A.g(this.B);
    }

    @Override
    public final void l(androidx.media3.common.f1 f1Var, androidx.media3.common.c1 c1Var) {
        if (c1Var.f1141a.a(4, 5, 14, 0)) {
            this.A.g(this.B);
        }
    }

    @Override
    public final void o() {
        this.A.g(this.B);
    }

    @Override
    public final void y(u uVar) {
        h1 h1Var = this.A;
        g1 g1Var = this.B;
        if (h1Var.d(g1Var)) {
            h1Var.h(g1Var);
        }
        h1Var.g(g1Var);
    }
}
