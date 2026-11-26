package g1;

import android.content.Context;
import android.view.Window;

public final class d4 extends c3.a implements c4.w {
    public final Window J;
    public final l1.i1 K;
    public boolean L;

    public d4(Context context, Window window) {
        super(context, null);
        this.J = window;
        this.K = l1.q.z(u0.f5998a);
    }

    @Override
    public final void a(l1.j jVar, int i10) {
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(576708319);
        int i11 = (g0Var.i(this) ? 4 : 2) | i10;
        if (g0Var.S(i11 & 1, (i11 & 3) != 2)) {
            ((u00.n) this.K.getValue()).invoke(g0Var, 0);
        } else {
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new a1.y1(this, i10, 16);
        }
    }

    @Override
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.L;
    }

    @Override
    public final Window getWindow() {
        return this.J;
    }
}
