package androidx.fragment.app;

import android.view.View;

public final class w extends r0 {
    public final r0 A;
    public final x B;

    public w(x xVar, r0 r0Var) {
        this.B = xVar;
        this.A = r0Var;
    }

    @Override
    public final View b(int i10) {
        r0 r0Var = this.A;
        return r0Var.c() ? r0Var.b(i10) : this.B.onFindViewById(i10);
    }

    @Override
    public final boolean c() {
        return this.A.c() || this.B.onHasView();
    }
}
