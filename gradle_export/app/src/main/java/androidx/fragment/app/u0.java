package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;

public final class u0 implements View.OnAttachStateChangeListener {
    public final q1 A;
    public final v0 B;

    public u0(v0 v0Var, q1 q1Var) {
        this.B = v0Var;
        this.A = q1Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        q1 q1Var = this.A;
        j0 j0Var = q1Var.f809c;
        q1Var.k();
        s.j((ViewGroup) j0Var.mView.getParent(), this.B.A).i();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
    }
}
