package androidx.fragment.app;

import android.view.View;

public final class d0 implements androidx.lifecycle.u {
    public final j0 A;

    public d0(j0 j0Var) {
        this.A = j0Var;
    }

    @Override
    public final void a(androidx.lifecycle.w wVar, androidx.lifecycle.o oVar) {
        View view;
        if (oVar != androidx.lifecycle.o.ON_STOP || (view = this.A.mView) == null) {
            return;
        }
        view.cancelPendingInputEvents();
    }
}
